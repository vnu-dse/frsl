/*******************************************************************************
 * Copyright (c) 2014, 2019 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.sme.frsl.utilities;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.ocl.pivot.Element;
import org.eclipse.ocl.pivot.Model;
import org.eclipse.ocl.pivot.PivotPackage;
import org.eclipse.ocl.pivot.internal.resource.ASResourceFactory;
import org.eclipse.ocl.pivot.internal.resource.AbstractASResourceFactory;
import org.eclipse.ocl.pivot.resource.ASResource;
import org.eclipse.ocl.pivot.resource.NotXMLContentHandlerImpl;
import org.eclipse.ocl.xtext.basecs.PackageCS;
import org.eclipse.ocl.xtext.basecs.RootPackageCS;

public final class FRSLASResourceFactory extends AbstractASResourceFactory
{
	private static @Nullable FRSLASResourceFactory INSTANCE = null;
	static final @NonNull String FRSL_FILE_EXTENSION = "frsl";
	static final @NonNull String FRSL_CONTENT_TYPE = PivotPackage.eCONTENT_TYPE + "." + FRSL_FILE_EXTENSION;

	public static synchronized @NonNull FRSLASResourceFactory getInstance() {
		if (INSTANCE == null) {
			//			ASResourceFactoryContribution asResourceRegistry = ASResourceFactoryRegistry.INSTANCE.get(ASResource.OCLINECORE_CONTENT_TYPE);
			//			if (asResourceRegistry != null) {
			//				INSTANCE = (FRSLASResourceFactory) asResourceRegistry.getASResourceFactory();		// Create the registered singleton
			//			}
			//			else {
			INSTANCE = new FRSLASResourceFactory();											// Create our own singleton
			//			}
			assert INSTANCE != null;
			INSTANCE.install(FRSL_FILE_EXTENSION, null);
		}
		assert INSTANCE != null;
		return INSTANCE;
	}

	static {
		if (!EMFPlugin.IS_ECLIPSE_RUNNING) {
			installContentHandler(ContentHandler.Registry.NORMAL_PRIORITY,
				new NotXMLContentHandlerImpl(new @NonNull String[]{FRSL_FILE_EXTENSION}));
		}
	}

	public FRSLASResourceFactory() {
		super(FRSL_CONTENT_TYPE, null);
	}

	@Override
	public @NonNull Resource createResource(URI uri) {
		assert uri != null;
		
//		IStatus logMsg;
//		ILog log = Platform.getLog(FRSLASResourceFactory.class);
//		logMsg = new Status(IStatus.INFO, "org.eclipse.sme.frsl", "hanhdd: FRSLASResourceFactory$createResource() " 
//				+ "\n**** uri = " + uri							
//				);
//		log.log(logMsg);
		
		ASResource asResource = new FRSLASResourceImpl(uri, this);
		configureResource(asResource);
		return asResource;
	}

	@Override
	public @NonNull ASResourceFactory getASResourceFactory() {
		return getInstance();
	}

	@Override
	public URI getPackageURI(@NonNull EObject eObject) {
		if (eObject instanceof RootPackageCS) {
			Element pivot = ((RootPackageCS)eObject).getPivot();
			if (pivot instanceof Model) {
				String uri = ((Model)pivot).getExternalURI();
				if (uri != null) {
					if (uri.endsWith("frsl")) {
						uri = uri.substring(0, uri.length()-4) + "ecore";
					}
					return URI.createURI(uri);
				}
			}
		}
		else if (eObject instanceof PackageCS) {
			Element pivot = ((PackageCS)eObject).getPivot();
			if (pivot instanceof org.eclipse.ocl.pivot.Package) {
				String uri = ((org.eclipse.ocl.pivot.Package)pivot).getURI();
				if (uri != null) {
					return URI.createURI(uri);
				}
			}
		}
		return null;
	}

	@Override
	public boolean isCompatibleResource(@NonNull Resource newResource, @NonNull Resource oldResource) {
		URI newURI = newResource.getURI();
		URI oldURI = oldResource.getURI();
		if ((newURI == null) || (oldURI == null)) {
			return false;
		}
		URI newStem = newURI.trimFileExtension();
		URI oldStem = oldURI.trimFileExtension();
		return newStem.equals(oldStem);
	}
}

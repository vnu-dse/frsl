/*******************************************************************************
 * Copyright (c) 2010, 2018 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.sme.frsl.ui;

import org.eclipse.core.resources.IStorage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJarEntryResource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.ui.editor.model.JavaClassPathResourceForIEditorInputFactory;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class FRSLResourceForEditorInputFactory extends JavaClassPathResourceForIEditorInputFactory {

	@Inject
	private IStorage2UriMapper storageToUriMapper;

	@Inject
	private Provider<XtextResource> provider;

	@Override
	protected Resource createResourceFor(IStorage storage) {
		ResourceSet resourceSet = getResourceSet(storage);
		URI uri = URI.createPlatformResourceURI(storage.getFullPath().toString(), true);
		configureResourceSet(resourceSet, uri);
		XtextResource resource = (XtextResource) resourceSet.getResource(uri, false);
		// Modified to interpret a null resource and
		//  so create an XtextResource for an ecore file
		if (resource == null) {
			resource = (XtextResource) new XtextResourceFactory(provider).createResource(uri);
			assert resource != null;
			resourceSet.getResources().add(resource);
		}
		resource.setValidationDisabled(false);
		return resource;
	}

	@Override
	protected Resource createResourceFor(IJarEntryResource storage) {
		ResourceSet resourceSet = getResourceSet(storage);
		URI uri = storageToUriMapper.getUri(storage);
		configureResourceSet(resourceSet, uri);
		XtextResource resource = (XtextResource) resourceSet.getResource(uri, false);
		// Modified to interpret a null resource and
		//  so create an XtextResource for an ecore file
		if (resource == null) {
			resource = (XtextResource) new XtextResourceFactory(provider).createResource(uri);
			assert resource != null;
			resourceSet.getResources().add(resource);
		}
		resource.setValidationDisabled(true);
		return resource;
	}
}

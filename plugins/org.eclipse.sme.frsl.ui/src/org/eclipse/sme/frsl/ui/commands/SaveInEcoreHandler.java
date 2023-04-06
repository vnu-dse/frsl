/*******************************************************************************
 * Copyright (c) 2011, 2018 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *     E.D.Willink - initial API and implementation
 *******************************************************************************/
package org.eclipse.sme.frsl.ui.commands;

import org.eclipse.ocl.xtext.oclinecore.ui.commands.AbstractSaveAsHandler;
import org.eclipse.sme.frsl.ui.model.FRSLDocumentProvider;

public class SaveInEcoreHandler extends AbstractSaveAsHandler
{
	public SaveInEcoreHandler() {
		super(FRSLDocumentProvider.PERSIST_IN_ECORE);
	}
}

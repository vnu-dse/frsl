package org.eclipse.acceleo.frsl.as2cs.ui.common;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
//import org.eclipse.m2m.atl.frsl2uml.files.Frsl2Sm;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

public class GenerateUml implements IViewActionDelegate {

	public void run(IAction action) {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

		IEditorPart editor = page.getActiveEditor();

		IEditorInput input = editor.getEditorInput();

		IFile file = (IFile)Platform.getAdapterManager().getAdapter(input, IFile.class);
		
//		String modelURI = file.getFullPath().toString();
		//String modelURI = file.getProject().getFullPath().toString();
		
		
//		URI modelURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
		
		//IContainer target = file.getProject().getFolder("smc-gen");
		
		//modelURI = target.getFullPath().toString();
		
		//System.out.println("=====" + modelURI);
		
		String[] inputAtl = new String[4];
		inputAtl[0] = file.getLocationURI().toString();
		inputAtl[1] = "http://www.eclipse.org/ocl/2015/Library.oclas";
		inputAtl[2] = "pathmap://UML_LIBRARIES/UMLPrimitiveTypes.library.uml";
//		inputAtl[3] = "platform:/resource/model-gen/smc.uml";
		//inputAtl[3] = modelURI + "/smc.uml";
		inputAtl[3] = "platform:/resource/" + file.getProject().getName() + "/uml-gen/" + file.getName() + ".uml";
		
		//Frsl2Sm.main(inputAtl);
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void dispose() {
	}

	public void init(IViewPart view) {
		// Used for viewerContributions, not for objectContributions
	}
}


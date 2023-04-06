package org.eclipse.atl.frsl2uisl.files;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;


public class Main implements IViewActionDelegate {

	public void run(IAction action) {
//		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
//		IEditorPart editor = page.getActiveEditor();
//		IEditorInput input = editor.getEditorInput();
//		IFile file = (IFile)Platform.getAdapterManager().getAdapter(input, IFile.class);
		
		//TODO: Display a message to require the textual frsl file opened before performing the transformation. 
				
		ISelectionService service = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		IStructuredSelection structured = (IStructuredSelection) service.getSelection();
		IFile file = (IFile) structured.getFirstElement();
		
		
		String[] inputAtl = new String[3];
		inputAtl[0] = (file.getLocationURI().toString());
		inputAtl[1] = "http://www.eclipse.org/ocl/2015/Library.oclas";
		String outUislFile = file.getName().substring(0, file.getName().length() - file.getFileExtension().length()) + ".uisl";
		inputAtl[2] = "platform:/resource/" + file.getProject().getName() + "/uisl-gen/" + outUislFile;
		
		Frsl2uisl.main(inputAtl);
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void dispose() {
	}

	public void init(IViewPart view) {
		// Used for viewerContributions, not for objectContributions
	}
}

/**
 */
package UISL.util;

import UISL.ActionBlock;
import UISL.ActionEvent;
import UISL.CatchingEvent;
import UISL.Column;
import UISL.DSLGUI;
import UISL.DataFlow;
import UISL.DetailsComponent;
import UISL.ErrorFlow;
import UISL.Event;
import UISL.FormComponent;
import UISL.InteractionFlowBlock;
import UISL.InteractionFlowElement;
import UISL.InteractionFlowModelElement;
import UISL.ListComponent;
import UISL.MessageComponent;
import UISL.ModuleDefinition;
import UISL.NavigationFlow;
import UISL.OKFlow;
import UISL.ParameterBinding;
import UISL.ParameterBindingGroup;
import UISL.ParameterBlock;
import UISL.Port;
import UISL.PortDefinition;
import UISL.ThrowingEvent;
import UISL.UISLPackage;
import UISL.ViewComponent;
import UISL.ViewComponentPart;
import UISL.ViewContainer;
import UISL.ViewElement;
import UISL.ViewElementEvent;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see UISL.UISLPackage
 * @generated
 */
public class UISLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UISLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISLSwitch() {
		if (modelPackage == null) {
			modelPackage = UISLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case UISLPackage.INTERACTION_FLOW_MODEL_ELEMENT: {
			InteractionFlowModelElement interactionFlowModelElement = (InteractionFlowModelElement) theEObject;
			T result = caseInteractionFlowModelElement(interactionFlowModelElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.INTERACTION_FLOW_ELEMENT: {
			InteractionFlowElement interactionFlowElement = (InteractionFlowElement) theEObject;
			T result = caseInteractionFlowElement(interactionFlowElement);
			if (result == null)
				result = caseInteractionFlowModelElement(interactionFlowElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.INTERACTION_FLOW_BLOCK: {
			InteractionFlowBlock interactionFlowBlock = (InteractionFlowBlock) theEObject;
			T result = caseInteractionFlowBlock(interactionFlowBlock);
			if (result == null)
				result = caseInteractionFlowModelElement(interactionFlowBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.PARAMETER_BINDING_GROUP: {
			ParameterBindingGroup parameterBindingGroup = (ParameterBindingGroup) theEObject;
			T result = caseParameterBindingGroup(parameterBindingGroup);
			if (result == null)
				result = caseInteractionFlowModelElement(parameterBindingGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.PARAMETER_BINDING: {
			ParameterBinding parameterBinding = (ParameterBinding) theEObject;
			T result = caseParameterBinding(parameterBinding);
			if (result == null)
				result = caseInteractionFlowModelElement(parameterBinding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.NAVIGATION_FLOW: {
			NavigationFlow navigationFlow = (NavigationFlow) theEObject;
			T result = caseNavigationFlow(navigationFlow);
			if (result == null)
				result = caseInteractionFlowBlock(navigationFlow);
			if (result == null)
				result = caseInteractionFlowModelElement(navigationFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.DATA_FLOW: {
			DataFlow dataFlow = (DataFlow) theEObject;
			T result = caseDataFlow(dataFlow);
			if (result == null)
				result = caseInteractionFlowBlock(dataFlow);
			if (result == null)
				result = caseInteractionFlowModelElement(dataFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.OK_FLOW: {
			OKFlow okFlow = (OKFlow) theEObject;
			T result = caseOKFlow(okFlow);
			if (result == null)
				result = caseInteractionFlowBlock(okFlow);
			if (result == null)
				result = caseInteractionFlowModelElement(okFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.ERROR_FLOW: {
			ErrorFlow errorFlow = (ErrorFlow) theEObject;
			T result = caseErrorFlow(errorFlow);
			if (result == null)
				result = caseInteractionFlowBlock(errorFlow);
			if (result == null)
				result = caseInteractionFlowModelElement(errorFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.VIEW_COMPONENT_PART: {
			ViewComponentPart viewComponentPart = (ViewComponentPart) theEObject;
			T result = caseViewComponentPart(viewComponentPart);
			if (result == null)
				result = caseInteractionFlowElement(viewComponentPart);
			if (result == null)
				result = caseInteractionFlowModelElement(viewComponentPart);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.VIEW_ELEMENT: {
			ViewElement viewElement = (ViewElement) theEObject;
			T result = caseViewElement(viewElement);
			if (result == null)
				result = caseInteractionFlowElement(viewElement);
			if (result == null)
				result = caseInteractionFlowModelElement(viewElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.VIEW_COMPONENT: {
			ViewComponent viewComponent = (ViewComponent) theEObject;
			T result = caseViewComponent(viewComponent);
			if (result == null)
				result = caseViewElement(viewComponent);
			if (result == null)
				result = caseInteractionFlowElement(viewComponent);
			if (result == null)
				result = caseInteractionFlowModelElement(viewComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.VIEW_CONTAINER: {
			ViewContainer viewContainer = (ViewContainer) theEObject;
			T result = caseViewContainer(viewContainer);
			if (result == null)
				result = caseViewElement(viewContainer);
			if (result == null)
				result = caseInteractionFlowElement(viewContainer);
			if (result == null)
				result = caseInteractionFlowModelElement(viewContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.PARAMETER_BLOCK: {
			ParameterBlock parameterBlock = (ParameterBlock) theEObject;
			T result = caseParameterBlock(parameterBlock);
			if (result == null)
				result = caseInteractionFlowModelElement(parameterBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = caseInteractionFlowElement(event);
			if (result == null)
				result = caseInteractionFlowModelElement(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.CATCHING_EVENT: {
			CatchingEvent catchingEvent = (CatchingEvent) theEObject;
			T result = caseCatchingEvent(catchingEvent);
			if (result == null)
				result = caseEvent(catchingEvent);
			if (result == null)
				result = caseInteractionFlowElement(catchingEvent);
			if (result == null)
				result = caseInteractionFlowModelElement(catchingEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.THROWING_EVENT: {
			ThrowingEvent throwingEvent = (ThrowingEvent) theEObject;
			T result = caseThrowingEvent(throwingEvent);
			if (result == null)
				result = caseEvent(throwingEvent);
			if (result == null)
				result = caseInteractionFlowElement(throwingEvent);
			if (result == null)
				result = caseInteractionFlowModelElement(throwingEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.ACTION_EVENT: {
			ActionEvent actionEvent = (ActionEvent) theEObject;
			T result = caseActionEvent(actionEvent);
			if (result == null)
				result = caseCatchingEvent(actionEvent);
			if (result == null)
				result = caseEvent(actionEvent);
			if (result == null)
				result = caseInteractionFlowElement(actionEvent);
			if (result == null)
				result = caseInteractionFlowModelElement(actionEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.DSLGUI: {
			DSLGUI dslgui = (DSLGUI) theEObject;
			T result = caseDSLGUI(dslgui);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.FORM_COMPONENT: {
			FormComponent formComponent = (FormComponent) theEObject;
			T result = caseFormComponent(formComponent);
			if (result == null)
				result = caseViewComponent(formComponent);
			if (result == null)
				result = caseViewElement(formComponent);
			if (result == null)
				result = caseInteractionFlowElement(formComponent);
			if (result == null)
				result = caseInteractionFlowModelElement(formComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.LIST_COMPONENT: {
			ListComponent listComponent = (ListComponent) theEObject;
			T result = caseListComponent(listComponent);
			if (result == null)
				result = caseViewComponent(listComponent);
			if (result == null)
				result = caseViewElement(listComponent);
			if (result == null)
				result = caseInteractionFlowElement(listComponent);
			if (result == null)
				result = caseInteractionFlowModelElement(listComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.MESSAGE_COMPONENT: {
			MessageComponent messageComponent = (MessageComponent) theEObject;
			T result = caseMessageComponent(messageComponent);
			if (result == null)
				result = caseViewComponent(messageComponent);
			if (result == null)
				result = caseViewElement(messageComponent);
			if (result == null)
				result = caseInteractionFlowElement(messageComponent);
			if (result == null)
				result = caseInteractionFlowModelElement(messageComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.DETAILS_COMPONENT: {
			DetailsComponent detailsComponent = (DetailsComponent) theEObject;
			T result = caseDetailsComponent(detailsComponent);
			if (result == null)
				result = caseViewComponent(detailsComponent);
			if (result == null)
				result = caseViewElement(detailsComponent);
			if (result == null)
				result = caseInteractionFlowElement(detailsComponent);
			if (result == null)
				result = caseInteractionFlowModelElement(detailsComponent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.VIEW_ELEMENT_EVENT: {
			ViewElementEvent viewElementEvent = (ViewElementEvent) theEObject;
			T result = caseViewElementEvent(viewElementEvent);
			if (result == null)
				result = caseCatchingEvent(viewElementEvent);
			if (result == null)
				result = caseEvent(viewElementEvent);
			if (result == null)
				result = caseInteractionFlowElement(viewElementEvent);
			if (result == null)
				result = caseInteractionFlowModelElement(viewElementEvent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.ACTION_BLOCK: {
			ActionBlock actionBlock = (ActionBlock) theEObject;
			T result = caseActionBlock(actionBlock);
			if (result == null)
				result = caseInteractionFlowElement(actionBlock);
			if (result == null)
				result = caseInteractionFlowModelElement(actionBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.MODULE_DEFINITION: {
			ModuleDefinition moduleDefinition = (ModuleDefinition) theEObject;
			T result = caseModuleDefinition(moduleDefinition);
			if (result == null)
				result = caseInteractionFlowModelElement(moduleDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.PORT_DEFINITION: {
			PortDefinition portDefinition = (PortDefinition) theEObject;
			T result = casePortDefinition(portDefinition);
			if (result == null)
				result = caseInteractionFlowElement(portDefinition);
			if (result == null)
				result = caseInteractionFlowModelElement(portDefinition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.MODULE: {
			UISL.Module module = (UISL.Module) theEObject;
			T result = caseModule(module);
			if (result == null)
				result = caseInteractionFlowElement(module);
			if (result == null)
				result = caseInteractionFlowModelElement(module);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.PORT: {
			Port port = (Port) theEObject;
			T result = casePort(port);
			if (result == null)
				result = caseInteractionFlowElement(port);
			if (result == null)
				result = caseInteractionFlowModelElement(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UISLPackage.COLUMN: {
			Column column = (Column) theEObject;
			T result = caseColumn(column);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFlowModelElement(InteractionFlowModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFlowElement(InteractionFlowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Flow Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Flow Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionFlowBlock(InteractionFlowBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Binding Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Binding Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterBindingGroup(ParameterBindingGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterBinding(ParameterBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationFlow(NavigationFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OK Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OK Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOKFlow(OKFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorFlow(ErrorFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Component Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Component Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewComponentPart(ViewComponentPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewElement(ViewElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewComponent(ViewComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewContainer(ViewContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterBlock(ParameterBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Catching Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Catching Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCatchingEvent(CatchingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throwing Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throwing Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowingEvent(ThrowingEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionEvent(ActionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DSLGUI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DSLGUI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDSLGUI(DSLGUI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormComponent(FormComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListComponent(ListComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageComponent(MessageComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Details Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Details Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailsComponent(DetailsComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Element Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Element Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewElementEvent(ViewElementEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionBlock(ActionBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleDefinition(ModuleDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortDefinition(PortDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(UISL.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UISLSwitch

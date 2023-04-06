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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see UISL.UISLPackage
 * @generated
 */
public class UISLAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UISLPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISLAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UISLPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UISLSwitch<Adapter> modelSwitch = new UISLSwitch<Adapter>() {
		@Override
		public Adapter caseInteractionFlowModelElement(InteractionFlowModelElement object) {
			return createInteractionFlowModelElementAdapter();
		}

		@Override
		public Adapter caseInteractionFlowElement(InteractionFlowElement object) {
			return createInteractionFlowElementAdapter();
		}

		@Override
		public Adapter caseInteractionFlowBlock(InteractionFlowBlock object) {
			return createInteractionFlowBlockAdapter();
		}

		@Override
		public Adapter caseParameterBindingGroup(ParameterBindingGroup object) {
			return createParameterBindingGroupAdapter();
		}

		@Override
		public Adapter caseParameterBinding(ParameterBinding object) {
			return createParameterBindingAdapter();
		}

		@Override
		public Adapter caseNavigationFlow(NavigationFlow object) {
			return createNavigationFlowAdapter();
		}

		@Override
		public Adapter caseDataFlow(DataFlow object) {
			return createDataFlowAdapter();
		}

		@Override
		public Adapter caseOKFlow(OKFlow object) {
			return createOKFlowAdapter();
		}

		@Override
		public Adapter caseErrorFlow(ErrorFlow object) {
			return createErrorFlowAdapter();
		}

		@Override
		public Adapter caseViewComponentPart(ViewComponentPart object) {
			return createViewComponentPartAdapter();
		}

		@Override
		public Adapter caseViewElement(ViewElement object) {
			return createViewElementAdapter();
		}

		@Override
		public Adapter caseViewComponent(ViewComponent object) {
			return createViewComponentAdapter();
		}

		@Override
		public Adapter caseViewContainer(ViewContainer object) {
			return createViewContainerAdapter();
		}

		@Override
		public Adapter caseParameterBlock(ParameterBlock object) {
			return createParameterBlockAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseCatchingEvent(CatchingEvent object) {
			return createCatchingEventAdapter();
		}

		@Override
		public Adapter caseThrowingEvent(ThrowingEvent object) {
			return createThrowingEventAdapter();
		}

		@Override
		public Adapter caseActionEvent(ActionEvent object) {
			return createActionEventAdapter();
		}

		@Override
		public Adapter caseDSLGUI(DSLGUI object) {
			return createDSLGUIAdapter();
		}

		@Override
		public Adapter caseFormComponent(FormComponent object) {
			return createFormComponentAdapter();
		}

		@Override
		public Adapter caseListComponent(ListComponent object) {
			return createListComponentAdapter();
		}

		@Override
		public Adapter caseMessageComponent(MessageComponent object) {
			return createMessageComponentAdapter();
		}

		@Override
		public Adapter caseDetailsComponent(DetailsComponent object) {
			return createDetailsComponentAdapter();
		}

		@Override
		public Adapter caseViewElementEvent(ViewElementEvent object) {
			return createViewElementEventAdapter();
		}

		@Override
		public Adapter caseActionBlock(ActionBlock object) {
			return createActionBlockAdapter();
		}

		@Override
		public Adapter caseModuleDefinition(ModuleDefinition object) {
			return createModuleDefinitionAdapter();
		}

		@Override
		public Adapter casePortDefinition(PortDefinition object) {
			return createPortDefinitionAdapter();
		}

		@Override
		public Adapter caseModule(UISL.Module object) {
			return createModuleAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseColumn(Column object) {
			return createColumnAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.InteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.InteractionFlowModelElement
	 * @generated
	 */
	public Adapter createInteractionFlowModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.InteractionFlowElement <em>Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.InteractionFlowElement
	 * @generated
	 */
	public Adapter createInteractionFlowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.InteractionFlowBlock <em>Interaction Flow Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.InteractionFlowBlock
	 * @generated
	 */
	public Adapter createInteractionFlowBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ParameterBindingGroup <em>Parameter Binding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ParameterBindingGroup
	 * @generated
	 */
	public Adapter createParameterBindingGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ParameterBinding
	 * @generated
	 */
	public Adapter createParameterBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.NavigationFlow <em>Navigation Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.NavigationFlow
	 * @generated
	 */
	public Adapter createNavigationFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.DataFlow
	 * @generated
	 */
	public Adapter createDataFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.OKFlow <em>OK Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.OKFlow
	 * @generated
	 */
	public Adapter createOKFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ErrorFlow <em>Error Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ErrorFlow
	 * @generated
	 */
	public Adapter createErrorFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ViewComponentPart <em>View Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ViewComponentPart
	 * @generated
	 */
	public Adapter createViewComponentPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ViewElement
	 * @generated
	 */
	public Adapter createViewElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ViewComponent <em>View Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ViewComponent
	 * @generated
	 */
	public Adapter createViewComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ViewContainer
	 * @generated
	 */
	public Adapter createViewContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ParameterBlock <em>Parameter Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ParameterBlock
	 * @generated
	 */
	public Adapter createParameterBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.CatchingEvent <em>Catching Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.CatchingEvent
	 * @generated
	 */
	public Adapter createCatchingEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ThrowingEvent <em>Throwing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ThrowingEvent
	 * @generated
	 */
	public Adapter createThrowingEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ActionEvent
	 * @generated
	 */
	public Adapter createActionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.DSLGUI <em>DSLGUI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.DSLGUI
	 * @generated
	 */
	public Adapter createDSLGUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.FormComponent <em>Form Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.FormComponent
	 * @generated
	 */
	public Adapter createFormComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ListComponent <em>List Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ListComponent
	 * @generated
	 */
	public Adapter createListComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.MessageComponent <em>Message Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.MessageComponent
	 * @generated
	 */
	public Adapter createMessageComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.DetailsComponent <em>Details Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.DetailsComponent
	 * @generated
	 */
	public Adapter createDetailsComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ViewElementEvent <em>View Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ViewElementEvent
	 * @generated
	 */
	public Adapter createViewElementEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ActionBlock
	 * @generated
	 */
	public Adapter createActionBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.ModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.ModuleDefinition
	 * @generated
	 */
	public Adapter createModuleDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.PortDefinition <em>Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.PortDefinition
	 * @generated
	 */
	public Adapter createPortDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UISL.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UISL.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UISLAdapterFactory

/**
 */
package UISL.impl;

import UISL.ActionBlock;
import UISL.ActionEvent;
import UISL.CatchingEvent;
import UISL.Column;
import UISL.DataFlow;
import UISL.DetailsComponent;
import UISL.Direction;
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
import UISL.UISLFactory;
import UISL.UISLPackage;
import UISL.ViewComponent;
import UISL.ViewComponentPart;
import UISL.ViewContainer;
import UISL.ViewElement;
import UISL.ViewElementEvent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UISLPackageImpl extends EPackageImpl implements UISLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFlowModelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFlowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFlowBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBindingGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass okFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewComponentPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwingEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dslguiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewElementEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see UISL.UISLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UISLPackageImpl() {
		super(eNS_URI, UISLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UISLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UISLPackage init() {
		if (isInited)
			return (UISLPackage) EPackage.Registry.INSTANCE.getEPackage(UISLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUISLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UISLPackageImpl theUISLPackage = registeredUISLPackage instanceof UISLPackageImpl
				? (UISLPackageImpl) registeredUISLPackage
				: new UISLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUISLPackage.createPackageContents();

		// Initialize created meta-data
		theUISLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUISLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UISLPackage.eNS_URI, theUISLPackage);
		return theUISLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFlowModelElement() {
		return interactionFlowModelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionFlowModelElement_Name() {
		return (EAttribute) interactionFlowModelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionFlowModelElement_Description() {
		return (EAttribute) interactionFlowModelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFlowElement() {
		return interactionFlowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlowElement_InInteractionFlowBlock() {
		return (EReference) interactionFlowElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlowElement_Pararameters() {
		return (EReference) interactionFlowElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlowElement_OutInteractionFlows() {
		return (EReference) interactionFlowElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFlowBlock() {
		return interactionFlowBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlowBlock_TargetInteractionFlowElement() {
		return (EReference) interactionFlowBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlowBlock_ParameterBindingGroup() {
		return (EReference) interactionFlowBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFlowBlock_SourceInteractionFlowElement() {
		return (EReference) interactionFlowBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterBindingGroup() {
		return parameterBindingGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBindingGroup_Parameterbindings() {
		return (EReference) parameterBindingGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterBinding() {
		return parameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBinding_SourceParameter() {
		return (EReference) parameterBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterBinding_TargetParameter() {
		return (EReference) parameterBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationFlow() {
		return navigationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataFlow() {
		return dataFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOKFlow() {
		return okFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorFlow() {
		return errorFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewComponentPart() {
		return viewComponentPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewComponentPart_Subviewcomponentpart() {
		return (EReference) viewComponentPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewComponentPart_ViewElementEvent() {
		return (EReference) viewComponentPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewComponentPart_ParentViewComponentPart() {
		return (EReference) viewComponentPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewElement() {
		return viewElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElement_ViewElementEvent() {
		return (EReference) viewElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElement_ViewContainer() {
		return (EReference) viewElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewComponent() {
		return viewComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewComponent_Viewcomponentpart() {
		return (EReference) viewComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewContainer() {
		return viewContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewContainer_ViewElement() {
		return (EReference) viewContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewContainer_IsLandmark() {
		return (EAttribute) viewContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewContainer_IsDefault() {
		return (EAttribute) viewContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getViewContainer_IsXOR() {
		return (EAttribute) viewContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewContainer_Action() {
		return (EReference) viewContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterBlock() {
		return parameterBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterBlock_Direction() {
		return (EAttribute) parameterBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchingEvent() {
		return catchingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowingEvent() {
		return throwingEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionEvent() {
		return actionEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSLGUI() {
		return dslguiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDSLGUI_InteractionFlowModelElement() {
		return (EReference) dslguiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSLGUI_Name() {
		return (EAttribute) dslguiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDSLGUI_Description() {
		return (EAttribute) dslguiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormComponent() {
		return formComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormComponent_Fields() {
		return (EAttribute) formComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListComponent() {
		return listComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListComponent_Columns() {
		return (EReference) listComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageComponent() {
		return messageComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageComponent_Msg() {
		return (EAttribute) messageComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetailsComponent() {
		return detailsComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailsComponent_Options() {
		return (EAttribute) detailsComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewElementEvent() {
		return viewElementEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewElementEvent_Viewelement() {
		return (EReference) viewElementEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionBlock() {
		return actionBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBlock_ActionEvent() {
		return (EReference) actionBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBlock_ViewContainer() {
		return (EReference) actionBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleDefinition() {
		return moduleDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDefinition_InteractionFlowModelElement() {
		return (EReference) moduleDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDefinition_Module() {
		return (EReference) moduleDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDefinition_InputPort() {
		return (EReference) moduleDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleDefinition_OutputPort() {
		return (EReference) moduleDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortDefinition() {
		return portDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortDefinition_Port() {
		return (EReference) portDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Moduledefinition() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Port() {
		return (EReference) moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Module() {
		return (EReference) portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_PortDefinition() {
		return (EReference) portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Value() {
		return (EAttribute) columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Type() {
		return (EAttribute) columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISLFactory getUISLFactory() {
		return (UISLFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		interactionFlowModelElementEClass = createEClass(INTERACTION_FLOW_MODEL_ELEMENT);
		createEAttribute(interactionFlowModelElementEClass, INTERACTION_FLOW_MODEL_ELEMENT__NAME);
		createEAttribute(interactionFlowModelElementEClass, INTERACTION_FLOW_MODEL_ELEMENT__DESCRIPTION);

		interactionFlowElementEClass = createEClass(INTERACTION_FLOW_ELEMENT);
		createEReference(interactionFlowElementEClass, INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK);
		createEReference(interactionFlowElementEClass, INTERACTION_FLOW_ELEMENT__PARARAMETERS);
		createEReference(interactionFlowElementEClass, INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS);

		interactionFlowBlockEClass = createEClass(INTERACTION_FLOW_BLOCK);
		createEReference(interactionFlowBlockEClass, INTERACTION_FLOW_BLOCK__TARGET_INTERACTION_FLOW_ELEMENT);
		createEReference(interactionFlowBlockEClass, INTERACTION_FLOW_BLOCK__PARAMETER_BINDING_GROUP);
		createEReference(interactionFlowBlockEClass, INTERACTION_FLOW_BLOCK__SOURCE_INTERACTION_FLOW_ELEMENT);

		parameterBindingGroupEClass = createEClass(PARAMETER_BINDING_GROUP);
		createEReference(parameterBindingGroupEClass, PARAMETER_BINDING_GROUP__PARAMETERBINDINGS);

		parameterBindingEClass = createEClass(PARAMETER_BINDING);
		createEReference(parameterBindingEClass, PARAMETER_BINDING__SOURCE_PARAMETER);
		createEReference(parameterBindingEClass, PARAMETER_BINDING__TARGET_PARAMETER);

		navigationFlowEClass = createEClass(NAVIGATION_FLOW);

		dataFlowEClass = createEClass(DATA_FLOW);

		okFlowEClass = createEClass(OK_FLOW);

		errorFlowEClass = createEClass(ERROR_FLOW);

		viewComponentPartEClass = createEClass(VIEW_COMPONENT_PART);
		createEReference(viewComponentPartEClass, VIEW_COMPONENT_PART__SUBVIEWCOMPONENTPART);
		createEReference(viewComponentPartEClass, VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENT);
		createEReference(viewComponentPartEClass, VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART);

		viewElementEClass = createEClass(VIEW_ELEMENT);
		createEReference(viewElementEClass, VIEW_ELEMENT__VIEW_ELEMENT_EVENT);
		createEReference(viewElementEClass, VIEW_ELEMENT__VIEW_CONTAINER);

		viewComponentEClass = createEClass(VIEW_COMPONENT);
		createEReference(viewComponentEClass, VIEW_COMPONENT__VIEWCOMPONENTPART);

		viewContainerEClass = createEClass(VIEW_CONTAINER);
		createEReference(viewContainerEClass, VIEW_CONTAINER__VIEW_ELEMENT);
		createEAttribute(viewContainerEClass, VIEW_CONTAINER__IS_LANDMARK);
		createEAttribute(viewContainerEClass, VIEW_CONTAINER__IS_DEFAULT);
		createEAttribute(viewContainerEClass, VIEW_CONTAINER__IS_XOR);
		createEReference(viewContainerEClass, VIEW_CONTAINER__ACTION);

		parameterBlockEClass = createEClass(PARAMETER_BLOCK);
		createEAttribute(parameterBlockEClass, PARAMETER_BLOCK__DIRECTION);

		eventEClass = createEClass(EVENT);

		catchingEventEClass = createEClass(CATCHING_EVENT);

		throwingEventEClass = createEClass(THROWING_EVENT);

		actionEventEClass = createEClass(ACTION_EVENT);

		dslguiEClass = createEClass(DSLGUI);
		createEReference(dslguiEClass, DSLGUI__INTERACTION_FLOW_MODEL_ELEMENT);
		createEAttribute(dslguiEClass, DSLGUI__NAME);
		createEAttribute(dslguiEClass, DSLGUI__DESCRIPTION);

		formComponentEClass = createEClass(FORM_COMPONENT);
		createEAttribute(formComponentEClass, FORM_COMPONENT__FIELDS);

		listComponentEClass = createEClass(LIST_COMPONENT);
		createEReference(listComponentEClass, LIST_COMPONENT__COLUMNS);

		messageComponentEClass = createEClass(MESSAGE_COMPONENT);
		createEAttribute(messageComponentEClass, MESSAGE_COMPONENT__MSG);

		detailsComponentEClass = createEClass(DETAILS_COMPONENT);
		createEAttribute(detailsComponentEClass, DETAILS_COMPONENT__OPTIONS);

		viewElementEventEClass = createEClass(VIEW_ELEMENT_EVENT);
		createEReference(viewElementEventEClass, VIEW_ELEMENT_EVENT__VIEWELEMENT);

		actionBlockEClass = createEClass(ACTION_BLOCK);
		createEReference(actionBlockEClass, ACTION_BLOCK__ACTION_EVENT);
		createEReference(actionBlockEClass, ACTION_BLOCK__VIEW_CONTAINER);

		moduleDefinitionEClass = createEClass(MODULE_DEFINITION);
		createEReference(moduleDefinitionEClass, MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT);
		createEReference(moduleDefinitionEClass, MODULE_DEFINITION__MODULE);
		createEReference(moduleDefinitionEClass, MODULE_DEFINITION__INPUT_PORT);
		createEReference(moduleDefinitionEClass, MODULE_DEFINITION__OUTPUT_PORT);

		portDefinitionEClass = createEClass(PORT_DEFINITION);
		createEReference(portDefinitionEClass, PORT_DEFINITION__PORT);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__MODULEDEFINITION);
		createEReference(moduleEClass, MODULE__PORT);

		portEClass = createEClass(PORT);
		createEReference(portEClass, PORT__MODULE);
		createEReference(portEClass, PORT__PORT_DEFINITION);

		columnEClass = createEClass(COLUMN);
		createEAttribute(columnEClass, COLUMN__VALUE);
		createEAttribute(columnEClass, COLUMN__TYPE);

		// Create enums
		directionEEnum = createEEnum(DIRECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		interactionFlowElementEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		interactionFlowBlockEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		parameterBindingGroupEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		parameterBindingEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		navigationFlowEClass.getESuperTypes().add(this.getInteractionFlowBlock());
		dataFlowEClass.getESuperTypes().add(this.getInteractionFlowBlock());
		okFlowEClass.getESuperTypes().add(this.getInteractionFlowBlock());
		errorFlowEClass.getESuperTypes().add(this.getInteractionFlowBlock());
		viewComponentPartEClass.getESuperTypes().add(this.getInteractionFlowElement());
		viewElementEClass.getESuperTypes().add(this.getInteractionFlowElement());
		viewComponentEClass.getESuperTypes().add(this.getViewElement());
		viewContainerEClass.getESuperTypes().add(this.getViewElement());
		parameterBlockEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		eventEClass.getESuperTypes().add(this.getInteractionFlowElement());
		catchingEventEClass.getESuperTypes().add(this.getEvent());
		throwingEventEClass.getESuperTypes().add(this.getEvent());
		actionEventEClass.getESuperTypes().add(this.getCatchingEvent());
		formComponentEClass.getESuperTypes().add(this.getViewComponent());
		listComponentEClass.getESuperTypes().add(this.getViewComponent());
		messageComponentEClass.getESuperTypes().add(this.getViewComponent());
		detailsComponentEClass.getESuperTypes().add(this.getViewComponent());
		viewElementEventEClass.getESuperTypes().add(this.getCatchingEvent());
		actionBlockEClass.getESuperTypes().add(this.getInteractionFlowElement());
		moduleDefinitionEClass.getESuperTypes().add(this.getInteractionFlowModelElement());
		portDefinitionEClass.getESuperTypes().add(this.getInteractionFlowElement());
		moduleEClass.getESuperTypes().add(this.getInteractionFlowElement());
		portEClass.getESuperTypes().add(this.getInteractionFlowElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(interactionFlowModelElementEClass, InteractionFlowModelElement.class, "InteractionFlowModelElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractionFlowModelElement_Name(), ecorePackage.getEString(), "name", null, 1, 1,
				InteractionFlowModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionFlowModelElement_Description(), ecorePackage.getEString(), "description", null, 0,
				1, InteractionFlowModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionFlowElementEClass, InteractionFlowElement.class, "InteractionFlowElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFlowElement_InInteractionFlowBlock(), this.getInteractionFlowBlock(),
				this.getInteractionFlowBlock_TargetInteractionFlowElement(), "inInteractionFlowBlock", null, 0, -1,
				InteractionFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionFlowElement_Pararameters(), this.getParameterBlock(), null, "pararameters", null,
				0, -1, InteractionFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionFlowElement_OutInteractionFlows(), this.getInteractionFlowBlock(),
				this.getInteractionFlowBlock_SourceInteractionFlowElement(), "outInteractionFlows", null, 0, -1,
				InteractionFlowElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionFlowBlockEClass, InteractionFlowBlock.class, "InteractionFlowBlock", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFlowBlock_TargetInteractionFlowElement(), this.getInteractionFlowElement(),
				this.getInteractionFlowElement_InInteractionFlowBlock(), "targetInteractionFlowElement", null, 1, 1,
				InteractionFlowBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionFlowBlock_ParameterBindingGroup(), this.getParameterBindingGroup(), null,
				"parameterBindingGroup", null, 0, 1, InteractionFlowBlock.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionFlowBlock_SourceInteractionFlowElement(), this.getInteractionFlowElement(),
				this.getInteractionFlowElement_OutInteractionFlows(), "sourceInteractionFlowElement", null, 0, 1,
				InteractionFlowBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterBindingGroupEClass, ParameterBindingGroup.class, "ParameterBindingGroup", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterBindingGroup_Parameterbindings(), this.getParameterBinding(), null,
				"parameterbindings", null, 1, -1, ParameterBindingGroup.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterBindingEClass, ParameterBinding.class, "ParameterBinding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterBinding_SourceParameter(), this.getParameterBlock(), null, "sourceParameter", null,
				1, 1, ParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterBinding_TargetParameter(), this.getParameterBlock(), null, "targetParameter", null,
				1, 1, ParameterBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationFlowEClass, NavigationFlow.class, "NavigationFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataFlowEClass, DataFlow.class, "DataFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(okFlowEClass, OKFlow.class, "OKFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorFlowEClass, ErrorFlow.class, "ErrorFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(viewComponentPartEClass, ViewComponentPart.class, "ViewComponentPart", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewComponentPart_Subviewcomponentpart(), this.getViewComponentPart(),
				this.getViewComponentPart_ParentViewComponentPart(), "subviewcomponentpart", null, 0, -1,
				ViewComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewComponentPart_ViewElementEvent(), this.getViewElementEvent(), null, "viewElementEvent",
				null, 0, -1, ViewComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewComponentPart_ParentViewComponentPart(), this.getViewComponentPart(),
				this.getViewComponentPart_Subviewcomponentpart(), "parentViewComponentPart", null, 0, 1,
				ViewComponentPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewElementEClass, ViewElement.class, "ViewElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewElement_ViewElementEvent(), this.getViewElementEvent(), null, "viewElementEvent", null, 0,
				-1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getViewElement_ViewContainer(), this.getViewContainer(), this.getViewContainer_ViewElement(),
				"viewContainer", null, 0, 1, ViewElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewComponentEClass, ViewComponent.class, "ViewComponent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewComponent_Viewcomponentpart(), this.getViewComponentPart(), null, "viewcomponentpart",
				null, 0, -1, ViewComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewContainerEClass, ViewContainer.class, "ViewContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewContainer_ViewElement(), this.getViewElement(), this.getViewElement_ViewContainer(),
				"viewElement", null, 0, -1, ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewContainer_IsLandmark(), ecorePackage.getEBooleanObject(), "isLandmark", "false", 1, 1,
				ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewContainer_IsDefault(), ecorePackage.getEBooleanObject(), "isDefault", "false", 1, 1,
				ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getViewContainer_IsXOR(), ecorePackage.getEBooleanObject(), "isXOR", "false", 1, 1,
				ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getViewContainer_Action(), this.getActionBlock(), this.getActionBlock_ViewContainer(), "action",
				null, 0, -1, ViewContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterBlockEClass, ParameterBlock.class, "ParameterBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterBlock_Direction(), this.getDirection(), "direction", "in", 1, 1,
				ParameterBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(catchingEventEClass, CatchingEvent.class, "CatchingEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(throwingEventEClass, ThrowingEvent.class, "ThrowingEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEventEClass, ActionEvent.class, "ActionEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dslguiEClass, UISL.DSLGUI.class, "DSLGUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDSLGUI_InteractionFlowModelElement(), this.getInteractionFlowModelElement(), null,
				"interactionFlowModelElement", null, 0, -1, UISL.DSLGUI.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSLGUI_Name(), ecorePackage.getEString(), "name", null, 1, 1, UISL.DSLGUI.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDSLGUI_Description(), ecorePackage.getEString(), "description", null, 0, 1, UISL.DSLGUI.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formComponentEClass, FormComponent.class, "FormComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormComponent_Fields(), ecorePackage.getEString(), "fields", null, 0, -1, FormComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listComponentEClass, ListComponent.class, "ListComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListComponent_Columns(), this.getColumn(), null, "columns", null, 0, -1, ListComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageComponentEClass, MessageComponent.class, "MessageComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessageComponent_Msg(), ecorePackage.getEString(), "msg", "", 1, 1, MessageComponent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailsComponentEClass, DetailsComponent.class, "DetailsComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetailsComponent_Options(), ecorePackage.getEString(), "options", null, 0, -1,
				DetailsComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(viewElementEventEClass, ViewElementEvent.class, "ViewElementEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewElementEvent_Viewelement(), this.getViewElement(), null, "viewelement", null, 1, 1,
				ViewElementEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionBlockEClass, ActionBlock.class, "ActionBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionBlock_ActionEvent(), this.getActionEvent(), null, "actionEvent", null, 0, -1,
				ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionBlock_ViewContainer(), this.getViewContainer(), this.getViewContainer_Action(),
				"viewContainer", null, 0, 1, ActionBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleDefinitionEClass, ModuleDefinition.class, "ModuleDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModuleDefinition_InteractionFlowModelElement(), this.getInteractionFlowModelElement(), null,
				"interactionFlowModelElement", null, 1, -1, ModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModuleDefinition_Module(), this.getModule(), this.getModule_Moduledefinition(), "module",
				null, 0, -1, ModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModuleDefinition_InputPort(), this.getPortDefinition(), null, "inputPort", null, 0, -1,
				ModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModuleDefinition_OutputPort(), this.getPortDefinition(), null, "outputPort", null, 0, -1,
				ModuleDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portDefinitionEClass, PortDefinition.class, "PortDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortDefinition_Port(), this.getPort(), this.getPort_PortDefinition(), "port", null, 0, -1,
				PortDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(moduleEClass, UISL.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_Moduledefinition(), this.getModuleDefinition(), this.getModuleDefinition_Module(),
				"moduledefinition", null, 1, 1, UISL.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModule_Port(), this.getPort(), this.getPort_Module(), "port", null, 0, -1, UISL.Module.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPort_Module(), this.getModule(), this.getModule_Port(), "module", null, 1, 1, Port.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_PortDefinition(), this.getPortDefinition(), this.getPortDefinition_Port(),
				"portDefinition", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumn_Value(), ecorePackage.getEString(), "value", null, 0, 1, Column.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Type(), ecorePackage.getEString(), "type", "", 0, 1, Column.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.IN);
		addEEnumLiteral(directionEEnum, Direction.OUT);
		addEEnumLiteral(directionEEnum, Direction.INOUT);

		// Create resource
		createResource(eNS_URI);
	}

} //UISLPackageImpl

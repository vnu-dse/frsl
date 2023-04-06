/**
 */
package UISL.impl;

import UISL.ActionBlock;
import UISL.ActionEvent;
import UISL.CatchingEvent;
import UISL.Column;
import UISL.DSLGUI;
import UISL.DataFlow;
import UISL.DetailsComponent;
import UISL.Direction;
import UISL.ErrorFlow;
import UISL.FormComponent;
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
import UISL.ViewContainer;
import UISL.ViewElementEvent;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UISLFactoryImpl extends EFactoryImpl implements UISLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UISLFactory init() {
		try {
			UISLFactory theUISLFactory = (UISLFactory) EPackage.Registry.INSTANCE.getEFactory(UISLPackage.eNS_URI);
			if (theUISLFactory != null) {
				return theUISLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UISLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UISLPackage.PARAMETER_BINDING_GROUP:
			return createParameterBindingGroup();
		case UISLPackage.PARAMETER_BINDING:
			return createParameterBinding();
		case UISLPackage.NAVIGATION_FLOW:
			return createNavigationFlow();
		case UISLPackage.DATA_FLOW:
			return createDataFlow();
		case UISLPackage.OK_FLOW:
			return createOKFlow();
		case UISLPackage.ERROR_FLOW:
			return createErrorFlow();
		case UISLPackage.VIEW_CONTAINER:
			return createViewContainer();
		case UISLPackage.PARAMETER_BLOCK:
			return createParameterBlock();
		case UISLPackage.CATCHING_EVENT:
			return createCatchingEvent();
		case UISLPackage.THROWING_EVENT:
			return createThrowingEvent();
		case UISLPackage.ACTION_EVENT:
			return createActionEvent();
		case UISLPackage.DSLGUI:
			return createDSLGUI();
		case UISLPackage.FORM_COMPONENT:
			return createFormComponent();
		case UISLPackage.LIST_COMPONENT:
			return createListComponent();
		case UISLPackage.MESSAGE_COMPONENT:
			return createMessageComponent();
		case UISLPackage.DETAILS_COMPONENT:
			return createDetailsComponent();
		case UISLPackage.VIEW_ELEMENT_EVENT:
			return createViewElementEvent();
		case UISLPackage.ACTION_BLOCK:
			return createActionBlock();
		case UISLPackage.MODULE_DEFINITION:
			return createModuleDefinition();
		case UISLPackage.PORT_DEFINITION:
			return createPortDefinition();
		case UISLPackage.MODULE:
			return createModule();
		case UISLPackage.PORT:
			return createPort();
		case UISLPackage.COLUMN:
			return createColumn();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case UISLPackage.DIRECTION:
			return createDirectionFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case UISLPackage.DIRECTION:
			return convertDirectionToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBindingGroup createParameterBindingGroup() {
		ParameterBindingGroupImpl parameterBindingGroup = new ParameterBindingGroupImpl();
		return parameterBindingGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBinding createParameterBinding() {
		ParameterBindingImpl parameterBinding = new ParameterBindingImpl();
		return parameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationFlow createNavigationFlow() {
		NavigationFlowImpl navigationFlow = new NavigationFlowImpl();
		return navigationFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OKFlow createOKFlow() {
		OKFlowImpl okFlow = new OKFlowImpl();
		return okFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorFlow createErrorFlow() {
		ErrorFlowImpl errorFlow = new ErrorFlowImpl();
		return errorFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContainer createViewContainer() {
		ViewContainerImpl viewContainer = new ViewContainerImpl();
		return viewContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBlock createParameterBlock() {
		ParameterBlockImpl parameterBlock = new ParameterBlockImpl();
		return parameterBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CatchingEvent createCatchingEvent() {
		CatchingEventImpl catchingEvent = new CatchingEventImpl();
		return catchingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThrowingEvent createThrowingEvent() {
		ThrowingEventImpl throwingEvent = new ThrowingEventImpl();
		return throwingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEvent createActionEvent() {
		ActionEventImpl actionEvent = new ActionEventImpl();
		return actionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSLGUI createDSLGUI() {
		DSLGUIImpl dslgui = new DSLGUIImpl();
		return dslgui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormComponent createFormComponent() {
		FormComponentImpl formComponent = new FormComponentImpl();
		return formComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListComponent createListComponent() {
		ListComponentImpl listComponent = new ListComponentImpl();
		return listComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageComponent createMessageComponent() {
		MessageComponentImpl messageComponent = new MessageComponentImpl();
		return messageComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailsComponent createDetailsComponent() {
		DetailsComponentImpl detailsComponent = new DetailsComponentImpl();
		return detailsComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElementEvent createViewElementEvent() {
		ViewElementEventImpl viewElementEvent = new ViewElementEventImpl();
		return viewElementEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBlock createActionBlock() {
		ActionBlockImpl actionBlock = new ActionBlockImpl();
		return actionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinition createModuleDefinition() {
		ModuleDefinitionImpl moduleDefinition = new ModuleDefinitionImpl();
		return moduleDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDefinition createPortDefinition() {
		PortDefinitionImpl portDefinition = new PortDefinitionImpl();
		return portDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISL.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
		Direction result = Direction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISLPackage getUISLPackage() {
		return (UISLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UISLPackage getPackage() {
		return UISLPackage.eINSTANCE;
	}

} //UISLFactoryImpl

/**
 */
package UISL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see UISL.UISLPackage
 * @generated
 */
public interface UISLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UISLFactory eINSTANCE = UISL.impl.UISLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Parameter Binding Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Binding Group</em>'.
	 * @generated
	 */
	ParameterBindingGroup createParameterBindingGroup();

	/**
	 * Returns a new object of class '<em>Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Binding</em>'.
	 * @generated
	 */
	ParameterBinding createParameterBinding();

	/**
	 * Returns a new object of class '<em>Navigation Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Flow</em>'.
	 * @generated
	 */
	NavigationFlow createNavigationFlow();

	/**
	 * Returns a new object of class '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Flow</em>'.
	 * @generated
	 */
	DataFlow createDataFlow();

	/**
	 * Returns a new object of class '<em>OK Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OK Flow</em>'.
	 * @generated
	 */
	OKFlow createOKFlow();

	/**
	 * Returns a new object of class '<em>Error Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Flow</em>'.
	 * @generated
	 */
	ErrorFlow createErrorFlow();

	/**
	 * Returns a new object of class '<em>View Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Container</em>'.
	 * @generated
	 */
	ViewContainer createViewContainer();

	/**
	 * Returns a new object of class '<em>Parameter Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Block</em>'.
	 * @generated
	 */
	ParameterBlock createParameterBlock();

	/**
	 * Returns a new object of class '<em>Catching Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catching Event</em>'.
	 * @generated
	 */
	CatchingEvent createCatchingEvent();

	/**
	 * Returns a new object of class '<em>Throwing Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Throwing Event</em>'.
	 * @generated
	 */
	ThrowingEvent createThrowingEvent();

	/**
	 * Returns a new object of class '<em>Action Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Event</em>'.
	 * @generated
	 */
	ActionEvent createActionEvent();

	/**
	 * Returns a new object of class '<em>DSLGUI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSLGUI</em>'.
	 * @generated
	 */
	DSLGUI createDSLGUI();

	/**
	 * Returns a new object of class '<em>Form Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Form Component</em>'.
	 * @generated
	 */
	FormComponent createFormComponent();

	/**
	 * Returns a new object of class '<em>List Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>List Component</em>'.
	 * @generated
	 */
	ListComponent createListComponent();

	/**
	 * Returns a new object of class '<em>Message Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Component</em>'.
	 * @generated
	 */
	MessageComponent createMessageComponent();

	/**
	 * Returns a new object of class '<em>Details Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Details Component</em>'.
	 * @generated
	 */
	DetailsComponent createDetailsComponent();

	/**
	 * Returns a new object of class '<em>View Element Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Element Event</em>'.
	 * @generated
	 */
	ViewElementEvent createViewElementEvent();

	/**
	 * Returns a new object of class '<em>Action Block</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Block</em>'.
	 * @generated
	 */
	ActionBlock createActionBlock();

	/**
	 * Returns a new object of class '<em>Module Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module Definition</em>'.
	 * @generated
	 */
	ModuleDefinition createModuleDefinition();

	/**
	 * Returns a new object of class '<em>Port Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Definition</em>'.
	 * @generated
	 */
	PortDefinition createPortDefinition();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UISLPackage getUISLPackage();

} //UISLFactory

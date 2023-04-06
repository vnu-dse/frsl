/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.ModuleDefinition#getInteractionFlowModelElement <em>Interaction Flow Model Element</em>}</li>
 *   <li>{@link UISL.ModuleDefinition#getModule <em>Module</em>}</li>
 *   <li>{@link UISL.ModuleDefinition#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link UISL.ModuleDefinition#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getModuleDefinition()
 * @model
 * @generated
 */
public interface ModuleDefinition extends InteractionFlowModelElement {
	/**
	 * Returns the value of the '<em><b>Interaction Flow Model Element</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.InteractionFlowModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Flow Model Element</em>' containment reference list.
	 * @see UISL.UISLPackage#getModuleDefinition_InteractionFlowModelElement()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<InteractionFlowModelElement> getInteractionFlowModelElement();

	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference list.
	 * The list contents are of type {@link UISL.Module}.
	 * It is bidirectional and its opposite is '{@link UISL.Module#getModuledefinition <em>Moduledefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference list.
	 * @see UISL.UISLPackage#getModuleDefinition_Module()
	 * @see UISL.Module#getModuledefinition
	 * @model opposite="moduledefinition" ordered="false"
	 * @generated
	 */
	EList<UISL.Module> getModule();

	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.PortDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' containment reference list.
	 * @see UISL.UISLPackage#getModuleDefinition_InputPort()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PortDefinition> getInputPort();

	/**
	 * Returns the value of the '<em><b>Output Port</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.PortDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Port</em>' containment reference list.
	 * @see UISL.UISLPackage#getModuleDefinition_OutputPort()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<PortDefinition> getOutputPort();

} // ModuleDefinition

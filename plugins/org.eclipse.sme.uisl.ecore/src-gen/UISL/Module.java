/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.Module#getModuledefinition <em>Moduledefinition</em>}</li>
 *   <li>{@link UISL.Module#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>Moduledefinition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UISL.ModuleDefinition#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moduledefinition</em>' reference.
	 * @see #setModuledefinition(ModuleDefinition)
	 * @see UISL.UISLPackage#getModule_Moduledefinition()
	 * @see UISL.ModuleDefinition#getModule
	 * @model opposite="module" required="true" ordered="false"
	 * @generated
	 */
	ModuleDefinition getModuledefinition();

	/**
	 * Sets the value of the '{@link UISL.Module#getModuledefinition <em>Moduledefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moduledefinition</em>' reference.
	 * @see #getModuledefinition()
	 * @generated
	 */
	void setModuledefinition(ModuleDefinition value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link UISL.Port}.
	 * It is bidirectional and its opposite is '{@link UISL.Port#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see UISL.UISLPackage#getModule_Port()
	 * @see UISL.Port#getModule
	 * @model opposite="module" ordered="false"
	 * @generated
	 */
	EList<Port> getPort();

} // Module

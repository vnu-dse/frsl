/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Binding Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.ParameterBindingGroup#getParameterbindings <em>Parameterbindings</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getParameterBindingGroup()
 * @model
 * @generated
 */
public interface ParameterBindingGroup extends InteractionFlowModelElement {
	/**
	 * Returns the value of the '<em><b>Parameterbindings</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterbindings</em>' containment reference list.
	 * @see UISL.UISLPackage#getParameterBindingGroup_Parameterbindings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterbindings();

} // ParameterBindingGroup

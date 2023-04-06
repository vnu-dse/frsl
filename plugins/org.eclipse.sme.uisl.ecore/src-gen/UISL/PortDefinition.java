/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.PortDefinition#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getPortDefinition()
 * @model
 * @generated
 */
public interface PortDefinition extends InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link UISL.Port}.
	 * It is bidirectional and its opposite is '{@link UISL.Port#getPortDefinition <em>Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see UISL.UISLPackage#getPortDefinition_Port()
	 * @see UISL.Port#getPortDefinition
	 * @model opposite="portDefinition" ordered="false"
	 * @generated
	 */
	EList<Port> getPort();

} // PortDefinition

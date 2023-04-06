/**
 */
package UISL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.Port#getModule <em>Module</em>}</li>
 *   <li>{@link UISL.Port#getPortDefinition <em>Port Definition</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>Module</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UISL.Module#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' reference.
	 * @see #setModule(UISL.Module)
	 * @see UISL.UISLPackage#getPort_Module()
	 * @see UISL.Module#getPort
	 * @model opposite="port" required="true" ordered="false"
	 * @generated
	 */
	UISL.Module getModule();

	/**
	 * Sets the value of the '{@link UISL.Port#getModule <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(UISL.Module value);

	/**
	 * Returns the value of the '<em><b>Port Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UISL.PortDefinition#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Definition</em>' reference.
	 * @see #setPortDefinition(PortDefinition)
	 * @see UISL.UISLPackage#getPort_PortDefinition()
	 * @see UISL.PortDefinition#getPort
	 * @model opposite="port" required="true"
	 * @generated
	 */
	PortDefinition getPortDefinition();

	/**
	 * Sets the value of the '{@link UISL.Port#getPortDefinition <em>Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Definition</em>' reference.
	 * @see #getPortDefinition()
	 * @generated
	 */
	void setPortDefinition(PortDefinition value);

} // Port

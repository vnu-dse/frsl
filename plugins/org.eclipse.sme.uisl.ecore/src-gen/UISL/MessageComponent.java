/**
 */
package UISL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.MessageComponent#getMsg <em>Msg</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getMessageComponent()
 * @model
 * @generated
 */
public interface MessageComponent extends ViewComponent {
	/**
	 * Returns the value of the '<em><b>Msg</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Msg</em>' attribute.
	 * @see #setMsg(String)
	 * @see UISL.UISLPackage#getMessageComponent_Msg()
	 * @model default="" required="true"
	 * @generated
	 */
	String getMsg();

	/**
	 * Sets the value of the '{@link UISL.MessageComponent#getMsg <em>Msg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Msg</em>' attribute.
	 * @see #getMsg()
	 * @generated
	 */
	void setMsg(String value);

} // MessageComponent

/**
 */
package UISL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Element Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.ViewElementEvent#getViewelement <em>Viewelement</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getViewElementEvent()
 * @model
 * @generated
 */
public interface ViewElementEvent extends CatchingEvent {
	/**
	 * Returns the value of the '<em><b>Viewelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewelement</em>' reference.
	 * @see #setViewelement(ViewElement)
	 * @see UISL.UISLPackage#getViewElementEvent_Viewelement()
	 * @model required="true"
	 * @generated
	 */
	ViewElement getViewelement();

	/**
	 * Sets the value of the '{@link UISL.ViewElementEvent#getViewelement <em>Viewelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewelement</em>' reference.
	 * @see #getViewelement()
	 * @generated
	 */
	void setViewelement(ViewElement value);

} // ViewElementEvent

/**
 */
package UISL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.ParameterBlock#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getParameterBlock()
 * @model
 * @generated
 */
public interface ParameterBlock extends InteractionFlowModelElement {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"in"</code>.
	 * The literals are from the enumeration {@link UISL.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see UISL.Direction
	 * @see #setDirection(Direction)
	 * @see UISL.UISLPackage#getParameterBlock_Direction()
	 * @model default="in" required="true"
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link UISL.ParameterBlock#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see UISL.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

} // ParameterBlock

/**
 */
package UISL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.ParameterBinding#getSourceParameter <em>Source Parameter</em>}</li>
 *   <li>{@link UISL.ParameterBinding#getTargetParameter <em>Target Parameter</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getParameterBinding()
 * @model
 * @generated
 */
public interface ParameterBinding extends InteractionFlowModelElement {
	/**
	 * Returns the value of the '<em><b>Source Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Parameter</em>' reference.
	 * @see #setSourceParameter(ParameterBlock)
	 * @see UISL.UISLPackage#getParameterBinding_SourceParameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterBlock getSourceParameter();

	/**
	 * Sets the value of the '{@link UISL.ParameterBinding#getSourceParameter <em>Source Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Parameter</em>' reference.
	 * @see #getSourceParameter()
	 * @generated
	 */
	void setSourceParameter(ParameterBlock value);

	/**
	 * Returns the value of the '<em><b>Target Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Parameter</em>' reference.
	 * @see #setTargetParameter(ParameterBlock)
	 * @see UISL.UISLPackage#getParameterBinding_TargetParameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterBlock getTargetParameter();

	/**
	 * Sets the value of the '{@link UISL.ParameterBinding#getTargetParameter <em>Target Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Parameter</em>' reference.
	 * @see #getTargetParameter()
	 * @generated
	 */
	void setTargetParameter(ParameterBlock value);

} // ParameterBinding

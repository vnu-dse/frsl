/**
 */
package UISL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Flow Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.InteractionFlowBlock#getTargetInteractionFlowElement <em>Target Interaction Flow Element</em>}</li>
 *   <li>{@link UISL.InteractionFlowBlock#getParameterBindingGroup <em>Parameter Binding Group</em>}</li>
 *   <li>{@link UISL.InteractionFlowBlock#getSourceInteractionFlowElement <em>Source Interaction Flow Element</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getInteractionFlowBlock()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFlowBlock extends InteractionFlowModelElement {
	/**
	 * Returns the value of the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link UISL.InteractionFlowElement#getInInteractionFlowBlock <em>In Interaction Flow Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Interaction Flow Element</em>' reference.
	 * @see #setTargetInteractionFlowElement(InteractionFlowElement)
	 * @see UISL.UISLPackage#getInteractionFlowBlock_TargetInteractionFlowElement()
	 * @see UISL.InteractionFlowElement#getInInteractionFlowBlock
	 * @model opposite="inInteractionFlowBlock" required="true"
	 * @generated
	 */
	InteractionFlowElement getTargetInteractionFlowElement();

	/**
	 * Sets the value of the '{@link UISL.InteractionFlowBlock#getTargetInteractionFlowElement <em>Target Interaction Flow Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Interaction Flow Element</em>' reference.
	 * @see #getTargetInteractionFlowElement()
	 * @generated
	 */
	void setTargetInteractionFlowElement(InteractionFlowElement value);

	/**
	 * Returns the value of the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Binding Group</em>' containment reference.
	 * @see #setParameterBindingGroup(ParameterBindingGroup)
	 * @see UISL.UISLPackage#getInteractionFlowBlock_ParameterBindingGroup()
	 * @model containment="true"
	 * @generated
	 */
	ParameterBindingGroup getParameterBindingGroup();

	/**
	 * Sets the value of the '{@link UISL.InteractionFlowBlock#getParameterBindingGroup <em>Parameter Binding Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Binding Group</em>' containment reference.
	 * @see #getParameterBindingGroup()
	 * @generated
	 */
	void setParameterBindingGroup(ParameterBindingGroup value);

	/**
	 * Returns the value of the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link UISL.InteractionFlowElement#getOutInteractionFlows <em>Out Interaction Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Interaction Flow Element</em>' container reference.
	 * @see #setSourceInteractionFlowElement(InteractionFlowElement)
	 * @see UISL.UISLPackage#getInteractionFlowBlock_SourceInteractionFlowElement()
	 * @see UISL.InteractionFlowElement#getOutInteractionFlows
	 * @model opposite="outInteractionFlows" transient="false"
	 * @generated
	 */
	InteractionFlowElement getSourceInteractionFlowElement();

	/**
	 * Sets the value of the '{@link UISL.InteractionFlowBlock#getSourceInteractionFlowElement <em>Source Interaction Flow Element</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Interaction Flow Element</em>' container reference.
	 * @see #getSourceInteractionFlowElement()
	 * @generated
	 */
	void setSourceInteractionFlowElement(InteractionFlowElement value);

} // InteractionFlowBlock

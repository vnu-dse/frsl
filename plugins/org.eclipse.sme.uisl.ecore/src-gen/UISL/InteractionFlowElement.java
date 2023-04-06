/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Flow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.InteractionFlowElement#getInInteractionFlowBlock <em>In Interaction Flow Block</em>}</li>
 *   <li>{@link UISL.InteractionFlowElement#getPararameters <em>Pararameters</em>}</li>
 *   <li>{@link UISL.InteractionFlowElement#getOutInteractionFlows <em>Out Interaction Flows</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getInteractionFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface InteractionFlowElement extends InteractionFlowModelElement {
	/**
	 * Returns the value of the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * The list contents are of type {@link UISL.InteractionFlowBlock}.
	 * It is bidirectional and its opposite is '{@link UISL.InteractionFlowBlock#getTargetInteractionFlowElement <em>Target Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Interaction Flow Block</em>' reference list.
	 * @see UISL.UISLPackage#getInteractionFlowElement_InInteractionFlowBlock()
	 * @see UISL.InteractionFlowBlock#getTargetInteractionFlowElement
	 * @model opposite="targetInteractionFlowElement"
	 * @generated
	 */
	EList<InteractionFlowBlock> getInInteractionFlowBlock();

	/**
	 * Returns the value of the '<em><b>Pararameters</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.ParameterBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pararameters</em>' containment reference list.
	 * @see UISL.UISLPackage#getInteractionFlowElement_Pararameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBlock> getPararameters();

	/**
	 * Returns the value of the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.InteractionFlowBlock}.
	 * It is bidirectional and its opposite is '{@link UISL.InteractionFlowBlock#getSourceInteractionFlowElement <em>Source Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Interaction Flows</em>' containment reference list.
	 * @see UISL.UISLPackage#getInteractionFlowElement_OutInteractionFlows()
	 * @see UISL.InteractionFlowBlock#getSourceInteractionFlowElement
	 * @model opposite="sourceInteractionFlowElement" containment="true"
	 * @generated
	 */
	EList<InteractionFlowBlock> getOutInteractionFlows();

} // InteractionFlowElement

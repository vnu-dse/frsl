/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSLGUI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.DSLGUI#getInteractionFlowModelElement <em>Interaction Flow Model Element</em>}</li>
 *   <li>{@link UISL.DSLGUI#getName <em>Name</em>}</li>
 *   <li>{@link UISL.DSLGUI#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getDSLGUI()
 * @model
 * @generated
 */
public interface DSLGUI extends EObject {
	/**
	 * Returns the value of the '<em><b>Interaction Flow Model Element</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.InteractionFlowModelElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Flow Model Element</em>' containment reference list.
	 * @see UISL.UISLPackage#getDSLGUI_InteractionFlowModelElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractionFlowModelElement> getInteractionFlowModelElement();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UISL.UISLPackage#getDSLGUI_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UISL.DSLGUI#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see UISL.UISLPackage#getDSLGUI_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link UISL.DSLGUI#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // DSLGUI

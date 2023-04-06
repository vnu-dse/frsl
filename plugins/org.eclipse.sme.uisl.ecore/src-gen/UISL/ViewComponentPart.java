/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Component Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.ViewComponentPart#getSubviewcomponentpart <em>Subviewcomponentpart</em>}</li>
 *   <li>{@link UISL.ViewComponentPart#getViewElementEvent <em>View Element Event</em>}</li>
 *   <li>{@link UISL.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getViewComponentPart()
 * @model abstract="true"
 * @generated
 */
public interface ViewComponentPart extends InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>Subviewcomponentpart</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.ViewComponentPart}.
	 * It is bidirectional and its opposite is '{@link UISL.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subviewcomponentpart</em>' containment reference list.
	 * @see UISL.UISLPackage#getViewComponentPart_Subviewcomponentpart()
	 * @see UISL.ViewComponentPart#getParentViewComponentPart
	 * @model opposite="parentViewComponentPart" containment="true"
	 * @generated
	 */
	EList<ViewComponentPart> getSubviewcomponentpart();

	/**
	 * Returns the value of the '<em><b>View Element Event</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.ViewElementEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Element Event</em>' containment reference list.
	 * @see UISL.UISLPackage#getViewComponentPart_ViewElementEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewElementEvent> getViewElementEvent();

	/**
	 * Returns the value of the '<em><b>Parent View Component Part</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link UISL.ViewComponentPart#getSubviewcomponentpart <em>Subviewcomponentpart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent View Component Part</em>' container reference.
	 * @see #setParentViewComponentPart(ViewComponentPart)
	 * @see UISL.UISLPackage#getViewComponentPart_ParentViewComponentPart()
	 * @see UISL.ViewComponentPart#getSubviewcomponentpart
	 * @model opposite="subviewcomponentpart" transient="false"
	 * @generated
	 */
	ViewComponentPart getParentViewComponentPart();

	/**
	 * Sets the value of the '{@link UISL.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent View Component Part</em>' container reference.
	 * @see #getParentViewComponentPart()
	 * @generated
	 */
	void setParentViewComponentPart(ViewComponentPart value);

} // ViewComponentPart

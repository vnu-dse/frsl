/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.ActionBlock#getActionEvent <em>Action Event</em>}</li>
 *   <li>{@link UISL.ActionBlock#getViewContainer <em>View Container</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getActionBlock()
 * @model
 * @generated
 */
public interface ActionBlock extends InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>Action Event</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.ActionEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Event</em>' containment reference list.
	 * @see UISL.UISLPackage#getActionBlock_ActionEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionEvent> getActionEvent();

	/**
	 * Returns the value of the '<em><b>View Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link UISL.ViewContainer#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Container</em>' container reference.
	 * @see #setViewContainer(ViewContainer)
	 * @see UISL.UISLPackage#getActionBlock_ViewContainer()
	 * @see UISL.ViewContainer#getAction
	 * @model opposite="action" transient="false"
	 * @generated
	 */
	ViewContainer getViewContainer();

	/**
	 * Sets the value of the '{@link UISL.ActionBlock#getViewContainer <em>View Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Container</em>' container reference.
	 * @see #getViewContainer()
	 * @generated
	 */
	void setViewContainer(ViewContainer value);

} // ActionBlock

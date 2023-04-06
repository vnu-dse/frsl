/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.ViewElement#getViewElementEvent <em>View Element Event</em>}</li>
 *   <li>{@link UISL.ViewElement#getViewContainer <em>View Container</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getViewElement()
 * @model abstract="true"
 * @generated
 */
public interface ViewElement extends InteractionFlowElement {
	/**
	 * Returns the value of the '<em><b>View Element Event</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.ViewElementEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Element Event</em>' containment reference list.
	 * @see UISL.UISLPackage#getViewElement_ViewElementEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewElementEvent> getViewElementEvent();

	/**
	 * Returns the value of the '<em><b>View Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link UISL.ViewContainer#getViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Container</em>' container reference.
	 * @see #setViewContainer(ViewContainer)
	 * @see UISL.UISLPackage#getViewElement_ViewContainer()
	 * @see UISL.ViewContainer#getViewElement
	 * @model opposite="viewElement" transient="false"
	 * @generated
	 */
	ViewContainer getViewContainer();

	/**
	 * Sets the value of the '{@link UISL.ViewElement#getViewContainer <em>View Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Container</em>' container reference.
	 * @see #getViewContainer()
	 * @generated
	 */
	void setViewContainer(ViewContainer value);

} // ViewElement

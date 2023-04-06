/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.ViewContainer#getViewElement <em>View Element</em>}</li>
 *   <li>{@link UISL.ViewContainer#getIsLandmark <em>Is Landmark</em>}</li>
 *   <li>{@link UISL.ViewContainer#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link UISL.ViewContainer#getIsXOR <em>Is XOR</em>}</li>
 *   <li>{@link UISL.ViewContainer#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getViewContainer()
 * @model
 * @generated
 */
public interface ViewContainer extends ViewElement {
	/**
	 * Returns the value of the '<em><b>View Element</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.ViewElement}.
	 * It is bidirectional and its opposite is '{@link UISL.ViewElement#getViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Element</em>' containment reference list.
	 * @see UISL.UISLPackage#getViewContainer_ViewElement()
	 * @see UISL.ViewElement#getViewContainer
	 * @model opposite="viewContainer" containment="true"
	 * @generated
	 */
	EList<ViewElement> getViewElement();

	/**
	 * Returns the value of the '<em><b>Is Landmark</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Landmark</em>' attribute.
	 * @see #setIsLandmark(Boolean)
	 * @see UISL.UISLPackage#getViewContainer_IsLandmark()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getIsLandmark();

	/**
	 * Sets the value of the '{@link UISL.ViewContainer#getIsLandmark <em>Is Landmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Landmark</em>' attribute.
	 * @see #getIsLandmark()
	 * @generated
	 */
	void setIsLandmark(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(Boolean)
	 * @see UISL.UISLPackage#getViewContainer_IsDefault()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getIsDefault();

	/**
	 * Sets the value of the '{@link UISL.ViewContainer#getIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #getIsDefault()
	 * @generated
	 */
	void setIsDefault(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is XOR</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is XOR</em>' attribute.
	 * @see #setIsXOR(Boolean)
	 * @see UISL.UISLPackage#getViewContainer_IsXOR()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getIsXOR();

	/**
	 * Sets the value of the '{@link UISL.ViewContainer#getIsXOR <em>Is XOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is XOR</em>' attribute.
	 * @see #getIsXOR()
	 * @generated
	 */
	void setIsXOR(Boolean value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.ActionBlock}.
	 * It is bidirectional and its opposite is '{@link UISL.ActionBlock#getViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see UISL.UISLPackage#getViewContainer_Action()
	 * @see UISL.ActionBlock#getViewContainer
	 * @model opposite="viewContainer" containment="true"
	 * @generated
	 */
	EList<ActionBlock> getAction();

} // ViewContainer

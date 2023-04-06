/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.FormComponent#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getFormComponent()
 * @model
 * @generated
 */
public interface FormComponent extends ViewComponent {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' attribute list.
	 * @see UISL.UISLPackage#getFormComponent_Fields()
	 * @model
	 * @generated
	 */
	EList<String> getFields();

} // FormComponent

/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Details Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.DetailsComponent#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getDetailsComponent()
 * @model
 * @generated
 */
public interface DetailsComponent extends ViewComponent {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see UISL.UISLPackage#getDetailsComponent_Options()
	 * @model
	 * @generated
	 */
	EList<String> getOptions();

} // DetailsComponent

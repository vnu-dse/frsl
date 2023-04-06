/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.ListComponent#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getListComponent()
 * @model
 * @generated
 */
public interface ListComponent extends ViewComponent {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.Column}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see UISL.UISLPackage#getListComponent_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

} // ListComponent

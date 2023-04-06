/**
 */
package UISL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UISL.ViewComponent#getViewcomponentpart <em>Viewcomponentpart</em>}</li>
 * </ul>
 *
 * @see UISL.UISLPackage#getViewComponent()
 * @model abstract="true"
 * @generated
 */
public interface ViewComponent extends ViewElement {
	/**
	 * Returns the value of the '<em><b>Viewcomponentpart</b></em>' containment reference list.
	 * The list contents are of type {@link UISL.ViewComponentPart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewcomponentpart</em>' containment reference list.
	 * @see UISL.UISLPackage#getViewComponent_Viewcomponentpart()
	 * @model containment="true"
	 * @generated
	 */
	EList<ViewComponentPart> getViewcomponentpart();

} // ViewComponent

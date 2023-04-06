/**
 */
package UISL.impl;

import UISL.UISLPackage;
import UISL.ViewComponent;
import UISL.ViewComponentPart;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UISL.impl.ViewComponentImpl#getViewcomponentpart <em>Viewcomponentpart</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ViewComponentImpl extends ViewElementImpl implements ViewComponent {
	/**
	 * The cached value of the '{@link #getViewcomponentpart() <em>Viewcomponentpart</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewcomponentpart()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewComponentPart> viewcomponentpart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UISLPackage.Literals.VIEW_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewComponentPart> getViewcomponentpart() {
		if (viewcomponentpart == null) {
			viewcomponentpart = new EObjectContainmentEList<ViewComponentPart>(ViewComponentPart.class, this,
					UISLPackage.VIEW_COMPONENT__VIEWCOMPONENTPART);
		}
		return viewcomponentpart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UISLPackage.VIEW_COMPONENT__VIEWCOMPONENTPART:
			return ((InternalEList<?>) getViewcomponentpart()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UISLPackage.VIEW_COMPONENT__VIEWCOMPONENTPART:
			return getViewcomponentpart();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UISLPackage.VIEW_COMPONENT__VIEWCOMPONENTPART:
			getViewcomponentpart().clear();
			getViewcomponentpart().addAll((Collection<? extends ViewComponentPart>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UISLPackage.VIEW_COMPONENT__VIEWCOMPONENTPART:
			getViewcomponentpart().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UISLPackage.VIEW_COMPONENT__VIEWCOMPONENTPART:
			return viewcomponentpart != null && !viewcomponentpart.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ViewComponentImpl

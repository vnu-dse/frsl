/**
 */
package UISL.impl;

import UISL.UISLPackage;
import UISL.ViewElement;
import UISL.ViewElementEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Element Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UISL.impl.ViewElementEventImpl#getViewelement <em>Viewelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewElementEventImpl extends CatchingEventImpl implements ViewElementEvent {
	/**
	 * The cached value of the '{@link #getViewelement() <em>Viewelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewelement()
	 * @generated
	 * @ordered
	 */
	protected ViewElement viewelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewElementEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UISLPackage.Literals.VIEW_ELEMENT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElement getViewelement() {
		if (viewelement != null && viewelement.eIsProxy()) {
			InternalEObject oldViewelement = (InternalEObject) viewelement;
			viewelement = (ViewElement) eResolveProxy(oldViewelement);
			if (viewelement != oldViewelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UISLPackage.VIEW_ELEMENT_EVENT__VIEWELEMENT, oldViewelement, viewelement));
			}
		}
		return viewelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewElement basicGetViewelement() {
		return viewelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewelement(ViewElement newViewelement) {
		ViewElement oldViewelement = viewelement;
		viewelement = newViewelement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UISLPackage.VIEW_ELEMENT_EVENT__VIEWELEMENT,
					oldViewelement, viewelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UISLPackage.VIEW_ELEMENT_EVENT__VIEWELEMENT:
			if (resolve)
				return getViewelement();
			return basicGetViewelement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UISLPackage.VIEW_ELEMENT_EVENT__VIEWELEMENT:
			setViewelement((ViewElement) newValue);
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
		case UISLPackage.VIEW_ELEMENT_EVENT__VIEWELEMENT:
			setViewelement((ViewElement) null);
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
		case UISLPackage.VIEW_ELEMENT_EVENT__VIEWELEMENT:
			return viewelement != null;
		}
		return super.eIsSet(featureID);
	}

} //ViewElementEventImpl

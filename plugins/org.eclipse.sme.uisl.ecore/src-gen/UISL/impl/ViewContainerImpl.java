/**
 */
package UISL.impl;

import UISL.ActionBlock;
import UISL.UISLPackage;
import UISL.ViewContainer;
import UISL.ViewElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UISL.impl.ViewContainerImpl#getViewElement <em>View Element</em>}</li>
 *   <li>{@link UISL.impl.ViewContainerImpl#getIsLandmark <em>Is Landmark</em>}</li>
 *   <li>{@link UISL.impl.ViewContainerImpl#getIsDefault <em>Is Default</em>}</li>
 *   <li>{@link UISL.impl.ViewContainerImpl#getIsXOR <em>Is XOR</em>}</li>
 *   <li>{@link UISL.impl.ViewContainerImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ViewContainerImpl extends ViewElementImpl implements ViewContainer {
	/**
	 * The cached value of the '{@link #getViewElement() <em>View Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewElement> viewElement;

	/**
	 * The default value of the '{@link #getIsLandmark() <em>Is Landmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLandmark()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LANDMARK_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsLandmark() <em>Is Landmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLandmark()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLandmark = IS_LANDMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DEFAULT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDefault()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsXOR() <em>Is XOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsXOR()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_XOR_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsXOR() <em>Is XOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsXOR()
	 * @generated
	 * @ordered
	 */
	protected Boolean isXOR = IS_XOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionBlock> action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UISLPackage.Literals.VIEW_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewElement> getViewElement() {
		if (viewElement == null) {
			viewElement = new EObjectContainmentWithInverseEList<ViewElement>(ViewElement.class, this,
					UISLPackage.VIEW_CONTAINER__VIEW_ELEMENT, UISLPackage.VIEW_ELEMENT__VIEW_CONTAINER);
		}
		return viewElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLandmark() {
		return isLandmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLandmark(Boolean newIsLandmark) {
		Boolean oldIsLandmark = isLandmark;
		isLandmark = newIsLandmark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UISLPackage.VIEW_CONTAINER__IS_LANDMARK,
					oldIsLandmark, isLandmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefault(Boolean newIsDefault) {
		Boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UISLPackage.VIEW_CONTAINER__IS_DEFAULT, oldIsDefault,
					isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsXOR() {
		return isXOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsXOR(Boolean newIsXOR) {
		Boolean oldIsXOR = isXOR;
		isXOR = newIsXOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UISLPackage.VIEW_CONTAINER__IS_XOR, oldIsXOR, isXOR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionBlock> getAction() {
		if (action == null) {
			action = new EObjectContainmentWithInverseEList<ActionBlock>(ActionBlock.class, this,
					UISLPackage.VIEW_CONTAINER__ACTION, UISLPackage.ACTION_BLOCK__VIEW_CONTAINER);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UISLPackage.VIEW_CONTAINER__VIEW_ELEMENT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getViewElement()).basicAdd(otherEnd, msgs);
		case UISLPackage.VIEW_CONTAINER__ACTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAction()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UISLPackage.VIEW_CONTAINER__VIEW_ELEMENT:
			return ((InternalEList<?>) getViewElement()).basicRemove(otherEnd, msgs);
		case UISLPackage.VIEW_CONTAINER__ACTION:
			return ((InternalEList<?>) getAction()).basicRemove(otherEnd, msgs);
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
		case UISLPackage.VIEW_CONTAINER__VIEW_ELEMENT:
			return getViewElement();
		case UISLPackage.VIEW_CONTAINER__IS_LANDMARK:
			return getIsLandmark();
		case UISLPackage.VIEW_CONTAINER__IS_DEFAULT:
			return getIsDefault();
		case UISLPackage.VIEW_CONTAINER__IS_XOR:
			return getIsXOR();
		case UISLPackage.VIEW_CONTAINER__ACTION:
			return getAction();
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
		case UISLPackage.VIEW_CONTAINER__VIEW_ELEMENT:
			getViewElement().clear();
			getViewElement().addAll((Collection<? extends ViewElement>) newValue);
			return;
		case UISLPackage.VIEW_CONTAINER__IS_LANDMARK:
			setIsLandmark((Boolean) newValue);
			return;
		case UISLPackage.VIEW_CONTAINER__IS_DEFAULT:
			setIsDefault((Boolean) newValue);
			return;
		case UISLPackage.VIEW_CONTAINER__IS_XOR:
			setIsXOR((Boolean) newValue);
			return;
		case UISLPackage.VIEW_CONTAINER__ACTION:
			getAction().clear();
			getAction().addAll((Collection<? extends ActionBlock>) newValue);
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
		case UISLPackage.VIEW_CONTAINER__VIEW_ELEMENT:
			getViewElement().clear();
			return;
		case UISLPackage.VIEW_CONTAINER__IS_LANDMARK:
			setIsLandmark(IS_LANDMARK_EDEFAULT);
			return;
		case UISLPackage.VIEW_CONTAINER__IS_DEFAULT:
			setIsDefault(IS_DEFAULT_EDEFAULT);
			return;
		case UISLPackage.VIEW_CONTAINER__IS_XOR:
			setIsXOR(IS_XOR_EDEFAULT);
			return;
		case UISLPackage.VIEW_CONTAINER__ACTION:
			getAction().clear();
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
		case UISLPackage.VIEW_CONTAINER__VIEW_ELEMENT:
			return viewElement != null && !viewElement.isEmpty();
		case UISLPackage.VIEW_CONTAINER__IS_LANDMARK:
			return IS_LANDMARK_EDEFAULT == null ? isLandmark != null : !IS_LANDMARK_EDEFAULT.equals(isLandmark);
		case UISLPackage.VIEW_CONTAINER__IS_DEFAULT:
			return IS_DEFAULT_EDEFAULT == null ? isDefault != null : !IS_DEFAULT_EDEFAULT.equals(isDefault);
		case UISLPackage.VIEW_CONTAINER__IS_XOR:
			return IS_XOR_EDEFAULT == null ? isXOR != null : !IS_XOR_EDEFAULT.equals(isXOR);
		case UISLPackage.VIEW_CONTAINER__ACTION:
			return action != null && !action.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isLandmark: ");
		result.append(isLandmark);
		result.append(", isDefault: ");
		result.append(isDefault);
		result.append(", isXOR: ");
		result.append(isXOR);
		result.append(')');
		return result.toString();
	}

} //ViewContainerImpl

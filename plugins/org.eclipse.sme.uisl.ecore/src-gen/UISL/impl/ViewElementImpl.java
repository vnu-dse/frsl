/**
 */
package UISL.impl;

import UISL.UISLPackage;
import UISL.ViewContainer;
import UISL.ViewElement;
import UISL.ViewElementEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UISL.impl.ViewElementImpl#getViewElementEvent <em>View Element Event</em>}</li>
 *   <li>{@link UISL.impl.ViewElementImpl#getViewContainer <em>View Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ViewElementImpl extends InteractionFlowElementImpl implements ViewElement {
	/**
	 * The cached value of the '{@link #getViewElementEvent() <em>View Element Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewElementEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewElementEvent> viewElementEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UISLPackage.Literals.VIEW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewElementEvent> getViewElementEvent() {
		if (viewElementEvent == null) {
			viewElementEvent = new EObjectContainmentEList<ViewElementEvent>(ViewElementEvent.class, this,
					UISLPackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENT);
		}
		return viewElementEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContainer getViewContainer() {
		if (eContainerFeatureID() != UISLPackage.VIEW_ELEMENT__VIEW_CONTAINER)
			return null;
		return (ViewContainer) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewContainer(ViewContainer newViewContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newViewContainer, UISLPackage.VIEW_ELEMENT__VIEW_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewContainer(ViewContainer newViewContainer) {
		if (newViewContainer != eInternalContainer()
				|| (eContainerFeatureID() != UISLPackage.VIEW_ELEMENT__VIEW_CONTAINER && newViewContainer != null)) {
			if (EcoreUtil.isAncestor(this, newViewContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newViewContainer != null)
				msgs = ((InternalEObject) newViewContainer).eInverseAdd(this, UISLPackage.VIEW_CONTAINER__VIEW_ELEMENT,
						ViewContainer.class, msgs);
			msgs = basicSetViewContainer(newViewContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UISLPackage.VIEW_ELEMENT__VIEW_CONTAINER,
					newViewContainer, newViewContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UISLPackage.VIEW_ELEMENT__VIEW_CONTAINER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetViewContainer((ViewContainer) otherEnd, msgs);
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
		case UISLPackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENT:
			return ((InternalEList<?>) getViewElementEvent()).basicRemove(otherEnd, msgs);
		case UISLPackage.VIEW_ELEMENT__VIEW_CONTAINER:
			return basicSetViewContainer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case UISLPackage.VIEW_ELEMENT__VIEW_CONTAINER:
			return eInternalContainer().eInverseRemove(this, UISLPackage.VIEW_CONTAINER__VIEW_ELEMENT,
					ViewContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UISLPackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENT:
			return getViewElementEvent();
		case UISLPackage.VIEW_ELEMENT__VIEW_CONTAINER:
			return getViewContainer();
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
		case UISLPackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENT:
			getViewElementEvent().clear();
			getViewElementEvent().addAll((Collection<? extends ViewElementEvent>) newValue);
			return;
		case UISLPackage.VIEW_ELEMENT__VIEW_CONTAINER:
			setViewContainer((ViewContainer) newValue);
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
		case UISLPackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENT:
			getViewElementEvent().clear();
			return;
		case UISLPackage.VIEW_ELEMENT__VIEW_CONTAINER:
			setViewContainer((ViewContainer) null);
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
		case UISLPackage.VIEW_ELEMENT__VIEW_ELEMENT_EVENT:
			return viewElementEvent != null && !viewElementEvent.isEmpty();
		case UISLPackage.VIEW_ELEMENT__VIEW_CONTAINER:
			return getViewContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //ViewElementImpl

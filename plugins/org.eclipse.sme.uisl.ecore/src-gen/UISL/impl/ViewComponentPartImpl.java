/**
 */
package UISL.impl;

import UISL.UISLPackage;
import UISL.ViewComponentPart;
import UISL.ViewElementEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>View Component Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UISL.impl.ViewComponentPartImpl#getSubviewcomponentpart <em>Subviewcomponentpart</em>}</li>
 *   <li>{@link UISL.impl.ViewComponentPartImpl#getViewElementEvent <em>View Element Event</em>}</li>
 *   <li>{@link UISL.impl.ViewComponentPartImpl#getParentViewComponentPart <em>Parent View Component Part</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ViewComponentPartImpl extends InteractionFlowElementImpl implements ViewComponentPart {
	/**
	 * The cached value of the '{@link #getSubviewcomponentpart() <em>Subviewcomponentpart</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubviewcomponentpart()
	 * @generated
	 * @ordered
	 */
	protected EList<ViewComponentPart> subviewcomponentpart;

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
	protected ViewComponentPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UISLPackage.Literals.VIEW_COMPONENT_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewComponentPart> getSubviewcomponentpart() {
		if (subviewcomponentpart == null) {
			subviewcomponentpart = new EObjectContainmentWithInverseEList<ViewComponentPart>(ViewComponentPart.class,
					this, UISLPackage.VIEW_COMPONENT_PART__SUBVIEWCOMPONENTPART,
					UISLPackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART);
		}
		return subviewcomponentpart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ViewElementEvent> getViewElementEvent() {
		if (viewElementEvent == null) {
			viewElementEvent = new EObjectContainmentEList<ViewElementEvent>(ViewElementEvent.class, this,
					UISLPackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENT);
		}
		return viewElementEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewComponentPart getParentViewComponentPart() {
		if (eContainerFeatureID() != UISLPackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART)
			return null;
		return (ViewComponentPart) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentViewComponentPart(ViewComponentPart newParentViewComponentPart,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newParentViewComponentPart,
				UISLPackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentViewComponentPart(ViewComponentPart newParentViewComponentPart) {
		if (newParentViewComponentPart != eInternalContainer()
				|| (eContainerFeatureID() != UISLPackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART
						&& newParentViewComponentPart != null)) {
			if (EcoreUtil.isAncestor(this, newParentViewComponentPart))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParentViewComponentPart != null)
				msgs = ((InternalEObject) newParentViewComponentPart).eInverseAdd(this,
						UISLPackage.VIEW_COMPONENT_PART__SUBVIEWCOMPONENTPART, ViewComponentPart.class, msgs);
			msgs = basicSetParentViewComponentPart(newParentViewComponentPart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UISLPackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART, newParentViewComponentPart,
					newParentViewComponentPart));
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
		case UISLPackage.VIEW_COMPONENT_PART__SUBVIEWCOMPONENTPART:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getSubviewcomponentpart()).basicAdd(otherEnd,
					msgs);
		case UISLPackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetParentViewComponentPart((ViewComponentPart) otherEnd, msgs);
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
		case UISLPackage.VIEW_COMPONENT_PART__SUBVIEWCOMPONENTPART:
			return ((InternalEList<?>) getSubviewcomponentpart()).basicRemove(otherEnd, msgs);
		case UISLPackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENT:
			return ((InternalEList<?>) getViewElementEvent()).basicRemove(otherEnd, msgs);
		case UISLPackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART:
			return basicSetParentViewComponentPart(null, msgs);
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
		case UISLPackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART:
			return eInternalContainer().eInverseRemove(this, UISLPackage.VIEW_COMPONENT_PART__SUBVIEWCOMPONENTPART,
					ViewComponentPart.class, msgs);
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
		case UISLPackage.VIEW_COMPONENT_PART__SUBVIEWCOMPONENTPART:
			return getSubviewcomponentpart();
		case UISLPackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENT:
			return getViewElementEvent();
		case UISLPackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART:
			return getParentViewComponentPart();
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
		case UISLPackage.VIEW_COMPONENT_PART__SUBVIEWCOMPONENTPART:
			getSubviewcomponentpart().clear();
			getSubviewcomponentpart().addAll((Collection<? extends ViewComponentPart>) newValue);
			return;
		case UISLPackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENT:
			getViewElementEvent().clear();
			getViewElementEvent().addAll((Collection<? extends ViewElementEvent>) newValue);
			return;
		case UISLPackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART:
			setParentViewComponentPart((ViewComponentPart) newValue);
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
		case UISLPackage.VIEW_COMPONENT_PART__SUBVIEWCOMPONENTPART:
			getSubviewcomponentpart().clear();
			return;
		case UISLPackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENT:
			getViewElementEvent().clear();
			return;
		case UISLPackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART:
			setParentViewComponentPart((ViewComponentPart) null);
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
		case UISLPackage.VIEW_COMPONENT_PART__SUBVIEWCOMPONENTPART:
			return subviewcomponentpart != null && !subviewcomponentpart.isEmpty();
		case UISLPackage.VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENT:
			return viewElementEvent != null && !viewElementEvent.isEmpty();
		case UISLPackage.VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART:
			return getParentViewComponentPart() != null;
		}
		return super.eIsSet(featureID);
	}

} //ViewComponentPartImpl

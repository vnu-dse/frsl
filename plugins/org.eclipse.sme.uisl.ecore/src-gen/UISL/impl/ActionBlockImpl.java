/**
 */
package UISL.impl;

import UISL.ActionBlock;
import UISL.ActionEvent;
import UISL.UISLPackage;
import UISL.ViewContainer;

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
 * An implementation of the model object '<em><b>Action Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UISL.impl.ActionBlockImpl#getActionEvent <em>Action Event</em>}</li>
 *   <li>{@link UISL.impl.ActionBlockImpl#getViewContainer <em>View Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionBlockImpl extends InteractionFlowElementImpl implements ActionBlock {
	/**
	 * The cached value of the '{@link #getActionEvent() <em>Action Event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionEvent> actionEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UISLPackage.Literals.ACTION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionEvent> getActionEvent() {
		if (actionEvent == null) {
			actionEvent = new EObjectContainmentEList<ActionEvent>(ActionEvent.class, this,
					UISLPackage.ACTION_BLOCK__ACTION_EVENT);
		}
		return actionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewContainer getViewContainer() {
		if (eContainerFeatureID() != UISLPackage.ACTION_BLOCK__VIEW_CONTAINER)
			return null;
		return (ViewContainer) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetViewContainer(ViewContainer newViewContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newViewContainer, UISLPackage.ACTION_BLOCK__VIEW_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewContainer(ViewContainer newViewContainer) {
		if (newViewContainer != eInternalContainer()
				|| (eContainerFeatureID() != UISLPackage.ACTION_BLOCK__VIEW_CONTAINER && newViewContainer != null)) {
			if (EcoreUtil.isAncestor(this, newViewContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newViewContainer != null)
				msgs = ((InternalEObject) newViewContainer).eInverseAdd(this, UISLPackage.VIEW_CONTAINER__ACTION,
						ViewContainer.class, msgs);
			msgs = basicSetViewContainer(newViewContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UISLPackage.ACTION_BLOCK__VIEW_CONTAINER,
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
		case UISLPackage.ACTION_BLOCK__VIEW_CONTAINER:
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
		case UISLPackage.ACTION_BLOCK__ACTION_EVENT:
			return ((InternalEList<?>) getActionEvent()).basicRemove(otherEnd, msgs);
		case UISLPackage.ACTION_BLOCK__VIEW_CONTAINER:
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
		case UISLPackage.ACTION_BLOCK__VIEW_CONTAINER:
			return eInternalContainer().eInverseRemove(this, UISLPackage.VIEW_CONTAINER__ACTION, ViewContainer.class,
					msgs);
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
		case UISLPackage.ACTION_BLOCK__ACTION_EVENT:
			return getActionEvent();
		case UISLPackage.ACTION_BLOCK__VIEW_CONTAINER:
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
		case UISLPackage.ACTION_BLOCK__ACTION_EVENT:
			getActionEvent().clear();
			getActionEvent().addAll((Collection<? extends ActionEvent>) newValue);
			return;
		case UISLPackage.ACTION_BLOCK__VIEW_CONTAINER:
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
		case UISLPackage.ACTION_BLOCK__ACTION_EVENT:
			getActionEvent().clear();
			return;
		case UISLPackage.ACTION_BLOCK__VIEW_CONTAINER:
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
		case UISLPackage.ACTION_BLOCK__ACTION_EVENT:
			return actionEvent != null && !actionEvent.isEmpty();
		case UISLPackage.ACTION_BLOCK__VIEW_CONTAINER:
			return getViewContainer() != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionBlockImpl

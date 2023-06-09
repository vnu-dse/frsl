/**
 * generated by Xtext 2.25.0
 */
package org.eclipse.sme.frsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sme.frsl.FrslPackage;
import org.eclipse.sme.frsl.Include;
import org.eclipse.sme.frsl.Usecase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frsl.impl.IncludeImpl#getIncludingUC <em>Including UC</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.impl.IncludeImpl#getAddition <em>Addition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeImpl extends MinimalEObjectImpl.Container implements Include {
	/**
	 * The cached value of the '{@link #getAddition() <em>Addition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddition()
	 * @generated
	 * @ordered
	 */
	protected Usecase addition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrslPackage.Literals.INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usecase getIncludingUC() {
		if (eContainerFeatureID() != FrslPackage.INCLUDE__INCLUDING_UC)
			return null;
		return (Usecase) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludingUC(Usecase newIncludingUC, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newIncludingUC, FrslPackage.INCLUDE__INCLUDING_UC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncludingUC(Usecase newIncludingUC) {
		if (newIncludingUC != eInternalContainer()
				|| (eContainerFeatureID() != FrslPackage.INCLUDE__INCLUDING_UC && newIncludingUC != null)) {
			if (EcoreUtil.isAncestor(this, newIncludingUC))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIncludingUC != null)
				msgs = ((InternalEObject) newIncludingUC).eInverseAdd(this, FrslPackage.USECASE__INCLUDE, Usecase.class,
						msgs);
			msgs = basicSetIncludingUC(newIncludingUC, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrslPackage.INCLUDE__INCLUDING_UC, newIncludingUC,
					newIncludingUC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usecase getAddition() {
		if (addition != null && addition.eIsProxy()) {
			InternalEObject oldAddition = (InternalEObject) addition;
			addition = (Usecase) eResolveProxy(oldAddition);
			if (addition != oldAddition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FrslPackage.INCLUDE__ADDITION,
							oldAddition, addition));
			}
		}
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usecase basicGetAddition() {
		return addition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAddition(Usecase newAddition) {
		Usecase oldAddition = addition;
		addition = newAddition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrslPackage.INCLUDE__ADDITION, oldAddition,
					addition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrslPackage.INCLUDE__INCLUDING_UC:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetIncludingUC((Usecase) otherEnd, msgs);
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
		case FrslPackage.INCLUDE__INCLUDING_UC:
			return basicSetIncludingUC(null, msgs);
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
		case FrslPackage.INCLUDE__INCLUDING_UC:
			return eInternalContainer().eInverseRemove(this, FrslPackage.USECASE__INCLUDE, Usecase.class, msgs);
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
		case FrslPackage.INCLUDE__INCLUDING_UC:
			return getIncludingUC();
		case FrslPackage.INCLUDE__ADDITION:
			if (resolve)
				return getAddition();
			return basicGetAddition();
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
		case FrslPackage.INCLUDE__INCLUDING_UC:
			setIncludingUC((Usecase) newValue);
			return;
		case FrslPackage.INCLUDE__ADDITION:
			setAddition((Usecase) newValue);
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
		case FrslPackage.INCLUDE__INCLUDING_UC:
			setIncludingUC((Usecase) null);
			return;
		case FrslPackage.INCLUDE__ADDITION:
			setAddition((Usecase) null);
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
		case FrslPackage.INCLUDE__INCLUDING_UC:
			return getIncludingUC() != null;
		case FrslPackage.INCLUDE__ADDITION:
			return addition != null;
		}
		return super.eIsSet(featureID);
	}

} //IncludeImpl

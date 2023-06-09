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
import org.eclipse.sme.frsl.FrslPackage;
import org.eclipse.sme.frsl.SnapshotPattern;
import org.eclipse.sme.frsl.UsecasePrecondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usecase Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frsl.impl.UsecasePreconditionImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.impl.UsecasePreconditionImpl#getSnapshot <em>Snapshot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsecasePreconditionImpl extends MinimalEObjectImpl.Container implements UsecasePrecondition {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSnapshot() <em>Snapshot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSnapshot()
	 * @generated
	 * @ordered
	 */
	protected SnapshotPattern snapshot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsecasePreconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrslPackage.Literals.USECASE_PRECONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrslPackage.USECASE_PRECONDITION__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnapshotPattern getSnapshot() {
		return snapshot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSnapshot(SnapshotPattern newSnapshot, NotificationChain msgs) {
		SnapshotPattern oldSnapshot = snapshot;
		snapshot = newSnapshot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FrslPackage.USECASE_PRECONDITION__SNAPSHOT, oldSnapshot, newSnapshot);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSnapshot(SnapshotPattern newSnapshot) {
		if (newSnapshot != snapshot) {
			NotificationChain msgs = null;
			if (snapshot != null)
				msgs = ((InternalEObject) snapshot).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FrslPackage.USECASE_PRECONDITION__SNAPSHOT, null, msgs);
			if (newSnapshot != null)
				msgs = ((InternalEObject) newSnapshot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FrslPackage.USECASE_PRECONDITION__SNAPSHOT, null, msgs);
			msgs = basicSetSnapshot(newSnapshot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrslPackage.USECASE_PRECONDITION__SNAPSHOT,
					newSnapshot, newSnapshot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrslPackage.USECASE_PRECONDITION__SNAPSHOT:
			return basicSetSnapshot(null, msgs);
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
		case FrslPackage.USECASE_PRECONDITION__DESCRIPTION:
			return getDescription();
		case FrslPackage.USECASE_PRECONDITION__SNAPSHOT:
			return getSnapshot();
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
		case FrslPackage.USECASE_PRECONDITION__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case FrslPackage.USECASE_PRECONDITION__SNAPSHOT:
			setSnapshot((SnapshotPattern) newValue);
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
		case FrslPackage.USECASE_PRECONDITION__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case FrslPackage.USECASE_PRECONDITION__SNAPSHOT:
			setSnapshot((SnapshotPattern) null);
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
		case FrslPackage.USECASE_PRECONDITION__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case FrslPackage.USECASE_PRECONDITION__SNAPSHOT:
			return snapshot != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //UsecasePreconditionImpl

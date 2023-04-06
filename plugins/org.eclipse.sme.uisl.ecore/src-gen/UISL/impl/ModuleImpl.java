/**
 */
package UISL.impl;

import UISL.ModuleDefinition;
import UISL.Port;
import UISL.UISLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UISL.impl.ModuleImpl#getModuledefinition <em>Moduledefinition</em>}</li>
 *   <li>{@link UISL.impl.ModuleImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleImpl extends InteractionFlowElementImpl implements UISL.Module {
	/**
	 * The cached value of the '{@link #getModuledefinition() <em>Moduledefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuledefinition()
	 * @generated
	 * @ordered
	 */
	protected ModuleDefinition moduledefinition;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UISLPackage.Literals.MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinition getModuledefinition() {
		if (moduledefinition != null && moduledefinition.eIsProxy()) {
			InternalEObject oldModuledefinition = (InternalEObject) moduledefinition;
			moduledefinition = (ModuleDefinition) eResolveProxy(oldModuledefinition);
			if (moduledefinition != oldModuledefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UISLPackage.MODULE__MODULEDEFINITION,
							oldModuledefinition, moduledefinition));
			}
		}
		return moduledefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleDefinition basicGetModuledefinition() {
		return moduledefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuledefinition(ModuleDefinition newModuledefinition, NotificationChain msgs) {
		ModuleDefinition oldModuledefinition = moduledefinition;
		moduledefinition = newModuledefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UISLPackage.MODULE__MODULEDEFINITION, oldModuledefinition, newModuledefinition);
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
	public void setModuledefinition(ModuleDefinition newModuledefinition) {
		if (newModuledefinition != moduledefinition) {
			NotificationChain msgs = null;
			if (moduledefinition != null)
				msgs = ((InternalEObject) moduledefinition).eInverseRemove(this, UISLPackage.MODULE_DEFINITION__MODULE,
						ModuleDefinition.class, msgs);
			if (newModuledefinition != null)
				msgs = ((InternalEObject) newModuledefinition).eInverseAdd(this, UISLPackage.MODULE_DEFINITION__MODULE,
						ModuleDefinition.class, msgs);
			msgs = basicSetModuledefinition(newModuledefinition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UISLPackage.MODULE__MODULEDEFINITION,
					newModuledefinition, newModuledefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectWithInverseResolvingEList<Port>(Port.class, this, UISLPackage.MODULE__PORT,
					UISLPackage.PORT__MODULE);
		}
		return port;
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
		case UISLPackage.MODULE__MODULEDEFINITION:
			if (moduledefinition != null)
				msgs = ((InternalEObject) moduledefinition).eInverseRemove(this, UISLPackage.MODULE_DEFINITION__MODULE,
						ModuleDefinition.class, msgs);
			return basicSetModuledefinition((ModuleDefinition) otherEnd, msgs);
		case UISLPackage.MODULE__PORT:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPort()).basicAdd(otherEnd, msgs);
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
		case UISLPackage.MODULE__MODULEDEFINITION:
			return basicSetModuledefinition(null, msgs);
		case UISLPackage.MODULE__PORT:
			return ((InternalEList<?>) getPort()).basicRemove(otherEnd, msgs);
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
		case UISLPackage.MODULE__MODULEDEFINITION:
			if (resolve)
				return getModuledefinition();
			return basicGetModuledefinition();
		case UISLPackage.MODULE__PORT:
			return getPort();
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
		case UISLPackage.MODULE__MODULEDEFINITION:
			setModuledefinition((ModuleDefinition) newValue);
			return;
		case UISLPackage.MODULE__PORT:
			getPort().clear();
			getPort().addAll((Collection<? extends Port>) newValue);
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
		case UISLPackage.MODULE__MODULEDEFINITION:
			setModuledefinition((ModuleDefinition) null);
			return;
		case UISLPackage.MODULE__PORT:
			getPort().clear();
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
		case UISLPackage.MODULE__MODULEDEFINITION:
			return moduledefinition != null;
		case UISLPackage.MODULE__PORT:
			return port != null && !port.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleImpl

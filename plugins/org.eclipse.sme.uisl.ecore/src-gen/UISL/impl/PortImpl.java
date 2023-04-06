/**
 */
package UISL.impl;

import UISL.Port;
import UISL.PortDefinition;
import UISL.UISLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UISL.impl.PortImpl#getModule <em>Module</em>}</li>
 *   <li>{@link UISL.impl.PortImpl#getPortDefinition <em>Port Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends InteractionFlowElementImpl implements Port {
	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected UISL.Module module;

	/**
	 * The cached value of the '{@link #getPortDefinition() <em>Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortDefinition()
	 * @generated
	 * @ordered
	 */
	protected PortDefinition portDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UISLPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISL.Module getModule() {
		if (module != null && module.eIsProxy()) {
			InternalEObject oldModule = (InternalEObject) module;
			module = (UISL.Module) eResolveProxy(oldModule);
			if (module != oldModule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UISLPackage.PORT__MODULE, oldModule,
							module));
			}
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UISL.Module basicGetModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(UISL.Module newModule, NotificationChain msgs) {
		UISL.Module oldModule = module;
		module = newModule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UISLPackage.PORT__MODULE,
					oldModule, newModule);
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
	public void setModule(UISL.Module newModule) {
		if (newModule != module) {
			NotificationChain msgs = null;
			if (module != null)
				msgs = ((InternalEObject) module).eInverseRemove(this, UISLPackage.MODULE__PORT, UISL.Module.class,
						msgs);
			if (newModule != null)
				msgs = ((InternalEObject) newModule).eInverseAdd(this, UISLPackage.MODULE__PORT, UISL.Module.class,
						msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UISLPackage.PORT__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDefinition getPortDefinition() {
		if (portDefinition != null && portDefinition.eIsProxy()) {
			InternalEObject oldPortDefinition = (InternalEObject) portDefinition;
			portDefinition = (PortDefinition) eResolveProxy(oldPortDefinition);
			if (portDefinition != oldPortDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UISLPackage.PORT__PORT_DEFINITION,
							oldPortDefinition, portDefinition));
			}
		}
		return portDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDefinition basicGetPortDefinition() {
		return portDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortDefinition(PortDefinition newPortDefinition, NotificationChain msgs) {
		PortDefinition oldPortDefinition = portDefinition;
		portDefinition = newPortDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					UISLPackage.PORT__PORT_DEFINITION, oldPortDefinition, newPortDefinition);
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
	public void setPortDefinition(PortDefinition newPortDefinition) {
		if (newPortDefinition != portDefinition) {
			NotificationChain msgs = null;
			if (portDefinition != null)
				msgs = ((InternalEObject) portDefinition).eInverseRemove(this, UISLPackage.PORT_DEFINITION__PORT,
						PortDefinition.class, msgs);
			if (newPortDefinition != null)
				msgs = ((InternalEObject) newPortDefinition).eInverseAdd(this, UISLPackage.PORT_DEFINITION__PORT,
						PortDefinition.class, msgs);
			msgs = basicSetPortDefinition(newPortDefinition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UISLPackage.PORT__PORT_DEFINITION, newPortDefinition,
					newPortDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UISLPackage.PORT__MODULE:
			if (module != null)
				msgs = ((InternalEObject) module).eInverseRemove(this, UISLPackage.MODULE__PORT, UISL.Module.class,
						msgs);
			return basicSetModule((UISL.Module) otherEnd, msgs);
		case UISLPackage.PORT__PORT_DEFINITION:
			if (portDefinition != null)
				msgs = ((InternalEObject) portDefinition).eInverseRemove(this, UISLPackage.PORT_DEFINITION__PORT,
						PortDefinition.class, msgs);
			return basicSetPortDefinition((PortDefinition) otherEnd, msgs);
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
		case UISLPackage.PORT__MODULE:
			return basicSetModule(null, msgs);
		case UISLPackage.PORT__PORT_DEFINITION:
			return basicSetPortDefinition(null, msgs);
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
		case UISLPackage.PORT__MODULE:
			if (resolve)
				return getModule();
			return basicGetModule();
		case UISLPackage.PORT__PORT_DEFINITION:
			if (resolve)
				return getPortDefinition();
			return basicGetPortDefinition();
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
		case UISLPackage.PORT__MODULE:
			setModule((UISL.Module) newValue);
			return;
		case UISLPackage.PORT__PORT_DEFINITION:
			setPortDefinition((PortDefinition) newValue);
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
		case UISLPackage.PORT__MODULE:
			setModule((UISL.Module) null);
			return;
		case UISLPackage.PORT__PORT_DEFINITION:
			setPortDefinition((PortDefinition) null);
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
		case UISLPackage.PORT__MODULE:
			return module != null;
		case UISLPackage.PORT__PORT_DEFINITION:
			return portDefinition != null;
		}
		return super.eIsSet(featureID);
	}

} //PortImpl

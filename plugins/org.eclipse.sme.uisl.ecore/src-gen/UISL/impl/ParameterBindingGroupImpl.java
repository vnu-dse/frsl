/**
 */
package UISL.impl;

import UISL.ParameterBinding;
import UISL.ParameterBindingGroup;
import UISL.UISLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Binding Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UISL.impl.ParameterBindingGroupImpl#getParameterbindings <em>Parameterbindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterBindingGroupImpl extends InteractionFlowModelElementImpl implements ParameterBindingGroup {
	/**
	 * The cached value of the '{@link #getParameterbindings() <em>Parameterbindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterbindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> parameterbindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBindingGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UISLPackage.Literals.PARAMETER_BINDING_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBinding> getParameterbindings() {
		if (parameterbindings == null) {
			parameterbindings = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this,
					UISLPackage.PARAMETER_BINDING_GROUP__PARAMETERBINDINGS);
		}
		return parameterbindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UISLPackage.PARAMETER_BINDING_GROUP__PARAMETERBINDINGS:
			return ((InternalEList<?>) getParameterbindings()).basicRemove(otherEnd, msgs);
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
		case UISLPackage.PARAMETER_BINDING_GROUP__PARAMETERBINDINGS:
			return getParameterbindings();
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
		case UISLPackage.PARAMETER_BINDING_GROUP__PARAMETERBINDINGS:
			getParameterbindings().clear();
			getParameterbindings().addAll((Collection<? extends ParameterBinding>) newValue);
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
		case UISLPackage.PARAMETER_BINDING_GROUP__PARAMETERBINDINGS:
			getParameterbindings().clear();
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
		case UISLPackage.PARAMETER_BINDING_GROUP__PARAMETERBINDINGS:
			return parameterbindings != null && !parameterbindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ParameterBindingGroupImpl

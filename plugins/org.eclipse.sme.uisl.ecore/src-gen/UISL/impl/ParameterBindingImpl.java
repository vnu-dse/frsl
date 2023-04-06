/**
 */
package UISL.impl;

import UISL.ParameterBinding;
import UISL.ParameterBlock;
import UISL.UISLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UISL.impl.ParameterBindingImpl#getSourceParameter <em>Source Parameter</em>}</li>
 *   <li>{@link UISL.impl.ParameterBindingImpl#getTargetParameter <em>Target Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterBindingImpl extends InteractionFlowModelElementImpl implements ParameterBinding {
	/**
	 * The cached value of the '{@link #getSourceParameter() <em>Source Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceParameter()
	 * @generated
	 * @ordered
	 */
	protected ParameterBlock sourceParameter;

	/**
	 * The cached value of the '{@link #getTargetParameter() <em>Target Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetParameter()
	 * @generated
	 * @ordered
	 */
	protected ParameterBlock targetParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UISLPackage.Literals.PARAMETER_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBlock getSourceParameter() {
		if (sourceParameter != null && sourceParameter.eIsProxy()) {
			InternalEObject oldSourceParameter = (InternalEObject) sourceParameter;
			sourceParameter = (ParameterBlock) eResolveProxy(oldSourceParameter);
			if (sourceParameter != oldSourceParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UISLPackage.PARAMETER_BINDING__SOURCE_PARAMETER, oldSourceParameter, sourceParameter));
			}
		}
		return sourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBlock basicGetSourceParameter() {
		return sourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceParameter(ParameterBlock newSourceParameter) {
		ParameterBlock oldSourceParameter = sourceParameter;
		sourceParameter = newSourceParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UISLPackage.PARAMETER_BINDING__SOURCE_PARAMETER,
					oldSourceParameter, sourceParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBlock getTargetParameter() {
		if (targetParameter != null && targetParameter.eIsProxy()) {
			InternalEObject oldTargetParameter = (InternalEObject) targetParameter;
			targetParameter = (ParameterBlock) eResolveProxy(oldTargetParameter);
			if (targetParameter != oldTargetParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UISLPackage.PARAMETER_BINDING__TARGET_PARAMETER, oldTargetParameter, targetParameter));
			}
		}
		return targetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBlock basicGetTargetParameter() {
		return targetParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetParameter(ParameterBlock newTargetParameter) {
		ParameterBlock oldTargetParameter = targetParameter;
		targetParameter = newTargetParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UISLPackage.PARAMETER_BINDING__TARGET_PARAMETER,
					oldTargetParameter, targetParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UISLPackage.PARAMETER_BINDING__SOURCE_PARAMETER:
			if (resolve)
				return getSourceParameter();
			return basicGetSourceParameter();
		case UISLPackage.PARAMETER_BINDING__TARGET_PARAMETER:
			if (resolve)
				return getTargetParameter();
			return basicGetTargetParameter();
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
		case UISLPackage.PARAMETER_BINDING__SOURCE_PARAMETER:
			setSourceParameter((ParameterBlock) newValue);
			return;
		case UISLPackage.PARAMETER_BINDING__TARGET_PARAMETER:
			setTargetParameter((ParameterBlock) newValue);
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
		case UISLPackage.PARAMETER_BINDING__SOURCE_PARAMETER:
			setSourceParameter((ParameterBlock) null);
			return;
		case UISLPackage.PARAMETER_BINDING__TARGET_PARAMETER:
			setTargetParameter((ParameterBlock) null);
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
		case UISLPackage.PARAMETER_BINDING__SOURCE_PARAMETER:
			return sourceParameter != null;
		case UISLPackage.PARAMETER_BINDING__TARGET_PARAMETER:
			return targetParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ParameterBindingImpl

/**
 */
package UISL.impl;

import UISL.InteractionFlowBlock;
import UISL.InteractionFlowElement;
import UISL.ParameterBlock;
import UISL.UISLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UISL.impl.InteractionFlowElementImpl#getInInteractionFlowBlock <em>In Interaction Flow Block</em>}</li>
 *   <li>{@link UISL.impl.InteractionFlowElementImpl#getPararameters <em>Pararameters</em>}</li>
 *   <li>{@link UISL.impl.InteractionFlowElementImpl#getOutInteractionFlows <em>Out Interaction Flows</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InteractionFlowElementImpl extends InteractionFlowModelElementImpl
		implements InteractionFlowElement {
	/**
	 * The cached value of the '{@link #getInInteractionFlowBlock() <em>In Interaction Flow Block</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInInteractionFlowBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFlowBlock> inInteractionFlowBlock;

	/**
	 * The cached value of the '{@link #getPararameters() <em>Pararameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPararameters()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBlock> pararameters;

	/**
	 * The cached value of the '{@link #getOutInteractionFlows() <em>Out Interaction Flows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutInteractionFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFlowBlock> outInteractionFlows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionFlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UISLPackage.Literals.INTERACTION_FLOW_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFlowBlock> getInInteractionFlowBlock() {
		if (inInteractionFlowBlock == null) {
			inInteractionFlowBlock = new EObjectWithInverseResolvingEList<InteractionFlowBlock>(
					InteractionFlowBlock.class, this, UISLPackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK,
					UISLPackage.INTERACTION_FLOW_BLOCK__TARGET_INTERACTION_FLOW_ELEMENT);
		}
		return inInteractionFlowBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBlock> getPararameters() {
		if (pararameters == null) {
			pararameters = new EObjectContainmentEList<ParameterBlock>(ParameterBlock.class, this,
					UISLPackage.INTERACTION_FLOW_ELEMENT__PARARAMETERS);
		}
		return pararameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFlowBlock> getOutInteractionFlows() {
		if (outInteractionFlows == null) {
			outInteractionFlows = new EObjectContainmentWithInverseEList<InteractionFlowBlock>(
					InteractionFlowBlock.class, this, UISLPackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS,
					UISLPackage.INTERACTION_FLOW_BLOCK__SOURCE_INTERACTION_FLOW_ELEMENT);
		}
		return outInteractionFlows;
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
		case UISLPackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInInteractionFlowBlock()).basicAdd(otherEnd,
					msgs);
		case UISLPackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutInteractionFlows()).basicAdd(otherEnd,
					msgs);
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
		case UISLPackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK:
			return ((InternalEList<?>) getInInteractionFlowBlock()).basicRemove(otherEnd, msgs);
		case UISLPackage.INTERACTION_FLOW_ELEMENT__PARARAMETERS:
			return ((InternalEList<?>) getPararameters()).basicRemove(otherEnd, msgs);
		case UISLPackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
			return ((InternalEList<?>) getOutInteractionFlows()).basicRemove(otherEnd, msgs);
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
		case UISLPackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK:
			return getInInteractionFlowBlock();
		case UISLPackage.INTERACTION_FLOW_ELEMENT__PARARAMETERS:
			return getPararameters();
		case UISLPackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
			return getOutInteractionFlows();
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
		case UISLPackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK:
			getInInteractionFlowBlock().clear();
			getInInteractionFlowBlock().addAll((Collection<? extends InteractionFlowBlock>) newValue);
			return;
		case UISLPackage.INTERACTION_FLOW_ELEMENT__PARARAMETERS:
			getPararameters().clear();
			getPararameters().addAll((Collection<? extends ParameterBlock>) newValue);
			return;
		case UISLPackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
			getOutInteractionFlows().clear();
			getOutInteractionFlows().addAll((Collection<? extends InteractionFlowBlock>) newValue);
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
		case UISLPackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK:
			getInInteractionFlowBlock().clear();
			return;
		case UISLPackage.INTERACTION_FLOW_ELEMENT__PARARAMETERS:
			getPararameters().clear();
			return;
		case UISLPackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
			getOutInteractionFlows().clear();
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
		case UISLPackage.INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK:
			return inInteractionFlowBlock != null && !inInteractionFlowBlock.isEmpty();
		case UISLPackage.INTERACTION_FLOW_ELEMENT__PARARAMETERS:
			return pararameters != null && !pararameters.isEmpty();
		case UISLPackage.INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS:
			return outInteractionFlows != null && !outInteractionFlows.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InteractionFlowElementImpl

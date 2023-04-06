/**
 */
package UISL.impl;

import UISL.InteractionFlowModelElement;
import UISL.ModuleDefinition;
import UISL.PortDefinition;
import UISL.UISLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UISL.impl.ModuleDefinitionImpl#getInteractionFlowModelElement <em>Interaction Flow Model Element</em>}</li>
 *   <li>{@link UISL.impl.ModuleDefinitionImpl#getModule <em>Module</em>}</li>
 *   <li>{@link UISL.impl.ModuleDefinitionImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link UISL.impl.ModuleDefinitionImpl#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleDefinitionImpl extends InteractionFlowModelElementImpl implements ModuleDefinition {
	/**
	 * The cached value of the '{@link #getInteractionFlowModelElement() <em>Interaction Flow Model Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionFlowModelElement()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionFlowModelElement> interactionFlowModelElement;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected EList<UISL.Module> module;

	/**
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected EList<PortDefinition> inputPort;

	/**
	 * The cached value of the '{@link #getOutputPort() <em>Output Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPort()
	 * @generated
	 * @ordered
	 */
	protected EList<PortDefinition> outputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UISLPackage.Literals.MODULE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionFlowModelElement> getInteractionFlowModelElement() {
		if (interactionFlowModelElement == null) {
			interactionFlowModelElement = new EObjectContainmentEList<InteractionFlowModelElement>(
					InteractionFlowModelElement.class, this,
					UISLPackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT);
		}
		return interactionFlowModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UISL.Module> getModule() {
		if (module == null) {
			module = new EObjectWithInverseResolvingEList<UISL.Module>(UISL.Module.class, this,
					UISLPackage.MODULE_DEFINITION__MODULE, UISLPackage.MODULE__MODULEDEFINITION);
		}
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortDefinition> getInputPort() {
		if (inputPort == null) {
			inputPort = new EObjectContainmentEList<PortDefinition>(PortDefinition.class, this,
					UISLPackage.MODULE_DEFINITION__INPUT_PORT);
		}
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortDefinition> getOutputPort() {
		if (outputPort == null) {
			outputPort = new EObjectContainmentEList<PortDefinition>(PortDefinition.class, this,
					UISLPackage.MODULE_DEFINITION__OUTPUT_PORT);
		}
		return outputPort;
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
		case UISLPackage.MODULE_DEFINITION__MODULE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getModule()).basicAdd(otherEnd, msgs);
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
		case UISLPackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT:
			return ((InternalEList<?>) getInteractionFlowModelElement()).basicRemove(otherEnd, msgs);
		case UISLPackage.MODULE_DEFINITION__MODULE:
			return ((InternalEList<?>) getModule()).basicRemove(otherEnd, msgs);
		case UISLPackage.MODULE_DEFINITION__INPUT_PORT:
			return ((InternalEList<?>) getInputPort()).basicRemove(otherEnd, msgs);
		case UISLPackage.MODULE_DEFINITION__OUTPUT_PORT:
			return ((InternalEList<?>) getOutputPort()).basicRemove(otherEnd, msgs);
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
		case UISLPackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT:
			return getInteractionFlowModelElement();
		case UISLPackage.MODULE_DEFINITION__MODULE:
			return getModule();
		case UISLPackage.MODULE_DEFINITION__INPUT_PORT:
			return getInputPort();
		case UISLPackage.MODULE_DEFINITION__OUTPUT_PORT:
			return getOutputPort();
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
		case UISLPackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT:
			getInteractionFlowModelElement().clear();
			getInteractionFlowModelElement().addAll((Collection<? extends InteractionFlowModelElement>) newValue);
			return;
		case UISLPackage.MODULE_DEFINITION__MODULE:
			getModule().clear();
			getModule().addAll((Collection<? extends UISL.Module>) newValue);
			return;
		case UISLPackage.MODULE_DEFINITION__INPUT_PORT:
			getInputPort().clear();
			getInputPort().addAll((Collection<? extends PortDefinition>) newValue);
			return;
		case UISLPackage.MODULE_DEFINITION__OUTPUT_PORT:
			getOutputPort().clear();
			getOutputPort().addAll((Collection<? extends PortDefinition>) newValue);
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
		case UISLPackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT:
			getInteractionFlowModelElement().clear();
			return;
		case UISLPackage.MODULE_DEFINITION__MODULE:
			getModule().clear();
			return;
		case UISLPackage.MODULE_DEFINITION__INPUT_PORT:
			getInputPort().clear();
			return;
		case UISLPackage.MODULE_DEFINITION__OUTPUT_PORT:
			getOutputPort().clear();
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
		case UISLPackage.MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT:
			return interactionFlowModelElement != null && !interactionFlowModelElement.isEmpty();
		case UISLPackage.MODULE_DEFINITION__MODULE:
			return module != null && !module.isEmpty();
		case UISLPackage.MODULE_DEFINITION__INPUT_PORT:
			return inputPort != null && !inputPort.isEmpty();
		case UISLPackage.MODULE_DEFINITION__OUTPUT_PORT:
			return outputPort != null && !outputPort.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModuleDefinitionImpl

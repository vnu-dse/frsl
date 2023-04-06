/**
 */
package UISL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see UISL.UISLFactory
 * @model kind="package"
 * @generated
 */
public interface UISLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UISL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/sme/uisl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uisl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UISLPackage eINSTANCE = UISL.impl.UISLPackageImpl.init();

	/**
	 * The meta object id for the '{@link UISL.impl.InteractionFlowModelElementImpl <em>Interaction Flow Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.InteractionFlowModelElementImpl
	 * @see UISL.impl.UISLPackageImpl#getInteractionFlowModelElement()
	 * @generated
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Interaction Flow Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Interaction Flow Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UISL.impl.InteractionFlowElementImpl <em>Interaction Flow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.InteractionFlowElementImpl
	 * @see UISL.impl.UISLPackageImpl#getInteractionFlowElement()
	 * @generated
	 */
	int INTERACTION_FLOW_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__NAME = INTERACTION_FLOW_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__DESCRIPTION = INTERACTION_FLOW_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__PARARAMETERS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interaction Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interaction Flow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_ELEMENT_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.InteractionFlowBlockImpl <em>Interaction Flow Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.InteractionFlowBlockImpl
	 * @see UISL.impl.UISLPackageImpl#getInteractionFlowBlock()
	 * @generated
	 */
	int INTERACTION_FLOW_BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_BLOCK__NAME = INTERACTION_FLOW_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_BLOCK__DESCRIPTION = INTERACTION_FLOW_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_BLOCK__TARGET_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_BLOCK__PARAMETER_BINDING_GROUP = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_BLOCK__SOURCE_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Interaction Flow Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_BLOCK_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Interaction Flow Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FLOW_BLOCK_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ParameterBindingGroupImpl <em>Parameter Binding Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ParameterBindingGroupImpl
	 * @see UISL.impl.UISLPackageImpl#getParameterBindingGroup()
	 * @generated
	 */
	int PARAMETER_BINDING_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP__NAME = INTERACTION_FLOW_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP__DESCRIPTION = INTERACTION_FLOW_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Parameterbindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP__PARAMETERBINDINGS = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Binding Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Binding Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_GROUP_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ParameterBindingImpl
	 * @see UISL.impl.UISLPackageImpl#getParameterBinding()
	 * @generated
	 */
	int PARAMETER_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__NAME = INTERACTION_FLOW_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__DESCRIPTION = INTERACTION_FLOW_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Source Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__SOURCE_PARAMETER = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING__TARGET_PARAMETER = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BINDING_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.NavigationFlowImpl <em>Navigation Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.NavigationFlowImpl
	 * @see UISL.impl.UISLPackageImpl#getNavigationFlow()
	 * @generated
	 */
	int NAVIGATION_FLOW = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__NAME = INTERACTION_FLOW_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__DESCRIPTION = INTERACTION_FLOW_BLOCK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__TARGET_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_BLOCK__TARGET_INTERACTION_FLOW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW_BLOCK__PARAMETER_BINDING_GROUP;

	/**
	 * The feature id for the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_BLOCK__SOURCE_INTERACTION_FLOW_ELEMENT;

	/**
	 * The number of structural features of the '<em>Navigation Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW_FEATURE_COUNT = INTERACTION_FLOW_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Navigation Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FLOW_OPERATION_COUNT = INTERACTION_FLOW_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.DataFlowImpl
	 * @see UISL.impl.UISLPackageImpl#getDataFlow()
	 * @generated
	 */
	int DATA_FLOW = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__NAME = INTERACTION_FLOW_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__DESCRIPTION = INTERACTION_FLOW_BLOCK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__TARGET_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_BLOCK__TARGET_INTERACTION_FLOW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW_BLOCK__PARAMETER_BINDING_GROUP;

	/**
	 * The feature id for the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_BLOCK__SOURCE_INTERACTION_FLOW_ELEMENT;

	/**
	 * The number of structural features of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_FEATURE_COUNT = INTERACTION_FLOW_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FLOW_OPERATION_COUNT = INTERACTION_FLOW_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.OKFlowImpl <em>OK Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.OKFlowImpl
	 * @see UISL.impl.UISLPackageImpl#getOKFlow()
	 * @generated
	 */
	int OK_FLOW = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FLOW__NAME = INTERACTION_FLOW_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FLOW__DESCRIPTION = INTERACTION_FLOW_BLOCK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FLOW__TARGET_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_BLOCK__TARGET_INTERACTION_FLOW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW_BLOCK__PARAMETER_BINDING_GROUP;

	/**
	 * The feature id for the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_BLOCK__SOURCE_INTERACTION_FLOW_ELEMENT;

	/**
	 * The number of structural features of the '<em>OK Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FLOW_FEATURE_COUNT = INTERACTION_FLOW_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OK Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OK_FLOW_OPERATION_COUNT = INTERACTION_FLOW_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ErrorFlowImpl <em>Error Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ErrorFlowImpl
	 * @see UISL.impl.UISLPackageImpl#getErrorFlow()
	 * @generated
	 */
	int ERROR_FLOW = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FLOW__NAME = INTERACTION_FLOW_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FLOW__DESCRIPTION = INTERACTION_FLOW_BLOCK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target Interaction Flow Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FLOW__TARGET_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_BLOCK__TARGET_INTERACTION_FLOW_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parameter Binding Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FLOW__PARAMETER_BINDING_GROUP = INTERACTION_FLOW_BLOCK__PARAMETER_BINDING_GROUP;

	/**
	 * The feature id for the '<em><b>Source Interaction Flow Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FLOW__SOURCE_INTERACTION_FLOW_ELEMENT = INTERACTION_FLOW_BLOCK__SOURCE_INTERACTION_FLOW_ELEMENT;

	/**
	 * The number of structural features of the '<em>Error Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FLOW_FEATURE_COUNT = INTERACTION_FLOW_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Error Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_FLOW_OPERATION_COUNT = INTERACTION_FLOW_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ViewComponentPartImpl <em>View Component Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ViewComponentPartImpl
	 * @see UISL.impl.UISLPackageImpl#getViewComponentPart()
	 * @generated
	 */
	int VIEW_COMPONENT_PART = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__DESCRIPTION = INTERACTION_FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__IN_INTERACTION_FLOW_BLOCK = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__PARARAMETERS = INTERACTION_FLOW_ELEMENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Subviewcomponentpart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__SUBVIEWCOMPONENTPART = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Element Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent View Component Part</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>View Component Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>View Component Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_PART_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ViewElementImpl <em>View Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ViewElementImpl
	 * @see UISL.impl.UISLPackageImpl#getViewElement()
	 * @generated
	 */
	int VIEW_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__DESCRIPTION = INTERACTION_FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__IN_INTERACTION_FLOW_BLOCK = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__PARARAMETERS = INTERACTION_FLOW_ELEMENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__VIEW_ELEMENT_EVENT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT__VIEW_CONTAINER = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>View Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ViewComponentImpl <em>View Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ViewComponentImpl
	 * @see UISL.impl.UISLPackageImpl#getViewComponent()
	 * @generated
	 */
	int VIEW_COMPONENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__NAME = VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__DESCRIPTION = VIEW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__IN_INTERACTION_FLOW_BLOCK = VIEW_ELEMENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__PARARAMETERS = VIEW_ELEMENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__OUT_INTERACTION_FLOWS = VIEW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__VIEW_ELEMENT_EVENT = VIEW_ELEMENT__VIEW_ELEMENT_EVENT;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__VIEW_CONTAINER = VIEW_ELEMENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Viewcomponentpart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT__VIEWCOMPONENTPART = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_COMPONENT_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ViewContainerImpl <em>View Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ViewContainerImpl
	 * @see UISL.impl.UISLPackageImpl#getViewContainer()
	 * @generated
	 */
	int VIEW_CONTAINER = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__NAME = VIEW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__DESCRIPTION = VIEW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__IN_INTERACTION_FLOW_BLOCK = VIEW_ELEMENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__PARARAMETERS = VIEW_ELEMENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__OUT_INTERACTION_FLOWS = VIEW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__VIEW_ELEMENT_EVENT = VIEW_ELEMENT__VIEW_ELEMENT_EVENT;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__VIEW_CONTAINER = VIEW_ELEMENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>View Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__VIEW_ELEMENT = VIEW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Landmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__IS_LANDMARK = VIEW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__IS_DEFAULT = VIEW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is XOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__IS_XOR = VIEW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER__ACTION = VIEW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>View Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER_FEATURE_COUNT = VIEW_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>View Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_CONTAINER_OPERATION_COUNT = VIEW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ParameterBlockImpl <em>Parameter Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ParameterBlockImpl
	 * @see UISL.impl.UISLPackageImpl#getParameterBlock()
	 * @generated
	 */
	int PARAMETER_BLOCK = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BLOCK__NAME = INTERACTION_FLOW_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BLOCK__DESCRIPTION = INTERACTION_FLOW_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BLOCK__DIRECTION = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BLOCK_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_BLOCK_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.EventImpl
	 * @see UISL.impl.UISLPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = INTERACTION_FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__IN_INTERACTION_FLOW_BLOCK = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__PARARAMETERS = INTERACTION_FLOW_ELEMENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.CatchingEventImpl <em>Catching Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.CatchingEventImpl
	 * @see UISL.impl.UISLPackageImpl#getCatchingEvent()
	 * @generated
	 */
	int CATCHING_EVENT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__IN_INTERACTION_FLOW_BLOCK = EVENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__PARARAMETERS = EVENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT__OUT_INTERACTION_FLOWS = EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The number of structural features of the '<em>Catching Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Catching Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATCHING_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ThrowingEventImpl <em>Throwing Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ThrowingEventImpl
	 * @see UISL.impl.UISLPackageImpl#getThrowingEvent()
	 * @generated
	 */
	int THROWING_EVENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__DESCRIPTION = EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__IN_INTERACTION_FLOW_BLOCK = EVENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__PARARAMETERS = EVENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT__OUT_INTERACTION_FLOWS = EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The number of structural features of the '<em>Throwing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Throwing Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THROWING_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ActionEventImpl <em>Action Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ActionEventImpl
	 * @see UISL.impl.UISLPackageImpl#getActionEvent()
	 * @generated
	 */
	int ACTION_EVENT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__NAME = CATCHING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__DESCRIPTION = CATCHING_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__IN_INTERACTION_FLOW_BLOCK = CATCHING_EVENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__PARARAMETERS = CATCHING_EVENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT__OUT_INTERACTION_FLOWS = CATCHING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The number of structural features of the '<em>Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT_FEATURE_COUNT = CATCHING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_EVENT_OPERATION_COUNT = CATCHING_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.DSLGUIImpl <em>DSLGUI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.DSLGUIImpl
	 * @see UISL.impl.UISLPackageImpl#getDSLGUI()
	 * @generated
	 */
	int DSLGUI = 18;

	/**
	 * The feature id for the '<em><b>Interaction Flow Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSLGUI__INTERACTION_FLOW_MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSLGUI__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSLGUI__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>DSLGUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSLGUI_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>DSLGUI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSLGUI_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UISL.impl.FormComponentImpl <em>Form Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.FormComponentImpl
	 * @see UISL.impl.UISLPackageImpl#getFormComponent()
	 * @generated
	 */
	int FORM_COMPONENT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_COMPONENT__NAME = VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_COMPONENT__DESCRIPTION = VIEW_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_COMPONENT__IN_INTERACTION_FLOW_BLOCK = VIEW_COMPONENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_COMPONENT__PARARAMETERS = VIEW_COMPONENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_COMPONENT__OUT_INTERACTION_FLOWS = VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_COMPONENT__VIEW_ELEMENT_EVENT = VIEW_COMPONENT__VIEW_ELEMENT_EVENT;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_COMPONENT__VIEW_CONTAINER = VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Viewcomponentpart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_COMPONENT__VIEWCOMPONENTPART = VIEW_COMPONENT__VIEWCOMPONENTPART;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_COMPONENT__FIELDS = VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Form Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_COMPONENT_FEATURE_COUNT = VIEW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Form Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_COMPONENT_OPERATION_COUNT = VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ListComponentImpl <em>List Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ListComponentImpl
	 * @see UISL.impl.UISLPackageImpl#getListComponent()
	 * @generated
	 */
	int LIST_COMPONENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__NAME = VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__DESCRIPTION = VIEW_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__IN_INTERACTION_FLOW_BLOCK = VIEW_COMPONENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__PARARAMETERS = VIEW_COMPONENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__OUT_INTERACTION_FLOWS = VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__VIEW_ELEMENT_EVENT = VIEW_COMPONENT__VIEW_ELEMENT_EVENT;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__VIEW_CONTAINER = VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Viewcomponentpart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__VIEWCOMPONENTPART = VIEW_COMPONENT__VIEWCOMPONENTPART;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__COLUMNS = VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT_FEATURE_COUNT = VIEW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT_OPERATION_COUNT = VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.MessageComponentImpl <em>Message Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.MessageComponentImpl
	 * @see UISL.impl.UISLPackageImpl#getMessageComponent()
	 * @generated
	 */
	int MESSAGE_COMPONENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__NAME = VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__DESCRIPTION = VIEW_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__IN_INTERACTION_FLOW_BLOCK = VIEW_COMPONENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__PARARAMETERS = VIEW_COMPONENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__OUT_INTERACTION_FLOWS = VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__VIEW_ELEMENT_EVENT = VIEW_COMPONENT__VIEW_ELEMENT_EVENT;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__VIEW_CONTAINER = VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Viewcomponentpart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__VIEWCOMPONENTPART = VIEW_COMPONENT__VIEWCOMPONENTPART;

	/**
	 * The feature id for the '<em><b>Msg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT__MSG = VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Message Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_FEATURE_COUNT = VIEW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Message Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_COMPONENT_OPERATION_COUNT = VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.DetailsComponentImpl <em>Details Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.DetailsComponentImpl
	 * @see UISL.impl.UISLPackageImpl#getDetailsComponent()
	 * @generated
	 */
	int DETAILS_COMPONENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_COMPONENT__NAME = VIEW_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_COMPONENT__DESCRIPTION = VIEW_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_COMPONENT__IN_INTERACTION_FLOW_BLOCK = VIEW_COMPONENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_COMPONENT__PARARAMETERS = VIEW_COMPONENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_COMPONENT__OUT_INTERACTION_FLOWS = VIEW_COMPONENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>View Element Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_COMPONENT__VIEW_ELEMENT_EVENT = VIEW_COMPONENT__VIEW_ELEMENT_EVENT;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_COMPONENT__VIEW_CONTAINER = VIEW_COMPONENT__VIEW_CONTAINER;

	/**
	 * The feature id for the '<em><b>Viewcomponentpart</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_COMPONENT__VIEWCOMPONENTPART = VIEW_COMPONENT__VIEWCOMPONENTPART;

	/**
	 * The feature id for the '<em><b>Options</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_COMPONENT__OPTIONS = VIEW_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Details Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_COMPONENT_FEATURE_COUNT = VIEW_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Details Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_COMPONENT_OPERATION_COUNT = VIEW_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ViewElementEventImpl <em>View Element Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ViewElementEventImpl
	 * @see UISL.impl.UISLPackageImpl#getViewElementEvent()
	 * @generated
	 */
	int VIEW_ELEMENT_EVENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__NAME = CATCHING_EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__DESCRIPTION = CATCHING_EVENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__IN_INTERACTION_FLOW_BLOCK = CATCHING_EVENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__PARARAMETERS = CATCHING_EVENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__OUT_INTERACTION_FLOWS = CATCHING_EVENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Viewelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT__VIEWELEMENT = CATCHING_EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>View Element Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT_FEATURE_COUNT = CATCHING_EVENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>View Element Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIEW_ELEMENT_EVENT_OPERATION_COUNT = CATCHING_EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ActionBlockImpl <em>Action Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ActionBlockImpl
	 * @see UISL.impl.UISLPackageImpl#getActionBlock()
	 * @generated
	 */
	int ACTION_BLOCK = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__DESCRIPTION = INTERACTION_FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__IN_INTERACTION_FLOW_BLOCK = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__PARARAMETERS = INTERACTION_FLOW_ELEMENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Action Event</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__ACTION_EVENT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>View Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK__VIEW_CONTAINER = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BLOCK_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ModuleDefinitionImpl <em>Module Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ModuleDefinitionImpl
	 * @see UISL.impl.UISLPackageImpl#getModuleDefinition()
	 * @generated
	 */
	int MODULE_DEFINITION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__NAME = INTERACTION_FLOW_MODEL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__DESCRIPTION = INTERACTION_FLOW_MODEL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Interaction Flow Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__MODULE = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__INPUT_PORT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION__OUTPUT_PORT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION_FEATURE_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Module Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_DEFINITION_OPERATION_COUNT = INTERACTION_FLOW_MODEL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.PortDefinitionImpl <em>Port Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.PortDefinitionImpl
	 * @see UISL.impl.UISLPackageImpl#getPortDefinition()
	 * @generated
	 */
	int PORT_DEFINITION = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__DESCRIPTION = INTERACTION_FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__IN_INTERACTION_FLOW_BLOCK = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__PARARAMETERS = INTERACTION_FLOW_ELEMENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION__PORT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Port Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DEFINITION_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ModuleImpl
	 * @see UISL.impl.UISLPackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__DESCRIPTION = INTERACTION_FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__IN_INTERACTION_FLOW_BLOCK = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PARARAMETERS = INTERACTION_FLOW_ELEMENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Moduledefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODULEDEFINITION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__PORT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.PortImpl
	 * @see UISL.impl.UISLPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = INTERACTION_FLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = INTERACTION_FLOW_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>In Interaction Flow Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__IN_INTERACTION_FLOW_BLOCK = INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK;

	/**
	 * The feature id for the '<em><b>Pararameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PARARAMETERS = INTERACTION_FLOW_ELEMENT__PARARAMETERS;

	/**
	 * The feature id for the '<em><b>Out Interaction Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__OUT_INTERACTION_FLOWS = INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__MODULE = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_DEFINITION = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = INTERACTION_FLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = INTERACTION_FLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UISL.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.impl.ColumnImpl
	 * @see UISL.impl.UISLPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 29;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UISL.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UISL.Direction
	 * @see UISL.impl.UISLPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 30;

	/**
	 * Returns the meta object for class '{@link UISL.InteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow Model Element</em>'.
	 * @see UISL.InteractionFlowModelElement
	 * @generated
	 */
	EClass getInteractionFlowModelElement();

	/**
	 * Returns the meta object for the attribute '{@link UISL.InteractionFlowModelElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UISL.InteractionFlowModelElement#getName()
	 * @see #getInteractionFlowModelElement()
	 * @generated
	 */
	EAttribute getInteractionFlowModelElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link UISL.InteractionFlowModelElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see UISL.InteractionFlowModelElement#getDescription()
	 * @see #getInteractionFlowModelElement()
	 * @generated
	 */
	EAttribute getInteractionFlowModelElement_Description();

	/**
	 * Returns the meta object for class '{@link UISL.InteractionFlowElement <em>Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow Element</em>'.
	 * @see UISL.InteractionFlowElement
	 * @generated
	 */
	EClass getInteractionFlowElement();

	/**
	 * Returns the meta object for the reference list '{@link UISL.InteractionFlowElement#getInInteractionFlowBlock <em>In Interaction Flow Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In Interaction Flow Block</em>'.
	 * @see UISL.InteractionFlowElement#getInInteractionFlowBlock()
	 * @see #getInteractionFlowElement()
	 * @generated
	 */
	EReference getInteractionFlowElement_InInteractionFlowBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.InteractionFlowElement#getPararameters <em>Pararameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pararameters</em>'.
	 * @see UISL.InteractionFlowElement#getPararameters()
	 * @see #getInteractionFlowElement()
	 * @generated
	 */
	EReference getInteractionFlowElement_Pararameters();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.InteractionFlowElement#getOutInteractionFlows <em>Out Interaction Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Out Interaction Flows</em>'.
	 * @see UISL.InteractionFlowElement#getOutInteractionFlows()
	 * @see #getInteractionFlowElement()
	 * @generated
	 */
	EReference getInteractionFlowElement_OutInteractionFlows();

	/**
	 * Returns the meta object for class '{@link UISL.InteractionFlowBlock <em>Interaction Flow Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Flow Block</em>'.
	 * @see UISL.InteractionFlowBlock
	 * @generated
	 */
	EClass getInteractionFlowBlock();

	/**
	 * Returns the meta object for the reference '{@link UISL.InteractionFlowBlock#getTargetInteractionFlowElement <em>Target Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Interaction Flow Element</em>'.
	 * @see UISL.InteractionFlowBlock#getTargetInteractionFlowElement()
	 * @see #getInteractionFlowBlock()
	 * @generated
	 */
	EReference getInteractionFlowBlock_TargetInteractionFlowElement();

	/**
	 * Returns the meta object for the containment reference '{@link UISL.InteractionFlowBlock#getParameterBindingGroup <em>Parameter Binding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Binding Group</em>'.
	 * @see UISL.InteractionFlowBlock#getParameterBindingGroup()
	 * @see #getInteractionFlowBlock()
	 * @generated
	 */
	EReference getInteractionFlowBlock_ParameterBindingGroup();

	/**
	 * Returns the meta object for the container reference '{@link UISL.InteractionFlowBlock#getSourceInteractionFlowElement <em>Source Interaction Flow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source Interaction Flow Element</em>'.
	 * @see UISL.InteractionFlowBlock#getSourceInteractionFlowElement()
	 * @see #getInteractionFlowBlock()
	 * @generated
	 */
	EReference getInteractionFlowBlock_SourceInteractionFlowElement();

	/**
	 * Returns the meta object for class '{@link UISL.ParameterBindingGroup <em>Parameter Binding Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Binding Group</em>'.
	 * @see UISL.ParameterBindingGroup
	 * @generated
	 */
	EClass getParameterBindingGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.ParameterBindingGroup#getParameterbindings <em>Parameterbindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameterbindings</em>'.
	 * @see UISL.ParameterBindingGroup#getParameterbindings()
	 * @see #getParameterBindingGroup()
	 * @generated
	 */
	EReference getParameterBindingGroup_Parameterbindings();

	/**
	 * Returns the meta object for class '{@link UISL.ParameterBinding <em>Parameter Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Binding</em>'.
	 * @see UISL.ParameterBinding
	 * @generated
	 */
	EClass getParameterBinding();

	/**
	 * Returns the meta object for the reference '{@link UISL.ParameterBinding#getSourceParameter <em>Source Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Parameter</em>'.
	 * @see UISL.ParameterBinding#getSourceParameter()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_SourceParameter();

	/**
	 * Returns the meta object for the reference '{@link UISL.ParameterBinding#getTargetParameter <em>Target Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Parameter</em>'.
	 * @see UISL.ParameterBinding#getTargetParameter()
	 * @see #getParameterBinding()
	 * @generated
	 */
	EReference getParameterBinding_TargetParameter();

	/**
	 * Returns the meta object for class '{@link UISL.NavigationFlow <em>Navigation Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Flow</em>'.
	 * @see UISL.NavigationFlow
	 * @generated
	 */
	EClass getNavigationFlow();

	/**
	 * Returns the meta object for class '{@link UISL.DataFlow <em>Data Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Flow</em>'.
	 * @see UISL.DataFlow
	 * @generated
	 */
	EClass getDataFlow();

	/**
	 * Returns the meta object for class '{@link UISL.OKFlow <em>OK Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OK Flow</em>'.
	 * @see UISL.OKFlow
	 * @generated
	 */
	EClass getOKFlow();

	/**
	 * Returns the meta object for class '{@link UISL.ErrorFlow <em>Error Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Flow</em>'.
	 * @see UISL.ErrorFlow
	 * @generated
	 */
	EClass getErrorFlow();

	/**
	 * Returns the meta object for class '{@link UISL.ViewComponentPart <em>View Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Component Part</em>'.
	 * @see UISL.ViewComponentPart
	 * @generated
	 */
	EClass getViewComponentPart();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.ViewComponentPart#getSubviewcomponentpart <em>Subviewcomponentpart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subviewcomponentpart</em>'.
	 * @see UISL.ViewComponentPart#getSubviewcomponentpart()
	 * @see #getViewComponentPart()
	 * @generated
	 */
	EReference getViewComponentPart_Subviewcomponentpart();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.ViewComponentPart#getViewElementEvent <em>View Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Element Event</em>'.
	 * @see UISL.ViewComponentPart#getViewElementEvent()
	 * @see #getViewComponentPart()
	 * @generated
	 */
	EReference getViewComponentPart_ViewElementEvent();

	/**
	 * Returns the meta object for the container reference '{@link UISL.ViewComponentPart#getParentViewComponentPart <em>Parent View Component Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent View Component Part</em>'.
	 * @see UISL.ViewComponentPart#getParentViewComponentPart()
	 * @see #getViewComponentPart()
	 * @generated
	 */
	EReference getViewComponentPart_ParentViewComponentPart();

	/**
	 * Returns the meta object for class '{@link UISL.ViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element</em>'.
	 * @see UISL.ViewElement
	 * @generated
	 */
	EClass getViewElement();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.ViewElement#getViewElementEvent <em>View Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Element Event</em>'.
	 * @see UISL.ViewElement#getViewElementEvent()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_ViewElementEvent();

	/**
	 * Returns the meta object for the container reference '{@link UISL.ViewElement#getViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>View Container</em>'.
	 * @see UISL.ViewElement#getViewContainer()
	 * @see #getViewElement()
	 * @generated
	 */
	EReference getViewElement_ViewContainer();

	/**
	 * Returns the meta object for class '{@link UISL.ViewComponent <em>View Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Component</em>'.
	 * @see UISL.ViewComponent
	 * @generated
	 */
	EClass getViewComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.ViewComponent#getViewcomponentpart <em>Viewcomponentpart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viewcomponentpart</em>'.
	 * @see UISL.ViewComponent#getViewcomponentpart()
	 * @see #getViewComponent()
	 * @generated
	 */
	EReference getViewComponent_Viewcomponentpart();

	/**
	 * Returns the meta object for class '{@link UISL.ViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Container</em>'.
	 * @see UISL.ViewContainer
	 * @generated
	 */
	EClass getViewContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.ViewContainer#getViewElement <em>View Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>View Element</em>'.
	 * @see UISL.ViewContainer#getViewElement()
	 * @see #getViewContainer()
	 * @generated
	 */
	EReference getViewContainer_ViewElement();

	/**
	 * Returns the meta object for the attribute '{@link UISL.ViewContainer#getIsLandmark <em>Is Landmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Landmark</em>'.
	 * @see UISL.ViewContainer#getIsLandmark()
	 * @see #getViewContainer()
	 * @generated
	 */
	EAttribute getViewContainer_IsLandmark();

	/**
	 * Returns the meta object for the attribute '{@link UISL.ViewContainer#getIsDefault <em>Is Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default</em>'.
	 * @see UISL.ViewContainer#getIsDefault()
	 * @see #getViewContainer()
	 * @generated
	 */
	EAttribute getViewContainer_IsDefault();

	/**
	 * Returns the meta object for the attribute '{@link UISL.ViewContainer#getIsXOR <em>Is XOR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is XOR</em>'.
	 * @see UISL.ViewContainer#getIsXOR()
	 * @see #getViewContainer()
	 * @generated
	 */
	EAttribute getViewContainer_IsXOR();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.ViewContainer#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see UISL.ViewContainer#getAction()
	 * @see #getViewContainer()
	 * @generated
	 */
	EReference getViewContainer_Action();

	/**
	 * Returns the meta object for class '{@link UISL.ParameterBlock <em>Parameter Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Block</em>'.
	 * @see UISL.ParameterBlock
	 * @generated
	 */
	EClass getParameterBlock();

	/**
	 * Returns the meta object for the attribute '{@link UISL.ParameterBlock#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see UISL.ParameterBlock#getDirection()
	 * @see #getParameterBlock()
	 * @generated
	 */
	EAttribute getParameterBlock_Direction();

	/**
	 * Returns the meta object for class '{@link UISL.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see UISL.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link UISL.CatchingEvent <em>Catching Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catching Event</em>'.
	 * @see UISL.CatchingEvent
	 * @generated
	 */
	EClass getCatchingEvent();

	/**
	 * Returns the meta object for class '{@link UISL.ThrowingEvent <em>Throwing Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Throwing Event</em>'.
	 * @see UISL.ThrowingEvent
	 * @generated
	 */
	EClass getThrowingEvent();

	/**
	 * Returns the meta object for class '{@link UISL.ActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Event</em>'.
	 * @see UISL.ActionEvent
	 * @generated
	 */
	EClass getActionEvent();

	/**
	 * Returns the meta object for class '{@link UISL.DSLGUI <em>DSLGUI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSLGUI</em>'.
	 * @see UISL.DSLGUI
	 * @generated
	 */
	EClass getDSLGUI();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.DSLGUI#getInteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Flow Model Element</em>'.
	 * @see UISL.DSLGUI#getInteractionFlowModelElement()
	 * @see #getDSLGUI()
	 * @generated
	 */
	EReference getDSLGUI_InteractionFlowModelElement();

	/**
	 * Returns the meta object for the attribute '{@link UISL.DSLGUI#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UISL.DSLGUI#getName()
	 * @see #getDSLGUI()
	 * @generated
	 */
	EAttribute getDSLGUI_Name();

	/**
	 * Returns the meta object for the attribute '{@link UISL.DSLGUI#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see UISL.DSLGUI#getDescription()
	 * @see #getDSLGUI()
	 * @generated
	 */
	EAttribute getDSLGUI_Description();

	/**
	 * Returns the meta object for class '{@link UISL.FormComponent <em>Form Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Component</em>'.
	 * @see UISL.FormComponent
	 * @generated
	 */
	EClass getFormComponent();

	/**
	 * Returns the meta object for the attribute list '{@link UISL.FormComponent#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fields</em>'.
	 * @see UISL.FormComponent#getFields()
	 * @see #getFormComponent()
	 * @generated
	 */
	EAttribute getFormComponent_Fields();

	/**
	 * Returns the meta object for class '{@link UISL.ListComponent <em>List Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Component</em>'.
	 * @see UISL.ListComponent
	 * @generated
	 */
	EClass getListComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.ListComponent#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see UISL.ListComponent#getColumns()
	 * @see #getListComponent()
	 * @generated
	 */
	EReference getListComponent_Columns();

	/**
	 * Returns the meta object for class '{@link UISL.MessageComponent <em>Message Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Component</em>'.
	 * @see UISL.MessageComponent
	 * @generated
	 */
	EClass getMessageComponent();

	/**
	 * Returns the meta object for the attribute '{@link UISL.MessageComponent#getMsg <em>Msg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Msg</em>'.
	 * @see UISL.MessageComponent#getMsg()
	 * @see #getMessageComponent()
	 * @generated
	 */
	EAttribute getMessageComponent_Msg();

	/**
	 * Returns the meta object for class '{@link UISL.DetailsComponent <em>Details Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details Component</em>'.
	 * @see UISL.DetailsComponent
	 * @generated
	 */
	EClass getDetailsComponent();

	/**
	 * Returns the meta object for the attribute list '{@link UISL.DetailsComponent#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Options</em>'.
	 * @see UISL.DetailsComponent#getOptions()
	 * @see #getDetailsComponent()
	 * @generated
	 */
	EAttribute getDetailsComponent_Options();

	/**
	 * Returns the meta object for class '{@link UISL.ViewElementEvent <em>View Element Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>View Element Event</em>'.
	 * @see UISL.ViewElementEvent
	 * @generated
	 */
	EClass getViewElementEvent();

	/**
	 * Returns the meta object for the reference '{@link UISL.ViewElementEvent#getViewelement <em>Viewelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Viewelement</em>'.
	 * @see UISL.ViewElementEvent#getViewelement()
	 * @see #getViewElementEvent()
	 * @generated
	 */
	EReference getViewElementEvent_Viewelement();

	/**
	 * Returns the meta object for class '{@link UISL.ActionBlock <em>Action Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Block</em>'.
	 * @see UISL.ActionBlock
	 * @generated
	 */
	EClass getActionBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.ActionBlock#getActionEvent <em>Action Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Event</em>'.
	 * @see UISL.ActionBlock#getActionEvent()
	 * @see #getActionBlock()
	 * @generated
	 */
	EReference getActionBlock_ActionEvent();

	/**
	 * Returns the meta object for the container reference '{@link UISL.ActionBlock#getViewContainer <em>View Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>View Container</em>'.
	 * @see UISL.ActionBlock#getViewContainer()
	 * @see #getActionBlock()
	 * @generated
	 */
	EReference getActionBlock_ViewContainer();

	/**
	 * Returns the meta object for class '{@link UISL.ModuleDefinition <em>Module Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Definition</em>'.
	 * @see UISL.ModuleDefinition
	 * @generated
	 */
	EClass getModuleDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.ModuleDefinition#getInteractionFlowModelElement <em>Interaction Flow Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interaction Flow Model Element</em>'.
	 * @see UISL.ModuleDefinition#getInteractionFlowModelElement()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_InteractionFlowModelElement();

	/**
	 * Returns the meta object for the reference list '{@link UISL.ModuleDefinition#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Module</em>'.
	 * @see UISL.ModuleDefinition#getModule()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_Module();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.ModuleDefinition#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Port</em>'.
	 * @see UISL.ModuleDefinition#getInputPort()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_InputPort();

	/**
	 * Returns the meta object for the containment reference list '{@link UISL.ModuleDefinition#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Port</em>'.
	 * @see UISL.ModuleDefinition#getOutputPort()
	 * @see #getModuleDefinition()
	 * @generated
	 */
	EReference getModuleDefinition_OutputPort();

	/**
	 * Returns the meta object for class '{@link UISL.PortDefinition <em>Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Definition</em>'.
	 * @see UISL.PortDefinition
	 * @generated
	 */
	EClass getPortDefinition();

	/**
	 * Returns the meta object for the reference list '{@link UISL.PortDefinition#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see UISL.PortDefinition#getPort()
	 * @see #getPortDefinition()
	 * @generated
	 */
	EReference getPortDefinition_Port();

	/**
	 * Returns the meta object for class '{@link UISL.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see UISL.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the reference '{@link UISL.Module#getModuledefinition <em>Moduledefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Moduledefinition</em>'.
	 * @see UISL.Module#getModuledefinition()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Moduledefinition();

	/**
	 * Returns the meta object for the reference list '{@link UISL.Module#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see UISL.Module#getPort()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Port();

	/**
	 * Returns the meta object for class '{@link UISL.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see UISL.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the reference '{@link UISL.Port#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see UISL.Port#getModule()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Module();

	/**
	 * Returns the meta object for the reference '{@link UISL.Port#getPortDefinition <em>Port Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Definition</em>'.
	 * @see UISL.Port#getPortDefinition()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_PortDefinition();

	/**
	 * Returns the meta object for class '{@link UISL.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see UISL.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the attribute '{@link UISL.Column#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see UISL.Column#getValue()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Value();

	/**
	 * Returns the meta object for the attribute '{@link UISL.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see UISL.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for enum '{@link UISL.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see UISL.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UISLFactory getUISLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link UISL.impl.InteractionFlowModelElementImpl <em>Interaction Flow Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.InteractionFlowModelElementImpl
		 * @see UISL.impl.UISLPackageImpl#getInteractionFlowModelElement()
		 * @generated
		 */
		EClass INTERACTION_FLOW_MODEL_ELEMENT = eINSTANCE.getInteractionFlowModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_FLOW_MODEL_ELEMENT__NAME = eINSTANCE.getInteractionFlowModelElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_FLOW_MODEL_ELEMENT__DESCRIPTION = eINSTANCE.getInteractionFlowModelElement_Description();

		/**
		 * The meta object literal for the '{@link UISL.impl.InteractionFlowElementImpl <em>Interaction Flow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.InteractionFlowElementImpl
		 * @see UISL.impl.UISLPackageImpl#getInteractionFlowElement()
		 * @generated
		 */
		EClass INTERACTION_FLOW_ELEMENT = eINSTANCE.getInteractionFlowElement();

		/**
		 * The meta object literal for the '<em><b>In Interaction Flow Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_ELEMENT__IN_INTERACTION_FLOW_BLOCK = eINSTANCE
				.getInteractionFlowElement_InInteractionFlowBlock();

		/**
		 * The meta object literal for the '<em><b>Pararameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_ELEMENT__PARARAMETERS = eINSTANCE.getInteractionFlowElement_Pararameters();

		/**
		 * The meta object literal for the '<em><b>Out Interaction Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_ELEMENT__OUT_INTERACTION_FLOWS = eINSTANCE
				.getInteractionFlowElement_OutInteractionFlows();

		/**
		 * The meta object literal for the '{@link UISL.impl.InteractionFlowBlockImpl <em>Interaction Flow Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.InteractionFlowBlockImpl
		 * @see UISL.impl.UISLPackageImpl#getInteractionFlowBlock()
		 * @generated
		 */
		EClass INTERACTION_FLOW_BLOCK = eINSTANCE.getInteractionFlowBlock();

		/**
		 * The meta object literal for the '<em><b>Target Interaction Flow Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_BLOCK__TARGET_INTERACTION_FLOW_ELEMENT = eINSTANCE
				.getInteractionFlowBlock_TargetInteractionFlowElement();

		/**
		 * The meta object literal for the '<em><b>Parameter Binding Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_BLOCK__PARAMETER_BINDING_GROUP = eINSTANCE
				.getInteractionFlowBlock_ParameterBindingGroup();

		/**
		 * The meta object literal for the '<em><b>Source Interaction Flow Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERACTION_FLOW_BLOCK__SOURCE_INTERACTION_FLOW_ELEMENT = eINSTANCE
				.getInteractionFlowBlock_SourceInteractionFlowElement();

		/**
		 * The meta object literal for the '{@link UISL.impl.ParameterBindingGroupImpl <em>Parameter Binding Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ParameterBindingGroupImpl
		 * @see UISL.impl.UISLPackageImpl#getParameterBindingGroup()
		 * @generated
		 */
		EClass PARAMETER_BINDING_GROUP = eINSTANCE.getParameterBindingGroup();

		/**
		 * The meta object literal for the '<em><b>Parameterbindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING_GROUP__PARAMETERBINDINGS = eINSTANCE.getParameterBindingGroup_Parameterbindings();

		/**
		 * The meta object literal for the '{@link UISL.impl.ParameterBindingImpl <em>Parameter Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ParameterBindingImpl
		 * @see UISL.impl.UISLPackageImpl#getParameterBinding()
		 * @generated
		 */
		EClass PARAMETER_BINDING = eINSTANCE.getParameterBinding();

		/**
		 * The meta object literal for the '<em><b>Source Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__SOURCE_PARAMETER = eINSTANCE.getParameterBinding_SourceParameter();

		/**
		 * The meta object literal for the '<em><b>Target Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_BINDING__TARGET_PARAMETER = eINSTANCE.getParameterBinding_TargetParameter();

		/**
		 * The meta object literal for the '{@link UISL.impl.NavigationFlowImpl <em>Navigation Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.NavigationFlowImpl
		 * @see UISL.impl.UISLPackageImpl#getNavigationFlow()
		 * @generated
		 */
		EClass NAVIGATION_FLOW = eINSTANCE.getNavigationFlow();

		/**
		 * The meta object literal for the '{@link UISL.impl.DataFlowImpl <em>Data Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.DataFlowImpl
		 * @see UISL.impl.UISLPackageImpl#getDataFlow()
		 * @generated
		 */
		EClass DATA_FLOW = eINSTANCE.getDataFlow();

		/**
		 * The meta object literal for the '{@link UISL.impl.OKFlowImpl <em>OK Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.OKFlowImpl
		 * @see UISL.impl.UISLPackageImpl#getOKFlow()
		 * @generated
		 */
		EClass OK_FLOW = eINSTANCE.getOKFlow();

		/**
		 * The meta object literal for the '{@link UISL.impl.ErrorFlowImpl <em>Error Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ErrorFlowImpl
		 * @see UISL.impl.UISLPackageImpl#getErrorFlow()
		 * @generated
		 */
		EClass ERROR_FLOW = eINSTANCE.getErrorFlow();

		/**
		 * The meta object literal for the '{@link UISL.impl.ViewComponentPartImpl <em>View Component Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ViewComponentPartImpl
		 * @see UISL.impl.UISLPackageImpl#getViewComponentPart()
		 * @generated
		 */
		EClass VIEW_COMPONENT_PART = eINSTANCE.getViewComponentPart();

		/**
		 * The meta object literal for the '<em><b>Subviewcomponentpart</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT_PART__SUBVIEWCOMPONENTPART = eINSTANCE.getViewComponentPart_Subviewcomponentpart();

		/**
		 * The meta object literal for the '<em><b>View Element Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT_PART__VIEW_ELEMENT_EVENT = eINSTANCE.getViewComponentPart_ViewElementEvent();

		/**
		 * The meta object literal for the '<em><b>Parent View Component Part</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT_PART__PARENT_VIEW_COMPONENT_PART = eINSTANCE
				.getViewComponentPart_ParentViewComponentPart();

		/**
		 * The meta object literal for the '{@link UISL.impl.ViewElementImpl <em>View Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ViewElementImpl
		 * @see UISL.impl.UISLPackageImpl#getViewElement()
		 * @generated
		 */
		EClass VIEW_ELEMENT = eINSTANCE.getViewElement();

		/**
		 * The meta object literal for the '<em><b>View Element Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__VIEW_ELEMENT_EVENT = eINSTANCE.getViewElement_ViewElementEvent();

		/**
		 * The meta object literal for the '<em><b>View Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT__VIEW_CONTAINER = eINSTANCE.getViewElement_ViewContainer();

		/**
		 * The meta object literal for the '{@link UISL.impl.ViewComponentImpl <em>View Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ViewComponentImpl
		 * @see UISL.impl.UISLPackageImpl#getViewComponent()
		 * @generated
		 */
		EClass VIEW_COMPONENT = eINSTANCE.getViewComponent();

		/**
		 * The meta object literal for the '<em><b>Viewcomponentpart</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_COMPONENT__VIEWCOMPONENTPART = eINSTANCE.getViewComponent_Viewcomponentpart();

		/**
		 * The meta object literal for the '{@link UISL.impl.ViewContainerImpl <em>View Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ViewContainerImpl
		 * @see UISL.impl.UISLPackageImpl#getViewContainer()
		 * @generated
		 */
		EClass VIEW_CONTAINER = eINSTANCE.getViewContainer();

		/**
		 * The meta object literal for the '<em><b>View Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_CONTAINER__VIEW_ELEMENT = eINSTANCE.getViewContainer_ViewElement();

		/**
		 * The meta object literal for the '<em><b>Is Landmark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CONTAINER__IS_LANDMARK = eINSTANCE.getViewContainer_IsLandmark();

		/**
		 * The meta object literal for the '<em><b>Is Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CONTAINER__IS_DEFAULT = eINSTANCE.getViewContainer_IsDefault();

		/**
		 * The meta object literal for the '<em><b>Is XOR</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIEW_CONTAINER__IS_XOR = eINSTANCE.getViewContainer_IsXOR();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_CONTAINER__ACTION = eINSTANCE.getViewContainer_Action();

		/**
		 * The meta object literal for the '{@link UISL.impl.ParameterBlockImpl <em>Parameter Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ParameterBlockImpl
		 * @see UISL.impl.UISLPackageImpl#getParameterBlock()
		 * @generated
		 */
		EClass PARAMETER_BLOCK = eINSTANCE.getParameterBlock();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_BLOCK__DIRECTION = eINSTANCE.getParameterBlock_Direction();

		/**
		 * The meta object literal for the '{@link UISL.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.EventImpl
		 * @see UISL.impl.UISLPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link UISL.impl.CatchingEventImpl <em>Catching Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.CatchingEventImpl
		 * @see UISL.impl.UISLPackageImpl#getCatchingEvent()
		 * @generated
		 */
		EClass CATCHING_EVENT = eINSTANCE.getCatchingEvent();

		/**
		 * The meta object literal for the '{@link UISL.impl.ThrowingEventImpl <em>Throwing Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ThrowingEventImpl
		 * @see UISL.impl.UISLPackageImpl#getThrowingEvent()
		 * @generated
		 */
		EClass THROWING_EVENT = eINSTANCE.getThrowingEvent();

		/**
		 * The meta object literal for the '{@link UISL.impl.ActionEventImpl <em>Action Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ActionEventImpl
		 * @see UISL.impl.UISLPackageImpl#getActionEvent()
		 * @generated
		 */
		EClass ACTION_EVENT = eINSTANCE.getActionEvent();

		/**
		 * The meta object literal for the '{@link UISL.impl.DSLGUIImpl <em>DSLGUI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.DSLGUIImpl
		 * @see UISL.impl.UISLPackageImpl#getDSLGUI()
		 * @generated
		 */
		EClass DSLGUI = eINSTANCE.getDSLGUI();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Model Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DSLGUI__INTERACTION_FLOW_MODEL_ELEMENT = eINSTANCE.getDSLGUI_InteractionFlowModelElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSLGUI__NAME = eINSTANCE.getDSLGUI_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DSLGUI__DESCRIPTION = eINSTANCE.getDSLGUI_Description();

		/**
		 * The meta object literal for the '{@link UISL.impl.FormComponentImpl <em>Form Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.FormComponentImpl
		 * @see UISL.impl.UISLPackageImpl#getFormComponent()
		 * @generated
		 */
		EClass FORM_COMPONENT = eINSTANCE.getFormComponent();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_COMPONENT__FIELDS = eINSTANCE.getFormComponent_Fields();

		/**
		 * The meta object literal for the '{@link UISL.impl.ListComponentImpl <em>List Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ListComponentImpl
		 * @see UISL.impl.UISLPackageImpl#getListComponent()
		 * @generated
		 */
		EClass LIST_COMPONENT = eINSTANCE.getListComponent();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_COMPONENT__COLUMNS = eINSTANCE.getListComponent_Columns();

		/**
		 * The meta object literal for the '{@link UISL.impl.MessageComponentImpl <em>Message Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.MessageComponentImpl
		 * @see UISL.impl.UISLPackageImpl#getMessageComponent()
		 * @generated
		 */
		EClass MESSAGE_COMPONENT = eINSTANCE.getMessageComponent();

		/**
		 * The meta object literal for the '<em><b>Msg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_COMPONENT__MSG = eINSTANCE.getMessageComponent_Msg();

		/**
		 * The meta object literal for the '{@link UISL.impl.DetailsComponentImpl <em>Details Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.DetailsComponentImpl
		 * @see UISL.impl.UISLPackageImpl#getDetailsComponent()
		 * @generated
		 */
		EClass DETAILS_COMPONENT = eINSTANCE.getDetailsComponent();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_COMPONENT__OPTIONS = eINSTANCE.getDetailsComponent_Options();

		/**
		 * The meta object literal for the '{@link UISL.impl.ViewElementEventImpl <em>View Element Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ViewElementEventImpl
		 * @see UISL.impl.UISLPackageImpl#getViewElementEvent()
		 * @generated
		 */
		EClass VIEW_ELEMENT_EVENT = eINSTANCE.getViewElementEvent();

		/**
		 * The meta object literal for the '<em><b>Viewelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VIEW_ELEMENT_EVENT__VIEWELEMENT = eINSTANCE.getViewElementEvent_Viewelement();

		/**
		 * The meta object literal for the '{@link UISL.impl.ActionBlockImpl <em>Action Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ActionBlockImpl
		 * @see UISL.impl.UISLPackageImpl#getActionBlock()
		 * @generated
		 */
		EClass ACTION_BLOCK = eINSTANCE.getActionBlock();

		/**
		 * The meta object literal for the '<em><b>Action Event</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BLOCK__ACTION_EVENT = eINSTANCE.getActionBlock_ActionEvent();

		/**
		 * The meta object literal for the '<em><b>View Container</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BLOCK__VIEW_CONTAINER = eINSTANCE.getActionBlock_ViewContainer();

		/**
		 * The meta object literal for the '{@link UISL.impl.ModuleDefinitionImpl <em>Module Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ModuleDefinitionImpl
		 * @see UISL.impl.UISLPackageImpl#getModuleDefinition()
		 * @generated
		 */
		EClass MODULE_DEFINITION = eINSTANCE.getModuleDefinition();

		/**
		 * The meta object literal for the '<em><b>Interaction Flow Model Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__INTERACTION_FLOW_MODEL_ELEMENT = eINSTANCE
				.getModuleDefinition_InteractionFlowModelElement();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__MODULE = eINSTANCE.getModuleDefinition_Module();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__INPUT_PORT = eINSTANCE.getModuleDefinition_InputPort();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_DEFINITION__OUTPUT_PORT = eINSTANCE.getModuleDefinition_OutputPort();

		/**
		 * The meta object literal for the '{@link UISL.impl.PortDefinitionImpl <em>Port Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.PortDefinitionImpl
		 * @see UISL.impl.UISLPackageImpl#getPortDefinition()
		 * @generated
		 */
		EClass PORT_DEFINITION = eINSTANCE.getPortDefinition();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_DEFINITION__PORT = eINSTANCE.getPortDefinition_Port();

		/**
		 * The meta object literal for the '{@link UISL.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ModuleImpl
		 * @see UISL.impl.UISLPackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Moduledefinition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODULEDEFINITION = eINSTANCE.getModule_Moduledefinition();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__PORT = eINSTANCE.getModule_Port();

		/**
		 * The meta object literal for the '{@link UISL.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.PortImpl
		 * @see UISL.impl.UISLPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__MODULE = eINSTANCE.getPort_Module();

		/**
		 * The meta object literal for the '<em><b>Port Definition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PORT_DEFINITION = eINSTANCE.getPort_PortDefinition();

		/**
		 * The meta object literal for the '{@link UISL.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.impl.ColumnImpl
		 * @see UISL.impl.UISLPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__VALUE = eINSTANCE.getColumn_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '{@link UISL.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UISL.Direction
		 * @see UISL.impl.UISLPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

	}

} //UISLPackage

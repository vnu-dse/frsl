/*******************************************************************************
 * Copyright (c) 2010, 2021 Willink Transformations and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   E.D.Willink - Initial API and implementation
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   http://www.eclipse.org/ocl/2015/Library
 *   /org.eclipse.ocl.pivot/model/Pivot.ecore
 *   http://www.eclipse.org/ocl/2015/Library
 * using:
 *   /org.eclipse.ocl.pivot/model/Pivot.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package org.eclipse.ocl.pivot;

import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
// import org.eclipse.ocl.pivot.ParameterTypes;
// import org.eclipse.ocl.pivot.PivotTables;
// import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TuplePartId;
import org.eclipse.ocl.pivot.ids.TupleTypeId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorType;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * PivotTables provides the dispatch tables for the pivot for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class PivotTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final @NonNull EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(PivotPackage.eINSTANCE, IdManager.METAMODEL);

	/**
	 *	The library of all packages and types.
	 */
	public static final @NonNull ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ @NonNull RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Annotation = PivotTables.PACKid_$metamodel$.getClassId("Annotation", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_AssociationClass = PivotTables.PACKid_$metamodel$.getClassId("AssociationClass", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_AssociationClassCallExp = PivotTables.PACKid_$metamodel$.getClassId("AssociationClassCallExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_BagType = PivotTables.PACKid_$metamodel$.getClassId("BagType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Behavior = PivotTables.PACKid_$metamodel$.getClassId("Behavior", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_BooleanLiteralExp = PivotTables.PACKid_$metamodel$.getClassId("BooleanLiteralExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CallExp = PivotTables.PACKid_$metamodel$.getClassId("CallExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CallOperationAction = PivotTables.PACKid_$metamodel$.getClassId("CallOperationAction", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Class = PivotTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CollectionItem = PivotTables.PACKid_$metamodel$.getClassId("CollectionItem", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CollectionLiteralExp = PivotTables.PACKid_$metamodel$.getClassId("CollectionLiteralExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CollectionLiteralPart = PivotTables.PACKid_$metamodel$.getClassId("CollectionLiteralPart", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CollectionRange = PivotTables.PACKid_$metamodel$.getClassId("CollectionRange", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CollectionType = PivotTables.PACKid_$metamodel$.getClassId("CollectionType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Comment = PivotTables.PACKid_$metamodel$.getClassId("Comment", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CompleteClass = PivotTables.PACKid_$metamodel$.getClassId("CompleteClass", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CompleteEnvironment = PivotTables.PACKid_$metamodel$.getClassId("CompleteEnvironment", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CompleteModel = PivotTables.PACKid_$metamodel$.getClassId("CompleteModel", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_CompletePackage = PivotTables.PACKid_$metamodel$.getClassId("CompletePackage", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ConnectionPointReference = PivotTables.PACKid_$metamodel$.getClassId("ConnectionPointReference", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Constraint = PivotTables.PACKid_$metamodel$.getClassId("Constraint", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_DataType = PivotTables.PACKid_$metamodel$.getClassId("DataType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Detail = PivotTables.PACKid_$metamodel$.getClassId("Detail", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_DynamicElement = PivotTables.PACKid_$metamodel$.getClassId("DynamicElement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_DynamicProperty = PivotTables.PACKid_$metamodel$.getClassId("DynamicProperty", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_DynamicType = PivotTables.PACKid_$metamodel$.getClassId("DynamicType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Element = PivotTables.PACKid_$metamodel$.getClassId("Element", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ElementExtension = PivotTables.PACKid_$metamodel$.getClassId("ElementExtension", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_EnumLiteralExp = PivotTables.PACKid_$metamodel$.getClassId("EnumLiteralExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Enumeration = PivotTables.PACKid_$metamodel$.getClassId("Enumeration", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_EnumerationLiteral = PivotTables.PACKid_$metamodel$.getClassId("EnumerationLiteral", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ExpressionInOCL = PivotTables.PACKid_$metamodel$.getClassId("ExpressionInOCL", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Feature = PivotTables.PACKid_$metamodel$.getClassId("Feature", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_IfExp = PivotTables.PACKid_$metamodel$.getClassId("IfExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Import = PivotTables.PACKid_$metamodel$.getClassId("Import", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_InstanceSpecification = PivotTables.PACKid_$metamodel$.getClassId("InstanceSpecification", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_IntegerLiteralExp = PivotTables.PACKid_$metamodel$.getClassId("IntegerLiteralExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_IterableType = PivotTables.PACKid_$metamodel$.getClassId("IterableType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_IterateExp = PivotTables.PACKid_$metamodel$.getClassId("IterateExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Iteration = PivotTables.PACKid_$metamodel$.getClassId("Iteration", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_IteratorExp = PivotTables.PACKid_$metamodel$.getClassId("IteratorExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_IteratorVariable = PivotTables.PACKid_$metamodel$.getClassId("IteratorVariable", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_LambdaType = PivotTables.PACKid_$metamodel$.getClassId("LambdaType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_LanguageExpression = PivotTables.PACKid_$metamodel$.getClassId("LanguageExpression", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_LetExp = PivotTables.PACKid_$metamodel$.getClassId("LetExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_LetVariable = PivotTables.PACKid_$metamodel$.getClassId("LetVariable", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Library = PivotTables.PACKid_$metamodel$.getClassId("Library", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_LoopExp = PivotTables.PACKid_$metamodel$.getClassId("LoopExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_MapLiteralExp = PivotTables.PACKid_$metamodel$.getClassId("MapLiteralExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_MapLiteralPart = PivotTables.PACKid_$metamodel$.getClassId("MapLiteralPart", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_MapType = PivotTables.PACKid_$metamodel$.getClassId("MapType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_MessageExp = PivotTables.PACKid_$metamodel$.getClassId("MessageExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_MessageType = PivotTables.PACKid_$metamodel$.getClassId("MessageType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Model = PivotTables.PACKid_$metamodel$.getClassId("Model", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_NamedElement = PivotTables.PACKid_$metamodel$.getClassId("NamedElement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Namespace = PivotTables.PACKid_$metamodel$.getClassId("Namespace", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_NavigationCallExp = PivotTables.PACKid_$metamodel$.getClassId("NavigationCallExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_OCLExpression = PivotTables.PACKid_$metamodel$.getClassId("OCLExpression", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_OclElement = PivotTables.PACKid_$metamodel$.getClassId("OclElement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Operation = PivotTables.PACKid_$metamodel$.getClassId("Operation", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_OperationCallExp = PivotTables.PACKid_$metamodel$.getClassId("OperationCallExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_OppositePropertyCallExp = PivotTables.PACKid_$metamodel$.getClassId("OppositePropertyCallExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_OrderedSetType = PivotTables.PACKid_$metamodel$.getClassId("OrderedSetType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_OrphanCompletePackage = PivotTables.PACKid_$metamodel$.getClassId("OrphanCompletePackage", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Package = PivotTables.PACKid_$metamodel$.getClassId("Package", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Parameter = PivotTables.PACKid_$metamodel$.getClassId("Parameter", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ParameterVariable = PivotTables.PACKid_$metamodel$.getClassId("ParameterVariable", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Precedence = PivotTables.PACKid_$metamodel$.getClassId("Precedence", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_PrimitiveCompletePackage = PivotTables.PACKid_$metamodel$.getClassId("PrimitiveCompletePackage", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_PrimitiveType = PivotTables.PACKid_$metamodel$.getClassId("PrimitiveType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Profile = PivotTables.PACKid_$metamodel$.getClassId("Profile", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ProfileApplication = PivotTables.PACKid_$metamodel$.getClassId("ProfileApplication", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Property = PivotTables.PACKid_$metamodel$.getClassId("Property", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_PropertyCallExp = PivotTables.PACKid_$metamodel$.getClassId("PropertyCallExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Pseudostate = PivotTables.PACKid_$metamodel$.getClassId("Pseudostate", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Region = PivotTables.PACKid_$metamodel$.getClassId("Region", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ResultVariable = PivotTables.PACKid_$metamodel$.getClassId("ResultVariable", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_SelfType = PivotTables.PACKid_$metamodel$.getClassId("SelfType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_SendSignalAction = PivotTables.PACKid_$metamodel$.getClassId("SendSignalAction", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_SequenceType = PivotTables.PACKid_$metamodel$.getClassId("SequenceType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_SetType = PivotTables.PACKid_$metamodel$.getClassId("SetType", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ShadowExp = PivotTables.PACKid_$metamodel$.getClassId("ShadowExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ShadowPart = PivotTables.PACKid_$metamodel$.getClassId("ShadowPart", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Signal = PivotTables.PACKid_$metamodel$.getClassId("Signal", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Slot = PivotTables.PACKid_$metamodel$.getClassId("Slot", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_StandardLibrary = PivotTables.PACKid_$metamodel$.getClassId("StandardLibrary", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_State = PivotTables.PACKid_$metamodel$.getClassId("State", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_StateExp = PivotTables.PACKid_$metamodel$.getClassId("StateExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_StateMachine = PivotTables.PACKid_$metamodel$.getClassId("StateMachine", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Stereotype = PivotTables.PACKid_$metamodel$.getClassId("Stereotype", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_StereotypeExtender = PivotTables.PACKid_$metamodel$.getClassId("StereotypeExtender", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_TemplateBinding = PivotTables.PACKid_$metamodel$.getClassId("TemplateBinding", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_TemplateParameter = PivotTables.PACKid_$metamodel$.getClassId("TemplateParameter", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_TemplateParameterSubstitution = PivotTables.PACKid_$metamodel$.getClassId("TemplateParameterSubstitution", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_TemplateSignature = PivotTables.PACKid_$metamodel$.getClassId("TemplateSignature", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_TemplateableElement = PivotTables.PACKid_$metamodel$.getClassId("TemplateableElement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Transition = PivotTables.PACKid_$metamodel$.getClassId("Transition", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Trigger = PivotTables.PACKid_$metamodel$.getClassId("Trigger", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_TupleLiteralExp = PivotTables.PACKid_$metamodel$.getClassId("TupleLiteralExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_TupleLiteralPart = PivotTables.PACKid_$metamodel$.getClassId("TupleLiteralPart", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Type = PivotTables.PACKid_$metamodel$.getClassId("Type", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_TypeExp = PivotTables.PACKid_$metamodel$.getClassId("TypeExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_TypedElement = PivotTables.PACKid_$metamodel$.getClassId("TypedElement", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_ValueSpecification = PivotTables.PACKid_$metamodel$.getClassId("ValueSpecification", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Variable = PivotTables.PACKid_$metamodel$.getClassId("Variable", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_VariableDeclaration = PivotTables.PACKid_$metamodel$.getClassId("VariableDeclaration", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_VariableExp = PivotTables.PACKid_$metamodel$.getClassId("VariableExp", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_Vertex = PivotTables.PACKid_$metamodel$.getClassId("Vertex", 0);
	public static final /*@NonInvalid*/ @NonNull ClassId CLSSid_WildcardType = PivotTables.PACKid_$metamodel$.getClassId("WildcardType", 0);
	public static final /*@NonInvalid*/ @NonNull DataTypeId DATAid_LibraryFeature = PivotTables.PACKid_$metamodel$.getDataTypeId("LibraryFeature", 0);
	public static final /*@NonInvalid*/ @NonNull DataTypeId DATAid_Object = PivotTables.PACKid_$metamodel$.getDataTypeId("Object", 0);
	public static final /*@NonInvalid*/ @NonNull EnumerationId ENUMid_AssociativityKind = PivotTables.PACKid_$metamodel$.getEnumerationId("AssociativityKind");
	public static final /*@NonInvalid*/ @NonNull EnumerationId ENUMid_CollectionKind = PivotTables.PACKid_$metamodel$.getEnumerationId("CollectionKind");
	public static final /*@NonInvalid*/ @NonNull EnumerationId ENUMid_PseudostateKind = PivotTables.PACKid_$metamodel$.getEnumerationId("PseudostateKind");
	public static final /*@NonInvalid*/ @NonNull EnumerationId ENUMid_TransitionKind = PivotTables.PACKid_$metamodel$.getEnumerationId("TransitionKind");
	public static final /*@NonInvalid*/ @NonNull IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ @NonNull IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ @NonNull TuplePartId PARTid_ = IdManager.getTuplePartId(1, "status", TypeId.BOOLEAN);
	public static final /*@NonInvalid*/ @NonNull TuplePartId PARTid__0 = IdManager.getTuplePartId(0, "message", TypeId.STRING);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_PRIMid_Integer = TypeId.SEQUENCE.getSpecializedId(TypeId.INTEGER);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ @NonNull String STR_Missing_32_initializers_c = "Missing initializers:";
	public static final /*@NonInvalid*/ @NonNull String STR_Unexpected_32_initializers_c = "Unexpected initializers:";
	public static final /*@NonInvalid*/ @NonNull String STR__32 = " ";
	public static final /*@NonInvalid*/ @NonNull String STR_closure = "closure";
	public static final /*@NonInvalid*/ @NonNull String STR_collect = "collect";
	public static final /*@NonInvalid*/ @NonNull String STR_ocl = "ocl";
	public static final /*@NonInvalid*/ @NonNull String STR_sortedBy = "sortedBy";
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_Annotation = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_Annotation);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_AssociationClassCallExp = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_AssociationClassCallExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_CallOperationAction = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_CallOperationAction);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_Class = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_Class);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_CollectionType = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_CollectionType);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_CompleteClass = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_CompleteClass);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_CompleteModel = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_CompleteModel);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_CompletePackage = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_CompletePackage);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_ConnectionPointReference = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_ConnectionPointReference);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_Constraint = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_Constraint);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_DataType = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_DataType);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_DynamicElement = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_DynamicElement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_DynamicProperty = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_DynamicProperty);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_ElementExtension = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_ElementExtension);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_EnumLiteralExp = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_EnumLiteralExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_Import = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_Import);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_InstanceSpecification = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_InstanceSpecification);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_LambdaType = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_LambdaType);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_LoopExp = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_LoopExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_MapType = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_MapType);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_MessageType = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_MessageType);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_NavigationCallExp = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_NavigationCallExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_OCLExpression = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_OCLExpression);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_Operation = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_Operation);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_OperationCallExp = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_OperationCallExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_OppositePropertyCallExp = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_OppositePropertyCallExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_Package = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_Package);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_PrimitiveType = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_PrimitiveType);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_Property = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_Property);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_PropertyCallExp = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_PropertyCallExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_Region = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_Region);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_SendSignalAction = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_SendSignalAction);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_ShadowPart = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_ShadowPart);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_Slot = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_Slot);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_State = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_State);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_StateExp = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_StateExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_StateMachine = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_StateMachine);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_TemplateBinding = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_TemplateBinding);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_TemplateParameter = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_TemplateParameter);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_TemplateParameterSubstitution = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_TemplateParameterSubstitution);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_TemplateableElement = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_TemplateableElement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_TypeExp = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_TypeExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_TypedElement = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_TypedElement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_Variable = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_Variable);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_VariableDeclaration = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_VariableDeclaration);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_VariableExp = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_VariableExp);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId BAG_CLSSid_WildcardType = TypeId.BAG.getSpecializedId(PivotTables.CLSSid_WildcardType);
	public static final /*@NonInvalid*/ @NonNull EnumerationLiteralId ELITid_Bag = PivotTables.ENUMid_CollectionKind.getEnumerationLiteralId("Bag");
	public static final /*@NonInvalid*/ @NonNull EnumerationLiteralId ELITid_Collection = PivotTables.ENUMid_CollectionKind.getEnumerationLiteralId("Collection");
	public static final /*@NonInvalid*/ @NonNull EnumerationLiteralId ELITid_OrderedSet = PivotTables.ENUMid_CollectionKind.getEnumerationLiteralId("OrderedSet");
	public static final /*@NonInvalid*/ @NonNull EnumerationLiteralId ELITid_Sequence = PivotTables.ENUMid_CollectionKind.getEnumerationLiteralId("Sequence");
	public static final /*@NonInvalid*/ @NonNull EnumerationLiteralId ELITid_Set = PivotTables.ENUMid_CollectionKind.getEnumerationLiteralId("Set");
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_CollectionLiteralPart = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_CollectionLiteralPart);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_Detail = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_Detail);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_Element = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_Element);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_EnumerationLiteral = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_EnumerationLiteral);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_Import = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_Import);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_MapLiteralPart = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_MapLiteralPart);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_NamedElement = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_NamedElement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_OCLExpression = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_OCLExpression);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_Operation = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_Operation);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_Parameter = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_Parameter);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_Precedence = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_Precedence);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_Property = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_Property);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_ShadowPart = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_ShadowPart);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_TemplateParameter = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_TemplateParameter);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_TupleLiteralPart = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_TupleLiteralPart);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_ValueSpecification = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_ValueSpecification);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId ORD_CLSSid_Variable = TypeId.ORDERED_SET.getSpecializedId(PivotTables.CLSSid_Variable);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_Property = TypeId.SEQUENCE.getSpecializedId(PivotTables.CLSSid_Property);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SEQ_CLSSid_Type = TypeId.SEQUENCE.getSpecializedId(PivotTables.CLSSid_Type);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Behavior = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Behavior);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_CallOperationAction = TypeId.SET.getSpecializedId(PivotTables.CLSSid_CallOperationAction);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Class = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Class);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Comment = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Comment);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_CompleteClass = TypeId.SET.getSpecializedId(PivotTables.CLSSid_CompleteClass);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_CompletePackage = TypeId.SET.getSpecializedId(PivotTables.CLSSid_CompletePackage);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_ConnectionPointReference = TypeId.SET.getSpecializedId(PivotTables.CLSSid_ConnectionPointReference);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Constraint = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Constraint);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_DynamicProperty = TypeId.SET.getSpecializedId(PivotTables.CLSSid_DynamicProperty);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Element = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Element);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_ElementExtension = TypeId.SET.getSpecializedId(PivotTables.CLSSid_ElementExtension);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_InstanceSpecification = TypeId.SET.getSpecializedId(PivotTables.CLSSid_InstanceSpecification);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Model = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Model);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_NamedElement = TypeId.SET.getSpecializedId(PivotTables.CLSSid_NamedElement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_OCLExpression = TypeId.SET.getSpecializedId(PivotTables.CLSSid_OCLExpression);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_OclElement = TypeId.SET.getSpecializedId(PivotTables.CLSSid_OclElement);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Operation = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Operation);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Package = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Package);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_ProfileApplication = TypeId.SET.getSpecializedId(PivotTables.CLSSid_ProfileApplication);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Property = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Property);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Pseudostate = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Pseudostate);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Region = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Region);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_SendSignalAction = TypeId.SET.getSpecializedId(PivotTables.CLSSid_SendSignalAction);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Slot = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Slot);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_State = TypeId.SET.getSpecializedId(PivotTables.CLSSid_State);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_StateMachine = TypeId.SET.getSpecializedId(PivotTables.CLSSid_StateMachine);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_StereotypeExtender = TypeId.SET.getSpecializedId(PivotTables.CLSSid_StereotypeExtender);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_TemplateBinding = TypeId.SET.getSpecializedId(PivotTables.CLSSid_TemplateBinding);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_TemplateParameterSubstitution = TypeId.SET.getSpecializedId(PivotTables.CLSSid_TemplateParameterSubstitution);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Transition = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Transition);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Trigger = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Trigger);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Type = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Type);
	public static final /*@NonInvalid*/ @NonNull CollectionTypeId SET_CLSSid_Vertex = TypeId.SET.getSpecializedId(PivotTables.CLSSid_Vertex);
	public static final /*@NonInvalid*/ @NonNull TupleTypeId TUPLid_ = IdManager.getTupleTypeId("Tuple", PivotTables.PARTid__0, PivotTables.PARTid_);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			PivotTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PivotTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final @NonNull EcoreExecutorType _Annotation = new EcoreExecutorType(PivotPackage.Literals.ANNOTATION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _AnyType = new EcoreExecutorType(PivotPackage.Literals.ANY_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _AssociationClass = new EcoreExecutorType(PivotPackage.Literals.ASSOCIATION_CLASS, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _AssociationClassCallExp = new EcoreExecutorType(PivotPackage.Literals.ASSOCIATION_CLASS_CALL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorEnumeration _AssociativityKind = new EcoreExecutorEnumeration(PivotPackage.Literals.ASSOCIATIVITY_KIND, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _BagType = new EcoreExecutorType(PivotPackage.Literals.BAG_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Behavior = new EcoreExecutorType(PivotPackage.Literals.BEHAVIOR, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _BooleanLiteralExp = new EcoreExecutorType(PivotPackage.Literals.BOOLEAN_LITERAL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _CallExp = new EcoreExecutorType(PivotPackage.Literals.CALL_EXP, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _CallOperationAction = new EcoreExecutorType(PivotPackage.Literals.CALL_OPERATION_ACTION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Class = new EcoreExecutorType(PivotPackage.Literals.CLASS, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _CollectionItem = new EcoreExecutorType(PivotPackage.Literals.COLLECTION_ITEM, PACKAGE, 0);
		public static final @NonNull EcoreExecutorEnumeration _CollectionKind = new EcoreExecutorEnumeration(PivotPackage.Literals.COLLECTION_KIND, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _CollectionLiteralExp = new EcoreExecutorType(PivotPackage.Literals.COLLECTION_LITERAL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _CollectionLiteralPart = new EcoreExecutorType(PivotPackage.Literals.COLLECTION_LITERAL_PART, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _CollectionRange = new EcoreExecutorType(PivotPackage.Literals.COLLECTION_RANGE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _CollectionType = new EcoreExecutorType(PivotPackage.Literals.COLLECTION_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Comment = new EcoreExecutorType(PivotPackage.Literals.COMMENT, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _CompleteClass = new EcoreExecutorType(PivotPackage.Literals.COMPLETE_CLASS, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _CompleteEnvironment = new EcoreExecutorType(PivotPackage.Literals.COMPLETE_ENVIRONMENT, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _CompleteModel = new EcoreExecutorType(PivotPackage.Literals.COMPLETE_MODEL, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _CompletePackage = new EcoreExecutorType(PivotPackage.Literals.COMPLETE_PACKAGE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _ConnectionPointReference = new EcoreExecutorType(PivotPackage.Literals.CONNECTION_POINT_REFERENCE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Constraint = new EcoreExecutorType(PivotPackage.Literals.CONSTRAINT, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _DataType = new EcoreExecutorType(PivotPackage.Literals.DATA_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Detail = new EcoreExecutorType(PivotPackage.Literals.DETAIL, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _DynamicBehavior = new EcoreExecutorType(PivotPackage.Literals.DYNAMIC_BEHAVIOR, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _DynamicElement = new EcoreExecutorType(PivotPackage.Literals.DYNAMIC_ELEMENT, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _DynamicProperty = new EcoreExecutorType(PivotPackage.Literals.DYNAMIC_PROPERTY, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _DynamicType = new EcoreExecutorType(PivotPackage.Literals.DYNAMIC_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _DynamicValueSpecification = new EcoreExecutorType(PivotPackage.Literals.DYNAMIC_VALUE_SPECIFICATION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Element = new EcoreExecutorType(PivotPackage.Literals.ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _ElementExtension = new EcoreExecutorType(PivotPackage.Literals.ELEMENT_EXTENSION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _EnumLiteralExp = new EcoreExecutorType(PivotPackage.Literals.ENUM_LITERAL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Enumeration = new EcoreExecutorType(PivotPackage.Literals.ENUMERATION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _EnumerationLiteral = new EcoreExecutorType(PivotPackage.Literals.ENUMERATION_LITERAL, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _ExpressionInOCL = new EcoreExecutorType(PivotPackage.Literals.EXPRESSION_IN_OCL, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Feature = new EcoreExecutorType(PivotPackage.Literals.FEATURE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _FeatureCallExp = new EcoreExecutorType(PivotPackage.Literals.FEATURE_CALL_EXP, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _FinalState = new EcoreExecutorType(PivotPackage.Literals.FINAL_STATE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _IfExp = new EcoreExecutorType(PivotPackage.Literals.IF_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Import = new EcoreExecutorType(PivotPackage.Literals.IMPORT, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _InstanceSpecification = new EcoreExecutorType(PivotPackage.Literals.INSTANCE_SPECIFICATION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _IntegerLiteralExp = new EcoreExecutorType(PivotPackage.Literals.INTEGER_LITERAL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _InvalidLiteralExp = new EcoreExecutorType(PivotPackage.Literals.INVALID_LITERAL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _InvalidType = new EcoreExecutorType(PivotPackage.Literals.INVALID_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _IterableType = new EcoreExecutorType(PivotPackage.Literals.ITERABLE_TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _IterateExp = new EcoreExecutorType(PivotPackage.Literals.ITERATE_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Iteration = new EcoreExecutorType(PivotPackage.Literals.ITERATION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _IteratorExp = new EcoreExecutorType(PivotPackage.Literals.ITERATOR_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _IteratorVariable = new EcoreExecutorType(PivotPackage.Literals.ITERATOR_VARIABLE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _LambdaType = new EcoreExecutorType(PivotPackage.Literals.LAMBDA_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _LanguageExpression = new EcoreExecutorType(PivotPackage.Literals.LANGUAGE_EXPRESSION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _LetExp = new EcoreExecutorType(PivotPackage.Literals.LET_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _LetVariable = new EcoreExecutorType(PivotPackage.Literals.LET_VARIABLE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Library = new EcoreExecutorType(PivotPackage.Literals.LIBRARY, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _LibraryFeature = new EcoreExecutorType("LibraryFeature", PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _LiteralExp = new EcoreExecutorType(PivotPackage.Literals.LITERAL_EXP, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _LoopExp = new EcoreExecutorType(PivotPackage.Literals.LOOP_EXP, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _MapLiteralExp = new EcoreExecutorType(PivotPackage.Literals.MAP_LITERAL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _MapLiteralPart = new EcoreExecutorType(PivotPackage.Literals.MAP_LITERAL_PART, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _MapType = new EcoreExecutorType(PivotPackage.Literals.MAP_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _MessageExp = new EcoreExecutorType(PivotPackage.Literals.MESSAGE_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _MessageType = new EcoreExecutorType(PivotPackage.Literals.MESSAGE_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Model = new EcoreExecutorType(PivotPackage.Literals.MODEL, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _MorePivotable = new EcoreExecutorType(PivotPackage.Literals.MORE_PIVOTABLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _Nameable = new EcoreExecutorType(PivotPackage.Literals.NAMEABLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _NamedElement = new EcoreExecutorType(PivotPackage.Literals.NAMED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _Namespace = new EcoreExecutorType(PivotPackage.Literals.NAMESPACE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _NavigationCallExp = new EcoreExecutorType(PivotPackage.Literals.NAVIGATION_CALL_EXP, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _NullLiteralExp = new EcoreExecutorType(PivotPackage.Literals.NULL_LITERAL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _NumericLiteralExp = new EcoreExecutorType(PivotPackage.Literals.NUMERIC_LITERAL_EXP, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _OCLExpression = new EcoreExecutorType(PivotPackage.Literals.OCL_EXPRESSION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _Object = new EcoreExecutorType("Object", PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Operation = new EcoreExecutorType(PivotPackage.Literals.OPERATION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _OperationCallExp = new EcoreExecutorType(PivotPackage.Literals.OPERATION_CALL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _OppositePropertyCallExp = new EcoreExecutorType(PivotPackage.Literals.OPPOSITE_PROPERTY_CALL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _OrderedSetType = new EcoreExecutorType(PivotPackage.Literals.ORDERED_SET_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _OrphanCompletePackage = new EcoreExecutorType(PivotPackage.Literals.ORPHAN_COMPLETE_PACKAGE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Package = new EcoreExecutorType(PivotPackage.Literals.PACKAGE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Parameter = new EcoreExecutorType(PivotPackage.Literals.PARAMETER, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _ParameterVariable = new EcoreExecutorType(PivotPackage.Literals.PARAMETER_VARIABLE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Pivotable = new EcoreExecutorType(PivotPackage.Literals.PIVOTABLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _Precedence = new EcoreExecutorType(PivotPackage.Literals.PRECEDENCE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _PrimitiveCompletePackage = new EcoreExecutorType(PivotPackage.Literals.PRIMITIVE_COMPLETE_PACKAGE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _PrimitiveLiteralExp = new EcoreExecutorType(PivotPackage.Literals.PRIMITIVE_LITERAL_EXP, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _PrimitiveType = new EcoreExecutorType(PivotPackage.Literals.PRIMITIVE_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Profile = new EcoreExecutorType(PivotPackage.Literals.PROFILE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _ProfileApplication = new EcoreExecutorType(PivotPackage.Literals.PROFILE_APPLICATION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Property = new EcoreExecutorType(PivotPackage.Literals.PROPERTY, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _PropertyCallExp = new EcoreExecutorType(PivotPackage.Literals.PROPERTY_CALL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Pseudostate = new EcoreExecutorType(PivotPackage.Literals.PSEUDOSTATE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorEnumeration _PseudostateKind = new EcoreExecutorEnumeration(PivotPackage.Literals.PSEUDOSTATE_KIND, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _RealLiteralExp = new EcoreExecutorType(PivotPackage.Literals.REAL_LITERAL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _ReferringElement = new EcoreExecutorType(PivotPackage.Literals.REFERRING_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _Region = new EcoreExecutorType(PivotPackage.Literals.REGION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _ResultVariable = new EcoreExecutorType(PivotPackage.Literals.RESULT_VARIABLE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _SelfType = new EcoreExecutorType(PivotPackage.Literals.SELF_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _SendSignalAction = new EcoreExecutorType(PivotPackage.Literals.SEND_SIGNAL_ACTION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _SequenceType = new EcoreExecutorType(PivotPackage.Literals.SEQUENCE_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _SetType = new EcoreExecutorType(PivotPackage.Literals.SET_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _ShadowExp = new EcoreExecutorType(PivotPackage.Literals.SHADOW_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _ShadowPart = new EcoreExecutorType(PivotPackage.Literals.SHADOW_PART, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Signal = new EcoreExecutorType(PivotPackage.Literals.SIGNAL, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Slot = new EcoreExecutorType(PivotPackage.Literals.SLOT, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _StandardLibrary = new EcoreExecutorType(PivotPackage.Literals.STANDARD_LIBRARY, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _State = new EcoreExecutorType(PivotPackage.Literals.STATE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _StateExp = new EcoreExecutorType(PivotPackage.Literals.STATE_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _StateMachine = new EcoreExecutorType(PivotPackage.Literals.STATE_MACHINE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Stereotype = new EcoreExecutorType(PivotPackage.Literals.STEREOTYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _StereotypeExtender = new EcoreExecutorType(PivotPackage.Literals.STEREOTYPE_EXTENDER, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _StringLiteralExp = new EcoreExecutorType(PivotPackage.Literals.STRING_LITERAL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _TemplateBinding = new EcoreExecutorType(PivotPackage.Literals.TEMPLATE_BINDING, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _TemplateParameter = new EcoreExecutorType(PivotPackage.Literals.TEMPLATE_PARAMETER, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _TemplateParameterSubstitution = new EcoreExecutorType(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _TemplateSignature = new EcoreExecutorType(PivotPackage.Literals.TEMPLATE_SIGNATURE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _TemplateableElement = new EcoreExecutorType(PivotPackage.Literals.TEMPLATEABLE_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _Throwable = new EcoreExecutorType("Throwable", PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Transition = new EcoreExecutorType(PivotPackage.Literals.TRANSITION, PACKAGE, 0);
		public static final @NonNull EcoreExecutorEnumeration _TransitionKind = new EcoreExecutorEnumeration(PivotPackage.Literals.TRANSITION_KIND, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Trigger = new EcoreExecutorType(PivotPackage.Literals.TRIGGER, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _TupleLiteralExp = new EcoreExecutorType(PivotPackage.Literals.TUPLE_LITERAL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _TupleLiteralPart = new EcoreExecutorType(PivotPackage.Literals.TUPLE_LITERAL_PART, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _TupleType = new EcoreExecutorType(PivotPackage.Literals.TUPLE_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Type = new EcoreExecutorType(PivotPackage.Literals.TYPE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _TypeExp = new EcoreExecutorType(PivotPackage.Literals.TYPE_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _TypedElement = new EcoreExecutorType(PivotPackage.Literals.TYPED_ELEMENT, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _UnlimitedNaturalLiteralExp = new EcoreExecutorType(PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _UnspecifiedValueExp = new EcoreExecutorType(PivotPackage.Literals.UNSPECIFIED_VALUE_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _ValueSpecification = new EcoreExecutorType(PivotPackage.Literals.VALUE_SPECIFICATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _Variable = new EcoreExecutorType(PivotPackage.Literals.VARIABLE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _VariableDeclaration = new EcoreExecutorType(PivotPackage.Literals.VARIABLE_DECLARATION, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _VariableExp = new EcoreExecutorType(PivotPackage.Literals.VARIABLE_EXP, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _Vertex = new EcoreExecutorType(PivotPackage.Literals.VERTEX, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _Visitable = new EcoreExecutorType(PivotPackage.Literals.VISITABLE, PACKAGE, 0 | ExecutorType.ABSTRACT);
		public static final @NonNull EcoreExecutorType _VoidType = new EcoreExecutorType(PivotPackage.Literals.VOID_TYPE, PACKAGE, 0);
		public static final @NonNull EcoreExecutorType _WildcardType = new EcoreExecutorType(PivotPackage.Literals.WILDCARD_TYPE, PACKAGE, 0);

		private static final @NonNull EcoreExecutorType @NonNull [] types = {
			_Annotation,
			_AnyType,
			_AssociationClass,
			_AssociationClassCallExp,
			_AssociativityKind,
			_BagType,
			_Behavior,
			_BooleanLiteralExp,
			_CallExp,
			_CallOperationAction,
			_Class,
			_CollectionItem,
			_CollectionKind,
			_CollectionLiteralExp,
			_CollectionLiteralPart,
			_CollectionRange,
			_CollectionType,
			_Comment,
			_CompleteClass,
			_CompleteEnvironment,
			_CompleteModel,
			_CompletePackage,
			_ConnectionPointReference,
			_Constraint,
			_DataType,
			_Detail,
			_DynamicBehavior,
			_DynamicElement,
			_DynamicProperty,
			_DynamicType,
			_DynamicValueSpecification,
			_Element,
			_ElementExtension,
			_EnumLiteralExp,
			_Enumeration,
			_EnumerationLiteral,
			_ExpressionInOCL,
			_Feature,
			_FeatureCallExp,
			_FinalState,
			_IfExp,
			_Import,
			_InstanceSpecification,
			_IntegerLiteralExp,
			_InvalidLiteralExp,
			_InvalidType,
			_IterableType,
			_IterateExp,
			_Iteration,
			_IteratorExp,
			_IteratorVariable,
			_LambdaType,
			_LanguageExpression,
			_LetExp,
			_LetVariable,
			_Library,
			_LibraryFeature,
			_LiteralExp,
			_LoopExp,
			_MapLiteralExp,
			_MapLiteralPart,
			_MapType,
			_MessageExp,
			_MessageType,
			_Model,
			_MorePivotable,
			_Nameable,
			_NamedElement,
			_Namespace,
			_NavigationCallExp,
			_NullLiteralExp,
			_NumericLiteralExp,
			_OCLExpression,
			_Object,
			_Operation,
			_OperationCallExp,
			_OppositePropertyCallExp,
			_OrderedSetType,
			_OrphanCompletePackage,
			_Package,
			_Parameter,
			_ParameterVariable,
			_Pivotable,
			_Precedence,
			_PrimitiveCompletePackage,
			_PrimitiveLiteralExp,
			_PrimitiveType,
			_Profile,
			_ProfileApplication,
			_Property,
			_PropertyCallExp,
			_Pseudostate,
			_PseudostateKind,
			_RealLiteralExp,
			_ReferringElement,
			_Region,
			_ResultVariable,
			_SelfType,
			_SendSignalAction,
			_SequenceType,
			_SetType,
			_ShadowExp,
			_ShadowPart,
			_Signal,
			_Slot,
			_StandardLibrary,
			_State,
			_StateExp,
			_StateMachine,
			_Stereotype,
			_StereotypeExtender,
			_StringLiteralExp,
			_TemplateBinding,
			_TemplateParameter,
			_TemplateParameterSubstitution,
			_TemplateSignature,
			_TemplateableElement,
			_Throwable,
			_Transition,
			_TransitionKind,
			_Trigger,
			_TupleLiteralExp,
			_TupleLiteralPart,
			_TupleType,
			_Type,
			_TypeExp,
			_TypedElement,
			_UnlimitedNaturalLiteralExp,
			_UnspecifiedValueExp,
			_ValueSpecification,
			_Variable,
			_VariableDeclaration,
			_VariableExp,
			_Vertex,
			_Visitable,
			_VoidType,
			_WildcardType
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			LIBRARY.addExtension(OCLstdlibTables.PACKAGE, PACKAGE);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PivotTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final @NonNull ExecutorFragment _Annotation__Annotation = new ExecutorFragment(Types._Annotation, PivotTables.Types._Annotation);
		private static final @NonNull ExecutorFragment _Annotation__Element = new ExecutorFragment(Types._Annotation, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Annotation__NamedElement = new ExecutorFragment(Types._Annotation, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Annotation__OclAny = new ExecutorFragment(Types._Annotation, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Annotation__OclElement = new ExecutorFragment(Types._Annotation, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _AnyType__AnyType = new ExecutorFragment(Types._AnyType, PivotTables.Types._AnyType);
		private static final @NonNull ExecutorFragment _AnyType__Class = new ExecutorFragment(Types._AnyType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _AnyType__Element = new ExecutorFragment(Types._AnyType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _AnyType__NamedElement = new ExecutorFragment(Types._AnyType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _AnyType__Namespace = new ExecutorFragment(Types._AnyType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _AnyType__OclAny = new ExecutorFragment(Types._AnyType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _AnyType__OclElement = new ExecutorFragment(Types._AnyType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _AnyType__OclType = new ExecutorFragment(Types._AnyType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _AnyType__TemplateableElement = new ExecutorFragment(Types._AnyType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _AnyType__Type = new ExecutorFragment(Types._AnyType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _AssociationClass__AssociationClass = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._AssociationClass);
		private static final @NonNull ExecutorFragment _AssociationClass__Class = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _AssociationClass__Element = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _AssociationClass__NamedElement = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _AssociationClass__Namespace = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _AssociationClass__OclAny = new ExecutorFragment(Types._AssociationClass, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _AssociationClass__OclElement = new ExecutorFragment(Types._AssociationClass, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _AssociationClass__OclType = new ExecutorFragment(Types._AssociationClass, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _AssociationClass__TemplateableElement = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _AssociationClass__Type = new ExecutorFragment(Types._AssociationClass, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _AssociationClassCallExp__AssociationClassCallExp = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._AssociationClassCallExp);
		private static final @NonNull ExecutorFragment _AssociationClassCallExp__CallExp = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._CallExp);
		private static final @NonNull ExecutorFragment _AssociationClassCallExp__Element = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _AssociationClassCallExp__FeatureCallExp = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._FeatureCallExp);
		private static final @NonNull ExecutorFragment _AssociationClassCallExp__NamedElement = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _AssociationClassCallExp__NavigationCallExp = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._NavigationCallExp);
		private static final @NonNull ExecutorFragment _AssociationClassCallExp__OCLExpression = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _AssociationClassCallExp__OclAny = new ExecutorFragment(Types._AssociationClassCallExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _AssociationClassCallExp__OclElement = new ExecutorFragment(Types._AssociationClassCallExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _AssociationClassCallExp__TypedElement = new ExecutorFragment(Types._AssociationClassCallExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _AssociativityKind__AssociativityKind = new ExecutorFragment(Types._AssociativityKind, PivotTables.Types._AssociativityKind);
		private static final @NonNull ExecutorFragment _AssociativityKind__OclAny = new ExecutorFragment(Types._AssociativityKind, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _AssociativityKind__OclElement = new ExecutorFragment(Types._AssociativityKind, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _AssociativityKind__OclEnumeration = new ExecutorFragment(Types._AssociativityKind, OCLstdlibTables.Types._OclEnumeration);
		private static final @NonNull ExecutorFragment _AssociativityKind__OclType = new ExecutorFragment(Types._AssociativityKind, OCLstdlibTables.Types._OclType);

		private static final @NonNull ExecutorFragment _BagType__BagType = new ExecutorFragment(Types._BagType, PivotTables.Types._BagType);
		private static final @NonNull ExecutorFragment _BagType__Class = new ExecutorFragment(Types._BagType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _BagType__CollectionType = new ExecutorFragment(Types._BagType, PivotTables.Types._CollectionType);
		private static final @NonNull ExecutorFragment _BagType__DataType = new ExecutorFragment(Types._BagType, PivotTables.Types._DataType);
		private static final @NonNull ExecutorFragment _BagType__Element = new ExecutorFragment(Types._BagType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _BagType__IterableType = new ExecutorFragment(Types._BagType, PivotTables.Types._IterableType);
		private static final @NonNull ExecutorFragment _BagType__NamedElement = new ExecutorFragment(Types._BagType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _BagType__Namespace = new ExecutorFragment(Types._BagType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _BagType__OclAny = new ExecutorFragment(Types._BagType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _BagType__OclElement = new ExecutorFragment(Types._BagType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _BagType__OclType = new ExecutorFragment(Types._BagType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _BagType__TemplateableElement = new ExecutorFragment(Types._BagType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _BagType__Type = new ExecutorFragment(Types._BagType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _Behavior__Behavior = new ExecutorFragment(Types._Behavior, PivotTables.Types._Behavior);
		private static final @NonNull ExecutorFragment _Behavior__Class = new ExecutorFragment(Types._Behavior, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _Behavior__Element = new ExecutorFragment(Types._Behavior, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Behavior__NamedElement = new ExecutorFragment(Types._Behavior, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Behavior__Namespace = new ExecutorFragment(Types._Behavior, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Behavior__OclAny = new ExecutorFragment(Types._Behavior, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Behavior__OclElement = new ExecutorFragment(Types._Behavior, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Behavior__OclType = new ExecutorFragment(Types._Behavior, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _Behavior__TemplateableElement = new ExecutorFragment(Types._Behavior, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _Behavior__Type = new ExecutorFragment(Types._Behavior, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _BooleanLiteralExp__BooleanLiteralExp = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._BooleanLiteralExp);
		private static final @NonNull ExecutorFragment _BooleanLiteralExp__Element = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _BooleanLiteralExp__LiteralExp = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _BooleanLiteralExp__NamedElement = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _BooleanLiteralExp__OCLExpression = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _BooleanLiteralExp__OclAny = new ExecutorFragment(Types._BooleanLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _BooleanLiteralExp__OclElement = new ExecutorFragment(Types._BooleanLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _BooleanLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		private static final @NonNull ExecutorFragment _BooleanLiteralExp__TypedElement = new ExecutorFragment(Types._BooleanLiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _CallExp__CallExp = new ExecutorFragment(Types._CallExp, PivotTables.Types._CallExp);
		private static final @NonNull ExecutorFragment _CallExp__Element = new ExecutorFragment(Types._CallExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _CallExp__NamedElement = new ExecutorFragment(Types._CallExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _CallExp__OCLExpression = new ExecutorFragment(Types._CallExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _CallExp__OclAny = new ExecutorFragment(Types._CallExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CallExp__OclElement = new ExecutorFragment(Types._CallExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _CallExp__TypedElement = new ExecutorFragment(Types._CallExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _CallOperationAction__CallOperationAction = new ExecutorFragment(Types._CallOperationAction, PivotTables.Types._CallOperationAction);
		private static final @NonNull ExecutorFragment _CallOperationAction__Element = new ExecutorFragment(Types._CallOperationAction, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _CallOperationAction__NamedElement = new ExecutorFragment(Types._CallOperationAction, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _CallOperationAction__OclAny = new ExecutorFragment(Types._CallOperationAction, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CallOperationAction__OclElement = new ExecutorFragment(Types._CallOperationAction, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _Class__Class = new ExecutorFragment(Types._Class, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _Class__Element = new ExecutorFragment(Types._Class, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Class__NamedElement = new ExecutorFragment(Types._Class, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Class__Namespace = new ExecutorFragment(Types._Class, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Class__OclAny = new ExecutorFragment(Types._Class, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Class__OclElement = new ExecutorFragment(Types._Class, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Class__OclType = new ExecutorFragment(Types._Class, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _Class__TemplateableElement = new ExecutorFragment(Types._Class, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _Class__Type = new ExecutorFragment(Types._Class, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _CollectionItem__CollectionItem = new ExecutorFragment(Types._CollectionItem, PivotTables.Types._CollectionItem);
		private static final @NonNull ExecutorFragment _CollectionItem__CollectionLiteralPart = new ExecutorFragment(Types._CollectionItem, PivotTables.Types._CollectionLiteralPart);
		private static final @NonNull ExecutorFragment _CollectionItem__Element = new ExecutorFragment(Types._CollectionItem, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _CollectionItem__NamedElement = new ExecutorFragment(Types._CollectionItem, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _CollectionItem__OclAny = new ExecutorFragment(Types._CollectionItem, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CollectionItem__OclElement = new ExecutorFragment(Types._CollectionItem, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _CollectionItem__TypedElement = new ExecutorFragment(Types._CollectionItem, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _CollectionKind__CollectionKind = new ExecutorFragment(Types._CollectionKind, PivotTables.Types._CollectionKind);
		private static final @NonNull ExecutorFragment _CollectionKind__OclAny = new ExecutorFragment(Types._CollectionKind, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CollectionKind__OclElement = new ExecutorFragment(Types._CollectionKind, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _CollectionKind__OclEnumeration = new ExecutorFragment(Types._CollectionKind, OCLstdlibTables.Types._OclEnumeration);
		private static final @NonNull ExecutorFragment _CollectionKind__OclType = new ExecutorFragment(Types._CollectionKind, OCLstdlibTables.Types._OclType);

		private static final @NonNull ExecutorFragment _CollectionLiteralExp__CollectionLiteralExp = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._CollectionLiteralExp);
		private static final @NonNull ExecutorFragment _CollectionLiteralExp__Element = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _CollectionLiteralExp__LiteralExp = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _CollectionLiteralExp__NamedElement = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _CollectionLiteralExp__OCLExpression = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _CollectionLiteralExp__OclAny = new ExecutorFragment(Types._CollectionLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CollectionLiteralExp__OclElement = new ExecutorFragment(Types._CollectionLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _CollectionLiteralExp__TypedElement = new ExecutorFragment(Types._CollectionLiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _CollectionLiteralPart__CollectionLiteralPart = new ExecutorFragment(Types._CollectionLiteralPart, PivotTables.Types._CollectionLiteralPart);
		private static final @NonNull ExecutorFragment _CollectionLiteralPart__Element = new ExecutorFragment(Types._CollectionLiteralPart, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _CollectionLiteralPart__NamedElement = new ExecutorFragment(Types._CollectionLiteralPart, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _CollectionLiteralPart__OclAny = new ExecutorFragment(Types._CollectionLiteralPart, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CollectionLiteralPart__OclElement = new ExecutorFragment(Types._CollectionLiteralPart, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _CollectionLiteralPart__TypedElement = new ExecutorFragment(Types._CollectionLiteralPart, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _CollectionRange__CollectionLiteralPart = new ExecutorFragment(Types._CollectionRange, PivotTables.Types._CollectionLiteralPart);
		private static final @NonNull ExecutorFragment _CollectionRange__CollectionRange = new ExecutorFragment(Types._CollectionRange, PivotTables.Types._CollectionRange);
		private static final @NonNull ExecutorFragment _CollectionRange__Element = new ExecutorFragment(Types._CollectionRange, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _CollectionRange__NamedElement = new ExecutorFragment(Types._CollectionRange, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _CollectionRange__OclAny = new ExecutorFragment(Types._CollectionRange, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CollectionRange__OclElement = new ExecutorFragment(Types._CollectionRange, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _CollectionRange__TypedElement = new ExecutorFragment(Types._CollectionRange, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _CollectionType__Class = new ExecutorFragment(Types._CollectionType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _CollectionType__CollectionType = new ExecutorFragment(Types._CollectionType, PivotTables.Types._CollectionType);
		private static final @NonNull ExecutorFragment _CollectionType__DataType = new ExecutorFragment(Types._CollectionType, PivotTables.Types._DataType);
		private static final @NonNull ExecutorFragment _CollectionType__Element = new ExecutorFragment(Types._CollectionType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _CollectionType__IterableType = new ExecutorFragment(Types._CollectionType, PivotTables.Types._IterableType);
		private static final @NonNull ExecutorFragment _CollectionType__NamedElement = new ExecutorFragment(Types._CollectionType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _CollectionType__Namespace = new ExecutorFragment(Types._CollectionType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _CollectionType__OclAny = new ExecutorFragment(Types._CollectionType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CollectionType__OclElement = new ExecutorFragment(Types._CollectionType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _CollectionType__OclType = new ExecutorFragment(Types._CollectionType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _CollectionType__TemplateableElement = new ExecutorFragment(Types._CollectionType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _CollectionType__Type = new ExecutorFragment(Types._CollectionType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _Comment__Comment = new ExecutorFragment(Types._Comment, PivotTables.Types._Comment);
		private static final @NonNull ExecutorFragment _Comment__Element = new ExecutorFragment(Types._Comment, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Comment__OclAny = new ExecutorFragment(Types._Comment, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Comment__OclElement = new ExecutorFragment(Types._Comment, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _CompleteClass__CompleteClass = new ExecutorFragment(Types._CompleteClass, PivotTables.Types._CompleteClass);
		private static final @NonNull ExecutorFragment _CompleteClass__Element = new ExecutorFragment(Types._CompleteClass, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _CompleteClass__NamedElement = new ExecutorFragment(Types._CompleteClass, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _CompleteClass__OclAny = new ExecutorFragment(Types._CompleteClass, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CompleteClass__OclElement = new ExecutorFragment(Types._CompleteClass, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _CompleteEnvironment__CompleteEnvironment = new ExecutorFragment(Types._CompleteEnvironment, PivotTables.Types._CompleteEnvironment);
		private static final @NonNull ExecutorFragment _CompleteEnvironment__Element = new ExecutorFragment(Types._CompleteEnvironment, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _CompleteEnvironment__OclAny = new ExecutorFragment(Types._CompleteEnvironment, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CompleteEnvironment__OclElement = new ExecutorFragment(Types._CompleteEnvironment, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _CompleteModel__CompleteModel = new ExecutorFragment(Types._CompleteModel, PivotTables.Types._CompleteModel);
		private static final @NonNull ExecutorFragment _CompleteModel__Element = new ExecutorFragment(Types._CompleteModel, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _CompleteModel__NamedElement = new ExecutorFragment(Types._CompleteModel, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _CompleteModel__OclAny = new ExecutorFragment(Types._CompleteModel, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CompleteModel__OclElement = new ExecutorFragment(Types._CompleteModel, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _CompletePackage__CompletePackage = new ExecutorFragment(Types._CompletePackage, PivotTables.Types._CompletePackage);
		private static final @NonNull ExecutorFragment _CompletePackage__Element = new ExecutorFragment(Types._CompletePackage, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _CompletePackage__NamedElement = new ExecutorFragment(Types._CompletePackage, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _CompletePackage__OclAny = new ExecutorFragment(Types._CompletePackage, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _CompletePackage__OclElement = new ExecutorFragment(Types._CompletePackage, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _ConnectionPointReference__ConnectionPointReference = new ExecutorFragment(Types._ConnectionPointReference, PivotTables.Types._ConnectionPointReference);
		private static final @NonNull ExecutorFragment _ConnectionPointReference__Element = new ExecutorFragment(Types._ConnectionPointReference, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _ConnectionPointReference__NamedElement = new ExecutorFragment(Types._ConnectionPointReference, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _ConnectionPointReference__OclAny = new ExecutorFragment(Types._ConnectionPointReference, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _ConnectionPointReference__OclElement = new ExecutorFragment(Types._ConnectionPointReference, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _ConnectionPointReference__Vertex = new ExecutorFragment(Types._ConnectionPointReference, PivotTables.Types._Vertex);

		private static final @NonNull ExecutorFragment _Constraint__Constraint = new ExecutorFragment(Types._Constraint, PivotTables.Types._Constraint);
		private static final @NonNull ExecutorFragment _Constraint__Element = new ExecutorFragment(Types._Constraint, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Constraint__NamedElement = new ExecutorFragment(Types._Constraint, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Constraint__OclAny = new ExecutorFragment(Types._Constraint, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Constraint__OclElement = new ExecutorFragment(Types._Constraint, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _DataType__Class = new ExecutorFragment(Types._DataType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _DataType__DataType = new ExecutorFragment(Types._DataType, PivotTables.Types._DataType);
		private static final @NonNull ExecutorFragment _DataType__Element = new ExecutorFragment(Types._DataType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _DataType__NamedElement = new ExecutorFragment(Types._DataType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _DataType__Namespace = new ExecutorFragment(Types._DataType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _DataType__OclAny = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _DataType__OclElement = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _DataType__OclType = new ExecutorFragment(Types._DataType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _DataType__TemplateableElement = new ExecutorFragment(Types._DataType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _DataType__Type = new ExecutorFragment(Types._DataType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _Detail__Detail = new ExecutorFragment(Types._Detail, PivotTables.Types._Detail);
		private static final @NonNull ExecutorFragment _Detail__Element = new ExecutorFragment(Types._Detail, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Detail__NamedElement = new ExecutorFragment(Types._Detail, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Detail__OclAny = new ExecutorFragment(Types._Detail, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Detail__OclElement = new ExecutorFragment(Types._Detail, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _DynamicBehavior__Behavior = new ExecutorFragment(Types._DynamicBehavior, PivotTables.Types._Behavior);
		private static final @NonNull ExecutorFragment _DynamicBehavior__Class = new ExecutorFragment(Types._DynamicBehavior, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _DynamicBehavior__DynamicBehavior = new ExecutorFragment(Types._DynamicBehavior, PivotTables.Types._DynamicBehavior);
		private static final @NonNull ExecutorFragment _DynamicBehavior__DynamicElement = new ExecutorFragment(Types._DynamicBehavior, PivotTables.Types._DynamicElement);
		private static final @NonNull ExecutorFragment _DynamicBehavior__DynamicType = new ExecutorFragment(Types._DynamicBehavior, PivotTables.Types._DynamicType);
		private static final @NonNull ExecutorFragment _DynamicBehavior__Element = new ExecutorFragment(Types._DynamicBehavior, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _DynamicBehavior__NamedElement = new ExecutorFragment(Types._DynamicBehavior, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _DynamicBehavior__Namespace = new ExecutorFragment(Types._DynamicBehavior, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _DynamicBehavior__OclAny = new ExecutorFragment(Types._DynamicBehavior, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _DynamicBehavior__OclElement = new ExecutorFragment(Types._DynamicBehavior, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _DynamicBehavior__OclType = new ExecutorFragment(Types._DynamicBehavior, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _DynamicBehavior__TemplateableElement = new ExecutorFragment(Types._DynamicBehavior, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _DynamicBehavior__Type = new ExecutorFragment(Types._DynamicBehavior, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _DynamicElement__DynamicElement = new ExecutorFragment(Types._DynamicElement, PivotTables.Types._DynamicElement);
		private static final @NonNull ExecutorFragment _DynamicElement__Element = new ExecutorFragment(Types._DynamicElement, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _DynamicElement__OclAny = new ExecutorFragment(Types._DynamicElement, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _DynamicElement__OclElement = new ExecutorFragment(Types._DynamicElement, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _DynamicProperty__DynamicProperty = new ExecutorFragment(Types._DynamicProperty, PivotTables.Types._DynamicProperty);
		private static final @NonNull ExecutorFragment _DynamicProperty__Element = new ExecutorFragment(Types._DynamicProperty, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _DynamicProperty__OclAny = new ExecutorFragment(Types._DynamicProperty, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _DynamicProperty__OclElement = new ExecutorFragment(Types._DynamicProperty, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _DynamicType__Class = new ExecutorFragment(Types._DynamicType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _DynamicType__DynamicElement = new ExecutorFragment(Types._DynamicType, PivotTables.Types._DynamicElement);
		private static final @NonNull ExecutorFragment _DynamicType__DynamicType = new ExecutorFragment(Types._DynamicType, PivotTables.Types._DynamicType);
		private static final @NonNull ExecutorFragment _DynamicType__Element = new ExecutorFragment(Types._DynamicType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _DynamicType__NamedElement = new ExecutorFragment(Types._DynamicType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _DynamicType__Namespace = new ExecutorFragment(Types._DynamicType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _DynamicType__OclAny = new ExecutorFragment(Types._DynamicType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _DynamicType__OclElement = new ExecutorFragment(Types._DynamicType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _DynamicType__OclType = new ExecutorFragment(Types._DynamicType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _DynamicType__TemplateableElement = new ExecutorFragment(Types._DynamicType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _DynamicType__Type = new ExecutorFragment(Types._DynamicType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _DynamicValueSpecification__DynamicValueSpecification = new ExecutorFragment(Types._DynamicValueSpecification, PivotTables.Types._DynamicValueSpecification);
		private static final @NonNull ExecutorFragment _DynamicValueSpecification__Element = new ExecutorFragment(Types._DynamicValueSpecification, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _DynamicValueSpecification__NamedElement = new ExecutorFragment(Types._DynamicValueSpecification, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _DynamicValueSpecification__OclAny = new ExecutorFragment(Types._DynamicValueSpecification, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _DynamicValueSpecification__OclElement = new ExecutorFragment(Types._DynamicValueSpecification, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _DynamicValueSpecification__TypedElement = new ExecutorFragment(Types._DynamicValueSpecification, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _DynamicValueSpecification__ValueSpecification = new ExecutorFragment(Types._DynamicValueSpecification, PivotTables.Types._ValueSpecification);

		private static final @NonNull ExecutorFragment _Element__Element = new ExecutorFragment(Types._Element, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Element__OclAny = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Element__OclElement = new ExecutorFragment(Types._Element, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _ElementExtension__Class = new ExecutorFragment(Types._ElementExtension, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _ElementExtension__Element = new ExecutorFragment(Types._ElementExtension, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _ElementExtension__ElementExtension = new ExecutorFragment(Types._ElementExtension, PivotTables.Types._ElementExtension);
		private static final @NonNull ExecutorFragment _ElementExtension__NamedElement = new ExecutorFragment(Types._ElementExtension, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _ElementExtension__Namespace = new ExecutorFragment(Types._ElementExtension, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _ElementExtension__OclAny = new ExecutorFragment(Types._ElementExtension, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _ElementExtension__OclElement = new ExecutorFragment(Types._ElementExtension, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _ElementExtension__OclType = new ExecutorFragment(Types._ElementExtension, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _ElementExtension__TemplateableElement = new ExecutorFragment(Types._ElementExtension, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _ElementExtension__Type = new ExecutorFragment(Types._ElementExtension, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _EnumLiteralExp__Element = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _EnumLiteralExp__EnumLiteralExp = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._EnumLiteralExp);
		private static final @NonNull ExecutorFragment _EnumLiteralExp__LiteralExp = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _EnumLiteralExp__NamedElement = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _EnumLiteralExp__OCLExpression = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _EnumLiteralExp__OclAny = new ExecutorFragment(Types._EnumLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _EnumLiteralExp__OclElement = new ExecutorFragment(Types._EnumLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _EnumLiteralExp__TypedElement = new ExecutorFragment(Types._EnumLiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _Enumeration__Class = new ExecutorFragment(Types._Enumeration, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _Enumeration__DataType = new ExecutorFragment(Types._Enumeration, PivotTables.Types._DataType);
		private static final @NonNull ExecutorFragment _Enumeration__Element = new ExecutorFragment(Types._Enumeration, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Enumeration__Enumeration = new ExecutorFragment(Types._Enumeration, PivotTables.Types._Enumeration);
		private static final @NonNull ExecutorFragment _Enumeration__NamedElement = new ExecutorFragment(Types._Enumeration, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Enumeration__Namespace = new ExecutorFragment(Types._Enumeration, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Enumeration__OclAny = new ExecutorFragment(Types._Enumeration, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Enumeration__OclElement = new ExecutorFragment(Types._Enumeration, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Enumeration__OclEnumeration = new ExecutorFragment(Types._Enumeration, OCLstdlibTables.Types._OclEnumeration);
		private static final @NonNull ExecutorFragment _Enumeration__OclType = new ExecutorFragment(Types._Enumeration, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _Enumeration__TemplateableElement = new ExecutorFragment(Types._Enumeration, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _Enumeration__Type = new ExecutorFragment(Types._Enumeration, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _EnumerationLiteral__Element = new ExecutorFragment(Types._EnumerationLiteral, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _EnumerationLiteral__EnumerationLiteral = new ExecutorFragment(Types._EnumerationLiteral, PivotTables.Types._EnumerationLiteral);
		private static final @NonNull ExecutorFragment _EnumerationLiteral__InstanceSpecification = new ExecutorFragment(Types._EnumerationLiteral, PivotTables.Types._InstanceSpecification);
		private static final @NonNull ExecutorFragment _EnumerationLiteral__NamedElement = new ExecutorFragment(Types._EnumerationLiteral, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _EnumerationLiteral__OclAny = new ExecutorFragment(Types._EnumerationLiteral, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _EnumerationLiteral__OclElement = new ExecutorFragment(Types._EnumerationLiteral, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _ExpressionInOCL__Element = new ExecutorFragment(Types._ExpressionInOCL, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _ExpressionInOCL__ExpressionInOCL = new ExecutorFragment(Types._ExpressionInOCL, PivotTables.Types._ExpressionInOCL);
		private static final @NonNull ExecutorFragment _ExpressionInOCL__LanguageExpression = new ExecutorFragment(Types._ExpressionInOCL, PivotTables.Types._LanguageExpression);
		private static final @NonNull ExecutorFragment _ExpressionInOCL__NamedElement = new ExecutorFragment(Types._ExpressionInOCL, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _ExpressionInOCL__OclAny = new ExecutorFragment(Types._ExpressionInOCL, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _ExpressionInOCL__OclElement = new ExecutorFragment(Types._ExpressionInOCL, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _ExpressionInOCL__TypedElement = new ExecutorFragment(Types._ExpressionInOCL, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _ExpressionInOCL__ValueSpecification = new ExecutorFragment(Types._ExpressionInOCL, PivotTables.Types._ValueSpecification);

		private static final @NonNull ExecutorFragment _Feature__Element = new ExecutorFragment(Types._Feature, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Feature__Feature = new ExecutorFragment(Types._Feature, PivotTables.Types._Feature);
		private static final @NonNull ExecutorFragment _Feature__NamedElement = new ExecutorFragment(Types._Feature, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Feature__OclAny = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Feature__OclElement = new ExecutorFragment(Types._Feature, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Feature__TypedElement = new ExecutorFragment(Types._Feature, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _FeatureCallExp__CallExp = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._CallExp);
		private static final @NonNull ExecutorFragment _FeatureCallExp__Element = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _FeatureCallExp__FeatureCallExp = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._FeatureCallExp);
		private static final @NonNull ExecutorFragment _FeatureCallExp__NamedElement = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _FeatureCallExp__OCLExpression = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _FeatureCallExp__OclAny = new ExecutorFragment(Types._FeatureCallExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _FeatureCallExp__OclElement = new ExecutorFragment(Types._FeatureCallExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _FeatureCallExp__TypedElement = new ExecutorFragment(Types._FeatureCallExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _FinalState__Element = new ExecutorFragment(Types._FinalState, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _FinalState__FinalState = new ExecutorFragment(Types._FinalState, PivotTables.Types._FinalState);
		private static final @NonNull ExecutorFragment _FinalState__NamedElement = new ExecutorFragment(Types._FinalState, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _FinalState__Namespace = new ExecutorFragment(Types._FinalState, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _FinalState__OclAny = new ExecutorFragment(Types._FinalState, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _FinalState__OclElement = new ExecutorFragment(Types._FinalState, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _FinalState__OclState = new ExecutorFragment(Types._FinalState, OCLstdlibTables.Types._OclState);
		private static final @NonNull ExecutorFragment _FinalState__State = new ExecutorFragment(Types._FinalState, PivotTables.Types._State);
		private static final @NonNull ExecutorFragment _FinalState__Vertex = new ExecutorFragment(Types._FinalState, PivotTables.Types._Vertex);

		private static final @NonNull ExecutorFragment _IfExp__Element = new ExecutorFragment(Types._IfExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _IfExp__IfExp = new ExecutorFragment(Types._IfExp, PivotTables.Types._IfExp);
		private static final @NonNull ExecutorFragment _IfExp__NamedElement = new ExecutorFragment(Types._IfExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _IfExp__OCLExpression = new ExecutorFragment(Types._IfExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _IfExp__OclAny = new ExecutorFragment(Types._IfExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _IfExp__OclElement = new ExecutorFragment(Types._IfExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _IfExp__TypedElement = new ExecutorFragment(Types._IfExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _Import__Element = new ExecutorFragment(Types._Import, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Import__Import = new ExecutorFragment(Types._Import, PivotTables.Types._Import);
		private static final @NonNull ExecutorFragment _Import__NamedElement = new ExecutorFragment(Types._Import, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Import__OclAny = new ExecutorFragment(Types._Import, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Import__OclElement = new ExecutorFragment(Types._Import, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _InstanceSpecification__Element = new ExecutorFragment(Types._InstanceSpecification, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _InstanceSpecification__InstanceSpecification = new ExecutorFragment(Types._InstanceSpecification, PivotTables.Types._InstanceSpecification);
		private static final @NonNull ExecutorFragment _InstanceSpecification__NamedElement = new ExecutorFragment(Types._InstanceSpecification, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _InstanceSpecification__OclAny = new ExecutorFragment(Types._InstanceSpecification, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _InstanceSpecification__OclElement = new ExecutorFragment(Types._InstanceSpecification, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _IntegerLiteralExp__Element = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _IntegerLiteralExp__IntegerLiteralExp = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._IntegerLiteralExp);
		private static final @NonNull ExecutorFragment _IntegerLiteralExp__LiteralExp = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _IntegerLiteralExp__NamedElement = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _IntegerLiteralExp__NumericLiteralExp = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._NumericLiteralExp);
		private static final @NonNull ExecutorFragment _IntegerLiteralExp__OCLExpression = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _IntegerLiteralExp__OclAny = new ExecutorFragment(Types._IntegerLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _IntegerLiteralExp__OclElement = new ExecutorFragment(Types._IntegerLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _IntegerLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		private static final @NonNull ExecutorFragment _IntegerLiteralExp__TypedElement = new ExecutorFragment(Types._IntegerLiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _InvalidLiteralExp__Element = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _InvalidLiteralExp__InvalidLiteralExp = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._InvalidLiteralExp);
		private static final @NonNull ExecutorFragment _InvalidLiteralExp__LiteralExp = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _InvalidLiteralExp__NamedElement = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _InvalidLiteralExp__OCLExpression = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _InvalidLiteralExp__OclAny = new ExecutorFragment(Types._InvalidLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _InvalidLiteralExp__OclElement = new ExecutorFragment(Types._InvalidLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _InvalidLiteralExp__TypedElement = new ExecutorFragment(Types._InvalidLiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _InvalidType__Class = new ExecutorFragment(Types._InvalidType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _InvalidType__Element = new ExecutorFragment(Types._InvalidType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _InvalidType__InvalidType = new ExecutorFragment(Types._InvalidType, PivotTables.Types._InvalidType);
		private static final @NonNull ExecutorFragment _InvalidType__NamedElement = new ExecutorFragment(Types._InvalidType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _InvalidType__Namespace = new ExecutorFragment(Types._InvalidType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _InvalidType__OclAny = new ExecutorFragment(Types._InvalidType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _InvalidType__OclElement = new ExecutorFragment(Types._InvalidType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _InvalidType__OclType = new ExecutorFragment(Types._InvalidType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _InvalidType__TemplateableElement = new ExecutorFragment(Types._InvalidType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _InvalidType__Type = new ExecutorFragment(Types._InvalidType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _IterableType__Class = new ExecutorFragment(Types._IterableType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _IterableType__DataType = new ExecutorFragment(Types._IterableType, PivotTables.Types._DataType);
		private static final @NonNull ExecutorFragment _IterableType__Element = new ExecutorFragment(Types._IterableType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _IterableType__IterableType = new ExecutorFragment(Types._IterableType, PivotTables.Types._IterableType);
		private static final @NonNull ExecutorFragment _IterableType__NamedElement = new ExecutorFragment(Types._IterableType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _IterableType__Namespace = new ExecutorFragment(Types._IterableType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _IterableType__OclAny = new ExecutorFragment(Types._IterableType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _IterableType__OclElement = new ExecutorFragment(Types._IterableType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _IterableType__OclType = new ExecutorFragment(Types._IterableType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _IterableType__TemplateableElement = new ExecutorFragment(Types._IterableType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _IterableType__Type = new ExecutorFragment(Types._IterableType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _IterateExp__CallExp = new ExecutorFragment(Types._IterateExp, PivotTables.Types._CallExp);
		private static final @NonNull ExecutorFragment _IterateExp__Element = new ExecutorFragment(Types._IterateExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _IterateExp__IterateExp = new ExecutorFragment(Types._IterateExp, PivotTables.Types._IterateExp);
		private static final @NonNull ExecutorFragment _IterateExp__LoopExp = new ExecutorFragment(Types._IterateExp, PivotTables.Types._LoopExp);
		private static final @NonNull ExecutorFragment _IterateExp__NamedElement = new ExecutorFragment(Types._IterateExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _IterateExp__OCLExpression = new ExecutorFragment(Types._IterateExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _IterateExp__OclAny = new ExecutorFragment(Types._IterateExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _IterateExp__OclElement = new ExecutorFragment(Types._IterateExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _IterateExp__ReferringElement = new ExecutorFragment(Types._IterateExp, PivotTables.Types._ReferringElement);
		private static final @NonNull ExecutorFragment _IterateExp__TypedElement = new ExecutorFragment(Types._IterateExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _Iteration__Element = new ExecutorFragment(Types._Iteration, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Iteration__Feature = new ExecutorFragment(Types._Iteration, PivotTables.Types._Feature);
		private static final @NonNull ExecutorFragment _Iteration__Iteration = new ExecutorFragment(Types._Iteration, PivotTables.Types._Iteration);
		private static final @NonNull ExecutorFragment _Iteration__NamedElement = new ExecutorFragment(Types._Iteration, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Iteration__Namespace = new ExecutorFragment(Types._Iteration, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Iteration__OclAny = new ExecutorFragment(Types._Iteration, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Iteration__OclElement = new ExecutorFragment(Types._Iteration, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Iteration__Operation = new ExecutorFragment(Types._Iteration, PivotTables.Types._Operation);
		private static final @NonNull ExecutorFragment _Iteration__TemplateableElement = new ExecutorFragment(Types._Iteration, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _Iteration__TypedElement = new ExecutorFragment(Types._Iteration, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _IteratorExp__CallExp = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._CallExp);
		private static final @NonNull ExecutorFragment _IteratorExp__Element = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _IteratorExp__IteratorExp = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._IteratorExp);
		private static final @NonNull ExecutorFragment _IteratorExp__LoopExp = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._LoopExp);
		private static final @NonNull ExecutorFragment _IteratorExp__NamedElement = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _IteratorExp__OCLExpression = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _IteratorExp__OclAny = new ExecutorFragment(Types._IteratorExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _IteratorExp__OclElement = new ExecutorFragment(Types._IteratorExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _IteratorExp__ReferringElement = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._ReferringElement);
		private static final @NonNull ExecutorFragment _IteratorExp__TypedElement = new ExecutorFragment(Types._IteratorExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _IteratorVariable__Element = new ExecutorFragment(Types._IteratorVariable, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _IteratorVariable__IteratorVariable = new ExecutorFragment(Types._IteratorVariable, PivotTables.Types._IteratorVariable);
		private static final @NonNull ExecutorFragment _IteratorVariable__NamedElement = new ExecutorFragment(Types._IteratorVariable, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _IteratorVariable__OclAny = new ExecutorFragment(Types._IteratorVariable, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _IteratorVariable__OclElement = new ExecutorFragment(Types._IteratorVariable, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _IteratorVariable__TypedElement = new ExecutorFragment(Types._IteratorVariable, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _IteratorVariable__Variable = new ExecutorFragment(Types._IteratorVariable, PivotTables.Types._Variable);
		private static final @NonNull ExecutorFragment _IteratorVariable__VariableDeclaration = new ExecutorFragment(Types._IteratorVariable, PivotTables.Types._VariableDeclaration);

		private static final @NonNull ExecutorFragment _LambdaType__Class = new ExecutorFragment(Types._LambdaType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _LambdaType__DataType = new ExecutorFragment(Types._LambdaType, PivotTables.Types._DataType);
		private static final @NonNull ExecutorFragment _LambdaType__Element = new ExecutorFragment(Types._LambdaType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _LambdaType__LambdaType = new ExecutorFragment(Types._LambdaType, PivotTables.Types._LambdaType);
		private static final @NonNull ExecutorFragment _LambdaType__NamedElement = new ExecutorFragment(Types._LambdaType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _LambdaType__Namespace = new ExecutorFragment(Types._LambdaType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _LambdaType__OclAny = new ExecutorFragment(Types._LambdaType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _LambdaType__OclElement = new ExecutorFragment(Types._LambdaType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _LambdaType__OclType = new ExecutorFragment(Types._LambdaType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _LambdaType__TemplateableElement = new ExecutorFragment(Types._LambdaType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _LambdaType__Type = new ExecutorFragment(Types._LambdaType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _LanguageExpression__Element = new ExecutorFragment(Types._LanguageExpression, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _LanguageExpression__LanguageExpression = new ExecutorFragment(Types._LanguageExpression, PivotTables.Types._LanguageExpression);
		private static final @NonNull ExecutorFragment _LanguageExpression__NamedElement = new ExecutorFragment(Types._LanguageExpression, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _LanguageExpression__OclAny = new ExecutorFragment(Types._LanguageExpression, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _LanguageExpression__OclElement = new ExecutorFragment(Types._LanguageExpression, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _LanguageExpression__TypedElement = new ExecutorFragment(Types._LanguageExpression, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _LanguageExpression__ValueSpecification = new ExecutorFragment(Types._LanguageExpression, PivotTables.Types._ValueSpecification);

		private static final @NonNull ExecutorFragment _LetExp__Element = new ExecutorFragment(Types._LetExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _LetExp__LetExp = new ExecutorFragment(Types._LetExp, PivotTables.Types._LetExp);
		private static final @NonNull ExecutorFragment _LetExp__NamedElement = new ExecutorFragment(Types._LetExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _LetExp__OCLExpression = new ExecutorFragment(Types._LetExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _LetExp__OclAny = new ExecutorFragment(Types._LetExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _LetExp__OclElement = new ExecutorFragment(Types._LetExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _LetExp__TypedElement = new ExecutorFragment(Types._LetExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _LetVariable__Element = new ExecutorFragment(Types._LetVariable, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _LetVariable__LetVariable = new ExecutorFragment(Types._LetVariable, PivotTables.Types._LetVariable);
		private static final @NonNull ExecutorFragment _LetVariable__NamedElement = new ExecutorFragment(Types._LetVariable, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _LetVariable__OclAny = new ExecutorFragment(Types._LetVariable, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _LetVariable__OclElement = new ExecutorFragment(Types._LetVariable, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _LetVariable__TypedElement = new ExecutorFragment(Types._LetVariable, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _LetVariable__Variable = new ExecutorFragment(Types._LetVariable, PivotTables.Types._Variable);
		private static final @NonNull ExecutorFragment _LetVariable__VariableDeclaration = new ExecutorFragment(Types._LetVariable, PivotTables.Types._VariableDeclaration);

		private static final @NonNull ExecutorFragment _Library__Element = new ExecutorFragment(Types._Library, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Library__Library = new ExecutorFragment(Types._Library, PivotTables.Types._Library);
		private static final @NonNull ExecutorFragment _Library__NamedElement = new ExecutorFragment(Types._Library, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Library__Namespace = new ExecutorFragment(Types._Library, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Library__OclAny = new ExecutorFragment(Types._Library, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Library__OclElement = new ExecutorFragment(Types._Library, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Library__Package = new ExecutorFragment(Types._Library, PivotTables.Types._Package);

		private static final @NonNull ExecutorFragment _LibraryFeature__LibraryFeature = new ExecutorFragment(Types._LibraryFeature, PivotTables.Types._LibraryFeature);
		private static final @NonNull ExecutorFragment _LibraryFeature__OclAny = new ExecutorFragment(Types._LibraryFeature, OCLstdlibTables.Types._OclAny);

		private static final @NonNull ExecutorFragment _LiteralExp__Element = new ExecutorFragment(Types._LiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _LiteralExp__LiteralExp = new ExecutorFragment(Types._LiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _LiteralExp__NamedElement = new ExecutorFragment(Types._LiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _LiteralExp__OCLExpression = new ExecutorFragment(Types._LiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _LiteralExp__OclAny = new ExecutorFragment(Types._LiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _LiteralExp__OclElement = new ExecutorFragment(Types._LiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _LiteralExp__TypedElement = new ExecutorFragment(Types._LiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _LoopExp__CallExp = new ExecutorFragment(Types._LoopExp, PivotTables.Types._CallExp);
		private static final @NonNull ExecutorFragment _LoopExp__Element = new ExecutorFragment(Types._LoopExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _LoopExp__LoopExp = new ExecutorFragment(Types._LoopExp, PivotTables.Types._LoopExp);
		private static final @NonNull ExecutorFragment _LoopExp__NamedElement = new ExecutorFragment(Types._LoopExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _LoopExp__OCLExpression = new ExecutorFragment(Types._LoopExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _LoopExp__OclAny = new ExecutorFragment(Types._LoopExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _LoopExp__OclElement = new ExecutorFragment(Types._LoopExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _LoopExp__TypedElement = new ExecutorFragment(Types._LoopExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _MapLiteralExp__Element = new ExecutorFragment(Types._MapLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _MapLiteralExp__LiteralExp = new ExecutorFragment(Types._MapLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _MapLiteralExp__MapLiteralExp = new ExecutorFragment(Types._MapLiteralExp, PivotTables.Types._MapLiteralExp);
		private static final @NonNull ExecutorFragment _MapLiteralExp__NamedElement = new ExecutorFragment(Types._MapLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _MapLiteralExp__OCLExpression = new ExecutorFragment(Types._MapLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _MapLiteralExp__OclAny = new ExecutorFragment(Types._MapLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _MapLiteralExp__OclElement = new ExecutorFragment(Types._MapLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _MapLiteralExp__TypedElement = new ExecutorFragment(Types._MapLiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _MapLiteralPart__Element = new ExecutorFragment(Types._MapLiteralPart, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _MapLiteralPart__MapLiteralPart = new ExecutorFragment(Types._MapLiteralPart, PivotTables.Types._MapLiteralPart);
		private static final @NonNull ExecutorFragment _MapLiteralPart__OclAny = new ExecutorFragment(Types._MapLiteralPart, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _MapLiteralPart__OclElement = new ExecutorFragment(Types._MapLiteralPart, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _MapType__Class = new ExecutorFragment(Types._MapType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _MapType__DataType = new ExecutorFragment(Types._MapType, PivotTables.Types._DataType);
		private static final @NonNull ExecutorFragment _MapType__Element = new ExecutorFragment(Types._MapType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _MapType__IterableType = new ExecutorFragment(Types._MapType, PivotTables.Types._IterableType);
		private static final @NonNull ExecutorFragment _MapType__MapType = new ExecutorFragment(Types._MapType, PivotTables.Types._MapType);
		private static final @NonNull ExecutorFragment _MapType__NamedElement = new ExecutorFragment(Types._MapType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _MapType__Namespace = new ExecutorFragment(Types._MapType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _MapType__OclAny = new ExecutorFragment(Types._MapType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _MapType__OclElement = new ExecutorFragment(Types._MapType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _MapType__OclType = new ExecutorFragment(Types._MapType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _MapType__TemplateableElement = new ExecutorFragment(Types._MapType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _MapType__Type = new ExecutorFragment(Types._MapType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _MessageExp__Element = new ExecutorFragment(Types._MessageExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _MessageExp__MessageExp = new ExecutorFragment(Types._MessageExp, PivotTables.Types._MessageExp);
		private static final @NonNull ExecutorFragment _MessageExp__NamedElement = new ExecutorFragment(Types._MessageExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _MessageExp__OCLExpression = new ExecutorFragment(Types._MessageExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _MessageExp__OclAny = new ExecutorFragment(Types._MessageExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _MessageExp__OclElement = new ExecutorFragment(Types._MessageExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _MessageExp__TypedElement = new ExecutorFragment(Types._MessageExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _MessageType__Class = new ExecutorFragment(Types._MessageType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _MessageType__Element = new ExecutorFragment(Types._MessageType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _MessageType__MessageType = new ExecutorFragment(Types._MessageType, PivotTables.Types._MessageType);
		private static final @NonNull ExecutorFragment _MessageType__NamedElement = new ExecutorFragment(Types._MessageType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _MessageType__Namespace = new ExecutorFragment(Types._MessageType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _MessageType__OclAny = new ExecutorFragment(Types._MessageType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _MessageType__OclElement = new ExecutorFragment(Types._MessageType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _MessageType__OclType = new ExecutorFragment(Types._MessageType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _MessageType__TemplateableElement = new ExecutorFragment(Types._MessageType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _MessageType__Type = new ExecutorFragment(Types._MessageType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _Model__Element = new ExecutorFragment(Types._Model, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Model__Model = new ExecutorFragment(Types._Model, PivotTables.Types._Model);
		private static final @NonNull ExecutorFragment _Model__NamedElement = new ExecutorFragment(Types._Model, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Model__Namespace = new ExecutorFragment(Types._Model, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Model__OclAny = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Model__OclElement = new ExecutorFragment(Types._Model, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _MorePivotable__MorePivotable = new ExecutorFragment(Types._MorePivotable, PivotTables.Types._MorePivotable);
		private static final @NonNull ExecutorFragment _MorePivotable__OclAny = new ExecutorFragment(Types._MorePivotable, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _MorePivotable__OclElement = new ExecutorFragment(Types._MorePivotable, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _Nameable__Nameable = new ExecutorFragment(Types._Nameable, PivotTables.Types._Nameable);
		private static final @NonNull ExecutorFragment _Nameable__OclAny = new ExecutorFragment(Types._Nameable, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Nameable__OclElement = new ExecutorFragment(Types._Nameable, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _NamedElement__Element = new ExecutorFragment(Types._NamedElement, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _Namespace__Element = new ExecutorFragment(Types._Namespace, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Namespace__NamedElement = new ExecutorFragment(Types._Namespace, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Namespace__Namespace = new ExecutorFragment(Types._Namespace, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Namespace__OclAny = new ExecutorFragment(Types._Namespace, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Namespace__OclElement = new ExecutorFragment(Types._Namespace, OCLstdlibTables.Types._OclElement);

		private static final @NonNull ExecutorFragment _NavigationCallExp__CallExp = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._CallExp);
		private static final @NonNull ExecutorFragment _NavigationCallExp__Element = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _NavigationCallExp__FeatureCallExp = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._FeatureCallExp);
		private static final @NonNull ExecutorFragment _NavigationCallExp__NamedElement = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _NavigationCallExp__NavigationCallExp = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._NavigationCallExp);
		private static final @NonNull ExecutorFragment _NavigationCallExp__OCLExpression = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _NavigationCallExp__OclAny = new ExecutorFragment(Types._NavigationCallExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _NavigationCallExp__OclElement = new ExecutorFragment(Types._NavigationCallExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _NavigationCallExp__TypedElement = new ExecutorFragment(Types._NavigationCallExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _NullLiteralExp__Element = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _NullLiteralExp__LiteralExp = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _NullLiteralExp__NamedElement = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _NullLiteralExp__NullLiteralExp = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._NullLiteralExp);
		private static final @NonNull ExecutorFragment _NullLiteralExp__OCLExpression = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _NullLiteralExp__OclAny = new ExecutorFragment(Types._NullLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _NullLiteralExp__OclElement = new ExecutorFragment(Types._NullLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _NullLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		private static final @NonNull ExecutorFragment _NullLiteralExp__TypedElement = new ExecutorFragment(Types._NullLiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _NumericLiteralExp__Element = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _NumericLiteralExp__LiteralExp = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _NumericLiteralExp__NamedElement = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _NumericLiteralExp__NumericLiteralExp = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._NumericLiteralExp);
		private static final @NonNull ExecutorFragment _NumericLiteralExp__OCLExpression = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _NumericLiteralExp__OclAny = new ExecutorFragment(Types._NumericLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _NumericLiteralExp__OclElement = new ExecutorFragment(Types._NumericLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _NumericLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		private static final @NonNull ExecutorFragment _NumericLiteralExp__TypedElement = new ExecutorFragment(Types._NumericLiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _OCLExpression__Element = new ExecutorFragment(Types._OCLExpression, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _OCLExpression__NamedElement = new ExecutorFragment(Types._OCLExpression, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _OCLExpression__OCLExpression = new ExecutorFragment(Types._OCLExpression, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _OCLExpression__OclAny = new ExecutorFragment(Types._OCLExpression, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _OCLExpression__OclElement = new ExecutorFragment(Types._OCLExpression, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _OCLExpression__TypedElement = new ExecutorFragment(Types._OCLExpression, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _Object__Object = new ExecutorFragment(Types._Object, PivotTables.Types._Object);
		private static final @NonNull ExecutorFragment _Object__OclAny = new ExecutorFragment(Types._Object, OCLstdlibTables.Types._OclAny);

		private static final @NonNull ExecutorFragment _Operation__Element = new ExecutorFragment(Types._Operation, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Operation__Feature = new ExecutorFragment(Types._Operation, PivotTables.Types._Feature);
		private static final @NonNull ExecutorFragment _Operation__NamedElement = new ExecutorFragment(Types._Operation, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Operation__Namespace = new ExecutorFragment(Types._Operation, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Operation__OclAny = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Operation__OclElement = new ExecutorFragment(Types._Operation, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Operation__Operation = new ExecutorFragment(Types._Operation, PivotTables.Types._Operation);
		private static final @NonNull ExecutorFragment _Operation__TemplateableElement = new ExecutorFragment(Types._Operation, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _Operation__TypedElement = new ExecutorFragment(Types._Operation, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _OperationCallExp__CallExp = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._CallExp);
		private static final @NonNull ExecutorFragment _OperationCallExp__Element = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _OperationCallExp__FeatureCallExp = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._FeatureCallExp);
		private static final @NonNull ExecutorFragment _OperationCallExp__NamedElement = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _OperationCallExp__OCLExpression = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _OperationCallExp__OclAny = new ExecutorFragment(Types._OperationCallExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _OperationCallExp__OclElement = new ExecutorFragment(Types._OperationCallExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _OperationCallExp__OperationCallExp = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._OperationCallExp);
		private static final @NonNull ExecutorFragment _OperationCallExp__ReferringElement = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._ReferringElement);
		private static final @NonNull ExecutorFragment _OperationCallExp__TypedElement = new ExecutorFragment(Types._OperationCallExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _OppositePropertyCallExp__CallExp = new ExecutorFragment(Types._OppositePropertyCallExp, PivotTables.Types._CallExp);
		private static final @NonNull ExecutorFragment _OppositePropertyCallExp__Element = new ExecutorFragment(Types._OppositePropertyCallExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _OppositePropertyCallExp__FeatureCallExp = new ExecutorFragment(Types._OppositePropertyCallExp, PivotTables.Types._FeatureCallExp);
		private static final @NonNull ExecutorFragment _OppositePropertyCallExp__NamedElement = new ExecutorFragment(Types._OppositePropertyCallExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _OppositePropertyCallExp__NavigationCallExp = new ExecutorFragment(Types._OppositePropertyCallExp, PivotTables.Types._NavigationCallExp);
		private static final @NonNull ExecutorFragment _OppositePropertyCallExp__OCLExpression = new ExecutorFragment(Types._OppositePropertyCallExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _OppositePropertyCallExp__OclAny = new ExecutorFragment(Types._OppositePropertyCallExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _OppositePropertyCallExp__OclElement = new ExecutorFragment(Types._OppositePropertyCallExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _OppositePropertyCallExp__OppositePropertyCallExp = new ExecutorFragment(Types._OppositePropertyCallExp, PivotTables.Types._OppositePropertyCallExp);
		private static final @NonNull ExecutorFragment _OppositePropertyCallExp__TypedElement = new ExecutorFragment(Types._OppositePropertyCallExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _OrderedSetType__Class = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _OrderedSetType__CollectionType = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._CollectionType);
		private static final @NonNull ExecutorFragment _OrderedSetType__DataType = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._DataType);
		private static final @NonNull ExecutorFragment _OrderedSetType__Element = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _OrderedSetType__IterableType = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._IterableType);
		private static final @NonNull ExecutorFragment _OrderedSetType__NamedElement = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _OrderedSetType__Namespace = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _OrderedSetType__OclAny = new ExecutorFragment(Types._OrderedSetType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _OrderedSetType__OclElement = new ExecutorFragment(Types._OrderedSetType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _OrderedSetType__OclType = new ExecutorFragment(Types._OrderedSetType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _OrderedSetType__OrderedSetType = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._OrderedSetType);
		private static final @NonNull ExecutorFragment _OrderedSetType__TemplateableElement = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _OrderedSetType__Type = new ExecutorFragment(Types._OrderedSetType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _OrphanCompletePackage__CompletePackage = new ExecutorFragment(Types._OrphanCompletePackage, PivotTables.Types._CompletePackage);
		private static final @NonNull ExecutorFragment _OrphanCompletePackage__Element = new ExecutorFragment(Types._OrphanCompletePackage, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _OrphanCompletePackage__NamedElement = new ExecutorFragment(Types._OrphanCompletePackage, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _OrphanCompletePackage__OclAny = new ExecutorFragment(Types._OrphanCompletePackage, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _OrphanCompletePackage__OclElement = new ExecutorFragment(Types._OrphanCompletePackage, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _OrphanCompletePackage__OrphanCompletePackage = new ExecutorFragment(Types._OrphanCompletePackage, PivotTables.Types._OrphanCompletePackage);

		private static final @NonNull ExecutorFragment _Package__Element = new ExecutorFragment(Types._Package, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Package__NamedElement = new ExecutorFragment(Types._Package, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Package__Namespace = new ExecutorFragment(Types._Package, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Package__OclAny = new ExecutorFragment(Types._Package, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Package__OclElement = new ExecutorFragment(Types._Package, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Package__Package = new ExecutorFragment(Types._Package, PivotTables.Types._Package);

		private static final @NonNull ExecutorFragment _Parameter__Element = new ExecutorFragment(Types._Parameter, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Parameter__NamedElement = new ExecutorFragment(Types._Parameter, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Parameter__OclAny = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Parameter__OclElement = new ExecutorFragment(Types._Parameter, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Parameter__Parameter = new ExecutorFragment(Types._Parameter, PivotTables.Types._Parameter);
		private static final @NonNull ExecutorFragment _Parameter__TypedElement = new ExecutorFragment(Types._Parameter, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _Parameter__VariableDeclaration = new ExecutorFragment(Types._Parameter, PivotTables.Types._VariableDeclaration);

		private static final @NonNull ExecutorFragment _ParameterVariable__Element = new ExecutorFragment(Types._ParameterVariable, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _ParameterVariable__NamedElement = new ExecutorFragment(Types._ParameterVariable, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _ParameterVariable__OclAny = new ExecutorFragment(Types._ParameterVariable, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _ParameterVariable__OclElement = new ExecutorFragment(Types._ParameterVariable, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _ParameterVariable__ParameterVariable = new ExecutorFragment(Types._ParameterVariable, PivotTables.Types._ParameterVariable);
		private static final @NonNull ExecutorFragment _ParameterVariable__TypedElement = new ExecutorFragment(Types._ParameterVariable, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _ParameterVariable__Variable = new ExecutorFragment(Types._ParameterVariable, PivotTables.Types._Variable);
		private static final @NonNull ExecutorFragment _ParameterVariable__VariableDeclaration = new ExecutorFragment(Types._ParameterVariable, PivotTables.Types._VariableDeclaration);

		private static final @NonNull ExecutorFragment _Pivotable__OclAny = new ExecutorFragment(Types._Pivotable, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Pivotable__OclElement = new ExecutorFragment(Types._Pivotable, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Pivotable__Pivotable = new ExecutorFragment(Types._Pivotable, PivotTables.Types._Pivotable);

		private static final @NonNull ExecutorFragment _Precedence__Element = new ExecutorFragment(Types._Precedence, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Precedence__NamedElement = new ExecutorFragment(Types._Precedence, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Precedence__OclAny = new ExecutorFragment(Types._Precedence, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Precedence__OclElement = new ExecutorFragment(Types._Precedence, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Precedence__Precedence = new ExecutorFragment(Types._Precedence, PivotTables.Types._Precedence);

		private static final @NonNull ExecutorFragment _PrimitiveCompletePackage__CompletePackage = new ExecutorFragment(Types._PrimitiveCompletePackage, PivotTables.Types._CompletePackage);
		private static final @NonNull ExecutorFragment _PrimitiveCompletePackage__Element = new ExecutorFragment(Types._PrimitiveCompletePackage, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _PrimitiveCompletePackage__NamedElement = new ExecutorFragment(Types._PrimitiveCompletePackage, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _PrimitiveCompletePackage__OclAny = new ExecutorFragment(Types._PrimitiveCompletePackage, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _PrimitiveCompletePackage__OclElement = new ExecutorFragment(Types._PrimitiveCompletePackage, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _PrimitiveCompletePackage__PrimitiveCompletePackage = new ExecutorFragment(Types._PrimitiveCompletePackage, PivotTables.Types._PrimitiveCompletePackage);

		private static final @NonNull ExecutorFragment _PrimitiveLiteralExp__Element = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _PrimitiveLiteralExp__LiteralExp = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _PrimitiveLiteralExp__NamedElement = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _PrimitiveLiteralExp__OCLExpression = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _PrimitiveLiteralExp__OclAny = new ExecutorFragment(Types._PrimitiveLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _PrimitiveLiteralExp__OclElement = new ExecutorFragment(Types._PrimitiveLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _PrimitiveLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		private static final @NonNull ExecutorFragment _PrimitiveLiteralExp__TypedElement = new ExecutorFragment(Types._PrimitiveLiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _PrimitiveType__Class = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _PrimitiveType__DataType = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._DataType);
		private static final @NonNull ExecutorFragment _PrimitiveType__Element = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _PrimitiveType__NamedElement = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _PrimitiveType__Namespace = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _PrimitiveType__OclAny = new ExecutorFragment(Types._PrimitiveType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _PrimitiveType__OclElement = new ExecutorFragment(Types._PrimitiveType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _PrimitiveType__OclType = new ExecutorFragment(Types._PrimitiveType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _PrimitiveType__PrimitiveType = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._PrimitiveType);
		private static final @NonNull ExecutorFragment _PrimitiveType__TemplateableElement = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _PrimitiveType__Type = new ExecutorFragment(Types._PrimitiveType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _Profile__Element = new ExecutorFragment(Types._Profile, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Profile__NamedElement = new ExecutorFragment(Types._Profile, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Profile__Namespace = new ExecutorFragment(Types._Profile, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Profile__OclAny = new ExecutorFragment(Types._Profile, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Profile__OclElement = new ExecutorFragment(Types._Profile, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Profile__Package = new ExecutorFragment(Types._Profile, PivotTables.Types._Package);
		private static final @NonNull ExecutorFragment _Profile__Profile = new ExecutorFragment(Types._Profile, PivotTables.Types._Profile);

		private static final @NonNull ExecutorFragment _ProfileApplication__Element = new ExecutorFragment(Types._ProfileApplication, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _ProfileApplication__OclAny = new ExecutorFragment(Types._ProfileApplication, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _ProfileApplication__OclElement = new ExecutorFragment(Types._ProfileApplication, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _ProfileApplication__ProfileApplication = new ExecutorFragment(Types._ProfileApplication, PivotTables.Types._ProfileApplication);

		private static final @NonNull ExecutorFragment _Property__Element = new ExecutorFragment(Types._Property, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Property__Feature = new ExecutorFragment(Types._Property, PivotTables.Types._Feature);
		private static final @NonNull ExecutorFragment _Property__NamedElement = new ExecutorFragment(Types._Property, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Property__OclAny = new ExecutorFragment(Types._Property, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Property__OclElement = new ExecutorFragment(Types._Property, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Property__Property = new ExecutorFragment(Types._Property, PivotTables.Types._Property);
		private static final @NonNull ExecutorFragment _Property__TypedElement = new ExecutorFragment(Types._Property, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _PropertyCallExp__CallExp = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._CallExp);
		private static final @NonNull ExecutorFragment _PropertyCallExp__Element = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _PropertyCallExp__FeatureCallExp = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._FeatureCallExp);
		private static final @NonNull ExecutorFragment _PropertyCallExp__NamedElement = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _PropertyCallExp__NavigationCallExp = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._NavigationCallExp);
		private static final @NonNull ExecutorFragment _PropertyCallExp__OCLExpression = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _PropertyCallExp__OclAny = new ExecutorFragment(Types._PropertyCallExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _PropertyCallExp__OclElement = new ExecutorFragment(Types._PropertyCallExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _PropertyCallExp__PropertyCallExp = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._PropertyCallExp);
		private static final @NonNull ExecutorFragment _PropertyCallExp__ReferringElement = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._ReferringElement);
		private static final @NonNull ExecutorFragment _PropertyCallExp__TypedElement = new ExecutorFragment(Types._PropertyCallExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _Pseudostate__Element = new ExecutorFragment(Types._Pseudostate, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Pseudostate__NamedElement = new ExecutorFragment(Types._Pseudostate, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Pseudostate__OclAny = new ExecutorFragment(Types._Pseudostate, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Pseudostate__OclElement = new ExecutorFragment(Types._Pseudostate, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Pseudostate__Pseudostate = new ExecutorFragment(Types._Pseudostate, PivotTables.Types._Pseudostate);
		private static final @NonNull ExecutorFragment _Pseudostate__Vertex = new ExecutorFragment(Types._Pseudostate, PivotTables.Types._Vertex);

		private static final @NonNull ExecutorFragment _PseudostateKind__OclAny = new ExecutorFragment(Types._PseudostateKind, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _PseudostateKind__OclElement = new ExecutorFragment(Types._PseudostateKind, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _PseudostateKind__OclEnumeration = new ExecutorFragment(Types._PseudostateKind, OCLstdlibTables.Types._OclEnumeration);
		private static final @NonNull ExecutorFragment _PseudostateKind__OclType = new ExecutorFragment(Types._PseudostateKind, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _PseudostateKind__PseudostateKind = new ExecutorFragment(Types._PseudostateKind, PivotTables.Types._PseudostateKind);

		private static final @NonNull ExecutorFragment _RealLiteralExp__Element = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _RealLiteralExp__LiteralExp = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _RealLiteralExp__NamedElement = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _RealLiteralExp__NumericLiteralExp = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._NumericLiteralExp);
		private static final @NonNull ExecutorFragment _RealLiteralExp__OCLExpression = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _RealLiteralExp__OclAny = new ExecutorFragment(Types._RealLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _RealLiteralExp__OclElement = new ExecutorFragment(Types._RealLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _RealLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		private static final @NonNull ExecutorFragment _RealLiteralExp__RealLiteralExp = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._RealLiteralExp);
		private static final @NonNull ExecutorFragment _RealLiteralExp__TypedElement = new ExecutorFragment(Types._RealLiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _ReferringElement__OclAny = new ExecutorFragment(Types._ReferringElement, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _ReferringElement__OclElement = new ExecutorFragment(Types._ReferringElement, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _ReferringElement__ReferringElement = new ExecutorFragment(Types._ReferringElement, PivotTables.Types._ReferringElement);

		private static final @NonNull ExecutorFragment _Region__Element = new ExecutorFragment(Types._Region, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Region__NamedElement = new ExecutorFragment(Types._Region, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Region__Namespace = new ExecutorFragment(Types._Region, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Region__OclAny = new ExecutorFragment(Types._Region, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Region__OclElement = new ExecutorFragment(Types._Region, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Region__Region = new ExecutorFragment(Types._Region, PivotTables.Types._Region);

		private static final @NonNull ExecutorFragment _ResultVariable__Element = new ExecutorFragment(Types._ResultVariable, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _ResultVariable__NamedElement = new ExecutorFragment(Types._ResultVariable, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _ResultVariable__OclAny = new ExecutorFragment(Types._ResultVariable, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _ResultVariable__OclElement = new ExecutorFragment(Types._ResultVariable, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _ResultVariable__ResultVariable = new ExecutorFragment(Types._ResultVariable, PivotTables.Types._ResultVariable);
		private static final @NonNull ExecutorFragment _ResultVariable__TypedElement = new ExecutorFragment(Types._ResultVariable, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _ResultVariable__Variable = new ExecutorFragment(Types._ResultVariable, PivotTables.Types._Variable);
		private static final @NonNull ExecutorFragment _ResultVariable__VariableDeclaration = new ExecutorFragment(Types._ResultVariable, PivotTables.Types._VariableDeclaration);

		private static final @NonNull ExecutorFragment _SelfType__Class = new ExecutorFragment(Types._SelfType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _SelfType__Element = new ExecutorFragment(Types._SelfType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _SelfType__NamedElement = new ExecutorFragment(Types._SelfType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _SelfType__Namespace = new ExecutorFragment(Types._SelfType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _SelfType__OclAny = new ExecutorFragment(Types._SelfType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _SelfType__OclElement = new ExecutorFragment(Types._SelfType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _SelfType__OclType = new ExecutorFragment(Types._SelfType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _SelfType__SelfType = new ExecutorFragment(Types._SelfType, PivotTables.Types._SelfType);
		private static final @NonNull ExecutorFragment _SelfType__TemplateableElement = new ExecutorFragment(Types._SelfType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _SelfType__Type = new ExecutorFragment(Types._SelfType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _SendSignalAction__Element = new ExecutorFragment(Types._SendSignalAction, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _SendSignalAction__NamedElement = new ExecutorFragment(Types._SendSignalAction, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _SendSignalAction__OclAny = new ExecutorFragment(Types._SendSignalAction, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _SendSignalAction__OclElement = new ExecutorFragment(Types._SendSignalAction, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _SendSignalAction__SendSignalAction = new ExecutorFragment(Types._SendSignalAction, PivotTables.Types._SendSignalAction);

		private static final @NonNull ExecutorFragment _SequenceType__Class = new ExecutorFragment(Types._SequenceType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _SequenceType__CollectionType = new ExecutorFragment(Types._SequenceType, PivotTables.Types._CollectionType);
		private static final @NonNull ExecutorFragment _SequenceType__DataType = new ExecutorFragment(Types._SequenceType, PivotTables.Types._DataType);
		private static final @NonNull ExecutorFragment _SequenceType__Element = new ExecutorFragment(Types._SequenceType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _SequenceType__IterableType = new ExecutorFragment(Types._SequenceType, PivotTables.Types._IterableType);
		private static final @NonNull ExecutorFragment _SequenceType__NamedElement = new ExecutorFragment(Types._SequenceType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _SequenceType__Namespace = new ExecutorFragment(Types._SequenceType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _SequenceType__OclAny = new ExecutorFragment(Types._SequenceType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _SequenceType__OclElement = new ExecutorFragment(Types._SequenceType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _SequenceType__OclType = new ExecutorFragment(Types._SequenceType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _SequenceType__SequenceType = new ExecutorFragment(Types._SequenceType, PivotTables.Types._SequenceType);
		private static final @NonNull ExecutorFragment _SequenceType__TemplateableElement = new ExecutorFragment(Types._SequenceType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _SequenceType__Type = new ExecutorFragment(Types._SequenceType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _SetType__Class = new ExecutorFragment(Types._SetType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _SetType__CollectionType = new ExecutorFragment(Types._SetType, PivotTables.Types._CollectionType);
		private static final @NonNull ExecutorFragment _SetType__DataType = new ExecutorFragment(Types._SetType, PivotTables.Types._DataType);
		private static final @NonNull ExecutorFragment _SetType__Element = new ExecutorFragment(Types._SetType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _SetType__IterableType = new ExecutorFragment(Types._SetType, PivotTables.Types._IterableType);
		private static final @NonNull ExecutorFragment _SetType__NamedElement = new ExecutorFragment(Types._SetType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _SetType__Namespace = new ExecutorFragment(Types._SetType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _SetType__OclAny = new ExecutorFragment(Types._SetType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _SetType__OclElement = new ExecutorFragment(Types._SetType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _SetType__OclType = new ExecutorFragment(Types._SetType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _SetType__SetType = new ExecutorFragment(Types._SetType, PivotTables.Types._SetType);
		private static final @NonNull ExecutorFragment _SetType__TemplateableElement = new ExecutorFragment(Types._SetType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _SetType__Type = new ExecutorFragment(Types._SetType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _ShadowExp__Element = new ExecutorFragment(Types._ShadowExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _ShadowExp__NamedElement = new ExecutorFragment(Types._ShadowExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _ShadowExp__OCLExpression = new ExecutorFragment(Types._ShadowExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _ShadowExp__OclAny = new ExecutorFragment(Types._ShadowExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _ShadowExp__OclElement = new ExecutorFragment(Types._ShadowExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _ShadowExp__ShadowExp = new ExecutorFragment(Types._ShadowExp, PivotTables.Types._ShadowExp);
		private static final @NonNull ExecutorFragment _ShadowExp__TypedElement = new ExecutorFragment(Types._ShadowExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _ShadowPart__Element = new ExecutorFragment(Types._ShadowPart, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _ShadowPart__NamedElement = new ExecutorFragment(Types._ShadowPart, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _ShadowPart__OclAny = new ExecutorFragment(Types._ShadowPart, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _ShadowPart__OclElement = new ExecutorFragment(Types._ShadowPart, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _ShadowPart__ShadowPart = new ExecutorFragment(Types._ShadowPart, PivotTables.Types._ShadowPart);
		private static final @NonNull ExecutorFragment _ShadowPart__TypedElement = new ExecutorFragment(Types._ShadowPart, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _Signal__Class = new ExecutorFragment(Types._Signal, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _Signal__Element = new ExecutorFragment(Types._Signal, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Signal__NamedElement = new ExecutorFragment(Types._Signal, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Signal__Namespace = new ExecutorFragment(Types._Signal, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Signal__OclAny = new ExecutorFragment(Types._Signal, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Signal__OclElement = new ExecutorFragment(Types._Signal, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Signal__OclType = new ExecutorFragment(Types._Signal, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _Signal__Signal = new ExecutorFragment(Types._Signal, PivotTables.Types._Signal);
		private static final @NonNull ExecutorFragment _Signal__TemplateableElement = new ExecutorFragment(Types._Signal, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _Signal__Type = new ExecutorFragment(Types._Signal, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _Slot__Element = new ExecutorFragment(Types._Slot, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Slot__OclAny = new ExecutorFragment(Types._Slot, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Slot__OclElement = new ExecutorFragment(Types._Slot, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Slot__Slot = new ExecutorFragment(Types._Slot, PivotTables.Types._Slot);

		private static final @NonNull ExecutorFragment _StandardLibrary__Element = new ExecutorFragment(Types._StandardLibrary, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _StandardLibrary__OclAny = new ExecutorFragment(Types._StandardLibrary, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _StandardLibrary__OclElement = new ExecutorFragment(Types._StandardLibrary, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _StandardLibrary__StandardLibrary = new ExecutorFragment(Types._StandardLibrary, PivotTables.Types._StandardLibrary);

		private static final @NonNull ExecutorFragment _State__Element = new ExecutorFragment(Types._State, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _State__NamedElement = new ExecutorFragment(Types._State, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _State__Namespace = new ExecutorFragment(Types._State, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _State__OclAny = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _State__OclElement = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _State__OclState = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclState);
		private static final @NonNull ExecutorFragment _State__State = new ExecutorFragment(Types._State, PivotTables.Types._State);
		private static final @NonNull ExecutorFragment _State__Vertex = new ExecutorFragment(Types._State, PivotTables.Types._Vertex);

		private static final @NonNull ExecutorFragment _StateExp__Element = new ExecutorFragment(Types._StateExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _StateExp__NamedElement = new ExecutorFragment(Types._StateExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _StateExp__OCLExpression = new ExecutorFragment(Types._StateExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _StateExp__OclAny = new ExecutorFragment(Types._StateExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _StateExp__OclElement = new ExecutorFragment(Types._StateExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _StateExp__StateExp = new ExecutorFragment(Types._StateExp, PivotTables.Types._StateExp);
		private static final @NonNull ExecutorFragment _StateExp__TypedElement = new ExecutorFragment(Types._StateExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _StateMachine__Behavior = new ExecutorFragment(Types._StateMachine, PivotTables.Types._Behavior);
		private static final @NonNull ExecutorFragment _StateMachine__Class = new ExecutorFragment(Types._StateMachine, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _StateMachine__Element = new ExecutorFragment(Types._StateMachine, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _StateMachine__NamedElement = new ExecutorFragment(Types._StateMachine, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _StateMachine__Namespace = new ExecutorFragment(Types._StateMachine, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _StateMachine__OclAny = new ExecutorFragment(Types._StateMachine, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _StateMachine__OclElement = new ExecutorFragment(Types._StateMachine, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _StateMachine__OclType = new ExecutorFragment(Types._StateMachine, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _StateMachine__StateMachine = new ExecutorFragment(Types._StateMachine, PivotTables.Types._StateMachine);
		private static final @NonNull ExecutorFragment _StateMachine__TemplateableElement = new ExecutorFragment(Types._StateMachine, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _StateMachine__Type = new ExecutorFragment(Types._StateMachine, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _Stereotype__Class = new ExecutorFragment(Types._Stereotype, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _Stereotype__Element = new ExecutorFragment(Types._Stereotype, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Stereotype__NamedElement = new ExecutorFragment(Types._Stereotype, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Stereotype__Namespace = new ExecutorFragment(Types._Stereotype, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Stereotype__OclAny = new ExecutorFragment(Types._Stereotype, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Stereotype__OclElement = new ExecutorFragment(Types._Stereotype, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Stereotype__OclType = new ExecutorFragment(Types._Stereotype, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _Stereotype__Stereotype = new ExecutorFragment(Types._Stereotype, PivotTables.Types._Stereotype);
		private static final @NonNull ExecutorFragment _Stereotype__TemplateableElement = new ExecutorFragment(Types._Stereotype, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _Stereotype__Type = new ExecutorFragment(Types._Stereotype, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _StereotypeExtender__Element = new ExecutorFragment(Types._StereotypeExtender, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _StereotypeExtender__OclAny = new ExecutorFragment(Types._StereotypeExtender, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _StereotypeExtender__OclElement = new ExecutorFragment(Types._StereotypeExtender, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _StereotypeExtender__StereotypeExtender = new ExecutorFragment(Types._StereotypeExtender, PivotTables.Types._StereotypeExtender);

		private static final @NonNull ExecutorFragment _StringLiteralExp__Element = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _StringLiteralExp__LiteralExp = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _StringLiteralExp__NamedElement = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _StringLiteralExp__OCLExpression = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _StringLiteralExp__OclAny = new ExecutorFragment(Types._StringLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _StringLiteralExp__OclElement = new ExecutorFragment(Types._StringLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _StringLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		private static final @NonNull ExecutorFragment _StringLiteralExp__StringLiteralExp = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._StringLiteralExp);
		private static final @NonNull ExecutorFragment _StringLiteralExp__TypedElement = new ExecutorFragment(Types._StringLiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _TemplateBinding__Element = new ExecutorFragment(Types._TemplateBinding, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _TemplateBinding__OclAny = new ExecutorFragment(Types._TemplateBinding, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _TemplateBinding__OclElement = new ExecutorFragment(Types._TemplateBinding, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _TemplateBinding__TemplateBinding = new ExecutorFragment(Types._TemplateBinding, PivotTables.Types._TemplateBinding);

		private static final @NonNull ExecutorFragment _TemplateParameter__Element = new ExecutorFragment(Types._TemplateParameter, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _TemplateParameter__NamedElement = new ExecutorFragment(Types._TemplateParameter, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _TemplateParameter__OclAny = new ExecutorFragment(Types._TemplateParameter, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _TemplateParameter__OclElement = new ExecutorFragment(Types._TemplateParameter, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _TemplateParameter__OclType = new ExecutorFragment(Types._TemplateParameter, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _TemplateParameter__TemplateParameter = new ExecutorFragment(Types._TemplateParameter, PivotTables.Types._TemplateParameter);
		private static final @NonNull ExecutorFragment _TemplateParameter__Type = new ExecutorFragment(Types._TemplateParameter, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _TemplateParameterSubstitution__Element = new ExecutorFragment(Types._TemplateParameterSubstitution, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _TemplateParameterSubstitution__OclAny = new ExecutorFragment(Types._TemplateParameterSubstitution, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _TemplateParameterSubstitution__OclElement = new ExecutorFragment(Types._TemplateParameterSubstitution, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _TemplateParameterSubstitution__TemplateParameterSubstitution = new ExecutorFragment(Types._TemplateParameterSubstitution, PivotTables.Types._TemplateParameterSubstitution);

		private static final @NonNull ExecutorFragment _TemplateSignature__Element = new ExecutorFragment(Types._TemplateSignature, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _TemplateSignature__OclAny = new ExecutorFragment(Types._TemplateSignature, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _TemplateSignature__OclElement = new ExecutorFragment(Types._TemplateSignature, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _TemplateSignature__TemplateSignature = new ExecutorFragment(Types._TemplateSignature, PivotTables.Types._TemplateSignature);

		private static final @NonNull ExecutorFragment _TemplateableElement__Element = new ExecutorFragment(Types._TemplateableElement, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _TemplateableElement__OclAny = new ExecutorFragment(Types._TemplateableElement, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _TemplateableElement__OclElement = new ExecutorFragment(Types._TemplateableElement, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _TemplateableElement__TemplateableElement = new ExecutorFragment(Types._TemplateableElement, PivotTables.Types._TemplateableElement);

		private static final @NonNull ExecutorFragment _Throwable__OclAny = new ExecutorFragment(Types._Throwable, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Throwable__Throwable = new ExecutorFragment(Types._Throwable, PivotTables.Types._Throwable);

		private static final @NonNull ExecutorFragment _Transition__Element = new ExecutorFragment(Types._Transition, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Transition__NamedElement = new ExecutorFragment(Types._Transition, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Transition__Namespace = new ExecutorFragment(Types._Transition, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _Transition__OclAny = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Transition__OclElement = new ExecutorFragment(Types._Transition, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Transition__Transition = new ExecutorFragment(Types._Transition, PivotTables.Types._Transition);

		private static final @NonNull ExecutorFragment _TransitionKind__OclAny = new ExecutorFragment(Types._TransitionKind, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _TransitionKind__OclElement = new ExecutorFragment(Types._TransitionKind, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _TransitionKind__OclEnumeration = new ExecutorFragment(Types._TransitionKind, OCLstdlibTables.Types._OclEnumeration);
		private static final @NonNull ExecutorFragment _TransitionKind__OclType = new ExecutorFragment(Types._TransitionKind, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _TransitionKind__TransitionKind = new ExecutorFragment(Types._TransitionKind, PivotTables.Types._TransitionKind);

		private static final @NonNull ExecutorFragment _Trigger__Element = new ExecutorFragment(Types._Trigger, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Trigger__NamedElement = new ExecutorFragment(Types._Trigger, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Trigger__OclAny = new ExecutorFragment(Types._Trigger, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Trigger__OclElement = new ExecutorFragment(Types._Trigger, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Trigger__Trigger = new ExecutorFragment(Types._Trigger, PivotTables.Types._Trigger);

		private static final @NonNull ExecutorFragment _TupleLiteralExp__Element = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _TupleLiteralExp__LiteralExp = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _TupleLiteralExp__NamedElement = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _TupleLiteralExp__OCLExpression = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _TupleLiteralExp__OclAny = new ExecutorFragment(Types._TupleLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _TupleLiteralExp__OclElement = new ExecutorFragment(Types._TupleLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _TupleLiteralExp__TupleLiteralExp = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._TupleLiteralExp);
		private static final @NonNull ExecutorFragment _TupleLiteralExp__TypedElement = new ExecutorFragment(Types._TupleLiteralExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _TupleLiteralPart__Element = new ExecutorFragment(Types._TupleLiteralPart, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _TupleLiteralPart__NamedElement = new ExecutorFragment(Types._TupleLiteralPart, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _TupleLiteralPart__OclAny = new ExecutorFragment(Types._TupleLiteralPart, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _TupleLiteralPart__OclElement = new ExecutorFragment(Types._TupleLiteralPart, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _TupleLiteralPart__TupleLiteralPart = new ExecutorFragment(Types._TupleLiteralPart, PivotTables.Types._TupleLiteralPart);
		private static final @NonNull ExecutorFragment _TupleLiteralPart__TypedElement = new ExecutorFragment(Types._TupleLiteralPart, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _TupleLiteralPart__VariableDeclaration = new ExecutorFragment(Types._TupleLiteralPart, PivotTables.Types._VariableDeclaration);

		private static final @NonNull ExecutorFragment _TupleType__Class = new ExecutorFragment(Types._TupleType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _TupleType__DataType = new ExecutorFragment(Types._TupleType, PivotTables.Types._DataType);
		private static final @NonNull ExecutorFragment _TupleType__Element = new ExecutorFragment(Types._TupleType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _TupleType__NamedElement = new ExecutorFragment(Types._TupleType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _TupleType__Namespace = new ExecutorFragment(Types._TupleType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _TupleType__OclAny = new ExecutorFragment(Types._TupleType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _TupleType__OclElement = new ExecutorFragment(Types._TupleType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _TupleType__OclType = new ExecutorFragment(Types._TupleType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _TupleType__TemplateableElement = new ExecutorFragment(Types._TupleType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _TupleType__TupleType = new ExecutorFragment(Types._TupleType, PivotTables.Types._TupleType);
		private static final @NonNull ExecutorFragment _TupleType__Type = new ExecutorFragment(Types._TupleType, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _Type__Element = new ExecutorFragment(Types._Type, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Type__NamedElement = new ExecutorFragment(Types._Type, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Type__OclAny = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Type__OclElement = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Type__OclType = new ExecutorFragment(Types._Type, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _Type__Type = new ExecutorFragment(Types._Type, PivotTables.Types._Type);

		private static final @NonNull ExecutorFragment _TypeExp__Element = new ExecutorFragment(Types._TypeExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _TypeExp__NamedElement = new ExecutorFragment(Types._TypeExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _TypeExp__OCLExpression = new ExecutorFragment(Types._TypeExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _TypeExp__OclAny = new ExecutorFragment(Types._TypeExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _TypeExp__OclElement = new ExecutorFragment(Types._TypeExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _TypeExp__ReferringElement = new ExecutorFragment(Types._TypeExp, PivotTables.Types._ReferringElement);
		private static final @NonNull ExecutorFragment _TypeExp__TypeExp = new ExecutorFragment(Types._TypeExp, PivotTables.Types._TypeExp);
		private static final @NonNull ExecutorFragment _TypeExp__TypedElement = new ExecutorFragment(Types._TypeExp, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _TypedElement__Element = new ExecutorFragment(Types._TypedElement, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _TypedElement__NamedElement = new ExecutorFragment(Types._TypedElement, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _TypedElement__OclAny = new ExecutorFragment(Types._TypedElement, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _TypedElement__OclElement = new ExecutorFragment(Types._TypedElement, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _TypedElement__TypedElement = new ExecutorFragment(Types._TypedElement, PivotTables.Types._TypedElement);

		private static final @NonNull ExecutorFragment _UnlimitedNaturalLiteralExp__Element = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _UnlimitedNaturalLiteralExp__LiteralExp = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._LiteralExp);
		private static final @NonNull ExecutorFragment _UnlimitedNaturalLiteralExp__NamedElement = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _UnlimitedNaturalLiteralExp__NumericLiteralExp = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._NumericLiteralExp);
		private static final @NonNull ExecutorFragment _UnlimitedNaturalLiteralExp__OCLExpression = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _UnlimitedNaturalLiteralExp__OclAny = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _UnlimitedNaturalLiteralExp__OclElement = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _UnlimitedNaturalLiteralExp__PrimitiveLiteralExp = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._PrimitiveLiteralExp);
		private static final @NonNull ExecutorFragment _UnlimitedNaturalLiteralExp__TypedElement = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp = new ExecutorFragment(Types._UnlimitedNaturalLiteralExp, PivotTables.Types._UnlimitedNaturalLiteralExp);

		private static final @NonNull ExecutorFragment _UnspecifiedValueExp__Element = new ExecutorFragment(Types._UnspecifiedValueExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _UnspecifiedValueExp__NamedElement = new ExecutorFragment(Types._UnspecifiedValueExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _UnspecifiedValueExp__OCLExpression = new ExecutorFragment(Types._UnspecifiedValueExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _UnspecifiedValueExp__OclAny = new ExecutorFragment(Types._UnspecifiedValueExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _UnspecifiedValueExp__OclElement = new ExecutorFragment(Types._UnspecifiedValueExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _UnspecifiedValueExp__TypedElement = new ExecutorFragment(Types._UnspecifiedValueExp, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _UnspecifiedValueExp__UnspecifiedValueExp = new ExecutorFragment(Types._UnspecifiedValueExp, PivotTables.Types._UnspecifiedValueExp);

		private static final @NonNull ExecutorFragment _ValueSpecification__Element = new ExecutorFragment(Types._ValueSpecification, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _ValueSpecification__NamedElement = new ExecutorFragment(Types._ValueSpecification, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _ValueSpecification__OclAny = new ExecutorFragment(Types._ValueSpecification, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _ValueSpecification__OclElement = new ExecutorFragment(Types._ValueSpecification, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _ValueSpecification__TypedElement = new ExecutorFragment(Types._ValueSpecification, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _ValueSpecification__ValueSpecification = new ExecutorFragment(Types._ValueSpecification, PivotTables.Types._ValueSpecification);

		private static final @NonNull ExecutorFragment _Variable__Element = new ExecutorFragment(Types._Variable, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Variable__NamedElement = new ExecutorFragment(Types._Variable, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Variable__OclAny = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Variable__OclElement = new ExecutorFragment(Types._Variable, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Variable__TypedElement = new ExecutorFragment(Types._Variable, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _Variable__Variable = new ExecutorFragment(Types._Variable, PivotTables.Types._Variable);
		private static final @NonNull ExecutorFragment _Variable__VariableDeclaration = new ExecutorFragment(Types._Variable, PivotTables.Types._VariableDeclaration);

		private static final @NonNull ExecutorFragment _VariableDeclaration__Element = new ExecutorFragment(Types._VariableDeclaration, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _VariableDeclaration__NamedElement = new ExecutorFragment(Types._VariableDeclaration, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _VariableDeclaration__OclAny = new ExecutorFragment(Types._VariableDeclaration, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _VariableDeclaration__OclElement = new ExecutorFragment(Types._VariableDeclaration, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _VariableDeclaration__TypedElement = new ExecutorFragment(Types._VariableDeclaration, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _VariableDeclaration__VariableDeclaration = new ExecutorFragment(Types._VariableDeclaration, PivotTables.Types._VariableDeclaration);

		private static final @NonNull ExecutorFragment _VariableExp__Element = new ExecutorFragment(Types._VariableExp, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _VariableExp__NamedElement = new ExecutorFragment(Types._VariableExp, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _VariableExp__OCLExpression = new ExecutorFragment(Types._VariableExp, PivotTables.Types._OCLExpression);
		private static final @NonNull ExecutorFragment _VariableExp__OclAny = new ExecutorFragment(Types._VariableExp, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _VariableExp__OclElement = new ExecutorFragment(Types._VariableExp, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _VariableExp__ReferringElement = new ExecutorFragment(Types._VariableExp, PivotTables.Types._ReferringElement);
		private static final @NonNull ExecutorFragment _VariableExp__TypedElement = new ExecutorFragment(Types._VariableExp, PivotTables.Types._TypedElement);
		private static final @NonNull ExecutorFragment _VariableExp__VariableExp = new ExecutorFragment(Types._VariableExp, PivotTables.Types._VariableExp);

		private static final @NonNull ExecutorFragment _Vertex__Element = new ExecutorFragment(Types._Vertex, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _Vertex__NamedElement = new ExecutorFragment(Types._Vertex, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _Vertex__OclAny = new ExecutorFragment(Types._Vertex, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Vertex__OclElement = new ExecutorFragment(Types._Vertex, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Vertex__Vertex = new ExecutorFragment(Types._Vertex, PivotTables.Types._Vertex);

		private static final @NonNull ExecutorFragment _Visitable__OclAny = new ExecutorFragment(Types._Visitable, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _Visitable__OclElement = new ExecutorFragment(Types._Visitable, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _Visitable__Visitable = new ExecutorFragment(Types._Visitable, PivotTables.Types._Visitable);

		private static final @NonNull ExecutorFragment _VoidType__Class = new ExecutorFragment(Types._VoidType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _VoidType__Element = new ExecutorFragment(Types._VoidType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _VoidType__NamedElement = new ExecutorFragment(Types._VoidType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _VoidType__Namespace = new ExecutorFragment(Types._VoidType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _VoidType__OclAny = new ExecutorFragment(Types._VoidType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _VoidType__OclElement = new ExecutorFragment(Types._VoidType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _VoidType__OclType = new ExecutorFragment(Types._VoidType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _VoidType__TemplateableElement = new ExecutorFragment(Types._VoidType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _VoidType__Type = new ExecutorFragment(Types._VoidType, PivotTables.Types._Type);
		private static final @NonNull ExecutorFragment _VoidType__VoidType = new ExecutorFragment(Types._VoidType, PivotTables.Types._VoidType);

		private static final @NonNull ExecutorFragment _WildcardType__Class = new ExecutorFragment(Types._WildcardType, PivotTables.Types._Class);
		private static final @NonNull ExecutorFragment _WildcardType__Element = new ExecutorFragment(Types._WildcardType, PivotTables.Types._Element);
		private static final @NonNull ExecutorFragment _WildcardType__NamedElement = new ExecutorFragment(Types._WildcardType, PivotTables.Types._NamedElement);
		private static final @NonNull ExecutorFragment _WildcardType__Namespace = new ExecutorFragment(Types._WildcardType, PivotTables.Types._Namespace);
		private static final @NonNull ExecutorFragment _WildcardType__OclAny = new ExecutorFragment(Types._WildcardType, OCLstdlibTables.Types._OclAny);
		private static final @NonNull ExecutorFragment _WildcardType__OclElement = new ExecutorFragment(Types._WildcardType, OCLstdlibTables.Types._OclElement);
		private static final @NonNull ExecutorFragment _WildcardType__OclType = new ExecutorFragment(Types._WildcardType, OCLstdlibTables.Types._OclType);
		private static final @NonNull ExecutorFragment _WildcardType__TemplateableElement = new ExecutorFragment(Types._WildcardType, PivotTables.Types._TemplateableElement);
		private static final @NonNull ExecutorFragment _WildcardType__Type = new ExecutorFragment(Types._WildcardType, PivotTables.Types._Type);
		private static final @NonNull ExecutorFragment _WildcardType__WildcardType = new ExecutorFragment(Types._WildcardType, PivotTables.Types._WildcardType);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PivotTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final @NonNull ParameterTypes _CallExp___Type = TypeUtil.createParameterTypes(PivotTables.Types._CallExp, PivotTables.Types._Type);
		public static final @NonNull ParameterTypes _Property = TypeUtil.createParameterTypes(PivotTables.Types._Property);
		public static final @NonNull ParameterTypes _String = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String);
		public static final @NonNull ParameterTypes _Type = TypeUtil.createParameterTypes(PivotTables.Types._Type);
		public static final @NonNull ParameterTypes _Type___String = TypeUtil.createParameterTypes(PivotTables.Types._Type, OCLstdlibTables.Types._String);
		public static final @NonNull ParameterTypes _ValueSpecification = TypeUtil.createParameterTypes(PivotTables.Types._ValueSpecification);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PivotTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final @NonNull ExecutorOperation _CompleteModel__getOwnedCompletePackage = new ExecutorOperation("getOwnedCompletePackage", Parameters._String, Types._CompleteModel,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final @NonNull ExecutorOperation _CompletePackage__getOwnedCompleteClass = new ExecutorOperation("getOwnedCompleteClass", Parameters._String, Types._CompletePackage,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final @NonNull ExecutorOperation _Element__allOwnedElements = new ExecutorOperation("allOwnedElements", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Element,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final @NonNull ExecutorOperation _Element__getValue = new ExecutorOperation("getValue", Parameters._Type___String, Types._Element,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final @NonNull ExecutorOperation _OCLExpression__isNonNull = new ExecutorOperation("isNonNull", TypeUtil.EMPTY_PARAMETER_TYPES, Types._OCLExpression,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final @NonNull ExecutorOperation _OCLExpression__isNull = new ExecutorOperation("isNull", TypeUtil.EMPTY_PARAMETER_TYPES, Types._OCLExpression,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final @NonNull ExecutorOperation _OperationCallExp__hasOclVoidOverload = new ExecutorOperation("hasOclVoidOverload", TypeUtil.EMPTY_PARAMETER_TYPES, Types._OperationCallExp,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final @NonNull ExecutorOperation _Property__isAttribute = new ExecutorOperation("isAttribute", Parameters._Property, Types._Property,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final @NonNull ExecutorOperation _PropertyCallExp__getSpecializedReferredPropertyOwningType = new ExecutorOperation("getSpecializedReferredPropertyOwningType", TypeUtil.EMPTY_PARAMETER_TYPES, Types._PropertyCallExp,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final @NonNull ExecutorOperation _PropertyCallExp__getSpecializedReferredPropertyType = new ExecutorOperation("getSpecializedReferredPropertyType", TypeUtil.EMPTY_PARAMETER_TYPES, Types._PropertyCallExp,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final @NonNull ExecutorOperation _ReferringElement__getReferredElement = new ExecutorOperation("getReferredElement", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ReferringElement,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final @NonNull ExecutorOperation _SelfType__specializeIn = new ExecutorOperation("specializeIn", Parameters._CallExp___Type, Types._SelfType,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final @NonNull ExecutorOperation _Type__conformsTo = new ExecutorOperation("conformsTo", Parameters._Type, Types._Type,
			0, TemplateParameters.EMPTY_LIST, org.eclipse.ocl.pivot.library.classifier.OclTypeConformsToOperation.INSTANCE);
		public static final @NonNull ExecutorOperation _Type__flattenedType = new ExecutorOperation("flattenedType", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Type,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final @NonNull ExecutorOperation _Type__isClass = new ExecutorOperation("isClass", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Type,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final @NonNull ExecutorOperation _Type__isTemplateParameter = new ExecutorOperation("isTemplateParameter", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Type,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final @NonNull ExecutorOperation _Type__specializeIn = new ExecutorOperation("specializeIn", Parameters._CallExp___Type, Types._Type,
			4, TemplateParameters.EMPTY_LIST, null);

		public static final @NonNull ExecutorOperation _TypedElement__CompatibleBody = new ExecutorOperation("CompatibleBody", Parameters._ValueSpecification, Types._TypedElement,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final @NonNull ExecutorOperation _ValueSpecification__booleanValue = new ExecutorOperation("booleanValue", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ValueSpecification,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final @NonNull ExecutorOperation _ValueSpecification__integerValue = new ExecutorOperation("integerValue", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ValueSpecification,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final @NonNull ExecutorOperation _ValueSpecification__isComputable = new ExecutorOperation("isComputable", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ValueSpecification,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final @NonNull ExecutorOperation _ValueSpecification__isNull = new ExecutorOperation("isNull", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ValueSpecification,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final @NonNull ExecutorOperation _ValueSpecification__stringValue = new ExecutorOperation("stringValue", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ValueSpecification,
			4, TemplateParameters.EMPTY_LIST, null);
		public static final @NonNull ExecutorOperation _ValueSpecification__unlimitedValue = new ExecutorOperation("unlimitedValue", TypeUtil.EMPTY_PARAMETER_TYPES, Types._ValueSpecification,
			5, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PivotTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final @NonNull ExecutorProperty _Annotation__ownedContents = new EcoreExecutorProperty(PivotPackage.Literals.ANNOTATION__OWNED_CONTENTS, Types._Annotation, 0);
		public static final @NonNull ExecutorProperty _Annotation__ownedDetails = new EcoreExecutorProperty(PivotPackage.Literals.ANNOTATION__OWNED_DETAILS, Types._Annotation, 1);
		public static final @NonNull ExecutorProperty _Annotation__references = new EcoreExecutorProperty(PivotPackage.Literals.ANNOTATION__REFERENCES, Types._Annotation, 2);

		public static final @NonNull ExecutorProperty _AssociationClass__unownedAttributes = new EcoreExecutorProperty(PivotPackage.Literals.ASSOCIATION_CLASS__UNOWNED_ATTRIBUTES, Types._AssociationClass, 0);
		public static final @NonNull ExecutorProperty _AssociationClass__AssociationClassCallExp__referredAssociationClass = new ExecutorPropertyWithImplementation("AssociationClassCallExp", Types._AssociationClass, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS));

		public static final @NonNull ExecutorProperty _AssociationClassCallExp__referredAssociationClass = new EcoreExecutorProperty(PivotPackage.Literals.ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_CLASS, Types._AssociationClassCallExp, 0);

		public static final @NonNull ExecutorProperty _Behavior__owningTransition = new EcoreExecutorProperty(PivotPackage.Literals.BEHAVIOR__OWNING_TRANSITION, Types._Behavior, 0);
		public static final @NonNull ExecutorProperty _Behavior__Class__ownedBehaviors = new ExecutorPropertyWithImplementation("Class", Types._Behavior, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CLASS__OWNED_BEHAVIORS));
		public static final @NonNull ExecutorProperty _Behavior__State__ownedDoActivity = new ExecutorPropertyWithImplementation("State", Types._Behavior, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.STATE__OWNED_DO_ACTIVITY));
		public static final @NonNull ExecutorProperty _Behavior__State__ownedEntry = new ExecutorPropertyWithImplementation("State", Types._Behavior, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.STATE__OWNED_ENTRY));
		public static final @NonNull ExecutorProperty _Behavior__State__ownedExit = new ExecutorPropertyWithImplementation("State", Types._Behavior, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.STATE__OWNED_EXIT));

		public static final @NonNull ExecutorProperty _BooleanLiteralExp__booleanSymbol = new EcoreExecutorProperty(PivotPackage.Literals.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL, Types._BooleanLiteralExp, 0);

		public static final @NonNull ExecutorProperty _CallExp__isImplicit = new EcoreExecutorProperty(PivotPackage.Literals.CALL_EXP__IS_IMPLICIT, Types._CallExp, 0);
		public static final @NonNull ExecutorProperty _CallExp__isSafe = new EcoreExecutorProperty(PivotPackage.Literals.CALL_EXP__IS_SAFE, Types._CallExp, 1);
		public static final @NonNull ExecutorProperty _CallExp__ownedSource = new EcoreExecutorProperty(PivotPackage.Literals.CALL_EXP__OWNED_SOURCE, Types._CallExp, 2);

		public static final @NonNull ExecutorProperty _CallOperationAction__operation = new EcoreExecutorProperty(PivotPackage.Literals.CALL_OPERATION_ACTION__OPERATION, Types._CallOperationAction, 0);
		public static final @NonNull ExecutorProperty _CallOperationAction__MessageExp__ownedCalledOperation = new ExecutorPropertyWithImplementation("MessageExp", Types._CallOperationAction, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_EXP__OWNED_CALLED_OPERATION));

		public static final @NonNull ExecutorProperty _Class__extenders = new EcoreExecutorProperty(PivotPackage.Literals.CLASS__EXTENDERS, Types._Class, 0);
		public static final @NonNull ExecutorProperty _Class__instanceClassName = new EcoreExecutorProperty(PivotPackage.Literals.CLASS__INSTANCE_CLASS_NAME, Types._Class, 1);
		public static final @NonNull ExecutorProperty _Class__isAbstract = new EcoreExecutorProperty(PivotPackage.Literals.CLASS__IS_ABSTRACT, Types._Class, 2);
		public static final @NonNull ExecutorProperty _Class__isActive = new EcoreExecutorProperty(PivotPackage.Literals.CLASS__IS_ACTIVE, Types._Class, 3);
		public static final @NonNull ExecutorProperty _Class__isInterface = new EcoreExecutorProperty(PivotPackage.Literals.CLASS__IS_INTERFACE, Types._Class, 4);
		public static final @NonNull ExecutorProperty _Class__ownedBehaviors = new EcoreExecutorProperty(PivotPackage.Literals.CLASS__OWNED_BEHAVIORS, Types._Class, 5);
		public static final @NonNull ExecutorProperty _Class__ownedInvariants = new EcoreExecutorProperty(PivotPackage.Literals.CLASS__OWNED_INVARIANTS, Types._Class, 6);
		public static final @NonNull ExecutorProperty _Class__ownedOperations = new EcoreExecutorProperty(PivotPackage.Literals.CLASS__OWNED_OPERATIONS, Types._Class, 7);
		public static final @NonNull ExecutorProperty _Class__ownedProperties = new EcoreExecutorProperty(PivotPackage.Literals.CLASS__OWNED_PROPERTIES, Types._Class, 8);
		public static final @NonNull ExecutorProperty _Class__owningPackage = new EcoreExecutorProperty(PivotPackage.Literals.CLASS__OWNING_PACKAGE, Types._Class, 9);
		public static final @NonNull ExecutorProperty _Class__superClasses = new EcoreExecutorProperty(PivotPackage.Literals.CLASS__SUPER_CLASSES, Types._Class, 10);
		public static final @NonNull ExecutorProperty _Class__Class__superClasses = new ExecutorPropertyWithImplementation("Class", Types._Class, 11, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CLASS__SUPER_CLASSES));
		public static final @NonNull ExecutorProperty _Class__CompleteClass__partialClasses = new ExecutorPropertyWithImplementation("CompleteClass", Types._Class, 12, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COMPLETE_CLASS__PARTIAL_CLASSES));
		public static final @NonNull ExecutorProperty _Class__DataType__behavioralClass = new ExecutorPropertyWithImplementation("DataType", Types._Class, 13, new EcoreLibraryOppositeProperty(PivotPackage.Literals.DATA_TYPE__BEHAVIORAL_CLASS));
		public static final @NonNull ExecutorProperty _Class__InstanceSpecification__classes = new ExecutorPropertyWithImplementation("InstanceSpecification", Types._Class, 14, new EcoreLibraryOppositeProperty(PivotPackage.Literals.INSTANCE_SPECIFICATION__CLASSES));
		public static final @NonNull ExecutorProperty _Class__MapType__entryClass = new ExecutorPropertyWithImplementation("MapType", Types._Class, 15, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MAP_TYPE__ENTRY_CLASS));
		public static final @NonNull ExecutorProperty _Class__TemplateParameter__constrainingClasses = new ExecutorPropertyWithImplementation("TemplateParameter", Types._Class, 16, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__CONSTRAINING_CLASSES));

		public static final @NonNull ExecutorProperty _CollectionItem__ownedItem = new EcoreExecutorProperty(PivotPackage.Literals.COLLECTION_ITEM__OWNED_ITEM, Types._CollectionItem, 0);

		public static final @NonNull ExecutorProperty _CollectionLiteralExp__kind = new EcoreExecutorProperty(PivotPackage.Literals.COLLECTION_LITERAL_EXP__KIND, Types._CollectionLiteralExp, 0);
		public static final @NonNull ExecutorProperty _CollectionLiteralExp__ownedParts = new EcoreExecutorProperty(PivotPackage.Literals.COLLECTION_LITERAL_EXP__OWNED_PARTS, Types._CollectionLiteralExp, 1);

		public static final @NonNull ExecutorProperty _CollectionLiteralPart__CollectionLiteralExp__ownedParts = new ExecutorPropertyWithImplementation("CollectionLiteralExp", Types._CollectionLiteralPart, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COLLECTION_LITERAL_EXP__OWNED_PARTS));

		public static final @NonNull ExecutorProperty _CollectionRange__ownedFirst = new EcoreExecutorProperty(PivotPackage.Literals.COLLECTION_RANGE__OWNED_FIRST, Types._CollectionRange, 0);
		public static final @NonNull ExecutorProperty _CollectionRange__ownedLast = new EcoreExecutorProperty(PivotPackage.Literals.COLLECTION_RANGE__OWNED_LAST, Types._CollectionRange, 1);

		public static final @NonNull ExecutorProperty _CollectionType__elementType = new EcoreExecutorProperty(PivotPackage.Literals.COLLECTION_TYPE__ELEMENT_TYPE, Types._CollectionType, 0);
		public static final @NonNull ExecutorProperty _CollectionType__isNullFree = new EcoreExecutorProperty(PivotPackage.Literals.COLLECTION_TYPE__IS_NULL_FREE, Types._CollectionType, 1);
		public static final @NonNull ExecutorProperty _CollectionType__lower = new EcoreExecutorProperty(PivotPackage.Literals.COLLECTION_TYPE__LOWER, Types._CollectionType, 2);
		public static final @NonNull ExecutorProperty _CollectionType__upper = new EcoreExecutorProperty(PivotPackage.Literals.COLLECTION_TYPE__UPPER, Types._CollectionType, 3);

		public static final @NonNull ExecutorProperty _Comment__annotatedElements = new EcoreExecutorProperty(PivotPackage.Literals.COMMENT__ANNOTATED_ELEMENTS, Types._Comment, 0);
		public static final @NonNull ExecutorProperty _Comment__body = new EcoreExecutorProperty(PivotPackage.Literals.COMMENT__BODY, Types._Comment, 1);
		public static final @NonNull ExecutorProperty _Comment__owningElement = new EcoreExecutorProperty(PivotPackage.Literals.COMMENT__OWNING_ELEMENT, Types._Comment, 2);

		public static final @NonNull ExecutorProperty _CompleteClass__owningCompletePackage = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_CLASS__OWNING_COMPLETE_PACKAGE, Types._CompleteClass, 0);
		public static final @NonNull ExecutorProperty _CompleteClass__partialClasses = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_CLASS__PARTIAL_CLASSES, Types._CompleteClass, 1);

		public static final @NonNull ExecutorProperty _CompleteEnvironment__ownedCompleteModel = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_ENVIRONMENT__OWNED_COMPLETE_MODEL, Types._CompleteEnvironment, 0);
		public static final @NonNull ExecutorProperty _CompleteEnvironment__ownedStandardLibrary = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_ENVIRONMENT__OWNED_STANDARD_LIBRARY, Types._CompleteEnvironment, 1);

		public static final @NonNull ExecutorProperty _CompleteModel__orphanCompletePackage = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_MODEL__ORPHAN_COMPLETE_PACKAGE, Types._CompleteModel, 0);
		public static final @NonNull ExecutorProperty _CompleteModel__ownedCompletePackages = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_MODEL__OWNED_COMPLETE_PACKAGES, Types._CompleteModel, 1);
		public static final @NonNull ExecutorProperty _CompleteModel__owningCompleteEnvironment = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_MODEL__OWNING_COMPLETE_ENVIRONMENT, Types._CompleteModel, 2);
		public static final @NonNull ExecutorProperty _CompleteModel__partialModels = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_MODEL__PARTIAL_MODELS, Types._CompleteModel, 3);
		public static final @NonNull ExecutorProperty _CompleteModel__primitiveCompletePackage = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_MODEL__PRIMITIVE_COMPLETE_PACKAGE, Types._CompleteModel, 4);

		public static final @NonNull ExecutorProperty _CompletePackage__ownedCompleteClasses = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_PACKAGE__OWNED_COMPLETE_CLASSES, Types._CompletePackage, 0);
		public static final @NonNull ExecutorProperty _CompletePackage__ownedCompletePackages = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_PACKAGE__OWNED_COMPLETE_PACKAGES, Types._CompletePackage, 1);
		public static final @NonNull ExecutorProperty _CompletePackage__owningCompleteModel = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_PACKAGE__OWNING_COMPLETE_MODEL, Types._CompletePackage, 2);
		public static final @NonNull ExecutorProperty _CompletePackage__owningCompletePackage = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_PACKAGE__OWNING_COMPLETE_PACKAGE, Types._CompletePackage, 3);
		public static final @NonNull ExecutorProperty _CompletePackage__partialPackages = new EcoreExecutorProperty(PivotPackage.Literals.COMPLETE_PACKAGE__PARTIAL_PACKAGES, Types._CompletePackage, 4);

		public static final @NonNull ExecutorProperty _ConnectionPointReference__entries = new EcoreExecutorProperty(PivotPackage.Literals.CONNECTION_POINT_REFERENCE__ENTRIES, Types._ConnectionPointReference, 0);
		public static final @NonNull ExecutorProperty _ConnectionPointReference__exits = new EcoreExecutorProperty(PivotPackage.Literals.CONNECTION_POINT_REFERENCE__EXITS, Types._ConnectionPointReference, 1);
		public static final @NonNull ExecutorProperty _ConnectionPointReference__owningState = new EcoreExecutorProperty(PivotPackage.Literals.CONNECTION_POINT_REFERENCE__OWNING_STATE, Types._ConnectionPointReference, 2);

		public static final @NonNull ExecutorProperty _Constraint__constrainedElements = new EcoreExecutorProperty(PivotPackage.Literals.CONSTRAINT__CONSTRAINED_ELEMENTS, Types._Constraint, 0);
		public static final @NonNull ExecutorProperty _Constraint__context = new EcoreExecutorProperty(PivotPackage.Literals.CONSTRAINT__CONTEXT, Types._Constraint, 1);
		public static final @NonNull ExecutorProperty _Constraint__isCallable = new EcoreExecutorProperty(PivotPackage.Literals.CONSTRAINT__IS_CALLABLE, Types._Constraint, 2);
		public static final @NonNull ExecutorProperty _Constraint__ownedSpecification = new EcoreExecutorProperty(PivotPackage.Literals.CONSTRAINT__OWNED_SPECIFICATION, Types._Constraint, 3);
		public static final @NonNull ExecutorProperty _Constraint__owningPostContext = new EcoreExecutorProperty(PivotPackage.Literals.CONSTRAINT__OWNING_POST_CONTEXT, Types._Constraint, 4);
		public static final @NonNull ExecutorProperty _Constraint__owningPreContext = new EcoreExecutorProperty(PivotPackage.Literals.CONSTRAINT__OWNING_PRE_CONTEXT, Types._Constraint, 5);
		public static final @NonNull ExecutorProperty _Constraint__owningState = new EcoreExecutorProperty(PivotPackage.Literals.CONSTRAINT__OWNING_STATE, Types._Constraint, 6);
		public static final @NonNull ExecutorProperty _Constraint__owningTransition = new EcoreExecutorProperty(PivotPackage.Literals.CONSTRAINT__OWNING_TRANSITION, Types._Constraint, 7);
		public static final @NonNull ExecutorProperty _Constraint__redefinedConstraints = new EcoreExecutorProperty(PivotPackage.Literals.CONSTRAINT__REDEFINED_CONSTRAINTS, Types._Constraint, 8);
		public static final @NonNull ExecutorProperty _Constraint__Class__ownedInvariants = new ExecutorPropertyWithImplementation("Class", Types._Constraint, 9, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CLASS__OWNED_INVARIANTS));
		public static final @NonNull ExecutorProperty _Constraint__Constraint__redefinedConstraints = new ExecutorPropertyWithImplementation("Constraint", Types._Constraint, 10, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONSTRAINT__REDEFINED_CONSTRAINTS));
		public static final @NonNull ExecutorProperty _Constraint__Namespace__ownedConstraints = new ExecutorPropertyWithImplementation("Namespace", Types._Constraint, 11, new EcoreLibraryOppositeProperty(PivotPackage.Literals.NAMESPACE__OWNED_CONSTRAINTS));

		public static final @NonNull ExecutorProperty _DataType__behavioralClass = new EcoreExecutorProperty(PivotPackage.Literals.DATA_TYPE__BEHAVIORAL_CLASS, Types._DataType, 0);
		public static final @NonNull ExecutorProperty _DataType__isSerializable = new EcoreExecutorProperty(PivotPackage.Literals.DATA_TYPE__IS_SERIALIZABLE, Types._DataType, 1);
		public static final @NonNull ExecutorProperty _DataType__value = new EcoreExecutorProperty(PivotPackage.Literals.DATA_TYPE__VALUE, Types._DataType, 2);

		public static final @NonNull ExecutorProperty _Detail__values = new EcoreExecutorProperty(PivotPackage.Literals.DETAIL__VALUES, Types._Detail, 0);
		public static final @NonNull ExecutorProperty _Detail__Annotation__ownedDetails = new ExecutorPropertyWithImplementation("Annotation", Types._Detail, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ANNOTATION__OWNED_DETAILS));

		public static final @NonNull ExecutorProperty _DynamicElement__metaType = new EcoreExecutorProperty(PivotPackage.Literals.DYNAMIC_ELEMENT__META_TYPE, Types._DynamicElement, 0);

		public static final @NonNull ExecutorProperty _DynamicProperty__default = new EcoreExecutorProperty(PivotPackage.Literals.DYNAMIC_PROPERTY__DEFAULT, Types._DynamicProperty, 0);
		public static final @NonNull ExecutorProperty _DynamicProperty__referredProperty = new EcoreExecutorProperty(PivotPackage.Literals.DYNAMIC_PROPERTY__REFERRED_PROPERTY, Types._DynamicProperty, 1);
		public static final @NonNull ExecutorProperty _DynamicProperty__DynamicType__ownedDynamicProperties = new ExecutorPropertyWithImplementation("DynamicType", Types._DynamicProperty, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.DYNAMIC_TYPE__OWNED_DYNAMIC_PROPERTIES));

		public static final @NonNull ExecutorProperty _DynamicType__ownedDynamicProperties = new EcoreExecutorProperty(PivotPackage.Literals.DYNAMIC_TYPE__OWNED_DYNAMIC_PROPERTIES, Types._DynamicType, 0);

		public static final @NonNull ExecutorProperty _Element__annotatingComments = new EcoreExecutorProperty(PivotPackage.Literals.ELEMENT__ANNOTATING_COMMENTS, Types._Element, 0);
		public static final @NonNull ExecutorProperty _Element__ownedAnnotations = new EcoreExecutorProperty(PivotPackage.Literals.ELEMENT__OWNED_ANNOTATIONS, Types._Element, 1);
		public static final @NonNull ExecutorProperty _Element__ownedComments = new EcoreExecutorProperty(PivotPackage.Literals.ELEMENT__OWNED_COMMENTS, Types._Element, 2);
		public static final @NonNull ExecutorProperty _Element__ownedExtensions = new EcoreExecutorProperty(PivotPackage.Literals.ELEMENT__OWNED_EXTENSIONS, Types._Element, 3);
		public static final @NonNull ExecutorProperty _Element__Annotation__ownedContents = new ExecutorPropertyWithImplementation("Annotation", Types._Element, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ANNOTATION__OWNED_CONTENTS));
		public static final @NonNull ExecutorProperty _Element__Annotation__references = new ExecutorPropertyWithImplementation("Annotation", Types._Element, 5, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ANNOTATION__REFERENCES));
		public static final @NonNull ExecutorProperty _Element__Constraint__constrainedElements = new ExecutorPropertyWithImplementation("Constraint", Types._Element, 6, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONSTRAINT__CONSTRAINED_ELEMENTS));
		public static final @NonNull ExecutorProperty _Element__Element__ownedAnnotations = new ExecutorPropertyWithImplementation("Element", Types._Element, 7, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ELEMENT__OWNED_ANNOTATIONS));

		public static final @NonNull ExecutorProperty _ElementExtension__base = new EcoreExecutorProperty(PivotPackage.Literals.ELEMENT_EXTENSION__BASE, Types._ElementExtension, 0);
		public static final @NonNull ExecutorProperty _ElementExtension__isApplied = new EcoreExecutorProperty(PivotPackage.Literals.ELEMENT_EXTENSION__IS_APPLIED, Types._ElementExtension, 1);
		public static final @NonNull ExecutorProperty _ElementExtension__isRequired = new EcoreExecutorProperty(PivotPackage.Literals.ELEMENT_EXTENSION__IS_REQUIRED, Types._ElementExtension, 2);
		public static final @NonNull ExecutorProperty _ElementExtension__stereotype = new EcoreExecutorProperty(PivotPackage.Literals.ELEMENT_EXTENSION__STEREOTYPE, Types._ElementExtension, 3);

		public static final @NonNull ExecutorProperty _EnumLiteralExp__referredLiteral = new EcoreExecutorProperty(PivotPackage.Literals.ENUM_LITERAL_EXP__REFERRED_LITERAL, Types._EnumLiteralExp, 0);

		public static final @NonNull ExecutorProperty _Enumeration__ownedLiterals = new EcoreExecutorProperty(PivotPackage.Literals.ENUMERATION__OWNED_LITERALS, Types._Enumeration, 0);

		public static final @NonNull ExecutorProperty _EnumerationLiteral__literal = new EcoreExecutorProperty(PivotPackage.Literals.ENUMERATION_LITERAL__LITERAL, Types._EnumerationLiteral, 0);
		public static final @NonNull ExecutorProperty _EnumerationLiteral__owningEnumeration = new EcoreExecutorProperty(PivotPackage.Literals.ENUMERATION_LITERAL__OWNING_ENUMERATION, Types._EnumerationLiteral, 1);
		public static final @NonNull ExecutorProperty _EnumerationLiteral__value = new EcoreExecutorProperty(PivotPackage.Literals.ENUMERATION_LITERAL__VALUE, Types._EnumerationLiteral, 2);
		public static final @NonNull ExecutorProperty _EnumerationLiteral__EnumLiteralExp__referredLiteral = new ExecutorPropertyWithImplementation("EnumLiteralExp", Types._EnumerationLiteral, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ENUM_LITERAL_EXP__REFERRED_LITERAL));

		public static final @NonNull ExecutorProperty _ExpressionInOCL__ownedBody = new EcoreExecutorProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__OWNED_BODY, Types._ExpressionInOCL, 0);
		public static final @NonNull ExecutorProperty _ExpressionInOCL__ownedContext = new EcoreExecutorProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__OWNED_CONTEXT, Types._ExpressionInOCL, 1);
		public static final @NonNull ExecutorProperty _ExpressionInOCL__ownedParameters = new EcoreExecutorProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__OWNED_PARAMETERS, Types._ExpressionInOCL, 2);
		public static final @NonNull ExecutorProperty _ExpressionInOCL__ownedResult = new EcoreExecutorProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__OWNED_RESULT, Types._ExpressionInOCL, 3);

		public static final @NonNull ExecutorProperty _Feature__implementation = new EcoreExecutorProperty(PivotPackage.Literals.FEATURE__IMPLEMENTATION, Types._Feature, 0);
		public static final @NonNull ExecutorProperty _Feature__implementationClass = new EcoreExecutorProperty(PivotPackage.Literals.FEATURE__IMPLEMENTATION_CLASS, Types._Feature, 1);
		public static final @NonNull ExecutorProperty _Feature__isStatic = new EcoreExecutorProperty(PivotPackage.Literals.FEATURE__IS_STATIC, Types._Feature, 2);

		public static final @NonNull ExecutorProperty _FeatureCallExp__isPre = new EcoreExecutorProperty(PivotPackage.Literals.FEATURE_CALL_EXP__IS_PRE, Types._FeatureCallExp, 0);

		public static final @NonNull ExecutorProperty _IfExp__isElseIf = new EcoreExecutorProperty(PivotPackage.Literals.IF_EXP__IS_ELSE_IF, Types._IfExp, 0);
		public static final @NonNull ExecutorProperty _IfExp__ownedCondition = new EcoreExecutorProperty(PivotPackage.Literals.IF_EXP__OWNED_CONDITION, Types._IfExp, 1);
		public static final @NonNull ExecutorProperty _IfExp__ownedElse = new EcoreExecutorProperty(PivotPackage.Literals.IF_EXP__OWNED_ELSE, Types._IfExp, 2);
		public static final @NonNull ExecutorProperty _IfExp__ownedThen = new EcoreExecutorProperty(PivotPackage.Literals.IF_EXP__OWNED_THEN, Types._IfExp, 3);

		public static final @NonNull ExecutorProperty _Import__importedNamespace = new EcoreExecutorProperty(PivotPackage.Literals.IMPORT__IMPORTED_NAMESPACE, Types._Import, 0);
		public static final @NonNull ExecutorProperty _Import__xmiidVersion = new EcoreExecutorProperty(PivotPackage.Literals.IMPORT__XMIID_VERSION, Types._Import, 1);
		public static final @NonNull ExecutorProperty _Import__Model__ownedImports = new ExecutorPropertyWithImplementation("Model", Types._Import, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MODEL__OWNED_IMPORTS));

		public static final @NonNull ExecutorProperty _InstanceSpecification__classes = new EcoreExecutorProperty(PivotPackage.Literals.INSTANCE_SPECIFICATION__CLASSES, Types._InstanceSpecification, 0);
		public static final @NonNull ExecutorProperty _InstanceSpecification__ownedSlots = new EcoreExecutorProperty(PivotPackage.Literals.INSTANCE_SPECIFICATION__OWNED_SLOTS, Types._InstanceSpecification, 1);
		public static final @NonNull ExecutorProperty _InstanceSpecification__ownedSpecification = new EcoreExecutorProperty(PivotPackage.Literals.INSTANCE_SPECIFICATION__OWNED_SPECIFICATION, Types._InstanceSpecification, 2);
		public static final @NonNull ExecutorProperty _InstanceSpecification__owningPackage = new EcoreExecutorProperty(PivotPackage.Literals.INSTANCE_SPECIFICATION__OWNING_PACKAGE, Types._InstanceSpecification, 3);

		public static final @NonNull ExecutorProperty _IntegerLiteralExp__integerSymbol = new EcoreExecutorProperty(PivotPackage.Literals.INTEGER_LITERAL_EXP__INTEGER_SYMBOL, Types._IntegerLiteralExp, 0);

		public static final @NonNull ExecutorProperty _IterateExp__ownedResult = new EcoreExecutorProperty(PivotPackage.Literals.ITERATE_EXP__OWNED_RESULT, Types._IterateExp, 0);

		public static final @NonNull ExecutorProperty _Iteration__ownedAccumulators = new EcoreExecutorProperty(PivotPackage.Literals.ITERATION__OWNED_ACCUMULATORS, Types._Iteration, 0);
		public static final @NonNull ExecutorProperty _Iteration__ownedIterators = new EcoreExecutorProperty(PivotPackage.Literals.ITERATION__OWNED_ITERATORS, Types._Iteration, 1);
		public static final @NonNull ExecutorProperty _Iteration__LoopExp__referredIteration = new ExecutorPropertyWithImplementation("LoopExp", Types._Iteration, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LOOP_EXP__REFERRED_ITERATION));

		public static final @NonNull ExecutorProperty _LambdaType__contextType = new EcoreExecutorProperty(PivotPackage.Literals.LAMBDA_TYPE__CONTEXT_TYPE, Types._LambdaType, 0);
		public static final @NonNull ExecutorProperty _LambdaType__parameterType = new EcoreExecutorProperty(PivotPackage.Literals.LAMBDA_TYPE__PARAMETER_TYPE, Types._LambdaType, 1);
		public static final @NonNull ExecutorProperty _LambdaType__resultType = new EcoreExecutorProperty(PivotPackage.Literals.LAMBDA_TYPE__RESULT_TYPE, Types._LambdaType, 2);

		public static final @NonNull ExecutorProperty _LanguageExpression__body = new EcoreExecutorProperty(PivotPackage.Literals.LANGUAGE_EXPRESSION__BODY, Types._LanguageExpression, 0);
		public static final @NonNull ExecutorProperty _LanguageExpression__language = new EcoreExecutorProperty(PivotPackage.Literals.LANGUAGE_EXPRESSION__LANGUAGE, Types._LanguageExpression, 1);
		public static final @NonNull ExecutorProperty _LanguageExpression__owningConstraint = new EcoreExecutorProperty(PivotPackage.Literals.LANGUAGE_EXPRESSION__OWNING_CONSTRAINT, Types._LanguageExpression, 2);
		public static final @NonNull ExecutorProperty _LanguageExpression__InstanceSpecification__ownedSpecification = new ExecutorPropertyWithImplementation("InstanceSpecification", Types._LanguageExpression, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.INSTANCE_SPECIFICATION__OWNED_SPECIFICATION));
		public static final @NonNull ExecutorProperty _LanguageExpression__Operation__bodyExpression = new ExecutorPropertyWithImplementation("Operation", Types._LanguageExpression, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION__BODY_EXPRESSION));
		public static final @NonNull ExecutorProperty _LanguageExpression__Property__ownedExpression = new ExecutorPropertyWithImplementation("Property", Types._LanguageExpression, 5, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PROPERTY__OWNED_EXPRESSION));

		public static final @NonNull ExecutorProperty _LetExp__ownedIn = new EcoreExecutorProperty(PivotPackage.Literals.LET_EXP__OWNED_IN, Types._LetExp, 0);
		public static final @NonNull ExecutorProperty _LetExp__ownedVariable = new EcoreExecutorProperty(PivotPackage.Literals.LET_EXP__OWNED_VARIABLE, Types._LetExp, 1);

		public static final @NonNull ExecutorProperty _Library__ownedPrecedences = new EcoreExecutorProperty(PivotPackage.Literals.LIBRARY__OWNED_PRECEDENCES, Types._Library, 0);

		public static final @NonNull ExecutorProperty _LoopExp__ownedBody = new EcoreExecutorProperty(PivotPackage.Literals.LOOP_EXP__OWNED_BODY, Types._LoopExp, 0);
		public static final @NonNull ExecutorProperty _LoopExp__ownedCoIterators = new EcoreExecutorProperty(PivotPackage.Literals.LOOP_EXP__OWNED_CO_ITERATORS, Types._LoopExp, 1);
		public static final @NonNull ExecutorProperty _LoopExp__ownedIterators = new EcoreExecutorProperty(PivotPackage.Literals.LOOP_EXP__OWNED_ITERATORS, Types._LoopExp, 2);
		public static final @NonNull ExecutorProperty _LoopExp__referredIteration = new EcoreExecutorProperty(PivotPackage.Literals.LOOP_EXP__REFERRED_ITERATION, Types._LoopExp, 3);

		public static final @NonNull ExecutorProperty _MapLiteralExp__ownedParts = new EcoreExecutorProperty(PivotPackage.Literals.MAP_LITERAL_EXP__OWNED_PARTS, Types._MapLiteralExp, 0);

		public static final @NonNull ExecutorProperty _MapLiteralPart__ownedKey = new EcoreExecutorProperty(PivotPackage.Literals.MAP_LITERAL_PART__OWNED_KEY, Types._MapLiteralPart, 0);
		public static final @NonNull ExecutorProperty _MapLiteralPart__ownedValue = new EcoreExecutorProperty(PivotPackage.Literals.MAP_LITERAL_PART__OWNED_VALUE, Types._MapLiteralPart, 1);
		public static final @NonNull ExecutorProperty _MapLiteralPart__MapLiteralExp__ownedParts = new ExecutorPropertyWithImplementation("MapLiteralExp", Types._MapLiteralPart, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MAP_LITERAL_EXP__OWNED_PARTS));

		public static final @NonNull ExecutorProperty _MapType__entryClass = new EcoreExecutorProperty(PivotPackage.Literals.MAP_TYPE__ENTRY_CLASS, Types._MapType, 0);
		public static final @NonNull ExecutorProperty _MapType__keyType = new EcoreExecutorProperty(PivotPackage.Literals.MAP_TYPE__KEY_TYPE, Types._MapType, 1);
		public static final @NonNull ExecutorProperty _MapType__keysAreNullFree = new EcoreExecutorProperty(PivotPackage.Literals.MAP_TYPE__KEYS_ARE_NULL_FREE, Types._MapType, 2);
		public static final @NonNull ExecutorProperty _MapType__valueType = new EcoreExecutorProperty(PivotPackage.Literals.MAP_TYPE__VALUE_TYPE, Types._MapType, 3);
		public static final @NonNull ExecutorProperty _MapType__valuesAreNullFree = new EcoreExecutorProperty(PivotPackage.Literals.MAP_TYPE__VALUES_ARE_NULL_FREE, Types._MapType, 4);

		public static final @NonNull ExecutorProperty _MessageExp__ownedArguments = new EcoreExecutorProperty(PivotPackage.Literals.MESSAGE_EXP__OWNED_ARGUMENTS, Types._MessageExp, 0);
		public static final @NonNull ExecutorProperty _MessageExp__ownedCalledOperation = new EcoreExecutorProperty(PivotPackage.Literals.MESSAGE_EXP__OWNED_CALLED_OPERATION, Types._MessageExp, 1);
		public static final @NonNull ExecutorProperty _MessageExp__ownedSentSignal = new EcoreExecutorProperty(PivotPackage.Literals.MESSAGE_EXP__OWNED_SENT_SIGNAL, Types._MessageExp, 2);
		public static final @NonNull ExecutorProperty _MessageExp__ownedTarget = new EcoreExecutorProperty(PivotPackage.Literals.MESSAGE_EXP__OWNED_TARGET, Types._MessageExp, 3);

		public static final @NonNull ExecutorProperty _MessageType__referredOperation = new EcoreExecutorProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_OPERATION, Types._MessageType, 0);
		public static final @NonNull ExecutorProperty _MessageType__referredSignal = new EcoreExecutorProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_SIGNAL, Types._MessageType, 1);

		public static final @NonNull ExecutorProperty _Model__externalURI = new EcoreExecutorProperty(PivotPackage.Literals.MODEL__EXTERNAL_URI, Types._Model, 0);
		public static final @NonNull ExecutorProperty _Model__ownedImports = new EcoreExecutorProperty(PivotPackage.Literals.MODEL__OWNED_IMPORTS, Types._Model, 1);
		public static final @NonNull ExecutorProperty _Model__ownedPackages = new EcoreExecutorProperty(PivotPackage.Literals.MODEL__OWNED_PACKAGES, Types._Model, 2);
		public static final @NonNull ExecutorProperty _Model__xmiidVersion = new EcoreExecutorProperty(PivotPackage.Literals.MODEL__XMIID_VERSION, Types._Model, 3);
		public static final @NonNull ExecutorProperty _Model__CompleteModel__partialModels = new ExecutorPropertyWithImplementation("CompleteModel", Types._Model, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COMPLETE_MODEL__PARTIAL_MODELS));

		public static final @NonNull ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(PivotPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final @NonNull ExecutorProperty _Namespace__ownedConstraints = new EcoreExecutorProperty(PivotPackage.Literals.NAMESPACE__OWNED_CONSTRAINTS, Types._Namespace, 0);
		public static final @NonNull ExecutorProperty _Namespace__Constraint__context = new ExecutorPropertyWithImplementation("Constraint", Types._Namespace, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONSTRAINT__CONTEXT));
		public static final @NonNull ExecutorProperty _Namespace__Import__importedNamespace = new ExecutorPropertyWithImplementation("Import", Types._Namespace, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.IMPORT__IMPORTED_NAMESPACE));

		public static final @NonNull ExecutorProperty _NavigationCallExp__navigationSource = new EcoreExecutorProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__NAVIGATION_SOURCE, Types._NavigationCallExp, 0);
		public static final @NonNull ExecutorProperty _NavigationCallExp__qualifiers = new EcoreExecutorProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__QUALIFIERS, Types._NavigationCallExp, 1);

		public static final @NonNull ExecutorProperty _OCLExpression__typeValue = new EcoreExecutorProperty(PivotPackage.Literals.OCL_EXPRESSION__TYPE_VALUE, Types._OCLExpression, 0);
		public static final @NonNull ExecutorProperty _OCLExpression__CallExp__ownedSource = new ExecutorPropertyWithImplementation("CallExp", Types._OCLExpression, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CALL_EXP__OWNED_SOURCE));
		public static final @NonNull ExecutorProperty _OCLExpression__CollectionItem__ownedItem = new ExecutorPropertyWithImplementation("CollectionItem", Types._OCLExpression, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COLLECTION_ITEM__OWNED_ITEM));
		public static final @NonNull ExecutorProperty _OCLExpression__CollectionRange__ownedFirst = new ExecutorPropertyWithImplementation("CollectionRange", Types._OCLExpression, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COLLECTION_RANGE__OWNED_FIRST));
		public static final @NonNull ExecutorProperty _OCLExpression__CollectionRange__ownedLast = new ExecutorPropertyWithImplementation("CollectionRange", Types._OCLExpression, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COLLECTION_RANGE__OWNED_LAST));
		public static final @NonNull ExecutorProperty _OCLExpression__ExpressionInOCL__ownedBody = new ExecutorPropertyWithImplementation("ExpressionInOCL", Types._OCLExpression, 5, new EcoreLibraryOppositeProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__OWNED_BODY));
		public static final @NonNull ExecutorProperty _OCLExpression__IfExp__ownedCondition = new ExecutorPropertyWithImplementation("IfExp", Types._OCLExpression, 6, new EcoreLibraryOppositeProperty(PivotPackage.Literals.IF_EXP__OWNED_CONDITION));
		public static final @NonNull ExecutorProperty _OCLExpression__IfExp__ownedElse = new ExecutorPropertyWithImplementation("IfExp", Types._OCLExpression, 7, new EcoreLibraryOppositeProperty(PivotPackage.Literals.IF_EXP__OWNED_ELSE));
		public static final @NonNull ExecutorProperty _OCLExpression__IfExp__ownedThen = new ExecutorPropertyWithImplementation("IfExp", Types._OCLExpression, 8, new EcoreLibraryOppositeProperty(PivotPackage.Literals.IF_EXP__OWNED_THEN));
		public static final @NonNull ExecutorProperty _OCLExpression__LetExp__ownedIn = new ExecutorPropertyWithImplementation("LetExp", Types._OCLExpression, 9, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LET_EXP__OWNED_IN));
		public static final @NonNull ExecutorProperty _OCLExpression__LoopExp__ownedBody = new ExecutorPropertyWithImplementation("LoopExp", Types._OCLExpression, 10, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LOOP_EXP__OWNED_BODY));
		public static final @NonNull ExecutorProperty _OCLExpression__MapLiteralPart__ownedKey = new ExecutorPropertyWithImplementation("MapLiteralPart", Types._OCLExpression, 11, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MAP_LITERAL_PART__OWNED_KEY));
		public static final @NonNull ExecutorProperty _OCLExpression__MapLiteralPart__ownedValue = new ExecutorPropertyWithImplementation("MapLiteralPart", Types._OCLExpression, 12, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MAP_LITERAL_PART__OWNED_VALUE));
		public static final @NonNull ExecutorProperty _OCLExpression__MessageExp__ownedArguments = new ExecutorPropertyWithImplementation("MessageExp", Types._OCLExpression, 13, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_EXP__OWNED_ARGUMENTS));
		public static final @NonNull ExecutorProperty _OCLExpression__MessageExp__ownedTarget = new ExecutorPropertyWithImplementation("MessageExp", Types._OCLExpression, 14, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_EXP__OWNED_TARGET));
		public static final @NonNull ExecutorProperty _OCLExpression__NavigationCallExp__qualifiers = new ExecutorPropertyWithImplementation("NavigationCallExp", Types._OCLExpression, 15, new EcoreLibraryOppositeProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__QUALIFIERS));
		public static final @NonNull ExecutorProperty _OCLExpression__OperationCallExp__ownedArguments = new ExecutorPropertyWithImplementation("OperationCallExp", Types._OCLExpression, 16, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION_CALL_EXP__OWNED_ARGUMENTS));
		public static final @NonNull ExecutorProperty _OCLExpression__ShadowPart__ownedInit = new ExecutorPropertyWithImplementation("ShadowPart", Types._OCLExpression, 17, new EcoreLibraryOppositeProperty(PivotPackage.Literals.SHADOW_PART__OWNED_INIT));
		public static final @NonNull ExecutorProperty _OCLExpression__TupleLiteralPart__ownedInit = new ExecutorPropertyWithImplementation("TupleLiteralPart", Types._OCLExpression, 18, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TUPLE_LITERAL_PART__OWNED_INIT));
		public static final @NonNull ExecutorProperty _OCLExpression__Variable__ownedInit = new ExecutorPropertyWithImplementation("Variable", Types._OCLExpression, 19, new EcoreLibraryOppositeProperty(PivotPackage.Literals.VARIABLE__OWNED_INIT));

		public static final @NonNull ExecutorProperty _Operation__bodyExpression = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION__BODY_EXPRESSION, Types._Operation, 0);
		public static final @NonNull ExecutorProperty _Operation__isInvalidating = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION__IS_INVALIDATING, Types._Operation, 1);
		public static final @NonNull ExecutorProperty _Operation__isTransient = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION__IS_TRANSIENT, Types._Operation, 2);
		public static final @NonNull ExecutorProperty _Operation__isTypeof = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION__IS_TYPEOF, Types._Operation, 3);
		public static final @NonNull ExecutorProperty _Operation__isValidating = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION__IS_VALIDATING, Types._Operation, 4);
		public static final @NonNull ExecutorProperty _Operation__ownedParameters = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION__OWNED_PARAMETERS, Types._Operation, 5);
		public static final @NonNull ExecutorProperty _Operation__ownedPostconditions = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION__OWNED_POSTCONDITIONS, Types._Operation, 6);
		public static final @NonNull ExecutorProperty _Operation__ownedPreconditions = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION__OWNED_PRECONDITIONS, Types._Operation, 7);
		public static final @NonNull ExecutorProperty _Operation__owningClass = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION__OWNING_CLASS, Types._Operation, 8);
		public static final @NonNull ExecutorProperty _Operation__precedence = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION__PRECEDENCE, Types._Operation, 9);
		public static final @NonNull ExecutorProperty _Operation__raisedExceptions = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION__RAISED_EXCEPTIONS, Types._Operation, 10);
		public static final @NonNull ExecutorProperty _Operation__redefinedOperations = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION__REDEFINED_OPERATIONS, Types._Operation, 11);
		public static final @NonNull ExecutorProperty _Operation__CallOperationAction__operation = new ExecutorPropertyWithImplementation("CallOperationAction", Types._Operation, 12, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CALL_OPERATION_ACTION__OPERATION));
		public static final @NonNull ExecutorProperty _Operation__MessageType__referredOperation = new ExecutorPropertyWithImplementation("MessageType", Types._Operation, 13, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_OPERATION));
		public static final @NonNull ExecutorProperty _Operation__Operation__redefinedOperations = new ExecutorPropertyWithImplementation("Operation", Types._Operation, 14, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION__REDEFINED_OPERATIONS));
		public static final @NonNull ExecutorProperty _Operation__OperationCallExp__referredOperation = new ExecutorPropertyWithImplementation("OperationCallExp", Types._Operation, 15, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION_CALL_EXP__REFERRED_OPERATION));
		public static final @NonNull ExecutorProperty _Operation__PrimitiveType__coercions = new ExecutorPropertyWithImplementation("PrimitiveType", Types._Operation, 16, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PRIMITIVE_TYPE__COERCIONS));

		public static final @NonNull ExecutorProperty _OperationCallExp__isVirtual = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION_CALL_EXP__IS_VIRTUAL, Types._OperationCallExp, 0);
		public static final @NonNull ExecutorProperty _OperationCallExp__ownedArguments = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION_CALL_EXP__OWNED_ARGUMENTS, Types._OperationCallExp, 1);
		public static final @NonNull ExecutorProperty _OperationCallExp__referredOperation = new EcoreExecutorProperty(PivotPackage.Literals.OPERATION_CALL_EXP__REFERRED_OPERATION, Types._OperationCallExp, 2);

		public static final @NonNull ExecutorProperty _OppositePropertyCallExp__referredProperty = new EcoreExecutorProperty(PivotPackage.Literals.OPPOSITE_PROPERTY_CALL_EXP__REFERRED_PROPERTY, Types._OppositePropertyCallExp, 0);

		public static final @NonNull ExecutorProperty _OrphanCompletePackage__CompleteModel__orphanCompletePackage = new ExecutorPropertyWithImplementation("CompleteModel", Types._OrphanCompletePackage, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COMPLETE_MODEL__ORPHAN_COMPLETE_PACKAGE));

		public static final @NonNull ExecutorProperty _Package__URI = new EcoreExecutorProperty(PivotPackage.Literals.PACKAGE__URI, Types._Package, 0);
		public static final @NonNull ExecutorProperty _Package__importedPackages = new EcoreExecutorProperty(PivotPackage.Literals.PACKAGE__IMPORTED_PACKAGES, Types._Package, 1);
		public static final @NonNull ExecutorProperty _Package__nsPrefix = new EcoreExecutorProperty(PivotPackage.Literals.PACKAGE__NS_PREFIX, Types._Package, 2);
		public static final @NonNull ExecutorProperty _Package__ownedClasses = new EcoreExecutorProperty(PivotPackage.Literals.PACKAGE__OWNED_CLASSES, Types._Package, 3);
		public static final @NonNull ExecutorProperty _Package__ownedInstances = new EcoreExecutorProperty(PivotPackage.Literals.PACKAGE__OWNED_INSTANCES, Types._Package, 4);
		public static final @NonNull ExecutorProperty _Package__ownedPackages = new EcoreExecutorProperty(PivotPackage.Literals.PACKAGE__OWNED_PACKAGES, Types._Package, 5);
		public static final @NonNull ExecutorProperty _Package__ownedProfileApplications = new EcoreExecutorProperty(PivotPackage.Literals.PACKAGE__OWNED_PROFILE_APPLICATIONS, Types._Package, 6);
		public static final @NonNull ExecutorProperty _Package__owningPackage = new EcoreExecutorProperty(PivotPackage.Literals.PACKAGE__OWNING_PACKAGE, Types._Package, 7);
		public static final @NonNull ExecutorProperty _Package__CompletePackage__partialPackages = new ExecutorPropertyWithImplementation("CompletePackage", Types._Package, 8, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COMPLETE_PACKAGE__PARTIAL_PACKAGES));
		public static final @NonNull ExecutorProperty _Package__Model__ownedPackages = new ExecutorPropertyWithImplementation("Model", Types._Package, 9, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MODEL__OWNED_PACKAGES));
		public static final @NonNull ExecutorProperty _Package__Package__importedPackages = new ExecutorPropertyWithImplementation("Package", Types._Package, 10, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PACKAGE__IMPORTED_PACKAGES));

		public static final @NonNull ExecutorProperty _Parameter__isTypeof = new EcoreExecutorProperty(PivotPackage.Literals.PARAMETER__IS_TYPEOF, Types._Parameter, 0);
		public static final @NonNull ExecutorProperty _Parameter__owningOperation = new EcoreExecutorProperty(PivotPackage.Literals.PARAMETER__OWNING_OPERATION, Types._Parameter, 1);
		public static final @NonNull ExecutorProperty _Parameter__Iteration__ownedAccumulators = new ExecutorPropertyWithImplementation("Iteration", Types._Parameter, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ITERATION__OWNED_ACCUMULATORS));
		public static final @NonNull ExecutorProperty _Parameter__Iteration__ownedIterators = new ExecutorPropertyWithImplementation("Iteration", Types._Parameter, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ITERATION__OWNED_ITERATORS));
		public static final @NonNull ExecutorProperty _Parameter__Variable__representedParameter = new ExecutorPropertyWithImplementation("Variable", Types._Parameter, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.VARIABLE__REPRESENTED_PARAMETER));

		public static final @NonNull ExecutorProperty _Precedence__associativity = new EcoreExecutorProperty(PivotPackage.Literals.PRECEDENCE__ASSOCIATIVITY, Types._Precedence, 0);
		public static final @NonNull ExecutorProperty _Precedence__order = new EcoreExecutorProperty(PivotPackage.Literals.PRECEDENCE__ORDER, Types._Precedence, 1);
		public static final @NonNull ExecutorProperty _Precedence__Library__ownedPrecedences = new ExecutorPropertyWithImplementation("Library", Types._Precedence, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LIBRARY__OWNED_PRECEDENCES));
		public static final @NonNull ExecutorProperty _Precedence__Operation__precedence = new ExecutorPropertyWithImplementation("Operation", Types._Precedence, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION__PRECEDENCE));

		public static final @NonNull ExecutorProperty _PrimitiveCompletePackage__CompleteModel__primitiveCompletePackage = new ExecutorPropertyWithImplementation("CompleteModel", Types._PrimitiveCompletePackage, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COMPLETE_MODEL__PRIMITIVE_COMPLETE_PACKAGE));

		public static final @NonNull ExecutorProperty _PrimitiveType__coercions = new EcoreExecutorProperty(PivotPackage.Literals.PRIMITIVE_TYPE__COERCIONS, Types._PrimitiveType, 0);

		public static final @NonNull ExecutorProperty _Profile__profileApplications = new EcoreExecutorProperty(PivotPackage.Literals.PROFILE__PROFILE_APPLICATIONS, Types._Profile, 0);

		public static final @NonNull ExecutorProperty _ProfileApplication__appliedProfile = new EcoreExecutorProperty(PivotPackage.Literals.PROFILE_APPLICATION__APPLIED_PROFILE, Types._ProfileApplication, 0);
		public static final @NonNull ExecutorProperty _ProfileApplication__isStrict = new EcoreExecutorProperty(PivotPackage.Literals.PROFILE_APPLICATION__IS_STRICT, Types._ProfileApplication, 1);
		public static final @NonNull ExecutorProperty _ProfileApplication__owningPackage = new EcoreExecutorProperty(PivotPackage.Literals.PROFILE_APPLICATION__OWNING_PACKAGE, Types._ProfileApplication, 2);

		public static final @NonNull ExecutorProperty _Property__associationClass = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__ASSOCIATION_CLASS, Types._Property, 0);
		public static final @NonNull ExecutorProperty _Property__defaultValue = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__DEFAULT_VALUE, Types._Property, 1);
		public static final @NonNull ExecutorProperty _Property__defaultValueString = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__DEFAULT_VALUE_STRING, Types._Property, 2);
		public static final @NonNull ExecutorProperty _Property__isComposite = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__IS_COMPOSITE, Types._Property, 3);
		public static final @NonNull ExecutorProperty _Property__isDerived = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__IS_DERIVED, Types._Property, 4);
		public static final @NonNull ExecutorProperty _Property__isID = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__IS_ID, Types._Property, 5);
		public static final @NonNull ExecutorProperty _Property__isImplicit = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__IS_IMPLICIT, Types._Property, 6);
		public static final @NonNull ExecutorProperty _Property__isReadOnly = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__IS_READ_ONLY, Types._Property, 7);
		public static final @NonNull ExecutorProperty _Property__isResolveProxies = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__IS_RESOLVE_PROXIES, Types._Property, 8);
		public static final @NonNull ExecutorProperty _Property__isTransient = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__IS_TRANSIENT, Types._Property, 9);
		public static final @NonNull ExecutorProperty _Property__isUnsettable = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__IS_UNSETTABLE, Types._Property, 10);
		public static final @NonNull ExecutorProperty _Property__isVolatile = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__IS_VOLATILE, Types._Property, 11);
		public static final @NonNull ExecutorProperty _Property__keys = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__KEYS, Types._Property, 12);
		public static final @NonNull ExecutorProperty _Property__opposite = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__OPPOSITE, Types._Property, 13);
		public static final @NonNull ExecutorProperty _Property__ownedExpression = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__OWNED_EXPRESSION, Types._Property, 14);
		public static final @NonNull ExecutorProperty _Property__owningClass = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__OWNING_CLASS, Types._Property, 15);
		public static final @NonNull ExecutorProperty _Property__redefinedProperties = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__REDEFINED_PROPERTIES, Types._Property, 16);
		public static final @NonNull ExecutorProperty _Property__referredProperty = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__REFERRED_PROPERTY, Types._Property, 17);
		public static final @NonNull ExecutorProperty _Property__subsettedProperty = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY__SUBSETTED_PROPERTY, Types._Property, 18);
		public static final @NonNull ExecutorProperty _Property__DynamicProperty__referredProperty = new ExecutorPropertyWithImplementation("DynamicProperty", Types._Property, 19, new EcoreLibraryOppositeProperty(PivotPackage.Literals.DYNAMIC_PROPERTY__REFERRED_PROPERTY));
		public static final @NonNull ExecutorProperty _Property__NavigationCallExp__navigationSource = new ExecutorPropertyWithImplementation("NavigationCallExp", Types._Property, 20, new EcoreLibraryOppositeProperty(PivotPackage.Literals.NAVIGATION_CALL_EXP__NAVIGATION_SOURCE));
		public static final @NonNull ExecutorProperty _Property__OppositePropertyCallExp__referredProperty = new ExecutorPropertyWithImplementation("OppositePropertyCallExp", Types._Property, 21, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPPOSITE_PROPERTY_CALL_EXP__REFERRED_PROPERTY));
		public static final @NonNull ExecutorProperty _Property__Property__keys = new ExecutorPropertyWithImplementation("Property", Types._Property, 22, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PROPERTY__KEYS));
		public static final @NonNull ExecutorProperty _Property__Property__opposite = new ExecutorPropertyWithImplementation("Property", Types._Property, 23, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PROPERTY__OPPOSITE));
		public static final @NonNull ExecutorProperty _Property__Property__redefinedProperties = new ExecutorPropertyWithImplementation("Property", Types._Property, 24, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PROPERTY__REDEFINED_PROPERTIES));
		public static final @NonNull ExecutorProperty _Property__Property__referredProperty = new ExecutorPropertyWithImplementation("Property", Types._Property, 25, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PROPERTY__REFERRED_PROPERTY));
		public static final @NonNull ExecutorProperty _Property__Property__subsettedProperty = new ExecutorPropertyWithImplementation("Property", Types._Property, 26, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PROPERTY__SUBSETTED_PROPERTY));
		public static final @NonNull ExecutorProperty _Property__PropertyCallExp__referredProperty = new ExecutorPropertyWithImplementation("PropertyCallExp", Types._Property, 27, new EcoreLibraryOppositeProperty(PivotPackage.Literals.PROPERTY_CALL_EXP__REFERRED_PROPERTY));
		public static final @NonNull ExecutorProperty _Property__ShadowPart__referredProperty = new ExecutorPropertyWithImplementation("ShadowPart", Types._Property, 28, new EcoreLibraryOppositeProperty(PivotPackage.Literals.SHADOW_PART__REFERRED_PROPERTY));
		public static final @NonNull ExecutorProperty _Property__Slot__definingProperty = new ExecutorPropertyWithImplementation("Slot", Types._Property, 29, new EcoreLibraryOppositeProperty(PivotPackage.Literals.SLOT__DEFINING_PROPERTY));

		public static final @NonNull ExecutorProperty _PropertyCallExp__referredProperty = new EcoreExecutorProperty(PivotPackage.Literals.PROPERTY_CALL_EXP__REFERRED_PROPERTY, Types._PropertyCallExp, 0);

		public static final @NonNull ExecutorProperty _Pseudostate__kind = new EcoreExecutorProperty(PivotPackage.Literals.PSEUDOSTATE__KIND, Types._Pseudostate, 0);
		public static final @NonNull ExecutorProperty _Pseudostate__owningState = new EcoreExecutorProperty(PivotPackage.Literals.PSEUDOSTATE__OWNING_STATE, Types._Pseudostate, 1);
		public static final @NonNull ExecutorProperty _Pseudostate__owningStateMachine = new EcoreExecutorProperty(PivotPackage.Literals.PSEUDOSTATE__OWNING_STATE_MACHINE, Types._Pseudostate, 2);
		public static final @NonNull ExecutorProperty _Pseudostate__ConnectionPointReference__entries = new ExecutorPropertyWithImplementation("ConnectionPointReference", Types._Pseudostate, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONNECTION_POINT_REFERENCE__ENTRIES));
		public static final @NonNull ExecutorProperty _Pseudostate__ConnectionPointReference__exits = new ExecutorPropertyWithImplementation("ConnectionPointReference", Types._Pseudostate, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.CONNECTION_POINT_REFERENCE__EXITS));

		public static final @NonNull ExecutorProperty _RealLiteralExp__realSymbol = new EcoreExecutorProperty(PivotPackage.Literals.REAL_LITERAL_EXP__REAL_SYMBOL, Types._RealLiteralExp, 0);

		public static final @NonNull ExecutorProperty _Region__extendedRegion = new EcoreExecutorProperty(PivotPackage.Literals.REGION__EXTENDED_REGION, Types._Region, 0);
		public static final @NonNull ExecutorProperty _Region__ownedSubvertexes = new EcoreExecutorProperty(PivotPackage.Literals.REGION__OWNED_SUBVERTEXES, Types._Region, 1);
		public static final @NonNull ExecutorProperty _Region__ownedTransitions = new EcoreExecutorProperty(PivotPackage.Literals.REGION__OWNED_TRANSITIONS, Types._Region, 2);
		public static final @NonNull ExecutorProperty _Region__owningState = new EcoreExecutorProperty(PivotPackage.Literals.REGION__OWNING_STATE, Types._Region, 3);
		public static final @NonNull ExecutorProperty _Region__owningStateMachine = new EcoreExecutorProperty(PivotPackage.Literals.REGION__OWNING_STATE_MACHINE, Types._Region, 4);
		public static final @NonNull ExecutorProperty _Region__Region__extendedRegion = new ExecutorPropertyWithImplementation("Region", Types._Region, 5, new EcoreLibraryOppositeProperty(PivotPackage.Literals.REGION__EXTENDED_REGION));

		public static final @NonNull ExecutorProperty _SendSignalAction__signal = new EcoreExecutorProperty(PivotPackage.Literals.SEND_SIGNAL_ACTION__SIGNAL, Types._SendSignalAction, 0);
		public static final @NonNull ExecutorProperty _SendSignalAction__MessageExp__ownedSentSignal = new ExecutorPropertyWithImplementation("MessageExp", Types._SendSignalAction, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_EXP__OWNED_SENT_SIGNAL));

		public static final @NonNull ExecutorProperty _ShadowExp__ownedParts = new EcoreExecutorProperty(PivotPackage.Literals.SHADOW_EXP__OWNED_PARTS, Types._ShadowExp, 0);
		public static final @NonNull ExecutorProperty _ShadowExp__value = new EcoreExecutorProperty(PivotPackage.Literals.SHADOW_EXP__VALUE, Types._ShadowExp, 1);

		public static final @NonNull ExecutorProperty _ShadowPart__ownedInit = new EcoreExecutorProperty(PivotPackage.Literals.SHADOW_PART__OWNED_INIT, Types._ShadowPart, 0);
		public static final @NonNull ExecutorProperty _ShadowPart__referredProperty = new EcoreExecutorProperty(PivotPackage.Literals.SHADOW_PART__REFERRED_PROPERTY, Types._ShadowPart, 1);
		public static final @NonNull ExecutorProperty _ShadowPart__ShadowExp__ownedParts = new ExecutorPropertyWithImplementation("ShadowExp", Types._ShadowPart, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.SHADOW_EXP__OWNED_PARTS));

		public static final @NonNull ExecutorProperty _Signal__MessageType__referredSignal = new ExecutorPropertyWithImplementation("MessageType", Types._Signal, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MESSAGE_TYPE__REFERRED_SIGNAL));
		public static final @NonNull ExecutorProperty _Signal__SendSignalAction__signal = new ExecutorPropertyWithImplementation("SendSignalAction", Types._Signal, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.SEND_SIGNAL_ACTION__SIGNAL));

		public static final @NonNull ExecutorProperty _Slot__definingProperty = new EcoreExecutorProperty(PivotPackage.Literals.SLOT__DEFINING_PROPERTY, Types._Slot, 0);
		public static final @NonNull ExecutorProperty _Slot__ownedValues = new EcoreExecutorProperty(PivotPackage.Literals.SLOT__OWNED_VALUES, Types._Slot, 1);
		public static final @NonNull ExecutorProperty _Slot__owningInstance = new EcoreExecutorProperty(PivotPackage.Literals.SLOT__OWNING_INSTANCE, Types._Slot, 2);

		public static final @NonNull ExecutorProperty _StandardLibrary__owningCompleteEnvironment = new EcoreExecutorProperty(PivotPackage.Literals.STANDARD_LIBRARY__OWNING_COMPLETE_ENVIRONMENT, Types._StandardLibrary, 0);

		public static final @NonNull ExecutorProperty _State__isComposite = new EcoreExecutorProperty(PivotPackage.Literals.STATE__IS_COMPOSITE, Types._State, 0);
		public static final @NonNull ExecutorProperty _State__isOrthogonal = new EcoreExecutorProperty(PivotPackage.Literals.STATE__IS_ORTHOGONAL, Types._State, 1);
		public static final @NonNull ExecutorProperty _State__isSimple = new EcoreExecutorProperty(PivotPackage.Literals.STATE__IS_SIMPLE, Types._State, 2);
		public static final @NonNull ExecutorProperty _State__isSubmachineState = new EcoreExecutorProperty(PivotPackage.Literals.STATE__IS_SUBMACHINE_STATE, Types._State, 3);
		public static final @NonNull ExecutorProperty _State__ownedConnectionPoints = new EcoreExecutorProperty(PivotPackage.Literals.STATE__OWNED_CONNECTION_POINTS, Types._State, 4);
		public static final @NonNull ExecutorProperty _State__ownedConnections = new EcoreExecutorProperty(PivotPackage.Literals.STATE__OWNED_CONNECTIONS, Types._State, 5);
		public static final @NonNull ExecutorProperty _State__ownedDeferrableTriggers = new EcoreExecutorProperty(PivotPackage.Literals.STATE__OWNED_DEFERRABLE_TRIGGERS, Types._State, 6);
		public static final @NonNull ExecutorProperty _State__ownedDoActivity = new EcoreExecutorProperty(PivotPackage.Literals.STATE__OWNED_DO_ACTIVITY, Types._State, 7);
		public static final @NonNull ExecutorProperty _State__ownedEntry = new EcoreExecutorProperty(PivotPackage.Literals.STATE__OWNED_ENTRY, Types._State, 8);
		public static final @NonNull ExecutorProperty _State__ownedExit = new EcoreExecutorProperty(PivotPackage.Literals.STATE__OWNED_EXIT, Types._State, 9);
		public static final @NonNull ExecutorProperty _State__ownedRegions = new EcoreExecutorProperty(PivotPackage.Literals.STATE__OWNED_REGIONS, Types._State, 10);
		public static final @NonNull ExecutorProperty _State__ownedStateInvariant = new EcoreExecutorProperty(PivotPackage.Literals.STATE__OWNED_STATE_INVARIANT, Types._State, 11);
		public static final @NonNull ExecutorProperty _State__redefinedState = new EcoreExecutorProperty(PivotPackage.Literals.STATE__REDEFINED_STATE, Types._State, 12);
		public static final @NonNull ExecutorProperty _State__submachines = new EcoreExecutorProperty(PivotPackage.Literals.STATE__SUBMACHINES, Types._State, 13);
		public static final @NonNull ExecutorProperty _State__State__redefinedState = new ExecutorPropertyWithImplementation("State", Types._State, 14, new EcoreLibraryOppositeProperty(PivotPackage.Literals.STATE__REDEFINED_STATE));
		public static final @NonNull ExecutorProperty _State__StateExp__referredState = new ExecutorPropertyWithImplementation("StateExp", Types._State, 15, new EcoreLibraryOppositeProperty(PivotPackage.Literals.STATE_EXP__REFERRED_STATE));

		public static final @NonNull ExecutorProperty _StateExp__referredState = new EcoreExecutorProperty(PivotPackage.Literals.STATE_EXP__REFERRED_STATE, Types._StateExp, 0);

		public static final @NonNull ExecutorProperty _StateMachine__extendedStateMachines = new EcoreExecutorProperty(PivotPackage.Literals.STATE_MACHINE__EXTENDED_STATE_MACHINES, Types._StateMachine, 0);
		public static final @NonNull ExecutorProperty _StateMachine__ownedConnectionPoints = new EcoreExecutorProperty(PivotPackage.Literals.STATE_MACHINE__OWNED_CONNECTION_POINTS, Types._StateMachine, 1);
		public static final @NonNull ExecutorProperty _StateMachine__ownedRegions = new EcoreExecutorProperty(PivotPackage.Literals.STATE_MACHINE__OWNED_REGIONS, Types._StateMachine, 2);
		public static final @NonNull ExecutorProperty _StateMachine__submachineStates = new EcoreExecutorProperty(PivotPackage.Literals.STATE_MACHINE__SUBMACHINE_STATES, Types._StateMachine, 3);
		public static final @NonNull ExecutorProperty _StateMachine__StateMachine__extendedStateMachines = new ExecutorPropertyWithImplementation("StateMachine", Types._StateMachine, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.STATE_MACHINE__EXTENDED_STATE_MACHINES));

		public static final @NonNull ExecutorProperty _Stereotype__ownedExtenders = new EcoreExecutorProperty(PivotPackage.Literals.STEREOTYPE__OWNED_EXTENDERS, Types._Stereotype, 0);
		public static final @NonNull ExecutorProperty _Stereotype__ElementExtension__stereotype = new ExecutorPropertyWithImplementation("ElementExtension", Types._Stereotype, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ELEMENT_EXTENSION__STEREOTYPE));

		public static final @NonNull ExecutorProperty _StereotypeExtender__class = new EcoreExecutorProperty(PivotPackage.Literals.STEREOTYPE_EXTENDER__CLASS, Types._StereotypeExtender, 0);
		public static final @NonNull ExecutorProperty _StereotypeExtender__isRequired = new EcoreExecutorProperty(PivotPackage.Literals.STEREOTYPE_EXTENDER__IS_REQUIRED, Types._StereotypeExtender, 1);
		public static final @NonNull ExecutorProperty _StereotypeExtender__owningStereotype = new EcoreExecutorProperty(PivotPackage.Literals.STEREOTYPE_EXTENDER__OWNING_STEREOTYPE, Types._StereotypeExtender, 2);

		public static final @NonNull ExecutorProperty _StringLiteralExp__stringSymbol = new EcoreExecutorProperty(PivotPackage.Literals.STRING_LITERAL_EXP__STRING_SYMBOL, Types._StringLiteralExp, 0);

		public static final @NonNull ExecutorProperty _TemplateBinding__ownedSubstitutions = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATE_BINDING__OWNED_SUBSTITUTIONS, Types._TemplateBinding, 0);
		public static final @NonNull ExecutorProperty _TemplateBinding__owningElement = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATE_BINDING__OWNING_ELEMENT, Types._TemplateBinding, 1);
		public static final @NonNull ExecutorProperty _TemplateBinding__templateSignature = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATE_BINDING__TEMPLATE_SIGNATURE, Types._TemplateBinding, 2);

		public static final @NonNull ExecutorProperty _TemplateParameter__constrainingClasses = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__CONSTRAINING_CLASSES, Types._TemplateParameter, 0);
		public static final @NonNull ExecutorProperty _TemplateParameter__owningSignature = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATE_PARAMETER__OWNING_SIGNATURE, Types._TemplateParameter, 1);
		public static final @NonNull ExecutorProperty _TemplateParameter__TemplateParameterSubstitution__formal = new ExecutorPropertyWithImplementation("TemplateParameterSubstitution", Types._TemplateParameter, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL));

		public static final @NonNull ExecutorProperty _TemplateParameterSubstitution__actual = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL, Types._TemplateParameterSubstitution, 0);
		public static final @NonNull ExecutorProperty _TemplateParameterSubstitution__formal = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, Types._TemplateParameterSubstitution, 1);
		public static final @NonNull ExecutorProperty _TemplateParameterSubstitution__ownedWildcard = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_WILDCARD, Types._TemplateParameterSubstitution, 2);
		public static final @NonNull ExecutorProperty _TemplateParameterSubstitution__owningBinding = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNING_BINDING, Types._TemplateParameterSubstitution, 3);

		public static final @NonNull ExecutorProperty _TemplateSignature__ownedParameters = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATE_SIGNATURE__OWNED_PARAMETERS, Types._TemplateSignature, 0);
		public static final @NonNull ExecutorProperty _TemplateSignature__owningElement = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATE_SIGNATURE__OWNING_ELEMENT, Types._TemplateSignature, 1);
		public static final @NonNull ExecutorProperty _TemplateSignature__TemplateBinding__templateSignature = new ExecutorPropertyWithImplementation("TemplateBinding", Types._TemplateSignature, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TEMPLATE_BINDING__TEMPLATE_SIGNATURE));

		public static final @NonNull ExecutorProperty _TemplateableElement__ownedBindings = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_BINDINGS, Types._TemplateableElement, 0);
		public static final @NonNull ExecutorProperty _TemplateableElement__ownedSignature = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_SIGNATURE, Types._TemplateableElement, 1);
		public static final @NonNull ExecutorProperty _TemplateableElement__unspecializedElement = new EcoreExecutorProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__UNSPECIALIZED_ELEMENT, Types._TemplateableElement, 2);
		public static final @NonNull ExecutorProperty _TemplateableElement__TemplateableElement__unspecializedElement = new ExecutorPropertyWithImplementation("TemplateableElement", Types._TemplateableElement, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TEMPLATEABLE_ELEMENT__UNSPECIALIZED_ELEMENT));

		public static final @NonNull ExecutorProperty _Transition__kind = new EcoreExecutorProperty(PivotPackage.Literals.TRANSITION__KIND, Types._Transition, 0);
		public static final @NonNull ExecutorProperty _Transition__ownedEffect = new EcoreExecutorProperty(PivotPackage.Literals.TRANSITION__OWNED_EFFECT, Types._Transition, 1);
		public static final @NonNull ExecutorProperty _Transition__ownedGuard = new EcoreExecutorProperty(PivotPackage.Literals.TRANSITION__OWNED_GUARD, Types._Transition, 2);
		public static final @NonNull ExecutorProperty _Transition__ownedTriggers = new EcoreExecutorProperty(PivotPackage.Literals.TRANSITION__OWNED_TRIGGERS, Types._Transition, 3);
		public static final @NonNull ExecutorProperty _Transition__owningRegion = new EcoreExecutorProperty(PivotPackage.Literals.TRANSITION__OWNING_REGION, Types._Transition, 4);
		public static final @NonNull ExecutorProperty _Transition__source = new EcoreExecutorProperty(PivotPackage.Literals.TRANSITION__SOURCE, Types._Transition, 5);
		public static final @NonNull ExecutorProperty _Transition__target = new EcoreExecutorProperty(PivotPackage.Literals.TRANSITION__TARGET, Types._Transition, 6);

		public static final @NonNull ExecutorProperty _Trigger__owningState = new EcoreExecutorProperty(PivotPackage.Literals.TRIGGER__OWNING_STATE, Types._Trigger, 0);
		public static final @NonNull ExecutorProperty _Trigger__owningTransition = new EcoreExecutorProperty(PivotPackage.Literals.TRIGGER__OWNING_TRANSITION, Types._Trigger, 1);

		public static final @NonNull ExecutorProperty _TupleLiteralExp__ownedParts = new EcoreExecutorProperty(PivotPackage.Literals.TUPLE_LITERAL_EXP__OWNED_PARTS, Types._TupleLiteralExp, 0);

		public static final @NonNull ExecutorProperty _TupleLiteralPart__ownedInit = new EcoreExecutorProperty(PivotPackage.Literals.TUPLE_LITERAL_PART__OWNED_INIT, Types._TupleLiteralPart, 0);
		public static final @NonNull ExecutorProperty _TupleLiteralPart__TupleLiteralExp__ownedParts = new ExecutorPropertyWithImplementation("TupleLiteralExp", Types._TupleLiteralPart, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TUPLE_LITERAL_EXP__OWNED_PARTS));

		public static final @NonNull ExecutorProperty _Type__CollectionType__elementType = new ExecutorPropertyWithImplementation("CollectionType", Types._Type, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.COLLECTION_TYPE__ELEMENT_TYPE));
		public static final @NonNull ExecutorProperty _Type__DynamicElement__metaType = new ExecutorPropertyWithImplementation("DynamicElement", Types._Type, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.DYNAMIC_ELEMENT__META_TYPE));
		public static final @NonNull ExecutorProperty _Type__LambdaType__contextType = new ExecutorPropertyWithImplementation("LambdaType", Types._Type, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LAMBDA_TYPE__CONTEXT_TYPE));
		public static final @NonNull ExecutorProperty _Type__LambdaType__parameterType = new ExecutorPropertyWithImplementation("LambdaType", Types._Type, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LAMBDA_TYPE__PARAMETER_TYPE));
		public static final @NonNull ExecutorProperty _Type__LambdaType__resultType = new ExecutorPropertyWithImplementation("LambdaType", Types._Type, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LAMBDA_TYPE__RESULT_TYPE));
		public static final @NonNull ExecutorProperty _Type__MapType__keyType = new ExecutorPropertyWithImplementation("MapType", Types._Type, 5, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MAP_TYPE__KEY_TYPE));
		public static final @NonNull ExecutorProperty _Type__MapType__valueType = new ExecutorPropertyWithImplementation("MapType", Types._Type, 6, new EcoreLibraryOppositeProperty(PivotPackage.Literals.MAP_TYPE__VALUE_TYPE));
		public static final @NonNull ExecutorProperty _Type__OCLExpression__typeValue = new ExecutorPropertyWithImplementation("OCLExpression", Types._Type, 7, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OCL_EXPRESSION__TYPE_VALUE));
		public static final @NonNull ExecutorProperty _Type__Operation__raisedExceptions = new ExecutorPropertyWithImplementation("Operation", Types._Type, 8, new EcoreLibraryOppositeProperty(PivotPackage.Literals.OPERATION__RAISED_EXCEPTIONS));
		public static final @NonNull ExecutorProperty _Type__TemplateParameterSubstitution__actual = new ExecutorPropertyWithImplementation("TemplateParameterSubstitution", Types._Type, 9, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL));
		public static final @NonNull ExecutorProperty _Type__TypeExp__referredType = new ExecutorPropertyWithImplementation("TypeExp", Types._Type, 10, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TYPE_EXP__REFERRED_TYPE));
		public static final @NonNull ExecutorProperty _Type__TypedElement__type = new ExecutorPropertyWithImplementation("TypedElement", Types._Type, 11, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TYPED_ELEMENT__TYPE));
		public static final @NonNull ExecutorProperty _Type__VariableDeclaration__typeValue = new ExecutorPropertyWithImplementation("VariableDeclaration", Types._Type, 12, new EcoreLibraryOppositeProperty(PivotPackage.Literals.VARIABLE_DECLARATION__TYPE_VALUE));
		public static final @NonNull ExecutorProperty _Type__WildcardType__lowerBound = new ExecutorPropertyWithImplementation("WildcardType", Types._Type, 13, new EcoreLibraryOppositeProperty(PivotPackage.Literals.WILDCARD_TYPE__LOWER_BOUND));
		public static final @NonNull ExecutorProperty _Type__WildcardType__upperBound = new ExecutorPropertyWithImplementation("WildcardType", Types._Type, 14, new EcoreLibraryOppositeProperty(PivotPackage.Literals.WILDCARD_TYPE__UPPER_BOUND));

		public static final @NonNull ExecutorProperty _TypeExp__referredType = new EcoreExecutorProperty(PivotPackage.Literals.TYPE_EXP__REFERRED_TYPE, Types._TypeExp, 0);

		public static final @NonNull ExecutorProperty _TypedElement__isMany = new EcoreExecutorProperty(PivotPackage.Literals.TYPED_ELEMENT__IS_MANY, Types._TypedElement, 0);
		public static final @NonNull ExecutorProperty _TypedElement__isRequired = new EcoreExecutorProperty(PivotPackage.Literals.TYPED_ELEMENT__IS_REQUIRED, Types._TypedElement, 1);
		public static final @NonNull ExecutorProperty _TypedElement__type = new EcoreExecutorProperty(PivotPackage.Literals.TYPED_ELEMENT__TYPE, Types._TypedElement, 2);

		public static final @NonNull ExecutorProperty _UnlimitedNaturalLiteralExp__unlimitedNaturalSymbol = new EcoreExecutorProperty(PivotPackage.Literals.UNLIMITED_NATURAL_LITERAL_EXP__UNLIMITED_NATURAL_SYMBOL, Types._UnlimitedNaturalLiteralExp, 0);

		public static final @NonNull ExecutorProperty _ValueSpecification__Slot__ownedValues = new ExecutorPropertyWithImplementation("Slot", Types._ValueSpecification, 0, new EcoreLibraryOppositeProperty(PivotPackage.Literals.SLOT__OWNED_VALUES));

		public static final @NonNull ExecutorProperty _Variable__isImplicit = new EcoreExecutorProperty(PivotPackage.Literals.VARIABLE__IS_IMPLICIT, Types._Variable, 0);
		public static final @NonNull ExecutorProperty _Variable__ownedInit = new EcoreExecutorProperty(PivotPackage.Literals.VARIABLE__OWNED_INIT, Types._Variable, 1);
		public static final @NonNull ExecutorProperty _Variable__representedParameter = new EcoreExecutorProperty(PivotPackage.Literals.VARIABLE__REPRESENTED_PARAMETER, Types._Variable, 2);
		public static final @NonNull ExecutorProperty _Variable__ExpressionInOCL__ownedContext = new ExecutorPropertyWithImplementation("ExpressionInOCL", Types._Variable, 3, new EcoreLibraryOppositeProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__OWNED_CONTEXT));
		public static final @NonNull ExecutorProperty _Variable__ExpressionInOCL__ownedParameters = new ExecutorPropertyWithImplementation("ExpressionInOCL", Types._Variable, 4, new EcoreLibraryOppositeProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__OWNED_PARAMETERS));
		public static final @NonNull ExecutorProperty _Variable__ExpressionInOCL__ownedResult = new ExecutorPropertyWithImplementation("ExpressionInOCL", Types._Variable, 5, new EcoreLibraryOppositeProperty(PivotPackage.Literals.EXPRESSION_IN_OCL__OWNED_RESULT));
		public static final @NonNull ExecutorProperty _Variable__IterateExp__ownedResult = new ExecutorPropertyWithImplementation("IterateExp", Types._Variable, 6, new EcoreLibraryOppositeProperty(PivotPackage.Literals.ITERATE_EXP__OWNED_RESULT));
		public static final @NonNull ExecutorProperty _Variable__LetExp__ownedVariable = new ExecutorPropertyWithImplementation("LetExp", Types._Variable, 7, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LET_EXP__OWNED_VARIABLE));
		public static final @NonNull ExecutorProperty _Variable__LoopExp__ownedCoIterators = new ExecutorPropertyWithImplementation("LoopExp", Types._Variable, 8, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LOOP_EXP__OWNED_CO_ITERATORS));
		public static final @NonNull ExecutorProperty _Variable__LoopExp__ownedIterators = new ExecutorPropertyWithImplementation("LoopExp", Types._Variable, 9, new EcoreLibraryOppositeProperty(PivotPackage.Literals.LOOP_EXP__OWNED_ITERATORS));

		public static final @NonNull ExecutorProperty _VariableDeclaration__typeValue = new EcoreExecutorProperty(PivotPackage.Literals.VARIABLE_DECLARATION__TYPE_VALUE, Types._VariableDeclaration, 0);
		public static final @NonNull ExecutorProperty _VariableDeclaration__VariableExp__referredVariable = new ExecutorPropertyWithImplementation("VariableExp", Types._VariableDeclaration, 1, new EcoreLibraryOppositeProperty(PivotPackage.Literals.VARIABLE_EXP__REFERRED_VARIABLE));

		public static final @NonNull ExecutorProperty _VariableExp__isImplicit = new EcoreExecutorProperty(PivotPackage.Literals.VARIABLE_EXP__IS_IMPLICIT, Types._VariableExp, 0);
		public static final @NonNull ExecutorProperty _VariableExp__referredVariable = new EcoreExecutorProperty(PivotPackage.Literals.VARIABLE_EXP__REFERRED_VARIABLE, Types._VariableExp, 1);

		public static final @NonNull ExecutorProperty _Vertex__incomingTransitions = new EcoreExecutorProperty(PivotPackage.Literals.VERTEX__INCOMING_TRANSITIONS, Types._Vertex, 0);
		public static final @NonNull ExecutorProperty _Vertex__outgoingTransitions = new EcoreExecutorProperty(PivotPackage.Literals.VERTEX__OUTGOING_TRANSITIONS, Types._Vertex, 1);
		public static final @NonNull ExecutorProperty _Vertex__owningRegion = new EcoreExecutorProperty(PivotPackage.Literals.VERTEX__OWNING_REGION, Types._Vertex, 2);

		public static final @NonNull ExecutorProperty _WildcardType__lowerBound = new EcoreExecutorProperty(PivotPackage.Literals.WILDCARD_TYPE__LOWER_BOUND, Types._WildcardType, 0);
		public static final @NonNull ExecutorProperty _WildcardType__upperBound = new EcoreExecutorProperty(PivotPackage.Literals.WILDCARD_TYPE__UPPER_BOUND, Types._WildcardType, 1);
		public static final @NonNull ExecutorProperty _WildcardType__TemplateParameterSubstitution__ownedWildcard = new ExecutorPropertyWithImplementation("TemplateParameterSubstitution", Types._WildcardType, 2, new EcoreLibraryOppositeProperty(PivotPackage.Literals.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_WILDCARD));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PivotTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final @NonNull ExecutorFragment @NonNull [] _Annotation =
			{
				Fragments._Annotation__OclAny /* 0 */,
				Fragments._Annotation__OclElement /* 1 */,
				Fragments._Annotation__Element /* 2 */,
				Fragments._Annotation__NamedElement /* 3 */,
				Fragments._Annotation__Annotation /* 4 */
			};
		private static final int @NonNull [] __Annotation = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _AnyType =
			{
				Fragments._AnyType__OclAny /* 0 */,
				Fragments._AnyType__OclElement /* 1 */,
				Fragments._AnyType__Element /* 2 */,
				Fragments._AnyType__OclType /* 2 */,
				Fragments._AnyType__NamedElement /* 3 */,
				Fragments._AnyType__TemplateableElement /* 3 */,
				Fragments._AnyType__Namespace /* 4 */,
				Fragments._AnyType__Type /* 4 */,
				Fragments._AnyType__Class /* 5 */,
				Fragments._AnyType__AnyType /* 6 */
			};
		private static final int @NonNull [] __AnyType = { 1,1,2,2,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _AssociationClass =
			{
				Fragments._AssociationClass__OclAny /* 0 */,
				Fragments._AssociationClass__OclElement /* 1 */,
				Fragments._AssociationClass__Element /* 2 */,
				Fragments._AssociationClass__OclType /* 2 */,
				Fragments._AssociationClass__NamedElement /* 3 */,
				Fragments._AssociationClass__TemplateableElement /* 3 */,
				Fragments._AssociationClass__Namespace /* 4 */,
				Fragments._AssociationClass__Type /* 4 */,
				Fragments._AssociationClass__Class /* 5 */,
				Fragments._AssociationClass__AssociationClass /* 6 */
			};
		private static final int @NonNull [] __AssociationClass = { 1,1,2,2,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _AssociationClassCallExp =
			{
				Fragments._AssociationClassCallExp__OclAny /* 0 */,
				Fragments._AssociationClassCallExp__OclElement /* 1 */,
				Fragments._AssociationClassCallExp__Element /* 2 */,
				Fragments._AssociationClassCallExp__NamedElement /* 3 */,
				Fragments._AssociationClassCallExp__TypedElement /* 4 */,
				Fragments._AssociationClassCallExp__OCLExpression /* 5 */,
				Fragments._AssociationClassCallExp__CallExp /* 6 */,
				Fragments._AssociationClassCallExp__FeatureCallExp /* 7 */,
				Fragments._AssociationClassCallExp__NavigationCallExp /* 8 */,
				Fragments._AssociationClassCallExp__AssociationClassCallExp /* 9 */
			};
		private static final int @NonNull [] __AssociationClassCallExp = { 1,1,1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _AssociativityKind =
			{
				Fragments._AssociativityKind__OclAny /* 0 */,
				Fragments._AssociativityKind__OclElement /* 1 */,
				Fragments._AssociativityKind__OclType /* 2 */,
				Fragments._AssociativityKind__OclEnumeration /* 3 */,
				Fragments._AssociativityKind__AssociativityKind /* 4 */
			};
		private static final int @NonNull [] __AssociativityKind = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _BagType =
			{
				Fragments._BagType__OclAny /* 0 */,
				Fragments._BagType__OclElement /* 1 */,
				Fragments._BagType__Element /* 2 */,
				Fragments._BagType__OclType /* 2 */,
				Fragments._BagType__NamedElement /* 3 */,
				Fragments._BagType__TemplateableElement /* 3 */,
				Fragments._BagType__Namespace /* 4 */,
				Fragments._BagType__Type /* 4 */,
				Fragments._BagType__Class /* 5 */,
				Fragments._BagType__DataType /* 6 */,
				Fragments._BagType__IterableType /* 7 */,
				Fragments._BagType__CollectionType /* 8 */,
				Fragments._BagType__BagType /* 9 */
			};
		private static final int @NonNull [] __BagType = { 1,1,2,2,2,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Behavior =
			{
				Fragments._Behavior__OclAny /* 0 */,
				Fragments._Behavior__OclElement /* 1 */,
				Fragments._Behavior__Element /* 2 */,
				Fragments._Behavior__OclType /* 2 */,
				Fragments._Behavior__NamedElement /* 3 */,
				Fragments._Behavior__TemplateableElement /* 3 */,
				Fragments._Behavior__Namespace /* 4 */,
				Fragments._Behavior__Type /* 4 */,
				Fragments._Behavior__Class /* 5 */,
				Fragments._Behavior__Behavior /* 6 */
			};
		private static final int @NonNull [] __Behavior = { 1,1,2,2,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _BooleanLiteralExp =
			{
				Fragments._BooleanLiteralExp__OclAny /* 0 */,
				Fragments._BooleanLiteralExp__OclElement /* 1 */,
				Fragments._BooleanLiteralExp__Element /* 2 */,
				Fragments._BooleanLiteralExp__NamedElement /* 3 */,
				Fragments._BooleanLiteralExp__TypedElement /* 4 */,
				Fragments._BooleanLiteralExp__OCLExpression /* 5 */,
				Fragments._BooleanLiteralExp__LiteralExp /* 6 */,
				Fragments._BooleanLiteralExp__PrimitiveLiteralExp /* 7 */,
				Fragments._BooleanLiteralExp__BooleanLiteralExp /* 8 */
			};
		private static final int @NonNull [] __BooleanLiteralExp = { 1,1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CallExp =
			{
				Fragments._CallExp__OclAny /* 0 */,
				Fragments._CallExp__OclElement /* 1 */,
				Fragments._CallExp__Element /* 2 */,
				Fragments._CallExp__NamedElement /* 3 */,
				Fragments._CallExp__TypedElement /* 4 */,
				Fragments._CallExp__OCLExpression /* 5 */,
				Fragments._CallExp__CallExp /* 6 */
			};
		private static final int @NonNull [] __CallExp = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CallOperationAction =
			{
				Fragments._CallOperationAction__OclAny /* 0 */,
				Fragments._CallOperationAction__OclElement /* 1 */,
				Fragments._CallOperationAction__Element /* 2 */,
				Fragments._CallOperationAction__NamedElement /* 3 */,
				Fragments._CallOperationAction__CallOperationAction /* 4 */
			};
		private static final int @NonNull [] __CallOperationAction = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Class =
			{
				Fragments._Class__OclAny /* 0 */,
				Fragments._Class__OclElement /* 1 */,
				Fragments._Class__Element /* 2 */,
				Fragments._Class__OclType /* 2 */,
				Fragments._Class__NamedElement /* 3 */,
				Fragments._Class__TemplateableElement /* 3 */,
				Fragments._Class__Namespace /* 4 */,
				Fragments._Class__Type /* 4 */,
				Fragments._Class__Class /* 5 */
			};
		private static final int @NonNull [] __Class = { 1,1,2,2,2,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CollectionItem =
			{
				Fragments._CollectionItem__OclAny /* 0 */,
				Fragments._CollectionItem__OclElement /* 1 */,
				Fragments._CollectionItem__Element /* 2 */,
				Fragments._CollectionItem__NamedElement /* 3 */,
				Fragments._CollectionItem__TypedElement /* 4 */,
				Fragments._CollectionItem__CollectionLiteralPart /* 5 */,
				Fragments._CollectionItem__CollectionItem /* 6 */
			};
		private static final int @NonNull [] __CollectionItem = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CollectionKind =
			{
				Fragments._CollectionKind__OclAny /* 0 */,
				Fragments._CollectionKind__OclElement /* 1 */,
				Fragments._CollectionKind__OclType /* 2 */,
				Fragments._CollectionKind__OclEnumeration /* 3 */,
				Fragments._CollectionKind__CollectionKind /* 4 */
			};
		private static final int @NonNull [] __CollectionKind = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CollectionLiteralExp =
			{
				Fragments._CollectionLiteralExp__OclAny /* 0 */,
				Fragments._CollectionLiteralExp__OclElement /* 1 */,
				Fragments._CollectionLiteralExp__Element /* 2 */,
				Fragments._CollectionLiteralExp__NamedElement /* 3 */,
				Fragments._CollectionLiteralExp__TypedElement /* 4 */,
				Fragments._CollectionLiteralExp__OCLExpression /* 5 */,
				Fragments._CollectionLiteralExp__LiteralExp /* 6 */,
				Fragments._CollectionLiteralExp__CollectionLiteralExp /* 7 */
			};
		private static final int @NonNull [] __CollectionLiteralExp = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CollectionLiteralPart =
			{
				Fragments._CollectionLiteralPart__OclAny /* 0 */,
				Fragments._CollectionLiteralPart__OclElement /* 1 */,
				Fragments._CollectionLiteralPart__Element /* 2 */,
				Fragments._CollectionLiteralPart__NamedElement /* 3 */,
				Fragments._CollectionLiteralPart__TypedElement /* 4 */,
				Fragments._CollectionLiteralPart__CollectionLiteralPart /* 5 */
			};
		private static final int @NonNull [] __CollectionLiteralPart = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CollectionRange =
			{
				Fragments._CollectionRange__OclAny /* 0 */,
				Fragments._CollectionRange__OclElement /* 1 */,
				Fragments._CollectionRange__Element /* 2 */,
				Fragments._CollectionRange__NamedElement /* 3 */,
				Fragments._CollectionRange__TypedElement /* 4 */,
				Fragments._CollectionRange__CollectionLiteralPart /* 5 */,
				Fragments._CollectionRange__CollectionRange /* 6 */
			};
		private static final int @NonNull [] __CollectionRange = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CollectionType =
			{
				Fragments._CollectionType__OclAny /* 0 */,
				Fragments._CollectionType__OclElement /* 1 */,
				Fragments._CollectionType__Element /* 2 */,
				Fragments._CollectionType__OclType /* 2 */,
				Fragments._CollectionType__NamedElement /* 3 */,
				Fragments._CollectionType__TemplateableElement /* 3 */,
				Fragments._CollectionType__Namespace /* 4 */,
				Fragments._CollectionType__Type /* 4 */,
				Fragments._CollectionType__Class /* 5 */,
				Fragments._CollectionType__DataType /* 6 */,
				Fragments._CollectionType__IterableType /* 7 */,
				Fragments._CollectionType__CollectionType /* 8 */
			};
		private static final int @NonNull [] __CollectionType = { 1,1,2,2,2,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Comment =
			{
				Fragments._Comment__OclAny /* 0 */,
				Fragments._Comment__OclElement /* 1 */,
				Fragments._Comment__Element /* 2 */,
				Fragments._Comment__Comment /* 3 */
			};
		private static final int @NonNull [] __Comment = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CompleteClass =
			{
				Fragments._CompleteClass__OclAny /* 0 */,
				Fragments._CompleteClass__OclElement /* 1 */,
				Fragments._CompleteClass__Element /* 2 */,
				Fragments._CompleteClass__NamedElement /* 3 */,
				Fragments._CompleteClass__CompleteClass /* 4 */
			};
		private static final int @NonNull [] __CompleteClass = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CompleteEnvironment =
			{
				Fragments._CompleteEnvironment__OclAny /* 0 */,
				Fragments._CompleteEnvironment__OclElement /* 1 */,
				Fragments._CompleteEnvironment__Element /* 2 */,
				Fragments._CompleteEnvironment__CompleteEnvironment /* 3 */
			};
		private static final int @NonNull [] __CompleteEnvironment = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CompleteModel =
			{
				Fragments._CompleteModel__OclAny /* 0 */,
				Fragments._CompleteModel__OclElement /* 1 */,
				Fragments._CompleteModel__Element /* 2 */,
				Fragments._CompleteModel__NamedElement /* 3 */,
				Fragments._CompleteModel__CompleteModel /* 4 */
			};
		private static final int @NonNull [] __CompleteModel = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _CompletePackage =
			{
				Fragments._CompletePackage__OclAny /* 0 */,
				Fragments._CompletePackage__OclElement /* 1 */,
				Fragments._CompletePackage__Element /* 2 */,
				Fragments._CompletePackage__NamedElement /* 3 */,
				Fragments._CompletePackage__CompletePackage /* 4 */
			};
		private static final int @NonNull [] __CompletePackage = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _ConnectionPointReference =
			{
				Fragments._ConnectionPointReference__OclAny /* 0 */,
				Fragments._ConnectionPointReference__OclElement /* 1 */,
				Fragments._ConnectionPointReference__Element /* 2 */,
				Fragments._ConnectionPointReference__NamedElement /* 3 */,
				Fragments._ConnectionPointReference__Vertex /* 4 */,
				Fragments._ConnectionPointReference__ConnectionPointReference /* 5 */
			};
		private static final int @NonNull [] __ConnectionPointReference = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Constraint =
			{
				Fragments._Constraint__OclAny /* 0 */,
				Fragments._Constraint__OclElement /* 1 */,
				Fragments._Constraint__Element /* 2 */,
				Fragments._Constraint__NamedElement /* 3 */,
				Fragments._Constraint__Constraint /* 4 */
			};
		private static final int @NonNull [] __Constraint = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _DataType =
			{
				Fragments._DataType__OclAny /* 0 */,
				Fragments._DataType__OclElement /* 1 */,
				Fragments._DataType__Element /* 2 */,
				Fragments._DataType__OclType /* 2 */,
				Fragments._DataType__NamedElement /* 3 */,
				Fragments._DataType__TemplateableElement /* 3 */,
				Fragments._DataType__Namespace /* 4 */,
				Fragments._DataType__Type /* 4 */,
				Fragments._DataType__Class /* 5 */,
				Fragments._DataType__DataType /* 6 */
			};
		private static final int @NonNull [] __DataType = { 1,1,2,2,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Detail =
			{
				Fragments._Detail__OclAny /* 0 */,
				Fragments._Detail__OclElement /* 1 */,
				Fragments._Detail__Element /* 2 */,
				Fragments._Detail__NamedElement /* 3 */,
				Fragments._Detail__Detail /* 4 */
			};
		private static final int @NonNull [] __Detail = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _DynamicBehavior =
			{
				Fragments._DynamicBehavior__OclAny /* 0 */,
				Fragments._DynamicBehavior__OclElement /* 1 */,
				Fragments._DynamicBehavior__Element /* 2 */,
				Fragments._DynamicBehavior__OclType /* 2 */,
				Fragments._DynamicBehavior__DynamicElement /* 3 */,
				Fragments._DynamicBehavior__NamedElement /* 3 */,
				Fragments._DynamicBehavior__TemplateableElement /* 3 */,
				Fragments._DynamicBehavior__Namespace /* 4 */,
				Fragments._DynamicBehavior__Type /* 4 */,
				Fragments._DynamicBehavior__Class /* 5 */,
				Fragments._DynamicBehavior__Behavior /* 6 */,
				Fragments._DynamicBehavior__DynamicType /* 6 */,
				Fragments._DynamicBehavior__DynamicBehavior /* 7 */
			};
		private static final int @NonNull [] __DynamicBehavior = { 1,1,2,3,2,1,2,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _DynamicElement =
			{
				Fragments._DynamicElement__OclAny /* 0 */,
				Fragments._DynamicElement__OclElement /* 1 */,
				Fragments._DynamicElement__Element /* 2 */,
				Fragments._DynamicElement__DynamicElement /* 3 */
			};
		private static final int @NonNull [] __DynamicElement = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _DynamicProperty =
			{
				Fragments._DynamicProperty__OclAny /* 0 */,
				Fragments._DynamicProperty__OclElement /* 1 */,
				Fragments._DynamicProperty__Element /* 2 */,
				Fragments._DynamicProperty__DynamicProperty /* 3 */
			};
		private static final int @NonNull [] __DynamicProperty = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _DynamicType =
			{
				Fragments._DynamicType__OclAny /* 0 */,
				Fragments._DynamicType__OclElement /* 1 */,
				Fragments._DynamicType__Element /* 2 */,
				Fragments._DynamicType__OclType /* 2 */,
				Fragments._DynamicType__DynamicElement /* 3 */,
				Fragments._DynamicType__NamedElement /* 3 */,
				Fragments._DynamicType__TemplateableElement /* 3 */,
				Fragments._DynamicType__Namespace /* 4 */,
				Fragments._DynamicType__Type /* 4 */,
				Fragments._DynamicType__Class /* 5 */,
				Fragments._DynamicType__DynamicType /* 6 */
			};
		private static final int @NonNull [] __DynamicType = { 1,1,2,3,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _DynamicValueSpecification =
			{
				Fragments._DynamicValueSpecification__OclAny /* 0 */,
				Fragments._DynamicValueSpecification__OclElement /* 1 */,
				Fragments._DynamicValueSpecification__Element /* 2 */,
				Fragments._DynamicValueSpecification__NamedElement /* 3 */,
				Fragments._DynamicValueSpecification__TypedElement /* 4 */,
				Fragments._DynamicValueSpecification__ValueSpecification /* 5 */,
				Fragments._DynamicValueSpecification__DynamicValueSpecification /* 6 */
			};
		private static final int @NonNull [] __DynamicValueSpecification = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Element =
			{
				Fragments._Element__OclAny /* 0 */,
				Fragments._Element__OclElement /* 1 */,
				Fragments._Element__Element /* 2 */
			};
		private static final int @NonNull [] __Element = { 1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _ElementExtension =
			{
				Fragments._ElementExtension__OclAny /* 0 */,
				Fragments._ElementExtension__OclElement /* 1 */,
				Fragments._ElementExtension__Element /* 2 */,
				Fragments._ElementExtension__OclType /* 2 */,
				Fragments._ElementExtension__NamedElement /* 3 */,
				Fragments._ElementExtension__TemplateableElement /* 3 */,
				Fragments._ElementExtension__Namespace /* 4 */,
				Fragments._ElementExtension__Type /* 4 */,
				Fragments._ElementExtension__Class /* 5 */,
				Fragments._ElementExtension__ElementExtension /* 6 */
			};
		private static final int @NonNull [] __ElementExtension = { 1,1,2,2,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _EnumLiteralExp =
			{
				Fragments._EnumLiteralExp__OclAny /* 0 */,
				Fragments._EnumLiteralExp__OclElement /* 1 */,
				Fragments._EnumLiteralExp__Element /* 2 */,
				Fragments._EnumLiteralExp__NamedElement /* 3 */,
				Fragments._EnumLiteralExp__TypedElement /* 4 */,
				Fragments._EnumLiteralExp__OCLExpression /* 5 */,
				Fragments._EnumLiteralExp__LiteralExp /* 6 */,
				Fragments._EnumLiteralExp__EnumLiteralExp /* 7 */
			};
		private static final int @NonNull [] __EnumLiteralExp = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Enumeration =
			{
				Fragments._Enumeration__OclAny /* 0 */,
				Fragments._Enumeration__OclElement /* 1 */,
				Fragments._Enumeration__Element /* 2 */,
				Fragments._Enumeration__OclType /* 2 */,
				Fragments._Enumeration__NamedElement /* 3 */,
				Fragments._Enumeration__OclEnumeration /* 3 */,
				Fragments._Enumeration__TemplateableElement /* 3 */,
				Fragments._Enumeration__Namespace /* 4 */,
				Fragments._Enumeration__Type /* 4 */,
				Fragments._Enumeration__Class /* 5 */,
				Fragments._Enumeration__DataType /* 6 */,
				Fragments._Enumeration__Enumeration /* 7 */
			};
		private static final int @NonNull [] __Enumeration = { 1,1,2,3,2,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _EnumerationLiteral =
			{
				Fragments._EnumerationLiteral__OclAny /* 0 */,
				Fragments._EnumerationLiteral__OclElement /* 1 */,
				Fragments._EnumerationLiteral__Element /* 2 */,
				Fragments._EnumerationLiteral__NamedElement /* 3 */,
				Fragments._EnumerationLiteral__InstanceSpecification /* 4 */,
				Fragments._EnumerationLiteral__EnumerationLiteral /* 5 */
			};
		private static final int @NonNull [] __EnumerationLiteral = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _ExpressionInOCL =
			{
				Fragments._ExpressionInOCL__OclAny /* 0 */,
				Fragments._ExpressionInOCL__OclElement /* 1 */,
				Fragments._ExpressionInOCL__Element /* 2 */,
				Fragments._ExpressionInOCL__NamedElement /* 3 */,
				Fragments._ExpressionInOCL__TypedElement /* 4 */,
				Fragments._ExpressionInOCL__ValueSpecification /* 5 */,
				Fragments._ExpressionInOCL__LanguageExpression /* 6 */,
				Fragments._ExpressionInOCL__ExpressionInOCL /* 7 */
			};
		private static final int @NonNull [] __ExpressionInOCL = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Feature =
			{
				Fragments._Feature__OclAny /* 0 */,
				Fragments._Feature__OclElement /* 1 */,
				Fragments._Feature__Element /* 2 */,
				Fragments._Feature__NamedElement /* 3 */,
				Fragments._Feature__TypedElement /* 4 */,
				Fragments._Feature__Feature /* 5 */
			};
		private static final int @NonNull [] __Feature = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _FeatureCallExp =
			{
				Fragments._FeatureCallExp__OclAny /* 0 */,
				Fragments._FeatureCallExp__OclElement /* 1 */,
				Fragments._FeatureCallExp__Element /* 2 */,
				Fragments._FeatureCallExp__NamedElement /* 3 */,
				Fragments._FeatureCallExp__TypedElement /* 4 */,
				Fragments._FeatureCallExp__OCLExpression /* 5 */,
				Fragments._FeatureCallExp__CallExp /* 6 */,
				Fragments._FeatureCallExp__FeatureCallExp /* 7 */
			};
		private static final int @NonNull [] __FeatureCallExp = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _FinalState =
			{
				Fragments._FinalState__OclAny /* 0 */,
				Fragments._FinalState__OclElement /* 1 */,
				Fragments._FinalState__OclState /* 1 */,
				Fragments._FinalState__Element /* 2 */,
				Fragments._FinalState__NamedElement /* 3 */,
				Fragments._FinalState__Namespace /* 4 */,
				Fragments._FinalState__Vertex /* 4 */,
				Fragments._FinalState__State /* 5 */,
				Fragments._FinalState__FinalState /* 6 */
			};
		private static final int @NonNull [] __FinalState = { 1,2,1,1,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _IfExp =
			{
				Fragments._IfExp__OclAny /* 0 */,
				Fragments._IfExp__OclElement /* 1 */,
				Fragments._IfExp__Element /* 2 */,
				Fragments._IfExp__NamedElement /* 3 */,
				Fragments._IfExp__TypedElement /* 4 */,
				Fragments._IfExp__OCLExpression /* 5 */,
				Fragments._IfExp__IfExp /* 6 */
			};
		private static final int @NonNull [] __IfExp = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Import =
			{
				Fragments._Import__OclAny /* 0 */,
				Fragments._Import__OclElement /* 1 */,
				Fragments._Import__Element /* 2 */,
				Fragments._Import__NamedElement /* 3 */,
				Fragments._Import__Import /* 4 */
			};
		private static final int @NonNull [] __Import = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _InstanceSpecification =
			{
				Fragments._InstanceSpecification__OclAny /* 0 */,
				Fragments._InstanceSpecification__OclElement /* 1 */,
				Fragments._InstanceSpecification__Element /* 2 */,
				Fragments._InstanceSpecification__NamedElement /* 3 */,
				Fragments._InstanceSpecification__InstanceSpecification /* 4 */
			};
		private static final int @NonNull [] __InstanceSpecification = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _IntegerLiteralExp =
			{
				Fragments._IntegerLiteralExp__OclAny /* 0 */,
				Fragments._IntegerLiteralExp__OclElement /* 1 */,
				Fragments._IntegerLiteralExp__Element /* 2 */,
				Fragments._IntegerLiteralExp__NamedElement /* 3 */,
				Fragments._IntegerLiteralExp__TypedElement /* 4 */,
				Fragments._IntegerLiteralExp__OCLExpression /* 5 */,
				Fragments._IntegerLiteralExp__LiteralExp /* 6 */,
				Fragments._IntegerLiteralExp__PrimitiveLiteralExp /* 7 */,
				Fragments._IntegerLiteralExp__NumericLiteralExp /* 8 */,
				Fragments._IntegerLiteralExp__IntegerLiteralExp /* 9 */
			};
		private static final int @NonNull [] __IntegerLiteralExp = { 1,1,1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _InvalidLiteralExp =
			{
				Fragments._InvalidLiteralExp__OclAny /* 0 */,
				Fragments._InvalidLiteralExp__OclElement /* 1 */,
				Fragments._InvalidLiteralExp__Element /* 2 */,
				Fragments._InvalidLiteralExp__NamedElement /* 3 */,
				Fragments._InvalidLiteralExp__TypedElement /* 4 */,
				Fragments._InvalidLiteralExp__OCLExpression /* 5 */,
				Fragments._InvalidLiteralExp__LiteralExp /* 6 */,
				Fragments._InvalidLiteralExp__InvalidLiteralExp /* 7 */
			};
		private static final int @NonNull [] __InvalidLiteralExp = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _InvalidType =
			{
				Fragments._InvalidType__OclAny /* 0 */,
				Fragments._InvalidType__OclElement /* 1 */,
				Fragments._InvalidType__Element /* 2 */,
				Fragments._InvalidType__OclType /* 2 */,
				Fragments._InvalidType__NamedElement /* 3 */,
				Fragments._InvalidType__TemplateableElement /* 3 */,
				Fragments._InvalidType__Namespace /* 4 */,
				Fragments._InvalidType__Type /* 4 */,
				Fragments._InvalidType__Class /* 5 */,
				Fragments._InvalidType__InvalidType /* 6 */
			};
		private static final int @NonNull [] __InvalidType = { 1,1,2,2,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _IterableType =
			{
				Fragments._IterableType__OclAny /* 0 */,
				Fragments._IterableType__OclElement /* 1 */,
				Fragments._IterableType__Element /* 2 */,
				Fragments._IterableType__OclType /* 2 */,
				Fragments._IterableType__NamedElement /* 3 */,
				Fragments._IterableType__TemplateableElement /* 3 */,
				Fragments._IterableType__Namespace /* 4 */,
				Fragments._IterableType__Type /* 4 */,
				Fragments._IterableType__Class /* 5 */,
				Fragments._IterableType__DataType /* 6 */,
				Fragments._IterableType__IterableType /* 7 */
			};
		private static final int @NonNull [] __IterableType = { 1,1,2,2,2,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _IterateExp =
			{
				Fragments._IterateExp__OclAny /* 0 */,
				Fragments._IterateExp__OclElement /* 1 */,
				Fragments._IterateExp__Element /* 2 */,
				Fragments._IterateExp__ReferringElement /* 2 */,
				Fragments._IterateExp__NamedElement /* 3 */,
				Fragments._IterateExp__TypedElement /* 4 */,
				Fragments._IterateExp__OCLExpression /* 5 */,
				Fragments._IterateExp__CallExp /* 6 */,
				Fragments._IterateExp__LoopExp /* 7 */,
				Fragments._IterateExp__IterateExp /* 8 */
			};
		private static final int @NonNull [] __IterateExp = { 1,1,2,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Iteration =
			{
				Fragments._Iteration__OclAny /* 0 */,
				Fragments._Iteration__OclElement /* 1 */,
				Fragments._Iteration__Element /* 2 */,
				Fragments._Iteration__NamedElement /* 3 */,
				Fragments._Iteration__TemplateableElement /* 3 */,
				Fragments._Iteration__Namespace /* 4 */,
				Fragments._Iteration__TypedElement /* 4 */,
				Fragments._Iteration__Feature /* 5 */,
				Fragments._Iteration__Operation /* 6 */,
				Fragments._Iteration__Iteration /* 7 */
			};
		private static final int @NonNull [] __Iteration = { 1,1,1,2,2,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _IteratorExp =
			{
				Fragments._IteratorExp__OclAny /* 0 */,
				Fragments._IteratorExp__OclElement /* 1 */,
				Fragments._IteratorExp__Element /* 2 */,
				Fragments._IteratorExp__ReferringElement /* 2 */,
				Fragments._IteratorExp__NamedElement /* 3 */,
				Fragments._IteratorExp__TypedElement /* 4 */,
				Fragments._IteratorExp__OCLExpression /* 5 */,
				Fragments._IteratorExp__CallExp /* 6 */,
				Fragments._IteratorExp__LoopExp /* 7 */,
				Fragments._IteratorExp__IteratorExp /* 8 */
			};
		private static final int @NonNull [] __IteratorExp = { 1,1,2,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _IteratorVariable =
			{
				Fragments._IteratorVariable__OclAny /* 0 */,
				Fragments._IteratorVariable__OclElement /* 1 */,
				Fragments._IteratorVariable__Element /* 2 */,
				Fragments._IteratorVariable__NamedElement /* 3 */,
				Fragments._IteratorVariable__TypedElement /* 4 */,
				Fragments._IteratorVariable__VariableDeclaration /* 5 */,
				Fragments._IteratorVariable__Variable /* 6 */,
				Fragments._IteratorVariable__IteratorVariable /* 7 */
			};
		private static final int @NonNull [] __IteratorVariable = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _LambdaType =
			{
				Fragments._LambdaType__OclAny /* 0 */,
				Fragments._LambdaType__OclElement /* 1 */,
				Fragments._LambdaType__Element /* 2 */,
				Fragments._LambdaType__OclType /* 2 */,
				Fragments._LambdaType__NamedElement /* 3 */,
				Fragments._LambdaType__TemplateableElement /* 3 */,
				Fragments._LambdaType__Namespace /* 4 */,
				Fragments._LambdaType__Type /* 4 */,
				Fragments._LambdaType__Class /* 5 */,
				Fragments._LambdaType__DataType /* 6 */,
				Fragments._LambdaType__LambdaType /* 7 */
			};
		private static final int @NonNull [] __LambdaType = { 1,1,2,2,2,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _LanguageExpression =
			{
				Fragments._LanguageExpression__OclAny /* 0 */,
				Fragments._LanguageExpression__OclElement /* 1 */,
				Fragments._LanguageExpression__Element /* 2 */,
				Fragments._LanguageExpression__NamedElement /* 3 */,
				Fragments._LanguageExpression__TypedElement /* 4 */,
				Fragments._LanguageExpression__ValueSpecification /* 5 */,
				Fragments._LanguageExpression__LanguageExpression /* 6 */
			};
		private static final int @NonNull [] __LanguageExpression = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _LetExp =
			{
				Fragments._LetExp__OclAny /* 0 */,
				Fragments._LetExp__OclElement /* 1 */,
				Fragments._LetExp__Element /* 2 */,
				Fragments._LetExp__NamedElement /* 3 */,
				Fragments._LetExp__TypedElement /* 4 */,
				Fragments._LetExp__OCLExpression /* 5 */,
				Fragments._LetExp__LetExp /* 6 */
			};
		private static final int @NonNull [] __LetExp = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _LetVariable =
			{
				Fragments._LetVariable__OclAny /* 0 */,
				Fragments._LetVariable__OclElement /* 1 */,
				Fragments._LetVariable__Element /* 2 */,
				Fragments._LetVariable__NamedElement /* 3 */,
				Fragments._LetVariable__TypedElement /* 4 */,
				Fragments._LetVariable__VariableDeclaration /* 5 */,
				Fragments._LetVariable__Variable /* 6 */,
				Fragments._LetVariable__LetVariable /* 7 */
			};
		private static final int @NonNull [] __LetVariable = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Library =
			{
				Fragments._Library__OclAny /* 0 */,
				Fragments._Library__OclElement /* 1 */,
				Fragments._Library__Element /* 2 */,
				Fragments._Library__NamedElement /* 3 */,
				Fragments._Library__Namespace /* 4 */,
				Fragments._Library__Package /* 5 */,
				Fragments._Library__Library /* 6 */
			};
		private static final int @NonNull [] __Library = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _LibraryFeature =
			{
				Fragments._LibraryFeature__OclAny /* 0 */,
				Fragments._LibraryFeature__LibraryFeature /* 1 */
			};
		private static final int @NonNull [] __LibraryFeature = { 1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _LiteralExp =
			{
				Fragments._LiteralExp__OclAny /* 0 */,
				Fragments._LiteralExp__OclElement /* 1 */,
				Fragments._LiteralExp__Element /* 2 */,
				Fragments._LiteralExp__NamedElement /* 3 */,
				Fragments._LiteralExp__TypedElement /* 4 */,
				Fragments._LiteralExp__OCLExpression /* 5 */,
				Fragments._LiteralExp__LiteralExp /* 6 */
			};
		private static final int @NonNull [] __LiteralExp = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _LoopExp =
			{
				Fragments._LoopExp__OclAny /* 0 */,
				Fragments._LoopExp__OclElement /* 1 */,
				Fragments._LoopExp__Element /* 2 */,
				Fragments._LoopExp__NamedElement /* 3 */,
				Fragments._LoopExp__TypedElement /* 4 */,
				Fragments._LoopExp__OCLExpression /* 5 */,
				Fragments._LoopExp__CallExp /* 6 */,
				Fragments._LoopExp__LoopExp /* 7 */
			};
		private static final int @NonNull [] __LoopExp = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _MapLiteralExp =
			{
				Fragments._MapLiteralExp__OclAny /* 0 */,
				Fragments._MapLiteralExp__OclElement /* 1 */,
				Fragments._MapLiteralExp__Element /* 2 */,
				Fragments._MapLiteralExp__NamedElement /* 3 */,
				Fragments._MapLiteralExp__TypedElement /* 4 */,
				Fragments._MapLiteralExp__OCLExpression /* 5 */,
				Fragments._MapLiteralExp__LiteralExp /* 6 */,
				Fragments._MapLiteralExp__MapLiteralExp /* 7 */
			};
		private static final int @NonNull [] __MapLiteralExp = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _MapLiteralPart =
			{
				Fragments._MapLiteralPart__OclAny /* 0 */,
				Fragments._MapLiteralPart__OclElement /* 1 */,
				Fragments._MapLiteralPart__Element /* 2 */,
				Fragments._MapLiteralPart__MapLiteralPart /* 3 */
			};
		private static final int @NonNull [] __MapLiteralPart = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _MapType =
			{
				Fragments._MapType__OclAny /* 0 */,
				Fragments._MapType__OclElement /* 1 */,
				Fragments._MapType__Element /* 2 */,
				Fragments._MapType__OclType /* 2 */,
				Fragments._MapType__NamedElement /* 3 */,
				Fragments._MapType__TemplateableElement /* 3 */,
				Fragments._MapType__Namespace /* 4 */,
				Fragments._MapType__Type /* 4 */,
				Fragments._MapType__Class /* 5 */,
				Fragments._MapType__DataType /* 6 */,
				Fragments._MapType__IterableType /* 7 */,
				Fragments._MapType__MapType /* 8 */
			};
		private static final int @NonNull [] __MapType = { 1,1,2,2,2,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _MessageExp =
			{
				Fragments._MessageExp__OclAny /* 0 */,
				Fragments._MessageExp__OclElement /* 1 */,
				Fragments._MessageExp__Element /* 2 */,
				Fragments._MessageExp__NamedElement /* 3 */,
				Fragments._MessageExp__TypedElement /* 4 */,
				Fragments._MessageExp__OCLExpression /* 5 */,
				Fragments._MessageExp__MessageExp /* 6 */
			};
		private static final int @NonNull [] __MessageExp = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _MessageType =
			{
				Fragments._MessageType__OclAny /* 0 */,
				Fragments._MessageType__OclElement /* 1 */,
				Fragments._MessageType__Element /* 2 */,
				Fragments._MessageType__OclType /* 2 */,
				Fragments._MessageType__NamedElement /* 3 */,
				Fragments._MessageType__TemplateableElement /* 3 */,
				Fragments._MessageType__Namespace /* 4 */,
				Fragments._MessageType__Type /* 4 */,
				Fragments._MessageType__Class /* 5 */,
				Fragments._MessageType__MessageType /* 6 */
			};
		private static final int @NonNull [] __MessageType = { 1,1,2,2,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Model =
			{
				Fragments._Model__OclAny /* 0 */,
				Fragments._Model__OclElement /* 1 */,
				Fragments._Model__Element /* 2 */,
				Fragments._Model__NamedElement /* 3 */,
				Fragments._Model__Namespace /* 4 */,
				Fragments._Model__Model /* 5 */
			};
		private static final int @NonNull [] __Model = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _MorePivotable =
			{
				Fragments._MorePivotable__OclAny /* 0 */,
				Fragments._MorePivotable__OclElement /* 1 */,
				Fragments._MorePivotable__MorePivotable /* 2 */
			};
		private static final int @NonNull [] __MorePivotable = { 1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Nameable =
			{
				Fragments._Nameable__OclAny /* 0 */,
				Fragments._Nameable__OclElement /* 1 */,
				Fragments._Nameable__Nameable /* 2 */
			};
		private static final int @NonNull [] __Nameable = { 1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__Element /* 2 */,
				Fragments._NamedElement__NamedElement /* 3 */
			};
		private static final int @NonNull [] __NamedElement = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Namespace =
			{
				Fragments._Namespace__OclAny /* 0 */,
				Fragments._Namespace__OclElement /* 1 */,
				Fragments._Namespace__Element /* 2 */,
				Fragments._Namespace__NamedElement /* 3 */,
				Fragments._Namespace__Namespace /* 4 */
			};
		private static final int @NonNull [] __Namespace = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _NavigationCallExp =
			{
				Fragments._NavigationCallExp__OclAny /* 0 */,
				Fragments._NavigationCallExp__OclElement /* 1 */,
				Fragments._NavigationCallExp__Element /* 2 */,
				Fragments._NavigationCallExp__NamedElement /* 3 */,
				Fragments._NavigationCallExp__TypedElement /* 4 */,
				Fragments._NavigationCallExp__OCLExpression /* 5 */,
				Fragments._NavigationCallExp__CallExp /* 6 */,
				Fragments._NavigationCallExp__FeatureCallExp /* 7 */,
				Fragments._NavigationCallExp__NavigationCallExp /* 8 */
			};
		private static final int @NonNull [] __NavigationCallExp = { 1,1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _NullLiteralExp =
			{
				Fragments._NullLiteralExp__OclAny /* 0 */,
				Fragments._NullLiteralExp__OclElement /* 1 */,
				Fragments._NullLiteralExp__Element /* 2 */,
				Fragments._NullLiteralExp__NamedElement /* 3 */,
				Fragments._NullLiteralExp__TypedElement /* 4 */,
				Fragments._NullLiteralExp__OCLExpression /* 5 */,
				Fragments._NullLiteralExp__LiteralExp /* 6 */,
				Fragments._NullLiteralExp__PrimitiveLiteralExp /* 7 */,
				Fragments._NullLiteralExp__NullLiteralExp /* 8 */
			};
		private static final int @NonNull [] __NullLiteralExp = { 1,1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _NumericLiteralExp =
			{
				Fragments._NumericLiteralExp__OclAny /* 0 */,
				Fragments._NumericLiteralExp__OclElement /* 1 */,
				Fragments._NumericLiteralExp__Element /* 2 */,
				Fragments._NumericLiteralExp__NamedElement /* 3 */,
				Fragments._NumericLiteralExp__TypedElement /* 4 */,
				Fragments._NumericLiteralExp__OCLExpression /* 5 */,
				Fragments._NumericLiteralExp__LiteralExp /* 6 */,
				Fragments._NumericLiteralExp__PrimitiveLiteralExp /* 7 */,
				Fragments._NumericLiteralExp__NumericLiteralExp /* 8 */
			};
		private static final int @NonNull [] __NumericLiteralExp = { 1,1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _OCLExpression =
			{
				Fragments._OCLExpression__OclAny /* 0 */,
				Fragments._OCLExpression__OclElement /* 1 */,
				Fragments._OCLExpression__Element /* 2 */,
				Fragments._OCLExpression__NamedElement /* 3 */,
				Fragments._OCLExpression__TypedElement /* 4 */,
				Fragments._OCLExpression__OCLExpression /* 5 */
			};
		private static final int @NonNull [] __OCLExpression = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Object =
			{
				Fragments._Object__OclAny /* 0 */,
				Fragments._Object__Object /* 1 */
			};
		private static final int @NonNull [] __Object = { 1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Operation =
			{
				Fragments._Operation__OclAny /* 0 */,
				Fragments._Operation__OclElement /* 1 */,
				Fragments._Operation__Element /* 2 */,
				Fragments._Operation__NamedElement /* 3 */,
				Fragments._Operation__TemplateableElement /* 3 */,
				Fragments._Operation__Namespace /* 4 */,
				Fragments._Operation__TypedElement /* 4 */,
				Fragments._Operation__Feature /* 5 */,
				Fragments._Operation__Operation /* 6 */
			};
		private static final int @NonNull [] __Operation = { 1,1,1,2,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _OperationCallExp =
			{
				Fragments._OperationCallExp__OclAny /* 0 */,
				Fragments._OperationCallExp__OclElement /* 1 */,
				Fragments._OperationCallExp__Element /* 2 */,
				Fragments._OperationCallExp__ReferringElement /* 2 */,
				Fragments._OperationCallExp__NamedElement /* 3 */,
				Fragments._OperationCallExp__TypedElement /* 4 */,
				Fragments._OperationCallExp__OCLExpression /* 5 */,
				Fragments._OperationCallExp__CallExp /* 6 */,
				Fragments._OperationCallExp__FeatureCallExp /* 7 */,
				Fragments._OperationCallExp__OperationCallExp /* 8 */
			};
		private static final int @NonNull [] __OperationCallExp = { 1,1,2,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _OppositePropertyCallExp =
			{
				Fragments._OppositePropertyCallExp__OclAny /* 0 */,
				Fragments._OppositePropertyCallExp__OclElement /* 1 */,
				Fragments._OppositePropertyCallExp__Element /* 2 */,
				Fragments._OppositePropertyCallExp__NamedElement /* 3 */,
				Fragments._OppositePropertyCallExp__TypedElement /* 4 */,
				Fragments._OppositePropertyCallExp__OCLExpression /* 5 */,
				Fragments._OppositePropertyCallExp__CallExp /* 6 */,
				Fragments._OppositePropertyCallExp__FeatureCallExp /* 7 */,
				Fragments._OppositePropertyCallExp__NavigationCallExp /* 8 */,
				Fragments._OppositePropertyCallExp__OppositePropertyCallExp /* 9 */
			};
		private static final int @NonNull [] __OppositePropertyCallExp = { 1,1,1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _OrderedSetType =
			{
				Fragments._OrderedSetType__OclAny /* 0 */,
				Fragments._OrderedSetType__OclElement /* 1 */,
				Fragments._OrderedSetType__Element /* 2 */,
				Fragments._OrderedSetType__OclType /* 2 */,
				Fragments._OrderedSetType__NamedElement /* 3 */,
				Fragments._OrderedSetType__TemplateableElement /* 3 */,
				Fragments._OrderedSetType__Namespace /* 4 */,
				Fragments._OrderedSetType__Type /* 4 */,
				Fragments._OrderedSetType__Class /* 5 */,
				Fragments._OrderedSetType__DataType /* 6 */,
				Fragments._OrderedSetType__IterableType /* 7 */,
				Fragments._OrderedSetType__CollectionType /* 8 */,
				Fragments._OrderedSetType__OrderedSetType /* 9 */
			};
		private static final int @NonNull [] __OrderedSetType = { 1,1,2,2,2,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _OrphanCompletePackage =
			{
				Fragments._OrphanCompletePackage__OclAny /* 0 */,
				Fragments._OrphanCompletePackage__OclElement /* 1 */,
				Fragments._OrphanCompletePackage__Element /* 2 */,
				Fragments._OrphanCompletePackage__NamedElement /* 3 */,
				Fragments._OrphanCompletePackage__CompletePackage /* 4 */,
				Fragments._OrphanCompletePackage__OrphanCompletePackage /* 5 */
			};
		private static final int @NonNull [] __OrphanCompletePackage = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Package =
			{
				Fragments._Package__OclAny /* 0 */,
				Fragments._Package__OclElement /* 1 */,
				Fragments._Package__Element /* 2 */,
				Fragments._Package__NamedElement /* 3 */,
				Fragments._Package__Namespace /* 4 */,
				Fragments._Package__Package /* 5 */
			};
		private static final int @NonNull [] __Package = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Parameter =
			{
				Fragments._Parameter__OclAny /* 0 */,
				Fragments._Parameter__OclElement /* 1 */,
				Fragments._Parameter__Element /* 2 */,
				Fragments._Parameter__NamedElement /* 3 */,
				Fragments._Parameter__TypedElement /* 4 */,
				Fragments._Parameter__VariableDeclaration /* 5 */,
				Fragments._Parameter__Parameter /* 6 */
			};
		private static final int @NonNull [] __Parameter = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _ParameterVariable =
			{
				Fragments._ParameterVariable__OclAny /* 0 */,
				Fragments._ParameterVariable__OclElement /* 1 */,
				Fragments._ParameterVariable__Element /* 2 */,
				Fragments._ParameterVariable__NamedElement /* 3 */,
				Fragments._ParameterVariable__TypedElement /* 4 */,
				Fragments._ParameterVariable__VariableDeclaration /* 5 */,
				Fragments._ParameterVariable__Variable /* 6 */,
				Fragments._ParameterVariable__ParameterVariable /* 7 */
			};
		private static final int @NonNull [] __ParameterVariable = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Pivotable =
			{
				Fragments._Pivotable__OclAny /* 0 */,
				Fragments._Pivotable__OclElement /* 1 */,
				Fragments._Pivotable__Pivotable /* 2 */
			};
		private static final int @NonNull [] __Pivotable = { 1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Precedence =
			{
				Fragments._Precedence__OclAny /* 0 */,
				Fragments._Precedence__OclElement /* 1 */,
				Fragments._Precedence__Element /* 2 */,
				Fragments._Precedence__NamedElement /* 3 */,
				Fragments._Precedence__Precedence /* 4 */
			};
		private static final int @NonNull [] __Precedence = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _PrimitiveCompletePackage =
			{
				Fragments._PrimitiveCompletePackage__OclAny /* 0 */,
				Fragments._PrimitiveCompletePackage__OclElement /* 1 */,
				Fragments._PrimitiveCompletePackage__Element /* 2 */,
				Fragments._PrimitiveCompletePackage__NamedElement /* 3 */,
				Fragments._PrimitiveCompletePackage__CompletePackage /* 4 */,
				Fragments._PrimitiveCompletePackage__PrimitiveCompletePackage /* 5 */
			};
		private static final int @NonNull [] __PrimitiveCompletePackage = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _PrimitiveLiteralExp =
			{
				Fragments._PrimitiveLiteralExp__OclAny /* 0 */,
				Fragments._PrimitiveLiteralExp__OclElement /* 1 */,
				Fragments._PrimitiveLiteralExp__Element /* 2 */,
				Fragments._PrimitiveLiteralExp__NamedElement /* 3 */,
				Fragments._PrimitiveLiteralExp__TypedElement /* 4 */,
				Fragments._PrimitiveLiteralExp__OCLExpression /* 5 */,
				Fragments._PrimitiveLiteralExp__LiteralExp /* 6 */,
				Fragments._PrimitiveLiteralExp__PrimitiveLiteralExp /* 7 */
			};
		private static final int @NonNull [] __PrimitiveLiteralExp = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _PrimitiveType =
			{
				Fragments._PrimitiveType__OclAny /* 0 */,
				Fragments._PrimitiveType__OclElement /* 1 */,
				Fragments._PrimitiveType__Element /* 2 */,
				Fragments._PrimitiveType__OclType /* 2 */,
				Fragments._PrimitiveType__NamedElement /* 3 */,
				Fragments._PrimitiveType__TemplateableElement /* 3 */,
				Fragments._PrimitiveType__Namespace /* 4 */,
				Fragments._PrimitiveType__Type /* 4 */,
				Fragments._PrimitiveType__Class /* 5 */,
				Fragments._PrimitiveType__DataType /* 6 */,
				Fragments._PrimitiveType__PrimitiveType /* 7 */
			};
		private static final int @NonNull [] __PrimitiveType = { 1,1,2,2,2,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Profile =
			{
				Fragments._Profile__OclAny /* 0 */,
				Fragments._Profile__OclElement /* 1 */,
				Fragments._Profile__Element /* 2 */,
				Fragments._Profile__NamedElement /* 3 */,
				Fragments._Profile__Namespace /* 4 */,
				Fragments._Profile__Package /* 5 */,
				Fragments._Profile__Profile /* 6 */
			};
		private static final int @NonNull [] __Profile = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _ProfileApplication =
			{
				Fragments._ProfileApplication__OclAny /* 0 */,
				Fragments._ProfileApplication__OclElement /* 1 */,
				Fragments._ProfileApplication__Element /* 2 */,
				Fragments._ProfileApplication__ProfileApplication /* 3 */
			};
		private static final int @NonNull [] __ProfileApplication = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Property =
			{
				Fragments._Property__OclAny /* 0 */,
				Fragments._Property__OclElement /* 1 */,
				Fragments._Property__Element /* 2 */,
				Fragments._Property__NamedElement /* 3 */,
				Fragments._Property__TypedElement /* 4 */,
				Fragments._Property__Feature /* 5 */,
				Fragments._Property__Property /* 6 */
			};
		private static final int @NonNull [] __Property = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _PropertyCallExp =
			{
				Fragments._PropertyCallExp__OclAny /* 0 */,
				Fragments._PropertyCallExp__OclElement /* 1 */,
				Fragments._PropertyCallExp__Element /* 2 */,
				Fragments._PropertyCallExp__ReferringElement /* 2 */,
				Fragments._PropertyCallExp__NamedElement /* 3 */,
				Fragments._PropertyCallExp__TypedElement /* 4 */,
				Fragments._PropertyCallExp__OCLExpression /* 5 */,
				Fragments._PropertyCallExp__CallExp /* 6 */,
				Fragments._PropertyCallExp__FeatureCallExp /* 7 */,
				Fragments._PropertyCallExp__NavigationCallExp /* 8 */,
				Fragments._PropertyCallExp__PropertyCallExp /* 9 */
			};
		private static final int @NonNull [] __PropertyCallExp = { 1,1,2,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Pseudostate =
			{
				Fragments._Pseudostate__OclAny /* 0 */,
				Fragments._Pseudostate__OclElement /* 1 */,
				Fragments._Pseudostate__Element /* 2 */,
				Fragments._Pseudostate__NamedElement /* 3 */,
				Fragments._Pseudostate__Vertex /* 4 */,
				Fragments._Pseudostate__Pseudostate /* 5 */
			};
		private static final int @NonNull [] __Pseudostate = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _PseudostateKind =
			{
				Fragments._PseudostateKind__OclAny /* 0 */,
				Fragments._PseudostateKind__OclElement /* 1 */,
				Fragments._PseudostateKind__OclType /* 2 */,
				Fragments._PseudostateKind__OclEnumeration /* 3 */,
				Fragments._PseudostateKind__PseudostateKind /* 4 */
			};
		private static final int @NonNull [] __PseudostateKind = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _RealLiteralExp =
			{
				Fragments._RealLiteralExp__OclAny /* 0 */,
				Fragments._RealLiteralExp__OclElement /* 1 */,
				Fragments._RealLiteralExp__Element /* 2 */,
				Fragments._RealLiteralExp__NamedElement /* 3 */,
				Fragments._RealLiteralExp__TypedElement /* 4 */,
				Fragments._RealLiteralExp__OCLExpression /* 5 */,
				Fragments._RealLiteralExp__LiteralExp /* 6 */,
				Fragments._RealLiteralExp__PrimitiveLiteralExp /* 7 */,
				Fragments._RealLiteralExp__NumericLiteralExp /* 8 */,
				Fragments._RealLiteralExp__RealLiteralExp /* 9 */
			};
		private static final int @NonNull [] __RealLiteralExp = { 1,1,1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _ReferringElement =
			{
				Fragments._ReferringElement__OclAny /* 0 */,
				Fragments._ReferringElement__OclElement /* 1 */,
				Fragments._ReferringElement__ReferringElement /* 2 */
			};
		private static final int @NonNull [] __ReferringElement = { 1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Region =
			{
				Fragments._Region__OclAny /* 0 */,
				Fragments._Region__OclElement /* 1 */,
				Fragments._Region__Element /* 2 */,
				Fragments._Region__NamedElement /* 3 */,
				Fragments._Region__Namespace /* 4 */,
				Fragments._Region__Region /* 5 */
			};
		private static final int @NonNull [] __Region = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _ResultVariable =
			{
				Fragments._ResultVariable__OclAny /* 0 */,
				Fragments._ResultVariable__OclElement /* 1 */,
				Fragments._ResultVariable__Element /* 2 */,
				Fragments._ResultVariable__NamedElement /* 3 */,
				Fragments._ResultVariable__TypedElement /* 4 */,
				Fragments._ResultVariable__VariableDeclaration /* 5 */,
				Fragments._ResultVariable__Variable /* 6 */,
				Fragments._ResultVariable__ResultVariable /* 7 */
			};
		private static final int @NonNull [] __ResultVariable = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _SelfType =
			{
				Fragments._SelfType__OclAny /* 0 */,
				Fragments._SelfType__OclElement /* 1 */,
				Fragments._SelfType__Element /* 2 */,
				Fragments._SelfType__OclType /* 2 */,
				Fragments._SelfType__NamedElement /* 3 */,
				Fragments._SelfType__TemplateableElement /* 3 */,
				Fragments._SelfType__Namespace /* 4 */,
				Fragments._SelfType__Type /* 4 */,
				Fragments._SelfType__Class /* 5 */,
				Fragments._SelfType__SelfType /* 6 */
			};
		private static final int @NonNull [] __SelfType = { 1,1,2,2,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _SendSignalAction =
			{
				Fragments._SendSignalAction__OclAny /* 0 */,
				Fragments._SendSignalAction__OclElement /* 1 */,
				Fragments._SendSignalAction__Element /* 2 */,
				Fragments._SendSignalAction__NamedElement /* 3 */,
				Fragments._SendSignalAction__SendSignalAction /* 4 */
			};
		private static final int @NonNull [] __SendSignalAction = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _SequenceType =
			{
				Fragments._SequenceType__OclAny /* 0 */,
				Fragments._SequenceType__OclElement /* 1 */,
				Fragments._SequenceType__Element /* 2 */,
				Fragments._SequenceType__OclType /* 2 */,
				Fragments._SequenceType__NamedElement /* 3 */,
				Fragments._SequenceType__TemplateableElement /* 3 */,
				Fragments._SequenceType__Namespace /* 4 */,
				Fragments._SequenceType__Type /* 4 */,
				Fragments._SequenceType__Class /* 5 */,
				Fragments._SequenceType__DataType /* 6 */,
				Fragments._SequenceType__IterableType /* 7 */,
				Fragments._SequenceType__CollectionType /* 8 */,
				Fragments._SequenceType__SequenceType /* 9 */
			};
		private static final int @NonNull [] __SequenceType = { 1,1,2,2,2,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _SetType =
			{
				Fragments._SetType__OclAny /* 0 */,
				Fragments._SetType__OclElement /* 1 */,
				Fragments._SetType__Element /* 2 */,
				Fragments._SetType__OclType /* 2 */,
				Fragments._SetType__NamedElement /* 3 */,
				Fragments._SetType__TemplateableElement /* 3 */,
				Fragments._SetType__Namespace /* 4 */,
				Fragments._SetType__Type /* 4 */,
				Fragments._SetType__Class /* 5 */,
				Fragments._SetType__DataType /* 6 */,
				Fragments._SetType__IterableType /* 7 */,
				Fragments._SetType__CollectionType /* 8 */,
				Fragments._SetType__SetType /* 9 */
			};
		private static final int @NonNull [] __SetType = { 1,1,2,2,2,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _ShadowExp =
			{
				Fragments._ShadowExp__OclAny /* 0 */,
				Fragments._ShadowExp__OclElement /* 1 */,
				Fragments._ShadowExp__Element /* 2 */,
				Fragments._ShadowExp__NamedElement /* 3 */,
				Fragments._ShadowExp__TypedElement /* 4 */,
				Fragments._ShadowExp__OCLExpression /* 5 */,
				Fragments._ShadowExp__ShadowExp /* 6 */
			};
		private static final int @NonNull [] __ShadowExp = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _ShadowPart =
			{
				Fragments._ShadowPart__OclAny /* 0 */,
				Fragments._ShadowPart__OclElement /* 1 */,
				Fragments._ShadowPart__Element /* 2 */,
				Fragments._ShadowPart__NamedElement /* 3 */,
				Fragments._ShadowPart__TypedElement /* 4 */,
				Fragments._ShadowPart__ShadowPart /* 5 */
			};
		private static final int @NonNull [] __ShadowPart = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Signal =
			{
				Fragments._Signal__OclAny /* 0 */,
				Fragments._Signal__OclElement /* 1 */,
				Fragments._Signal__Element /* 2 */,
				Fragments._Signal__OclType /* 2 */,
				Fragments._Signal__NamedElement /* 3 */,
				Fragments._Signal__TemplateableElement /* 3 */,
				Fragments._Signal__Namespace /* 4 */,
				Fragments._Signal__Type /* 4 */,
				Fragments._Signal__Class /* 5 */,
				Fragments._Signal__Signal /* 6 */
			};
		private static final int @NonNull [] __Signal = { 1,1,2,2,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Slot =
			{
				Fragments._Slot__OclAny /* 0 */,
				Fragments._Slot__OclElement /* 1 */,
				Fragments._Slot__Element /* 2 */,
				Fragments._Slot__Slot /* 3 */
			};
		private static final int @NonNull [] __Slot = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _StandardLibrary =
			{
				Fragments._StandardLibrary__OclAny /* 0 */,
				Fragments._StandardLibrary__OclElement /* 1 */,
				Fragments._StandardLibrary__Element /* 2 */,
				Fragments._StandardLibrary__StandardLibrary /* 3 */
			};
		private static final int @NonNull [] __StandardLibrary = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _State =
			{
				Fragments._State__OclAny /* 0 */,
				Fragments._State__OclElement /* 1 */,
				Fragments._State__OclState /* 1 */,
				Fragments._State__Element /* 2 */,
				Fragments._State__NamedElement /* 3 */,
				Fragments._State__Namespace /* 4 */,
				Fragments._State__Vertex /* 4 */,
				Fragments._State__State /* 5 */
			};
		private static final int @NonNull [] __State = { 1,2,1,1,2,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _StateExp =
			{
				Fragments._StateExp__OclAny /* 0 */,
				Fragments._StateExp__OclElement /* 1 */,
				Fragments._StateExp__Element /* 2 */,
				Fragments._StateExp__NamedElement /* 3 */,
				Fragments._StateExp__TypedElement /* 4 */,
				Fragments._StateExp__OCLExpression /* 5 */,
				Fragments._StateExp__StateExp /* 6 */
			};
		private static final int @NonNull [] __StateExp = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _StateMachine =
			{
				Fragments._StateMachine__OclAny /* 0 */,
				Fragments._StateMachine__OclElement /* 1 */,
				Fragments._StateMachine__Element /* 2 */,
				Fragments._StateMachine__OclType /* 2 */,
				Fragments._StateMachine__NamedElement /* 3 */,
				Fragments._StateMachine__TemplateableElement /* 3 */,
				Fragments._StateMachine__Namespace /* 4 */,
				Fragments._StateMachine__Type /* 4 */,
				Fragments._StateMachine__Class /* 5 */,
				Fragments._StateMachine__Behavior /* 6 */,
				Fragments._StateMachine__StateMachine /* 7 */
			};
		private static final int @NonNull [] __StateMachine = { 1,1,2,2,2,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Stereotype =
			{
				Fragments._Stereotype__OclAny /* 0 */,
				Fragments._Stereotype__OclElement /* 1 */,
				Fragments._Stereotype__Element /* 2 */,
				Fragments._Stereotype__OclType /* 2 */,
				Fragments._Stereotype__NamedElement /* 3 */,
				Fragments._Stereotype__TemplateableElement /* 3 */,
				Fragments._Stereotype__Namespace /* 4 */,
				Fragments._Stereotype__Type /* 4 */,
				Fragments._Stereotype__Class /* 5 */,
				Fragments._Stereotype__Stereotype /* 6 */
			};
		private static final int @NonNull [] __Stereotype = { 1,1,2,2,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _StereotypeExtender =
			{
				Fragments._StereotypeExtender__OclAny /* 0 */,
				Fragments._StereotypeExtender__OclElement /* 1 */,
				Fragments._StereotypeExtender__Element /* 2 */,
				Fragments._StereotypeExtender__StereotypeExtender /* 3 */
			};
		private static final int @NonNull [] __StereotypeExtender = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _StringLiteralExp =
			{
				Fragments._StringLiteralExp__OclAny /* 0 */,
				Fragments._StringLiteralExp__OclElement /* 1 */,
				Fragments._StringLiteralExp__Element /* 2 */,
				Fragments._StringLiteralExp__NamedElement /* 3 */,
				Fragments._StringLiteralExp__TypedElement /* 4 */,
				Fragments._StringLiteralExp__OCLExpression /* 5 */,
				Fragments._StringLiteralExp__LiteralExp /* 6 */,
				Fragments._StringLiteralExp__PrimitiveLiteralExp /* 7 */,
				Fragments._StringLiteralExp__StringLiteralExp /* 8 */
			};
		private static final int @NonNull [] __StringLiteralExp = { 1,1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _TemplateBinding =
			{
				Fragments._TemplateBinding__OclAny /* 0 */,
				Fragments._TemplateBinding__OclElement /* 1 */,
				Fragments._TemplateBinding__Element /* 2 */,
				Fragments._TemplateBinding__TemplateBinding /* 3 */
			};
		private static final int @NonNull [] __TemplateBinding = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _TemplateParameter =
			{
				Fragments._TemplateParameter__OclAny /* 0 */,
				Fragments._TemplateParameter__OclElement /* 1 */,
				Fragments._TemplateParameter__Element /* 2 */,
				Fragments._TemplateParameter__OclType /* 2 */,
				Fragments._TemplateParameter__NamedElement /* 3 */,
				Fragments._TemplateParameter__Type /* 4 */,
				Fragments._TemplateParameter__TemplateParameter /* 5 */
			};
		private static final int @NonNull [] __TemplateParameter = { 1,1,2,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _TemplateParameterSubstitution =
			{
				Fragments._TemplateParameterSubstitution__OclAny /* 0 */,
				Fragments._TemplateParameterSubstitution__OclElement /* 1 */,
				Fragments._TemplateParameterSubstitution__Element /* 2 */,
				Fragments._TemplateParameterSubstitution__TemplateParameterSubstitution /* 3 */
			};
		private static final int @NonNull [] __TemplateParameterSubstitution = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _TemplateSignature =
			{
				Fragments._TemplateSignature__OclAny /* 0 */,
				Fragments._TemplateSignature__OclElement /* 1 */,
				Fragments._TemplateSignature__Element /* 2 */,
				Fragments._TemplateSignature__TemplateSignature /* 3 */
			};
		private static final int @NonNull [] __TemplateSignature = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _TemplateableElement =
			{
				Fragments._TemplateableElement__OclAny /* 0 */,
				Fragments._TemplateableElement__OclElement /* 1 */,
				Fragments._TemplateableElement__Element /* 2 */,
				Fragments._TemplateableElement__TemplateableElement /* 3 */
			};
		private static final int @NonNull [] __TemplateableElement = { 1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Throwable =
			{
				Fragments._Throwable__OclAny /* 0 */,
				Fragments._Throwable__Throwable /* 1 */
			};
		private static final int @NonNull [] __Throwable = { 1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Transition =
			{
				Fragments._Transition__OclAny /* 0 */,
				Fragments._Transition__OclElement /* 1 */,
				Fragments._Transition__Element /* 2 */,
				Fragments._Transition__NamedElement /* 3 */,
				Fragments._Transition__Namespace /* 4 */,
				Fragments._Transition__Transition /* 5 */
			};
		private static final int @NonNull [] __Transition = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _TransitionKind =
			{
				Fragments._TransitionKind__OclAny /* 0 */,
				Fragments._TransitionKind__OclElement /* 1 */,
				Fragments._TransitionKind__OclType /* 2 */,
				Fragments._TransitionKind__OclEnumeration /* 3 */,
				Fragments._TransitionKind__TransitionKind /* 4 */
			};
		private static final int @NonNull [] __TransitionKind = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Trigger =
			{
				Fragments._Trigger__OclAny /* 0 */,
				Fragments._Trigger__OclElement /* 1 */,
				Fragments._Trigger__Element /* 2 */,
				Fragments._Trigger__NamedElement /* 3 */,
				Fragments._Trigger__Trigger /* 4 */
			};
		private static final int @NonNull [] __Trigger = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _TupleLiteralExp =
			{
				Fragments._TupleLiteralExp__OclAny /* 0 */,
				Fragments._TupleLiteralExp__OclElement /* 1 */,
				Fragments._TupleLiteralExp__Element /* 2 */,
				Fragments._TupleLiteralExp__NamedElement /* 3 */,
				Fragments._TupleLiteralExp__TypedElement /* 4 */,
				Fragments._TupleLiteralExp__OCLExpression /* 5 */,
				Fragments._TupleLiteralExp__LiteralExp /* 6 */,
				Fragments._TupleLiteralExp__TupleLiteralExp /* 7 */
			};
		private static final int @NonNull [] __TupleLiteralExp = { 1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _TupleLiteralPart =
			{
				Fragments._TupleLiteralPart__OclAny /* 0 */,
				Fragments._TupleLiteralPart__OclElement /* 1 */,
				Fragments._TupleLiteralPart__Element /* 2 */,
				Fragments._TupleLiteralPart__NamedElement /* 3 */,
				Fragments._TupleLiteralPart__TypedElement /* 4 */,
				Fragments._TupleLiteralPart__VariableDeclaration /* 5 */,
				Fragments._TupleLiteralPart__TupleLiteralPart /* 6 */
			};
		private static final int @NonNull [] __TupleLiteralPart = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _TupleType =
			{
				Fragments._TupleType__OclAny /* 0 */,
				Fragments._TupleType__OclElement /* 1 */,
				Fragments._TupleType__Element /* 2 */,
				Fragments._TupleType__OclType /* 2 */,
				Fragments._TupleType__NamedElement /* 3 */,
				Fragments._TupleType__TemplateableElement /* 3 */,
				Fragments._TupleType__Namespace /* 4 */,
				Fragments._TupleType__Type /* 4 */,
				Fragments._TupleType__Class /* 5 */,
				Fragments._TupleType__DataType /* 6 */,
				Fragments._TupleType__TupleType /* 7 */
			};
		private static final int @NonNull [] __TupleType = { 1,1,2,2,2,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Type =
			{
				Fragments._Type__OclAny /* 0 */,
				Fragments._Type__OclElement /* 1 */,
				Fragments._Type__Element /* 2 */,
				Fragments._Type__OclType /* 2 */,
				Fragments._Type__NamedElement /* 3 */,
				Fragments._Type__Type /* 4 */
			};
		private static final int @NonNull [] __Type = { 1,1,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _TypeExp =
			{
				Fragments._TypeExp__OclAny /* 0 */,
				Fragments._TypeExp__OclElement /* 1 */,
				Fragments._TypeExp__Element /* 2 */,
				Fragments._TypeExp__ReferringElement /* 2 */,
				Fragments._TypeExp__NamedElement /* 3 */,
				Fragments._TypeExp__TypedElement /* 4 */,
				Fragments._TypeExp__OCLExpression /* 5 */,
				Fragments._TypeExp__TypeExp /* 6 */
			};
		private static final int @NonNull [] __TypeExp = { 1,1,2,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _TypedElement =
			{
				Fragments._TypedElement__OclAny /* 0 */,
				Fragments._TypedElement__OclElement /* 1 */,
				Fragments._TypedElement__Element /* 2 */,
				Fragments._TypedElement__NamedElement /* 3 */,
				Fragments._TypedElement__TypedElement /* 4 */
			};
		private static final int @NonNull [] __TypedElement = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _UnlimitedNaturalLiteralExp =
			{
				Fragments._UnlimitedNaturalLiteralExp__OclAny /* 0 */,
				Fragments._UnlimitedNaturalLiteralExp__OclElement /* 1 */,
				Fragments._UnlimitedNaturalLiteralExp__Element /* 2 */,
				Fragments._UnlimitedNaturalLiteralExp__NamedElement /* 3 */,
				Fragments._UnlimitedNaturalLiteralExp__TypedElement /* 4 */,
				Fragments._UnlimitedNaturalLiteralExp__OCLExpression /* 5 */,
				Fragments._UnlimitedNaturalLiteralExp__LiteralExp /* 6 */,
				Fragments._UnlimitedNaturalLiteralExp__PrimitiveLiteralExp /* 7 */,
				Fragments._UnlimitedNaturalLiteralExp__NumericLiteralExp /* 8 */,
				Fragments._UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp /* 9 */
			};
		private static final int @NonNull [] __UnlimitedNaturalLiteralExp = { 1,1,1,1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _UnspecifiedValueExp =
			{
				Fragments._UnspecifiedValueExp__OclAny /* 0 */,
				Fragments._UnspecifiedValueExp__OclElement /* 1 */,
				Fragments._UnspecifiedValueExp__Element /* 2 */,
				Fragments._UnspecifiedValueExp__NamedElement /* 3 */,
				Fragments._UnspecifiedValueExp__TypedElement /* 4 */,
				Fragments._UnspecifiedValueExp__OCLExpression /* 5 */,
				Fragments._UnspecifiedValueExp__UnspecifiedValueExp /* 6 */
			};
		private static final int @NonNull [] __UnspecifiedValueExp = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _ValueSpecification =
			{
				Fragments._ValueSpecification__OclAny /* 0 */,
				Fragments._ValueSpecification__OclElement /* 1 */,
				Fragments._ValueSpecification__Element /* 2 */,
				Fragments._ValueSpecification__NamedElement /* 3 */,
				Fragments._ValueSpecification__TypedElement /* 4 */,
				Fragments._ValueSpecification__ValueSpecification /* 5 */
			};
		private static final int @NonNull [] __ValueSpecification = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Variable =
			{
				Fragments._Variable__OclAny /* 0 */,
				Fragments._Variable__OclElement /* 1 */,
				Fragments._Variable__Element /* 2 */,
				Fragments._Variable__NamedElement /* 3 */,
				Fragments._Variable__TypedElement /* 4 */,
				Fragments._Variable__VariableDeclaration /* 5 */,
				Fragments._Variable__Variable /* 6 */
			};
		private static final int @NonNull [] __Variable = { 1,1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _VariableDeclaration =
			{
				Fragments._VariableDeclaration__OclAny /* 0 */,
				Fragments._VariableDeclaration__OclElement /* 1 */,
				Fragments._VariableDeclaration__Element /* 2 */,
				Fragments._VariableDeclaration__NamedElement /* 3 */,
				Fragments._VariableDeclaration__TypedElement /* 4 */,
				Fragments._VariableDeclaration__VariableDeclaration /* 5 */
			};
		private static final int @NonNull [] __VariableDeclaration = { 1,1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _VariableExp =
			{
				Fragments._VariableExp__OclAny /* 0 */,
				Fragments._VariableExp__OclElement /* 1 */,
				Fragments._VariableExp__Element /* 2 */,
				Fragments._VariableExp__ReferringElement /* 2 */,
				Fragments._VariableExp__NamedElement /* 3 */,
				Fragments._VariableExp__TypedElement /* 4 */,
				Fragments._VariableExp__OCLExpression /* 5 */,
				Fragments._VariableExp__VariableExp /* 6 */
			};
		private static final int @NonNull [] __VariableExp = { 1,1,2,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Vertex =
			{
				Fragments._Vertex__OclAny /* 0 */,
				Fragments._Vertex__OclElement /* 1 */,
				Fragments._Vertex__Element /* 2 */,
				Fragments._Vertex__NamedElement /* 3 */,
				Fragments._Vertex__Vertex /* 4 */
			};
		private static final int @NonNull [] __Vertex = { 1,1,1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _Visitable =
			{
				Fragments._Visitable__OclAny /* 0 */,
				Fragments._Visitable__OclElement /* 1 */,
				Fragments._Visitable__Visitable /* 2 */
			};
		private static final int @NonNull [] __Visitable = { 1,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _VoidType =
			{
				Fragments._VoidType__OclAny /* 0 */,
				Fragments._VoidType__OclElement /* 1 */,
				Fragments._VoidType__Element /* 2 */,
				Fragments._VoidType__OclType /* 2 */,
				Fragments._VoidType__NamedElement /* 3 */,
				Fragments._VoidType__TemplateableElement /* 3 */,
				Fragments._VoidType__Namespace /* 4 */,
				Fragments._VoidType__Type /* 4 */,
				Fragments._VoidType__Class /* 5 */,
				Fragments._VoidType__VoidType /* 6 */
			};
		private static final int @NonNull [] __VoidType = { 1,1,2,2,2,1,1 };

		private static final @NonNull ExecutorFragment @NonNull [] _WildcardType =
			{
				Fragments._WildcardType__OclAny /* 0 */,
				Fragments._WildcardType__OclElement /* 1 */,
				Fragments._WildcardType__Element /* 2 */,
				Fragments._WildcardType__OclType /* 2 */,
				Fragments._WildcardType__NamedElement /* 3 */,
				Fragments._WildcardType__TemplateableElement /* 3 */,
				Fragments._WildcardType__Namespace /* 4 */,
				Fragments._WildcardType__Type /* 4 */,
				Fragments._WildcardType__Class /* 5 */,
				Fragments._WildcardType__WildcardType /* 6 */
			};
		private static final int @NonNull [] __WildcardType = { 1,1,2,2,2,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Annotation.initFragments(_Annotation, __Annotation);
			Types._AnyType.initFragments(_AnyType, __AnyType);
			Types._AssociationClass.initFragments(_AssociationClass, __AssociationClass);
			Types._AssociationClassCallExp.initFragments(_AssociationClassCallExp, __AssociationClassCallExp);
			Types._AssociativityKind.initFragments(_AssociativityKind, __AssociativityKind);
			Types._BagType.initFragments(_BagType, __BagType);
			Types._Behavior.initFragments(_Behavior, __Behavior);
			Types._BooleanLiteralExp.initFragments(_BooleanLiteralExp, __BooleanLiteralExp);
			Types._CallExp.initFragments(_CallExp, __CallExp);
			Types._CallOperationAction.initFragments(_CallOperationAction, __CallOperationAction);
			Types._Class.initFragments(_Class, __Class);
			Types._CollectionItem.initFragments(_CollectionItem, __CollectionItem);
			Types._CollectionKind.initFragments(_CollectionKind, __CollectionKind);
			Types._CollectionLiteralExp.initFragments(_CollectionLiteralExp, __CollectionLiteralExp);
			Types._CollectionLiteralPart.initFragments(_CollectionLiteralPart, __CollectionLiteralPart);
			Types._CollectionRange.initFragments(_CollectionRange, __CollectionRange);
			Types._CollectionType.initFragments(_CollectionType, __CollectionType);
			Types._Comment.initFragments(_Comment, __Comment);
			Types._CompleteClass.initFragments(_CompleteClass, __CompleteClass);
			Types._CompleteEnvironment.initFragments(_CompleteEnvironment, __CompleteEnvironment);
			Types._CompleteModel.initFragments(_CompleteModel, __CompleteModel);
			Types._CompletePackage.initFragments(_CompletePackage, __CompletePackage);
			Types._ConnectionPointReference.initFragments(_ConnectionPointReference, __ConnectionPointReference);
			Types._Constraint.initFragments(_Constraint, __Constraint);
			Types._DataType.initFragments(_DataType, __DataType);
			Types._Detail.initFragments(_Detail, __Detail);
			Types._DynamicBehavior.initFragments(_DynamicBehavior, __DynamicBehavior);
			Types._DynamicElement.initFragments(_DynamicElement, __DynamicElement);
			Types._DynamicProperty.initFragments(_DynamicProperty, __DynamicProperty);
			Types._DynamicType.initFragments(_DynamicType, __DynamicType);
			Types._DynamicValueSpecification.initFragments(_DynamicValueSpecification, __DynamicValueSpecification);
			Types._Element.initFragments(_Element, __Element);
			Types._ElementExtension.initFragments(_ElementExtension, __ElementExtension);
			Types._EnumLiteralExp.initFragments(_EnumLiteralExp, __EnumLiteralExp);
			Types._Enumeration.initFragments(_Enumeration, __Enumeration);
			Types._EnumerationLiteral.initFragments(_EnumerationLiteral, __EnumerationLiteral);
			Types._ExpressionInOCL.initFragments(_ExpressionInOCL, __ExpressionInOCL);
			Types._Feature.initFragments(_Feature, __Feature);
			Types._FeatureCallExp.initFragments(_FeatureCallExp, __FeatureCallExp);
			Types._FinalState.initFragments(_FinalState, __FinalState);
			Types._IfExp.initFragments(_IfExp, __IfExp);
			Types._Import.initFragments(_Import, __Import);
			Types._InstanceSpecification.initFragments(_InstanceSpecification, __InstanceSpecification);
			Types._IntegerLiteralExp.initFragments(_IntegerLiteralExp, __IntegerLiteralExp);
			Types._InvalidLiteralExp.initFragments(_InvalidLiteralExp, __InvalidLiteralExp);
			Types._InvalidType.initFragments(_InvalidType, __InvalidType);
			Types._IterableType.initFragments(_IterableType, __IterableType);
			Types._IterateExp.initFragments(_IterateExp, __IterateExp);
			Types._Iteration.initFragments(_Iteration, __Iteration);
			Types._IteratorExp.initFragments(_IteratorExp, __IteratorExp);
			Types._IteratorVariable.initFragments(_IteratorVariable, __IteratorVariable);
			Types._LambdaType.initFragments(_LambdaType, __LambdaType);
			Types._LanguageExpression.initFragments(_LanguageExpression, __LanguageExpression);
			Types._LetExp.initFragments(_LetExp, __LetExp);
			Types._LetVariable.initFragments(_LetVariable, __LetVariable);
			Types._Library.initFragments(_Library, __Library);
			Types._LibraryFeature.initFragments(_LibraryFeature, __LibraryFeature);
			Types._LiteralExp.initFragments(_LiteralExp, __LiteralExp);
			Types._LoopExp.initFragments(_LoopExp, __LoopExp);
			Types._MapLiteralExp.initFragments(_MapLiteralExp, __MapLiteralExp);
			Types._MapLiteralPart.initFragments(_MapLiteralPart, __MapLiteralPart);
			Types._MapType.initFragments(_MapType, __MapType);
			Types._MessageExp.initFragments(_MessageExp, __MessageExp);
			Types._MessageType.initFragments(_MessageType, __MessageType);
			Types._Model.initFragments(_Model, __Model);
			Types._MorePivotable.initFragments(_MorePivotable, __MorePivotable);
			Types._Nameable.initFragments(_Nameable, __Nameable);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Namespace.initFragments(_Namespace, __Namespace);
			Types._NavigationCallExp.initFragments(_NavigationCallExp, __NavigationCallExp);
			Types._NullLiteralExp.initFragments(_NullLiteralExp, __NullLiteralExp);
			Types._NumericLiteralExp.initFragments(_NumericLiteralExp, __NumericLiteralExp);
			Types._OCLExpression.initFragments(_OCLExpression, __OCLExpression);
			Types._Object.initFragments(_Object, __Object);
			Types._Operation.initFragments(_Operation, __Operation);
			Types._OperationCallExp.initFragments(_OperationCallExp, __OperationCallExp);
			Types._OppositePropertyCallExp.initFragments(_OppositePropertyCallExp, __OppositePropertyCallExp);
			Types._OrderedSetType.initFragments(_OrderedSetType, __OrderedSetType);
			Types._OrphanCompletePackage.initFragments(_OrphanCompletePackage, __OrphanCompletePackage);
			Types._Package.initFragments(_Package, __Package);
			Types._Parameter.initFragments(_Parameter, __Parameter);
			Types._ParameterVariable.initFragments(_ParameterVariable, __ParameterVariable);
			Types._Pivotable.initFragments(_Pivotable, __Pivotable);
			Types._Precedence.initFragments(_Precedence, __Precedence);
			Types._PrimitiveCompletePackage.initFragments(_PrimitiveCompletePackage, __PrimitiveCompletePackage);
			Types._PrimitiveLiteralExp.initFragments(_PrimitiveLiteralExp, __PrimitiveLiteralExp);
			Types._PrimitiveType.initFragments(_PrimitiveType, __PrimitiveType);
			Types._Profile.initFragments(_Profile, __Profile);
			Types._ProfileApplication.initFragments(_ProfileApplication, __ProfileApplication);
			Types._Property.initFragments(_Property, __Property);
			Types._PropertyCallExp.initFragments(_PropertyCallExp, __PropertyCallExp);
			Types._Pseudostate.initFragments(_Pseudostate, __Pseudostate);
			Types._PseudostateKind.initFragments(_PseudostateKind, __PseudostateKind);
			Types._RealLiteralExp.initFragments(_RealLiteralExp, __RealLiteralExp);
			Types._ReferringElement.initFragments(_ReferringElement, __ReferringElement);
			Types._Region.initFragments(_Region, __Region);
			Types._ResultVariable.initFragments(_ResultVariable, __ResultVariable);
			Types._SelfType.initFragments(_SelfType, __SelfType);
			Types._SendSignalAction.initFragments(_SendSignalAction, __SendSignalAction);
			Types._SequenceType.initFragments(_SequenceType, __SequenceType);
			Types._SetType.initFragments(_SetType, __SetType);
			Types._ShadowExp.initFragments(_ShadowExp, __ShadowExp);
			Types._ShadowPart.initFragments(_ShadowPart, __ShadowPart);
			Types._Signal.initFragments(_Signal, __Signal);
			Types._Slot.initFragments(_Slot, __Slot);
			Types._StandardLibrary.initFragments(_StandardLibrary, __StandardLibrary);
			Types._State.initFragments(_State, __State);
			Types._StateExp.initFragments(_StateExp, __StateExp);
			Types._StateMachine.initFragments(_StateMachine, __StateMachine);
			Types._Stereotype.initFragments(_Stereotype, __Stereotype);
			Types._StereotypeExtender.initFragments(_StereotypeExtender, __StereotypeExtender);
			Types._StringLiteralExp.initFragments(_StringLiteralExp, __StringLiteralExp);
			Types._TemplateBinding.initFragments(_TemplateBinding, __TemplateBinding);
			Types._TemplateParameter.initFragments(_TemplateParameter, __TemplateParameter);
			Types._TemplateParameterSubstitution.initFragments(_TemplateParameterSubstitution, __TemplateParameterSubstitution);
			Types._TemplateSignature.initFragments(_TemplateSignature, __TemplateSignature);
			Types._TemplateableElement.initFragments(_TemplateableElement, __TemplateableElement);
			Types._Throwable.initFragments(_Throwable, __Throwable);
			Types._Transition.initFragments(_Transition, __Transition);
			Types._TransitionKind.initFragments(_TransitionKind, __TransitionKind);
			Types._Trigger.initFragments(_Trigger, __Trigger);
			Types._TupleLiteralExp.initFragments(_TupleLiteralExp, __TupleLiteralExp);
			Types._TupleLiteralPart.initFragments(_TupleLiteralPart, __TupleLiteralPart);
			Types._TupleType.initFragments(_TupleType, __TupleType);
			Types._Type.initFragments(_Type, __Type);
			Types._TypeExp.initFragments(_TypeExp, __TypeExp);
			Types._TypedElement.initFragments(_TypedElement, __TypedElement);
			Types._UnlimitedNaturalLiteralExp.initFragments(_UnlimitedNaturalLiteralExp, __UnlimitedNaturalLiteralExp);
			Types._UnspecifiedValueExp.initFragments(_UnspecifiedValueExp, __UnspecifiedValueExp);
			Types._ValueSpecification.initFragments(_ValueSpecification, __ValueSpecification);
			Types._Variable.initFragments(_Variable, __Variable);
			Types._VariableDeclaration.initFragments(_VariableDeclaration, __VariableDeclaration);
			Types._VariableExp.initFragments(_VariableExp, __VariableExp);
			Types._Vertex.initFragments(_Vertex, __Vertex);
			Types._Visitable.initFragments(_Visitable, __Visitable);
			Types._VoidType.initFragments(_VoidType, __VoidType);
			Types._WildcardType.initFragments(_WildcardType, __WildcardType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PivotTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final @NonNull ExecutorOperation @NonNull [] _Annotation__Annotation = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Annotation__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Annotation__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Annotation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Annotation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _AnyType__AnyType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AnyType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AnyType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AnyType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AnyType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AnyType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AnyType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AnyType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AnyType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AnyType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClass__AssociationClass = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClass__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClass__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClass__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClass__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClass__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClass__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClass__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClass__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClass__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClassCallExp__AssociationClassCallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClassCallExp__CallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClassCallExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClassCallExp__FeatureCallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClassCallExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClassCallExp__NavigationCallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClassCallExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClassCallExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClassCallExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociationClassCallExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _AssociativityKind__AssociativityKind = {};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociativityKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociativityKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociativityKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _AssociativityKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _BagType__BagType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _BagType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _BagType__CollectionType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _BagType__DataType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _BagType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _BagType__IterableType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _BagType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _BagType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _BagType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _BagType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _BagType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _BagType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _BagType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Behavior__Behavior = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Behavior__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Behavior__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Behavior__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Behavior__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Behavior__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Behavior__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Behavior__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Behavior__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Behavior__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _BooleanLiteralExp__BooleanLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _BooleanLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _BooleanLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _BooleanLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _BooleanLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _BooleanLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _BooleanLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _BooleanLiteralExp__PrimitiveLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _BooleanLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CallExp__CallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CallExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CallExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CallExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CallExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CallExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CallExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CallOperationAction__CallOperationAction = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CallOperationAction__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CallOperationAction__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CallOperationAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CallOperationAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Class__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Class__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Class__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Class__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Class__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Class__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Class__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Class__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Class__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CollectionItem__CollectionItem = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionItem__CollectionLiteralPart = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionItem__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionItem__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionItem__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionItem__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionItem__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CollectionKind__CollectionKind = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralExp__CollectionLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralPart__CollectionLiteralPart = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralPart__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralPart__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralPart__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralPart__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionLiteralPart__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CollectionRange__CollectionRange = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionRange__CollectionLiteralPart = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionRange__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionRange__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionRange__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionRange__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionRange__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CollectionType__CollectionType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionType__DataType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionType__IterableType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CollectionType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Comment__Comment = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Comment__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Comment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Comment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CompleteClass__CompleteClass = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CompleteClass__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompleteClass__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CompleteClass__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompleteClass__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CompleteEnvironment__CompleteEnvironment = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CompleteEnvironment__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompleteEnvironment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompleteEnvironment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CompleteModel__CompleteModel = {
			PivotTables.Operations._CompleteModel__getOwnedCompletePackage /* getOwnedCompletePackage(String[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompleteModel__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompleteModel__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CompleteModel__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompleteModel__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _CompletePackage__CompletePackage = {
			PivotTables.Operations._CompletePackage__getOwnedCompleteClass /* getOwnedCompleteClass(String[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompletePackage__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompletePackage__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _CompletePackage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _CompletePackage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _ConnectionPointReference__ConnectionPointReference = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ConnectionPointReference__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ConnectionPointReference__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ConnectionPointReference__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ConnectionPointReference__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ConnectionPointReference__Vertex = {};

		private static final @NonNull ExecutorOperation @NonNull [] _Constraint__Constraint = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Constraint__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Constraint__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Constraint__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Constraint__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _DataType__DataType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DataType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DataType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DataType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DataType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DataType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DataType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DataType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DataType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DataType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Detail__Detail = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Detail__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Detail__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Detail__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Detail__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__DynamicBehavior = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__Behavior = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__DynamicElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__DynamicType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicBehavior__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _DynamicElement__DynamicElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicElement__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _DynamicProperty__DynamicProperty = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicProperty__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicProperty__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicProperty__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _DynamicType__DynamicType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicType__DynamicElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _DynamicValueSpecification__DynamicValueSpecification = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicValueSpecification__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicValueSpecification__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicValueSpecification__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicValueSpecification__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicValueSpecification__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _DynamicValueSpecification__ValueSpecification = {
			PivotTables.Operations._ValueSpecification__booleanValue /* booleanValue() */,
			PivotTables.Operations._ValueSpecification__integerValue /* integerValue() */,
			PivotTables.Operations._ValueSpecification__isComputable /* isComputable() */,
			PivotTables.Operations._ValueSpecification__isNull /* isNull() */,
			PivotTables.Operations._ValueSpecification__stringValue /* stringValue() */,
			PivotTables.Operations._ValueSpecification__unlimitedValue /* unlimitedValue() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Element__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Element__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Element__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _ElementExtension__ElementExtension = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ElementExtension__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ElementExtension__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ElementExtension__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ElementExtension__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ElementExtension__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ElementExtension__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ElementExtension__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ElementExtension__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ElementExtension__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _EnumLiteralExp__EnumLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _EnumLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _EnumLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _EnumLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _EnumLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _EnumLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _EnumLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _EnumLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Enumeration__Enumeration = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Enumeration__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Enumeration__DataType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Enumeration__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Enumeration__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Enumeration__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Enumeration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Enumeration__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Enumeration__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Enumeration__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Enumeration__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Enumeration__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _EnumerationLiteral__EnumerationLiteral = {};
		private static final @NonNull ExecutorOperation @NonNull [] _EnumerationLiteral__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _EnumerationLiteral__InstanceSpecification = {};
		private static final @NonNull ExecutorOperation @NonNull [] _EnumerationLiteral__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _EnumerationLiteral__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _EnumerationLiteral__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _ExpressionInOCL__ExpressionInOCL = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ExpressionInOCL__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ExpressionInOCL__LanguageExpression = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ExpressionInOCL__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ExpressionInOCL__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ExpressionInOCL__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ExpressionInOCL__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ExpressionInOCL__ValueSpecification = {
			PivotTables.Operations._ValueSpecification__booleanValue /* booleanValue() */,
			PivotTables.Operations._ValueSpecification__integerValue /* integerValue() */,
			PivotTables.Operations._ValueSpecification__isComputable /* isComputable() */,
			PivotTables.Operations._ValueSpecification__isNull /* isNull() */,
			PivotTables.Operations._ValueSpecification__stringValue /* stringValue() */,
			PivotTables.Operations._ValueSpecification__unlimitedValue /* unlimitedValue() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Feature__Feature = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Feature__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Feature__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Feature__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Feature__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Feature__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _FeatureCallExp__FeatureCallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _FeatureCallExp__CallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _FeatureCallExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _FeatureCallExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _FeatureCallExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _FeatureCallExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _FeatureCallExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _FeatureCallExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _FinalState__FinalState = {};
		private static final @NonNull ExecutorOperation @NonNull [] _FinalState__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _FinalState__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _FinalState__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _FinalState__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _FinalState__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _FinalState__OclState = {};
		private static final @NonNull ExecutorOperation @NonNull [] _FinalState__State = {};
		private static final @NonNull ExecutorOperation @NonNull [] _FinalState__Vertex = {};

		private static final @NonNull ExecutorOperation @NonNull [] _IfExp__IfExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IfExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IfExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IfExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IfExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IfExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IfExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Import__Import = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Import__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Import__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Import__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Import__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _InstanceSpecification__InstanceSpecification = {};
		private static final @NonNull ExecutorOperation @NonNull [] _InstanceSpecification__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _InstanceSpecification__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _InstanceSpecification__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _InstanceSpecification__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _IntegerLiteralExp__IntegerLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IntegerLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IntegerLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IntegerLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IntegerLiteralExp__NumericLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IntegerLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IntegerLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IntegerLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IntegerLiteralExp__PrimitiveLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IntegerLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _InvalidLiteralExp__InvalidLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _InvalidType__InvalidType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _InvalidType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _IterableType__IterableType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IterableType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IterableType__DataType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IterableType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IterableType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IterableType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IterableType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IterableType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IterableType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IterableType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IterableType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _IterateExp__IterateExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IterateExp__CallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IterateExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IterateExp__LoopExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IterateExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IterateExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IterateExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IterateExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IterateExp__ReferringElement = {
			PivotTables.Operations._ReferringElement__getReferredElement /* getReferredElement() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IterateExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Iteration__Iteration = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Iteration__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Iteration__Feature = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Iteration__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Iteration__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Iteration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Iteration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Iteration__Operation = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Iteration__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Iteration__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _IteratorExp__IteratorExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorExp__CallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorExp__LoopExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorExp__ReferringElement = {
			PivotTables.Operations._ReferringElement__getReferredElement /* getReferredElement() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _IteratorVariable__IteratorVariable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorVariable__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorVariable__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorVariable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorVariable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorVariable__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorVariable__Variable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _IteratorVariable__VariableDeclaration = {};

		private static final @NonNull ExecutorOperation @NonNull [] _LambdaType__LambdaType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LambdaType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LambdaType__DataType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LambdaType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LambdaType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LambdaType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LambdaType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LambdaType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LambdaType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LambdaType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LambdaType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _LanguageExpression__LanguageExpression = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LanguageExpression__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LanguageExpression__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LanguageExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LanguageExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LanguageExpression__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LanguageExpression__ValueSpecification = {
			PivotTables.Operations._ValueSpecification__booleanValue /* booleanValue() */,
			PivotTables.Operations._ValueSpecification__integerValue /* integerValue() */,
			PivotTables.Operations._ValueSpecification__isComputable /* isComputable() */,
			PivotTables.Operations._ValueSpecification__isNull /* isNull() */,
			PivotTables.Operations._ValueSpecification__stringValue /* stringValue() */,
			PivotTables.Operations._ValueSpecification__unlimitedValue /* unlimitedValue() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _LetExp__LetExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LetExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LetExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LetExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LetExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LetExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LetExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _LetVariable__LetVariable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LetVariable__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LetVariable__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LetVariable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LetVariable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LetVariable__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LetVariable__Variable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LetVariable__VariableDeclaration = {};

		private static final @NonNull ExecutorOperation @NonNull [] _Library__Library = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Library__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Library__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Library__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Library__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Library__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Library__Package = {};

		private static final @NonNull ExecutorOperation @NonNull [] _LibraryFeature__LibraryFeature = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LibraryFeature__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _LiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _LoopExp__LoopExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LoopExp__CallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LoopExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LoopExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _LoopExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LoopExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LoopExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _LoopExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _MapLiteralExp__MapLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MapLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MapLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MapLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MapLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MapLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MapLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MapLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _MapLiteralPart__MapLiteralPart = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MapLiteralPart__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MapLiteralPart__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MapLiteralPart__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _MapType__MapType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MapType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MapType__DataType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MapType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MapType__IterableType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MapType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MapType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MapType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MapType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MapType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MapType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MapType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _MessageExp__MessageExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _MessageType__MessageType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MessageType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Model__Model = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Model__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Model__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Model__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Model__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Model__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _MorePivotable__MorePivotable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _MorePivotable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _MorePivotable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Nameable__Nameable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Nameable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Nameable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _NamedElement__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NamedElement__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Namespace__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Namespace__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Namespace__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Namespace__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Namespace__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _NavigationCallExp__NavigationCallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NavigationCallExp__CallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NavigationCallExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NavigationCallExp__FeatureCallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NavigationCallExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NavigationCallExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NavigationCallExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NavigationCallExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NavigationCallExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _NullLiteralExp__NullLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NullLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NullLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NullLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NullLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NullLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NullLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NullLiteralExp__PrimitiveLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NullLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _NumericLiteralExp__NumericLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NumericLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NumericLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NumericLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NumericLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NumericLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NumericLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _NumericLiteralExp__PrimitiveLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _NumericLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _OCLExpression__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OCLExpression__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OCLExpression__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OCLExpression__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OCLExpression__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OCLExpression__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Object__Object = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Object__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Operation__Operation = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Operation__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Operation__Feature = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Operation__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Operation__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Operation__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Operation__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Operation__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Operation__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _OperationCallExp__OperationCallExp = {
			PivotTables.Operations._OperationCallExp__hasOclVoidOverload /* hasOclVoidOverload() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OperationCallExp__CallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OperationCallExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OperationCallExp__FeatureCallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OperationCallExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OperationCallExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OperationCallExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OperationCallExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OperationCallExp__ReferringElement = {
			PivotTables.Operations._ReferringElement__getReferredElement /* getReferredElement() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OperationCallExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _OppositePropertyCallExp__OppositePropertyCallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OppositePropertyCallExp__CallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OppositePropertyCallExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OppositePropertyCallExp__FeatureCallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OppositePropertyCallExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OppositePropertyCallExp__NavigationCallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OppositePropertyCallExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OppositePropertyCallExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OppositePropertyCallExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OppositePropertyCallExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__OrderedSetType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__CollectionType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__DataType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__IterableType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OrderedSetType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _OrphanCompletePackage__OrphanCompletePackage = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OrphanCompletePackage__CompletePackage = {
			PivotTables.Operations._CompletePackage__getOwnedCompleteClass /* getOwnedCompleteClass(String[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OrphanCompletePackage__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OrphanCompletePackage__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _OrphanCompletePackage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _OrphanCompletePackage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Package__Package = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Package__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Package__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Package__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Package__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Package__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Parameter__Parameter = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Parameter__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Parameter__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Parameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Parameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Parameter__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Parameter__VariableDeclaration = {};

		private static final @NonNull ExecutorOperation @NonNull [] _ParameterVariable__ParameterVariable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ParameterVariable__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ParameterVariable__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ParameterVariable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ParameterVariable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ParameterVariable__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ParameterVariable__Variable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ParameterVariable__VariableDeclaration = {};

		private static final @NonNull ExecutorOperation @NonNull [] _Pivotable__Pivotable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Pivotable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Pivotable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Precedence__Precedence = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Precedence__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Precedence__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Precedence__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Precedence__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveCompletePackage__PrimitiveCompletePackage = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveCompletePackage__CompletePackage = {
			PivotTables.Operations._CompletePackage__getOwnedCompleteClass /* getOwnedCompleteClass(String[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveCompletePackage__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveCompletePackage__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveCompletePackage__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveCompletePackage__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveLiteralExp__PrimitiveLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveType__PrimitiveType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveType__DataType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PrimitiveType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Profile__Profile = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Profile__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Profile__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Profile__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Profile__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Profile__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Profile__Package = {};

		private static final @NonNull ExecutorOperation @NonNull [] _ProfileApplication__ProfileApplication = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ProfileApplication__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ProfileApplication__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ProfileApplication__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Property__Property = {
			PivotTables.Operations._Property__isAttribute /* isAttribute(Property[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Property__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Property__Feature = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Property__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Property__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Property__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Property__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _PropertyCallExp__PropertyCallExp = {
			PivotTables.Operations._PropertyCallExp__getSpecializedReferredPropertyOwningType /* getSpecializedReferredPropertyOwningType() */,
			PivotTables.Operations._PropertyCallExp__getSpecializedReferredPropertyType /* getSpecializedReferredPropertyType() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PropertyCallExp__CallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PropertyCallExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PropertyCallExp__FeatureCallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PropertyCallExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PropertyCallExp__NavigationCallExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PropertyCallExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PropertyCallExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PropertyCallExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PropertyCallExp__ReferringElement = {
			PivotTables.Operations._ReferringElement__getReferredElement /* getReferredElement() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PropertyCallExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Pseudostate__Pseudostate = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Pseudostate__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Pseudostate__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Pseudostate__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Pseudostate__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Pseudostate__Vertex = {};

		private static final @NonNull ExecutorOperation @NonNull [] _PseudostateKind__PseudostateKind = {};
		private static final @NonNull ExecutorOperation @NonNull [] _PseudostateKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PseudostateKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PseudostateKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _PseudostateKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _RealLiteralExp__RealLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _RealLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _RealLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _RealLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _RealLiteralExp__NumericLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _RealLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _RealLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _RealLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _RealLiteralExp__PrimitiveLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _RealLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _ReferringElement__ReferringElement = {
			PivotTables.Operations._ReferringElement__getReferredElement /* getReferredElement() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ReferringElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ReferringElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Region__Region = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Region__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Region__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Region__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Region__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Region__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _ResultVariable__ResultVariable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ResultVariable__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ResultVariable__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ResultVariable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ResultVariable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ResultVariable__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ResultVariable__Variable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ResultVariable__VariableDeclaration = {};

		private static final @NonNull ExecutorOperation @NonNull [] _SelfType__SelfType = {
			PivotTables.Operations._SelfType__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SelfType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SelfType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SelfType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SelfType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SelfType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SelfType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SelfType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SelfType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SelfType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._SelfType__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _SendSignalAction__SendSignalAction = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SendSignalAction__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SendSignalAction__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SendSignalAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SendSignalAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__SequenceType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__CollectionType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__DataType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__IterableType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SequenceType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _SetType__SetType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SetType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SetType__CollectionType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SetType__DataType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SetType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SetType__IterableType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SetType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SetType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SetType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SetType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SetType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _SetType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _SetType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _ShadowExp__ShadowExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ShadowExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ShadowExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ShadowExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ShadowExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ShadowExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ShadowExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _ShadowPart__ShadowPart = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ShadowPart__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ShadowPart__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ShadowPart__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ShadowPart__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ShadowPart__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Signal__Signal = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Signal__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Signal__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Signal__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Signal__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Signal__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Signal__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Signal__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Signal__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Signal__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Slot__Slot = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Slot__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Slot__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Slot__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _StandardLibrary__StandardLibrary = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StandardLibrary__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StandardLibrary__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StandardLibrary__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _State__State = {};
		private static final @NonNull ExecutorOperation @NonNull [] _State__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _State__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _State__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _State__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _State__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _State__OclState = {};
		private static final @NonNull ExecutorOperation @NonNull [] _State__Vertex = {};

		private static final @NonNull ExecutorOperation @NonNull [] _StateExp__StateExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StateExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StateExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StateExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StateExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StateExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StateExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _StateMachine__StateMachine = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StateMachine__Behavior = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StateMachine__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StateMachine__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StateMachine__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StateMachine__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StateMachine__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StateMachine__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StateMachine__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StateMachine__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StateMachine__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Stereotype__Stereotype = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Stereotype__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Stereotype__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Stereotype__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Stereotype__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Stereotype__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Stereotype__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Stereotype__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Stereotype__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Stereotype__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _StereotypeExtender__StereotypeExtender = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StereotypeExtender__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StereotypeExtender__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StereotypeExtender__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _StringLiteralExp__StringLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StringLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StringLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StringLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StringLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StringLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StringLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _StringLiteralExp__PrimitiveLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _StringLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _TemplateBinding__TemplateBinding = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateBinding__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateBinding__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateBinding__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _TemplateParameter__TemplateParameter = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateParameter__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateParameter__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateParameter__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateParameter__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateParameter__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateParameter__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _TemplateParameterSubstitution__TemplateParameterSubstitution = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateParameterSubstitution__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateParameterSubstitution__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateParameterSubstitution__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _TemplateSignature__TemplateSignature = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateSignature__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateSignature__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateSignature__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _TemplateableElement__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateableElement__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateableElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TemplateableElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Throwable__Throwable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Throwable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Transition__Transition = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Transition__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Transition__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Transition__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Transition__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Transition__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _TransitionKind__TransitionKind = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TransitionKind__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TransitionKind__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TransitionKind__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TransitionKind__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Trigger__Trigger = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Trigger__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Trigger__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Trigger__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Trigger__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralExp__TupleLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralPart__TupleLiteralPart = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralPart__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralPart__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralPart__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralPart__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralPart__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleLiteralPart__VariableDeclaration = {};

		private static final @NonNull ExecutorOperation @NonNull [] _TupleType__TupleType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleType__DataType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TupleType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Type__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Type__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Type__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Type__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Type__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Type__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _TypeExp__TypeExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TypeExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TypeExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TypeExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TypeExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TypeExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TypeExp__ReferringElement = {
			PivotTables.Operations._ReferringElement__getReferredElement /* getReferredElement() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TypeExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _TypedElement__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TypedElement__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TypedElement__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _TypedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _TypedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _UnlimitedNaturalLiteralExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _UnlimitedNaturalLiteralExp__LiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _UnlimitedNaturalLiteralExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _UnlimitedNaturalLiteralExp__NumericLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _UnlimitedNaturalLiteralExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _UnlimitedNaturalLiteralExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _UnlimitedNaturalLiteralExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _UnlimitedNaturalLiteralExp__PrimitiveLiteralExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _UnlimitedNaturalLiteralExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _UnspecifiedValueExp__UnspecifiedValueExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _UnspecifiedValueExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _UnspecifiedValueExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _UnspecifiedValueExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _UnspecifiedValueExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _UnspecifiedValueExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _UnspecifiedValueExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _ValueSpecification__ValueSpecification = {
			PivotTables.Operations._ValueSpecification__booleanValue /* booleanValue() */,
			PivotTables.Operations._ValueSpecification__integerValue /* integerValue() */,
			PivotTables.Operations._ValueSpecification__isComputable /* isComputable() */,
			PivotTables.Operations._ValueSpecification__isNull /* isNull() */,
			PivotTables.Operations._ValueSpecification__stringValue /* stringValue() */,
			PivotTables.Operations._ValueSpecification__unlimitedValue /* unlimitedValue() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ValueSpecification__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ValueSpecification__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _ValueSpecification__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ValueSpecification__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _ValueSpecification__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Variable__Variable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Variable__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Variable__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Variable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Variable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Variable__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Variable__VariableDeclaration = {};

		private static final @NonNull ExecutorOperation @NonNull [] _VariableDeclaration__VariableDeclaration = {};
		private static final @NonNull ExecutorOperation @NonNull [] _VariableDeclaration__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _VariableDeclaration__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _VariableDeclaration__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _VariableDeclaration__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _VariableDeclaration__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _VariableExp__VariableExp = {};
		private static final @NonNull ExecutorOperation @NonNull [] _VariableExp__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _VariableExp__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _VariableExp__OCLExpression = {
			PivotTables.Operations._OCLExpression__isNonNull /* isNonNull() */,
			PivotTables.Operations._OCLExpression__isNull /* isNull() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _VariableExp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _VariableExp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _VariableExp__ReferringElement = {
			PivotTables.Operations._ReferringElement__getReferredElement /* getReferredElement() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _VariableExp__TypedElement = {
			PivotTables.Operations._TypedElement__CompatibleBody /* CompatibleBody(ValueSpecification[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Vertex__Vertex = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Vertex__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Vertex__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Vertex__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Vertex__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _Visitable__Visitable = {};
		private static final @NonNull ExecutorOperation @NonNull [] _Visitable__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _Visitable__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _VoidType__VoidType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _VoidType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _VoidType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _VoidType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _VoidType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _VoidType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _VoidType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _VoidType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _VoidType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _VoidType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		private static final @NonNull ExecutorOperation @NonNull [] _WildcardType__WildcardType = {};
		private static final @NonNull ExecutorOperation @NonNull [] _WildcardType__Class = {};
		private static final @NonNull ExecutorOperation @NonNull [] _WildcardType__Element = {
			PivotTables.Operations._Element__allOwnedElements /* allOwnedElements() */,
			PivotTables.Operations._Element__getValue /* getValue(Type[1],String[1]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _WildcardType__NamedElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _WildcardType__Namespace = {};
		private static final @NonNull ExecutorOperation @NonNull [] _WildcardType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _WildcardType__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _WildcardType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};
		private static final @NonNull ExecutorOperation @NonNull [] _WildcardType__TemplateableElement = {};
		private static final @NonNull ExecutorOperation @NonNull [] _WildcardType__Type = {
			PivotTables.Operations._Type__conformsTo /* conformsTo(Type[?]) */,
			PivotTables.Operations._Type__flattenedType /* flattenedType() */,
			PivotTables.Operations._Type__isClass /* isClass() */,
			PivotTables.Operations._Type__isTemplateParameter /* isTemplateParameter() */,
			PivotTables.Operations._Type__specializeIn /* specializeIn(CallExp[1],Type[1]) */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Annotation__Annotation.initOperations(_Annotation__Annotation);
			Fragments._Annotation__Element.initOperations(_Annotation__Element);
			Fragments._Annotation__NamedElement.initOperations(_Annotation__NamedElement);
			Fragments._Annotation__OclAny.initOperations(_Annotation__OclAny);
			Fragments._Annotation__OclElement.initOperations(_Annotation__OclElement);

			Fragments._AnyType__AnyType.initOperations(_AnyType__AnyType);
			Fragments._AnyType__Class.initOperations(_AnyType__Class);
			Fragments._AnyType__Element.initOperations(_AnyType__Element);
			Fragments._AnyType__NamedElement.initOperations(_AnyType__NamedElement);
			Fragments._AnyType__Namespace.initOperations(_AnyType__Namespace);
			Fragments._AnyType__OclAny.initOperations(_AnyType__OclAny);
			Fragments._AnyType__OclElement.initOperations(_AnyType__OclElement);
			Fragments._AnyType__OclType.initOperations(_AnyType__OclType);
			Fragments._AnyType__TemplateableElement.initOperations(_AnyType__TemplateableElement);
			Fragments._AnyType__Type.initOperations(_AnyType__Type);

			Fragments._AssociationClass__AssociationClass.initOperations(_AssociationClass__AssociationClass);
			Fragments._AssociationClass__Class.initOperations(_AssociationClass__Class);
			Fragments._AssociationClass__Element.initOperations(_AssociationClass__Element);
			Fragments._AssociationClass__NamedElement.initOperations(_AssociationClass__NamedElement);
			Fragments._AssociationClass__Namespace.initOperations(_AssociationClass__Namespace);
			Fragments._AssociationClass__OclAny.initOperations(_AssociationClass__OclAny);
			Fragments._AssociationClass__OclElement.initOperations(_AssociationClass__OclElement);
			Fragments._AssociationClass__OclType.initOperations(_AssociationClass__OclType);
			Fragments._AssociationClass__TemplateableElement.initOperations(_AssociationClass__TemplateableElement);
			Fragments._AssociationClass__Type.initOperations(_AssociationClass__Type);

			Fragments._AssociationClassCallExp__AssociationClassCallExp.initOperations(_AssociationClassCallExp__AssociationClassCallExp);
			Fragments._AssociationClassCallExp__CallExp.initOperations(_AssociationClassCallExp__CallExp);
			Fragments._AssociationClassCallExp__Element.initOperations(_AssociationClassCallExp__Element);
			Fragments._AssociationClassCallExp__FeatureCallExp.initOperations(_AssociationClassCallExp__FeatureCallExp);
			Fragments._AssociationClassCallExp__NamedElement.initOperations(_AssociationClassCallExp__NamedElement);
			Fragments._AssociationClassCallExp__NavigationCallExp.initOperations(_AssociationClassCallExp__NavigationCallExp);
			Fragments._AssociationClassCallExp__OCLExpression.initOperations(_AssociationClassCallExp__OCLExpression);
			Fragments._AssociationClassCallExp__OclAny.initOperations(_AssociationClassCallExp__OclAny);
			Fragments._AssociationClassCallExp__OclElement.initOperations(_AssociationClassCallExp__OclElement);
			Fragments._AssociationClassCallExp__TypedElement.initOperations(_AssociationClassCallExp__TypedElement);

			Fragments._AssociativityKind__AssociativityKind.initOperations(_AssociativityKind__AssociativityKind);
			Fragments._AssociativityKind__OclAny.initOperations(_AssociativityKind__OclAny);
			Fragments._AssociativityKind__OclElement.initOperations(_AssociativityKind__OclElement);
			Fragments._AssociativityKind__OclEnumeration.initOperations(_AssociativityKind__OclEnumeration);
			Fragments._AssociativityKind__OclType.initOperations(_AssociativityKind__OclType);

			Fragments._BagType__BagType.initOperations(_BagType__BagType);
			Fragments._BagType__Class.initOperations(_BagType__Class);
			Fragments._BagType__CollectionType.initOperations(_BagType__CollectionType);
			Fragments._BagType__DataType.initOperations(_BagType__DataType);
			Fragments._BagType__Element.initOperations(_BagType__Element);
			Fragments._BagType__IterableType.initOperations(_BagType__IterableType);
			Fragments._BagType__NamedElement.initOperations(_BagType__NamedElement);
			Fragments._BagType__Namespace.initOperations(_BagType__Namespace);
			Fragments._BagType__OclAny.initOperations(_BagType__OclAny);
			Fragments._BagType__OclElement.initOperations(_BagType__OclElement);
			Fragments._BagType__OclType.initOperations(_BagType__OclType);
			Fragments._BagType__TemplateableElement.initOperations(_BagType__TemplateableElement);
			Fragments._BagType__Type.initOperations(_BagType__Type);

			Fragments._Behavior__Behavior.initOperations(_Behavior__Behavior);
			Fragments._Behavior__Class.initOperations(_Behavior__Class);
			Fragments._Behavior__Element.initOperations(_Behavior__Element);
			Fragments._Behavior__NamedElement.initOperations(_Behavior__NamedElement);
			Fragments._Behavior__Namespace.initOperations(_Behavior__Namespace);
			Fragments._Behavior__OclAny.initOperations(_Behavior__OclAny);
			Fragments._Behavior__OclElement.initOperations(_Behavior__OclElement);
			Fragments._Behavior__OclType.initOperations(_Behavior__OclType);
			Fragments._Behavior__TemplateableElement.initOperations(_Behavior__TemplateableElement);
			Fragments._Behavior__Type.initOperations(_Behavior__Type);

			Fragments._BooleanLiteralExp__BooleanLiteralExp.initOperations(_BooleanLiteralExp__BooleanLiteralExp);
			Fragments._BooleanLiteralExp__Element.initOperations(_BooleanLiteralExp__Element);
			Fragments._BooleanLiteralExp__LiteralExp.initOperations(_BooleanLiteralExp__LiteralExp);
			Fragments._BooleanLiteralExp__NamedElement.initOperations(_BooleanLiteralExp__NamedElement);
			Fragments._BooleanLiteralExp__OCLExpression.initOperations(_BooleanLiteralExp__OCLExpression);
			Fragments._BooleanLiteralExp__OclAny.initOperations(_BooleanLiteralExp__OclAny);
			Fragments._BooleanLiteralExp__OclElement.initOperations(_BooleanLiteralExp__OclElement);
			Fragments._BooleanLiteralExp__PrimitiveLiteralExp.initOperations(_BooleanLiteralExp__PrimitiveLiteralExp);
			Fragments._BooleanLiteralExp__TypedElement.initOperations(_BooleanLiteralExp__TypedElement);

			Fragments._CallExp__CallExp.initOperations(_CallExp__CallExp);
			Fragments._CallExp__Element.initOperations(_CallExp__Element);
			Fragments._CallExp__NamedElement.initOperations(_CallExp__NamedElement);
			Fragments._CallExp__OCLExpression.initOperations(_CallExp__OCLExpression);
			Fragments._CallExp__OclAny.initOperations(_CallExp__OclAny);
			Fragments._CallExp__OclElement.initOperations(_CallExp__OclElement);
			Fragments._CallExp__TypedElement.initOperations(_CallExp__TypedElement);

			Fragments._CallOperationAction__CallOperationAction.initOperations(_CallOperationAction__CallOperationAction);
			Fragments._CallOperationAction__Element.initOperations(_CallOperationAction__Element);
			Fragments._CallOperationAction__NamedElement.initOperations(_CallOperationAction__NamedElement);
			Fragments._CallOperationAction__OclAny.initOperations(_CallOperationAction__OclAny);
			Fragments._CallOperationAction__OclElement.initOperations(_CallOperationAction__OclElement);

			Fragments._Class__Class.initOperations(_Class__Class);
			Fragments._Class__Element.initOperations(_Class__Element);
			Fragments._Class__NamedElement.initOperations(_Class__NamedElement);
			Fragments._Class__Namespace.initOperations(_Class__Namespace);
			Fragments._Class__OclAny.initOperations(_Class__OclAny);
			Fragments._Class__OclElement.initOperations(_Class__OclElement);
			Fragments._Class__OclType.initOperations(_Class__OclType);
			Fragments._Class__TemplateableElement.initOperations(_Class__TemplateableElement);
			Fragments._Class__Type.initOperations(_Class__Type);

			Fragments._CollectionItem__CollectionItem.initOperations(_CollectionItem__CollectionItem);
			Fragments._CollectionItem__CollectionLiteralPart.initOperations(_CollectionItem__CollectionLiteralPart);
			Fragments._CollectionItem__Element.initOperations(_CollectionItem__Element);
			Fragments._CollectionItem__NamedElement.initOperations(_CollectionItem__NamedElement);
			Fragments._CollectionItem__OclAny.initOperations(_CollectionItem__OclAny);
			Fragments._CollectionItem__OclElement.initOperations(_CollectionItem__OclElement);
			Fragments._CollectionItem__TypedElement.initOperations(_CollectionItem__TypedElement);

			Fragments._CollectionKind__CollectionKind.initOperations(_CollectionKind__CollectionKind);
			Fragments._CollectionKind__OclAny.initOperations(_CollectionKind__OclAny);
			Fragments._CollectionKind__OclElement.initOperations(_CollectionKind__OclElement);
			Fragments._CollectionKind__OclEnumeration.initOperations(_CollectionKind__OclEnumeration);
			Fragments._CollectionKind__OclType.initOperations(_CollectionKind__OclType);

			Fragments._CollectionLiteralExp__CollectionLiteralExp.initOperations(_CollectionLiteralExp__CollectionLiteralExp);
			Fragments._CollectionLiteralExp__Element.initOperations(_CollectionLiteralExp__Element);
			Fragments._CollectionLiteralExp__LiteralExp.initOperations(_CollectionLiteralExp__LiteralExp);
			Fragments._CollectionLiteralExp__NamedElement.initOperations(_CollectionLiteralExp__NamedElement);
			Fragments._CollectionLiteralExp__OCLExpression.initOperations(_CollectionLiteralExp__OCLExpression);
			Fragments._CollectionLiteralExp__OclAny.initOperations(_CollectionLiteralExp__OclAny);
			Fragments._CollectionLiteralExp__OclElement.initOperations(_CollectionLiteralExp__OclElement);
			Fragments._CollectionLiteralExp__TypedElement.initOperations(_CollectionLiteralExp__TypedElement);

			Fragments._CollectionLiteralPart__CollectionLiteralPart.initOperations(_CollectionLiteralPart__CollectionLiteralPart);
			Fragments._CollectionLiteralPart__Element.initOperations(_CollectionLiteralPart__Element);
			Fragments._CollectionLiteralPart__NamedElement.initOperations(_CollectionLiteralPart__NamedElement);
			Fragments._CollectionLiteralPart__OclAny.initOperations(_CollectionLiteralPart__OclAny);
			Fragments._CollectionLiteralPart__OclElement.initOperations(_CollectionLiteralPart__OclElement);
			Fragments._CollectionLiteralPart__TypedElement.initOperations(_CollectionLiteralPart__TypedElement);

			Fragments._CollectionRange__CollectionLiteralPart.initOperations(_CollectionRange__CollectionLiteralPart);
			Fragments._CollectionRange__CollectionRange.initOperations(_CollectionRange__CollectionRange);
			Fragments._CollectionRange__Element.initOperations(_CollectionRange__Element);
			Fragments._CollectionRange__NamedElement.initOperations(_CollectionRange__NamedElement);
			Fragments._CollectionRange__OclAny.initOperations(_CollectionRange__OclAny);
			Fragments._CollectionRange__OclElement.initOperations(_CollectionRange__OclElement);
			Fragments._CollectionRange__TypedElement.initOperations(_CollectionRange__TypedElement);

			Fragments._CollectionType__Class.initOperations(_CollectionType__Class);
			Fragments._CollectionType__CollectionType.initOperations(_CollectionType__CollectionType);
			Fragments._CollectionType__DataType.initOperations(_CollectionType__DataType);
			Fragments._CollectionType__Element.initOperations(_CollectionType__Element);
			Fragments._CollectionType__IterableType.initOperations(_CollectionType__IterableType);
			Fragments._CollectionType__NamedElement.initOperations(_CollectionType__NamedElement);
			Fragments._CollectionType__Namespace.initOperations(_CollectionType__Namespace);
			Fragments._CollectionType__OclAny.initOperations(_CollectionType__OclAny);
			Fragments._CollectionType__OclElement.initOperations(_CollectionType__OclElement);
			Fragments._CollectionType__OclType.initOperations(_CollectionType__OclType);
			Fragments._CollectionType__TemplateableElement.initOperations(_CollectionType__TemplateableElement);
			Fragments._CollectionType__Type.initOperations(_CollectionType__Type);

			Fragments._Comment__Comment.initOperations(_Comment__Comment);
			Fragments._Comment__Element.initOperations(_Comment__Element);
			Fragments._Comment__OclAny.initOperations(_Comment__OclAny);
			Fragments._Comment__OclElement.initOperations(_Comment__OclElement);

			Fragments._CompleteClass__CompleteClass.initOperations(_CompleteClass__CompleteClass);
			Fragments._CompleteClass__Element.initOperations(_CompleteClass__Element);
			Fragments._CompleteClass__NamedElement.initOperations(_CompleteClass__NamedElement);
			Fragments._CompleteClass__OclAny.initOperations(_CompleteClass__OclAny);
			Fragments._CompleteClass__OclElement.initOperations(_CompleteClass__OclElement);

			Fragments._CompleteEnvironment__CompleteEnvironment.initOperations(_CompleteEnvironment__CompleteEnvironment);
			Fragments._CompleteEnvironment__Element.initOperations(_CompleteEnvironment__Element);
			Fragments._CompleteEnvironment__OclAny.initOperations(_CompleteEnvironment__OclAny);
			Fragments._CompleteEnvironment__OclElement.initOperations(_CompleteEnvironment__OclElement);

			Fragments._CompleteModel__CompleteModel.initOperations(_CompleteModel__CompleteModel);
			Fragments._CompleteModel__Element.initOperations(_CompleteModel__Element);
			Fragments._CompleteModel__NamedElement.initOperations(_CompleteModel__NamedElement);
			Fragments._CompleteModel__OclAny.initOperations(_CompleteModel__OclAny);
			Fragments._CompleteModel__OclElement.initOperations(_CompleteModel__OclElement);

			Fragments._CompletePackage__CompletePackage.initOperations(_CompletePackage__CompletePackage);
			Fragments._CompletePackage__Element.initOperations(_CompletePackage__Element);
			Fragments._CompletePackage__NamedElement.initOperations(_CompletePackage__NamedElement);
			Fragments._CompletePackage__OclAny.initOperations(_CompletePackage__OclAny);
			Fragments._CompletePackage__OclElement.initOperations(_CompletePackage__OclElement);

			Fragments._ConnectionPointReference__ConnectionPointReference.initOperations(_ConnectionPointReference__ConnectionPointReference);
			Fragments._ConnectionPointReference__Element.initOperations(_ConnectionPointReference__Element);
			Fragments._ConnectionPointReference__NamedElement.initOperations(_ConnectionPointReference__NamedElement);
			Fragments._ConnectionPointReference__OclAny.initOperations(_ConnectionPointReference__OclAny);
			Fragments._ConnectionPointReference__OclElement.initOperations(_ConnectionPointReference__OclElement);
			Fragments._ConnectionPointReference__Vertex.initOperations(_ConnectionPointReference__Vertex);

			Fragments._Constraint__Constraint.initOperations(_Constraint__Constraint);
			Fragments._Constraint__Element.initOperations(_Constraint__Element);
			Fragments._Constraint__NamedElement.initOperations(_Constraint__NamedElement);
			Fragments._Constraint__OclAny.initOperations(_Constraint__OclAny);
			Fragments._Constraint__OclElement.initOperations(_Constraint__OclElement);

			Fragments._DataType__Class.initOperations(_DataType__Class);
			Fragments._DataType__DataType.initOperations(_DataType__DataType);
			Fragments._DataType__Element.initOperations(_DataType__Element);
			Fragments._DataType__NamedElement.initOperations(_DataType__NamedElement);
			Fragments._DataType__Namespace.initOperations(_DataType__Namespace);
			Fragments._DataType__OclAny.initOperations(_DataType__OclAny);
			Fragments._DataType__OclElement.initOperations(_DataType__OclElement);
			Fragments._DataType__OclType.initOperations(_DataType__OclType);
			Fragments._DataType__TemplateableElement.initOperations(_DataType__TemplateableElement);
			Fragments._DataType__Type.initOperations(_DataType__Type);

			Fragments._Detail__Detail.initOperations(_Detail__Detail);
			Fragments._Detail__Element.initOperations(_Detail__Element);
			Fragments._Detail__NamedElement.initOperations(_Detail__NamedElement);
			Fragments._Detail__OclAny.initOperations(_Detail__OclAny);
			Fragments._Detail__OclElement.initOperations(_Detail__OclElement);

			Fragments._DynamicBehavior__Behavior.initOperations(_DynamicBehavior__Behavior);
			Fragments._DynamicBehavior__Class.initOperations(_DynamicBehavior__Class);
			Fragments._DynamicBehavior__DynamicBehavior.initOperations(_DynamicBehavior__DynamicBehavior);
			Fragments._DynamicBehavior__DynamicElement.initOperations(_DynamicBehavior__DynamicElement);
			Fragments._DynamicBehavior__DynamicType.initOperations(_DynamicBehavior__DynamicType);
			Fragments._DynamicBehavior__Element.initOperations(_DynamicBehavior__Element);
			Fragments._DynamicBehavior__NamedElement.initOperations(_DynamicBehavior__NamedElement);
			Fragments._DynamicBehavior__Namespace.initOperations(_DynamicBehavior__Namespace);
			Fragments._DynamicBehavior__OclAny.initOperations(_DynamicBehavior__OclAny);
			Fragments._DynamicBehavior__OclElement.initOperations(_DynamicBehavior__OclElement);
			Fragments._DynamicBehavior__OclType.initOperations(_DynamicBehavior__OclType);
			Fragments._DynamicBehavior__TemplateableElement.initOperations(_DynamicBehavior__TemplateableElement);
			Fragments._DynamicBehavior__Type.initOperations(_DynamicBehavior__Type);

			Fragments._DynamicElement__DynamicElement.initOperations(_DynamicElement__DynamicElement);
			Fragments._DynamicElement__Element.initOperations(_DynamicElement__Element);
			Fragments._DynamicElement__OclAny.initOperations(_DynamicElement__OclAny);
			Fragments._DynamicElement__OclElement.initOperations(_DynamicElement__OclElement);

			Fragments._DynamicProperty__DynamicProperty.initOperations(_DynamicProperty__DynamicProperty);
			Fragments._DynamicProperty__Element.initOperations(_DynamicProperty__Element);
			Fragments._DynamicProperty__OclAny.initOperations(_DynamicProperty__OclAny);
			Fragments._DynamicProperty__OclElement.initOperations(_DynamicProperty__OclElement);

			Fragments._DynamicType__Class.initOperations(_DynamicType__Class);
			Fragments._DynamicType__DynamicElement.initOperations(_DynamicType__DynamicElement);
			Fragments._DynamicType__DynamicType.initOperations(_DynamicType__DynamicType);
			Fragments._DynamicType__Element.initOperations(_DynamicType__Element);
			Fragments._DynamicType__NamedElement.initOperations(_DynamicType__NamedElement);
			Fragments._DynamicType__Namespace.initOperations(_DynamicType__Namespace);
			Fragments._DynamicType__OclAny.initOperations(_DynamicType__OclAny);
			Fragments._DynamicType__OclElement.initOperations(_DynamicType__OclElement);
			Fragments._DynamicType__OclType.initOperations(_DynamicType__OclType);
			Fragments._DynamicType__TemplateableElement.initOperations(_DynamicType__TemplateableElement);
			Fragments._DynamicType__Type.initOperations(_DynamicType__Type);

			Fragments._DynamicValueSpecification__DynamicValueSpecification.initOperations(_DynamicValueSpecification__DynamicValueSpecification);
			Fragments._DynamicValueSpecification__Element.initOperations(_DynamicValueSpecification__Element);
			Fragments._DynamicValueSpecification__NamedElement.initOperations(_DynamicValueSpecification__NamedElement);
			Fragments._DynamicValueSpecification__OclAny.initOperations(_DynamicValueSpecification__OclAny);
			Fragments._DynamicValueSpecification__OclElement.initOperations(_DynamicValueSpecification__OclElement);
			Fragments._DynamicValueSpecification__TypedElement.initOperations(_DynamicValueSpecification__TypedElement);
			Fragments._DynamicValueSpecification__ValueSpecification.initOperations(_DynamicValueSpecification__ValueSpecification);

			Fragments._Element__Element.initOperations(_Element__Element);
			Fragments._Element__OclAny.initOperations(_Element__OclAny);
			Fragments._Element__OclElement.initOperations(_Element__OclElement);

			Fragments._ElementExtension__Class.initOperations(_ElementExtension__Class);
			Fragments._ElementExtension__Element.initOperations(_ElementExtension__Element);
			Fragments._ElementExtension__ElementExtension.initOperations(_ElementExtension__ElementExtension);
			Fragments._ElementExtension__NamedElement.initOperations(_ElementExtension__NamedElement);
			Fragments._ElementExtension__Namespace.initOperations(_ElementExtension__Namespace);
			Fragments._ElementExtension__OclAny.initOperations(_ElementExtension__OclAny);
			Fragments._ElementExtension__OclElement.initOperations(_ElementExtension__OclElement);
			Fragments._ElementExtension__OclType.initOperations(_ElementExtension__OclType);
			Fragments._ElementExtension__TemplateableElement.initOperations(_ElementExtension__TemplateableElement);
			Fragments._ElementExtension__Type.initOperations(_ElementExtension__Type);

			Fragments._EnumLiteralExp__Element.initOperations(_EnumLiteralExp__Element);
			Fragments._EnumLiteralExp__EnumLiteralExp.initOperations(_EnumLiteralExp__EnumLiteralExp);
			Fragments._EnumLiteralExp__LiteralExp.initOperations(_EnumLiteralExp__LiteralExp);
			Fragments._EnumLiteralExp__NamedElement.initOperations(_EnumLiteralExp__NamedElement);
			Fragments._EnumLiteralExp__OCLExpression.initOperations(_EnumLiteralExp__OCLExpression);
			Fragments._EnumLiteralExp__OclAny.initOperations(_EnumLiteralExp__OclAny);
			Fragments._EnumLiteralExp__OclElement.initOperations(_EnumLiteralExp__OclElement);
			Fragments._EnumLiteralExp__TypedElement.initOperations(_EnumLiteralExp__TypedElement);

			Fragments._Enumeration__Class.initOperations(_Enumeration__Class);
			Fragments._Enumeration__DataType.initOperations(_Enumeration__DataType);
			Fragments._Enumeration__Element.initOperations(_Enumeration__Element);
			Fragments._Enumeration__Enumeration.initOperations(_Enumeration__Enumeration);
			Fragments._Enumeration__NamedElement.initOperations(_Enumeration__NamedElement);
			Fragments._Enumeration__Namespace.initOperations(_Enumeration__Namespace);
			Fragments._Enumeration__OclAny.initOperations(_Enumeration__OclAny);
			Fragments._Enumeration__OclElement.initOperations(_Enumeration__OclElement);
			Fragments._Enumeration__OclEnumeration.initOperations(_Enumeration__OclEnumeration);
			Fragments._Enumeration__OclType.initOperations(_Enumeration__OclType);
			Fragments._Enumeration__TemplateableElement.initOperations(_Enumeration__TemplateableElement);
			Fragments._Enumeration__Type.initOperations(_Enumeration__Type);

			Fragments._EnumerationLiteral__Element.initOperations(_EnumerationLiteral__Element);
			Fragments._EnumerationLiteral__EnumerationLiteral.initOperations(_EnumerationLiteral__EnumerationLiteral);
			Fragments._EnumerationLiteral__InstanceSpecification.initOperations(_EnumerationLiteral__InstanceSpecification);
			Fragments._EnumerationLiteral__NamedElement.initOperations(_EnumerationLiteral__NamedElement);
			Fragments._EnumerationLiteral__OclAny.initOperations(_EnumerationLiteral__OclAny);
			Fragments._EnumerationLiteral__OclElement.initOperations(_EnumerationLiteral__OclElement);

			Fragments._ExpressionInOCL__Element.initOperations(_ExpressionInOCL__Element);
			Fragments._ExpressionInOCL__ExpressionInOCL.initOperations(_ExpressionInOCL__ExpressionInOCL);
			Fragments._ExpressionInOCL__LanguageExpression.initOperations(_ExpressionInOCL__LanguageExpression);
			Fragments._ExpressionInOCL__NamedElement.initOperations(_ExpressionInOCL__NamedElement);
			Fragments._ExpressionInOCL__OclAny.initOperations(_ExpressionInOCL__OclAny);
			Fragments._ExpressionInOCL__OclElement.initOperations(_ExpressionInOCL__OclElement);
			Fragments._ExpressionInOCL__TypedElement.initOperations(_ExpressionInOCL__TypedElement);
			Fragments._ExpressionInOCL__ValueSpecification.initOperations(_ExpressionInOCL__ValueSpecification);

			Fragments._Feature__Element.initOperations(_Feature__Element);
			Fragments._Feature__Feature.initOperations(_Feature__Feature);
			Fragments._Feature__NamedElement.initOperations(_Feature__NamedElement);
			Fragments._Feature__OclAny.initOperations(_Feature__OclAny);
			Fragments._Feature__OclElement.initOperations(_Feature__OclElement);
			Fragments._Feature__TypedElement.initOperations(_Feature__TypedElement);

			Fragments._FeatureCallExp__CallExp.initOperations(_FeatureCallExp__CallExp);
			Fragments._FeatureCallExp__Element.initOperations(_FeatureCallExp__Element);
			Fragments._FeatureCallExp__FeatureCallExp.initOperations(_FeatureCallExp__FeatureCallExp);
			Fragments._FeatureCallExp__NamedElement.initOperations(_FeatureCallExp__NamedElement);
			Fragments._FeatureCallExp__OCLExpression.initOperations(_FeatureCallExp__OCLExpression);
			Fragments._FeatureCallExp__OclAny.initOperations(_FeatureCallExp__OclAny);
			Fragments._FeatureCallExp__OclElement.initOperations(_FeatureCallExp__OclElement);
			Fragments._FeatureCallExp__TypedElement.initOperations(_FeatureCallExp__TypedElement);

			Fragments._FinalState__Element.initOperations(_FinalState__Element);
			Fragments._FinalState__FinalState.initOperations(_FinalState__FinalState);
			Fragments._FinalState__NamedElement.initOperations(_FinalState__NamedElement);
			Fragments._FinalState__Namespace.initOperations(_FinalState__Namespace);
			Fragments._FinalState__OclAny.initOperations(_FinalState__OclAny);
			Fragments._FinalState__OclElement.initOperations(_FinalState__OclElement);
			Fragments._FinalState__OclState.initOperations(_FinalState__OclState);
			Fragments._FinalState__State.initOperations(_FinalState__State);
			Fragments._FinalState__Vertex.initOperations(_FinalState__Vertex);

			Fragments._IfExp__Element.initOperations(_IfExp__Element);
			Fragments._IfExp__IfExp.initOperations(_IfExp__IfExp);
			Fragments._IfExp__NamedElement.initOperations(_IfExp__NamedElement);
			Fragments._IfExp__OCLExpression.initOperations(_IfExp__OCLExpression);
			Fragments._IfExp__OclAny.initOperations(_IfExp__OclAny);
			Fragments._IfExp__OclElement.initOperations(_IfExp__OclElement);
			Fragments._IfExp__TypedElement.initOperations(_IfExp__TypedElement);

			Fragments._Import__Element.initOperations(_Import__Element);
			Fragments._Import__Import.initOperations(_Import__Import);
			Fragments._Import__NamedElement.initOperations(_Import__NamedElement);
			Fragments._Import__OclAny.initOperations(_Import__OclAny);
			Fragments._Import__OclElement.initOperations(_Import__OclElement);

			Fragments._InstanceSpecification__Element.initOperations(_InstanceSpecification__Element);
			Fragments._InstanceSpecification__InstanceSpecification.initOperations(_InstanceSpecification__InstanceSpecification);
			Fragments._InstanceSpecification__NamedElement.initOperations(_InstanceSpecification__NamedElement);
			Fragments._InstanceSpecification__OclAny.initOperations(_InstanceSpecification__OclAny);
			Fragments._InstanceSpecification__OclElement.initOperations(_InstanceSpecification__OclElement);

			Fragments._IntegerLiteralExp__Element.initOperations(_IntegerLiteralExp__Element);
			Fragments._IntegerLiteralExp__IntegerLiteralExp.initOperations(_IntegerLiteralExp__IntegerLiteralExp);
			Fragments._IntegerLiteralExp__LiteralExp.initOperations(_IntegerLiteralExp__LiteralExp);
			Fragments._IntegerLiteralExp__NamedElement.initOperations(_IntegerLiteralExp__NamedElement);
			Fragments._IntegerLiteralExp__NumericLiteralExp.initOperations(_IntegerLiteralExp__NumericLiteralExp);
			Fragments._IntegerLiteralExp__OCLExpression.initOperations(_IntegerLiteralExp__OCLExpression);
			Fragments._IntegerLiteralExp__OclAny.initOperations(_IntegerLiteralExp__OclAny);
			Fragments._IntegerLiteralExp__OclElement.initOperations(_IntegerLiteralExp__OclElement);
			Fragments._IntegerLiteralExp__PrimitiveLiteralExp.initOperations(_IntegerLiteralExp__PrimitiveLiteralExp);
			Fragments._IntegerLiteralExp__TypedElement.initOperations(_IntegerLiteralExp__TypedElement);

			Fragments._InvalidLiteralExp__Element.initOperations(_InvalidLiteralExp__Element);
			Fragments._InvalidLiteralExp__InvalidLiteralExp.initOperations(_InvalidLiteralExp__InvalidLiteralExp);
			Fragments._InvalidLiteralExp__LiteralExp.initOperations(_InvalidLiteralExp__LiteralExp);
			Fragments._InvalidLiteralExp__NamedElement.initOperations(_InvalidLiteralExp__NamedElement);
			Fragments._InvalidLiteralExp__OCLExpression.initOperations(_InvalidLiteralExp__OCLExpression);
			Fragments._InvalidLiteralExp__OclAny.initOperations(_InvalidLiteralExp__OclAny);
			Fragments._InvalidLiteralExp__OclElement.initOperations(_InvalidLiteralExp__OclElement);
			Fragments._InvalidLiteralExp__TypedElement.initOperations(_InvalidLiteralExp__TypedElement);

			Fragments._InvalidType__Class.initOperations(_InvalidType__Class);
			Fragments._InvalidType__Element.initOperations(_InvalidType__Element);
			Fragments._InvalidType__InvalidType.initOperations(_InvalidType__InvalidType);
			Fragments._InvalidType__NamedElement.initOperations(_InvalidType__NamedElement);
			Fragments._InvalidType__Namespace.initOperations(_InvalidType__Namespace);
			Fragments._InvalidType__OclAny.initOperations(_InvalidType__OclAny);
			Fragments._InvalidType__OclElement.initOperations(_InvalidType__OclElement);
			Fragments._InvalidType__OclType.initOperations(_InvalidType__OclType);
			Fragments._InvalidType__TemplateableElement.initOperations(_InvalidType__TemplateableElement);
			Fragments._InvalidType__Type.initOperations(_InvalidType__Type);

			Fragments._IterableType__Class.initOperations(_IterableType__Class);
			Fragments._IterableType__DataType.initOperations(_IterableType__DataType);
			Fragments._IterableType__Element.initOperations(_IterableType__Element);
			Fragments._IterableType__IterableType.initOperations(_IterableType__IterableType);
			Fragments._IterableType__NamedElement.initOperations(_IterableType__NamedElement);
			Fragments._IterableType__Namespace.initOperations(_IterableType__Namespace);
			Fragments._IterableType__OclAny.initOperations(_IterableType__OclAny);
			Fragments._IterableType__OclElement.initOperations(_IterableType__OclElement);
			Fragments._IterableType__OclType.initOperations(_IterableType__OclType);
			Fragments._IterableType__TemplateableElement.initOperations(_IterableType__TemplateableElement);
			Fragments._IterableType__Type.initOperations(_IterableType__Type);

			Fragments._IterateExp__CallExp.initOperations(_IterateExp__CallExp);
			Fragments._IterateExp__Element.initOperations(_IterateExp__Element);
			Fragments._IterateExp__IterateExp.initOperations(_IterateExp__IterateExp);
			Fragments._IterateExp__LoopExp.initOperations(_IterateExp__LoopExp);
			Fragments._IterateExp__NamedElement.initOperations(_IterateExp__NamedElement);
			Fragments._IterateExp__OCLExpression.initOperations(_IterateExp__OCLExpression);
			Fragments._IterateExp__OclAny.initOperations(_IterateExp__OclAny);
			Fragments._IterateExp__OclElement.initOperations(_IterateExp__OclElement);
			Fragments._IterateExp__ReferringElement.initOperations(_IterateExp__ReferringElement);
			Fragments._IterateExp__TypedElement.initOperations(_IterateExp__TypedElement);

			Fragments._Iteration__Element.initOperations(_Iteration__Element);
			Fragments._Iteration__Feature.initOperations(_Iteration__Feature);
			Fragments._Iteration__Iteration.initOperations(_Iteration__Iteration);
			Fragments._Iteration__NamedElement.initOperations(_Iteration__NamedElement);
			Fragments._Iteration__Namespace.initOperations(_Iteration__Namespace);
			Fragments._Iteration__OclAny.initOperations(_Iteration__OclAny);
			Fragments._Iteration__OclElement.initOperations(_Iteration__OclElement);
			Fragments._Iteration__Operation.initOperations(_Iteration__Operation);
			Fragments._Iteration__TemplateableElement.initOperations(_Iteration__TemplateableElement);
			Fragments._Iteration__TypedElement.initOperations(_Iteration__TypedElement);

			Fragments._IteratorExp__CallExp.initOperations(_IteratorExp__CallExp);
			Fragments._IteratorExp__Element.initOperations(_IteratorExp__Element);
			Fragments._IteratorExp__IteratorExp.initOperations(_IteratorExp__IteratorExp);
			Fragments._IteratorExp__LoopExp.initOperations(_IteratorExp__LoopExp);
			Fragments._IteratorExp__NamedElement.initOperations(_IteratorExp__NamedElement);
			Fragments._IteratorExp__OCLExpression.initOperations(_IteratorExp__OCLExpression);
			Fragments._IteratorExp__OclAny.initOperations(_IteratorExp__OclAny);
			Fragments._IteratorExp__OclElement.initOperations(_IteratorExp__OclElement);
			Fragments._IteratorExp__ReferringElement.initOperations(_IteratorExp__ReferringElement);
			Fragments._IteratorExp__TypedElement.initOperations(_IteratorExp__TypedElement);

			Fragments._IteratorVariable__Element.initOperations(_IteratorVariable__Element);
			Fragments._IteratorVariable__IteratorVariable.initOperations(_IteratorVariable__IteratorVariable);
			Fragments._IteratorVariable__NamedElement.initOperations(_IteratorVariable__NamedElement);
			Fragments._IteratorVariable__OclAny.initOperations(_IteratorVariable__OclAny);
			Fragments._IteratorVariable__OclElement.initOperations(_IteratorVariable__OclElement);
			Fragments._IteratorVariable__TypedElement.initOperations(_IteratorVariable__TypedElement);
			Fragments._IteratorVariable__Variable.initOperations(_IteratorVariable__Variable);
			Fragments._IteratorVariable__VariableDeclaration.initOperations(_IteratorVariable__VariableDeclaration);

			Fragments._LambdaType__Class.initOperations(_LambdaType__Class);
			Fragments._LambdaType__DataType.initOperations(_LambdaType__DataType);
			Fragments._LambdaType__Element.initOperations(_LambdaType__Element);
			Fragments._LambdaType__LambdaType.initOperations(_LambdaType__LambdaType);
			Fragments._LambdaType__NamedElement.initOperations(_LambdaType__NamedElement);
			Fragments._LambdaType__Namespace.initOperations(_LambdaType__Namespace);
			Fragments._LambdaType__OclAny.initOperations(_LambdaType__OclAny);
			Fragments._LambdaType__OclElement.initOperations(_LambdaType__OclElement);
			Fragments._LambdaType__OclType.initOperations(_LambdaType__OclType);
			Fragments._LambdaType__TemplateableElement.initOperations(_LambdaType__TemplateableElement);
			Fragments._LambdaType__Type.initOperations(_LambdaType__Type);

			Fragments._LanguageExpression__Element.initOperations(_LanguageExpression__Element);
			Fragments._LanguageExpression__LanguageExpression.initOperations(_LanguageExpression__LanguageExpression);
			Fragments._LanguageExpression__NamedElement.initOperations(_LanguageExpression__NamedElement);
			Fragments._LanguageExpression__OclAny.initOperations(_LanguageExpression__OclAny);
			Fragments._LanguageExpression__OclElement.initOperations(_LanguageExpression__OclElement);
			Fragments._LanguageExpression__TypedElement.initOperations(_LanguageExpression__TypedElement);
			Fragments._LanguageExpression__ValueSpecification.initOperations(_LanguageExpression__ValueSpecification);

			Fragments._LetExp__Element.initOperations(_LetExp__Element);
			Fragments._LetExp__LetExp.initOperations(_LetExp__LetExp);
			Fragments._LetExp__NamedElement.initOperations(_LetExp__NamedElement);
			Fragments._LetExp__OCLExpression.initOperations(_LetExp__OCLExpression);
			Fragments._LetExp__OclAny.initOperations(_LetExp__OclAny);
			Fragments._LetExp__OclElement.initOperations(_LetExp__OclElement);
			Fragments._LetExp__TypedElement.initOperations(_LetExp__TypedElement);

			Fragments._LetVariable__Element.initOperations(_LetVariable__Element);
			Fragments._LetVariable__LetVariable.initOperations(_LetVariable__LetVariable);
			Fragments._LetVariable__NamedElement.initOperations(_LetVariable__NamedElement);
			Fragments._LetVariable__OclAny.initOperations(_LetVariable__OclAny);
			Fragments._LetVariable__OclElement.initOperations(_LetVariable__OclElement);
			Fragments._LetVariable__TypedElement.initOperations(_LetVariable__TypedElement);
			Fragments._LetVariable__Variable.initOperations(_LetVariable__Variable);
			Fragments._LetVariable__VariableDeclaration.initOperations(_LetVariable__VariableDeclaration);

			Fragments._Library__Element.initOperations(_Library__Element);
			Fragments._Library__Library.initOperations(_Library__Library);
			Fragments._Library__NamedElement.initOperations(_Library__NamedElement);
			Fragments._Library__Namespace.initOperations(_Library__Namespace);
			Fragments._Library__OclAny.initOperations(_Library__OclAny);
			Fragments._Library__OclElement.initOperations(_Library__OclElement);
			Fragments._Library__Package.initOperations(_Library__Package);

			Fragments._LibraryFeature__LibraryFeature.initOperations(_LibraryFeature__LibraryFeature);
			Fragments._LibraryFeature__OclAny.initOperations(_LibraryFeature__OclAny);

			Fragments._LiteralExp__Element.initOperations(_LiteralExp__Element);
			Fragments._LiteralExp__LiteralExp.initOperations(_LiteralExp__LiteralExp);
			Fragments._LiteralExp__NamedElement.initOperations(_LiteralExp__NamedElement);
			Fragments._LiteralExp__OCLExpression.initOperations(_LiteralExp__OCLExpression);
			Fragments._LiteralExp__OclAny.initOperations(_LiteralExp__OclAny);
			Fragments._LiteralExp__OclElement.initOperations(_LiteralExp__OclElement);
			Fragments._LiteralExp__TypedElement.initOperations(_LiteralExp__TypedElement);

			Fragments._LoopExp__CallExp.initOperations(_LoopExp__CallExp);
			Fragments._LoopExp__Element.initOperations(_LoopExp__Element);
			Fragments._LoopExp__LoopExp.initOperations(_LoopExp__LoopExp);
			Fragments._LoopExp__NamedElement.initOperations(_LoopExp__NamedElement);
			Fragments._LoopExp__OCLExpression.initOperations(_LoopExp__OCLExpression);
			Fragments._LoopExp__OclAny.initOperations(_LoopExp__OclAny);
			Fragments._LoopExp__OclElement.initOperations(_LoopExp__OclElement);
			Fragments._LoopExp__TypedElement.initOperations(_LoopExp__TypedElement);

			Fragments._MapLiteralExp__Element.initOperations(_MapLiteralExp__Element);
			Fragments._MapLiteralExp__LiteralExp.initOperations(_MapLiteralExp__LiteralExp);
			Fragments._MapLiteralExp__MapLiteralExp.initOperations(_MapLiteralExp__MapLiteralExp);
			Fragments._MapLiteralExp__NamedElement.initOperations(_MapLiteralExp__NamedElement);
			Fragments._MapLiteralExp__OCLExpression.initOperations(_MapLiteralExp__OCLExpression);
			Fragments._MapLiteralExp__OclAny.initOperations(_MapLiteralExp__OclAny);
			Fragments._MapLiteralExp__OclElement.initOperations(_MapLiteralExp__OclElement);
			Fragments._MapLiteralExp__TypedElement.initOperations(_MapLiteralExp__TypedElement);

			Fragments._MapLiteralPart__Element.initOperations(_MapLiteralPart__Element);
			Fragments._MapLiteralPart__MapLiteralPart.initOperations(_MapLiteralPart__MapLiteralPart);
			Fragments._MapLiteralPart__OclAny.initOperations(_MapLiteralPart__OclAny);
			Fragments._MapLiteralPart__OclElement.initOperations(_MapLiteralPart__OclElement);

			Fragments._MapType__Class.initOperations(_MapType__Class);
			Fragments._MapType__DataType.initOperations(_MapType__DataType);
			Fragments._MapType__Element.initOperations(_MapType__Element);
			Fragments._MapType__IterableType.initOperations(_MapType__IterableType);
			Fragments._MapType__MapType.initOperations(_MapType__MapType);
			Fragments._MapType__NamedElement.initOperations(_MapType__NamedElement);
			Fragments._MapType__Namespace.initOperations(_MapType__Namespace);
			Fragments._MapType__OclAny.initOperations(_MapType__OclAny);
			Fragments._MapType__OclElement.initOperations(_MapType__OclElement);
			Fragments._MapType__OclType.initOperations(_MapType__OclType);
			Fragments._MapType__TemplateableElement.initOperations(_MapType__TemplateableElement);
			Fragments._MapType__Type.initOperations(_MapType__Type);

			Fragments._MessageExp__Element.initOperations(_MessageExp__Element);
			Fragments._MessageExp__MessageExp.initOperations(_MessageExp__MessageExp);
			Fragments._MessageExp__NamedElement.initOperations(_MessageExp__NamedElement);
			Fragments._MessageExp__OCLExpression.initOperations(_MessageExp__OCLExpression);
			Fragments._MessageExp__OclAny.initOperations(_MessageExp__OclAny);
			Fragments._MessageExp__OclElement.initOperations(_MessageExp__OclElement);
			Fragments._MessageExp__TypedElement.initOperations(_MessageExp__TypedElement);

			Fragments._MessageType__Class.initOperations(_MessageType__Class);
			Fragments._MessageType__Element.initOperations(_MessageType__Element);
			Fragments._MessageType__MessageType.initOperations(_MessageType__MessageType);
			Fragments._MessageType__NamedElement.initOperations(_MessageType__NamedElement);
			Fragments._MessageType__Namespace.initOperations(_MessageType__Namespace);
			Fragments._MessageType__OclAny.initOperations(_MessageType__OclAny);
			Fragments._MessageType__OclElement.initOperations(_MessageType__OclElement);
			Fragments._MessageType__OclType.initOperations(_MessageType__OclType);
			Fragments._MessageType__TemplateableElement.initOperations(_MessageType__TemplateableElement);
			Fragments._MessageType__Type.initOperations(_MessageType__Type);

			Fragments._Model__Element.initOperations(_Model__Element);
			Fragments._Model__Model.initOperations(_Model__Model);
			Fragments._Model__NamedElement.initOperations(_Model__NamedElement);
			Fragments._Model__Namespace.initOperations(_Model__Namespace);
			Fragments._Model__OclAny.initOperations(_Model__OclAny);
			Fragments._Model__OclElement.initOperations(_Model__OclElement);

			Fragments._MorePivotable__MorePivotable.initOperations(_MorePivotable__MorePivotable);
			Fragments._MorePivotable__OclAny.initOperations(_MorePivotable__OclAny);
			Fragments._MorePivotable__OclElement.initOperations(_MorePivotable__OclElement);

			Fragments._Nameable__Nameable.initOperations(_Nameable__Nameable);
			Fragments._Nameable__OclAny.initOperations(_Nameable__OclAny);
			Fragments._Nameable__OclElement.initOperations(_Nameable__OclElement);

			Fragments._NamedElement__Element.initOperations(_NamedElement__Element);
			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Namespace__Element.initOperations(_Namespace__Element);
			Fragments._Namespace__NamedElement.initOperations(_Namespace__NamedElement);
			Fragments._Namespace__Namespace.initOperations(_Namespace__Namespace);
			Fragments._Namespace__OclAny.initOperations(_Namespace__OclAny);
			Fragments._Namespace__OclElement.initOperations(_Namespace__OclElement);

			Fragments._NavigationCallExp__CallExp.initOperations(_NavigationCallExp__CallExp);
			Fragments._NavigationCallExp__Element.initOperations(_NavigationCallExp__Element);
			Fragments._NavigationCallExp__FeatureCallExp.initOperations(_NavigationCallExp__FeatureCallExp);
			Fragments._NavigationCallExp__NamedElement.initOperations(_NavigationCallExp__NamedElement);
			Fragments._NavigationCallExp__NavigationCallExp.initOperations(_NavigationCallExp__NavigationCallExp);
			Fragments._NavigationCallExp__OCLExpression.initOperations(_NavigationCallExp__OCLExpression);
			Fragments._NavigationCallExp__OclAny.initOperations(_NavigationCallExp__OclAny);
			Fragments._NavigationCallExp__OclElement.initOperations(_NavigationCallExp__OclElement);
			Fragments._NavigationCallExp__TypedElement.initOperations(_NavigationCallExp__TypedElement);

			Fragments._NullLiteralExp__Element.initOperations(_NullLiteralExp__Element);
			Fragments._NullLiteralExp__LiteralExp.initOperations(_NullLiteralExp__LiteralExp);
			Fragments._NullLiteralExp__NamedElement.initOperations(_NullLiteralExp__NamedElement);
			Fragments._NullLiteralExp__NullLiteralExp.initOperations(_NullLiteralExp__NullLiteralExp);
			Fragments._NullLiteralExp__OCLExpression.initOperations(_NullLiteralExp__OCLExpression);
			Fragments._NullLiteralExp__OclAny.initOperations(_NullLiteralExp__OclAny);
			Fragments._NullLiteralExp__OclElement.initOperations(_NullLiteralExp__OclElement);
			Fragments._NullLiteralExp__PrimitiveLiteralExp.initOperations(_NullLiteralExp__PrimitiveLiteralExp);
			Fragments._NullLiteralExp__TypedElement.initOperations(_NullLiteralExp__TypedElement);

			Fragments._NumericLiteralExp__Element.initOperations(_NumericLiteralExp__Element);
			Fragments._NumericLiteralExp__LiteralExp.initOperations(_NumericLiteralExp__LiteralExp);
			Fragments._NumericLiteralExp__NamedElement.initOperations(_NumericLiteralExp__NamedElement);
			Fragments._NumericLiteralExp__NumericLiteralExp.initOperations(_NumericLiteralExp__NumericLiteralExp);
			Fragments._NumericLiteralExp__OCLExpression.initOperations(_NumericLiteralExp__OCLExpression);
			Fragments._NumericLiteralExp__OclAny.initOperations(_NumericLiteralExp__OclAny);
			Fragments._NumericLiteralExp__OclElement.initOperations(_NumericLiteralExp__OclElement);
			Fragments._NumericLiteralExp__PrimitiveLiteralExp.initOperations(_NumericLiteralExp__PrimitiveLiteralExp);
			Fragments._NumericLiteralExp__TypedElement.initOperations(_NumericLiteralExp__TypedElement);

			Fragments._OCLExpression__Element.initOperations(_OCLExpression__Element);
			Fragments._OCLExpression__NamedElement.initOperations(_OCLExpression__NamedElement);
			Fragments._OCLExpression__OCLExpression.initOperations(_OCLExpression__OCLExpression);
			Fragments._OCLExpression__OclAny.initOperations(_OCLExpression__OclAny);
			Fragments._OCLExpression__OclElement.initOperations(_OCLExpression__OclElement);
			Fragments._OCLExpression__TypedElement.initOperations(_OCLExpression__TypedElement);

			Fragments._Object__Object.initOperations(_Object__Object);
			Fragments._Object__OclAny.initOperations(_Object__OclAny);

			Fragments._Operation__Element.initOperations(_Operation__Element);
			Fragments._Operation__Feature.initOperations(_Operation__Feature);
			Fragments._Operation__NamedElement.initOperations(_Operation__NamedElement);
			Fragments._Operation__Namespace.initOperations(_Operation__Namespace);
			Fragments._Operation__OclAny.initOperations(_Operation__OclAny);
			Fragments._Operation__OclElement.initOperations(_Operation__OclElement);
			Fragments._Operation__Operation.initOperations(_Operation__Operation);
			Fragments._Operation__TemplateableElement.initOperations(_Operation__TemplateableElement);
			Fragments._Operation__TypedElement.initOperations(_Operation__TypedElement);

			Fragments._OperationCallExp__CallExp.initOperations(_OperationCallExp__CallExp);
			Fragments._OperationCallExp__Element.initOperations(_OperationCallExp__Element);
			Fragments._OperationCallExp__FeatureCallExp.initOperations(_OperationCallExp__FeatureCallExp);
			Fragments._OperationCallExp__NamedElement.initOperations(_OperationCallExp__NamedElement);
			Fragments._OperationCallExp__OCLExpression.initOperations(_OperationCallExp__OCLExpression);
			Fragments._OperationCallExp__OclAny.initOperations(_OperationCallExp__OclAny);
			Fragments._OperationCallExp__OclElement.initOperations(_OperationCallExp__OclElement);
			Fragments._OperationCallExp__OperationCallExp.initOperations(_OperationCallExp__OperationCallExp);
			Fragments._OperationCallExp__ReferringElement.initOperations(_OperationCallExp__ReferringElement);
			Fragments._OperationCallExp__TypedElement.initOperations(_OperationCallExp__TypedElement);

			Fragments._OppositePropertyCallExp__CallExp.initOperations(_OppositePropertyCallExp__CallExp);
			Fragments._OppositePropertyCallExp__Element.initOperations(_OppositePropertyCallExp__Element);
			Fragments._OppositePropertyCallExp__FeatureCallExp.initOperations(_OppositePropertyCallExp__FeatureCallExp);
			Fragments._OppositePropertyCallExp__NamedElement.initOperations(_OppositePropertyCallExp__NamedElement);
			Fragments._OppositePropertyCallExp__NavigationCallExp.initOperations(_OppositePropertyCallExp__NavigationCallExp);
			Fragments._OppositePropertyCallExp__OCLExpression.initOperations(_OppositePropertyCallExp__OCLExpression);
			Fragments._OppositePropertyCallExp__OclAny.initOperations(_OppositePropertyCallExp__OclAny);
			Fragments._OppositePropertyCallExp__OclElement.initOperations(_OppositePropertyCallExp__OclElement);
			Fragments._OppositePropertyCallExp__OppositePropertyCallExp.initOperations(_OppositePropertyCallExp__OppositePropertyCallExp);
			Fragments._OppositePropertyCallExp__TypedElement.initOperations(_OppositePropertyCallExp__TypedElement);

			Fragments._OrderedSetType__Class.initOperations(_OrderedSetType__Class);
			Fragments._OrderedSetType__CollectionType.initOperations(_OrderedSetType__CollectionType);
			Fragments._OrderedSetType__DataType.initOperations(_OrderedSetType__DataType);
			Fragments._OrderedSetType__Element.initOperations(_OrderedSetType__Element);
			Fragments._OrderedSetType__IterableType.initOperations(_OrderedSetType__IterableType);
			Fragments._OrderedSetType__NamedElement.initOperations(_OrderedSetType__NamedElement);
			Fragments._OrderedSetType__Namespace.initOperations(_OrderedSetType__Namespace);
			Fragments._OrderedSetType__OclAny.initOperations(_OrderedSetType__OclAny);
			Fragments._OrderedSetType__OclElement.initOperations(_OrderedSetType__OclElement);
			Fragments._OrderedSetType__OclType.initOperations(_OrderedSetType__OclType);
			Fragments._OrderedSetType__OrderedSetType.initOperations(_OrderedSetType__OrderedSetType);
			Fragments._OrderedSetType__TemplateableElement.initOperations(_OrderedSetType__TemplateableElement);
			Fragments._OrderedSetType__Type.initOperations(_OrderedSetType__Type);

			Fragments._OrphanCompletePackage__CompletePackage.initOperations(_OrphanCompletePackage__CompletePackage);
			Fragments._OrphanCompletePackage__Element.initOperations(_OrphanCompletePackage__Element);
			Fragments._OrphanCompletePackage__NamedElement.initOperations(_OrphanCompletePackage__NamedElement);
			Fragments._OrphanCompletePackage__OclAny.initOperations(_OrphanCompletePackage__OclAny);
			Fragments._OrphanCompletePackage__OclElement.initOperations(_OrphanCompletePackage__OclElement);
			Fragments._OrphanCompletePackage__OrphanCompletePackage.initOperations(_OrphanCompletePackage__OrphanCompletePackage);

			Fragments._Package__Element.initOperations(_Package__Element);
			Fragments._Package__NamedElement.initOperations(_Package__NamedElement);
			Fragments._Package__Namespace.initOperations(_Package__Namespace);
			Fragments._Package__OclAny.initOperations(_Package__OclAny);
			Fragments._Package__OclElement.initOperations(_Package__OclElement);
			Fragments._Package__Package.initOperations(_Package__Package);

			Fragments._Parameter__Element.initOperations(_Parameter__Element);
			Fragments._Parameter__NamedElement.initOperations(_Parameter__NamedElement);
			Fragments._Parameter__OclAny.initOperations(_Parameter__OclAny);
			Fragments._Parameter__OclElement.initOperations(_Parameter__OclElement);
			Fragments._Parameter__Parameter.initOperations(_Parameter__Parameter);
			Fragments._Parameter__TypedElement.initOperations(_Parameter__TypedElement);
			Fragments._Parameter__VariableDeclaration.initOperations(_Parameter__VariableDeclaration);

			Fragments._ParameterVariable__Element.initOperations(_ParameterVariable__Element);
			Fragments._ParameterVariable__NamedElement.initOperations(_ParameterVariable__NamedElement);
			Fragments._ParameterVariable__OclAny.initOperations(_ParameterVariable__OclAny);
			Fragments._ParameterVariable__OclElement.initOperations(_ParameterVariable__OclElement);
			Fragments._ParameterVariable__ParameterVariable.initOperations(_ParameterVariable__ParameterVariable);
			Fragments._ParameterVariable__TypedElement.initOperations(_ParameterVariable__TypedElement);
			Fragments._ParameterVariable__Variable.initOperations(_ParameterVariable__Variable);
			Fragments._ParameterVariable__VariableDeclaration.initOperations(_ParameterVariable__VariableDeclaration);

			Fragments._Pivotable__OclAny.initOperations(_Pivotable__OclAny);
			Fragments._Pivotable__OclElement.initOperations(_Pivotable__OclElement);
			Fragments._Pivotable__Pivotable.initOperations(_Pivotable__Pivotable);

			Fragments._Precedence__Element.initOperations(_Precedence__Element);
			Fragments._Precedence__NamedElement.initOperations(_Precedence__NamedElement);
			Fragments._Precedence__OclAny.initOperations(_Precedence__OclAny);
			Fragments._Precedence__OclElement.initOperations(_Precedence__OclElement);
			Fragments._Precedence__Precedence.initOperations(_Precedence__Precedence);

			Fragments._PrimitiveCompletePackage__CompletePackage.initOperations(_PrimitiveCompletePackage__CompletePackage);
			Fragments._PrimitiveCompletePackage__Element.initOperations(_PrimitiveCompletePackage__Element);
			Fragments._PrimitiveCompletePackage__NamedElement.initOperations(_PrimitiveCompletePackage__NamedElement);
			Fragments._PrimitiveCompletePackage__OclAny.initOperations(_PrimitiveCompletePackage__OclAny);
			Fragments._PrimitiveCompletePackage__OclElement.initOperations(_PrimitiveCompletePackage__OclElement);
			Fragments._PrimitiveCompletePackage__PrimitiveCompletePackage.initOperations(_PrimitiveCompletePackage__PrimitiveCompletePackage);

			Fragments._PrimitiveLiteralExp__Element.initOperations(_PrimitiveLiteralExp__Element);
			Fragments._PrimitiveLiteralExp__LiteralExp.initOperations(_PrimitiveLiteralExp__LiteralExp);
			Fragments._PrimitiveLiteralExp__NamedElement.initOperations(_PrimitiveLiteralExp__NamedElement);
			Fragments._PrimitiveLiteralExp__OCLExpression.initOperations(_PrimitiveLiteralExp__OCLExpression);
			Fragments._PrimitiveLiteralExp__OclAny.initOperations(_PrimitiveLiteralExp__OclAny);
			Fragments._PrimitiveLiteralExp__OclElement.initOperations(_PrimitiveLiteralExp__OclElement);
			Fragments._PrimitiveLiteralExp__PrimitiveLiteralExp.initOperations(_PrimitiveLiteralExp__PrimitiveLiteralExp);
			Fragments._PrimitiveLiteralExp__TypedElement.initOperations(_PrimitiveLiteralExp__TypedElement);

			Fragments._PrimitiveType__Class.initOperations(_PrimitiveType__Class);
			Fragments._PrimitiveType__DataType.initOperations(_PrimitiveType__DataType);
			Fragments._PrimitiveType__Element.initOperations(_PrimitiveType__Element);
			Fragments._PrimitiveType__NamedElement.initOperations(_PrimitiveType__NamedElement);
			Fragments._PrimitiveType__Namespace.initOperations(_PrimitiveType__Namespace);
			Fragments._PrimitiveType__OclAny.initOperations(_PrimitiveType__OclAny);
			Fragments._PrimitiveType__OclElement.initOperations(_PrimitiveType__OclElement);
			Fragments._PrimitiveType__OclType.initOperations(_PrimitiveType__OclType);
			Fragments._PrimitiveType__PrimitiveType.initOperations(_PrimitiveType__PrimitiveType);
			Fragments._PrimitiveType__TemplateableElement.initOperations(_PrimitiveType__TemplateableElement);
			Fragments._PrimitiveType__Type.initOperations(_PrimitiveType__Type);

			Fragments._Profile__Element.initOperations(_Profile__Element);
			Fragments._Profile__NamedElement.initOperations(_Profile__NamedElement);
			Fragments._Profile__Namespace.initOperations(_Profile__Namespace);
			Fragments._Profile__OclAny.initOperations(_Profile__OclAny);
			Fragments._Profile__OclElement.initOperations(_Profile__OclElement);
			Fragments._Profile__Package.initOperations(_Profile__Package);
			Fragments._Profile__Profile.initOperations(_Profile__Profile);

			Fragments._ProfileApplication__Element.initOperations(_ProfileApplication__Element);
			Fragments._ProfileApplication__OclAny.initOperations(_ProfileApplication__OclAny);
			Fragments._ProfileApplication__OclElement.initOperations(_ProfileApplication__OclElement);
			Fragments._ProfileApplication__ProfileApplication.initOperations(_ProfileApplication__ProfileApplication);

			Fragments._Property__Element.initOperations(_Property__Element);
			Fragments._Property__Feature.initOperations(_Property__Feature);
			Fragments._Property__NamedElement.initOperations(_Property__NamedElement);
			Fragments._Property__OclAny.initOperations(_Property__OclAny);
			Fragments._Property__OclElement.initOperations(_Property__OclElement);
			Fragments._Property__Property.initOperations(_Property__Property);
			Fragments._Property__TypedElement.initOperations(_Property__TypedElement);

			Fragments._PropertyCallExp__CallExp.initOperations(_PropertyCallExp__CallExp);
			Fragments._PropertyCallExp__Element.initOperations(_PropertyCallExp__Element);
			Fragments._PropertyCallExp__FeatureCallExp.initOperations(_PropertyCallExp__FeatureCallExp);
			Fragments._PropertyCallExp__NamedElement.initOperations(_PropertyCallExp__NamedElement);
			Fragments._PropertyCallExp__NavigationCallExp.initOperations(_PropertyCallExp__NavigationCallExp);
			Fragments._PropertyCallExp__OCLExpression.initOperations(_PropertyCallExp__OCLExpression);
			Fragments._PropertyCallExp__OclAny.initOperations(_PropertyCallExp__OclAny);
			Fragments._PropertyCallExp__OclElement.initOperations(_PropertyCallExp__OclElement);
			Fragments._PropertyCallExp__PropertyCallExp.initOperations(_PropertyCallExp__PropertyCallExp);
			Fragments._PropertyCallExp__ReferringElement.initOperations(_PropertyCallExp__ReferringElement);
			Fragments._PropertyCallExp__TypedElement.initOperations(_PropertyCallExp__TypedElement);

			Fragments._Pseudostate__Element.initOperations(_Pseudostate__Element);
			Fragments._Pseudostate__NamedElement.initOperations(_Pseudostate__NamedElement);
			Fragments._Pseudostate__OclAny.initOperations(_Pseudostate__OclAny);
			Fragments._Pseudostate__OclElement.initOperations(_Pseudostate__OclElement);
			Fragments._Pseudostate__Pseudostate.initOperations(_Pseudostate__Pseudostate);
			Fragments._Pseudostate__Vertex.initOperations(_Pseudostate__Vertex);

			Fragments._PseudostateKind__OclAny.initOperations(_PseudostateKind__OclAny);
			Fragments._PseudostateKind__OclElement.initOperations(_PseudostateKind__OclElement);
			Fragments._PseudostateKind__OclEnumeration.initOperations(_PseudostateKind__OclEnumeration);
			Fragments._PseudostateKind__OclType.initOperations(_PseudostateKind__OclType);
			Fragments._PseudostateKind__PseudostateKind.initOperations(_PseudostateKind__PseudostateKind);

			Fragments._RealLiteralExp__Element.initOperations(_RealLiteralExp__Element);
			Fragments._RealLiteralExp__LiteralExp.initOperations(_RealLiteralExp__LiteralExp);
			Fragments._RealLiteralExp__NamedElement.initOperations(_RealLiteralExp__NamedElement);
			Fragments._RealLiteralExp__NumericLiteralExp.initOperations(_RealLiteralExp__NumericLiteralExp);
			Fragments._RealLiteralExp__OCLExpression.initOperations(_RealLiteralExp__OCLExpression);
			Fragments._RealLiteralExp__OclAny.initOperations(_RealLiteralExp__OclAny);
			Fragments._RealLiteralExp__OclElement.initOperations(_RealLiteralExp__OclElement);
			Fragments._RealLiteralExp__PrimitiveLiteralExp.initOperations(_RealLiteralExp__PrimitiveLiteralExp);
			Fragments._RealLiteralExp__RealLiteralExp.initOperations(_RealLiteralExp__RealLiteralExp);
			Fragments._RealLiteralExp__TypedElement.initOperations(_RealLiteralExp__TypedElement);

			Fragments._ReferringElement__OclAny.initOperations(_ReferringElement__OclAny);
			Fragments._ReferringElement__OclElement.initOperations(_ReferringElement__OclElement);
			Fragments._ReferringElement__ReferringElement.initOperations(_ReferringElement__ReferringElement);

			Fragments._Region__Element.initOperations(_Region__Element);
			Fragments._Region__NamedElement.initOperations(_Region__NamedElement);
			Fragments._Region__Namespace.initOperations(_Region__Namespace);
			Fragments._Region__OclAny.initOperations(_Region__OclAny);
			Fragments._Region__OclElement.initOperations(_Region__OclElement);
			Fragments._Region__Region.initOperations(_Region__Region);

			Fragments._ResultVariable__Element.initOperations(_ResultVariable__Element);
			Fragments._ResultVariable__NamedElement.initOperations(_ResultVariable__NamedElement);
			Fragments._ResultVariable__OclAny.initOperations(_ResultVariable__OclAny);
			Fragments._ResultVariable__OclElement.initOperations(_ResultVariable__OclElement);
			Fragments._ResultVariable__ResultVariable.initOperations(_ResultVariable__ResultVariable);
			Fragments._ResultVariable__TypedElement.initOperations(_ResultVariable__TypedElement);
			Fragments._ResultVariable__Variable.initOperations(_ResultVariable__Variable);
			Fragments._ResultVariable__VariableDeclaration.initOperations(_ResultVariable__VariableDeclaration);

			Fragments._SelfType__Class.initOperations(_SelfType__Class);
			Fragments._SelfType__Element.initOperations(_SelfType__Element);
			Fragments._SelfType__NamedElement.initOperations(_SelfType__NamedElement);
			Fragments._SelfType__Namespace.initOperations(_SelfType__Namespace);
			Fragments._SelfType__OclAny.initOperations(_SelfType__OclAny);
			Fragments._SelfType__OclElement.initOperations(_SelfType__OclElement);
			Fragments._SelfType__OclType.initOperations(_SelfType__OclType);
			Fragments._SelfType__SelfType.initOperations(_SelfType__SelfType);
			Fragments._SelfType__TemplateableElement.initOperations(_SelfType__TemplateableElement);
			Fragments._SelfType__Type.initOperations(_SelfType__Type);

			Fragments._SendSignalAction__Element.initOperations(_SendSignalAction__Element);
			Fragments._SendSignalAction__NamedElement.initOperations(_SendSignalAction__NamedElement);
			Fragments._SendSignalAction__OclAny.initOperations(_SendSignalAction__OclAny);
			Fragments._SendSignalAction__OclElement.initOperations(_SendSignalAction__OclElement);
			Fragments._SendSignalAction__SendSignalAction.initOperations(_SendSignalAction__SendSignalAction);

			Fragments._SequenceType__Class.initOperations(_SequenceType__Class);
			Fragments._SequenceType__CollectionType.initOperations(_SequenceType__CollectionType);
			Fragments._SequenceType__DataType.initOperations(_SequenceType__DataType);
			Fragments._SequenceType__Element.initOperations(_SequenceType__Element);
			Fragments._SequenceType__IterableType.initOperations(_SequenceType__IterableType);
			Fragments._SequenceType__NamedElement.initOperations(_SequenceType__NamedElement);
			Fragments._SequenceType__Namespace.initOperations(_SequenceType__Namespace);
			Fragments._SequenceType__OclAny.initOperations(_SequenceType__OclAny);
			Fragments._SequenceType__OclElement.initOperations(_SequenceType__OclElement);
			Fragments._SequenceType__OclType.initOperations(_SequenceType__OclType);
			Fragments._SequenceType__SequenceType.initOperations(_SequenceType__SequenceType);
			Fragments._SequenceType__TemplateableElement.initOperations(_SequenceType__TemplateableElement);
			Fragments._SequenceType__Type.initOperations(_SequenceType__Type);

			Fragments._SetType__Class.initOperations(_SetType__Class);
			Fragments._SetType__CollectionType.initOperations(_SetType__CollectionType);
			Fragments._SetType__DataType.initOperations(_SetType__DataType);
			Fragments._SetType__Element.initOperations(_SetType__Element);
			Fragments._SetType__IterableType.initOperations(_SetType__IterableType);
			Fragments._SetType__NamedElement.initOperations(_SetType__NamedElement);
			Fragments._SetType__Namespace.initOperations(_SetType__Namespace);
			Fragments._SetType__OclAny.initOperations(_SetType__OclAny);
			Fragments._SetType__OclElement.initOperations(_SetType__OclElement);
			Fragments._SetType__OclType.initOperations(_SetType__OclType);
			Fragments._SetType__SetType.initOperations(_SetType__SetType);
			Fragments._SetType__TemplateableElement.initOperations(_SetType__TemplateableElement);
			Fragments._SetType__Type.initOperations(_SetType__Type);

			Fragments._ShadowExp__Element.initOperations(_ShadowExp__Element);
			Fragments._ShadowExp__NamedElement.initOperations(_ShadowExp__NamedElement);
			Fragments._ShadowExp__OCLExpression.initOperations(_ShadowExp__OCLExpression);
			Fragments._ShadowExp__OclAny.initOperations(_ShadowExp__OclAny);
			Fragments._ShadowExp__OclElement.initOperations(_ShadowExp__OclElement);
			Fragments._ShadowExp__ShadowExp.initOperations(_ShadowExp__ShadowExp);
			Fragments._ShadowExp__TypedElement.initOperations(_ShadowExp__TypedElement);

			Fragments._ShadowPart__Element.initOperations(_ShadowPart__Element);
			Fragments._ShadowPart__NamedElement.initOperations(_ShadowPart__NamedElement);
			Fragments._ShadowPart__OclAny.initOperations(_ShadowPart__OclAny);
			Fragments._ShadowPart__OclElement.initOperations(_ShadowPart__OclElement);
			Fragments._ShadowPart__ShadowPart.initOperations(_ShadowPart__ShadowPart);
			Fragments._ShadowPart__TypedElement.initOperations(_ShadowPart__TypedElement);

			Fragments._Signal__Class.initOperations(_Signal__Class);
			Fragments._Signal__Element.initOperations(_Signal__Element);
			Fragments._Signal__NamedElement.initOperations(_Signal__NamedElement);
			Fragments._Signal__Namespace.initOperations(_Signal__Namespace);
			Fragments._Signal__OclAny.initOperations(_Signal__OclAny);
			Fragments._Signal__OclElement.initOperations(_Signal__OclElement);
			Fragments._Signal__OclType.initOperations(_Signal__OclType);
			Fragments._Signal__Signal.initOperations(_Signal__Signal);
			Fragments._Signal__TemplateableElement.initOperations(_Signal__TemplateableElement);
			Fragments._Signal__Type.initOperations(_Signal__Type);

			Fragments._Slot__Element.initOperations(_Slot__Element);
			Fragments._Slot__OclAny.initOperations(_Slot__OclAny);
			Fragments._Slot__OclElement.initOperations(_Slot__OclElement);
			Fragments._Slot__Slot.initOperations(_Slot__Slot);

			Fragments._StandardLibrary__Element.initOperations(_StandardLibrary__Element);
			Fragments._StandardLibrary__OclAny.initOperations(_StandardLibrary__OclAny);
			Fragments._StandardLibrary__OclElement.initOperations(_StandardLibrary__OclElement);
			Fragments._StandardLibrary__StandardLibrary.initOperations(_StandardLibrary__StandardLibrary);

			Fragments._State__Element.initOperations(_State__Element);
			Fragments._State__NamedElement.initOperations(_State__NamedElement);
			Fragments._State__Namespace.initOperations(_State__Namespace);
			Fragments._State__OclAny.initOperations(_State__OclAny);
			Fragments._State__OclElement.initOperations(_State__OclElement);
			Fragments._State__OclState.initOperations(_State__OclState);
			Fragments._State__State.initOperations(_State__State);
			Fragments._State__Vertex.initOperations(_State__Vertex);

			Fragments._StateExp__Element.initOperations(_StateExp__Element);
			Fragments._StateExp__NamedElement.initOperations(_StateExp__NamedElement);
			Fragments._StateExp__OCLExpression.initOperations(_StateExp__OCLExpression);
			Fragments._StateExp__OclAny.initOperations(_StateExp__OclAny);
			Fragments._StateExp__OclElement.initOperations(_StateExp__OclElement);
			Fragments._StateExp__StateExp.initOperations(_StateExp__StateExp);
			Fragments._StateExp__TypedElement.initOperations(_StateExp__TypedElement);

			Fragments._StateMachine__Behavior.initOperations(_StateMachine__Behavior);
			Fragments._StateMachine__Class.initOperations(_StateMachine__Class);
			Fragments._StateMachine__Element.initOperations(_StateMachine__Element);
			Fragments._StateMachine__NamedElement.initOperations(_StateMachine__NamedElement);
			Fragments._StateMachine__Namespace.initOperations(_StateMachine__Namespace);
			Fragments._StateMachine__OclAny.initOperations(_StateMachine__OclAny);
			Fragments._StateMachine__OclElement.initOperations(_StateMachine__OclElement);
			Fragments._StateMachine__OclType.initOperations(_StateMachine__OclType);
			Fragments._StateMachine__StateMachine.initOperations(_StateMachine__StateMachine);
			Fragments._StateMachine__TemplateableElement.initOperations(_StateMachine__TemplateableElement);
			Fragments._StateMachine__Type.initOperations(_StateMachine__Type);

			Fragments._Stereotype__Class.initOperations(_Stereotype__Class);
			Fragments._Stereotype__Element.initOperations(_Stereotype__Element);
			Fragments._Stereotype__NamedElement.initOperations(_Stereotype__NamedElement);
			Fragments._Stereotype__Namespace.initOperations(_Stereotype__Namespace);
			Fragments._Stereotype__OclAny.initOperations(_Stereotype__OclAny);
			Fragments._Stereotype__OclElement.initOperations(_Stereotype__OclElement);
			Fragments._Stereotype__OclType.initOperations(_Stereotype__OclType);
			Fragments._Stereotype__Stereotype.initOperations(_Stereotype__Stereotype);
			Fragments._Stereotype__TemplateableElement.initOperations(_Stereotype__TemplateableElement);
			Fragments._Stereotype__Type.initOperations(_Stereotype__Type);

			Fragments._StereotypeExtender__Element.initOperations(_StereotypeExtender__Element);
			Fragments._StereotypeExtender__OclAny.initOperations(_StereotypeExtender__OclAny);
			Fragments._StereotypeExtender__OclElement.initOperations(_StereotypeExtender__OclElement);
			Fragments._StereotypeExtender__StereotypeExtender.initOperations(_StereotypeExtender__StereotypeExtender);

			Fragments._StringLiteralExp__Element.initOperations(_StringLiteralExp__Element);
			Fragments._StringLiteralExp__LiteralExp.initOperations(_StringLiteralExp__LiteralExp);
			Fragments._StringLiteralExp__NamedElement.initOperations(_StringLiteralExp__NamedElement);
			Fragments._StringLiteralExp__OCLExpression.initOperations(_StringLiteralExp__OCLExpression);
			Fragments._StringLiteralExp__OclAny.initOperations(_StringLiteralExp__OclAny);
			Fragments._StringLiteralExp__OclElement.initOperations(_StringLiteralExp__OclElement);
			Fragments._StringLiteralExp__PrimitiveLiteralExp.initOperations(_StringLiteralExp__PrimitiveLiteralExp);
			Fragments._StringLiteralExp__StringLiteralExp.initOperations(_StringLiteralExp__StringLiteralExp);
			Fragments._StringLiteralExp__TypedElement.initOperations(_StringLiteralExp__TypedElement);

			Fragments._TemplateBinding__Element.initOperations(_TemplateBinding__Element);
			Fragments._TemplateBinding__OclAny.initOperations(_TemplateBinding__OclAny);
			Fragments._TemplateBinding__OclElement.initOperations(_TemplateBinding__OclElement);
			Fragments._TemplateBinding__TemplateBinding.initOperations(_TemplateBinding__TemplateBinding);

			Fragments._TemplateParameter__Element.initOperations(_TemplateParameter__Element);
			Fragments._TemplateParameter__NamedElement.initOperations(_TemplateParameter__NamedElement);
			Fragments._TemplateParameter__OclAny.initOperations(_TemplateParameter__OclAny);
			Fragments._TemplateParameter__OclElement.initOperations(_TemplateParameter__OclElement);
			Fragments._TemplateParameter__OclType.initOperations(_TemplateParameter__OclType);
			Fragments._TemplateParameter__TemplateParameter.initOperations(_TemplateParameter__TemplateParameter);
			Fragments._TemplateParameter__Type.initOperations(_TemplateParameter__Type);

			Fragments._TemplateParameterSubstitution__Element.initOperations(_TemplateParameterSubstitution__Element);
			Fragments._TemplateParameterSubstitution__OclAny.initOperations(_TemplateParameterSubstitution__OclAny);
			Fragments._TemplateParameterSubstitution__OclElement.initOperations(_TemplateParameterSubstitution__OclElement);
			Fragments._TemplateParameterSubstitution__TemplateParameterSubstitution.initOperations(_TemplateParameterSubstitution__TemplateParameterSubstitution);

			Fragments._TemplateSignature__Element.initOperations(_TemplateSignature__Element);
			Fragments._TemplateSignature__OclAny.initOperations(_TemplateSignature__OclAny);
			Fragments._TemplateSignature__OclElement.initOperations(_TemplateSignature__OclElement);
			Fragments._TemplateSignature__TemplateSignature.initOperations(_TemplateSignature__TemplateSignature);

			Fragments._TemplateableElement__Element.initOperations(_TemplateableElement__Element);
			Fragments._TemplateableElement__OclAny.initOperations(_TemplateableElement__OclAny);
			Fragments._TemplateableElement__OclElement.initOperations(_TemplateableElement__OclElement);
			Fragments._TemplateableElement__TemplateableElement.initOperations(_TemplateableElement__TemplateableElement);

			Fragments._Throwable__OclAny.initOperations(_Throwable__OclAny);
			Fragments._Throwable__Throwable.initOperations(_Throwable__Throwable);

			Fragments._Transition__Element.initOperations(_Transition__Element);
			Fragments._Transition__NamedElement.initOperations(_Transition__NamedElement);
			Fragments._Transition__Namespace.initOperations(_Transition__Namespace);
			Fragments._Transition__OclAny.initOperations(_Transition__OclAny);
			Fragments._Transition__OclElement.initOperations(_Transition__OclElement);
			Fragments._Transition__Transition.initOperations(_Transition__Transition);

			Fragments._TransitionKind__OclAny.initOperations(_TransitionKind__OclAny);
			Fragments._TransitionKind__OclElement.initOperations(_TransitionKind__OclElement);
			Fragments._TransitionKind__OclEnumeration.initOperations(_TransitionKind__OclEnumeration);
			Fragments._TransitionKind__OclType.initOperations(_TransitionKind__OclType);
			Fragments._TransitionKind__TransitionKind.initOperations(_TransitionKind__TransitionKind);

			Fragments._Trigger__Element.initOperations(_Trigger__Element);
			Fragments._Trigger__NamedElement.initOperations(_Trigger__NamedElement);
			Fragments._Trigger__OclAny.initOperations(_Trigger__OclAny);
			Fragments._Trigger__OclElement.initOperations(_Trigger__OclElement);
			Fragments._Trigger__Trigger.initOperations(_Trigger__Trigger);

			Fragments._TupleLiteralExp__Element.initOperations(_TupleLiteralExp__Element);
			Fragments._TupleLiteralExp__LiteralExp.initOperations(_TupleLiteralExp__LiteralExp);
			Fragments._TupleLiteralExp__NamedElement.initOperations(_TupleLiteralExp__NamedElement);
			Fragments._TupleLiteralExp__OCLExpression.initOperations(_TupleLiteralExp__OCLExpression);
			Fragments._TupleLiteralExp__OclAny.initOperations(_TupleLiteralExp__OclAny);
			Fragments._TupleLiteralExp__OclElement.initOperations(_TupleLiteralExp__OclElement);
			Fragments._TupleLiteralExp__TupleLiteralExp.initOperations(_TupleLiteralExp__TupleLiteralExp);
			Fragments._TupleLiteralExp__TypedElement.initOperations(_TupleLiteralExp__TypedElement);

			Fragments._TupleLiteralPart__Element.initOperations(_TupleLiteralPart__Element);
			Fragments._TupleLiteralPart__NamedElement.initOperations(_TupleLiteralPart__NamedElement);
			Fragments._TupleLiteralPart__OclAny.initOperations(_TupleLiteralPart__OclAny);
			Fragments._TupleLiteralPart__OclElement.initOperations(_TupleLiteralPart__OclElement);
			Fragments._TupleLiteralPart__TupleLiteralPart.initOperations(_TupleLiteralPart__TupleLiteralPart);
			Fragments._TupleLiteralPart__TypedElement.initOperations(_TupleLiteralPart__TypedElement);
			Fragments._TupleLiteralPart__VariableDeclaration.initOperations(_TupleLiteralPart__VariableDeclaration);

			Fragments._TupleType__Class.initOperations(_TupleType__Class);
			Fragments._TupleType__DataType.initOperations(_TupleType__DataType);
			Fragments._TupleType__Element.initOperations(_TupleType__Element);
			Fragments._TupleType__NamedElement.initOperations(_TupleType__NamedElement);
			Fragments._TupleType__Namespace.initOperations(_TupleType__Namespace);
			Fragments._TupleType__OclAny.initOperations(_TupleType__OclAny);
			Fragments._TupleType__OclElement.initOperations(_TupleType__OclElement);
			Fragments._TupleType__OclType.initOperations(_TupleType__OclType);
			Fragments._TupleType__TemplateableElement.initOperations(_TupleType__TemplateableElement);
			Fragments._TupleType__TupleType.initOperations(_TupleType__TupleType);
			Fragments._TupleType__Type.initOperations(_TupleType__Type);

			Fragments._Type__Element.initOperations(_Type__Element);
			Fragments._Type__NamedElement.initOperations(_Type__NamedElement);
			Fragments._Type__OclAny.initOperations(_Type__OclAny);
			Fragments._Type__OclElement.initOperations(_Type__OclElement);
			Fragments._Type__OclType.initOperations(_Type__OclType);
			Fragments._Type__Type.initOperations(_Type__Type);

			Fragments._TypeExp__Element.initOperations(_TypeExp__Element);
			Fragments._TypeExp__NamedElement.initOperations(_TypeExp__NamedElement);
			Fragments._TypeExp__OCLExpression.initOperations(_TypeExp__OCLExpression);
			Fragments._TypeExp__OclAny.initOperations(_TypeExp__OclAny);
			Fragments._TypeExp__OclElement.initOperations(_TypeExp__OclElement);
			Fragments._TypeExp__ReferringElement.initOperations(_TypeExp__ReferringElement);
			Fragments._TypeExp__TypeExp.initOperations(_TypeExp__TypeExp);
			Fragments._TypeExp__TypedElement.initOperations(_TypeExp__TypedElement);

			Fragments._TypedElement__Element.initOperations(_TypedElement__Element);
			Fragments._TypedElement__NamedElement.initOperations(_TypedElement__NamedElement);
			Fragments._TypedElement__OclAny.initOperations(_TypedElement__OclAny);
			Fragments._TypedElement__OclElement.initOperations(_TypedElement__OclElement);
			Fragments._TypedElement__TypedElement.initOperations(_TypedElement__TypedElement);

			Fragments._UnlimitedNaturalLiteralExp__Element.initOperations(_UnlimitedNaturalLiteralExp__Element);
			Fragments._UnlimitedNaturalLiteralExp__LiteralExp.initOperations(_UnlimitedNaturalLiteralExp__LiteralExp);
			Fragments._UnlimitedNaturalLiteralExp__NamedElement.initOperations(_UnlimitedNaturalLiteralExp__NamedElement);
			Fragments._UnlimitedNaturalLiteralExp__NumericLiteralExp.initOperations(_UnlimitedNaturalLiteralExp__NumericLiteralExp);
			Fragments._UnlimitedNaturalLiteralExp__OCLExpression.initOperations(_UnlimitedNaturalLiteralExp__OCLExpression);
			Fragments._UnlimitedNaturalLiteralExp__OclAny.initOperations(_UnlimitedNaturalLiteralExp__OclAny);
			Fragments._UnlimitedNaturalLiteralExp__OclElement.initOperations(_UnlimitedNaturalLiteralExp__OclElement);
			Fragments._UnlimitedNaturalLiteralExp__PrimitiveLiteralExp.initOperations(_UnlimitedNaturalLiteralExp__PrimitiveLiteralExp);
			Fragments._UnlimitedNaturalLiteralExp__TypedElement.initOperations(_UnlimitedNaturalLiteralExp__TypedElement);
			Fragments._UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp.initOperations(_UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp);

			Fragments._UnspecifiedValueExp__Element.initOperations(_UnspecifiedValueExp__Element);
			Fragments._UnspecifiedValueExp__NamedElement.initOperations(_UnspecifiedValueExp__NamedElement);
			Fragments._UnspecifiedValueExp__OCLExpression.initOperations(_UnspecifiedValueExp__OCLExpression);
			Fragments._UnspecifiedValueExp__OclAny.initOperations(_UnspecifiedValueExp__OclAny);
			Fragments._UnspecifiedValueExp__OclElement.initOperations(_UnspecifiedValueExp__OclElement);
			Fragments._UnspecifiedValueExp__TypedElement.initOperations(_UnspecifiedValueExp__TypedElement);
			Fragments._UnspecifiedValueExp__UnspecifiedValueExp.initOperations(_UnspecifiedValueExp__UnspecifiedValueExp);

			Fragments._ValueSpecification__Element.initOperations(_ValueSpecification__Element);
			Fragments._ValueSpecification__NamedElement.initOperations(_ValueSpecification__NamedElement);
			Fragments._ValueSpecification__OclAny.initOperations(_ValueSpecification__OclAny);
			Fragments._ValueSpecification__OclElement.initOperations(_ValueSpecification__OclElement);
			Fragments._ValueSpecification__TypedElement.initOperations(_ValueSpecification__TypedElement);
			Fragments._ValueSpecification__ValueSpecification.initOperations(_ValueSpecification__ValueSpecification);

			Fragments._Variable__Element.initOperations(_Variable__Element);
			Fragments._Variable__NamedElement.initOperations(_Variable__NamedElement);
			Fragments._Variable__OclAny.initOperations(_Variable__OclAny);
			Fragments._Variable__OclElement.initOperations(_Variable__OclElement);
			Fragments._Variable__TypedElement.initOperations(_Variable__TypedElement);
			Fragments._Variable__Variable.initOperations(_Variable__Variable);
			Fragments._Variable__VariableDeclaration.initOperations(_Variable__VariableDeclaration);

			Fragments._VariableDeclaration__Element.initOperations(_VariableDeclaration__Element);
			Fragments._VariableDeclaration__NamedElement.initOperations(_VariableDeclaration__NamedElement);
			Fragments._VariableDeclaration__OclAny.initOperations(_VariableDeclaration__OclAny);
			Fragments._VariableDeclaration__OclElement.initOperations(_VariableDeclaration__OclElement);
			Fragments._VariableDeclaration__TypedElement.initOperations(_VariableDeclaration__TypedElement);
			Fragments._VariableDeclaration__VariableDeclaration.initOperations(_VariableDeclaration__VariableDeclaration);

			Fragments._VariableExp__Element.initOperations(_VariableExp__Element);
			Fragments._VariableExp__NamedElement.initOperations(_VariableExp__NamedElement);
			Fragments._VariableExp__OCLExpression.initOperations(_VariableExp__OCLExpression);
			Fragments._VariableExp__OclAny.initOperations(_VariableExp__OclAny);
			Fragments._VariableExp__OclElement.initOperations(_VariableExp__OclElement);
			Fragments._VariableExp__ReferringElement.initOperations(_VariableExp__ReferringElement);
			Fragments._VariableExp__TypedElement.initOperations(_VariableExp__TypedElement);
			Fragments._VariableExp__VariableExp.initOperations(_VariableExp__VariableExp);

			Fragments._Vertex__Element.initOperations(_Vertex__Element);
			Fragments._Vertex__NamedElement.initOperations(_Vertex__NamedElement);
			Fragments._Vertex__OclAny.initOperations(_Vertex__OclAny);
			Fragments._Vertex__OclElement.initOperations(_Vertex__OclElement);
			Fragments._Vertex__Vertex.initOperations(_Vertex__Vertex);

			Fragments._Visitable__OclAny.initOperations(_Visitable__OclAny);
			Fragments._Visitable__OclElement.initOperations(_Visitable__OclElement);
			Fragments._Visitable__Visitable.initOperations(_Visitable__Visitable);

			Fragments._VoidType__Class.initOperations(_VoidType__Class);
			Fragments._VoidType__Element.initOperations(_VoidType__Element);
			Fragments._VoidType__NamedElement.initOperations(_VoidType__NamedElement);
			Fragments._VoidType__Namespace.initOperations(_VoidType__Namespace);
			Fragments._VoidType__OclAny.initOperations(_VoidType__OclAny);
			Fragments._VoidType__OclElement.initOperations(_VoidType__OclElement);
			Fragments._VoidType__OclType.initOperations(_VoidType__OclType);
			Fragments._VoidType__TemplateableElement.initOperations(_VoidType__TemplateableElement);
			Fragments._VoidType__Type.initOperations(_VoidType__Type);
			Fragments._VoidType__VoidType.initOperations(_VoidType__VoidType);

			Fragments._WildcardType__Class.initOperations(_WildcardType__Class);
			Fragments._WildcardType__Element.initOperations(_WildcardType__Element);
			Fragments._WildcardType__NamedElement.initOperations(_WildcardType__NamedElement);
			Fragments._WildcardType__Namespace.initOperations(_WildcardType__Namespace);
			Fragments._WildcardType__OclAny.initOperations(_WildcardType__OclAny);
			Fragments._WildcardType__OclElement.initOperations(_WildcardType__OclElement);
			Fragments._WildcardType__OclType.initOperations(_WildcardType__OclType);
			Fragments._WildcardType__TemplateableElement.initOperations(_WildcardType__TemplateableElement);
			Fragments._WildcardType__Type.initOperations(_WildcardType__Type);
			Fragments._WildcardType__WildcardType.initOperations(_WildcardType__WildcardType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PivotTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final @NonNull ExecutorProperty @NonNull [] _Annotation = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Annotation__ownedContents,
			PivotTables.Properties._Annotation__ownedDetails,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Annotation__references
		};

		private static final @NonNull ExecutorProperty @NonNull [] _AnyType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _AssociationClass = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._AssociationClass__unownedAttributes,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _AssociationClassCallExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._CallExp__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._FeatureCallExp__isPre,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._CallExp__isSafe,
			PivotTables.Properties._NamedElement__name,
			PivotTables.Properties._NavigationCallExp__navigationSource,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CallExp__ownedSource,
			PivotTables.Properties._NavigationCallExp__qualifiers,
			PivotTables.Properties._AssociationClassCallExp__referredAssociationClass,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _AssociativityKind = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final @NonNull ExecutorProperty @NonNull [] _BagType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DataType__behavioralClass,
			PivotTables.Properties._CollectionType__elementType,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._CollectionType__isNullFree,
			PivotTables.Properties._DataType__isSerializable,
			PivotTables.Properties._CollectionType__lower,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._CollectionType__upper,
			PivotTables.Properties._DataType__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Behavior = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Behavior__owningTransition,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _BooleanLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._BooleanLiteralExp__booleanSymbol,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CallExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._CallExp__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._CallExp__isSafe,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CallExp__ownedSource,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CallOperationAction = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._CallOperationAction__operation,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Class = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CollectionItem = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CollectionItem__ownedItem,
			PivotTables.Properties._TypedElement__type
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CollectionKind = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CollectionLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._CollectionLiteralExp__kind,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CollectionLiteralExp__ownedParts,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CollectionLiteralPart = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CollectionRange = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CollectionRange__ownedFirst,
			PivotTables.Properties._CollectionRange__ownedLast,
			PivotTables.Properties._TypedElement__type
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CollectionType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DataType__behavioralClass,
			PivotTables.Properties._CollectionType__elementType,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._CollectionType__isNullFree,
			PivotTables.Properties._DataType__isSerializable,
			PivotTables.Properties._CollectionType__lower,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._CollectionType__upper,
			PivotTables.Properties._DataType__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Comment = {
			PivotTables.Properties._Comment__annotatedElements,
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Comment__body,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Comment__owningElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CompleteClass = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CompleteClass__owningCompletePackage,
			PivotTables.Properties._CompleteClass__partialClasses
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CompleteEnvironment = {
			PivotTables.Properties._Element__annotatingComments,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._CompleteEnvironment__ownedCompleteModel,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CompleteEnvironment__ownedStandardLibrary
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CompleteModel = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._CompleteModel__orphanCompletePackage,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._CompleteModel__ownedCompletePackages,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CompleteModel__owningCompleteEnvironment,
			PivotTables.Properties._CompleteModel__partialModels,
			PivotTables.Properties._CompleteModel__primitiveCompletePackage
		};

		private static final @NonNull ExecutorProperty @NonNull [] _CompletePackage = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._CompletePackage__ownedCompleteClasses,
			PivotTables.Properties._CompletePackage__ownedCompletePackages,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CompletePackage__owningCompleteModel,
			PivotTables.Properties._CompletePackage__owningCompletePackage,
			PivotTables.Properties._CompletePackage__partialPackages
		};

		private static final @NonNull ExecutorProperty @NonNull [] _ConnectionPointReference = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._ConnectionPointReference__entries,
			PivotTables.Properties._ConnectionPointReference__exits,
			PivotTables.Properties._Vertex__incomingTransitions,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Vertex__outgoingTransitions,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Vertex__owningRegion,
			PivotTables.Properties._ConnectionPointReference__owningState
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Constraint = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Constraint__constrainedElements,
			PivotTables.Properties._Constraint__context,
			PivotTables.Properties._Constraint__isCallable,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Constraint__ownedSpecification,
			PivotTables.Properties._Constraint__owningPostContext,
			PivotTables.Properties._Constraint__owningPreContext,
			PivotTables.Properties._Constraint__owningState,
			PivotTables.Properties._Constraint__owningTransition,
			PivotTables.Properties._Constraint__redefinedConstraints
		};

		private static final @NonNull ExecutorProperty @NonNull [] _DataType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DataType__behavioralClass,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._DataType__isSerializable,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._DataType__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Detail = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Detail__values
		};

		private static final @NonNull ExecutorProperty @NonNull [] _DynamicBehavior = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._DynamicElement__metaType,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._DynamicType__ownedDynamicProperties,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Behavior__owningTransition,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _DynamicElement = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DynamicElement__metaType,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions
		};

		private static final @NonNull ExecutorProperty @NonNull [] _DynamicProperty = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DynamicProperty__default,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._DynamicProperty__referredProperty
		};

		private static final @NonNull ExecutorProperty @NonNull [] _DynamicType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._DynamicElement__metaType,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._DynamicType__ownedDynamicProperties,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _DynamicValueSpecification = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Element = {
			PivotTables.Properties._Element__annotatingComments,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions
		};

		private static final @NonNull ExecutorProperty @NonNull [] _ElementExtension = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._ElementExtension__base,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._ElementExtension__isApplied,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._ElementExtension__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._ElementExtension__stereotype,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _EnumLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._EnumLiteralExp__referredLiteral,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Enumeration = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DataType__behavioralClass,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._DataType__isSerializable,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Enumeration__ownedLiterals,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._DataType__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _EnumerationLiteral = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._InstanceSpecification__classes,
			PivotTables.Properties._EnumerationLiteral__literal,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._InstanceSpecification__ownedSlots,
			PivotTables.Properties._InstanceSpecification__ownedSpecification,
			PivotTables.Properties._EnumerationLiteral__owningEnumeration,
			PivotTables.Properties._InstanceSpecification__owningPackage,
			PivotTables.Properties._EnumerationLiteral__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _ExpressionInOCL = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._LanguageExpression__body,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._LanguageExpression__language,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._ExpressionInOCL__ownedBody,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._ExpressionInOCL__ownedContext,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._ExpressionInOCL__ownedParameters,
			PivotTables.Properties._ExpressionInOCL__ownedResult,
			PivotTables.Properties._LanguageExpression__owningConstraint,
			PivotTables.Properties._TypedElement__type
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Feature = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Feature__implementation,
			PivotTables.Properties._Feature__implementationClass,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._Feature__isStatic,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type
		};

		private static final @NonNull ExecutorProperty @NonNull [] _FeatureCallExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._CallExp__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._FeatureCallExp__isPre,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._CallExp__isSafe,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CallExp__ownedSource,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _FinalState = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Vertex__incomingTransitions,
			PivotTables.Properties._State__isComposite,
			PivotTables.Properties._State__isOrthogonal,
			PivotTables.Properties._State__isSimple,
			PivotTables.Properties._State__isSubmachineState,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Vertex__outgoingTransitions,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._State__ownedConnectionPoints,
			PivotTables.Properties._State__ownedConnections,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._State__ownedDeferrableTriggers,
			PivotTables.Properties._State__ownedDoActivity,
			PivotTables.Properties._State__ownedEntry,
			PivotTables.Properties._State__ownedExit,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._State__ownedRegions,
			PivotTables.Properties._State__ownedStateInvariant,
			PivotTables.Properties._Vertex__owningRegion,
			PivotTables.Properties._State__redefinedState,
			PivotTables.Properties._State__submachines
		};

		private static final @NonNull ExecutorProperty @NonNull [] _IfExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._IfExp__isElseIf,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._IfExp__ownedCondition,
			PivotTables.Properties._IfExp__ownedElse,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._IfExp__ownedThen,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Import = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Import__importedNamespace,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Import__xmiidVersion
		};

		private static final @NonNull ExecutorProperty @NonNull [] _InstanceSpecification = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._InstanceSpecification__classes,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._InstanceSpecification__ownedSlots,
			PivotTables.Properties._InstanceSpecification__ownedSpecification,
			PivotTables.Properties._InstanceSpecification__owningPackage
		};

		private static final @NonNull ExecutorProperty @NonNull [] _IntegerLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._IntegerLiteralExp__integerSymbol,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _InvalidLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _InvalidType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _IterableType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DataType__behavioralClass,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._DataType__isSerializable,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._DataType__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _IterateExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._CallExp__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._CallExp__isSafe,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._LoopExp__ownedBody,
			PivotTables.Properties._LoopExp__ownedCoIterators,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._LoopExp__ownedIterators,
			PivotTables.Properties._IterateExp__ownedResult,
			PivotTables.Properties._CallExp__ownedSource,
			PivotTables.Properties._LoopExp__referredIteration,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Iteration = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Operation__bodyExpression,
			PivotTables.Properties._Feature__implementation,
			PivotTables.Properties._Feature__implementationClass,
			PivotTables.Properties._Operation__isInvalidating,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._Feature__isStatic,
			PivotTables.Properties._Operation__isTransient,
			PivotTables.Properties._Operation__isTypeof,
			PivotTables.Properties._Operation__isValidating,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Iteration__ownedAccumulators,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Iteration__ownedIterators,
			PivotTables.Properties._Operation__ownedParameters,
			PivotTables.Properties._Operation__ownedPostconditions,
			PivotTables.Properties._Operation__ownedPreconditions,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Operation__owningClass,
			PivotTables.Properties._Operation__precedence,
			PivotTables.Properties._Operation__raisedExceptions,
			PivotTables.Properties._Operation__redefinedOperations,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _IteratorExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._CallExp__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._CallExp__isSafe,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._LoopExp__ownedBody,
			PivotTables.Properties._LoopExp__ownedCoIterators,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._LoopExp__ownedIterators,
			PivotTables.Properties._CallExp__ownedSource,
			PivotTables.Properties._LoopExp__referredIteration,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _IteratorVariable = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Variable__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Variable__ownedInit,
			PivotTables.Properties._Variable__representedParameter,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._VariableDeclaration__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _LambdaType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DataType__behavioralClass,
			PivotTables.Properties._LambdaType__contextType,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._DataType__isSerializable,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._LambdaType__parameterType,
			PivotTables.Properties._LambdaType__resultType,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._DataType__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _LanguageExpression = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._LanguageExpression__body,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._LanguageExpression__language,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._LanguageExpression__owningConstraint,
			PivotTables.Properties._TypedElement__type
		};

		private static final @NonNull ExecutorProperty @NonNull [] _LetExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._LetExp__ownedIn,
			PivotTables.Properties._LetExp__ownedVariable,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _LetVariable = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Variable__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Variable__ownedInit,
			PivotTables.Properties._Variable__representedParameter,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._VariableDeclaration__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Library = {
			PivotTables.Properties._Package__URI,
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Package__importedPackages,
			PivotTables.Properties._NamedElement__name,
			PivotTables.Properties._Package__nsPrefix,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Package__ownedClasses,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Package__ownedInstances,
			PivotTables.Properties._Package__ownedPackages,
			PivotTables.Properties._Library__ownedPrecedences,
			PivotTables.Properties._Package__ownedProfileApplications,
			PivotTables.Properties._Package__owningPackage
		};

		private static final @NonNull ExecutorProperty @NonNull [] _LibraryFeature = {};

		private static final @NonNull ExecutorProperty @NonNull [] _LiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _LoopExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._CallExp__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._CallExp__isSafe,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._LoopExp__ownedBody,
			PivotTables.Properties._LoopExp__ownedCoIterators,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._LoopExp__ownedIterators,
			PivotTables.Properties._CallExp__ownedSource,
			PivotTables.Properties._LoopExp__referredIteration,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _MapLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._MapLiteralExp__ownedParts,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _MapLiteralPart = {
			PivotTables.Properties._Element__annotatingComments,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._MapLiteralPart__ownedKey,
			PivotTables.Properties._MapLiteralPart__ownedValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _MapType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DataType__behavioralClass,
			PivotTables.Properties._MapType__entryClass,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._DataType__isSerializable,
			PivotTables.Properties._MapType__keyType,
			PivotTables.Properties._MapType__keysAreNullFree,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._DataType__value,
			PivotTables.Properties._MapType__valueType,
			PivotTables.Properties._MapType__valuesAreNullFree
		};

		private static final @NonNull ExecutorProperty @NonNull [] _MessageExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._MessageExp__ownedArguments,
			PivotTables.Properties._MessageExp__ownedCalledOperation,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._MessageExp__ownedSentSignal,
			PivotTables.Properties._MessageExp__ownedTarget,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _MessageType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._MessageType__referredOperation,
			PivotTables.Properties._MessageType__referredSignal,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Model = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Model__externalURI,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Model__ownedImports,
			PivotTables.Properties._Model__ownedPackages,
			PivotTables.Properties._Model__xmiidVersion
		};

		private static final @NonNull ExecutorProperty @NonNull [] _MorePivotable = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Nameable = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final @NonNull ExecutorProperty @NonNull [] _NamedElement = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Namespace = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions
		};

		private static final @NonNull ExecutorProperty @NonNull [] _NavigationCallExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._CallExp__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._FeatureCallExp__isPre,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._CallExp__isSafe,
			PivotTables.Properties._NamedElement__name,
			PivotTables.Properties._NavigationCallExp__navigationSource,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CallExp__ownedSource,
			PivotTables.Properties._NavigationCallExp__qualifiers,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _NullLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _NumericLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _OCLExpression = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Object = {};

		private static final @NonNull ExecutorProperty @NonNull [] _Operation = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Operation__bodyExpression,
			PivotTables.Properties._Feature__implementation,
			PivotTables.Properties._Feature__implementationClass,
			PivotTables.Properties._Operation__isInvalidating,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._Feature__isStatic,
			PivotTables.Properties._Operation__isTransient,
			PivotTables.Properties._Operation__isTypeof,
			PivotTables.Properties._Operation__isValidating,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Operation__ownedParameters,
			PivotTables.Properties._Operation__ownedPostconditions,
			PivotTables.Properties._Operation__ownedPreconditions,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Operation__owningClass,
			PivotTables.Properties._Operation__precedence,
			PivotTables.Properties._Operation__raisedExceptions,
			PivotTables.Properties._Operation__redefinedOperations,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _OperationCallExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._CallExp__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._FeatureCallExp__isPre,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._CallExp__isSafe,
			PivotTables.Properties._OperationCallExp__isVirtual,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._OperationCallExp__ownedArguments,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CallExp__ownedSource,
			PivotTables.Properties._OperationCallExp__referredOperation,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _OppositePropertyCallExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._CallExp__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._FeatureCallExp__isPre,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._CallExp__isSafe,
			PivotTables.Properties._NamedElement__name,
			PivotTables.Properties._NavigationCallExp__navigationSource,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CallExp__ownedSource,
			PivotTables.Properties._NavigationCallExp__qualifiers,
			PivotTables.Properties._OppositePropertyCallExp__referredProperty,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _OrderedSetType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DataType__behavioralClass,
			PivotTables.Properties._CollectionType__elementType,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._CollectionType__isNullFree,
			PivotTables.Properties._DataType__isSerializable,
			PivotTables.Properties._CollectionType__lower,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._CollectionType__upper,
			PivotTables.Properties._DataType__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _OrphanCompletePackage = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._CompletePackage__ownedCompleteClasses,
			PivotTables.Properties._CompletePackage__ownedCompletePackages,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CompletePackage__owningCompleteModel,
			PivotTables.Properties._CompletePackage__owningCompletePackage,
			PivotTables.Properties._CompletePackage__partialPackages
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Package = {
			PivotTables.Properties._Package__URI,
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Package__importedPackages,
			PivotTables.Properties._NamedElement__name,
			PivotTables.Properties._Package__nsPrefix,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Package__ownedClasses,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Package__ownedInstances,
			PivotTables.Properties._Package__ownedPackages,
			PivotTables.Properties._Package__ownedProfileApplications,
			PivotTables.Properties._Package__owningPackage
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Parameter = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._Parameter__isTypeof,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Parameter__owningOperation,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._VariableDeclaration__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _ParameterVariable = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Variable__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Variable__ownedInit,
			PivotTables.Properties._Variable__representedParameter,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._VariableDeclaration__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Pivotable = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Precedence = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Precedence__associativity,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Precedence__order,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions
		};

		private static final @NonNull ExecutorProperty @NonNull [] _PrimitiveCompletePackage = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._CompletePackage__ownedCompleteClasses,
			PivotTables.Properties._CompletePackage__ownedCompletePackages,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CompletePackage__owningCompleteModel,
			PivotTables.Properties._CompletePackage__owningCompletePackage,
			PivotTables.Properties._CompletePackage__partialPackages
		};

		private static final @NonNull ExecutorProperty @NonNull [] _PrimitiveLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _PrimitiveType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DataType__behavioralClass,
			PivotTables.Properties._PrimitiveType__coercions,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._DataType__isSerializable,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._DataType__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Profile = {
			PivotTables.Properties._Package__URI,
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Package__importedPackages,
			PivotTables.Properties._NamedElement__name,
			PivotTables.Properties._Package__nsPrefix,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Package__ownedClasses,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Package__ownedInstances,
			PivotTables.Properties._Package__ownedPackages,
			PivotTables.Properties._Package__ownedProfileApplications,
			PivotTables.Properties._Package__owningPackage,
			PivotTables.Properties._Profile__profileApplications
		};

		private static final @NonNull ExecutorProperty @NonNull [] _ProfileApplication = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._ProfileApplication__appliedProfile,
			PivotTables.Properties._ProfileApplication__isStrict,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._ProfileApplication__owningPackage
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Property = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Property__associationClass,
			PivotTables.Properties._Property__defaultValue,
			PivotTables.Properties._Property__defaultValueString,
			PivotTables.Properties._Feature__implementation,
			PivotTables.Properties._Feature__implementationClass,
			PivotTables.Properties._Property__isComposite,
			PivotTables.Properties._Property__isDerived,
			PivotTables.Properties._Property__isID,
			PivotTables.Properties._Property__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._Property__isReadOnly,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._Property__isResolveProxies,
			PivotTables.Properties._Feature__isStatic,
			PivotTables.Properties._Property__isTransient,
			PivotTables.Properties._Property__isUnsettable,
			PivotTables.Properties._Property__isVolatile,
			PivotTables.Properties._Property__keys,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Property__opposite,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Property__ownedExpression,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Property__owningClass,
			PivotTables.Properties._Property__redefinedProperties,
			PivotTables.Properties._Property__referredProperty,
			PivotTables.Properties._Property__subsettedProperty,
			PivotTables.Properties._TypedElement__type
		};

		private static final @NonNull ExecutorProperty @NonNull [] _PropertyCallExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._CallExp__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._FeatureCallExp__isPre,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._CallExp__isSafe,
			PivotTables.Properties._NamedElement__name,
			PivotTables.Properties._NavigationCallExp__navigationSource,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._CallExp__ownedSource,
			PivotTables.Properties._NavigationCallExp__qualifiers,
			PivotTables.Properties._PropertyCallExp__referredProperty,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Pseudostate = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Vertex__incomingTransitions,
			PivotTables.Properties._Pseudostate__kind,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Vertex__outgoingTransitions,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Vertex__owningRegion,
			PivotTables.Properties._Pseudostate__owningState,
			PivotTables.Properties._Pseudostate__owningStateMachine
		};

		private static final @NonNull ExecutorProperty @NonNull [] _PseudostateKind = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final @NonNull ExecutorProperty @NonNull [] _RealLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._RealLiteralExp__realSymbol,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _ReferringElement = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Region = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Region__extendedRegion,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Region__ownedSubvertexes,
			PivotTables.Properties._Region__ownedTransitions,
			PivotTables.Properties._Region__owningState,
			PivotTables.Properties._Region__owningStateMachine
		};

		private static final @NonNull ExecutorProperty @NonNull [] _ResultVariable = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Variable__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Variable__ownedInit,
			PivotTables.Properties._Variable__representedParameter,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._VariableDeclaration__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _SelfType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _SendSignalAction = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._SendSignalAction__signal
		};

		private static final @NonNull ExecutorProperty @NonNull [] _SequenceType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DataType__behavioralClass,
			PivotTables.Properties._CollectionType__elementType,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._CollectionType__isNullFree,
			PivotTables.Properties._DataType__isSerializable,
			PivotTables.Properties._CollectionType__lower,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._CollectionType__upper,
			PivotTables.Properties._DataType__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _SetType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DataType__behavioralClass,
			PivotTables.Properties._CollectionType__elementType,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._CollectionType__isNullFree,
			PivotTables.Properties._DataType__isSerializable,
			PivotTables.Properties._CollectionType__lower,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._CollectionType__upper,
			PivotTables.Properties._DataType__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _ShadowExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._ShadowExp__ownedParts,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue,
			PivotTables.Properties._ShadowExp__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _ShadowPart = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._ShadowPart__ownedInit,
			PivotTables.Properties._ShadowPart__referredProperty,
			PivotTables.Properties._TypedElement__type
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Signal = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Slot = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Slot__definingProperty,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Slot__ownedValues,
			PivotTables.Properties._Slot__owningInstance
		};

		private static final @NonNull ExecutorProperty @NonNull [] _StandardLibrary = {
			PivotTables.Properties._Element__annotatingComments,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._StandardLibrary__owningCompleteEnvironment
		};

		private static final @NonNull ExecutorProperty @NonNull [] _State = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Vertex__incomingTransitions,
			PivotTables.Properties._State__isComposite,
			PivotTables.Properties._State__isOrthogonal,
			PivotTables.Properties._State__isSimple,
			PivotTables.Properties._State__isSubmachineState,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Vertex__outgoingTransitions,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._State__ownedConnectionPoints,
			PivotTables.Properties._State__ownedConnections,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._State__ownedDeferrableTriggers,
			PivotTables.Properties._State__ownedDoActivity,
			PivotTables.Properties._State__ownedEntry,
			PivotTables.Properties._State__ownedExit,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._State__ownedRegions,
			PivotTables.Properties._State__ownedStateInvariant,
			PivotTables.Properties._Vertex__owningRegion,
			PivotTables.Properties._State__redefinedState,
			PivotTables.Properties._State__submachines
		};

		private static final @NonNull ExecutorProperty @NonNull [] _StateExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._StateExp__referredState,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _StateMachine = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._StateMachine__extendedStateMachines,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._StateMachine__ownedConnectionPoints,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._StateMachine__ownedRegions,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Behavior__owningTransition,
			PivotTables.Properties._StateMachine__submachineStates,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Stereotype = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Stereotype__ownedExtenders,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _StereotypeExtender = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._StereotypeExtender__class,
			PivotTables.Properties._StereotypeExtender__isRequired,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._StereotypeExtender__owningStereotype
		};

		private static final @NonNull ExecutorProperty @NonNull [] _StringLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._StringLiteralExp__stringSymbol,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _TemplateBinding = {
			PivotTables.Properties._Element__annotatingComments,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TemplateBinding__ownedSubstitutions,
			PivotTables.Properties._TemplateBinding__owningElement,
			PivotTables.Properties._TemplateBinding__templateSignature
		};

		private static final @NonNull ExecutorProperty @NonNull [] _TemplateParameter = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TemplateParameter__constrainingClasses,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TemplateParameter__owningSignature
		};

		private static final @NonNull ExecutorProperty @NonNull [] _TemplateParameterSubstitution = {
			PivotTables.Properties._TemplateParameterSubstitution__actual,
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TemplateParameterSubstitution__formal,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TemplateParameterSubstitution__ownedWildcard,
			PivotTables.Properties._TemplateParameterSubstitution__owningBinding
		};

		private static final @NonNull ExecutorProperty @NonNull [] _TemplateSignature = {
			PivotTables.Properties._Element__annotatingComments,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TemplateSignature__ownedParameters,
			PivotTables.Properties._TemplateSignature__owningElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _TemplateableElement = {
			PivotTables.Properties._Element__annotatingComments,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Throwable = {};

		private static final @NonNull ExecutorProperty @NonNull [] _Transition = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Transition__kind,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Transition__ownedEffect,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Transition__ownedGuard,
			PivotTables.Properties._Transition__ownedTriggers,
			PivotTables.Properties._Transition__owningRegion,
			PivotTables.Properties._Transition__source,
			PivotTables.Properties._Transition__target
		};

		private static final @NonNull ExecutorProperty @NonNull [] _TransitionKind = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Trigger = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Trigger__owningState,
			PivotTables.Properties._Trigger__owningTransition
		};

		private static final @NonNull ExecutorProperty @NonNull [] _TupleLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TupleLiteralExp__ownedParts,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _TupleLiteralPart = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TupleLiteralPart__ownedInit,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._VariableDeclaration__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _TupleType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._DataType__behavioralClass,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._DataType__isSerializable,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._DataType__value
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Type = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions
		};

		private static final @NonNull ExecutorProperty @NonNull [] _TypeExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypeExp__referredType,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _TypedElement = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type
		};

		private static final @NonNull ExecutorProperty @NonNull [] _UnlimitedNaturalLiteralExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue,
			PivotTables.Properties._UnlimitedNaturalLiteralExp__unlimitedNaturalSymbol
		};

		private static final @NonNull ExecutorProperty @NonNull [] _UnspecifiedValueExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _ValueSpecification = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Variable = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Variable__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Variable__ownedInit,
			PivotTables.Properties._Variable__representedParameter,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._VariableDeclaration__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _VariableDeclaration = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._VariableDeclaration__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _VariableExp = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._VariableExp__isImplicit,
			PivotTables.Properties._TypedElement__isMany,
			PivotTables.Properties._TypedElement__isRequired,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._VariableExp__referredVariable,
			PivotTables.Properties._TypedElement__type,
			PivotTables.Properties._OCLExpression__typeValue
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Vertex = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Vertex__incomingTransitions,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Vertex__outgoingTransitions,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Vertex__owningRegion
		};

		private static final @NonNull ExecutorProperty @NonNull [] _Visitable = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final @NonNull ExecutorProperty @NonNull [] _VoidType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement
		};

		private static final @NonNull ExecutorProperty @NonNull [] _WildcardType = {
			PivotTables.Properties._Element__annotatingComments,
			PivotTables.Properties._Class__extenders,
			PivotTables.Properties._Class__instanceClassName,
			PivotTables.Properties._Class__isAbstract,
			PivotTables.Properties._Class__isActive,
			PivotTables.Properties._Class__isInterface,
			PivotTables.Properties._WildcardType__lowerBound,
			PivotTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			PivotTables.Properties._Element__ownedAnnotations,
			PivotTables.Properties._Class__ownedBehaviors,
			PivotTables.Properties._TemplateableElement__ownedBindings,
			PivotTables.Properties._Element__ownedComments,
			PivotTables.Properties._Namespace__ownedConstraints,
			PivotTables.Properties._Element__ownedExtensions,
			PivotTables.Properties._Class__ownedInvariants,
			PivotTables.Properties._Class__ownedOperations,
			PivotTables.Properties._Class__ownedProperties,
			PivotTables.Properties._TemplateableElement__ownedSignature,
			PivotTables.Properties._Class__owningPackage,
			PivotTables.Properties._Class__superClasses,
			PivotTables.Properties._TemplateableElement__unspecializedElement,
			PivotTables.Properties._WildcardType__upperBound
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Annotation__Annotation.initProperties(_Annotation);
			Fragments._AnyType__AnyType.initProperties(_AnyType);
			Fragments._AssociationClass__AssociationClass.initProperties(_AssociationClass);
			Fragments._AssociationClassCallExp__AssociationClassCallExp.initProperties(_AssociationClassCallExp);
			Fragments._AssociativityKind__AssociativityKind.initProperties(_AssociativityKind);
			Fragments._BagType__BagType.initProperties(_BagType);
			Fragments._Behavior__Behavior.initProperties(_Behavior);
			Fragments._BooleanLiteralExp__BooleanLiteralExp.initProperties(_BooleanLiteralExp);
			Fragments._CallExp__CallExp.initProperties(_CallExp);
			Fragments._CallOperationAction__CallOperationAction.initProperties(_CallOperationAction);
			Fragments._Class__Class.initProperties(_Class);
			Fragments._CollectionItem__CollectionItem.initProperties(_CollectionItem);
			Fragments._CollectionKind__CollectionKind.initProperties(_CollectionKind);
			Fragments._CollectionLiteralExp__CollectionLiteralExp.initProperties(_CollectionLiteralExp);
			Fragments._CollectionLiteralPart__CollectionLiteralPart.initProperties(_CollectionLiteralPart);
			Fragments._CollectionRange__CollectionRange.initProperties(_CollectionRange);
			Fragments._CollectionType__CollectionType.initProperties(_CollectionType);
			Fragments._Comment__Comment.initProperties(_Comment);
			Fragments._CompleteClass__CompleteClass.initProperties(_CompleteClass);
			Fragments._CompleteEnvironment__CompleteEnvironment.initProperties(_CompleteEnvironment);
			Fragments._CompleteModel__CompleteModel.initProperties(_CompleteModel);
			Fragments._CompletePackage__CompletePackage.initProperties(_CompletePackage);
			Fragments._ConnectionPointReference__ConnectionPointReference.initProperties(_ConnectionPointReference);
			Fragments._Constraint__Constraint.initProperties(_Constraint);
			Fragments._DataType__DataType.initProperties(_DataType);
			Fragments._Detail__Detail.initProperties(_Detail);
			Fragments._DynamicBehavior__DynamicBehavior.initProperties(_DynamicBehavior);
			Fragments._DynamicElement__DynamicElement.initProperties(_DynamicElement);
			Fragments._DynamicProperty__DynamicProperty.initProperties(_DynamicProperty);
			Fragments._DynamicType__DynamicType.initProperties(_DynamicType);
			Fragments._DynamicValueSpecification__DynamicValueSpecification.initProperties(_DynamicValueSpecification);
			Fragments._Element__Element.initProperties(_Element);
			Fragments._ElementExtension__ElementExtension.initProperties(_ElementExtension);
			Fragments._EnumLiteralExp__EnumLiteralExp.initProperties(_EnumLiteralExp);
			Fragments._Enumeration__Enumeration.initProperties(_Enumeration);
			Fragments._EnumerationLiteral__EnumerationLiteral.initProperties(_EnumerationLiteral);
			Fragments._ExpressionInOCL__ExpressionInOCL.initProperties(_ExpressionInOCL);
			Fragments._Feature__Feature.initProperties(_Feature);
			Fragments._FeatureCallExp__FeatureCallExp.initProperties(_FeatureCallExp);
			Fragments._FinalState__FinalState.initProperties(_FinalState);
			Fragments._IfExp__IfExp.initProperties(_IfExp);
			Fragments._Import__Import.initProperties(_Import);
			Fragments._InstanceSpecification__InstanceSpecification.initProperties(_InstanceSpecification);
			Fragments._IntegerLiteralExp__IntegerLiteralExp.initProperties(_IntegerLiteralExp);
			Fragments._InvalidLiteralExp__InvalidLiteralExp.initProperties(_InvalidLiteralExp);
			Fragments._InvalidType__InvalidType.initProperties(_InvalidType);
			Fragments._IterableType__IterableType.initProperties(_IterableType);
			Fragments._IterateExp__IterateExp.initProperties(_IterateExp);
			Fragments._Iteration__Iteration.initProperties(_Iteration);
			Fragments._IteratorExp__IteratorExp.initProperties(_IteratorExp);
			Fragments._IteratorVariable__IteratorVariable.initProperties(_IteratorVariable);
			Fragments._LambdaType__LambdaType.initProperties(_LambdaType);
			Fragments._LanguageExpression__LanguageExpression.initProperties(_LanguageExpression);
			Fragments._LetExp__LetExp.initProperties(_LetExp);
			Fragments._LetVariable__LetVariable.initProperties(_LetVariable);
			Fragments._Library__Library.initProperties(_Library);
			Fragments._LibraryFeature__LibraryFeature.initProperties(_LibraryFeature);
			Fragments._LiteralExp__LiteralExp.initProperties(_LiteralExp);
			Fragments._LoopExp__LoopExp.initProperties(_LoopExp);
			Fragments._MapLiteralExp__MapLiteralExp.initProperties(_MapLiteralExp);
			Fragments._MapLiteralPart__MapLiteralPart.initProperties(_MapLiteralPart);
			Fragments._MapType__MapType.initProperties(_MapType);
			Fragments._MessageExp__MessageExp.initProperties(_MessageExp);
			Fragments._MessageType__MessageType.initProperties(_MessageType);
			Fragments._Model__Model.initProperties(_Model);
			Fragments._MorePivotable__MorePivotable.initProperties(_MorePivotable);
			Fragments._Nameable__Nameable.initProperties(_Nameable);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Namespace__Namespace.initProperties(_Namespace);
			Fragments._NavigationCallExp__NavigationCallExp.initProperties(_NavigationCallExp);
			Fragments._NullLiteralExp__NullLiteralExp.initProperties(_NullLiteralExp);
			Fragments._NumericLiteralExp__NumericLiteralExp.initProperties(_NumericLiteralExp);
			Fragments._OCLExpression__OCLExpression.initProperties(_OCLExpression);
			Fragments._Object__Object.initProperties(_Object);
			Fragments._Operation__Operation.initProperties(_Operation);
			Fragments._OperationCallExp__OperationCallExp.initProperties(_OperationCallExp);
			Fragments._OppositePropertyCallExp__OppositePropertyCallExp.initProperties(_OppositePropertyCallExp);
			Fragments._OrderedSetType__OrderedSetType.initProperties(_OrderedSetType);
			Fragments._OrphanCompletePackage__OrphanCompletePackage.initProperties(_OrphanCompletePackage);
			Fragments._Package__Package.initProperties(_Package);
			Fragments._Parameter__Parameter.initProperties(_Parameter);
			Fragments._ParameterVariable__ParameterVariable.initProperties(_ParameterVariable);
			Fragments._Pivotable__Pivotable.initProperties(_Pivotable);
			Fragments._Precedence__Precedence.initProperties(_Precedence);
			Fragments._PrimitiveCompletePackage__PrimitiveCompletePackage.initProperties(_PrimitiveCompletePackage);
			Fragments._PrimitiveLiteralExp__PrimitiveLiteralExp.initProperties(_PrimitiveLiteralExp);
			Fragments._PrimitiveType__PrimitiveType.initProperties(_PrimitiveType);
			Fragments._Profile__Profile.initProperties(_Profile);
			Fragments._ProfileApplication__ProfileApplication.initProperties(_ProfileApplication);
			Fragments._Property__Property.initProperties(_Property);
			Fragments._PropertyCallExp__PropertyCallExp.initProperties(_PropertyCallExp);
			Fragments._Pseudostate__Pseudostate.initProperties(_Pseudostate);
			Fragments._PseudostateKind__PseudostateKind.initProperties(_PseudostateKind);
			Fragments._RealLiteralExp__RealLiteralExp.initProperties(_RealLiteralExp);
			Fragments._ReferringElement__ReferringElement.initProperties(_ReferringElement);
			Fragments._Region__Region.initProperties(_Region);
			Fragments._ResultVariable__ResultVariable.initProperties(_ResultVariable);
			Fragments._SelfType__SelfType.initProperties(_SelfType);
			Fragments._SendSignalAction__SendSignalAction.initProperties(_SendSignalAction);
			Fragments._SequenceType__SequenceType.initProperties(_SequenceType);
			Fragments._SetType__SetType.initProperties(_SetType);
			Fragments._ShadowExp__ShadowExp.initProperties(_ShadowExp);
			Fragments._ShadowPart__ShadowPart.initProperties(_ShadowPart);
			Fragments._Signal__Signal.initProperties(_Signal);
			Fragments._Slot__Slot.initProperties(_Slot);
			Fragments._StandardLibrary__StandardLibrary.initProperties(_StandardLibrary);
			Fragments._State__State.initProperties(_State);
			Fragments._StateExp__StateExp.initProperties(_StateExp);
			Fragments._StateMachine__StateMachine.initProperties(_StateMachine);
			Fragments._Stereotype__Stereotype.initProperties(_Stereotype);
			Fragments._StereotypeExtender__StereotypeExtender.initProperties(_StereotypeExtender);
			Fragments._StringLiteralExp__StringLiteralExp.initProperties(_StringLiteralExp);
			Fragments._TemplateBinding__TemplateBinding.initProperties(_TemplateBinding);
			Fragments._TemplateParameter__TemplateParameter.initProperties(_TemplateParameter);
			Fragments._TemplateParameterSubstitution__TemplateParameterSubstitution.initProperties(_TemplateParameterSubstitution);
			Fragments._TemplateSignature__TemplateSignature.initProperties(_TemplateSignature);
			Fragments._TemplateableElement__TemplateableElement.initProperties(_TemplateableElement);
			Fragments._Throwable__Throwable.initProperties(_Throwable);
			Fragments._Transition__Transition.initProperties(_Transition);
			Fragments._TransitionKind__TransitionKind.initProperties(_TransitionKind);
			Fragments._Trigger__Trigger.initProperties(_Trigger);
			Fragments._TupleLiteralExp__TupleLiteralExp.initProperties(_TupleLiteralExp);
			Fragments._TupleLiteralPart__TupleLiteralPart.initProperties(_TupleLiteralPart);
			Fragments._TupleType__TupleType.initProperties(_TupleType);
			Fragments._Type__Type.initProperties(_Type);
			Fragments._TypeExp__TypeExp.initProperties(_TypeExp);
			Fragments._TypedElement__TypedElement.initProperties(_TypedElement);
			Fragments._UnlimitedNaturalLiteralExp__UnlimitedNaturalLiteralExp.initProperties(_UnlimitedNaturalLiteralExp);
			Fragments._UnspecifiedValueExp__UnspecifiedValueExp.initProperties(_UnspecifiedValueExp);
			Fragments._ValueSpecification__ValueSpecification.initProperties(_ValueSpecification);
			Fragments._Variable__Variable.initProperties(_Variable);
			Fragments._VariableDeclaration__VariableDeclaration.initProperties(_VariableDeclaration);
			Fragments._VariableExp__VariableExp.initProperties(_VariableExp);
			Fragments._Vertex__Vertex.initProperties(_Vertex);
			Fragments._Visitable__Visitable.initProperties(_Visitable);
			Fragments._VoidType__VoidType.initProperties(_VoidType);
			Fragments._WildcardType__WildcardType.initProperties(_WildcardType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PivotTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final @NonNull EcoreExecutorEnumerationLiteral _AssociativityKind__left = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.ASSOCIATIVITY_KIND.getEEnumLiteral("left"), Types._AssociativityKind, 0);
		public static final @NonNull EcoreExecutorEnumerationLiteral _AssociativityKind__right = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.ASSOCIATIVITY_KIND.getEEnumLiteral("right"), Types._AssociativityKind, 1);
		private static final @NonNull EcoreExecutorEnumerationLiteral @NonNull [] _AssociativityKind = {
			_AssociativityKind__left,
			_AssociativityKind__right
		};

		public static final @NonNull EcoreExecutorEnumerationLiteral _CollectionKind__Collection = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.COLLECTION_KIND.getEEnumLiteral("Collection"), Types._CollectionKind, 0);
		public static final @NonNull EcoreExecutorEnumerationLiteral _CollectionKind__Set = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.COLLECTION_KIND.getEEnumLiteral("Set"), Types._CollectionKind, 1);
		public static final @NonNull EcoreExecutorEnumerationLiteral _CollectionKind__OrderedSet = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.COLLECTION_KIND.getEEnumLiteral("OrderedSet"), Types._CollectionKind, 2);
		public static final @NonNull EcoreExecutorEnumerationLiteral _CollectionKind__Bag = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.COLLECTION_KIND.getEEnumLiteral("Bag"), Types._CollectionKind, 3);
		public static final @NonNull EcoreExecutorEnumerationLiteral _CollectionKind__Sequence = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.COLLECTION_KIND.getEEnumLiteral("Sequence"), Types._CollectionKind, 4);
		private static final @NonNull EcoreExecutorEnumerationLiteral @NonNull [] _CollectionKind = {
			_CollectionKind__Collection,
			_CollectionKind__Set,
			_CollectionKind__OrderedSet,
			_CollectionKind__Bag,
			_CollectionKind__Sequence
		};

		public static final @NonNull EcoreExecutorEnumerationLiteral _PseudostateKind__initial = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral("initial"), Types._PseudostateKind, 0);
		public static final @NonNull EcoreExecutorEnumerationLiteral _PseudostateKind__deepHistory = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral("deepHistory"), Types._PseudostateKind, 1);
		public static final @NonNull EcoreExecutorEnumerationLiteral _PseudostateKind__shallowHistory = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral("shallowHistory"), Types._PseudostateKind, 2);
		public static final @NonNull EcoreExecutorEnumerationLiteral _PseudostateKind__join = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral("join"), Types._PseudostateKind, 3);
		public static final @NonNull EcoreExecutorEnumerationLiteral _PseudostateKind__fork = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral("fork"), Types._PseudostateKind, 4);
		public static final @NonNull EcoreExecutorEnumerationLiteral _PseudostateKind__junction = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral("junction"), Types._PseudostateKind, 5);
		public static final @NonNull EcoreExecutorEnumerationLiteral _PseudostateKind__choice = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral("choice"), Types._PseudostateKind, 6);
		public static final @NonNull EcoreExecutorEnumerationLiteral _PseudostateKind__entryPoint = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral("entryPoint"), Types._PseudostateKind, 7);
		public static final @NonNull EcoreExecutorEnumerationLiteral _PseudostateKind__exitPoint = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral("exitPoint"), Types._PseudostateKind, 8);
		public static final @NonNull EcoreExecutorEnumerationLiteral _PseudostateKind__terminate = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.PSEUDOSTATE_KIND.getEEnumLiteral("terminate"), Types._PseudostateKind, 9);
		private static final @NonNull EcoreExecutorEnumerationLiteral @NonNull [] _PseudostateKind = {
			_PseudostateKind__initial,
			_PseudostateKind__deepHistory,
			_PseudostateKind__shallowHistory,
			_PseudostateKind__join,
			_PseudostateKind__fork,
			_PseudostateKind__junction,
			_PseudostateKind__choice,
			_PseudostateKind__entryPoint,
			_PseudostateKind__exitPoint,
			_PseudostateKind__terminate
		};

		public static final @NonNull EcoreExecutorEnumerationLiteral _TransitionKind__internal = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.TRANSITION_KIND.getEEnumLiteral("internal"), Types._TransitionKind, 0);
		public static final @NonNull EcoreExecutorEnumerationLiteral _TransitionKind__local = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.TRANSITION_KIND.getEEnumLiteral("local"), Types._TransitionKind, 1);
		public static final @NonNull EcoreExecutorEnumerationLiteral _TransitionKind__external = new EcoreExecutorEnumerationLiteral(PivotPackage.Literals.TRANSITION_KIND.getEEnumLiteral("external"), Types._TransitionKind, 2);
		private static final @NonNull EcoreExecutorEnumerationLiteral @NonNull [] _TransitionKind = {
			_TransitionKind__internal,
			_TransitionKind__local,
			_TransitionKind__external
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._AssociativityKind.initLiterals(_AssociativityKind);
			Types._CollectionKind.initLiterals(_CollectionKind);
			Types._PseudostateKind.initLiterals(_PseudostateKind);
			Types._TransitionKind.initLiterals(_TransitionKind);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of PivotTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new PivotTables();
	}

	private PivotTables() {
		super(PivotPackage.eNS_URI);
	}
}

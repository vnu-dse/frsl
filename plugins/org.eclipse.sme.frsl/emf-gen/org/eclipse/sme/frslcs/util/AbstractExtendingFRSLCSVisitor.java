/*******************************************************************************
 * generated by Xtext 2.25.0
 *
 * This code is auto-generated
 * from: org.eclipse.sme.frsl/model/FRSLCS.genmodel
 *
 * Only the copyright statement is editable.
 *******************************************************************************/
package	org.eclipse.sme.frslcs.util;

import org.eclipse.jdt.annotation.NonNull;

/**
 * An AbstractExtendingFRSLCSVisitor provides a default implementation for each
 * visitXxx method that delegates to the visitYyy method of the first
 * super class, (or transitively its first super class' first super class
 * until a non-interface super-class is found). In the absence of any
 * suitable first super class, the method delegates to visiting().
 */
public abstract class AbstractExtendingFRSLCSVisitor<R, C>
	extends org.eclipse.ocl.xtext.oclinecorecs.util.AbstractExtendingOCLinEcoreCSVisitor<R, C>
	implements FRSLCSVisitor<R>
{
	/**
	 * Initializes me with an initial value for my result.
	 *
	 * @param context my initial result value
	 */
	protected AbstractExtendingFRSLCSVisitor(C context) {
		super(context);
	}

	@Override
	public R visitActStepCS(org.eclipse.sme.frslcs.@NonNull ActStepCS object) {
		return visitStepCS(object);
	}

	@Override
	public R visitActionCS(org.eclipse.sme.frslcs.@NonNull ActionCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitActorActionCS(org.eclipse.sme.frslcs.@NonNull ActorActionCS object) {
		return visitActionCS(object);
	}

	@Override
	public R visitActorCS(org.eclipse.sme.frslcs.@NonNull ActorCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitAltFlowCS(org.eclipse.sme.frslcs.@NonNull AltFlowCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitAssocEndCS(org.eclipse.sme.frslcs.@NonNull AssocEndCS object) {
		return visitReferenceCS(object);
	}

	@Override
	public R visitAssociationCS(org.eclipse.sme.frslcs.@NonNull AssociationCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitConstraintCS(org.eclipse.sme.frslcs.@NonNull ConstraintCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitExtendCS(org.eclipse.sme.frslcs.@NonNull ExtendCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitExtensionPointCS(org.eclipse.sme.frslcs.@NonNull ExtensionPointCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitFrslModelCS(org.eclipse.sme.frslcs.@NonNull FrslModelCS object) {
		return visitRootCS(object);
	}

	@Override
	public R visitObjVarCS(org.eclipse.sme.frslcs.@NonNull ObjVarCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitRejoinStepCS(org.eclipse.sme.frslcs.@NonNull RejoinStepCS object) {
		return visitStepCS(object);
	}

	@Override
	public R visitSnapshotPatternCS(org.eclipse.sme.frslcs.@NonNull SnapshotPatternCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitStepCS(org.eclipse.sme.frslcs.@NonNull StepCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitSystemActionCS(org.eclipse.sme.frslcs.@NonNull SystemActionCS object) {
		return visitActionCS(object);
	}

	@Override
	public R visitUCStepCS(org.eclipse.sme.frslcs.@NonNull UCStepCS object) {
		return visitStepCS(object);
	}

	@Override
	public R visitUsecaseCS(org.eclipse.sme.frslcs.@NonNull UsecaseCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitUsecasePostconditionCS(org.eclipse.sme.frslcs.@NonNull UsecasePostconditionCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitUsecasePreconditionCS(org.eclipse.sme.frslcs.@NonNull UsecasePreconditionCS object) {
		return visitModelElementCS(object);
	}

	@Override
	public R visitVarLinkCS(org.eclipse.sme.frslcs.@NonNull VarLinkCS object) {
		return visitModelElementCS(object);
	}
}

package org.architectural.rationale.diagram.edit.commands;

import org.architectural.rationale.ArchitecturalDecision;
import org.architectural.rationale.ArchitecturalPattern;
import org.architectural.rationale.diagram.edit.policies.RationaleBaseItemSemanticEditPolicy;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternReorientCommand
		extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof ArchitecturalDecision) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ArchitecturalPattern && newEnd instanceof ArchitecturalDecision)) {
			return false;
		}
		return RationaleBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ArchitecturalPattern && newEnd instanceof ArchitecturalPattern)) {
			return false;
		}
		return RationaleBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004(
						getOldSource(), getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getArchitecturalDecision_Has_ArchitecturalPattern()
				.remove(getOldTarget());
		getNewSource().getArchitecturalDecision_Has_ArchitecturalPattern().add(
				getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getArchitecturalDecision_Has_ArchitecturalPattern()
				.remove(getOldTarget());
		getOldSource().getArchitecturalDecision_Has_ArchitecturalPattern().add(
				getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected ArchitecturalDecision getOldSource() {
		return (ArchitecturalDecision) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected ArchitecturalDecision getNewSource() {
		return (ArchitecturalDecision) newEnd;
	}

	/**
	 * @generated
	 */
	protected ArchitecturalPattern getOldTarget() {
		return (ArchitecturalPattern) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ArchitecturalPattern getNewTarget() {
		return (ArchitecturalPattern) newEnd;
	}
}

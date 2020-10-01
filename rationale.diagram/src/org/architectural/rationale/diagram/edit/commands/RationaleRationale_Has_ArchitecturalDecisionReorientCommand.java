package org.architectural.rationale.diagram.edit.commands;

import org.architectural.rationale.ArchitecturalDecision;
import org.architectural.rationale.Rationale;
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
public class RationaleRationale_Has_ArchitecturalDecisionReorientCommand extends
		EditElementCommand {

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
	public RationaleRationale_Has_ArchitecturalDecisionReorientCommand(
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
		if (false == referenceOwner instanceof Rationale) {
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
		if (!(oldEnd instanceof ArchitecturalDecision && newEnd instanceof Rationale)) {
			return false;
		}
		return RationaleBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRationaleRationale_Has_ArchitecturalDecision_4006(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ArchitecturalDecision && newEnd instanceof ArchitecturalDecision)) {
			return false;
		}
		return RationaleBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRationaleRationale_Has_ArchitecturalDecision_4006(
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
		getOldSource().setRationale_Has_ArchitecturalDecision(null);
		getNewSource().setRationale_Has_ArchitecturalDecision(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setRationale_Has_ArchitecturalDecision(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected Rationale getOldSource() {
		return (Rationale) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected Rationale getNewSource() {
		return (Rationale) newEnd;
	}

	/**
	 * @generated
	 */
	protected ArchitecturalDecision getOldTarget() {
		return (ArchitecturalDecision) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ArchitecturalDecision getNewTarget() {
		return (ArchitecturalDecision) newEnd;
	}
}

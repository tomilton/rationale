package org.architectural.rationale.diagram.edit.commands;

import org.architectural.rationale.Justification;
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
public class RationaleRationale_Has_JustificationReorientCommand extends
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
	public RationaleRationale_Has_JustificationReorientCommand(
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
		if (!(oldEnd instanceof Justification && newEnd instanceof Rationale)) {
			return false;
		}
		return RationaleBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRationaleRationale_Has_Justification_4003(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Justification && newEnd instanceof Justification)) {
			return false;
		}
		return RationaleBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRationaleRationale_Has_Justification_4003(
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
		getOldSource().getRationale_Has_Justification().remove(getOldTarget());
		getNewSource().getRationale_Has_Justification().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getRationale_Has_Justification().remove(getOldTarget());
		getOldSource().getRationale_Has_Justification().add(getNewTarget());
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
	protected Justification getOldTarget() {
		return (Justification) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Justification getNewTarget() {
		return (Justification) newEnd;
	}
}

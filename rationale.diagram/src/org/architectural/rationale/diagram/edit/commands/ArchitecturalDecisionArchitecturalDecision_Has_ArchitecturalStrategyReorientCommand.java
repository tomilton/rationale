package org.architectural.rationale.diagram.edit.commands;

import org.architectural.rationale.ArchitecturalDecision;
import org.architectural.rationale.ArchitecturalStrategy;
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
public class ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyReorientCommand
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
	public ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyReorientCommand(
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
		if (!(oldEnd instanceof ArchitecturalStrategy && newEnd instanceof ArchitecturalDecision)) {
			return false;
		}
		return RationaleBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007(
						getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ArchitecturalStrategy && newEnd instanceof ArchitecturalStrategy)) {
			return false;
		}
		return RationaleBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007(
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
		getOldSource().getArchitecturalDecision_Has_ArchitecturalStrategy()
				.remove(getOldTarget());
		getNewSource().getArchitecturalDecision_Has_ArchitecturalStrategy()
				.add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getArchitecturalDecision_Has_ArchitecturalStrategy()
				.remove(getOldTarget());
		getOldSource().getArchitecturalDecision_Has_ArchitecturalStrategy()
				.add(getNewTarget());
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
	protected ArchitecturalStrategy getOldTarget() {
		return (ArchitecturalStrategy) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ArchitecturalStrategy getNewTarget() {
		return (ArchitecturalStrategy) newEnd;
	}
}

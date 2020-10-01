package org.architectural.rationale.diagram.edit.policies;

import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticItemSemanticEditPolicy
		extends RationaleBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticItemSemanticEditPolicy() {
		super(
				RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}

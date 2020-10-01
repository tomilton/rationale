package org.architectural.rationale.diagram.edit.policies;

import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class RationaleRationale_Has_ArchitecturalDecisionItemSemanticEditPolicy
		extends RationaleBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RationaleRationale_Has_ArchitecturalDecisionItemSemanticEditPolicy() {
		super(
				RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}

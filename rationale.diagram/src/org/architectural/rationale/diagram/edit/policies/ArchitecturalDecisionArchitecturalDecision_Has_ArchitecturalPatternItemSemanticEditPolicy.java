package org.architectural.rationale.diagram.edit.policies;

import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternItemSemanticEditPolicy
		extends RationaleBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternItemSemanticEditPolicy() {
		super(
				RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}

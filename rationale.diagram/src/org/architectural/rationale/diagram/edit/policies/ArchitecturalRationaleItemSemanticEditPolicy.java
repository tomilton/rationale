package org.architectural.rationale.diagram.edit.policies;

import org.architectural.rationale.diagram.edit.commands.AlternativeCreateCommand;
import org.architectural.rationale.diagram.edit.commands.ArchitecturalDecisionCreateCommand;
import org.architectural.rationale.diagram.edit.commands.ArchitecturalPatternCreateCommand;
import org.architectural.rationale.diagram.edit.commands.ArchitecturalStrategyCreateCommand;
import org.architectural.rationale.diagram.edit.commands.ArchitecturalTacticCreateCommand;
import org.architectural.rationale.diagram.edit.commands.ConsequenceCreateCommand;
import org.architectural.rationale.diagram.edit.commands.ContextCreateCommand;
import org.architectural.rationale.diagram.edit.commands.JustificationCreateCommand;
import org.architectural.rationale.diagram.edit.commands.RationaleCreateCommand;
import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ArchitecturalRationaleItemSemanticEditPolicy extends
		RationaleBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArchitecturalRationaleItemSemanticEditPolicy() {
		super(RationaleElementTypes.ArchitecturalRationale_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RationaleElementTypes.Justification_2001 == req.getElementType()) {
			return getGEFWrapper(new JustificationCreateCommand(req));
		}
		if (RationaleElementTypes.ArchitecturalTactic_2002 == req
				.getElementType()) {
			return getGEFWrapper(new ArchitecturalTacticCreateCommand(req));
		}
		if (RationaleElementTypes.ArchitecturalStrategy_2003 == req
				.getElementType()) {
			return getGEFWrapper(new ArchitecturalStrategyCreateCommand(req));
		}
		if (RationaleElementTypes.ArchitecturalDecision_2004 == req
				.getElementType()) {
			return getGEFWrapper(new ArchitecturalDecisionCreateCommand(req));
		}
		if (RationaleElementTypes.Alternative_2005 == req.getElementType()) {
			return getGEFWrapper(new AlternativeCreateCommand(req));
		}
		if (RationaleElementTypes.ArchitecturalPattern_2006 == req
				.getElementType()) {
			return getGEFWrapper(new ArchitecturalPatternCreateCommand(req));
		}
		if (RationaleElementTypes.Rationale_2007 == req.getElementType()) {
			return getGEFWrapper(new RationaleCreateCommand(req));
		}
		if (RationaleElementTypes.Context_2008 == req.getElementType()) {
			return getGEFWrapper(new ContextCreateCommand(req));
		}
		if (RationaleElementTypes.Consequence_2009 == req.getElementType()) {
			return getGEFWrapper(new ConsequenceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}

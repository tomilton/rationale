package org.architectural.rationale.diagram.edit.policies;

import java.util.Iterator;

import org.architectural.rationale.diagram.edit.commands.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternCreateCommand;
import org.architectural.rationale.diagram.edit.commands.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternReorientCommand;
import org.architectural.rationale.diagram.edit.commands.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyCreateCommand;
import org.architectural.rationale.diagram.edit.commands.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyReorientCommand;
import org.architectural.rationale.diagram.edit.commands.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticCreateCommand;
import org.architectural.rationale.diagram.edit.commands.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticReorientCommand;
import org.architectural.rationale.diagram.edit.commands.RationaleRationale_Has_ArchitecturalDecisionCreateCommand;
import org.architectural.rationale.diagram.edit.commands.RationaleRationale_Has_ArchitecturalDecisionReorientCommand;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_ArchitecturalDecisionEditPart;
import org.architectural.rationale.diagram.part.RationaleVisualIDRegistry;
import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ArchitecturalDecisionItemSemanticEditPolicy extends
		RationaleBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArchitecturalDecisionItemSemanticEditPolicy() {
		super(RationaleElementTypes.ArchitecturalDecision_2004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (RationaleVisualIDRegistry.getVisualID(incomingLink) == RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (RationaleVisualIDRegistry.getVisualID(outgoingLink) == ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RationaleVisualIDRegistry.getVisualID(outgoingLink) == ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RationaleVisualIDRegistry.getVisualID(outgoingLink) == ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001 == req
				.getElementType()) {
			return getGEFWrapper(new ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004 == req
				.getElementType()) {
			return getGEFWrapper(new ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006 == req
				.getElementType()) {
			return null;
		}
		if (RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007 == req
				.getElementType()) {
			return getGEFWrapper(new ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001 == req
				.getElementType()) {
			return null;
		}
		if (RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004 == req
				.getElementType()) {
			return null;
		}
		if (RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006 == req
				.getElementType()) {
			return getGEFWrapper(new RationaleRationale_Has_ArchitecturalDecisionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart.VISUAL_ID:
			return getGEFWrapper(new ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticReorientCommand(
					req));
		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart.VISUAL_ID:
			return getGEFWrapper(new ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternReorientCommand(
					req));
		case RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID:
			return getGEFWrapper(new RationaleRationale_Has_ArchitecturalDecisionReorientCommand(
					req));
		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart.VISUAL_ID:
			return getGEFWrapper(new ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}

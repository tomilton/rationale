package org.architectural.rationale.diagram.edit.policies;

import java.util.Iterator;

import org.architectural.rationale.diagram.edit.commands.RationaleRationale_Has_AlternativeCreateCommand;
import org.architectural.rationale.diagram.edit.commands.RationaleRationale_Has_AlternativeReorientCommand;
import org.architectural.rationale.diagram.edit.commands.RationaleRationale_Has_ArchitecturalDecisionCreateCommand;
import org.architectural.rationale.diagram.edit.commands.RationaleRationale_Has_ArchitecturalDecisionReorientCommand;
import org.architectural.rationale.diagram.edit.commands.RationaleRationale_Has_ConsequenceCreateCommand;
import org.architectural.rationale.diagram.edit.commands.RationaleRationale_Has_ConsequenceReorientCommand;
import org.architectural.rationale.diagram.edit.commands.RationaleRationale_Has_ContextCreateCommand;
import org.architectural.rationale.diagram.edit.commands.RationaleRationale_Has_ContextReorientCommand;
import org.architectural.rationale.diagram.edit.commands.RationaleRationale_Has_JustificationCreateCommand;
import org.architectural.rationale.diagram.edit.commands.RationaleRationale_Has_JustificationReorientCommand;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_AlternativeEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_ArchitecturalDecisionEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_ConsequenceEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_ContextEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_JustificationEditPart;
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
public class RationaleItemSemanticEditPolicy extends
		RationaleBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RationaleItemSemanticEditPolicy() {
		super(RationaleElementTypes.Rationale_2007);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (RationaleVisualIDRegistry.getVisualID(outgoingLink) == RationaleRationale_Has_ContextEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RationaleVisualIDRegistry.getVisualID(outgoingLink) == RationaleRationale_Has_JustificationEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RationaleVisualIDRegistry.getVisualID(outgoingLink) == RationaleRationale_Has_AlternativeEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RationaleVisualIDRegistry.getVisualID(outgoingLink) == RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (RationaleVisualIDRegistry.getVisualID(outgoingLink) == RationaleRationale_Has_ConsequenceEditPart.VISUAL_ID) {
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
		if (RationaleElementTypes.RationaleRationale_Has_Context_4002 == req
				.getElementType()) {
			return getGEFWrapper(new RationaleRationale_Has_ContextCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (RationaleElementTypes.RationaleRationale_Has_Justification_4003 == req
				.getElementType()) {
			return getGEFWrapper(new RationaleRationale_Has_JustificationCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (RationaleElementTypes.RationaleRationale_Has_Alternative_4005 == req
				.getElementType()) {
			return getGEFWrapper(new RationaleRationale_Has_AlternativeCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006 == req
				.getElementType()) {
			return getGEFWrapper(new RationaleRationale_Has_ArchitecturalDecisionCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (RationaleElementTypes.RationaleRationale_Has_Consequence_4008 == req
				.getElementType()) {
			return getGEFWrapper(new RationaleRationale_Has_ConsequenceCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RationaleElementTypes.RationaleRationale_Has_Context_4002 == req
				.getElementType()) {
			return null;
		}
		if (RationaleElementTypes.RationaleRationale_Has_Justification_4003 == req
				.getElementType()) {
			return null;
		}
		if (RationaleElementTypes.RationaleRationale_Has_Alternative_4005 == req
				.getElementType()) {
			return null;
		}
		if (RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006 == req
				.getElementType()) {
			return null;
		}
		if (RationaleElementTypes.RationaleRationale_Has_Consequence_4008 == req
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
		case RationaleRationale_Has_ContextEditPart.VISUAL_ID:
			return getGEFWrapper(new RationaleRationale_Has_ContextReorientCommand(
					req));
		case RationaleRationale_Has_JustificationEditPart.VISUAL_ID:
			return getGEFWrapper(new RationaleRationale_Has_JustificationReorientCommand(
					req));
		case RationaleRationale_Has_AlternativeEditPart.VISUAL_ID:
			return getGEFWrapper(new RationaleRationale_Has_AlternativeReorientCommand(
					req));
		case RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID:
			return getGEFWrapper(new RationaleRationale_Has_ArchitecturalDecisionReorientCommand(
					req));
		case RationaleRationale_Has_ConsequenceEditPart.VISUAL_ID:
			return getGEFWrapper(new RationaleRationale_Has_ConsequenceReorientCommand(
					req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}

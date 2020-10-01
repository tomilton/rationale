package org.architectural.rationale.diagram.edit.parts;

import org.architectural.rationale.diagram.part.RationaleVisualIDRegistry;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class RationaleEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (RationaleVisualIDRegistry.getVisualID(view)) {

			case ArchitecturalRationaleEditPart.VISUAL_ID:
				return new ArchitecturalRationaleEditPart(view);

			case JustificationEditPart.VISUAL_ID:
				return new JustificationEditPart(view);

			case JustificationJustificationNameEditPart.VISUAL_ID:
				return new JustificationJustificationNameEditPart(view);

			case ArchitecturalTacticEditPart.VISUAL_ID:
				return new ArchitecturalTacticEditPart(view);

			case ArchitecturalTacticArchitecturalTacticNameEditPart.VISUAL_ID:
				return new ArchitecturalTacticArchitecturalTacticNameEditPart(
						view);

			case ArchitecturalStrategyEditPart.VISUAL_ID:
				return new ArchitecturalStrategyEditPart(view);

			case ArchitecturalStrategyArchitecturalStrategyNaEditPart.VISUAL_ID:
				return new ArchitecturalStrategyArchitecturalStrategyNaEditPart(
						view);

			case ArchitecturalDecisionEditPart.VISUAL_ID:
				return new ArchitecturalDecisionEditPart(view);

			case ArchitecturalDecisionArchitecturalDecisionNaEditPart.VISUAL_ID:
				return new ArchitecturalDecisionArchitecturalDecisionNaEditPart(
						view);

			case AlternativeEditPart.VISUAL_ID:
				return new AlternativeEditPart(view);

			case AlternativeAlternativeNameEditPart.VISUAL_ID:
				return new AlternativeAlternativeNameEditPart(view);

			case ArchitecturalPatternEditPart.VISUAL_ID:
				return new ArchitecturalPatternEditPart(view);

			case ArchitecturalPatternArchitecturalPatternNamEditPart.VISUAL_ID:
				return new ArchitecturalPatternArchitecturalPatternNamEditPart(
						view);

			case RationaleEditPart.VISUAL_ID:
				return new RationaleEditPart(view);

			case RationaleRationaleNameEditPart.VISUAL_ID:
				return new RationaleRationaleNameEditPart(view);

			case ContextEditPart.VISUAL_ID:
				return new ContextEditPart(view);

			case ContextContextNameEditPart.VISUAL_ID:
				return new ContextContextNameEditPart(view);

			case ConsequenceEditPart.VISUAL_ID:
				return new ConsequenceEditPart(view);

			case ConsequenceConsequenceNameEditPart.VISUAL_ID:
				return new ConsequenceConsequenceNameEditPart(view);

			case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart.VISUAL_ID:
				return new ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart(
						view);

			case RationaleRationale_Has_ContextEditPart.VISUAL_ID:
				return new RationaleRationale_Has_ContextEditPart(view);

			case RationaleRationale_Has_JustificationEditPart.VISUAL_ID:
				return new RationaleRationale_Has_JustificationEditPart(view);

			case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart.VISUAL_ID:
				return new ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart(
						view);

			case RationaleRationale_Has_AlternativeEditPart.VISUAL_ID:
				return new RationaleRationale_Has_AlternativeEditPart(view);

			case RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID:
				return new RationaleRationale_Has_ArchitecturalDecisionEditPart(
						view);

			case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart.VISUAL_ID:
				return new ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart(
						view);

			case RationaleRationale_Has_ConsequenceEditPart.VISUAL_ID:
				return new RationaleRationale_Has_ConsequenceEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}

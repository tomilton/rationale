package org.architectural.rationale.diagram.part;

import org.architectural.rationale.ArchitecturalRationale;
import org.architectural.rationale.RationalePackage;
import org.architectural.rationale.diagram.edit.parts.AlternativeAlternativeNameEditPart;
import org.architectural.rationale.diagram.edit.parts.AlternativeEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionArchitecturalDecisionNaEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalPatternArchitecturalPatternNamEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalPatternEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalRationaleEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalStrategyArchitecturalStrategyNaEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalStrategyEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalTacticArchitecturalTacticNameEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalTacticEditPart;
import org.architectural.rationale.diagram.edit.parts.ConsequenceConsequenceNameEditPart;
import org.architectural.rationale.diagram.edit.parts.ConsequenceEditPart;
import org.architectural.rationale.diagram.edit.parts.ContextContextNameEditPart;
import org.architectural.rationale.diagram.edit.parts.ContextEditPart;
import org.architectural.rationale.diagram.edit.parts.JustificationEditPart;
import org.architectural.rationale.diagram.edit.parts.JustificationJustificationNameEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationaleNameEditPart;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RationaleVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "rationale.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ArchitecturalRationaleEditPart.MODEL_ID.equals(view.getType())) {
				return ArchitecturalRationaleEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.architectural.rationale.diagram.part.RationaleVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				RationaleDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (RationalePackage.eINSTANCE.getArchitecturalRationale()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ArchitecturalRationale) domainElement)) {
			return ArchitecturalRationaleEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.architectural.rationale.diagram.part.RationaleVisualIDRegistry
				.getModelID(containerView);
		if (!ArchitecturalRationaleEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ArchitecturalRationaleEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.architectural.rationale.diagram.part.RationaleVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArchitecturalRationaleEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ArchitecturalRationaleEditPart.VISUAL_ID:
			if (RationalePackage.eINSTANCE.getJustification().isSuperTypeOf(
					domainElement.eClass())) {
				return JustificationEditPart.VISUAL_ID;
			}
			if (RationalePackage.eINSTANCE.getArchitecturalTactic()
					.isSuperTypeOf(domainElement.eClass())) {
				return ArchitecturalTacticEditPart.VISUAL_ID;
			}
			if (RationalePackage.eINSTANCE.getArchitecturalStrategy()
					.isSuperTypeOf(domainElement.eClass())) {
				return ArchitecturalStrategyEditPart.VISUAL_ID;
			}
			if (RationalePackage.eINSTANCE.getArchitecturalDecision()
					.isSuperTypeOf(domainElement.eClass())) {
				return ArchitecturalDecisionEditPart.VISUAL_ID;
			}
			if (RationalePackage.eINSTANCE.getAlternative().isSuperTypeOf(
					domainElement.eClass())) {
				return AlternativeEditPart.VISUAL_ID;
			}
			if (RationalePackage.eINSTANCE.getArchitecturalPattern()
					.isSuperTypeOf(domainElement.eClass())) {
				return ArchitecturalPatternEditPart.VISUAL_ID;
			}
			if (RationalePackage.eINSTANCE.getRationale().isSuperTypeOf(
					domainElement.eClass())) {
				return RationaleEditPart.VISUAL_ID;
			}
			if (RationalePackage.eINSTANCE.getContext().isSuperTypeOf(
					domainElement.eClass())) {
				return ContextEditPart.VISUAL_ID;
			}
			if (RationalePackage.eINSTANCE.getConsequence().isSuperTypeOf(
					domainElement.eClass())) {
				return ConsequenceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.architectural.rationale.diagram.part.RationaleVisualIDRegistry
				.getModelID(containerView);
		if (!ArchitecturalRationaleEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ArchitecturalRationaleEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.architectural.rationale.diagram.part.RationaleVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArchitecturalRationaleEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ArchitecturalRationaleEditPart.VISUAL_ID:
			if (JustificationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArchitecturalTacticEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArchitecturalStrategyEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArchitecturalDecisionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AlternativeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArchitecturalPatternEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (RationaleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConsequenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JustificationEditPart.VISUAL_ID:
			if (JustificationJustificationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArchitecturalTacticEditPart.VISUAL_ID:
			if (ArchitecturalTacticArchitecturalTacticNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArchitecturalStrategyEditPart.VISUAL_ID:
			if (ArchitecturalStrategyArchitecturalStrategyNaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArchitecturalDecisionEditPart.VISUAL_ID:
			if (ArchitecturalDecisionArchitecturalDecisionNaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AlternativeEditPart.VISUAL_ID:
			if (AlternativeAlternativeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArchitecturalPatternEditPart.VISUAL_ID:
			if (ArchitecturalPatternArchitecturalPatternNamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RationaleEditPart.VISUAL_ID:
			if (RationaleRationaleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContextEditPart.VISUAL_ID:
			if (ContextContextNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConsequenceEditPart.VISUAL_ID:
			if (ConsequenceConsequenceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ArchitecturalRationale element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ArchitecturalRationaleEditPart.VISUAL_ID:
			return false;
		case JustificationEditPart.VISUAL_ID:
		case ArchitecturalTacticEditPart.VISUAL_ID:
		case ArchitecturalStrategyEditPart.VISUAL_ID:
		case ArchitecturalDecisionEditPart.VISUAL_ID:
		case AlternativeEditPart.VISUAL_ID:
		case ArchitecturalPatternEditPart.VISUAL_ID:
		case RationaleEditPart.VISUAL_ID:
		case ContextEditPart.VISUAL_ID:
		case ConsequenceEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return org.architectural.rationale.diagram.part.RationaleVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return org.architectural.rationale.diagram.part.RationaleVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.architectural.rationale.diagram.part.RationaleVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return org.architectural.rationale.diagram.part.RationaleVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return org.architectural.rationale.diagram.part.RationaleVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.architectural.rationale.diagram.part.RationaleVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}

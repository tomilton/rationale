package org.architectural.rationale.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.architectural.rationale.Alternative;
import org.architectural.rationale.ArchitecturalDecision;
import org.architectural.rationale.ArchitecturalPattern;
import org.architectural.rationale.ArchitecturalRationale;
import org.architectural.rationale.ArchitecturalStrategy;
import org.architectural.rationale.ArchitecturalTactic;
import org.architectural.rationale.Consequence;
import org.architectural.rationale.Context;
import org.architectural.rationale.Justification;
import org.architectural.rationale.Rationale;
import org.architectural.rationale.RationalePackage;
import org.architectural.rationale.diagram.edit.parts.AlternativeEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalPatternEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalRationaleEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalStrategyEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalTacticEditPart;
import org.architectural.rationale.diagram.edit.parts.ConsequenceEditPart;
import org.architectural.rationale.diagram.edit.parts.ContextEditPart;
import org.architectural.rationale.diagram.edit.parts.JustificationEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_AlternativeEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_ArchitecturalDecisionEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_ConsequenceEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_ContextEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_JustificationEditPart;
import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class RationaleDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<RationaleNodeDescriptor> getSemanticChildren(View view) {
		switch (RationaleVisualIDRegistry.getVisualID(view)) {
		case ArchitecturalRationaleEditPart.VISUAL_ID:
			return getArchitecturalRationale_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleNodeDescriptor> getArchitecturalRationale_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ArchitecturalRationale modelElement = (ArchitecturalRationale) view
				.getElement();
		LinkedList<RationaleNodeDescriptor> result = new LinkedList<RationaleNodeDescriptor>();
		for (Iterator<?> it = modelElement.getA_Have_J().iterator(); it
				.hasNext();) {
			Justification childElement = (Justification) it.next();
			int visualID = RationaleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JustificationEditPart.VISUAL_ID) {
				result.add(new RationaleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getA_Have_T().iterator(); it
				.hasNext();) {
			ArchitecturalTactic childElement = (ArchitecturalTactic) it.next();
			int visualID = RationaleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArchitecturalTacticEditPart.VISUAL_ID) {
				result.add(new RationaleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getA_Have_S().iterator(); it
				.hasNext();) {
			ArchitecturalStrategy childElement = (ArchitecturalStrategy) it
					.next();
			int visualID = RationaleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArchitecturalStrategyEditPart.VISUAL_ID) {
				result.add(new RationaleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getA_Have_Ad().iterator(); it
				.hasNext();) {
			ArchitecturalDecision childElement = (ArchitecturalDecision) it
					.next();
			int visualID = RationaleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArchitecturalDecisionEditPart.VISUAL_ID) {
				result.add(new RationaleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getA_Have_A().iterator(); it
				.hasNext();) {
			Alternative childElement = (Alternative) it.next();
			int visualID = RationaleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == AlternativeEditPart.VISUAL_ID) {
				result.add(new RationaleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getA_Have_P().iterator(); it
				.hasNext();) {
			ArchitecturalPattern childElement = (ArchitecturalPattern) it
					.next();
			int visualID = RationaleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ArchitecturalPatternEditPart.VISUAL_ID) {
				result.add(new RationaleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getA_Have_R().iterator(); it
				.hasNext();) {
			Rationale childElement = (Rationale) it.next();
			int visualID = RationaleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RationaleEditPart.VISUAL_ID) {
				result.add(new RationaleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getA_Have_C().iterator(); it
				.hasNext();) {
			Context childElement = (Context) it.next();
			int visualID = RationaleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ContextEditPart.VISUAL_ID) {
				result.add(new RationaleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getA_Have_Cq().iterator(); it
				.hasNext();) {
			Consequence childElement = (Consequence) it.next();
			int visualID = RationaleVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConsequenceEditPart.VISUAL_ID) {
				result.add(new RationaleNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getContainedLinks(View view) {
		switch (RationaleVisualIDRegistry.getVisualID(view)) {
		case ArchitecturalRationaleEditPart.VISUAL_ID:
			return getArchitecturalRationale_1000ContainedLinks(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2001ContainedLinks(view);
		case ArchitecturalTacticEditPart.VISUAL_ID:
			return getArchitecturalTactic_2002ContainedLinks(view);
		case ArchitecturalStrategyEditPart.VISUAL_ID:
			return getArchitecturalStrategy_2003ContainedLinks(view);
		case ArchitecturalDecisionEditPart.VISUAL_ID:
			return getArchitecturalDecision_2004ContainedLinks(view);
		case AlternativeEditPart.VISUAL_ID:
			return getAlternative_2005ContainedLinks(view);
		case ArchitecturalPatternEditPart.VISUAL_ID:
			return getArchitecturalPattern_2006ContainedLinks(view);
		case RationaleEditPart.VISUAL_ID:
			return getRationale_2007ContainedLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2008ContainedLinks(view);
		case ConsequenceEditPart.VISUAL_ID:
			return getConsequence_2009ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getIncomingLinks(View view) {
		switch (RationaleVisualIDRegistry.getVisualID(view)) {
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2001IncomingLinks(view);
		case ArchitecturalTacticEditPart.VISUAL_ID:
			return getArchitecturalTactic_2002IncomingLinks(view);
		case ArchitecturalStrategyEditPart.VISUAL_ID:
			return getArchitecturalStrategy_2003IncomingLinks(view);
		case ArchitecturalDecisionEditPart.VISUAL_ID:
			return getArchitecturalDecision_2004IncomingLinks(view);
		case AlternativeEditPart.VISUAL_ID:
			return getAlternative_2005IncomingLinks(view);
		case ArchitecturalPatternEditPart.VISUAL_ID:
			return getArchitecturalPattern_2006IncomingLinks(view);
		case RationaleEditPart.VISUAL_ID:
			return getRationale_2007IncomingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2008IncomingLinks(view);
		case ConsequenceEditPart.VISUAL_ID:
			return getConsequence_2009IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getOutgoingLinks(View view) {
		switch (RationaleVisualIDRegistry.getVisualID(view)) {
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2001OutgoingLinks(view);
		case ArchitecturalTacticEditPart.VISUAL_ID:
			return getArchitecturalTactic_2002OutgoingLinks(view);
		case ArchitecturalStrategyEditPart.VISUAL_ID:
			return getArchitecturalStrategy_2003OutgoingLinks(view);
		case ArchitecturalDecisionEditPart.VISUAL_ID:
			return getArchitecturalDecision_2004OutgoingLinks(view);
		case AlternativeEditPart.VISUAL_ID:
			return getAlternative_2005OutgoingLinks(view);
		case ArchitecturalPatternEditPart.VISUAL_ID:
			return getArchitecturalPattern_2006OutgoingLinks(view);
		case RationaleEditPart.VISUAL_ID:
			return getRationale_2007OutgoingLinks(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2008OutgoingLinks(view);
		case ConsequenceEditPart.VISUAL_ID:
			return getConsequence_2009OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalRationale_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getJustification_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalTactic_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalStrategy_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalDecision_2004ContainedLinks(
			View view) {
		ArchitecturalDecision modelElement = (ArchitecturalDecision) view
				.getElement();
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalTactic_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalPattern_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalStrategy_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getAlternative_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalPattern_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getRationale_2007ContainedLinks(
			View view) {
		Rationale modelElement = (Rationale) view.getElement();
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_Context_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_Justification_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_Alternative_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_ArchitecturalDecision_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_Consequence_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getContext_2008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getConsequence_2009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getJustification_2001IncomingLinks(
			View view) {
		Justification modelElement = (Justification) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rationale_Rationale_Has_Justification_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalTactic_2002IncomingLinks(
			View view) {
		ArchitecturalTactic modelElement = (ArchitecturalTactic) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalTactic_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalStrategy_2003IncomingLinks(
			View view) {
		ArchitecturalStrategy modelElement = (ArchitecturalStrategy) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalStrategy_4007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalDecision_2004IncomingLinks(
			View view) {
		ArchitecturalDecision modelElement = (ArchitecturalDecision) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rationale_Rationale_Has_ArchitecturalDecision_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getAlternative_2005IncomingLinks(
			View view) {
		Alternative modelElement = (Alternative) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rationale_Rationale_Has_Alternative_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalPattern_2006IncomingLinks(
			View view) {
		ArchitecturalPattern modelElement = (ArchitecturalPattern) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalPattern_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getRationale_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getContext_2008IncomingLinks(
			View view) {
		Context modelElement = (Context) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rationale_Rationale_Has_Context_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getConsequence_2009IncomingLinks(
			View view) {
		Consequence modelElement = (Consequence) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rationale_Rationale_Has_Consequence_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getJustification_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalTactic_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalStrategy_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalDecision_2004OutgoingLinks(
			View view) {
		ArchitecturalDecision modelElement = (ArchitecturalDecision) view
				.getElement();
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalTactic_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalPattern_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalStrategy_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getAlternative_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getArchitecturalPattern_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getRationale_2007OutgoingLinks(
			View view) {
		Rationale modelElement = (Rationale) view.getElement();
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_Context_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_Justification_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_Alternative_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_ArchitecturalDecision_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_Consequence_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getContext_2008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RationaleLinkDescriptor> getConsequence_2009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getIncomingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalTactic_4001(
			ArchitecturalTactic target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RationalePackage.eINSTANCE
					.getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalTactic()) {
				result.add(new RationaleLinkDescriptor(
						setting.getEObject(),
						target,
						RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001,
						ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getIncomingFeatureModelFacetLinks_Rationale_Rationale_Has_Context_4002(
			Context target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RationalePackage.eINSTANCE
					.getRationale_Rationale_Has_Context()) {
				result.add(new RationaleLinkDescriptor(
						setting.getEObject(),
						target,
						RationaleElementTypes.RationaleRationale_Has_Context_4002,
						RationaleRationale_Has_ContextEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getIncomingFeatureModelFacetLinks_Rationale_Rationale_Has_Justification_4003(
			Justification target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RationalePackage.eINSTANCE
					.getRationale_Rationale_Has_Justification()) {
				result.add(new RationaleLinkDescriptor(
						setting.getEObject(),
						target,
						RationaleElementTypes.RationaleRationale_Has_Justification_4003,
						RationaleRationale_Has_JustificationEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getIncomingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalPattern_4004(
			ArchitecturalPattern target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RationalePackage.eINSTANCE
					.getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalPattern()) {
				result.add(new RationaleLinkDescriptor(
						setting.getEObject(),
						target,
						RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004,
						ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getIncomingFeatureModelFacetLinks_Rationale_Rationale_Has_Alternative_4005(
			Alternative target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RationalePackage.eINSTANCE
					.getRationale_Rationale_Has_Alternative()) {
				result.add(new RationaleLinkDescriptor(
						setting.getEObject(),
						target,
						RationaleElementTypes.RationaleRationale_Has_Alternative_4005,
						RationaleRationale_Has_AlternativeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getIncomingFeatureModelFacetLinks_Rationale_Rationale_Has_ArchitecturalDecision_4006(
			ArchitecturalDecision target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RationalePackage.eINSTANCE
					.getRationale_Rationale_Has_ArchitecturalDecision()) {
				result.add(new RationaleLinkDescriptor(
						setting.getEObject(),
						target,
						RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006,
						RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getIncomingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalStrategy_4007(
			ArchitecturalStrategy target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RationalePackage.eINSTANCE
					.getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalStrategy()) {
				result.add(new RationaleLinkDescriptor(
						setting.getEObject(),
						target,
						RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007,
						ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getIncomingFeatureModelFacetLinks_Rationale_Rationale_Has_Consequence_4008(
			Consequence target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RationalePackage.eINSTANCE
					.getRationale_Rationale_Has_Consequence()) {
				result.add(new RationaleLinkDescriptor(
						setting.getEObject(),
						target,
						RationaleElementTypes.RationaleRationale_Has_Consequence_4008,
						RationaleRationale_Has_ConsequenceEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getOutgoingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalTactic_4001(
			ArchitecturalDecision source) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		for (Iterator<?> destinations = source
				.getArchitecturalDecision_Has_ArchitecturalTactic().iterator(); destinations
				.hasNext();) {
			ArchitecturalTactic destination = (ArchitecturalTactic) destinations
					.next();
			result.add(new RationaleLinkDescriptor(
					source,
					destination,
					RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001,
					ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_Context_4002(
			Rationale source) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		Context destination = source.getRationale_Has_Context();
		if (destination == null) {
			return result;
		}
		result.add(new RationaleLinkDescriptor(source, destination,
				RationaleElementTypes.RationaleRationale_Has_Context_4002,
				RationaleRationale_Has_ContextEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_Justification_4003(
			Rationale source) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		for (Iterator<?> destinations = source.getRationale_Has_Justification()
				.iterator(); destinations.hasNext();) {
			Justification destination = (Justification) destinations.next();
			result.add(new RationaleLinkDescriptor(
					source,
					destination,
					RationaleElementTypes.RationaleRationale_Has_Justification_4003,
					RationaleRationale_Has_JustificationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getOutgoingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalPattern_4004(
			ArchitecturalDecision source) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		for (Iterator<?> destinations = source
				.getArchitecturalDecision_Has_ArchitecturalPattern().iterator(); destinations
				.hasNext();) {
			ArchitecturalPattern destination = (ArchitecturalPattern) destinations
					.next();
			result.add(new RationaleLinkDescriptor(
					source,
					destination,
					RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004,
					ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_Alternative_4005(
			Rationale source) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		Alternative destination = source.getRationale_Has_Alternative();
		if (destination == null) {
			return result;
		}
		result.add(new RationaleLinkDescriptor(source, destination,
				RationaleElementTypes.RationaleRationale_Has_Alternative_4005,
				RationaleRationale_Has_AlternativeEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_ArchitecturalDecision_4006(
			Rationale source) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		ArchitecturalDecision destination = source
				.getRationale_Has_ArchitecturalDecision();
		if (destination == null) {
			return result;
		}
		result.add(new RationaleLinkDescriptor(
				source,
				destination,
				RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006,
				RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getOutgoingFeatureModelFacetLinks_ArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalStrategy_4007(
			ArchitecturalDecision source) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		for (Iterator<?> destinations = source
				.getArchitecturalDecision_Has_ArchitecturalStrategy()
				.iterator(); destinations.hasNext();) {
			ArchitecturalStrategy destination = (ArchitecturalStrategy) destinations
					.next();
			result.add(new RationaleLinkDescriptor(
					source,
					destination,
					RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007,
					ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RationaleLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rationale_Rationale_Has_Consequence_4008(
			Rationale source) {
		LinkedList<RationaleLinkDescriptor> result = new LinkedList<RationaleLinkDescriptor>();
		for (Iterator<?> destinations = source.getRationale_Has_Consequence()
				.iterator(); destinations.hasNext();) {
			Consequence destination = (Consequence) destinations.next();
			result.add(new RationaleLinkDescriptor(
					source,
					destination,
					RationaleElementTypes.RationaleRationale_Has_Consequence_4008,
					RationaleRationale_Has_ConsequenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<RationaleNodeDescriptor> getSemanticChildren(View view) {
			return RationaleDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RationaleLinkDescriptor> getContainedLinks(View view) {
			return RationaleDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RationaleLinkDescriptor> getIncomingLinks(View view) {
			return RationaleDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<RationaleLinkDescriptor> getOutgoingLinks(View view) {
			return RationaleDiagramUpdater.getOutgoingLinks(view);
		}
	};

}

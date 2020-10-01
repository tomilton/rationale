package org.architectural.rationale.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.architectural.rationale.diagram.edit.parts.AlternativeEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionEditPart;
import org.architectural.rationale.diagram.edit.parts.ConsequenceEditPart;
import org.architectural.rationale.diagram.edit.parts.ContextEditPart;
import org.architectural.rationale.diagram.edit.parts.JustificationEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleEditPart;
import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.architectural.rationale.diagram.providers.RationaleModelingAssistantProvider;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class RationaleModelingAssistantProviderOfRationaleEditPart extends
		RationaleModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((RationaleEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(RationaleEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(5);
		types.add(RationaleElementTypes.RationaleRationale_Has_Context_4002);
		types.add(RationaleElementTypes.RationaleRationale_Has_Justification_4003);
		types.add(RationaleElementTypes.RationaleRationale_Has_Alternative_4005);
		types.add(RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006);
		types.add(RationaleElementTypes.RationaleRationale_Has_Consequence_4008);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(RationaleEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			RationaleEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ContextEditPart) {
			types.add(RationaleElementTypes.RationaleRationale_Has_Context_4002);
		}
		if (targetEditPart instanceof JustificationEditPart) {
			types.add(RationaleElementTypes.RationaleRationale_Has_Justification_4003);
		}
		if (targetEditPart instanceof AlternativeEditPart) {
			types.add(RationaleElementTypes.RationaleRationale_Has_Alternative_4005);
		}
		if (targetEditPart instanceof ArchitecturalDecisionEditPart) {
			types.add(RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006);
		}
		if (targetEditPart instanceof ConsequenceEditPart) {
			types.add(RationaleElementTypes.RationaleRationale_Has_Consequence_4008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((RationaleEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(RationaleEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == RationaleElementTypes.RationaleRationale_Has_Context_4002) {
			types.add(RationaleElementTypes.Context_2008);
		} else if (relationshipType == RationaleElementTypes.RationaleRationale_Has_Justification_4003) {
			types.add(RationaleElementTypes.Justification_2001);
		} else if (relationshipType == RationaleElementTypes.RationaleRationale_Has_Alternative_4005) {
			types.add(RationaleElementTypes.Alternative_2005);
		} else if (relationshipType == RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006) {
			types.add(RationaleElementTypes.ArchitecturalDecision_2004);
		} else if (relationshipType == RationaleElementTypes.RationaleRationale_Has_Consequence_4008) {
			types.add(RationaleElementTypes.Consequence_2009);
		}
		return types;
	}

}

package org.architectural.rationale.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalPatternEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalStrategyEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalTacticEditPart;
import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.architectural.rationale.diagram.providers.RationaleModelingAssistantProvider;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class RationaleModelingAssistantProviderOfArchitecturalDecisionEditPart
		extends RationaleModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((ArchitecturalDecisionEditPart) sourceEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSource(
			ArchitecturalDecisionEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001);
		types.add(RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004);
		types.add(RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007);
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
				(ArchitecturalDecisionEditPart) sourceEditPart, targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			ArchitecturalDecisionEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ArchitecturalTacticEditPart) {
			types.add(RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001);
		}
		if (targetEditPart instanceof ArchitecturalPatternEditPart) {
			types.add(RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004);
		}
		if (targetEditPart instanceof ArchitecturalStrategyEditPart) {
			types.add(RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007);
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
		return doGetTypesForTarget(
				(ArchitecturalDecisionEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForTarget(
			ArchitecturalDecisionEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001) {
			types.add(RationaleElementTypes.ArchitecturalTactic_2002);
		} else if (relationshipType == RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004) {
			types.add(RationaleElementTypes.ArchitecturalPattern_2006);
		} else if (relationshipType == RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007) {
			types.add(RationaleElementTypes.ArchitecturalStrategy_2003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ArchitecturalDecisionEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			ArchitecturalDecisionEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006);
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource(
				(ArchitecturalDecisionEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			ArchitecturalDecisionEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006) {
			types.add(RationaleElementTypes.Rationale_2007);
		}
		return types;
	}

}

package org.architectural.rationale.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.architectural.rationale.diagram.edit.parts.ArchitecturalStrategyEditPart;
import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.architectural.rationale.diagram.providers.RationaleModelingAssistantProvider;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class RationaleModelingAssistantProviderOfArchitecturalStrategyEditPart
		extends RationaleModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((ArchitecturalStrategyEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(
			ArchitecturalStrategyEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007);
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
				(ArchitecturalStrategyEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(
			ArchitecturalStrategyEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007) {
			types.add(RationaleElementTypes.ArchitecturalDecision_2004);
		}
		return types;
	}

}

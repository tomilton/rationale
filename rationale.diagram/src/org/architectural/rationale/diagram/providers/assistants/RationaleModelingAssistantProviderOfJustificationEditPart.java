package org.architectural.rationale.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.architectural.rationale.diagram.edit.parts.JustificationEditPart;
import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.architectural.rationale.diagram.providers.RationaleModelingAssistantProvider;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class RationaleModelingAssistantProviderOfJustificationEditPart extends
		RationaleModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((JustificationEditPart) targetEditPart);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetRelTypesOnTarget(JustificationEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(RationaleElementTypes.RationaleRationale_Has_Justification_4003);
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
		return doGetTypesForSource((JustificationEditPart) targetEditPart,
				relationshipType);
	}

	/**
	 * @generated
	 */
	public List<IElementType> doGetTypesForSource(JustificationEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == RationaleElementTypes.RationaleRationale_Has_Justification_4003) {
			types.add(RationaleElementTypes.Rationale_2007);
		}
		return types;
	}

}

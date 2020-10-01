package org.architectural.rationale.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.architectural.rationale.diagram.providers.RationaleModelingAssistantProvider;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class RationaleModelingAssistantProviderOfArchitecturalRationaleEditPart
		extends RationaleModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(9);
		types.add(RationaleElementTypes.Justification_2001);
		types.add(RationaleElementTypes.ArchitecturalTactic_2002);
		types.add(RationaleElementTypes.ArchitecturalStrategy_2003);
		types.add(RationaleElementTypes.ArchitecturalDecision_2004);
		types.add(RationaleElementTypes.Alternative_2005);
		types.add(RationaleElementTypes.ArchitecturalPattern_2006);
		types.add(RationaleElementTypes.Rationale_2007);
		types.add(RationaleElementTypes.Context_2008);
		types.add(RationaleElementTypes.Consequence_2009);
		return types;
	}

}

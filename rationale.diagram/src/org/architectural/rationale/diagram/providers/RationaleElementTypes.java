package org.architectural.rationale.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

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
import org.architectural.rationale.diagram.part.RationaleDiagramEditorPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class RationaleElementTypes {

	/**
	 * @generated
	 */
	private RationaleElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			RationaleDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ArchitecturalRationale_1000 = getElementType("rationale.diagram.ArchitecturalRationale_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Justification_2001 = getElementType("rationale.diagram.Justification_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArchitecturalTactic_2002 = getElementType("rationale.diagram.ArchitecturalTactic_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArchitecturalStrategy_2003 = getElementType("rationale.diagram.ArchitecturalStrategy_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArchitecturalDecision_2004 = getElementType("rationale.diagram.ArchitecturalDecision_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Alternative_2005 = getElementType("rationale.diagram.Alternative_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArchitecturalPattern_2006 = getElementType("rationale.diagram.ArchitecturalPattern_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Rationale_2007 = getElementType("rationale.diagram.Rationale_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Context_2008 = getElementType("rationale.diagram.Context_2008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Consequence_2009 = getElementType("rationale.diagram.Consequence_2009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001 = getElementType("rationale.diagram.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RationaleRationale_Has_Context_4002 = getElementType("rationale.diagram.RationaleRationale_Has_Context_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RationaleRationale_Has_Justification_4003 = getElementType("rationale.diagram.RationaleRationale_Has_Justification_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004 = getElementType("rationale.diagram.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RationaleRationale_Has_Alternative_4005 = getElementType("rationale.diagram.RationaleRationale_Has_Alternative_4005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RationaleRationale_Has_ArchitecturalDecision_4006 = getElementType("rationale.diagram.RationaleRationale_Has_ArchitecturalDecision_4006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007 = getElementType("rationale.diagram.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RationaleRationale_Has_Consequence_4008 = getElementType("rationale.diagram.RationaleRationale_Has_Consequence_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ArchitecturalRationale_1000,
					RationalePackage.eINSTANCE.getArchitecturalRationale());

			elements.put(Justification_2001,
					RationalePackage.eINSTANCE.getJustification());

			elements.put(ArchitecturalTactic_2002,
					RationalePackage.eINSTANCE.getArchitecturalTactic());

			elements.put(ArchitecturalStrategy_2003,
					RationalePackage.eINSTANCE.getArchitecturalStrategy());

			elements.put(ArchitecturalDecision_2004,
					RationalePackage.eINSTANCE.getArchitecturalDecision());

			elements.put(Alternative_2005,
					RationalePackage.eINSTANCE.getAlternative());

			elements.put(ArchitecturalPattern_2006,
					RationalePackage.eINSTANCE.getArchitecturalPattern());

			elements.put(Rationale_2007,
					RationalePackage.eINSTANCE.getRationale());

			elements.put(Context_2008, RationalePackage.eINSTANCE.getContext());

			elements.put(Consequence_2009,
					RationalePackage.eINSTANCE.getConsequence());

			elements.put(
					ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001,
					RationalePackage.eINSTANCE
							.getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalTactic());

			elements.put(RationaleRationale_Has_Context_4002,
					RationalePackage.eINSTANCE
							.getRationale_Rationale_Has_Context());

			elements.put(RationaleRationale_Has_Justification_4003,
					RationalePackage.eINSTANCE
							.getRationale_Rationale_Has_Justification());

			elements.put(
					ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004,
					RationalePackage.eINSTANCE
							.getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalPattern());

			elements.put(RationaleRationale_Has_Alternative_4005,
					RationalePackage.eINSTANCE
							.getRationale_Rationale_Has_Alternative());

			elements.put(RationaleRationale_Has_ArchitecturalDecision_4006,
					RationalePackage.eINSTANCE
							.getRationale_Rationale_Has_ArchitecturalDecision());

			elements.put(
					ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007,
					RationalePackage.eINSTANCE
							.getArchitecturalDecision_ArchitecturalDecision_Has_ArchitecturalStrategy());

			elements.put(RationaleRationale_Has_Consequence_4008,
					RationalePackage.eINSTANCE
							.getRationale_Rationale_Has_Consequence());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ArchitecturalRationale_1000);
			KNOWN_ELEMENT_TYPES.add(Justification_2001);
			KNOWN_ELEMENT_TYPES.add(ArchitecturalTactic_2002);
			KNOWN_ELEMENT_TYPES.add(ArchitecturalStrategy_2003);
			KNOWN_ELEMENT_TYPES.add(ArchitecturalDecision_2004);
			KNOWN_ELEMENT_TYPES.add(Alternative_2005);
			KNOWN_ELEMENT_TYPES.add(ArchitecturalPattern_2006);
			KNOWN_ELEMENT_TYPES.add(Rationale_2007);
			KNOWN_ELEMENT_TYPES.add(Context_2008);
			KNOWN_ELEMENT_TYPES.add(Consequence_2009);
			KNOWN_ELEMENT_TYPES
					.add(ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001);
			KNOWN_ELEMENT_TYPES.add(RationaleRationale_Has_Context_4002);
			KNOWN_ELEMENT_TYPES.add(RationaleRationale_Has_Justification_4003);
			KNOWN_ELEMENT_TYPES
					.add(ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004);
			KNOWN_ELEMENT_TYPES.add(RationaleRationale_Has_Alternative_4005);
			KNOWN_ELEMENT_TYPES
					.add(RationaleRationale_Has_ArchitecturalDecision_4006);
			KNOWN_ELEMENT_TYPES
					.add(ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007);
			KNOWN_ELEMENT_TYPES.add(RationaleRationale_Has_Consequence_4008);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ArchitecturalRationaleEditPart.VISUAL_ID:
			return ArchitecturalRationale_1000;
		case JustificationEditPart.VISUAL_ID:
			return Justification_2001;
		case ArchitecturalTacticEditPart.VISUAL_ID:
			return ArchitecturalTactic_2002;
		case ArchitecturalStrategyEditPart.VISUAL_ID:
			return ArchitecturalStrategy_2003;
		case ArchitecturalDecisionEditPart.VISUAL_ID:
			return ArchitecturalDecision_2004;
		case AlternativeEditPart.VISUAL_ID:
			return Alternative_2005;
		case ArchitecturalPatternEditPart.VISUAL_ID:
			return ArchitecturalPattern_2006;
		case RationaleEditPart.VISUAL_ID:
			return Rationale_2007;
		case ContextEditPart.VISUAL_ID:
			return Context_2008;
		case ConsequenceEditPart.VISUAL_ID:
			return Consequence_2009;
		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart.VISUAL_ID:
			return ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001;
		case RationaleRationale_Has_ContextEditPart.VISUAL_ID:
			return RationaleRationale_Has_Context_4002;
		case RationaleRationale_Has_JustificationEditPart.VISUAL_ID:
			return RationaleRationale_Has_Justification_4003;
		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart.VISUAL_ID:
			return ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004;
		case RationaleRationale_Has_AlternativeEditPart.VISUAL_ID:
			return RationaleRationale_Has_Alternative_4005;
		case RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID:
			return RationaleRationale_Has_ArchitecturalDecision_4006;
		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart.VISUAL_ID:
			return ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007;
		case RationaleRationale_Has_ConsequenceEditPart.VISUAL_ID:
			return RationaleRationale_Has_Consequence_4008;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return org.architectural.rationale.diagram.providers.RationaleElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.architectural.rationale.diagram.providers.RationaleElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.architectural.rationale.diagram.providers.RationaleElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}

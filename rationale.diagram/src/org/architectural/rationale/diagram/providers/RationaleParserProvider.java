package org.architectural.rationale.diagram.providers;

import org.architectural.rationale.RationalePackage;
import org.architectural.rationale.diagram.edit.parts.AlternativeAlternativeNameEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionArchitecturalDecisionNaEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalPatternArchitecturalPatternNamEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalStrategyArchitecturalStrategyNaEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalTacticArchitecturalTacticNameEditPart;
import org.architectural.rationale.diagram.edit.parts.ConsequenceConsequenceNameEditPart;
import org.architectural.rationale.diagram.edit.parts.ContextContextNameEditPart;
import org.architectural.rationale.diagram.edit.parts.JustificationJustificationNameEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationaleNameEditPart;
import org.architectural.rationale.diagram.parsers.MessageFormatParser;
import org.architectural.rationale.diagram.part.RationaleVisualIDRegistry;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class RationaleParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser justificationJustificationName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getJustificationJustificationName_5001Parser() {
		if (justificationJustificationName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { RationalePackage.eINSTANCE
					.getJustification_JustificationName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			justificationJustificationName_5001Parser = parser;
		}
		return justificationJustificationName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser architecturalTacticArchitecturalTacticName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getArchitecturalTacticArchitecturalTacticName_5002Parser() {
		if (architecturalTacticArchitecturalTacticName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { RationalePackage.eINSTANCE
					.getArchitecturalTactic_ArchitecturalTacticName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			architecturalTacticArchitecturalTacticName_5002Parser = parser;
		}
		return architecturalTacticArchitecturalTacticName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser architecturalStrategyArchitecturalStrategyName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getArchitecturalStrategyArchitecturalStrategyName_5003Parser() {
		if (architecturalStrategyArchitecturalStrategyName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { RationalePackage.eINSTANCE
					.getArchitecturalStrategy_ArchitecturalStrategyName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			architecturalStrategyArchitecturalStrategyName_5003Parser = parser;
		}
		return architecturalStrategyArchitecturalStrategyName_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser architecturalDecisionArchitecturalDecisionName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getArchitecturalDecisionArchitecturalDecisionName_5004Parser() {
		if (architecturalDecisionArchitecturalDecisionName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { RationalePackage.eINSTANCE
					.getArchitecturalDecision_ArchitecturalDecisionName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			architecturalDecisionArchitecturalDecisionName_5004Parser = parser;
		}
		return architecturalDecisionArchitecturalDecisionName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser alternativeAlternativeName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getAlternativeAlternativeName_5005Parser() {
		if (alternativeAlternativeName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { RationalePackage.eINSTANCE
					.getAlternative_AlternativeName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			alternativeAlternativeName_5005Parser = parser;
		}
		return alternativeAlternativeName_5005Parser;
	}

	/**
	 * @generated
	 */
	private IParser architecturalPatternArchitecturalPatternName_5006Parser;

	/**
	 * @generated
	 */
	private IParser getArchitecturalPatternArchitecturalPatternName_5006Parser() {
		if (architecturalPatternArchitecturalPatternName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { RationalePackage.eINSTANCE
					.getArchitecturalPattern_ArchitecturalPatternName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			architecturalPatternArchitecturalPatternName_5006Parser = parser;
		}
		return architecturalPatternArchitecturalPatternName_5006Parser;
	}

	/**
	 * @generated
	 */
	private IParser rationaleRationaleName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getRationaleRationaleName_5007Parser() {
		if (rationaleRationaleName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { RationalePackage.eINSTANCE
					.getRationale_RationaleName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			rationaleRationaleName_5007Parser = parser;
		}
		return rationaleRationaleName_5007Parser;
	}

	/**
	 * @generated
	 */
	private IParser contextContextName_5008Parser;

	/**
	 * @generated
	 */
	private IParser getContextContextName_5008Parser() {
		if (contextContextName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { RationalePackage.eINSTANCE
					.getContext_ContextName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contextContextName_5008Parser = parser;
		}
		return contextContextName_5008Parser;
	}

	/**
	 * @generated
	 */
	private IParser consequenceConsequenceName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getConsequenceConsequenceName_5009Parser() {
		if (consequenceConsequenceName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { RationalePackage.eINSTANCE
					.getConsequence_ConsequenceName() };
			MessageFormatParser parser = new MessageFormatParser(features);
			consequenceConsequenceName_5009Parser = parser;
		}
		return consequenceConsequenceName_5009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case JustificationJustificationNameEditPart.VISUAL_ID:
			return getJustificationJustificationName_5001Parser();
		case ArchitecturalTacticArchitecturalTacticNameEditPart.VISUAL_ID:
			return getArchitecturalTacticArchitecturalTacticName_5002Parser();
		case ArchitecturalStrategyArchitecturalStrategyNaEditPart.VISUAL_ID:
			return getArchitecturalStrategyArchitecturalStrategyName_5003Parser();
		case ArchitecturalDecisionArchitecturalDecisionNaEditPart.VISUAL_ID:
			return getArchitecturalDecisionArchitecturalDecisionName_5004Parser();
		case AlternativeAlternativeNameEditPart.VISUAL_ID:
			return getAlternativeAlternativeName_5005Parser();
		case ArchitecturalPatternArchitecturalPatternNamEditPart.VISUAL_ID:
			return getArchitecturalPatternArchitecturalPatternName_5006Parser();
		case RationaleRationaleNameEditPart.VISUAL_ID:
			return getRationaleRationaleName_5007Parser();
		case ContextContextNameEditPart.VISUAL_ID:
			return getContextContextName_5008Parser();
		case ConsequenceConsequenceNameEditPart.VISUAL_ID:
			return getConsequenceConsequenceName_5009Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(RationaleVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(RationaleVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (RationaleElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}

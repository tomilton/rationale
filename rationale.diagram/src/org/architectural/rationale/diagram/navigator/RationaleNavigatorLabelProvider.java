package org.architectural.rationale.diagram.navigator;

import org.architectural.rationale.ArchitecturalRationale;
import org.architectural.rationale.diagram.edit.parts.AlternativeAlternativeNameEditPart;
import org.architectural.rationale.diagram.edit.parts.AlternativeEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionArchitecturalDecisionNaEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart;
import org.architectural.rationale.diagram.edit.parts.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart;
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
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_AlternativeEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_ArchitecturalDecisionEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_ConsequenceEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_ContextEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleRationale_Has_JustificationEditPart;
import org.architectural.rationale.diagram.part.RationaleDiagramEditorPlugin;
import org.architectural.rationale.diagram.part.RationaleVisualIDRegistry;
import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.architectural.rationale.diagram.providers.RationaleParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class RationaleNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RationaleDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RationaleDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RationaleNavigatorItem
				&& !isOwnView(((RationaleNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RationaleNavigatorGroup) {
			RationaleNavigatorGroup group = (RationaleNavigatorGroup) element;
			return RationaleDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof RationaleNavigatorItem) {
			RationaleNavigatorItem navigatorItem = (RationaleNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (RationaleVisualIDRegistry.getVisualID(view)) {
		case ArchitecturalRationaleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://rationale/1.0?ArchitecturalRationale", RationaleElementTypes.ArchitecturalRationale_1000); //$NON-NLS-1$
		case JustificationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://rationale/1.0?Justification", RationaleElementTypes.Justification_2001); //$NON-NLS-1$
		case ArchitecturalTacticEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://rationale/1.0?ArchitecturalTactic", RationaleElementTypes.ArchitecturalTactic_2002); //$NON-NLS-1$
		case ArchitecturalStrategyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://rationale/1.0?ArchitecturalStrategy", RationaleElementTypes.ArchitecturalStrategy_2003); //$NON-NLS-1$
		case ArchitecturalDecisionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://rationale/1.0?ArchitecturalDecision", RationaleElementTypes.ArchitecturalDecision_2004); //$NON-NLS-1$
		case AlternativeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://rationale/1.0?Alternative", RationaleElementTypes.Alternative_2005); //$NON-NLS-1$
		case ArchitecturalPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://rationale/1.0?ArchitecturalPattern", RationaleElementTypes.ArchitecturalPattern_2006); //$NON-NLS-1$
		case RationaleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://rationale/1.0?Rationale", RationaleElementTypes.Rationale_2007); //$NON-NLS-1$
		case ContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://rationale/1.0?Context", RationaleElementTypes.Context_2008); //$NON-NLS-1$
		case ConsequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://rationale/1.0?Consequence", RationaleElementTypes.Consequence_2009); //$NON-NLS-1$
		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://rationale/1.0?ArchitecturalDecision?ArchitecturalDecision_Has_ArchitecturalTactic", RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001); //$NON-NLS-1$
		case RationaleRationale_Has_ContextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://rationale/1.0?Rationale?Rationale_Has_Context", RationaleElementTypes.RationaleRationale_Has_Context_4002); //$NON-NLS-1$
		case RationaleRationale_Has_JustificationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://rationale/1.0?Rationale?Rationale_Has_Justification", RationaleElementTypes.RationaleRationale_Has_Justification_4003); //$NON-NLS-1$
		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://rationale/1.0?ArchitecturalDecision?ArchitecturalDecision_Has_ArchitecturalPattern", RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004); //$NON-NLS-1$
		case RationaleRationale_Has_AlternativeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://rationale/1.0?Rationale?Rationale_Has_Alternative", RationaleElementTypes.RationaleRationale_Has_Alternative_4005); //$NON-NLS-1$
		case RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://rationale/1.0?Rationale?Rationale_Has_ArchitecturalDecision", RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006); //$NON-NLS-1$
		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://rationale/1.0?ArchitecturalDecision?ArchitecturalDecision_Has_ArchitecturalStrategy", RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007); //$NON-NLS-1$
		case RationaleRationale_Has_ConsequenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://rationale/1.0?Rationale?Rationale_Has_Consequence", RationaleElementTypes.RationaleRationale_Has_Consequence_4008); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RationaleDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& RationaleElementTypes.isKnownElementType(elementType)) {
			image = RationaleElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof RationaleNavigatorGroup) {
			RationaleNavigatorGroup group = (RationaleNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RationaleNavigatorItem) {
			RationaleNavigatorItem navigatorItem = (RationaleNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (RationaleVisualIDRegistry.getVisualID(view)) {
		case ArchitecturalRationaleEditPart.VISUAL_ID:
			return getArchitecturalRationale_1000Text(view);
		case JustificationEditPart.VISUAL_ID:
			return getJustification_2001Text(view);
		case ArchitecturalTacticEditPart.VISUAL_ID:
			return getArchitecturalTactic_2002Text(view);
		case ArchitecturalStrategyEditPart.VISUAL_ID:
			return getArchitecturalStrategy_2003Text(view);
		case ArchitecturalDecisionEditPart.VISUAL_ID:
			return getArchitecturalDecision_2004Text(view);
		case AlternativeEditPart.VISUAL_ID:
			return getAlternative_2005Text(view);
		case ArchitecturalPatternEditPart.VISUAL_ID:
			return getArchitecturalPattern_2006Text(view);
		case RationaleEditPart.VISUAL_ID:
			return getRationale_2007Text(view);
		case ContextEditPart.VISUAL_ID:
			return getContext_2008Text(view);
		case ConsequenceEditPart.VISUAL_ID:
			return getConsequence_2009Text(view);
		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart.VISUAL_ID:
			return getArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001Text(view);
		case RationaleRationale_Has_ContextEditPart.VISUAL_ID:
			return getRationaleRationale_Has_Context_4002Text(view);
		case RationaleRationale_Has_JustificationEditPart.VISUAL_ID:
			return getRationaleRationale_Has_Justification_4003Text(view);
		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart.VISUAL_ID:
			return getArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004Text(view);
		case RationaleRationale_Has_AlternativeEditPart.VISUAL_ID:
			return getRationaleRationale_Has_Alternative_4005Text(view);
		case RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID:
			return getRationaleRationale_Has_ArchitecturalDecision_4006Text(view);
		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart.VISUAL_ID:
			return getArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007Text(view);
		case RationaleRationale_Has_ConsequenceEditPart.VISUAL_ID:
			return getRationaleRationale_Has_Consequence_4008Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getArchitecturalRationale_1000Text(View view) {
		ArchitecturalRationale domainModelElement = (ArchitecturalRationale) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			RationaleDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJustification_2001Text(View view) {
		IParser parser = RationaleParserProvider
				.getParser(
						RationaleElementTypes.Justification_2001,
						view.getElement() != null ? view.getElement() : view,
						RationaleVisualIDRegistry
								.getType(JustificationJustificationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RationaleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArchitecturalTactic_2002Text(View view) {
		IParser parser = RationaleParserProvider
				.getParser(
						RationaleElementTypes.ArchitecturalTactic_2002,
						view.getElement() != null ? view.getElement() : view,
						RationaleVisualIDRegistry
								.getType(ArchitecturalTacticArchitecturalTacticNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RationaleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArchitecturalStrategy_2003Text(View view) {
		IParser parser = RationaleParserProvider
				.getParser(
						RationaleElementTypes.ArchitecturalStrategy_2003,
						view.getElement() != null ? view.getElement() : view,
						RationaleVisualIDRegistry
								.getType(ArchitecturalStrategyArchitecturalStrategyNaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RationaleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArchitecturalDecision_2004Text(View view) {
		IParser parser = RationaleParserProvider
				.getParser(
						RationaleElementTypes.ArchitecturalDecision_2004,
						view.getElement() != null ? view.getElement() : view,
						RationaleVisualIDRegistry
								.getType(ArchitecturalDecisionArchitecturalDecisionNaEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RationaleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAlternative_2005Text(View view) {
		IParser parser = RationaleParserProvider.getParser(
				RationaleElementTypes.Alternative_2005,
				view.getElement() != null ? view.getElement() : view,
				RationaleVisualIDRegistry
						.getType(AlternativeAlternativeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RationaleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArchitecturalPattern_2006Text(View view) {
		IParser parser = RationaleParserProvider
				.getParser(
						RationaleElementTypes.ArchitecturalPattern_2006,
						view.getElement() != null ? view.getElement() : view,
						RationaleVisualIDRegistry
								.getType(ArchitecturalPatternArchitecturalPatternNamEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RationaleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRationale_2007Text(View view) {
		IParser parser = RationaleParserProvider.getParser(
				RationaleElementTypes.Rationale_2007,
				view.getElement() != null ? view.getElement() : view,
				RationaleVisualIDRegistry
						.getType(RationaleRationaleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RationaleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getContext_2008Text(View view) {
		IParser parser = RationaleParserProvider.getParser(
				RationaleElementTypes.Context_2008,
				view.getElement() != null ? view.getElement() : view,
				RationaleVisualIDRegistry
						.getType(ContextContextNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RationaleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConsequence_2009Text(View view) {
		IParser parser = RationaleParserProvider.getParser(
				RationaleElementTypes.Consequence_2009,
				view.getElement() != null ? view.getElement() : view,
				RationaleVisualIDRegistry
						.getType(ConsequenceConsequenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RationaleDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001Text(
			View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRationaleRationale_Has_Context_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRationaleRationale_Has_Justification_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004Text(
			View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRationaleRationale_Has_Alternative_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRationaleRationale_Has_ArchitecturalDecision_4006Text(
			View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007Text(
			View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRationaleRationale_Has_Consequence_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ArchitecturalRationaleEditPart.MODEL_ID
				.equals(RationaleVisualIDRegistry.getModelID(view));
	}

}

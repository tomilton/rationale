package org.architectural.rationale.diagram.part;

import java.util.Collections;

import org.architectural.rationale.diagram.providers.RationaleElementTypes;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class RationalePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createRationale1Group());
	}

	/**
	 * Creates "rationale" palette tool group
	 * @generated
	 */
	private PaletteContainer createRationale1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Rationale1Group_title);
		paletteContainer.setId("createRationale1Group"); //$NON-NLS-1$
		paletteContainer.add(createJustification1CreationTool());
		paletteContainer.add(createArchitecturalTactic2CreationTool());
		paletteContainer.add(createArchitecturalStrategy3CreationTool());
		paletteContainer.add(createArchitecturalDecision4CreationTool());
		paletteContainer.add(createAlternative5CreationTool());
		paletteContainer.add(createArchitecturalPattern6CreationTool());
		paletteContainer.add(createRationale7CreationTool());
		paletteContainer.add(createContext8CreationTool());
		paletteContainer.add(createConsequence9CreationTool());
		paletteContainer.add(createRationaleHasContext10CreationTool());
		paletteContainer.add(createRationaleHasJustification11CreationTool());
		paletteContainer.add(createRationaleHasAlternative12CreationTool());
		paletteContainer.add(createRationaleHasConsequence13CreationTool());
		paletteContainer
				.add(createRationaleHasArchitecturalDecision14CreationTool());
		paletteContainer
				.add(createArchitecturalDecisionHasArchitecturalPattern15CreationTool());
		paletteContainer
				.add(createArchitecturalDecisionHasArchitecturalTactic16CreationTool());
		paletteContainer
				.add(createArchitecturalDecisionHasArchitecturalStrategy17CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJustification1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Justification1CreationTool_title,
				Messages.Justification1CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.Justification_2001));
		entry.setId("createJustification1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleElementTypes
				.getImageDescriptor(RationaleElementTypes.Justification_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArchitecturalTactic2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ArchitecturalTactic2CreationTool_title,
				Messages.ArchitecturalTactic2CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.ArchitecturalTactic_2002));
		entry.setId("createArchitecturalTactic2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleElementTypes
				.getImageDescriptor(RationaleElementTypes.ArchitecturalTactic_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArchitecturalStrategy3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ArchitecturalStrategy3CreationTool_title,
				Messages.ArchitecturalStrategy3CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.ArchitecturalStrategy_2003));
		entry.setId("createArchitecturalStrategy3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleElementTypes
				.getImageDescriptor(RationaleElementTypes.ArchitecturalStrategy_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArchitecturalDecision4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ArchitecturalDecision4CreationTool_title,
				Messages.ArchitecturalDecision4CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.ArchitecturalDecision_2004));
		entry.setId("createArchitecturalDecision4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleElementTypes
				.getImageDescriptor(RationaleElementTypes.ArchitecturalDecision_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAlternative5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Alternative5CreationTool_title,
				Messages.Alternative5CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.Alternative_2005));
		entry.setId("createAlternative5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleElementTypes
				.getImageDescriptor(RationaleElementTypes.Alternative_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArchitecturalPattern6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.ArchitecturalPattern6CreationTool_title,
				Messages.ArchitecturalPattern6CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.ArchitecturalPattern_2006));
		entry.setId("createArchitecturalPattern6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleElementTypes
				.getImageDescriptor(RationaleElementTypes.ArchitecturalPattern_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRationale7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Rationale7CreationTool_title,
				Messages.Rationale7CreationTool_desc,
				Collections.singletonList(RationaleElementTypes.Rationale_2007));
		entry.setId("createRationale7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleElementTypes
				.getImageDescriptor(RationaleElementTypes.Rationale_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContext8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Context8CreationTool_title,
				Messages.Context8CreationTool_desc,
				Collections.singletonList(RationaleElementTypes.Context_2008));
		entry.setId("createContext8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleElementTypes
				.getImageDescriptor(RationaleElementTypes.Context_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConsequence9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				Messages.Consequence9CreationTool_title,
				Messages.Consequence9CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.Consequence_2009));
		entry.setId("createConsequence9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleElementTypes
				.getImageDescriptor(RationaleElementTypes.Consequence_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRationaleHasContext10CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.RationaleHasContext10CreationTool_title,
				Messages.RationaleHasContext10CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.RationaleRationale_Has_Context_4002));
		entry.setId("createRationaleHasContext10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/Rationale_Has_Context.png")); //$NON-NLS-1$
		entry.setLargeIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/Rationale_Has_Context.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRationaleHasJustification11CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.RationaleHasJustification11CreationTool_title,
				Messages.RationaleHasJustification11CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.RationaleRationale_Has_Justification_4003));
		entry.setId("createRationaleHasJustification11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/Rationale_Has_Justification.png")); //$NON-NLS-1$
		entry.setLargeIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/Rationale_Has_Justification.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRationaleHasAlternative12CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.RationaleHasAlternative12CreationTool_title,
				Messages.RationaleHasAlternative12CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.RationaleRationale_Has_Alternative_4005));
		entry.setId("createRationaleHasAlternative12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/Rationale_Has_Alternative.png")); //$NON-NLS-1$
		entry.setLargeIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/Rationale_Has_Alternative.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRationaleHasConsequence13CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.RationaleHasConsequence13CreationTool_title,
				Messages.RationaleHasConsequence13CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.RationaleRationale_Has_Consequence_4008));
		entry.setId("createRationaleHasConsequence13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/Rationale_Has_Consequence.png")); //$NON-NLS-1$
		entry.setLargeIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/Rationale_Has_Consequence.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRationaleHasArchitecturalDecision14CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.RationaleHasArchitecturalDecision14CreationTool_title,
				Messages.RationaleHasArchitecturalDecision14CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.RationaleRationale_Has_ArchitecturalDecision_4006));
		entry.setId("createRationaleHasArchitecturalDecision14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/Rationale_Has_ArchitecturalDecision.png")); //$NON-NLS-1$
		entry.setLargeIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/Rationale_Has_ArchitecturalDecision.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArchitecturalDecisionHasArchitecturalPattern15CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ArchitecturalDecisionHasArchitecturalPattern15CreationTool_title,
				Messages.ArchitecturalDecisionHasArchitecturalPattern15CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004));
		entry.setId("createArchitecturalDecisionHasArchitecturalPattern15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/ArchitecturalDecision_Has_ArchitecturalPattern.png")); //$NON-NLS-1$
		entry.setLargeIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/ArchitecturalDecision_Has_ArchitecturalPattern.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArchitecturalDecisionHasArchitecturalTactic16CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ArchitecturalDecisionHasArchitecturalTactic16CreationTool_title,
				Messages.ArchitecturalDecisionHasArchitecturalTactic16CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001));
		entry.setId("createArchitecturalDecisionHasArchitecturalTactic16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/ArchitecturalDecision_Has_ArchitecturalTactic.png")); //$NON-NLS-1$
		entry.setLargeIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/ArchitecturalDecision_Has_ArchitecturalTactic.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArchitecturalDecisionHasArchitecturalStrategy17CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				Messages.ArchitecturalDecisionHasArchitecturalStrategy17CreationTool_title,
				Messages.ArchitecturalDecisionHasArchitecturalStrategy17CreationTool_desc,
				Collections
						.singletonList(RationaleElementTypes.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007));
		entry.setId("createArchitecturalDecisionHasArchitecturalStrategy17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/ArchitecturalDecision_Has_ArchitecturalStrategy.png")); //$NON-NLS-1$
		entry.setLargeIcon(RationaleDiagramEditorPlugin
				.findImageDescriptor("/rationale.edit/icons/full/obj16/ArchitecturalDecision_Has_ArchitecturalStrategy.png")); //$NON-NLS-1$
		return entry;
	}

}

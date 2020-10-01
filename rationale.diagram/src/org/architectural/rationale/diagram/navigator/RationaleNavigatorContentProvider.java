package org.architectural.rationale.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

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
import org.architectural.rationale.diagram.part.Messages;
import org.architectural.rationale.diagram.part.RationaleVisualIDRegistry;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class RationaleNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public RationaleNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<RationaleNavigatorItem> result = new ArrayList<RationaleNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							ArchitecturalRationaleEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof RationaleNavigatorGroup) {
			RationaleNavigatorGroup group = (RationaleNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof RationaleNavigatorItem) {
			RationaleNavigatorItem navigatorItem = (RationaleNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (RationaleVisualIDRegistry.getVisualID(view)) {

		case ArchitecturalRationaleEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			RationaleNavigatorGroup links = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_ArchitecturalRationale_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(JustificationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalTacticEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalStrategyEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(AlternativeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalPatternEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ContextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ConsequenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_ContextEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_JustificationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_AlternativeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_ConsequenceEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case JustificationEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Node sv = (Node) view;
			RationaleNavigatorGroup incominglinks = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_Justification_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_JustificationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ArchitecturalTacticEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Node sv = (Node) view;
			RationaleNavigatorGroup incominglinks = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_ArchitecturalTactic_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ArchitecturalStrategyEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Node sv = (Node) view;
			RationaleNavigatorGroup incominglinks = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_ArchitecturalStrategy_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ArchitecturalDecisionEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Node sv = (Node) view;
			RationaleNavigatorGroup outgoinglinks = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_ArchitecturalDecision_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RationaleNavigatorGroup incominglinks = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_ArchitecturalDecision_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case AlternativeEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Node sv = (Node) view;
			RationaleNavigatorGroup incominglinks = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_Alternative_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_AlternativeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ArchitecturalPatternEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Node sv = (Node) view;
			RationaleNavigatorGroup incominglinks = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_ArchitecturalPattern_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case RationaleEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Node sv = (Node) view;
			RationaleNavigatorGroup outgoinglinks = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_Rationale_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_ContextEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_JustificationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_AlternativeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_ConsequenceEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case ContextEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Node sv = (Node) view;
			RationaleNavigatorGroup incominglinks = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_Context_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_ContextEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ConsequenceEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Node sv = (Node) view;
			RationaleNavigatorGroup incominglinks = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_Consequence_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleRationale_Has_ConsequenceEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTacticEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RationaleNavigatorGroup target = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RationaleNavigatorGroup source = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalTactic_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalTacticEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RationaleRationale_Has_ContextEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RationaleNavigatorGroup target = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_RationaleRationale_Has_Context_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RationaleNavigatorGroup source = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_RationaleRationale_Has_Context_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ContextEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RationaleRationale_Has_JustificationEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RationaleNavigatorGroup target = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_RationaleRationale_Has_Justification_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RationaleNavigatorGroup source = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_RationaleRationale_Has_Justification_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(JustificationEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RationaleNavigatorGroup target = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RationaleNavigatorGroup source = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPattern_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalPatternEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RationaleRationale_Has_AlternativeEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RationaleNavigatorGroup target = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_RationaleRationale_Has_Alternative_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RationaleNavigatorGroup source = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_RationaleRationale_Has_Alternative_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(AlternativeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RationaleRationale_Has_ArchitecturalDecisionEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RationaleNavigatorGroup target = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_RationaleRationale_Has_ArchitecturalDecision_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RationaleNavigatorGroup source = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_RationaleRationale_Has_ArchitecturalDecision_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategyEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RationaleNavigatorGroup target = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RationaleNavigatorGroup source = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalStrategy_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalStrategyEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ArchitecturalDecisionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RationaleRationale_Has_ConsequenceEditPart.VISUAL_ID: {
			LinkedList<RationaleAbstractNavigatorItem> result = new LinkedList<RationaleAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			RationaleNavigatorGroup target = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_RationaleRationale_Has_Consequence_4008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			RationaleNavigatorGroup source = new RationaleNavigatorGroup(
					Messages.NavigatorGroupName_RationaleRationale_Has_Consequence_4008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(ConsequenceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					RationaleVisualIDRegistry
							.getType(RationaleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ArchitecturalRationaleEditPart.MODEL_ID
				.equals(RationaleVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<RationaleNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<RationaleNavigatorItem> result = new ArrayList<RationaleNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new RationaleNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof RationaleAbstractNavigatorItem) {
			RationaleAbstractNavigatorItem abstractNavigatorItem = (RationaleAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}

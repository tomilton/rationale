package org.architectural.rationale.diagram.navigator;

import org.architectural.rationale.diagram.part.RationaleVisualIDRegistry;
import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class RationaleNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4010;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof RationaleNavigatorItem) {
			RationaleNavigatorItem item = (RationaleNavigatorItem) element;
			return RationaleVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}

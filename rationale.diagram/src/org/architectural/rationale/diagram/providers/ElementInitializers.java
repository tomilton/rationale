package org.architectural.rationale.diagram.providers;

import org.architectural.rationale.diagram.part.RationaleDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = RationaleDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			RationaleDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}

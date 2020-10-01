package org.architectural.rationale.diagram.providers;

import org.architectural.rationale.diagram.edit.parts.ArchitecturalRationaleEditPart;
import org.architectural.rationale.diagram.edit.parts.RationaleEditPartFactory;
import org.architectural.rationale.diagram.part.RationaleVisualIDRegistry;
import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

/**
 * @generated
 */
public class RationaleEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public RationaleEditPartProvider() {
		super(new RationaleEditPartFactory(),
				RationaleVisualIDRegistry.TYPED_INSTANCE,
				ArchitecturalRationaleEditPart.MODEL_ID);
	}

}

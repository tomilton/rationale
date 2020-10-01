package org.architectural.rationale.diagram.edit.parts;

import org.architectural.rationale.diagram.edit.policies.ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternItemSemanticEditPolicy;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart
		extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternEditPart(
			View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternFigure();
	}

	/**
	 * @generated
	 */
	public ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternFigure getPrimaryShape() {
		return (ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternFigure
			extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ArchitecturalDecisionArchitecturalDecision_Has_ArchitecturalPatternFigure() {

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}

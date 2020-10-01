package org.architectural.rationale.diagram.edit.parts;

import org.architectural.rationale.diagram.edit.policies.RationaleRationale_Has_ArchitecturalDecisionItemSemanticEditPolicy;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class RationaleRationale_Has_ArchitecturalDecisionEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4006;

	/**
	 * @generated
	 */
	public RationaleRationale_Has_ArchitecturalDecisionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new RationaleRationale_Has_ArchitecturalDecisionItemSemanticEditPolicy());
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
		return new RationaleRationale_Has_ArchitecturalDecisionFigure();
	}

	/**
	 * @generated
	 */
	public RationaleRationale_Has_ArchitecturalDecisionFigure getPrimaryShape() {
		return (RationaleRationale_Has_ArchitecturalDecisionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RationaleRationale_Has_ArchitecturalDecisionFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RationaleRationale_Has_ArchitecturalDecisionFigure() {
			this.setLineWidth(3);
			this.setLineStyle(Graphics.LINE_DASH);
			this.setForegroundColor(THIS_FORE);

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

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 43, 163, 199);

}

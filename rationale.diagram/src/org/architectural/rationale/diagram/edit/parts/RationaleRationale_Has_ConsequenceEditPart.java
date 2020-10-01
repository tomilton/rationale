package org.architectural.rationale.diagram.edit.parts;

import org.architectural.rationale.diagram.edit.policies.RationaleRationale_Has_ConsequenceItemSemanticEditPolicy;
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
public class RationaleRationale_Has_ConsequenceEditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4008;

	/**
	 * @generated
	 */
	public RationaleRationale_Has_ConsequenceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new RationaleRationale_Has_ConsequenceItemSemanticEditPolicy());
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
		return new RationaleRationale_Has_ConsequenceFigure();
	}

	/**
	 * @generated
	 */
	public RationaleRationale_Has_ConsequenceFigure getPrimaryShape() {
		return (RationaleRationale_Has_ConsequenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RationaleRationale_Has_ConsequenceFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RationaleRationale_Has_ConsequenceFigure() {

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

package org.adempiere.print.layout;

import java.awt.Graphics2D;
import java.awt.geom.Point2D;

public class GraphElement extends PrintElement {
	/**
	 * Constructor
	 * 
	 * @param pg graph model
	 */
	public GraphElement() {
	} // GraphElement

	/**
	 * Layout and Calculate Size Set p_width & p_height
	 * 
	 * @return true if calculated
	 */
	protected boolean calculateSize() {
		return false;
	} // calcluateSize

	/**
	 * Paint/Print.
	 * 
	 * @param g2D Graphics
	 * @param pageNo page number for multi page support (0 = header/footer)
	 * @param pageStart top left Location of page
	 * @param ctx context
	 * @param isView true if online view (IDs are links)
	 */
	public void paint(Graphics2D g2D, int pageNo, Point2D pageStart, boolean isView) {

	} // paint

} // GraphElement


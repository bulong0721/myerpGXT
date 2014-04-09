package org.adempiere.print.layout;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Point2D;

public class HTMLElement extends PrintElement {
	/**
	 * HTML String Constructor
	 * 
	 * @param html html code
	 */
	public HTMLElement(String html) {
		if (html == null || html.equals(""))
			throw new IllegalArgumentException("HTMLElement is null");
		// Create View
		m_renderer = HTMLRenderer.get(html);
	} // HTMLElement

	/** View for Printing */
	private HTMLRenderer	m_renderer;

	/**************************************************************************
	 * Layout and Calculate Size. Set this.width & this.height
	 * 
	 * @return Size
	 */
	protected boolean calculateSize() {
		if (this.p_sizeCalculated)
			return true;
		//
		this.p_height = m_renderer.getHeight();
		this.p_width = m_renderer.getWidth();

		// Limits
		if (this.p_maxWidth != 0f)
			this.p_width = this.p_maxWidth;
		if (this.p_maxHeight != 0f) {
			if (this.p_maxHeight == -1f) // one line only
				this.p_height = m_renderer.getHeightOneLine();
			else
				this.p_height = this.p_maxHeight;
		}
		// System.out.println("HTMLElement.calculate size - Width="
		// + this.width + "(" + this.maxWidth + ") - Height=" + this.height +
		// "(" +
		// this.maxHeight + ")");
		//
		m_renderer.setAllocation((int) this.p_width, (int) this.p_height);
		return true;
	} // calculateSize

	/*************************************************************************
	 * /** Paint/Print. Calculate actual Size. The text is printed in the
	 * topmost left position - i.e. the leading is below the line
	 * 
	 * @param g2D Graphics
	 * @param pageStart top left Location of page
	 * @param pageNo page number for multi page support (0 = header/footer) -
	 *            ignored
	 * @param ctx print context
	 * @param isView true if online view (IDs are links)
	 */
	public void paint(Graphics2D g2D, int pageNo, Point2D pageStart, boolean isView) {
		// 36.0/137.015625,
		// Clip=java.awt.Rectangle[x=0,y=0,p_width=639,p_height=804],
		// Translate=1.0/56.0, Scale=1.0/1.0, Shear=0.0/0.0
		// log.finest( "HTMLElement.paint", this.pageLocation.x + "/" +
		// this.pageLocation.y
		// + ", Clip=" + g2D.getClip()
		// + ", Translate=" + g2D.getTransform().getTranslateX() + "/" +
		// g2D.getTransform().getTranslateY()
		// + ", Scale=" + g2D.getTransform().getScaleX() + "/" +
		// g2D.getTransform().getScaleY()
		// + ", Shear=" + g2D.getTransform().getShearX() + "/" +
		// g2D.getTransform().getShearY());
		//
		Point2D.Double location = getAbsoluteLocation(pageStart);
		// log.finest( "HTMLElement.paint - PageStart=" + pageStart +
		// ", Location=" + location);
		//
		Rectangle allocation = m_renderer.getAllocation();
		g2D.translate(location.x, location.y);
		m_renderer.paint(g2D, allocation);
		g2D.translate(-location.x, -location.y);
	} // paint

	/**
	 * String Representation
	 * 
	 * @return info
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer("HTMLElement[");
		sb.append("Bounds=").append(getBounds()).append(",Height=").append(this.p_height).append("(")
				.append(this.p_maxHeight).append("),Width=").append(this.p_width).append("(").append(this.p_maxHeight)
				.append("),PageLocation=").append(this.pageLocation).append(" - ");
		sb.append("]");
		return sb.toString();
	} // toString

	/**************************************************************************
	 * Is content HTML
	 * 
	 * @param content content
	 * @return true if HTML
	 */
	public static boolean isHTML(Object content) {
		if (content == null)
			return false;
		String s = content.toString();
		if (s.length() < 20) // assumption
			return false;
		s = s.trim().toUpperCase();
		if (s.startsWith("<HTML>"))
			return true;
		return false;
	} // isHTML

} // HTMLElement

package org.adempiere.print.layout;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.Properties;

import org.adempiere.model.core.AdPrintformatitem;
import org.adempiere.web.client.util.StringUtil;

public class BoxElement extends PrintElement {
	/**
	 * BoxElement
	 * 
	 * @param item item
	 * @param color color
	 */
	public BoxElement(AdPrintformatitem item, Color color) {
		super();
		if (item != null && isTypeBox(item)) {
			m_item = item;
			m_color = color;
		}
	} // BoxElement

	private boolean isTypeBox(AdPrintformatitem item) {
		return item.getPrintformattype().equals(AdPrintformatitem.PRINTFORMATTYPE_Line)
				|| item.getPrintformattype().equals(AdPrintformatitem.PRINTFORMATTYPE_Rectangle);
	}

	/** The Item */
	private AdPrintformatitem	m_item	= null;
	private Color				m_color	= Color.BLACK;

	/**
	 * Calculate Size
	 * 
	 * @return true if calculated
	 */
	protected boolean calculateSize() {
		p_width = 0;
		p_height = 0;
		if (m_item == null)
			return true;
		return true;
	} // calculateSize

	/**
	 * Paint
	 * 
	 * @param g2D graphics
	 * @param pageNo page
	 * @param pageStart page start
	 * @param ctx context
	 * @param isView true if Java
	 */
	public void paint(Graphics2D g2D, int pageNo, Point2D pageStart, Properties ctx, boolean isView) {
		if (m_item == null)
			return;
		//
		g2D.setColor(m_color);
		BasicStroke s = new BasicStroke(m_item.getLinewidth());
		g2D.setStroke(s);
		//
		Point2D.Double location = getAbsoluteLocation(pageStart);
		int x = (int) location.x;
		int y = (int) location.y;

		int width = m_item.getMaxwidth();
		int height = m_item.getMaxheight();

		if (m_item.getPrintformattype().equals(AdPrintformatitem.PRINTFORMATTYPE_Line))
			g2D.drawLine(x, y, x + width, y + height);
		else {
			String type = m_item.getShapetype();
			if (type == null)
				type = "";
			if (StringUtil.isYes(m_item.getIsfilledrectangle())) {
				if (type.equals(AdPrintformatitem.SHAPETYPE_3DRectangle))
					g2D.fill3DRect(x, y, width, height, true);
				else if (type.equals(AdPrintformatitem.SHAPETYPE_Oval))
					g2D.fillOval(x, y, width, height);
				else if (type.equals(AdPrintformatitem.SHAPETYPE_RoundRectangle))
					g2D.fillRoundRect(x, y, width, height, m_item.getArcdiameter(), m_item.getArcdiameter());
				else
					g2D.fillRect(x, y, width, height);
			} else {
				if (type.equals(AdPrintformatitem.SHAPETYPE_3DRectangle))
					g2D.draw3DRect(x, y, width, height, true);
				else if (type.equals(AdPrintformatitem.SHAPETYPE_Oval))
					g2D.drawOval(x, y, width, height);
				else if (type.equals(AdPrintformatitem.SHAPETYPE_RoundRectangle))
					g2D.drawRoundRect(x, y, width, height, m_item.getArcdiameter(), m_item.getArcdiameter());
				else
					g2D.drawRect(x, y, width, height);
			}
		}
	} // paint

} // BoxElement

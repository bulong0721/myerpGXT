package org.adempiere.print.layout;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.Properties;

import org.adempiere.model.ADPrintFormatItem;
import org.adempiere.print.PrintContants;

public class BoxElement extends PrintElement {
	/**
	 * BoxElement
	 * 
	 * @param item item
	 * @param color color
	 */
	public BoxElement(ADPrintFormatItem item, Color color) {
		super();
		if (item != null && isTypeBox(item)) {
			m_item = item;
			m_color = color;
		}
	} // BoxElement

	private boolean isTypeBox(ADPrintFormatItem item) {
		return item.getPrintFormatType().equals(PrintContants.PRINTFORMATTYPE_Line)
				|| item.getPrintFormatType().equals(PrintContants.PRINTFORMATTYPE_Rectangle);
	}

	/** The Item */
	private ADPrintFormatItem	m_item	= null;
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
		BasicStroke s = new BasicStroke(m_item.getLineWidth());
		g2D.setStroke(s);
		//
		Point2D.Double location = getAbsoluteLocation(pageStart);
		int x = (int) location.x;
		int y = (int) location.y;

		int width = m_item.getMaxWidth();
		int height = m_item.getMaxHeight();

		if (m_item.getPrintFormatType().equals(PrintContants.PRINTFORMATTYPE_Line))
			g2D.drawLine(x, y, x + width, y + height);
		else {
			String type = m_item.getShapeType();
			if (type == null)
				type = "";
			if (m_item.isFilledRectangle()) {
				if (type.equals(PrintContants.SHAPETYPE_3DRectangle))
					g2D.fill3DRect(x, y, width, height, true);
				else if (type.equals(PrintContants.SHAPETYPE_Oval))
					g2D.fillOval(x, y, width, height);
				else if (type.equals(PrintContants.SHAPETYPE_RoundRectangle))
					g2D.fillRoundRect(x, y, width, height, m_item.getArcDiameter(), m_item.getArcDiameter());
				else
					g2D.fillRect(x, y, width, height);
			} else {
				if (type.equals(PrintContants.SHAPETYPE_3DRectangle))
					g2D.draw3DRect(x, y, width, height, true);
				else if (type.equals(PrintContants.SHAPETYPE_Oval))
					g2D.drawOval(x, y, width, height);
				else if (type.equals(PrintContants.SHAPETYPE_RoundRectangle))
					g2D.drawRoundRect(x, y, width, height, m_item.getArcDiameter(), m_item.getArcDiameter());
				else
					g2D.drawRect(x, y, width, height);
			}
		}
	} // paint

} // BoxElement

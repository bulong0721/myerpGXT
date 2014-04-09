package org.adempiere.print.layout;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;

import org.adempiere.util.MsgUtil;

public class Page {

	/**
	 * Layout for Page
	 * 
	 * @param pageNo page
	 * @param ctx context
	 */
	public Page(int pageNo) {
		m_pageNo = pageNo;
		if (m_pageInfo == null || m_pageInfo.length() == 0)
			m_pageInfo = String.valueOf(m_pageNo);
	} // Page

	/** Current Page No (set here) */
	public static final String		CONTEXT_PAGE		= "*Page";
	/** Page Count (set in Layout Emgine */
	public static final String		CONTEXT_PAGECOUNT	= "*PageCount";
	/** Multi Page Info (set here) */
	public static final String		CONTEXT_MULTIPAGE	= "*MultiPageInfo";
	/** Copy Info (set here) */
	public static final String		CONTEXT_COPY		= "*CopyInfo";

	/** Report Name (set in Layout Engine) */
	public static final String		CONTEXT_REPORTNAME	= "*ReportName";
	/** Report Header (set in Layout Engine) */
	public static final String		CONTEXT_HEADER		= "*Header";
	/** Current Date (set in Layout Engine) */
	public static final String		CONTEXT_DATE		= "*CurrentDate";
	/** Current Time (set in Layout Engine) */
	public static final String		CONTEXT_TIME		= "*CurrentDateTime";

	/** Page Number */
	private int						m_pageNo;
	/** Page Number */
	private int						m_pageCount			= 1;
	/** Page Count */
	private String					m_pageInfo;
	/** Page content */
	private ArrayList<PrintElement>	m_elements			= new ArrayList<PrintElement>();
	/** Background Image */
	private Image					m_image				= null;

	/**
	 * Get Page No
	 * 
	 * @return page no
	 */
	public int getPageNo() {
		return m_pageNo;
	} // getPageNo

	/**
	 * Get Page Info
	 * 
	 * @return page info
	 */
	public String getPageInfo() {
		return m_pageInfo;
	} // getPageInfo

	/**
	 * Set Page Info. Enhanced pagae no, e.g., 7(2,3)
	 * 
	 * @param pageInfo page info
	 */
	public void setPageInfo(String pageInfo) {
		if (m_pageInfo == null || m_pageInfo.length() == 0)
			m_pageInfo = String.valueOf(m_pageNo);
		m_pageInfo = pageInfo;
	} // getPageInfo

	/**
	 * Set Page Info
	 * 
	 * @param pageCount page count
	 */
	public void setPageCount(int pageCount) {
		m_pageCount = pageCount;
	} // setPageCount

	/**
	 * Add Print Element to Page
	 * 
	 * @param element print element
	 */
	public void addElement(PrintElement element) {
		if (element != null)
			m_elements.add(element);
	} // addElement

	/*************************************************************************/

	/**
	 * Paint Page on Graphics in Bounds
	 * 
	 * @param g2D graphics
	 * @param bounds page bounds
	 * @param isView true if online view (IDs are links)
	 * @param isCopy this print is a copy
	 */
	public void paint(Graphics2D g2D, Rectangle bounds, boolean isView, boolean isCopy) {
//		m_ctx.put(CONTEXT_PAGE, m_pageInfo);
		// log.finest( "PrintContext", CONTEXT_PAGE + "=" + m_pageInfo);
		//
		StringBuffer sb = new StringBuffer();
		if (m_pageCount != 1) // set to "Page 1 of 2"
			sb.append(MsgUtil.getMsg("Page")).append(" ").append(m_pageNo).append(" ").append(MsgUtil.getMsg("of"))
					.append(" ").append(m_pageCount);
		else
			sb.append(" ");
//		m_ctx.put(CONTEXT_MULTIPAGE, sb.toString());
		// log.finest( "PrintContext", CONTEXT_MULTIPAGE + "=" + sb.toString());
		//
		sb = new StringBuffer();
		if (isCopy) // set to "(Copy)"
			sb.append("(").append(MsgUtil.getMsg("DocumentCopy")).append(")");
		else
			sb.append(" ");
//		m_ctx.put(CONTEXT_COPY, sb.toString());
		// log.finest( "PrintContext copy=" + isCopy, CONTEXT_COPY + "=" +
		// sb.toString());

		// Paint Background
		g2D.setColor(Color.white);
		g2D.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
		//
		// backgroundImage
		if (m_image != null) {
			int x = (bounds.width / 2) - (m_image.getWidth(null) / 2);
			int y = (bounds.height / 2) - (m_image.getHeight(null) / 2);
			g2D.drawImage(m_image, x, y, null);
		}
		//
		Point pageStart = new Point(bounds.getLocation());
		for (int i = 0; i < m_elements.size(); i++) {
			PrintElement e = (PrintElement) m_elements.get(i);
			e.paint(g2D, m_pageNo, pageStart, isView);
		}
	} // paint

	/**
	 * set Background Image
	 * 
	 * @param image
	 */
	public void setBackgroundImage(Image image) {
		m_image = image;
	}

	/**
	 * get Background Image
	 * 
	 * @return
	 */
	public Image getBackgroundImage() {
		return m_image;
	}

	/**
	 * String Representation
	 * 
	 * @return info
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer("Page[");
		sb.append(m_pageNo).append(",Elements=").append(m_elements.size());
		sb.append("]");
		return sb.toString();
	} // toString
}

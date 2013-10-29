package org.adempiere.print;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Paper;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.attribute.DocAttributeSet;

import org.adempiere.model.core.AdPrintcolor;
import org.adempiere.model.core.AdPrintfont;
import org.adempiere.model.core.AdPrintformat;
import org.adempiere.model.core.AdPrintpaper;
import org.adempiere.print.layout.HeaderFooter;
import org.adempiere.print.layout.Page;
import org.adempiere.print.layout.PrintElement;
import org.adempiere.web.client.util.StringUtil;

public class LayoutEngine implements Pageable, Printable, Doc {
	private boolean				isCopy						= false;
	private int					m_pageNo					= 0;
	private Page				m_currPage;
	private List<Page>			m_pages						= new ArrayList<Page>();
	private Properties			m_printCtx;
	private AdPrintformat		m_format;
	private AdPrintpaper		printPaper;
	private AdPrintcolor		printColor;
	private AdPrintfont			printFont;
	private HeaderFooter		m_headerFooter;

	private Rectangle			m_header					= new Rectangle();
	private Rectangle			m_content					= new Rectangle();
	private Rectangle			m_footer					= new Rectangle();
	private int					m_tempNLPositon				= 0;
	private float				m_maxHeightSinceNewLine[]	= new float[] { 0f, 0f, 0f };
	private Point2D.Double[]	m_position					= new Point2D.Double[] { new Point2D.Double(0, 0),
			new Point2D.Double(0, 0), new Point2D.Double(0, 0) };
	public static final int		AREA_HEADER					= 0;
	public static final int		AREA_CONTENT				= 1;
	public static final int		AREA_FOOTER					= 2;
	private int					m_area						= AREA_CONTENT;
	private PrintData			m_data;
	private boolean				m_hasLayout;
	private TableElement		m_tableElement				= null;
	public static boolean		s_FASTDRAW					= true;
	public static Image			IMAGE_TRUE					= null;
	public static Image			IMAGE_FALSE					= null;
	public static Dimension		IMAGE_SIZE					= new Dimension(10, 10);

	@Override
	public DocFlavor getDocFlavor() {
		return DocFlavor.SERVICE_FORMATTED.PAGEABLE;
	}

	@Override
	public Object getPrintData() throws IOException {
		return this;
	}

	@Override
	public DocAttributeSet getAttributes() {
		return null;
	}

	@Override
	public Reader getReaderForText() throws IOException {
		return null;
	}

	@Override
	public InputStream getStreamForBytes() throws IOException {
		return null;
	}

	public AdPrintpaper getPrintPaper() {
		return printPaper;
	}

	private void layout() {
		// Header/Footer
		m_headerFooter = new HeaderFooter(m_printCtx);
		if (!StringUtil.isYes(m_format.getIsform()) && StringUtil.isYes(m_format.getIsstandardheaderfooter()))
			createStandardHeaderFooter();
		//
		m_pageNo = 0;
		m_pages.clear();
		m_tableElement = null;
		newPage(true, false); // initialize
		//
		if (StringUtil.isYes(m_format.getIsform()))
			layoutForm();
		else {
			// Parameter
			PrintElement element = layoutParameter();
			if (element != null) {
				m_currPage.addElement(element);
				element.setLocation(m_position[AREA_CONTENT]);
				m_position[AREA_CONTENT].y += element.getHeight() + 5; // GAP
			}
			// Table
			if (m_data != null) {
				element = layoutTable(m_format, m_data, 0);
				element.setLocation(m_content.getLocation());
				for (int p = 1; p <= element.getPageCount(); p++) {
					if (p != 1)
						newPage(true, false);
					m_currPage.addElement(element);
				}
			}
		}
		//
		String pageInfo = String.valueOf(m_pages.size()) + getPageInfo(m_pages.size());
		Timestamp now = new Timestamp(System.currentTimeMillis());
		//
		// Page Background Image

		// Update Page Info
		int pages = m_pages.size();
		for (int i = 0; i < pages; i++) {
			Page page = m_pages.get(i);
			int pageNo = page.getPageNo();
			pageInfo = String.valueOf(pageNo) + getPageInfo(pageNo);
			page.setPageInfo(pageInfo);
			page.setPageCount(pages);
		}

		m_hasLayout = true;
	} // layout

	public String getPageInfo(int pageNo) {
		if (m_tableElement == null || m_tableElement.getPageXCount() == 1)
			return "";
		int pi = m_tableElement.getPageIndex(pageNo);
		StringBuffer sb = new StringBuffer("(");
		sb.append(m_tableElement.getPageYIndex(pi) + 1).append(",").append(m_tableElement.getPageYIndex(pi) + 1)
				.append(")");
		return sb.toString();
	} // getPageInfo

	private PrintElement layoutTable(AdPrintformat m_format2, PrintData m_data2, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private void layoutForm() {
		// TODO Auto-generated method stub

	}

	private PrintElement layoutParameter() {
		// TODO Auto-generated method stub
		return null;
	}

	private void createStandardHeaderFooter() {
		// TODO Auto-generated method stub

	}

	private Paper getPaper() {
		// TODO
		return null;
	}

	public Page getPage(int pageNo) {
		if (pageNo <= 0 || pageNo > m_pages.size()) {
			return null;
		}
		Page retValue = m_pages.get(pageNo - 1);
		return retValue;
	}

	public HeaderFooter getHeaderFooter() {
		return m_headerFooter;
	}

	public float getYspace() {
		Rectangle part = m_content;
		if (m_area == AREA_HEADER)
			part = m_header;
		else if (m_area == AREA_FOOTER)
			part = m_footer;
		//
		return (float) (part.y + part.height - m_position[m_area].y);
	}

	public boolean isYspaceFor(float height) {
		return (getYspace() - height) >= 0f;
	} // isYspaceFor

	protected int newPage(boolean force, boolean preserveXPos) {
		// We are on a new page
		if (!force && m_position[AREA_CONTENT].getX() == m_content.x && m_position[AREA_CONTENT].getY() == m_content.y) {
			return m_pageNo;
		}

		m_pageNo++;
		m_currPage = new Page(m_printCtx, m_pageNo);
		m_pages.add(m_currPage);
		//
		m_position[AREA_HEADER].setLocation(m_header.x, m_header.y);
		if (preserveXPos)
			m_position[AREA_CONTENT].setLocation(m_position[AREA_CONTENT].x, m_content.y);
		else
			m_position[AREA_CONTENT].setLocation(m_content.x, m_content.y);
		m_position[AREA_FOOTER].setLocation(m_footer.x, m_footer.y);
		m_maxHeightSinceNewLine = new float[] { 0f, 0f, 0f };
		return m_pageNo;
	}

	protected void newLine() {
		Rectangle part = m_content;
		if (m_area == AREA_HEADER)
			part = m_header;
		else if (m_area == AREA_FOOTER)
			part = m_footer;

		// Temporary NL Position
		int xPos = part.x;
		if (m_tempNLPositon != 0)
			xPos = m_tempNLPositon;

		if (isYspaceFor(m_maxHeightSinceNewLine[m_area])) {
			m_position[m_area].setLocation(xPos, m_position[m_area].y + m_maxHeightSinceNewLine[m_area]);

		} else if (m_area == AREA_CONTENT) {
			newPage(true, false);
		} else {
			m_position[m_area].setLocation(part.x, m_position[m_area].y + m_maxHeightSinceNewLine[m_area]);
		}
		m_maxHeightSinceNewLine[m_area] = 0f;
	}

	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		if (!havePage(pageIndex))
			return Printable.NO_SUCH_PAGE;
		//
		Rectangle r = new Rectangle(0, 0, (int) getPaper().getWidth(), (int) getPaper().getHeight());
		Page page = getPage(pageIndex + 1);
		//
		// log.fine("#" + m_id, "PageIndex=" + pageIndex + ", Copy=" +
		// m_isCopy);
		page.paint((Graphics2D) graphics, r, false, isCopy); // sets context
		getHeaderFooter().paint((Graphics2D) graphics, r, false);
		//
		return Printable.PAGE_EXISTS;
	}

	@Override
	public int getNumberOfPages() {
		return m_pages.size();
	}

	private boolean havePage(int pageIndex) {
		if (pageIndex < 0 || pageIndex >= getNumberOfPages())
			return false;
		return true;
	}

	@Override
	public PageFormat getPageFormat(int pageIndex) throws IndexOutOfBoundsException {
		if (!havePage(pageIndex))
			throw new IndexOutOfBoundsException("No page index=" + pageIndex);
		return getPageFormat();
	}

	@Override
	public Printable getPrintable(int pageIndex) throws IndexOutOfBoundsException {
		if (!havePage(pageIndex))
			throw new IndexOutOfBoundsException("No page index=" + pageIndex);
		return this;
	}

	public LayoutEngine getPageable(boolean isCopy) {
		return this;
	}

	private PageFormat getPageFormat() {
		Paper paper = new Paper();
		PageFormat pf = new PageFormat();
		pf.setPaper(paper);
		int orient = PageFormat.PORTRAIT;
		pf.setOrientation(orient);
		return pf;
	}
}

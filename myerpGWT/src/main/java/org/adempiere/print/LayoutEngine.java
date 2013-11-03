package org.adempiere.print;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.attribute.DocAttributeSet;

import org.adempiere.common.KeyNamePair;
import org.adempiere.common.ValueNamePair;
import org.adempiere.model.common.QueryCondition;
import org.adempiere.model.core.AdPrintcolor;
import org.adempiere.model.core.AdPrintfont;
import org.adempiere.model.core.AdPrintformat;
import org.adempiere.model.core.AdPrintformatitem;
import org.adempiere.model.core.AdPrintpaper;
import org.adempiere.model.core.AdPrinttableformat;
import org.adempiere.model.util.POUtil;
import org.adempiere.print.layout.HeaderFooter;
import org.adempiere.print.layout.ImageElement;
import org.adempiere.print.layout.Page;
import org.adempiere.print.layout.ParameterElement;
import org.adempiere.print.layout.PrintElement;
import org.adempiere.print.layout.TableElement;
import org.adempiere.web.client.util.StringUtil;

public class LayoutEngine implements Pageable, Printable, Doc {
	private boolean				isCopy						= false;
	private int					m_pageNo					= 0;
	private Page				m_currPage;
	private List<Page>			m_pages						= new ArrayList<Page>();
	private Properties			m_printCtx;
	private QueryCondition		m_query;
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

	public void setPrintData(PrintData data, QueryCondition query, boolean doLayout) {
		m_data = data;
		m_query = query;
		if (m_hasLayout && doLayout)
			layout(); // re-calculate
	} // setPrintData

	private PrintElement layoutTable(AdPrintformat format, PrintData printData, int xOffset) {
		AdPrinttableformat tf = getTableFormat(format);
		// Initial Values
		HashMap<Point, Font> rowColFont = new HashMap<Point, Font>();
		AdPrintfont printFont = POUtil.find(AdPrintfont.class, format.getAdPrintfontId());
		rowColFont.put(new Point(TableElement.ALL, TableElement.ALL), printFont.getFont());
		tf.setStandard_Font(printFont.getFont());
		rowColFont.put(new Point(TableElement.HEADER_ROW, TableElement.ALL), tf.getHeader_Font());
		//
		HashMap<Point, Color> rowColColor = new HashMap<Point, Color>();
		AdPrintcolor printColor = POUtil.find(AdPrintcolor.class, format.getAdPrintcolorId());
		rowColColor.put(new Point(TableElement.ALL, TableElement.ALL), printColor.getColor());
		rowColColor.put(new Point(TableElement.HEADER_ROW, TableElement.ALL), tf.getHeaderFG_Color());
		//
		HashMap<Point, Color> rowColBackground = new HashMap<Point, Color>();
		rowColBackground.put(new Point(TableElement.HEADER_ROW, TableElement.ALL), tf.getHeaderBG_Color());
		// Sizes
		boolean multiLineHeader = StringUtil.isYes(tf.getIsmultilineheader());
		int pageNoStart = m_pageNo;
		int repeatedColumns = 1;
		Rectangle firstPage = new Rectangle(m_content);
		firstPage.x += xOffset;
		firstPage.width -= xOffset;
		int yOffset = (int) m_position[AREA_CONTENT].y - m_content.y;
		firstPage.y += yOffset;
		firstPage.height -= yOffset;
		Rectangle nextPages = new Rectangle(m_content);
		nextPages.x += xOffset;
		nextPages.width -= xOffset;
		// Column count
		int columnCount = 0;
		for (int c = 0; c < format.getItemCount(); c++) {
			if (StringUtil.isYes(format.getItem(c).getIsprinted()))
				columnCount++;
		}
		// System.out.println("Cols=" + cols);

		// Header & Column Setup
		ValueNamePair[] columnHeader = new ValueNamePair[columnCount];
		int[] columnMaxWidth = new int[columnCount];
		int[] columnMaxHeight = new int[columnCount];
		boolean[] fixedWidth = new boolean[columnCount];
		boolean[] colSuppressRepeats = new boolean[columnCount];
		String[] columnJustification = new String[columnCount];
		HashMap<Integer, Integer> additionalLines = new HashMap<Integer, Integer>();

		int col = 0;
		for (int c = 0; c < format.getItemCount(); c++) {
			AdPrintformatitem item = format.getItem(c);
			if (StringUtil.isYes(item.getIsprinted())) {
				if (StringUtil.isYes(item.getIsnextline()) && item.getBelowcolumn() != 0) {
					additionalLines.put(new Integer(col), new Integer(item.getBelowcolumn() - 1));
					if (!StringUtil.isYes(item.getIssuppressnull())) {
						item.setIssuppressnull("Y");
						// item.save();
					}
				}
				columnHeader[col] = new ValueNamePair(item.getPrintname(), item.getPrintname());
				columnMaxWidth[col] = item.getMaxwidth();
				fixedWidth[col] = (columnMaxWidth[col] != 0 && StringUtil.isYes(item.getIsfixedwidth()));
				colSuppressRepeats[col] = StringUtil.isYes(item.getIssuppressrepeats());
				if (StringUtil.isYes(item.getIssuppressnull())) {
					if (columnMaxWidth[col] == 0)
						columnMaxWidth[col] = -1; // indication suppress if Null
					else
						columnMaxWidth[col] *= -1;
				}
				columnMaxHeight[col] = item.getMaxheight();
				if (StringUtil.isYes(item.getIsheightoneline()))
					columnMaxHeight[col] = -1;
				columnJustification[col] = item.getFieldalignmenttype();
				if (columnJustification[col] == null
						|| columnJustification[col].equals(AdPrintformatitem.FIELDALIGNMENTTYPE_Default))
					columnJustification[col] = AdPrintformatitem.FIELDALIGNMENTTYPE_LeadingLeft;
				// Column Fonts
				if (item.getAdPrintfontId() != 0 && item.getAdPrintfontId() != format.getAdPrintfontId()) {
					AdPrintfont font = POUtil.find(AdPrintfont.class, item.getAdPrintfontId());
					rowColFont.put(new Point(TableElement.ALL, col), font.getFont());
				}
				if (item.getAdPrintcolorId() != 0 && item.getAdPrintcolorId() != format.getAdPrintcolorId()) {
					AdPrintcolor color = POUtil.find(AdPrintcolor.class, item.getAdPrintcolorId());
					rowColColor.put(new Point(TableElement.ALL, col), color.getColor());
				}
				//
				col++;
			}
		}

		// The Data
		int rows = printData.getRowCount();
		// System.out.println("Rows=" + rows);
		Object[][] data = new Object[rows][columnCount];
		KeyNamePair[] pk = new KeyNamePair[rows];
		String pkColumnName = null;
		ArrayList<Integer> functionRows = new ArrayList<Integer>();
		ArrayList<Integer> pageBreak = new ArrayList<Integer>();

		// for all rows
		for (int row = 0; row < rows; row++) {
			// System.out.println("row=" + row);
			printData.setRowIndex(row);
			if (printData.isFunctionRow()) {
				functionRows.add(new Integer(row));
				rowColFont.put(new Point(row, TableElement.ALL), tf.getFunct_Font());
				rowColColor.put(new Point(row, TableElement.ALL), tf.getFunctFG_Color());
				rowColBackground.put(new Point(row, TableElement.ALL), tf.getFunctBG_Color());
				if (printData.isPageBreak()) {
					pageBreak.add(new Integer(row));
				}
			}
			// Summary/Line Levels for Finanial Reports
			else {
				int levelNo = printData.getLineLevelNo();
				if (levelNo != 0) {
					if (levelNo < 0)
						levelNo = -levelNo;
					Font base = printFont.getFont();
					if (levelNo == 1)
						rowColFont.put(new Point(row, TableElement.ALL),
								new Font(base.getName(), Font.ITALIC, base.getSize() - levelNo));
					else if (levelNo == 2)
						rowColFont.put(new Point(row, TableElement.ALL),
								new Font(base.getName(), Font.PLAIN, base.getSize() - levelNo));
				}
			}
			// for all columns
			col = 0;
			for (int c = 0; c < format.getItemCount(); c++) {
				AdPrintformatitem item = format.getItem(c);
				Object dataElement = null;
				if (StringUtil.isYes(item.getIsprinted())) // Text Columns
				{
					if (item.isTypeImage()) {
						if (StringUtil.isYes(item.getIsimagefield())) {
							Object obj = null;
							if (item.getAdColumnId() > 0)
								obj = printData.getNode(item.getAdColumnId());
							if (obj == null)
								;
							else if (obj instanceof PrintDataElement) {
								PrintDataElement pde = (PrintDataElement) obj;
								Object o = pde.getValue();
								String value = null;
								if (o == null)
									value = "";
								else if (o instanceof KeyNamePair)
									value = ((KeyNamePair) o).getName();
								else
									value = o.toString();

								data[row][col] = ImageElement.get(value);
							}
						} else if (StringUtil.isYes(item.getImageisattached()))
							data[row][col] = ImageElement.get(item.getAdPrintformatitemId());
						else
							data[row][col] = ImageElement.get(item.getImageurl());
						// Image layout - teo_sarca, [ 1673548 ]
						if (data[row][col] != null)
							((ImageElement) data[row][col]).layout(item.getMaxwidth(), item.getMaxheight(), false,
									item.getFieldalignmenttype());
					} else if (item.isTypeText()) {
						data[row][col] = item.getPrintname();
					} else if (item.isTypeField()) {
						Object obj = null;
						if (item.getAdColumnId() > 0)
							obj = printData.getNode(new Integer(item.getAdColumnId()));
						if (obj == null)
							;
						else if (obj instanceof PrintDataElement) {
							PrintDataElement pde = (PrintDataElement) obj;
							if (pde.isID() || pde.isYesNo())
								dataElement = pde.getValue();
							else
								dataElement = pde.getValueDisplay(format.getLanguage());
						} else
							data[row][col] = dataElement;
					}
					col++;
				} // printed
			} // for all columns

			PrintDataElement pde = printData.getPKey();
			if (pde != null) // for FunctionRows
			{
				pk[row] = (KeyNamePair) pde.getValue();
				if (pkColumnName == null)
					pkColumnName = pde.getColumnName();
			}
			// else
			// System.out.println("No PK " + printData);
		} // for all rows

		//
		TableElement table = new TableElement(columnHeader, columnMaxWidth, columnMaxHeight, columnJustification,
				fixedWidth, functionRows, multiLineHeader, data, pk, pkColumnName, pageNoStart, firstPage, nextPages,
				repeatedColumns, additionalLines, rowColFont, rowColColor, rowColBackground, tf, pageBreak,
				colSuppressRepeats);
		table.layout(0, 0, false, AdPrintformatitem.FIELDALIGNMENTTYPE_LeadingLeft);
		if (m_tableElement == null)
			m_tableElement = table;
		return table;
	}

	private void layoutForm() {
		// TODO Auto-generated method stub

	}

	private PrintElement layoutParameter() {
		if (m_query == null || !m_query.isActive())
			return null;
		//
		ParameterElement pe = new ParameterElement(m_query, m_printCtx, getTableFormat(m_format));
		pe.layout(0, 0, false, null);
		return pe;
	}

	private AdPrinttableformat getTableFormat(AdPrintformat format) {
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

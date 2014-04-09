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
import java.util.logging.Level;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.attribute.DocAttributeSet;

import org.adempiere.common.ADExpression;
import org.adempiere.common.DisplayType;
import org.adempiere.common.KeyNamePair;
import org.adempiere.common.NamePair;
import org.adempiere.common.ValueNamePair;
import org.adempiere.install.Translation;
import org.adempiere.model.ADClientInfo;
import org.adempiere.print.layout.BoxElement;
import org.adempiere.print.layout.HTMLElement;
import org.adempiere.print.layout.HeaderFooter;
import org.adempiere.print.layout.ImageElement;
import org.adempiere.print.layout.LocationElement;
import org.adempiere.print.layout.Page;
import org.adempiere.print.layout.ParameterElement;
import org.adempiere.print.layout.PrintElement;
import org.adempiere.print.layout.StringElement;
import org.adempiere.print.layout.TableElement;
import org.adempiere.print.model.PrintColor;
import org.adempiere.print.model.PrintFont;
import org.adempiere.print.model.PrintFormat;
import org.adempiere.print.model.PrintFormatItem;
import org.adempiere.print.model.PrintInfo;
import org.adempiere.print.model.PrintPaper;
import org.adempiere.print.model.PrintTableFormat;
import org.adempiere.util.Adempiere;
import org.adempiere.util.CLogger;
import org.adempiere.util.MsgUtil;

public class LayoutEngine implements Pageable, Printable, Doc {
	private boolean				isCopy						= false;
	private int					m_pageNo					= 0;
	private Page				m_currPage;
	private List<Page>			m_pages						= new ArrayList<Page>();
	private ADExpression		m_query;
	private PrintFormat			m_format;
	private PrintPaper			printPaper;
	private PrintColor			printColor;
	private PrintInfo			printInfo;
	private PrintFont			printFont;
	private HeaderFooter		m_headerFooter;
	private CPaper				m_paper;
	private int					m_headerHeight				= 18;
	private int					m_footerHeight				= 18;
	private float				m_lastHeight[]				= new float[] { 0f, 0f, 0f };
	private float				m_lastWidth[]				= new float[] { 0f, 0f, 0f };

	private Rectangle			m_header					= new Rectangle();
	private Rectangle			m_content					= new Rectangle();
	private Rectangle			m_footer					= new Rectangle();
	private int					m_tempNLPositon				= 0;
	private float				m_maxHeightSinceNewLine[]	= new float[] { 0f, 0f, 0f };
	private Point2D.Double[]	m_position					= new Point2D.Double[] { new Point2D.Double(0, 0), new Point2D.Double(0, 0),
			new Point2D.Double(0, 0)						};
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
	private static CLogger		log							= CLogger.getCLogger(Translation.class);

	public LayoutEngine(PrintFormat format, PrintData pData, ADExpression pExpr, PrintInfo pInfo) {
		this.setPrintFormat(format, false);
		this.setPrintData(pData, pExpr, false);
		this.setPrintInfo(printInfo);
		this.layout();
	}

	public void setPrintFormat(PrintFormat format, boolean doLayout) {
		m_format = format;
		// Set Paper
		boolean tempHasLayout = m_hasLayout;
		m_hasLayout = false; // do not start re-calculation
		PrintPaper mPaper = PrintUtil.getPrintPaper(format.getADPrintPaperID());
		if (m_format.isStandardHeaderFooter())
			setPaper(mPaper.getCPaper());
		else
			setPaper(mPaper.getCPaper(), m_format.getHeaderMargin(), m_format.getFooterMargin());
		m_hasLayout = tempHasLayout;
		//
		printColor = PrintUtil.getPrintColor(format.getADPrintColorID());
		printFont = PrintUtil.getPrintFont(format.getADPrintFontID());

		// // Print Context
		// EnvUtil.setContext(m_printCtx, Page.CONTEXT_REPORTNAME,
		// m_format.getName());
		// EnvUtil.setContext(m_printCtx, Page.CONTEXT_HEADER,
		// EnvUtil.getHeader(m_printCtx, 0));
		// EnvUtil.setContext(m_printCtx, EnvUtil.LANGUAGE,
		// m_format.getLanguage().getAD_Language());

		if (m_hasLayout && doLayout)
			layout(); // re-calculate
	} // setPrintFormat

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

	public PrintPaper getPrintPaper() {
		return printPaper;
	}

	public PrintInfo getPrintInfo() {
		return printInfo;
	}

	public void setPrintInfo(PrintInfo printInfo) {
		this.printInfo = printInfo;
	}

	private void layout() {
		// Header/Footer
		m_headerFooter = new HeaderFooter();
		if (!m_format.isForm() && m_format.isStandardHeaderFooter())
			createStandardHeaderFooter();
		//
		m_pageNo = 0;
		m_pages.clear();
		m_tableElement = null;
		newPage(true, false); // initialize
		//
		if (m_format.isForm())
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
		sb.append(m_tableElement.getPageYIndex(pi) + 1).append(",").append(m_tableElement.getPageYIndex(pi) + 1).append(")");
		return sb.toString();
	} // getPageInfo

	public void setPrintData(PrintData data, ADExpression query, boolean doLayout) {
		m_data = data;
		m_query = query;
		if (m_hasLayout && doLayout)
			layout(); // re-calculate
	} // setPrintData

	private PrintElement layoutTable(PrintFormat format, PrintData printData, int xOffset) {
		PrintTableFormat tf = format.getTableFormat();
		// Initial Values
		HashMap<Point, Font> rowColFont = new HashMap<Point, Font>();
		PrintFont printFont = PrintUtil.getPrintFont(format.getADPrintFontID());
		rowColFont.put(new Point(TableElement.ALL, TableElement.ALL), printFont.getFont());
		tf.setStandard_Font(printFont.getFont());
		rowColFont.put(new Point(TableElement.HEADER_ROW, TableElement.ALL), tf.getHeader_Font());
		//
		HashMap<Point, Color> rowColColor = new HashMap<Point, Color>();
		PrintColor printColor = PrintUtil.getPrintColor(format.getADPrintColorID());
		rowColColor.put(new Point(TableElement.ALL, TableElement.ALL), printColor.getColor());
		rowColColor.put(new Point(TableElement.HEADER_ROW, TableElement.ALL), tf.getHeaderFG_Color());
		//
		HashMap<Point, Color> rowColBackground = new HashMap<Point, Color>();
		rowColBackground.put(new Point(TableElement.HEADER_ROW, TableElement.ALL), tf.getHeaderBG_Color());
		// Sizes
		boolean multiLineHeader = tf.isMultiLineHeader();
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
			if (format.getItem(c).isPrinted())
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
			PrintFormatItem item = format.getItem(c);
			if (item.isPrinted()) {
				if (item.isNextLine() && item.getBelowColumn() != 0) {
					additionalLines.put(new Integer(col), new Integer(item.getBelowColumn() - 1));
					if (!item.isSuppressNull()) {
						item.setSuppressNull(true);
						// item.save();
					}
				}
				columnHeader[col] = new ValueNamePair(item.getPrintName(), item.getPrintName());
				columnMaxWidth[col] = item.getMaxWidth();
				fixedWidth[col] = (columnMaxWidth[col] != 0 && item.isFixedWidth());
				colSuppressRepeats[col] = item.isSuppressRepeats();
				if (item.isSuppressNull()) {
					if (columnMaxWidth[col] == 0)
						columnMaxWidth[col] = -1; // indication suppress if Null
					else
						columnMaxWidth[col] *= -1;
				}
				columnMaxHeight[col] = item.getMaxHeight();
				if (item.isHeightOneLine())
					columnMaxHeight[col] = -1;
				columnJustification[col] = item.getFieldAlignmentType();
				if (columnJustification[col] == null || columnJustification[col].equals(PrintFormatItem.FIELDALIGNMENTTYPE_Default))
					columnJustification[col] = PrintFormatItem.FIELDALIGNMENTTYPE_LeadingLeft;
				// Column Fonts
				if (item.getADPrintFontID() != 0 && item.getADPrintFontID() != format.getADPrintFontID()) {
					PrintFont font = PrintUtil.getPrintFont(item.getADPrintFontID());
					rowColFont.put(new Point(TableElement.ALL, col), font.getFont());
				}
				if (item.getADPrintColorID() != 0 && item.getADPrintColorID() != format.getADPrintColorID()) {
					PrintColor color = PrintUtil.getPrintColor(item.getADPrintColorID());
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
						rowColFont.put(new Point(row, TableElement.ALL), new Font(base.getName(), Font.ITALIC, base.getSize() - levelNo));
					else if (levelNo == 2)
						rowColFont.put(new Point(row, TableElement.ALL), new Font(base.getName(), Font.PLAIN, base.getSize() - levelNo));
				}
			}
			// for all columns
			col = 0;
			for (int c = 0; c < format.getItemCount(); c++) {
				PrintFormatItem item = format.getItem(c);
				Object dataElement = null;
				if (item.isPrinted()) // Text Columns
				{
					if (item.isTypeImage()) {
						if (item.isImageField()) {
							Object obj = null;
							if (item.getADColumnID() > 0)
								obj = printData.getNode(item.getADColumnID());
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
						} else if (item.isImageIsAttached())
							data[row][col] = ImageElement.get(item.getADPrintFormatItemID());
						else
							data[row][col] = ImageElement.get(item.getImageURL());
						// Image layout - teo_sarca, [ 1673548 ]
						if (data[row][col] != null)
							((ImageElement) data[row][col]).layout(item.getMaxWidth(), item.getMaxHeight(), false,
									item.getFieldAlignmentType());
					} else if (item.isTypeText()) {
						data[row][col] = item.getPrintName();
					} else if (item.isTypeField()) {
						Object obj = null;
						if (item.getADColumnID() > 0)
							obj = printData.getNode(new Integer(item.getADColumnID()));
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
			if (pde != null) {
				pk[row] = (KeyNamePair) pde.getValue();
				if (pkColumnName == null)
					pkColumnName = pde.getColumnName();
			}
		} // for all rows

		//
		TableElement table = new TableElement(columnHeader, columnMaxWidth, columnMaxHeight, columnJustification, fixedWidth, functionRows,
				multiLineHeader, data, pk, pkColumnName, pageNoStart, firstPage, nextPages, repeatedColumns, additionalLines, rowColFont,
				rowColColor, rowColBackground, tf, pageBreak, colSuppressRepeats);
		table.layout(0, 0, false, PrintFormatItem.FIELDALIGNMENTTYPE_LeadingLeft);
		if (m_tableElement == null)
			m_tableElement = table;
		return table;
	}

	protected void setArea(int area) {
		if (m_area == area)
			return;
		if (area < 0 || area > 2)
			throw new ArrayIndexOutOfBoundsException(area);
		m_area = area;
	} // setArea

	/**
	 * Set X Position on current page
	 * 
	 * @param x x position in 1/72 inch
	 */
	protected void setX(float x) {
		m_position[m_area].x = x;
		log.finest("Page=" + m_pageNo + " [" + m_area + "] " + m_position[m_area].x + "/" + m_position[m_area].y);
	} // setX

	/**
	 * Add to X Position on current page
	 * 
	 * @param xOffset add offset to x position in 1/72 inch
	 */
	protected void addX(float xOffset) {
		if (xOffset == 0f)
			return;
		m_position[m_area].x += xOffset;
		log.finest("Page=" + m_pageNo + " [" + m_area + "] " + m_position[m_area].x + "/" + m_position[m_area].y);
	} // addX

	/**
	 * Get X Position on current page
	 * 
	 * @return x position in 1/72 inch
	 */
	public float getX() {
		return (float) m_position[m_area].x;
	} // getX

	/**
	 * Set Y Position on current page
	 * 
	 * @param y y position in 1/72 inch
	 */
	protected void setY(int y) {
		m_position[m_area].y = y;
		log.finest("Page=" + m_pageNo + " [" + m_area + "] " + m_position[m_area].x + "/" + m_position[m_area].y);
	} // setY

	/**
	 * Add to Y Position - may cause New Page
	 * 
	 * @param yOffset add offset to y position in 1/72 inch
	 */
	protected void addY(int yOffset) {
		if (yOffset == 0f)
			return;
		if (isYspaceFor(yOffset)) {
			m_position[m_area].y += yOffset;
			log.finest("Page=" + m_pageNo + " [" + m_area + "] " + m_position[m_area].x + "/" + m_position[m_area].y);
		} else if (m_area == AREA_CONTENT) {
			log.finest("Not enough Y space " + m_lastHeight[m_area] + " - remaining " + getYspace() + " - Area=" + m_area);
			newPage(true, true);
			log.finest("Page=" + m_pageNo + " [" + m_area + "] " + m_position[m_area].x + "/" + m_position[m_area].y);
		} else {
			m_position[m_area].y += yOffset;
			log.log(Level.SEVERE, "Outside of Area: " + m_position);
		}
	} // addY

	public Point2D getPosition() {
		return m_position[m_area];
	} // getPosition

	/**
	 * Get Y Position on current page
	 * 
	 * @return y position in 1/72 inch
	 */
	public float getY() {
		return (float) m_position[m_area].y;
	} // getY

	/**************************************************************************
	 * Set Position on current page (no check)
	 * 
	 * @param p point relative in area
	 */
	protected void setRelativePosition(Point2D p) {
		if (p == null)
			return;
		Rectangle part = m_content;
		if (m_area == AREA_HEADER)
			part = m_header;
		else if (m_area == AREA_FOOTER)
			part = m_footer;
		m_position[m_area].setLocation(part.x + p.getX(), part.y + p.getY());
		log.finest("Page=" + m_pageNo + " [" + m_area + "] " + m_position[m_area].x + "/" + m_position[m_area].y);
	} // setPosition

	/**************************************************************************
	 * Return remaining X dimension space _ on current page in Area
	 * 
	 * @return space in 1/72 inch remaining in line
	 */
	public float getXspace() {
		Rectangle part = m_content;
		if (m_area == AREA_HEADER)
			part = m_header;
		else if (m_area == AREA_FOOTER)
			part = m_footer;
		//
		return (float) (part.x + part.width - m_position[m_area].x);
	} // getXspace

	/**
	 * Remaining Space is OK for Width in Area
	 * 
	 * @param width width
	 * @return true if width fits in area
	 */
	public boolean isXspaceFor(float width) {
		return (getXspace() - width) >= 0f;
	} // isXspaceFor

	/**
	 * Include Table Format
	 * 
	 * @param item print format item
	 * @param data print data
	 * @return Print Element
	 */
	private PrintElement includeFormat(PrintFormatItem item, PrintData data) {
		newLine();
		PrintElement element = null;
		//
		PrintFormat format = PrintUtil.getPrintFormat(item.getADPrintFormatChildID());
		format.setLanguage(m_format.getLanguage());
		if (m_format.isTranslationView())
			format.setTranslationLanguage(m_format.getLanguage());
		int AD_Column_ID = item.getADColumnID();
		log.info(format + " - Item=" + item.getName() + " (" + AD_Column_ID + ")");
		//
		Object obj = data.getNode(new Integer(AD_Column_ID));
		// Object obj = data.getNode(item.getColumnName()); // slower
		if (obj == null) {
			data.dumpHeader();
			data.dumpCurrentRow();
			log.log(Level.SEVERE, "No Node - AD_Column_ID=" + AD_Column_ID + " - " + item + " - " + data);
			return null;
		}
		PrintDataElement dataElement = (PrintDataElement) obj;
		String recordString = dataElement.getValueKey();
		if (recordString == null || recordString.length() == 0) {
			data.dumpHeader();
			data.dumpCurrentRow();
			log.log(Level.SEVERE, "No Record Key - " + dataElement + " - AD_Column_ID=" + AD_Column_ID + " - " + item);
			return null;
		}
		// int Record_ID = 0;
		// try {
		// Record_ID = Integer.parseInt(recordString);
		// } catch (Exception e) {
		// data.dumpCurrentRow();
		// log.log(Level.SEVERE, "Invalid Record Key - " + recordString + " (" +
		// e.getMessage() + ") - AD_Column_ID=" + AD_Column_ID
		// + " - " + item);
		// return null;
		// }
		DataEngine de = new DataEngine(format.getLanguage());
		PrintData includedData = de.getPrintData(printInfo, format, m_query);
		if (includedData == null)
			return null;
		log.fine(includedData.toString());
		//
		element = layoutTable(format, includedData, item.getXSpace());
		// handle multi page tables
		if (element.getPageCount() > 1) {
			Point2D.Double loc = m_position[m_area];
			element.setLocation(loc);
			for (int p = 1; p < element.getPageCount(); p++) {
				m_currPage.addElement(element);
				newPage(true, false);
			}
			m_position[m_area] = loc;
			((TableElement) element).setHeightToLastPage();
		}

		m_lastWidth[m_area] = element.getWidth();
		m_lastHeight[m_area] = element.getHeight();

		if (!isXspaceFor(m_lastWidth[m_area])) {
			log.finest("Not enough X space for " + m_lastWidth[m_area] + " - remaining " + getXspace() + " - Area=" + m_area);
			newLine();
		}
		if (m_area == AREA_CONTENT && !isYspaceFor(m_lastHeight[m_area])) {
			log.finest("Not enough Y space " + m_lastHeight[m_area] + " - remaining " + getYspace() + " - Area=" + m_area);
			newPage(true, false);
		}
		//
		return element;
	} // includeFormat

	/**
	 * Set Position on current page (no check)
	 * 
	 * @param x x position in 1/72 inch
	 * @param y y position in 1/72 inch
	 */
	protected void setRelativePosition(float x, float y) {
		setRelativePosition(new Point2D.Float(x, y));
	} // setPosition

	/**
	 * Create Image Element from item
	 * 
	 * @param item item
	 * @return image element
	 */
	private PrintElement createImageElement(PrintFormatItem item) {
		Object obj = m_data.getNode(new Integer(item.getADColumnID()));
		if (obj == null)
			return null;
		else if (obj instanceof PrintDataElement)
			;
		else {
			log.log(Level.SEVERE, "Element not PrintDataElement " + obj.getClass());
			return null;
		}

		PrintDataElement data = (PrintDataElement) obj;
		if (data.isNull() && item.isSuppressNull())
			return null;
		String url = data.getValueDisplay(m_format.getLanguage());
		if ((url == null || url.length() == 0)) {
			if (item.isSuppressNull())
				return null;
			else
				// should create an empty area
				return null;
		}
		ImageElement element = null;
		if (data.getDisplayType() == DisplayType.Image) {
			element = ImageElement.get(data, url);
		} else {
			element = ImageElement.get(url);
		}
		return element;
	} // createImageElement

	/**
	 * Create Barcode Element
	 * 
	 * @param item item
	 * @return barcode element
	 */
	private PrintElement createBarcodeElement(PrintFormatItem item) {
		// Get Data
		Object obj = m_data.getNode(new Integer(item.getADColumnID()));
		if (obj == null)
			return null;
		else if (obj instanceof PrintDataElement)
			;
		else {
			log.log(Level.SEVERE, "Element not PrintDataElement " + obj.getClass());
			return null;
		}

		// Convert DataElement to String
		PrintDataElement data = (PrintDataElement) obj;
		if (data.isNull() && item.isSuppressNull())
			return null;
		String stringContent = data.getValueDisplay(m_format.getLanguage());
		if ((stringContent == null || stringContent.length() == 0) && item.isSuppressNull())
			return null;

		// BarcodeElement element = new BarcodeElement(stringContent, item);
		// if (element.isValid())
		// return element;
		return null;
	} // createBarcodeElement

	/**
	 * Create Box/Line Element
	 * 
	 * @param item item
	 * @return box element
	 */
	private PrintElement createBoxElement(PrintFormatItem item) {
		Color color = getColor(); // default
		if (item.getADPrintColorID() != 0 && printColor.getADPrintColorID() != item.getADPrintColorID()) {
			PrintColor c = PrintUtil.getPrintColor(item.getADPrintColorID());
			if (c.getColor() != null)
				color = c.getColor();
		}
		return new BoxElement(item, color);
	} // createBoxElement

	private Color getColor() {
		if (printColor == null)
			return Color.BLACK;
		return printColor.getColor();
	}

	/**
	 * Create Field Element
	 * 
	 * @param item Format Item
	 * @param maxWidth max width
	 * @param FieldAlignmentType alignment type (MPrintFormatItem.FIELD_ALIGN_*)
	 * @param isForm true if document
	 * @return Print Element or null if nothing to print
	 */
	private PrintElement createFieldElement(PrintFormatItem item, int maxWidth, String FieldAlignmentType, boolean isForm) {
		// Get Data
		Object obj = m_data.getNode(new Integer(item.getADColumnID()));
		if (obj == null)
			return null;
		else if (obj instanceof PrintDataElement)
			;
		else {
			log.log(Level.SEVERE, "Element not PrintDataElement " + obj.getClass());
			return null;
		}

		// Convert DataElement to String
		PrintDataElement data = (PrintDataElement) obj;
		if (data.isNull() && item.isSuppressNull())
			return null;
		String stringContent = data.getValueDisplay(m_format.getLanguage());
		if ((stringContent == null || stringContent.length() == 0) && item.isSuppressNull())
			return null;
		// non-string
		Object content = stringContent;
		if (data.getValue() instanceof Boolean)
			content = data.getValue();

		// Convert AmtInWords Content to alpha
		if (item.getColumnName().equals("AmtInWords")) {
			log.fine("AmtInWords: " + stringContent);
			// TODO
			stringContent = MsgUtil.getAmtInWords(m_format.getLanguage(), stringContent);
			content = stringContent;
		}
		// Label
		String label = item.getPrintName(m_format.getLanguage());
		String labelSuffix = item.getPrintNameSuffix(m_format.getLanguage());

		// ID Type
		NamePair ID = null;
		if (data.isID()) { // Record_ID/ColumnName
			Object value = data.getValue();
			if (value instanceof KeyNamePair)
				ID = new KeyNamePair(((KeyNamePair) value).getKey(), item.getColumnName());
			else if (value instanceof ValueNamePair)
				ID = new ValueNamePair(((ValueNamePair) value).getValue(), item.getColumnName());
		} else if (PrintFormatItem.FIELDALIGNMENTTYPE_Default.equals(FieldAlignmentType)) {
			if (data.isNumeric())
				FieldAlignmentType = PrintFormatItem.FIELDALIGNMENTTYPE_TrailingRight;
			else
				FieldAlignmentType = PrintFormatItem.FIELDALIGNMENTTYPE_LeadingLeft;
		}

		// Get Color/ Font
		Color color = getColor(); // default
		if (ID != null && !isForm)
			; // link color/underline handeled in PrintElement classes
		else if (item.getADPrintColorID() != 0 && printColor.getADPrintColorID() != item.getADPrintColorID()) {
			PrintColor c = PrintUtil.getPrintColor(item.getADPrintColorID());
			if (c.getColor() != null)
				color = c.getColor();
		}

		Font font = printFont.getFont(); // default
		if (item.getADPrintFontID() != 0 && printFont.getADPrintFontID() != item.getADPrintFontID()) {
			PrintFont f = PrintUtil.getPrintFont(item.getADPrintFontID());
			if (f.getFont() != null)
				font = f.getFont();
		}

		// Create String, HTML or Location
		PrintElement e = null;
		if (data.getDisplayType() == DisplayType.Location) {
			e = new LocationElement(((KeyNamePair) ID).getKey(), font, color, item.isHeightOneLine(), label, labelSuffix, m_format
					.getLanguage().getName());
			e.layout(maxWidth, item.getMaxHeight(), item.isHeightOneLine(), FieldAlignmentType);
		} else {
			if (HTMLElement.isHTML(stringContent))
				e = new HTMLElement(stringContent);
			else
				e = new StringElement(content, font, color, isForm ? null : ID, label, labelSuffix);
			e.layout(maxWidth, item.getMaxHeight(), item.isHeightOneLine(), FieldAlignmentType);
		}
		return e;
	} // createFieldElement

	/**
	 * Create String Element
	 * 
	 * @param content string to be printed
	 * @param AD_PrintColor_ID color
	 * @param AD_PrintFont_ID font
	 * @param maxWidth max width
	 * @param maxHeight max height
	 * @param isHeightOneLine onle line only
	 * @param FieldAlignmentType alignment type (MPrintFormatItem.FIELD_ALIGN_*)
	 * @param isTranslated if true and content contaiins @variable@, it is
	 *            dynamically translated during print
	 * @return Print Element
	 */
	private PrintElement createStringElement(String content, int AD_PrintColor_ID, int AD_PrintFont_ID, int maxWidth, int maxHeight,
			boolean isHeightOneLine, String FieldAlignmentType, boolean isTranslated) {
		if (content == null || content.length() == 0)
			return null;
		// Color / Font
		Color color = getColor(); // default
		if (AD_PrintColor_ID != 0 && printColor.getADPrintColorID() != AD_PrintColor_ID) {
			PrintColor c = PrintUtil.getPrintColor(AD_PrintColor_ID);
			if (c.getColor() != null)
				color = c.getColor();
		}
		Font font = printFont.getFont(); // default
		if (AD_PrintFont_ID != 0 && printFont.getADPrintFontID() != AD_PrintFont_ID) {
			PrintFont f = PrintUtil.getPrintFont(AD_PrintFont_ID);
			if (f.getFont() != null)
				font = f.getFont();
		}
		PrintElement e = new StringElement(content, font, color, isTranslated);
		e.layout(maxWidth, maxHeight, isHeightOneLine, FieldAlignmentType);
		return e;
	} // createStringElement

	private void layoutForm() {
		log.info("layoutForm");
		if (m_data == null)
			return;
		// for every row
		for (int row = 0; row < m_data.getRowCount(); row++) {
			log.info("Row=" + row);
			m_data.setRowIndex(row);
			boolean somethingPrinted = true;
			// for every item
			for (int i = 0; i < m_format.getItemCount(); i++) {
				PrintFormatItem item = m_format.getItem(i);
				log.fine("layoutForm - Row=" + row + " - #" + i + " - " + item);
				if (!item.isPrinted())
					continue;
				log.fine("layoutForm - Row=" + row + " - #" + i + " - " + item);
				// Read Header/Footer just once
				if (row > 0 && (item.isHeader() || item.isFooter()))
					continue;
				// Position
				if (item.isHeader()) // Area
					setArea(AREA_HEADER);
				else if (item.isFooter())
					setArea(AREA_FOOTER);
				else
					setArea(AREA_CONTENT);
				//
				if (item.isSetNLPosition() && item.isRelativePosition())
					m_tempNLPositon = 0;
				// New Page/Line
				if (item.isNextLine() && somethingPrinted) // new line
				{
					newLine();
					somethingPrinted = false;
				} else {
					addX(m_lastWidth[m_area]);
				}
				if (item.isNextPage()) // item.isPageBreak() // new page
				{
					newPage(false, false);
				}
				// Relative Position space
				if (item.isRelativePosition()) {
					addX(item.getXSpace());
					addY(item.getYSpace());
				} else
					// Absolute relative position
					setRelativePosition(item.getXPosition(), item.getYPosition());
				// Temporary NL Position when absolute positioned
				if (item.isSetNLPosition() && !item.isRelativePosition())
					m_tempNLPositon = (int) getPosition().getX();

				// line alignment
				String alignment = item.getFieldAlignmentType();
				int maxWidth = item.getMaxWidth();
				boolean lineAligned = false;
				if (item.isRelativePosition()) {
					if (item.isLineAlignLeading()) {
						alignment = PrintFormatItem.FIELDALIGNMENTTYPE_LeadingLeft;
						maxWidth = getAreaBounds().width;
						lineAligned = true;
					} else if (item.isLineAlignCenter()) {
						alignment = PrintFormatItem.FIELDALIGNMENTTYPE_Center;
						maxWidth = getAreaBounds().width;
						lineAligned = true;
					} else if (item.isLineAlignTrailing()) {
						alignment = PrintFormatItem.FIELDALIGNMENTTYPE_TrailingRight;
						maxWidth = getAreaBounds().width;
						lineAligned = true;
					}
				}

				// Type
				PrintElement element = null;
				if (item.isTypePrintFormat()) // ** included PrintFormat
				{
					element = includeFormat(item, m_data);
				} else if (item.isBarcode()) {
					element = createBarcodeElement(item);
					if (element != null) {
						element.layout(maxWidth, item.getMaxHeight(), false, alignment);
					}
				} else if (item.isTypeImage()) {
					if (item.isImageField())
						element = createImageElement(item);
					else if (item.isImageIsAttached())
						element = ImageElement.get(item.getADPrintFormatItemID());
					else
						element = ImageElement.get(item.getImageURL());
					if (element != null)
						element.layout(maxWidth, item.getMaxHeight(), false, alignment);
				} else if (item.isTypeField()) {
					if (maxWidth == 0 && item.isFieldAlignBlock())
						maxWidth = getAreaBounds().width;
					element = createFieldElement(item, maxWidth, alignment, m_format.isForm());
				} else if (item.isTypeBox()) {
					if (m_format.isForm())
						element = createBoxElement(item);
					// Auto detect width - teo_sarca, BF [ 1825876 ]
					if (element != null && maxWidth == 0) {
						maxWidth = getAreaBounds().width;
						element.setMaxWidth(maxWidth);
					}
				} else {
					if (maxWidth == 0 && item.isFieldAlignBlock())
						maxWidth = getAreaBounds().width;
					element = createStringElement(item.getPrintName(m_format.getLanguage()), item.getADPrintColorID(),
							item.getADPrintFontID(), maxWidth, item.getMaxHeight(), item.isHeightOneLine(), alignment, true);
				}

				// Printed - set last width/height
				if (element != null) {
					somethingPrinted = true;
					if (!lineAligned)
						m_lastWidth[m_area] = element.getWidth();
					m_lastHeight[m_area] = element.getHeight();
				} else {
					somethingPrinted = false;
					m_lastWidth[m_area] = 0f;
					m_lastHeight[m_area] = 0f;
					// Carlos Ruiz - globalqss - 20060826
					// Fix problem when the element is not printed but X Space
					// was previously added
					if (item.isRelativePosition()) {
						addX(-item.getXSpace());
						addY(-item.getYSpace());
					}
					// end globalqss
				}

				// Does it fit?
				if (item.isRelativePosition() && !lineAligned) {
					if (!isXspaceFor(m_lastWidth[m_area])) {
						log.finest("Not enough X space for " + m_lastWidth[m_area] + " - remaining " + getXspace() + " - Area=" + m_area);
						newLine();
					}
					if (m_area == AREA_CONTENT && !isYspaceFor(m_lastHeight[m_area])) {
						log.finest("Not enough Y space " + m_lastHeight[m_area] + " - remaining " + getYspace() + " - Area=" + m_area);
						newPage(true, true);
					}
				}
				// We know Position and Size
				// log.fine( "LayoutEngine.layoutForm",
				// "Page=" + m_pageNo + " [" + m_area + "] " +
				// m_position[m_area].x + "/" + m_position[m_area].y
				// + " w=" + lastWidth[m_area] + ",h=" + lastHeight[m_area] +
				// " " + item);
				if (element != null)
					element.setLocation(m_position[m_area]);
				// Add to Area
				if (m_area == AREA_CONTENT)
					m_currPage.addElement(element);
				else
					m_headerFooter.addElement(element);
				//
				if (m_lastHeight[m_area] > m_maxHeightSinceNewLine[m_area])
					m_maxHeightSinceNewLine[m_area] = m_lastHeight[m_area];
				// Reset maxHeightSinceNewLine if we have an absolute position -
				// teo_sarca BF [ 1807917 ]
				if (!item.isRelativePosition())
					m_maxHeightSinceNewLine[m_area] = m_lastHeight[m_area];

			} // for every item
		} // for every row
	}

	public Rectangle getAreaBounds() {
		Rectangle part = m_content;
		if (m_area == AREA_HEADER)
			part = m_header;
		else if (m_area == AREA_FOOTER)
			part = m_footer;
		//
		return part;
	} // getAreaBounds

	private PrintElement layoutParameter() {
		if (m_query != null/* || !m_query.isActive() */)
			return null;
		//
		ParameterElement pe = new ParameterElement(m_query, m_format.getTableFormat());
		pe.layout(0, 0, false, null);
		return pe;
	}

	private void createStandardHeaderFooter() {
		ADClientInfo ci = PrintUtil.getClientInfo();
		PrintElement element = null;
		if (null != ci.getLogoReportID()) {
			element = new ImageElement(ci.getLogoReportID(), false);
		} else {
			// element = new
			// ImageElement(org.compiere.Adempiere.getImageLogoSmall(true)); //
			// 48x15
		}
		element = new ImageElement(Adempiere.getImageLogo()); //
		// 100x30
		element.layout(100, 30, false, PrintFormatItem.FIELDALIGNMENTTYPE_LeadingLeft);
		element.setLocation(m_header.getLocation());
		m_headerFooter.addElement(element);
		//
		PrintTableFormat tf = m_format.getTableFormat();
		Font font = tf.getPageHeader_Font();
		Color color = tf.getPageHeaderFG_Color();
		//
		element = new StringElement("@*ReportName@", font, color, true);
		element.layout(m_header.width, 0, false, PrintFormatItem.FIELDALIGNMENTTYPE_Center);
		element.setLocation(m_header.getLocation());
		m_headerFooter.addElement(element);
		//
		//
		element = new StringElement("@Page@ @*Page@ @of@ @*PageCount@", font, color, true);
		element.layout(m_header.width, 0, false, PrintFormatItem.FIELDALIGNMENTTYPE_TrailingRight);
		element.setLocation(m_header.getLocation());
		m_headerFooter.addElement(element);

		// Footer
		font = tf.getPageFooter_Font();
		color = tf.getPageFooterFG_Color();
		//
		element = new StringElement(Adempiere.copyRight(), font, color, true);
		/** You can use the following to customize reports for your product name */
		// element = new StringElement(Adempiere.NAME, font, color, null, true);
		element.layout(m_footer.width, 0, true, PrintFormatItem.FIELDALIGNMENTTYPE_LeadingLeft);
		Point ft = m_footer.getLocation();
		ft.y += m_footer.height - element.getHeight() - 2; // 2pt above min
		element.setLocation(ft);
		m_headerFooter.addElement(element);
		//
		element = new StringElement("@*Header@", font, color, true);
		element.layout(m_footer.width, 0, true, PrintFormatItem.FIELDALIGNMENTTYPE_Center);
		element.setLocation(ft);
		m_headerFooter.addElement(element);
		//
		element = new StringElement("@*CurrentDateTime@", font, color, true);
		element.layout(m_footer.width, 0, true, PrintFormatItem.FIELDALIGNMENTTYPE_TrailingRight);
		element.setLocation(ft);
		m_headerFooter.addElement(element);
	}

	public CPaper getPaper() {
		return m_paper;
	}

	/**************************************************************************
	 * Set Paper
	 * 
	 * @param paper Paper
	 */
	public void setPaper(CPaper paper) {
		setPaper(paper, m_headerHeight, m_footerHeight);
	} // setPaper

	/**
	 * Set Paper Optionally re-calculate layout
	 * 
	 * @param paper Paper
	 * @param headerHeight header height
	 * @param footerHeight footer height
	 */
	public void setPaper(CPaper paper, int headerHeight, int footerHeight) {
		if (paper == null)
			return;
		//
		boolean paperChange = headerHeight != m_headerHeight || footerHeight != m_footerHeight;
		if (!paperChange)
			paperChange = !paper.equals(m_paper);
		//
		log.fine(paper + " - Header=" + headerHeight + ", Footer=" + footerHeight);
		m_paper = paper;
		m_headerHeight = headerHeight;
		m_footerHeight = footerHeight;
		calculatePageSize();
		//
		if (m_hasLayout && paperChange)
			layout(); // re-calculate
	} // setPaper

	/**
	 * Calculate Page size based on Paper and header/footerHeight.
	 * 
	 * <pre>
	 *  Paper: 8.5x11.0" Portrait x=32.0,y=32.0 w=548.0,h=728.0
	 *  +------------------------ Paper   612x792
	 *  |    non-imageable space          32x32
	 *  |  +--------------------- Header = printable area start
	 *  |  | headerHeight=32      =>  [x=32,y=32,width=548,height=32]
	 *  |  +--------------------- Content
	 *  |  |                      =>  [x=32,y=64,width=548,height=664]
	 *  |  |
	 *  |  |
	 *  |  |
	 *  |  +--------------------- Footer
	 *  |  | footerHeight=32      =>  [x=32,y=728,width=548,height=32]
	 *  |  +--------------------- Footer end = printable area end
	 *  |   non-imageable space
	 *  +------------------------
	 * </pre>
	 */
	private void calculatePageSize() {
		int x = (int) m_paper.getImageableX(true);
		int w = (int) m_paper.getImageableWidth(true);
		//
		int y = (int) m_paper.getImageableY(true);
		int h = (int) m_paper.getImageableHeight(true);

		int height = m_headerHeight;
		m_header.setBounds(x, y, w, height);
		//
		y += height;
		height = h - m_headerHeight - m_footerHeight;
		m_content.setBounds(x, y, w, height);
		//
		y += height;
		height = m_footerHeight;
		m_footer.setBounds(x, y, w, height);

		log.fine("Paper=" + m_paper + ",HeaderHeight=" + m_headerHeight + ",FooterHeight=" + m_footerHeight + " => Header=" + m_header
				+ ",Contents=" + m_content + ",Footer=" + m_footer);
	} // calculatePageSize

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
		m_currPage = new Page(m_pageNo);
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

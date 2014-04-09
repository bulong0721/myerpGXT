package org.adempiere.print.model;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.adempiere.model.ADPrintTableFormat;
import org.adempiere.print.PrintUtil;
import org.adempiere.util.CLogger;
import org.adempiere.util.EnvUtil;

public class PrintTableFormat extends ADPrintTableFormat {
	private static final int	TABLE_ID						= 302;
	private static final long	serialVersionUID				= 1L;
	private static CLogger		log								= CLogger.getCLogger(PrintTableFormat.class);
	public static final int		LINESTROKETYPE_AD_Reference_ID	= 312;
	/** Solid Line = S */
	public static final String	LINESTROKETYPE_SolidLine		= "S";
	/** Dashed Line = D */
	public static final String	LINESTROKETYPE_DashedLine		= "D";
	/** Dotted Line = d */
	public static final String	LINESTROKETYPE_DottedLine		= "d";
	/** Dash-Dotted Line = 2 */
	public static final String	LINESTROKETYPE_Dash_DottedLine	= "2";
	/** HdrStrokeType AD_Reference_ID=312 */
	public static final int		HDRSTROKETYPE_AD_Reference_ID	= 312;
	/** Solid Line = S */
	public static final String	HDRSTROKETYPE_SolidLine			= "S";
	/** Dashed Line = D */
	public static final String	HDRSTROKETYPE_DashedLine		= "D";
	/** Dotted Line = d */
	public static final String	HDRSTROKETYPE_DottedLine		= "d";
	/** Dash-Dotted Line = 2 */
	public static final String	HDRSTROKETYPE_Dash_DottedLine	= "2";

	public PrintTableFormat() {
	}

	public PrintTableFormat(ADPrintTableFormat raw) {
		setADClientID(raw.getADClientID());
		setADImageID(raw.getADImageID());
		setADOrgID(raw.getADOrgID());
		setADPrintTableFormatID(raw.getADPrintTableFormatID());
		setActive(raw.isActive());
		setCreated(raw.getCreated());
		setCreatedBy(raw.getCreatedBy());
		setDescription(raw.getDescription());
		setFooterCenter(raw.getFooterCenter());
		setFooterLeft(raw.getFooterLeft());
		setFooterRight(raw.getFooterRight());
		setFunctBGPrintColorID(raw.getFunctBGPrintColorID());
		setFunctFGPrintColorID(raw.getFunctFGPrintColorID());
		setFunctPrintFontID(raw.getFunctPrintFontID());
		setHdrLinePrintColorID(raw.getHdrLinePrintColorID());
		setHdrPrintFontID(raw.getHdrPrintFontID());
		setHdrStroke(raw.getHdrStroke());
		setHdrStrokeType(raw.getHdrStrokeType());
		setHdrTextBGPrintColorID(raw.getHdrTextBGPrintColorID());
		setHdrTextFGPrintColorID(raw.getHdrTextFGPrintColorID());
		setHeaderCenter(raw.getHeaderCenter());
		setHeaderLeft(raw.getHeaderLeft());
		setHeaderRight(raw.getHeaderRight());
		setImageIsAttached(raw.isImageIsAttached());
		setImageURL(raw.getImageURL());
		setIsDefault(raw.isIsDefault());
		setLinePrintColorID(raw.getLinePrintColorID());
		setLineStroke(raw.getLineStroke());
		setLineStrokeType(raw.getLineStrokeType());
		setMultiLineHeader(raw.isMultiLineHeader());
		setName(raw.getName());
		setPaintBoundaryLines(raw.isPaintBoundaryLines());
		setPaintHLines(raw.isPaintHLines());
		setPaintHeaderLines(raw.isPaintHeaderLines());
		setPaintVLines(raw.isPaintVLines());
		setPrintFunctionSymbols(raw.isPrintFunctionSymbols());
		setUpdated(raw.getUpdated());
		setUpdatedBy(raw.getUpdatedBy());
	}

	private Font	standard_Font		= new Font(null);
	private Font	pageHeader_Font;
	private Font	pageFooter_Font;
	private Color	pageHeaderFG_Color;
	private Color	pageHeaderBG_Color;
	private Color	pageFooterFG_Color;
	private Color	pageFooterBG_Color;

	private Font	parameter_Font;
	private Color	parameter_Color;

	private Font	header_Font;
	private Color	headerFG_Color;
	private Color	headerBG_Color;
	private Color	hdrLine_Color;
	private Stroke	header_Stroke;

	private Font	funct_Font;
	private Color	functFG_Color;
	private Color	functBG_Color;

	private Color	lineH_Color;
	private Color	lineV_Color;
	private Stroke	lineH_Stroke;
	private Stroke	lineV_Stroke;
	//
	private Image	m_image				= null;
	private Image	m_image_water_mark	= null;

	/**************************************************************************
	 * Set Standard Font to derive other fonts if not defined
	 * 
	 * @param standardFont standard font
	 */
	public void setStandard_Font(Font standardFont) {
		if (standardFont != null)
			standard_Font = standardFont;
	} // setStandard_Font

	/**
	 * Get Stndard Font
	 * 
	 * @return stndard font
	 */
	public Font getStandard_Font() {
		return standard_Font;
	} // getStandard_Font

	/**************************************************************************
	 * Get Table Header Font
	 * 
	 * @return table header font or Bold standard font
	 */
	public Font getHeader_Font() {
		if (header_Font != null)
			return header_Font;
		int i = getHdrPrintFontID();
		if (i != 0)
			header_Font = PrintUtil.getPrintFont(i).getFont();
		if (header_Font == null)
			header_Font = new Font(standard_Font.getName(), Font.BOLD, standard_Font.getSize());
		return header_Font;
	} // getHeader_Font

	/**
	 * Get Header Foreground
	 * 
	 * @return color or blue black
	 */
	public Color getHeaderFG_Color() {
		if (headerFG_Color != null)
			return headerFG_Color;
		int i = getHdrTextFGPrintColorID();
		if (i != 0)
			headerFG_Color = PrintUtil.getPrintColor(i).getColor();
		if (headerFG_Color == null)
			headerFG_Color = PrintColor.blackBlue;
		return headerFG_Color;
	} // getHeaderFG_Color

	/**
	 * Get Header BG Color
	 * 
	 * @return color or cyan
	 */
	public Color getHeaderBG_Color() {
		if (headerBG_Color != null)
			return headerBG_Color;
		int i = getHdrTextBGPrintColorID();
		if (i != 0)
			headerBG_Color = PrintUtil.getPrintColor(i).getColor();
		if (headerBG_Color == null)
			headerBG_Color = Color.cyan;
		return headerBG_Color;
	} // getHeaderBG_Color

	/**
	 * Get Header Line Color
	 * 
	 * @return color or blue black
	 */
	public Color getHeaderLine_Color() {
		if (hdrLine_Color != null)
			return hdrLine_Color;
		int i = getHdrLinePrintColorID();
		if (i != 0)
			hdrLine_Color = PrintUtil.getPrintColor(i).getColor();
		if (hdrLine_Color == null)
			hdrLine_Color = PrintColor.blackBlue;
		return hdrLine_Color;
	} // getHeaderLine_Color

	/**
	 * Get Header Stroke
	 * 
	 * @return Header Stroke (default solid 2pt)
	 */
	public Stroke getHeader_Stroke() {
		if (header_Stroke == null) {
			float width = getHdrStroke().floatValue();
			if (getHdrStrokeType() == null || HDRSTROKETYPE_SolidLine.equals(getHdrStrokeType()))
				header_Stroke = new BasicStroke(width); // -
			//
			else if (HDRSTROKETYPE_DashedLine.equals(getHdrStrokeType()))
				header_Stroke = new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, getPatternDashed(width), 0.0f); // -
																																			// -
			else if (HDRSTROKETYPE_DottedLine.equals(getHdrStrokeType()))
				header_Stroke = new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, getPatternDotted(width), 0.0f); // .
																																			// .
																																			// .
			else if (HDRSTROKETYPE_Dash_DottedLine.equals(getHdrStrokeType()))
				header_Stroke = new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, getPatternDash_Dotted(width),
						0.0f); // - . -
			// default / fallback
			if (header_Stroke == null)
				header_Stroke = new BasicStroke(width); // -
		}
		return header_Stroke;
	} // getHeader_Stroke

	/**
	 * Get Header Stroke for horizontal Lines
	 * 
	 * @return stroke in pt (default 2)
	 */
	public BigDecimal getHdrStroke() {
		BigDecimal retValue = super.getHdrStroke();
		if (retValue == null || EnvUtil.ZERO.compareTo(retValue) <= 0)
			retValue = new BigDecimal(2.0);
		return retValue;
	} // getHdrStroke

	/**************************************************************************
	 * Get Function Font
	 * 
	 * @return function font or BoldItalic standard font
	 */
	public Font getFunct_Font() {
		if (funct_Font != null)
			return funct_Font;
		int i = getFunctPrintFontID();
		if (i != 0)
			funct_Font = PrintUtil.getPrintFont(i).getFont();
		if (funct_Font == null)
			funct_Font = new Font(standard_Font.getName(), Font.BOLD | Font.ITALIC, standard_Font.getSize());
		return funct_Font;
	} // getFunct_Font

	/**
	 * Get Function BG Color
	 * 
	 * @return color or white
	 */
	public Color getFunctBG_Color() {
		if (functBG_Color != null)
			return functBG_Color;
		int i = getFunctBGPrintColorID();
		if (i != 0)
			functBG_Color = PrintUtil.getPrintColor(i).getColor();
		if (functBG_Color == null)
			functBG_Color = Color.white;
		return functBG_Color;
	} // getFunctBG_Color

	/**
	 * Get Function FG Color
	 * 
	 * @return color or green dark
	 */
	public Color getFunctFG_Color() {
		if (functFG_Color != null)
			return functFG_Color;
		int i = getFunctFGPrintColorID();
		if (i != 0)
			functFG_Color = PrintUtil.getPrintColor(i).getColor();
		if (functFG_Color == null)
			functFG_Color = PrintColor.darkGreen;
		return functFG_Color;
	} // getFunctFG_Color

	/**************************************************************************
	 * Get Parameter Font
	 * 
	 * @return Italic standard font
	 */
	public Font getParameter_Font() {
		if (parameter_Font == null)
			parameter_Font = new Font(standard_Font.getName(), Font.ITALIC, standard_Font.getSize());
		return parameter_Font;
	} // getParameter_Font

	/**
	 * Get Parameter Color
	 * 
	 * @return dark gray
	 */
	public Color getParameter_Color() {
		if (parameter_Color == null)
			parameter_Color = Color.darkGray;
		return parameter_Color;
	} // getParameter_Color

	/**************************************************************************
	 * Get Top Page Header Font
	 * 
	 * @return Bold standard font
	 */
	public Font getPageHeader_Font() {
		if (pageHeader_Font == null)
			pageHeader_Font = new Font(standard_Font.getName(), Font.BOLD, standard_Font.getSize());
		return pageHeader_Font;
	} // getPageHeader_Font

	/**
	 * Get Page Header FG_Color
	 * 
	 * @return color or blue black
	 */
	public Color getPageHeaderFG_Color() {
		if (pageHeaderFG_Color == null)
			pageHeaderFG_Color = PrintColor.blackBlue;
		return pageHeaderFG_Color;
	} // getPageHeaderFG_Color

	/**
	 * Get Page Header BG_Color
	 * 
	 * @return color or white
	 */
	public Color getPageHeaderBG_Color() {
		if (pageHeaderBG_Color == null)
			pageHeaderBG_Color = Color.white;
		return pageHeaderBG_Color;
	} // getPageHeaderBG_Color

	/**
	 * Get Page Footer Font
	 * 
	 * @return 2pt smaller standard font
	 */
	public Font getPageFooter_Font() {
		if (pageFooter_Font == null)
			pageFooter_Font = new Font(standard_Font.getName(), Font.PLAIN, standard_Font.getSize() - 2);
		return pageFooter_Font;
	} // getPageFooter_Font

	/**
	 * Get PageFooter FG_Color
	 * 
	 * @return blue black
	 */
	public Color getPageFooterFG_Color() {
		if (pageFooterFG_Color == null)
			pageFooterFG_Color = PrintColor.blackBlue;
		return pageFooterFG_Color;
	} // getPageFooterFG_Color

	/**
	 * Get Page Footer BG_Color
	 * 
	 * @return white
	 */
	public Color getPageFooterBG_Color() {
		if (pageFooterBG_Color == null)
			pageFooterBG_Color = Color.white;
		return pageFooterBG_Color;
	} // getPageFooterBG_Color

	/**************************************************************************
	 * Get Horizontal Line Color. (one db attribute for line color)
	 * 
	 * @return color or gray light
	 */
	public Color getHLine_Color() {
		if (lineH_Color != null)
			return lineH_Color;
		int i = getLinePrintColorID();
		if (i != 0)
			lineH_Color = PrintUtil.getPrintColor(i).getColor();
		if (lineH_Color == null)
			lineH_Color = Color.lightGray;
		return lineH_Color;
	} // getHLine_Color

	/**
	 * Get Verical Line Color. (one db attribute for line color)
	 * 
	 * @return color or gray light
	 */
	public Color getVLine_Color() {
		if (lineV_Color != null)
			return lineV_Color;
		int i = getLinePrintColorID();
		if (i != 0)
			lineV_Color = PrintUtil.getPrintColor(i).getColor();
		if (lineV_Color == null)
			lineV_Color = Color.lightGray;
		return lineV_Color;
	} // getVLine_Color

	/**
	 * Get Horizontal Line Stroke - (same DB line column)
	 * 
	 * @return solid line baded on line width (default solid 1p)
	 */
	public Stroke getHLine_Stroke() {
		if (lineH_Stroke == null) {
			float width = getLineStroke().floatValue() / 2;
			if (getHdrStrokeType() == null || LINESTROKETYPE_DottedLine.equals(getLineStrokeType()))
				lineH_Stroke = new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, getPatternDotted(width), 0.0f); // .
																																			// .
																																			// .
			//
			else if (LINESTROKETYPE_SolidLine.equals(getLineStrokeType()))
				lineH_Stroke = new BasicStroke(width); // -
			else if (LINESTROKETYPE_DashedLine.equals(getLineStrokeType()))
				lineH_Stroke = new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, getPatternDashed(width), 0.0f); // -
																																			// -
			else if (LINESTROKETYPE_Dash_DottedLine.equals(getLineStrokeType()))
				lineH_Stroke = new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, getPatternDash_Dotted(width),
						0.0f); // - . -
			// default / fallback
			if (lineH_Stroke == null)
				lineH_Stroke = new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, getPatternDotted(width), 0.0f); // .
																																			// .
																																			// .
		}
		return lineH_Stroke;
	} // getHLine_Stroke

	/**
	 * Get Vertical Line Stroke | (same DB line column)
	 * 
	 * @return line based on line (1/2 of) width and stroke (default dotted 1/2p
	 */
	public Stroke getVLine_Stroke() {
		if (lineV_Stroke == null) {
			float width = getLineStroke().floatValue() / 2;
			if (getHdrStrokeType() == null || LINESTROKETYPE_DottedLine.equals(getLineStrokeType()))
				lineV_Stroke = new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, getPatternDotted(width), 0.0f); // .
																																			// .
																																			// .
			//
			else if (LINESTROKETYPE_SolidLine.equals(getLineStrokeType()))
				lineV_Stroke = new BasicStroke(width); // -
			else if (LINESTROKETYPE_DashedLine.equals(getLineStrokeType()))
				lineV_Stroke = new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, getPatternDashed(width), 0.0f); // -
																																			// -
			else if (LINESTROKETYPE_Dash_DottedLine.equals(getLineStrokeType()))
				lineV_Stroke = new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, getPatternDash_Dotted(width),
						0.0f); // - . -
			// default / fallback
			if (lineV_Stroke == null)
				lineV_Stroke = new BasicStroke(width, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 1.0f, getPatternDotted(width), 0.0f); // .
																																			// .
																																			// .
		}
		return lineV_Stroke;
	} // getVLine_Stroke

	/**
	 * Get Horizontal Stroke for Lines -
	 * 
	 * @return stroke in pt (default 1)
	 */
	public BigDecimal getLineStroke() {
		BigDecimal retValue = super.getLineStroke();
		if (retValue == null || EnvUtil.ZERO.compareTo(retValue) <= 0)
			retValue = new BigDecimal(1.0);
		return retValue;
	} // getLineStroke

	/**
	 * Get Vertical Stroke for Lines |
	 * 
	 * @return stroke in pt (default 1)
	 */
	public BigDecimal getVLineStroke() {
		BigDecimal retValue = super.getLineStroke();
		if (retValue == null || EnvUtil.ZERO.compareTo(retValue) <= 0)
			retValue = new BigDecimal(1.0);
		return retValue;
	} // getVLineStroke

	/**
	 * Get Pattern Dotted . . . .
	 * 
	 * @param width width of line
	 * @return pattern
	 */
	private float[] getPatternDotted(float width) {
		return new float[] { 2 * width, 2 * width };
	} // getPatternDotted

	/**
	 * Get Pattern Dashed - - - -
	 * 
	 * @param width width of line
	 * @return pattern
	 */
	private float[] getPatternDashed(float width) {
		return new float[] { 10 * width, 4 * width };
	} // getPatternDashed

	/**
	 * Get Pattern Dash Dotted - . - .
	 * 
	 * @param width width of line
	 * @return pattern
	 */
	private float[] getPatternDash_Dotted(float width) {
		return new float[] { 10 * width, 2 * width, 2 * width, 2 * width };
	} // getPatternDash_Dotted

	/**
	 * Get the Image
	 * 
	 * @return image
	 */
	public Image getImage() {
		if (m_image != null) {
			return m_image;
		}
		//
		if (isImageIsAttached()) {
			PrintAttachment attachment = PrintUtil.getPrintAttachment(TABLE_ID, getADPrintTableFormatID());
			if (attachment == null) {
				log.log(Level.WARNING, "No Attachment - ID=" + getADPrintTableFormatID());
				return null;
			}
			if (attachment.getEntryCount() != 1) {
				log.log(Level.WARNING, "Need just 1 Attachment Entry = " + attachment.getEntryCount());
				return null;
			}
			byte[] imageData = attachment.getEntryData(0);
			if (imageData != null) {
				m_image = Toolkit.getDefaultToolkit().createImage(imageData);
			}
			if (m_image != null) {
				log.fine(attachment.getEntryName(0) + " - Size=" + imageData.length);
			} else {
				log.log(Level.WARNING, attachment.getEntryName(0) + " - not loaded (must be gif or jpg) - ID=" + getADPrintTableFormatID());
			}
		} else if (getImageURL() != null) {
			URL url;
			try {
				url = new URL(getImageURL());
				Toolkit tk = Toolkit.getDefaultToolkit();
				m_image = tk.getImage(url);
			} catch (MalformedURLException e) {
				log.log(Level.WARNING, "Malformed URL - " + getImageURL(), e);
			}
		}
		return m_image;
	} // getImage

	/**
	 * Get the Image
	 * 
	 * @return image
	 */
	public Image getImageWaterMark() {
		if (m_image_water_mark != null) {
			return m_image_water_mark;
		}
		//
		if (getADImageID() > 0) {
			m_image_water_mark = PrintUtil.getPrintImage(getADImageID()).getImage();
		}
		return m_image_water_mark;
	} // getImage
} // PrintTableFormat

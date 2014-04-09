package org.adempiere.print.model;

import org.adempiere.common.Language;
import org.adempiere.model.ADPrintFormatItem;

public class PrintFormatItem extends ADPrintFormatItem {
	private static final long	serialVersionUID							= 1L;
	/** BarcodeType AD_Reference_ID=377 */
	public static final int		BARCODETYPE_AD_Reference_ID					= 377;
	/** Codabar 2 of 7 linear = 2o9 */
	public static final String	BARCODETYPE_Codabar2Of7Linear				= "2o9";
	/** Code 39 3 of 9 linear w/o Checksum = 3o9 */
	public static final String	BARCODETYPE_Code393Of9LinearWOChecksum		= "3o9";
	/** Codeabar linear = COD */
	public static final String	BARCODETYPE_CodeabarLinear					= "COD";
	/** Code 128 dynamically switching = C28 */
	public static final String	BARCODETYPE_Code128DynamicallySwitching		= "C28";
	/** Code 128 A character set = 28A */
	public static final String	BARCODETYPE_Code128ACharacterSet			= "28A";
	/** Code 128 B character set = 28B */
	public static final String	BARCODETYPE_Code128BCharacterSet			= "28B";
	/** Code 128 C character set = 28C */
	public static final String	BARCODETYPE_Code128CCharacterSet			= "28C";
	/** Code 39 linear with Checksum = C39 */
	public static final String	BARCODETYPE_Code39LinearWithChecksum		= "C39";
	/** EAN 128 = E28 */
	public static final String	BARCODETYPE_EAN128							= "E28";
	/** Global Trade Item No GTIN UCC/EAN 128 = GTN */
	public static final String	BARCODETYPE_GlobalTradeItemNoGTINUCCEAN128	= "GTN";
	/** Codabar Monarch linear = MON */
	public static final String	BARCODETYPE_CodabarMonarchLinear			= "MON";
	/** Codabar NW-7 linear = NW7 */
	public static final String	BARCODETYPE_CodabarNW_7Linear				= "NW7";
	/** PDF417 two dimensional = 417 */
	public static final String	BARCODETYPE_PDF417TwoDimensional			= "417";
	/** SCC-14 shipping code UCC/EAN 128 = C14 */
	public static final String	BARCODETYPE_SCC_14ShippingCodeUCCEAN128		= "C14";
	/** Shipment ID number UCC/EAN 128 = SID */
	public static final String	BARCODETYPE_ShipmentIDNumberUCCEAN128		= "SID";
	/** UCC 128 = U28 */
	public static final String	BARCODETYPE_UCC128							= "U28";
	/** Code 39 USD3 with Checksum = US3 */
	public static final String	BARCODETYPE_Code39USD3WithChecksum			= "US3";
	/** Codabar USD-4 linear = US4 */
	public static final String	BARCODETYPE_CodabarUSD_4Linear				= "US4";
	/** US Postal Service UCC/EAN 128 = USP */
	public static final String	BARCODETYPE_USPostalServiceUCCEAN128		= "USP";
	/** SSCC-18 number UCC/EAN 128 = C18 */
	public static final String	BARCODETYPE_SSCC_18NumberUCCEAN128			= "C18";
	/** Code 39 USD3 w/o Checksum = us3 */
	public static final String	BARCODETYPE_Code39USD3WOChecksum			= "us3";
	/** Code 39 3 of 9 linear with Checksum = 3O9 */
	public static final String	BARCODETYPE_Code393Of9LinearWithChecksum	= "3O9";
	/** Code 39 linear w/o Checksum = c39 */
	public static final String	BARCODETYPE_Code39LinearWOChecksum			= "c39";
	/** EAN 13 = E13 */
	public static final String	BARCODETYPE_EAN13							= "E13";
	/** FieldAlignmentType AD_Reference_ID=253 */
	public static final int		FIELDALIGNMENTTYPE_AD_Reference_ID			= 253;
	/** Default = D */
	public static final String	FIELDALIGNMENTTYPE_Default					= "D";
	/** Leading (left) = L */
	public static final String	FIELDALIGNMENTTYPE_LeadingLeft				= "L";
	/** Trailing (right) = T */
	public static final String	FIELDALIGNMENTTYPE_TrailingRight			= "T";
	/** Block = B */
	public static final String	FIELDALIGNMENTTYPE_Block					= "B";
	/** Center = C */
	public static final String	FIELDALIGNMENTTYPE_Center					= "C";
	/** PrintFormatType AD_Reference_ID=255 */
	public static final int		PRINTFORMATTYPE_AD_Reference_ID				= 255;
	/** Field = F */
	public static final String	PRINTFORMATTYPE_Field						= "F";
	/** Text = T */
	public static final String	PRINTFORMATTYPE_Text						= "T";
	/** Print Format = P */
	public static final String	PRINTFORMATTYPE_PrintFormat					= "P";
	/** Image = I */
	public static final String	PRINTFORMATTYPE_Image						= "I";
	/** Rectangle = R */
	public static final String	PRINTFORMATTYPE_Rectangle					= "R";
	/** Line = L */
	public static final String	PRINTFORMATTYPE_Line						= "L";
	/** LineAlignmentType AD_Reference_ID=254 */
	public static final int		LINEALIGNMENTTYPE_AD_Reference_ID			= 254;
	/** Leading (left) = L */
	public static final String	LINEALIGNMENTTYPE_LeadingLeft				= "L";
	/** Center = C */
	public static final String	LINEALIGNMENTTYPE_Center					= "C";
	/** Trailing (right) = T */
	public static final String	LINEALIGNMENTTYPE_TrailingRight				= "T";
	/** None = X */
	public static final String	LINEALIGNMENTTYPE_None						= "X";
	/** PrintAreaType AD_Reference_ID=256 */
	public static final int		PRINTAREATYPE_AD_Reference_ID				= 256;
	/** Content = C */
	public static final String	PRINTAREATYPE_Content						= "C";
	/** Header = H */
	public static final String	PRINTAREATYPE_Header						= "H";
	/** Footer = F */
	public static final String	PRINTAREATYPE_Footer						= "F";
	/** ShapeType AD_Reference_ID=333 */
	public static final int		SHAPETYPE_AD_Reference_ID					= 333;
	/** 3D Rectangle = 3 */
	public static final String	SHAPETYPE_3DRectangle						= "3";
	/** Oval = O */
	public static final String	SHAPETYPE_Oval								= "O";
	/** Round Rectangle = R */
	public static final String	SHAPETYPE_RoundRectangle					= "R";
	/** Normal Rectangle = N */
	public static final String	SHAPETYPE_NormalRectangle					= "N";

	/*
	 * Type Field
	 * 
	 * @return true if field
	 */
	public boolean isTypeField() {
		return getPrintFormatType().equals(PRINTFORMATTYPE_Field);
	}

	/**
	 * Type Text
	 * 
	 * @return true if text
	 */
	public boolean isTypeText() {
		return getPrintFormatType().equals(PRINTFORMATTYPE_Text);
	}

	/**
	 * Type Print Format
	 * 
	 * @return true if print format
	 */
	public boolean isTypePrintFormat() {
		return getPrintFormatType().equals(PRINTFORMATTYPE_PrintFormat);
	}

	/**
	 * Type Image
	 * 
	 * @return true if image
	 */
	public boolean isTypeImage() {
		return getPrintFormatType().equals(PRINTFORMATTYPE_Image);
	}

	/**
	 * Type Box
	 * 
	 * @return true if box
	 */
	public boolean isTypeBox() {
		return getPrintFormatType().equals(PRINTFORMATTYPE_Line) || getPrintFormatType().equals(PRINTFORMATTYPE_Rectangle);
	}

	/**
	 * Field Center
	 * 
	 * @return true if center
	 */
	public boolean isFieldCenter() {
		return getFieldAlignmentType().equals(FIELDALIGNMENTTYPE_Center);
	}

	/**
	 * Field Align Leading
	 * 
	 * @return true if leading
	 */
	public boolean isFieldAlignLeading() {
		return getFieldAlignmentType().equals(FIELDALIGNMENTTYPE_LeadingLeft);
	}

	/**
	 * Field Align Trailing
	 * 
	 * @return true if trailing
	 */
	public boolean isFieldAlignTrailing() {
		return getFieldAlignmentType().equals(FIELDALIGNMENTTYPE_TrailingRight);
	}

	/**
	 * Field Align Block
	 * 
	 * @return true if block
	 */
	public boolean isFieldAlignBlock() {
		return getFieldAlignmentType().equals(FIELDALIGNMENTTYPE_Block);
	}

	/**
	 * Field Align Default
	 * 
	 * @return true if default alignment
	 */
	public boolean isFieldAlignDefault() {
		return getFieldAlignmentType().equals(FIELDALIGNMENTTYPE_Default);
	}

	/**
	 * Line Align Center
	 * 
	 * @return true if center
	 */
	public boolean isLineAlignCenter() {
		return getLineAlignmentType().equals(LINEALIGNMENTTYPE_Center);
	}

	/**
	 * Line Align Leading
	 * 
	 * @return true if leading
	 */
	public boolean isLineAlignLeading() {
		return getLineAlignmentType().equals(LINEALIGNMENTTYPE_LeadingLeft);
	}

	/**
	 * Line Align Trailing
	 * 
	 * @return true if trailing
	 */
	public boolean isLineAlignTrailing() {
		return getLineAlignmentType().equals(LINEALIGNMENTTYPE_TrailingRight);
	}

	/**
	 * Header
	 * 
	 * @return true if area is header
	 */
	public boolean isHeader() {
		return getPrintAreaType().equals(PRINTAREATYPE_Header);
	}

	/**
	 * Content
	 * 
	 * @return true if area is centent
	 */
	public boolean isContent() {
		return getPrintAreaType().equals(PRINTAREATYPE_Content);
	}

	/**
	 * Footer
	 * 
	 * @return true if area is footer
	 */
	public boolean isFooter() {
		return getPrintAreaType().equals(PRINTAREATYPE_Footer);
	}

	/**
	 * Barcode
	 * 
	 * @return true if barcode selected
	 */
	public boolean isBarcode() {
		String s = getBarcodeType();
		return s != null && s.length() > 0;
	}

	public String getColumnName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPrintName(Language language) {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPrintNameSuffix(Language language) {
		// TODO Auto-generated method stub
		return null;
	}

	public PrintFormatItem() {
	}

	public PrintFormatItem(ADPrintFormatItem rawItem) {
		setADClientID(rawItem.getADClientID());
		setADColumnID(rawItem.getADColumnID());
		setADOrgID(rawItem.getADOrgID());
		setADPrintColorID(rawItem.getADPrintColorID());
		setADPrintFontID(rawItem.getADPrintFontID());
		setADPrintFormatChildID(rawItem.getADPrintFormatChildID());
		setADPrintFormatID(rawItem.getADPrintFormatID());
		setADPrintFormatItemID(rawItem.getADPrintFormatItemID());
		setADPrintGraphID(rawItem.getADPrintGraphID());
		setActive(rawItem.isActive());
		setArcDiameter(rawItem.getArcDiameter());
		setAveraged(rawItem.isAveraged());
		setBarcodeType(rawItem.getBarcodeType());
		setBelowColumn(rawItem.getBelowColumn());
		setCentrallyMaintained(rawItem.isCentrallyMaintained());
		setCounted(rawItem.isCounted());
		setCreated(rawItem.getCreated());
		setCreatedBy(rawItem.getCreatedBy());
		setDeviationCalc(rawItem.isDeviationCalc());
		setFieldAlignmentType(rawItem.getFieldAlignmentType());
		setFilledRectangle(rawItem.isFilledRectangle());
		setFixedWidth(rawItem.isFixedWidth());
		setFormatPattern(rawItem.getFormatPattern());
		setGroupBy(rawItem.isGroupBy());
		setHeightOneLine(rawItem.isHeightOneLine());
		setImageField(rawItem.isImageField());
		setImageIsAttached(rawItem.isImageIsAttached());
		setImageURL(rawItem.getImageURL());
		setLineAlignmentType(rawItem.getLineAlignmentType());
		setLineWidth(rawItem.getLineWidth());
		setMaxCalc(rawItem.isMaxCalc());
		setMaxHeight(rawItem.getMaxHeight());
		setMaxWidth(rawItem.getMaxWidth());
		setMinCalc(rawItem.isMinCalc());
		setName(rawItem.getName());
		setNextLine(rawItem.isNextLine());
		setNextPage(rawItem.isNextPage());
		setOrderBy(rawItem.isOrderBy());
		setPageBreak(rawItem.isPageBreak());
		setPrintAreaType(rawItem.getPrintAreaType());
		setPrintFormatType(rawItem.getPrintFormatType());
		setPrintName(rawItem.getPrintName());
		setPrintNameSuffix(rawItem.getPrintNameSuffix());
		setPrinted(rawItem.isPrinted());
		setRelativePosition(rawItem.isRelativePosition());
		setRunningTotal(rawItem.isRunningTotal());
		setRunningTotalLines(rawItem.getRunningTotalLines());
		setSeqNo(rawItem.getSeqNo());
		setSetNLPosition(rawItem.isSetNLPosition());
		setShapeType(rawItem.getShapeType());
		setSortNo(rawItem.getSortNo());
		setSummarized(rawItem.isSummarized());
		setSuppressNull(rawItem.isSuppressNull());
		setSuppressRepeats(rawItem.isSuppressRepeats());
		setUpdated(rawItem.getUpdated());
		setUpdatedBy(rawItem.getUpdatedBy());
		setVarianceCalc(rawItem.isVarianceCalc());
		setXPosition(rawItem.getXPosition());
		setXSpace(rawItem.getXSpace());
		setYPosition(rawItem.getYPosition());
		setYSpace(rawItem.getYSpace());
	}

}

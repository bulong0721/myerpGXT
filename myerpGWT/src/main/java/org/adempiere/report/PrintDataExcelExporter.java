package org.adempiere.report;

import java.sql.Timestamp;
import java.util.Date;

import org.adempiere.common.Language;
import org.adempiere.impexp.AbstractExcelExporter;
import org.adempiere.model.core.AdPrintformat;
import org.adempiere.model.core.AdPrintformatitem;
import org.adempiere.model.core.AdPrintpaper;
import org.adempiere.model.core.DisplayType;
import org.adempiere.web.client.util.StringUtil;
import org.apache.poi.hssf.usermodel.HSSFPrintSetup;
import org.apache.poi.hssf.usermodel.HSSFSheet;

public class PrintDataExcelExporter extends AbstractExcelExporter {
	private static final String	NA_LETTER				= "na-lefter";
	private static final String	EXECUTIVE				= "executive";
	private static final String	ISO_A4					= "iso-a4";
	private static final String	ISO_A5					= "iso-a5";
	private static final String	NA_NUMBER_10_ENVELOPE	= "na-number-10-envelope";
	private static final String	MONARCH_ENVELOPE		= "monarch-envelop";
	private static final String	NA_LEGAL				= "na-legal";
	private AdPrintformat		printFormat;
	private PrintData			printData;

	@Override
	public int getColumnCount() {
		return printFormat.getItemCount();
	}

	private PrintDataElement getPDE(int row, int col) {
		if (printData.getRowIndex() != row)
			printData.setRowIndex(row);
		//
		AdPrintformatitem item = printFormat.getItem(col);
		Long columnId = item.getAdColumnId();
		Object obj = null;
		if (columnId > 0)
			obj = printData.getNode(columnId);
		if (obj != null && obj instanceof PrintDataElement) {
			return (PrintDataElement) obj;
		}
		return null;
	}

	@Override
	public DisplayType getDisplayType(int row, int col) {
		PrintDataElement pde = getPDE(row, col);
		if (pde != null) {
			return pde.getDisplayType();
		}
		return DisplayType.String;
		//
	}

	@Override
	public Object getValueAt(int row, int col) {
		PrintDataElement pde = getPDE(row, col);
		DisplayType displayType = pde.getDisplayType();
		Object value = null;
		if (pde == null)
			;
		else if (displayType.isDate()) {
			Object o = pde.getValue();
			if (o instanceof Date)
				value = new Timestamp(((Date) o).getTime());
			else
				value = (Timestamp) pde.getValue();
		} else if (displayType.isNumeric()) {
			Object o = pde.getValue();
			if (o instanceof Number) {
				value = ((Number) o).doubleValue();
			}
		} else if (displayType.isBoolean()) {
			value = pde.getValue();
		} else if (displayType.isKey()) {
			value = pde.getValueAsString();
		} else {
			value = pde.getValueDisplay(getLanguage());
		}
		//
		return value;
	}

	private Language getLanguage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getHeaderName(int col) {
		return printFormat.getItem(col).getPrintname();
	}

	@Override
	public int getRowCount() {
		return printData.getRowCount();
	}

	@Override
	public boolean isColumnPrinted(int col) {
		AdPrintformatitem item = printFormat.getItem(col);
		return StringUtil.isYes(item.getIsprinted());
	}

	@Override
	public boolean isPageBreak(int row, int col) {
		PrintDataElement pde = getPDE(row, col);
		return pde != null ? pde.isPageBreak() : false;
	}

	@Override
	protected void setCurrentRow(int row) {
		printData.setRowIndex(row);
	}

	@Override
	public boolean isFunctionRow() {
		return printData.isFunctionRow();
	}

	@Override
	protected void formatPage(HSSFSheet sheet) {
		super.formatPage(sheet);
		AdPrintpaper paper = null/* printFormat.getAdPrintpaperId() */;
		//
		// Set paper size:
		String paperCode = paper.getCode();
		short paperSize = -1;
		if (NA_LETTER.equals(paperCode)) {
			paperSize = HSSFPrintSetup.LETTER_PAPERSIZE;
		} else if (NA_LEGAL.equals(paperCode)) {
			paperSize = HSSFPrintSetup.LEGAL_PAPERSIZE;
		} else if (EXECUTIVE.equals(paperCode)) {
			paperSize = HSSFPrintSetup.EXECUTIVE_PAPERSIZE;
		} else if (ISO_A4.equals(paperCode)) {
			paperSize = HSSFPrintSetup.A4_PAPERSIZE;
		} else if (ISO_A5.equals(paperCode)) {
			paperSize = HSSFPrintSetup.A5_PAPERSIZE;
		} else if (NA_NUMBER_10_ENVELOPE.equals(paperCode)) {
			paperSize = HSSFPrintSetup.ENVELOPE_10_PAPERSIZE;
		} else if (MONARCH_ENVELOPE.equals(paperCode)) {
			paperSize = HSSFPrintSetup.ENVELOPE_MONARCH_PAPERSIZE;
		}
		if (paperSize != -1) {
			sheet.getPrintSetup().setPaperSize(paperSize);
		}
		//
		// Set Landscape/Portrait:
		sheet.getPrintSetup().setLandscape(StringUtil.isYes(paper.getIslandscape()));
		//
		// Set Paper Margin:
		sheet.setMargin(HSSFSheet.TopMargin, ((double) paper.getMargintop()) / 72);
		sheet.setMargin(HSSFSheet.RightMargin, ((double) paper.getMarginright()) / 72);
		sheet.setMargin(HSSFSheet.LeftMargin, ((double) paper.getMarginleft()) / 72);
		sheet.setMargin(HSSFSheet.BottomMargin, ((double) paper.getMarginbottom()) / 72);
		//
	}

}

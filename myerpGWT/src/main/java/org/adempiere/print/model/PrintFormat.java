package org.adempiere.print.model;

import org.adempiere.common.Language;
import org.adempiere.model.ADPrintFormat;
import org.adempiere.model.ADPrintFormatItem;
import org.adempiere.print.PrintUtil;

public class PrintFormat extends ADPrintFormat {
	private static final long	serialVersionUID	= 1L;

	public PrintFormat() {
	}

	public PrintFormat(ADPrintFormat rawItem) {
		setADClientID(rawItem.getADClientID());
		setADOrgID(rawItem.getADOrgID());
		setADPrintColorID(rawItem.getADPrintColorID());
		setADPrintFontID(rawItem.getADPrintFontID());
		setADPrintFormatID(rawItem.getADPrintFormatID());
		setADPrintPaperID(rawItem.getADPrintPaperID());
		setADPrintTableFormatID(rawItem.getADPrintTableFormatID());
		setADReportViewID(rawItem.getADReportViewID());
		setADTableID(rawItem.getADTableID());
		setActive(rawItem.isActive());
		setArgs(rawItem.getArgs());
		setClassname(rawItem.getClassname());
		setCreateCopy(rawItem.isCreateCopy());
		setCreated(rawItem.getCreated());
		setCreatedBy(rawItem.getCreatedBy());
		setDescription(rawItem.getDescription());
		setFooterMargin(rawItem.getFooterMargin());
		setForm(rawItem.isForm());
		setHeaderMargin(rawItem.getHeaderMargin());
		setIsDefault(rawItem.isIsDefault());
		setJasperProcessID(rawItem.getJasperProcessID());
		setName(rawItem.getName());
		setPrinterName(rawItem.getPrinterName());
		setStandardHeaderFooter(rawItem.isStandardHeaderFooter());
		setTableBased(rawItem.isTableBased());
		setUpdated(rawItem.getUpdated());
		setUpdatedBy(rawItem.getUpdatedBy());
		setPrintFormatItems(rawItem.getPrintFormatItems());
	}

	public int getItemCount() {
		if (null != getPrintFormatItems()) {
			return getPrintFormatItems().size();
		}
		return 0;
	}

	public PrintFormatItem getItem(int c) {
		if (null != getPrintFormatItems()) {
			ADPrintFormatItem rawItem = getPrintFormatItems().get(c);
			return new PrintFormatItem(rawItem);
		}
		return null;
	}

	public Language getLanguage() {
		return Language.En_US;
	}

	public void setLanguage(Language language) {
		// TODO Auto-generated method stub

	}

	public boolean isTranslationView() {
		return false;
	}

	public void setTranslationLanguage(Language language) {
		// TODO Auto-generated method stub

	}

	private PrintTableFormat	tableFormat	= null;

	public PrintTableFormat getTableFormat() {
		if (null == tableFormat) {
			tableFormat = PrintUtil.getPrintTableFormat(getADPrintTableFormatID());
		}
		return tableFormat;
	}
}

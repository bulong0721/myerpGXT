package org.adempiere.print;

import java.io.File;
import java.io.IOException;
import java.io.Writer;

import javax.print.event.PrintServiceAttributeEvent;
import javax.print.event.PrintServiceAttributeListener;

import org.adempiere.model.core.AdPrintformat;
import org.adempiere.pdf.Document;


public class ReportEngine implements PrintServiceAttributeListener {
	private LayoutEngine	layoutEngine;
	private AdPrintformat	printFormat;

	@Override
	public void attributeUpdate(PrintServiceAttributeEvent psae) {
		// TODO Auto-generated method stub

	}

	public boolean createHTML(File file, boolean onlyTable) {
		return true;
	}

	public boolean createHTML(Writer writer, boolean onlyTable) {
		return true;
	}

	public boolean createCSV(File file, char delimiter) {
		return true;
	}

	public boolean createCSV(Writer writer, char delimiter) {
		return true;
	}

	public boolean createXML(File file) {
		return true;
	}

	public boolean createXML(Writer writer) {
		return true;
	}

	public File getPDF(File file) {
		try {
			if (file == null)
				file = File.createTempFile("ReportEngine", ".pdf");
		} catch (IOException e) {
		}
		if (createPDF(file))
			return file;
		return null;
	}

	public boolean createPDF(File file) {
		String fileName = null;

		try {
			if (file == null)
				file = File.createTempFile("ReportEngine", ".pdf");
			fileName = file.getAbsolutePath();
			if (file.exists())
				file.delete();

		} catch (Exception e) {
			return false;
		}

		try {
			if (layoutEngine == null)
				layout();
			ArchiveEngine.get().archive(layoutEngine, null);
			Document.getPDFAsFile(fileName, layoutEngine.getPageable(false));
		} catch (Exception e) {
			return false;
		}

		File file2 = new File(fileName);
		return file2.exists();
	} // createPDF

	public byte[] createPDFData() {
		try {
			if (layoutEngine == null)
				layout();
			return Document.getPDFAsArray(layoutEngine.getPageable(false));
		} catch (Exception e) {
		}
		return null;
	} // createPDFData

	private void layout() {
		// TODO Auto-generated method stub

	}
}

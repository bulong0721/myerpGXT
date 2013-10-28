package org.adempiere.report;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.attribute.DocAttributeSet;

import org.adempiere.web.shared.adempiere.AdPrintcolor;
import org.adempiere.web.shared.adempiere.AdPrintfont;
import org.adempiere.web.shared.adempiere.AdPrintformat;
import org.adempiere.web.shared.adempiere.AdPrintpaper;


public class LayoutEngine implements Pageable, Printable, Doc {

	private AdPrintformat	printFormat;
	private AdPrintpaper	printPaper;
	private AdPrintcolor	printColor;
	private AdPrintfont		printFont;

	@Override
	public DocFlavor getDocFlavor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPrintData() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocAttributeSet getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reader getReaderForText() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InputStream getStreamForBytes() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberOfPages() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PageFormat getPageFormat(int pageIndex) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Printable getPrintable(int pageIndex) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	public LayoutEngine getPageable(boolean isCopy) {
		return this;
	}
}

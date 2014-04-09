package org.adempiere.print;

import java.awt.print.PrinterJob;

import javax.print.attribute.Attribute;
import javax.print.attribute.PrintRequestAttributeSet;

import org.adempiere.model.ADClientInfo;
import org.adempiere.model.ADImage;
import org.adempiere.model.ADPrintColor;
import org.adempiere.model.ADPrintFont;
import org.adempiere.model.ADPrintFormat;
import org.adempiere.model.ADPrintPaper;
import org.adempiere.model.ADPrintTableFormat;
import org.adempiere.model.CLocation;
import org.adempiere.persist.PersistContext;
import org.adempiere.print.model.PrintAttachment;
import org.adempiere.print.model.PrintColor;
import org.adempiere.print.model.PrintFont;
import org.adempiere.print.model.PrintFormat;
import org.adempiere.print.model.PrintImage;
import org.adempiere.print.model.PrintLocation;
import org.adempiere.print.model.PrintPaper;
import org.adempiere.print.model.PrintTableFormat;
import org.adempiere.util.POUtil;

public class PrintUtil {
	private static PersistContext	context	= new PersistContext();

	public static PrintImage getPrintImage(Integer imageID) {
		ADImage entity = POUtil.find(context, ADImage.class, imageID);
		return new PrintImage(entity);
	}

	public static PrintFont getPrintFont(int fontID) {
		ADPrintFont entity = POUtil.find(context, ADPrintFont.class, fontID);
		return new PrintFont(entity);
	}

	public static PrintFormat getPrintFormat(int formatID) {
		ADPrintFormat entity = POUtil.find(context, ADPrintFormat.class, formatID);
		return new PrintFormat(entity);
	}

	public static PrintTableFormat getPrintTableFormat(int tableFormatID) {
		ADPrintTableFormat entity = POUtil.find(context, ADPrintTableFormat.class, tableFormatID);
		return new PrintTableFormat(entity);
	}

	public static PrintColor getPrintColor(int colorID) {
		ADPrintColor entity = POUtil.find(context, ADPrintColor.class, colorID);
		return new PrintColor(entity);
	}

	public static PrintAttachment getPrintAttachment(int tableID, int recordID) {
		// TODO Auto-generated method stub
		return null;
	}

	public static PrintLocation getPrintLocation(int LocationID) {
		CLocation entity = POUtil.find(context, CLocation.class, LocationID);
		return new PrintLocation(entity);
	}

	public static void print(PrinterJob job, PrintRequestAttributeSet prats, boolean b, boolean printCopy) {
		// TODO Auto-generated method stub

	}

	public static Attribute getJobPriority(int numberOfPages, int copies, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	public static ADClientInfo getClientInfo() {
		return POUtil.find(context, ADClientInfo.class, 0);
	}

	public static PrintPaper getPrintPaper(Integer paperID) {
		ADPrintPaper entity = POUtil.find(context, ADPrintPaper.class, paperID);
		return new PrintPaper(entity);
	}

}

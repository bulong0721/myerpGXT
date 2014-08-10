package org.adempiere.print;

import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import java.util.logging.Level;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.print.attribute.standard.JobName;
import javax.print.event.PrintServiceAttributeEvent;
import javax.print.event.PrintServiceAttributeListener;

import org.adempiere.common.ADExpression;
import org.adempiere.common.Language;
import org.adempiere.print.model.PrintFormat;
import org.adempiere.print.model.PrintInfo;
import org.adempiere.util.CLogger;
import org.adempiere.util.Document;
import org.adempiere.util.EnvUtil;

public class ReportEngine implements PrintServiceAttributeListener {
	private ADExpression	expression;
	private LayoutEngine	layoutEngine;
	private PrintFormat		printFormat;
	private PrintData		printData;
	private PrintInfo		printInfo;
	private static CLogger	log	= CLogger.getCLogger(ReportEngine.class);

	public ReportEngine(PrintFormat printFormat, ADExpression expression, PrintInfo printInfo) {
		super();
		this.printFormat = printFormat;
		this.expression = expression;
		this.printInfo = printInfo;
	}

	public static void main(String[] args) {
		try {
			PrintFormat pFormat = PrintUtil.getPrintFormat(101);
			ADExpression expr = new ADExpression();
			PrintInfo pInfo = new PrintInfo("Test", 100, 101, 101);
			ReportEngine pEngine = new ReportEngine(pFormat, expr, pInfo);
			File pdfFIle = new File("d:/ad_table.pdf");
			pEngine.createPDF(pdfFIle);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
			e.printStackTrace();
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
		if (printFormat == null)
			throw new IllegalStateException("No print format");
		//TODO test
//		if (printData == null)
//			throw new IllegalStateException("No print data (Delete Print Format and restart)");
		layoutEngine = new LayoutEngine(printFormat, printData, expression, printInfo);
	}

	/*
	 * Get Layout
	 * 
	 * @return Layout
	 */
	public LayoutEngine getLayout() {
		if (layoutEngine == null)
			layout();
		return layoutEngine;
	} // getLayout

	/**
	 * Get PrintFormat (Report) Name
	 * 
	 * @return name
	 */
	public String getName() {
		return printFormat.getName();
	} // getName

	public void print() {
		log.info(printInfo.toString());
		if (layoutEngine == null)
			layout();
		// Paper Attributes: media-printable-area, orientation-requested, media
		PrintRequestAttributeSet prats = layoutEngine.getPrintPaper().getCPaper().getPrintRequestAttributeSet();
		// add: copies, job-name, priority
		if (printInfo.isDocumentCopy() || printInfo.getCopies() < 1)
			prats.add(new Copies(1));
		else
			prats.add(new Copies(printInfo.getCopies()));
		Locale locale = PrintUtil.getLocale(Language.getLoginLanguage());
		prats.add(new JobName(printFormat.getName(), locale));
		prats.add(PrintUtil.getJobPriority(layoutEngine.getNumberOfPages(), printInfo.getCopies(), true));

		try {
			PrinterJob job = getPrinterJob(printInfo.getPrinterName());
			job.setPageable(layoutEngine.getPageable(false)); // no copy
			try {
				if (printInfo.isWithDialog() && !job.printDialog(prats))
					return;
			} catch (Exception e) {
				log.log(Level.WARNING, "Operating System Print Issue, check & try again", e);
				return;
			}
			// submit
			boolean printCopy = printInfo.isDocumentCopy() && printInfo.getCopies() > 1;
			ArchiveEngine.get().archive(layoutEngine, printInfo);
			PrintUtil.print(job, prats, false, printCopy);
			// Document: Print Copies
			if (printCopy) {
				log.info("Copy " + (printInfo.getCopies() - 1));
				prats.add(new Copies(printInfo.getCopies() - 1));
				job = getPrinterJob(printInfo.getPrinterName());
				// job.getPrintService().addPrintServiceAttributeListener(this);
				job.setPageable(layoutEngine.getPageable(true)); // Copy
				PrintUtil.print(job, prats, false, false);
			}
		} catch (Exception e) {
			log.log(Level.SEVERE, "", e);
		}
	} // print

	private PrinterJob getPrinterJob(String printerName) {
		PrinterJob pj = null;
		PrintService ps = null;
		try {
			pj = PrinterJob.getPrinterJob();
			PrintService[] s_services = PrintServiceLookup.lookupPrintServices(null, null);
			if (printerName == null || printerName.length() == 0)
				printerName = EnvUtil.getProperty("Printer");
			if (printerName != null && printerName.length() != 0) {
				for (int i = 0; i < s_services.length; i++) {
					String serviceName = s_services[i].getName();
					if (printerName.equals(serviceName)) {
						ps = s_services[i];
						break;
					}
				}
			}

			try {
				if (ps != null)
					pj.setPrintService(ps);
			} catch (Exception e) {
				log.warning("Could not set Print Service: " + e.toString());
			}
			//
			PrintService psUsed = pj.getPrintService();
			if (psUsed == null)
				log.warning("Print Service not Found");
			else {
				String serviceName = psUsed.getName();
				if (printerName != null && !printerName.equals(serviceName))
					log.warning("Not found: " + printerName + " - Used: " + serviceName);
			}
		} catch (Exception e) {
			log.warning("Could not create for " + printerName + ": " + e.toString());
		}
		return pj;
	}
}

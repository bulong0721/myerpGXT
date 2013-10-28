package org.adempiere.report;

import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Pageable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.lowagie.text.FontFactory;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.DefaultFontMapper;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfTemplate;
import com.lowagie.text.pdf.PdfWriter;

public class Document {

	static {
		FontFactory.registerDirectories();
	}

	private final static String	PDF_FONT_DIR	= "PDF_FONT_DIR";

	private static void writePDF(Pageable pageable, OutputStream output) {
		try {
			final PageFormat pf = pageable.getPageFormat(0);

			Rectangle pageSize = new Rectangle((int) pf.getWidth(), (int) pf.getHeight());
			final com.lowagie.text.Document document = new com.lowagie.text.Document(pageSize);
			final PdfWriter writer = PdfWriter.getInstance(document, output);
			writer.setPdfVersion(PdfWriter.VERSION_1_2);
			document.open();
			final DefaultFontMapper mapper = new DefaultFontMapper();

			String pdfFontDir = /* MSysConfig.getValue( */PDF_FONT_DIR/* , "") */;
			if (pdfFontDir != null && pdfFontDir.trim().length() > 0) {
				pdfFontDir = pdfFontDir.trim();
				File dir = new File(pdfFontDir);
				if (dir.exists() && dir.isDirectory())
					mapper.insertDirectory(pdfFontDir);
			}
			final float w = (float) pf.getWidth();
			final float h = (float) pf.getHeight();
			final PdfContentByte cb = writer.getDirectContent();
			for (int page = 0; page < pageable.getNumberOfPages(); page++) {
				if (page != 0) {
					document.newPage();
				}

				final PdfTemplate tp = cb.createTemplate(w, h);
				final Graphics2D g2 = tp.createGraphics(w, h, mapper);
				tp.setWidth(w);
				tp.setHeight(h);
				pageable.getPrintable(page).print(g2, pf, page);
				g2.dispose();
				cb.addTemplate(tp, 0, 0);
			}
			document.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static File getPDFAsFile(String filename, Pageable pageable) {
		final File result = new File(filename);

		try {
			writePDF(pageable, new FileOutputStream(result));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public static byte[] getPDFAsArray(Pageable pageable) {
		try {
			ByteArrayOutputStream output = new ByteArrayOutputStream(10240);
			writePDF(pageable, output);
			return output.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static boolean isValid(Pageable layout) {
		return true;
	}

	public static boolean isLicensed() {
		return true;
	}
}

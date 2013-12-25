package org.adempiere.report;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

public interface JRViewerProvider {

	void openViewer(JasperPrint jasperPrint, String title) throws JRException;
}

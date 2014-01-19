package org.adempiere.report;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.PropertyResourceBundle;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.util.JRResourcesUtil;

import org.adempiere.common.Language;
import org.adempiere.common.ProcessResult;
import org.adempiere.model.AdAttachment;
import org.adempiere.process.ClientProcess;
import org.adempiere.process.ProcessCall;
import org.adempiere.process.ProcessContext;
import org.adempiere.util.Env;
import org.adempiere.web.client.util.StringUtil;
import org.adempiere.web.server.ReportDistributeServlet;

public class ReportStarter implements ProcessCall, ClientProcess {
	private static File				REPORT_HOME	= null;
	private static JRViewerProvider	viewerProvider;
	private static JasperPrint		jasperPrint;
	private AdAttachment			attachment;

	static {
		String reportPath = System.getProperty("org.adempiere.report.path");
		if (reportPath == null) {
			// TODO
			REPORT_HOME = new File(Env.getAdempiereHome() + File.separator + "reports");
		} else {
			REPORT_HOME = new File(reportPath);
		}
	}

	protected void reportResult(int pInstanceId, String errMsg) {
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean startProcess(ProcessContext ctx, ProcessResult pInfo) {
		int pInstanceId = 0;
		ReportData reportData = getReportData(ctx);
		if (reportData == null) {
			reportResult(pInstanceId, "Can not find report data");
			return false;
		}

		String reportPath = reportData.getReportFilePath();
		if (StringUtil.isNullOrEmpty(reportPath, true)) {
			reportResult(pInstanceId, "Can not find report");
			return false;
		}

		JasperData data = null;
		File reportFile = null;
		String fileExtension = "";
		HashMap<String, Object> params = new HashMap<String, Object>();

		reportFile = getReportFile(reportPath, (String) params.get("ReportType"));
		if (reportFile == null || !reportFile.exists()) {
			reportFile = getReportFile(reportPath);
		}

		if (reportFile == null || !reportFile.exists()) {
			String tmp = "Can not find report file at path - " + reportPath;
			reportResult(pInstanceId, tmp);
		}

		if (reportFile != null) {
			data = processReport(reportFile);
			fileExtension = reportFile.getName().substring(reportFile.getName().lastIndexOf("."), reportFile.getName().length());
		} else {
			return false;
		}

		JasperReport jasperReport = data.getJasperReport();
		String jasperName = data.getJasperName();
		String name = jasperReport.getName();
		File reportDir = data.getReportDir();

		ClassLoader scl = ClassLoader.getSystemClassLoader();
		try {
			URLClassLoader ucl = new URLClassLoader(new java.net.URL[] { reportDir.toURI().toURL() }, scl);
			JRResourcesUtil.setThreadClassLoader(ucl);
		} catch (MalformedURLException me) {
		}

		if (jasperReport != null) {
			File[] subreports;
			if (reportPath.startsWith("http://") || reportPath.startsWith("https://")) {
				subreports = getHttpSubreports(jasperName + "Subreport", reportPath, fileExtension);
			} else if (reportPath.startsWith("attachment:")) {
				subreports = getAttachmentSubreports(reportPath);
			} else if (reportPath.startsWith("resource:")) {
				subreports = getResourceSubreports(name + "Subreport", reportPath, fileExtension);
			} else {
				subreports = reportDir.listFiles(new FileFilter(jasperName + "Subreport", reportDir, fileExtension));
			}

			for (int i = 0; i < subreports.length; i++) {
				JasperData subData = processReport(subreports[i]);
				if (subData.getJasperReport() != null) {
					params.put(subData.getJasperName(), subData.getJasperFile().getAbsolutePath());
				}
			}
			int iRecordId = 0;

			if (iRecordId > 0)
				params.put("RECORD_ID", new Integer(iRecordId));
			params.put("AD_PINSTANCE_ID", new Integer(pInstanceId));

			Language currLang = Language.getAD_Language();

			params.put("CURRENT_LANG", Language.getAD_Language());
			// params.put(JRParameter.REPORT_LOCALE, currLang.getLocale());

			// Resources
			File resFile = null;
			if (reportPath.startsWith("attachment:") && attachment != null) {
				resFile = getAttachmentResourceFile(jasperName, currLang);
			} else if (reportPath.startsWith("resource:")) {
				resFile = getResourcesForResourceFile(jasperName, currLang);
			} else {
				resFile = new File(jasperName /*
											 * + "_" +
											 * currLang.getLocale().getLanguage
											 * ()
											 */+ ".properties");
				if (!resFile.exists()) {
					resFile = null;
				}
				if (resFile == null) {
					resFile = new File(jasperName + ".properties");
					if (!resFile.exists()) {
						resFile = null;
					}
				}
			}
			if (resFile != null) {
				try {
					PropertyResourceBundle res = new PropertyResourceBundle(new FileInputStream(resFile));
					params.put("RESOURCE", res);
				} catch (IOException e) {
				}
			}

			Connection conn = null;
			try {
				conn = ctx.getConnection();
				jasperPrint = JasperFillManager.fillReport(jasperReport, params, conn);
				try {
					File rptFile = new File(Env.getReportPath("form.pdf"));
					rptFile.createNewFile();
					JasperExportManager.exportReportToPdfFile(jasperPrint, rptFile.getAbsolutePath());
					pInfo.setPDFReport(ReportDistributeServlet.toDistributionURL("form.pdf"));
				} catch (IOException e) {
				}
			} catch (JRException e) {
			} finally {
				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
					}
				}
			}
		}
		reportResult(pInstanceId, null);
		return true;
	}

	private ReportData getReportData(ProcessContext ctx) {
		// TODO Auto-generated method stub
		return new ReportData("form.jrxml", false);
	}

	public static void setReportViewerProvider(JRViewerProvider provider) {
		if (provider == null)
			throw new IllegalArgumentException("Cannot set report viewer provider to null");
		viewerProvider = provider;
	}

	public static void main(String[] args) {
		ProcessContext ctx = new ProcessContext();
		ReportStarter starter = new ReportStarter();
		ProcessResult pInfo = new ProcessResult();
		starter.startProcess(ctx, pInfo);
	}

	/**
	 * Get the current jasper report viewer provider
	 * 
	 * @return JRViewerProvider
	 */
	public static JRViewerProvider getReportViewerProvider() {
		return viewerProvider;
	}

	private File getResourcesForResourceFile(String reportPath, Language currLang) {
		return getReportFile(reportPath);
	}

	private File getAttachmentResourceFile(String reportPath, Language currLang) {
		return getReportFile(reportPath);
	}

	private File[] getResourceSubreports(String string, String reportPath, String fileExtension) {
		// TODO Auto-generated method stub
		return new File[0];
	}

	private File[] getAttachmentSubreports(String reportPath) {
		// TODO Auto-generated method stub
		return new File[0];
	}

	private File[] getHttpSubreports(String string, String reportPath, String fileExtension) {
		// TODO Auto-generated method stub
		return new File[0];
	}

	private File getReportFile(String reportPath, String reportType) {
		return getReportFile(reportPath);
	}

	private File getReportFile(String reportPath) {
		return new File(REPORT_HOME + File.separator + reportPath);
	}

	protected JasperData processReport(File reportFile) {
		JasperReport jasperReport = null;

		String jasperName = reportFile.getName();
		int pos = jasperName.indexOf('.');
		if (pos != -1)
			jasperName = jasperName.substring(0, pos);
		File reportDir = reportFile.getParentFile();

		// test if the compiled report exists
		File jasperFile = new File(reportDir.getAbsolutePath(), jasperName + ".jasper");
		if (jasperFile.exists()) { // test time
			if (reportFile.lastModified() != jasperFile.lastModified()) {
				try {
					jasperReport = (JasperReport) JRLoader.loadObjectFromFile(jasperFile.getAbsolutePath());
				} catch (JRException e) {
					jasperReport = null;
				}
			} else {
				jasperReport = compileReport(reportFile, jasperFile);
			}
		} else {
			jasperReport = compileReport(reportFile, jasperFile);
		}

		return new JasperData(jasperReport, reportDir, jasperName, jasperFile);
	}

	private void JWScorrectClassPath() {
		URL jasperreportsAbsoluteURL = Thread.currentThread().getContextClassLoader().getResource("net/sf/jasperreports/engine");
		String jasperreportsAbsolutePath = "";

		if (jasperreportsAbsoluteURL.toString().startsWith("jar:http:") || jasperreportsAbsoluteURL.toString().startsWith("jar:https:")) {
			// Jasper classes are deployed to a webserver (Java Webstart)
			jasperreportsAbsolutePath = jasperreportsAbsoluteURL.toString().split("!")[0].split("jar:")[1];
			// Download the required jasper libraries if they are not already
			// existing
			File reqLib = new File(System.getProperty("java.io.tmpdir"), "CompiereJasperReqs.jar");
			if (!reqLib.exists() && !(reqLib.length() > 0)) {
				try {
					URL reqLibURL = new URL(jasperreportsAbsolutePath);
					InputStream in = reqLibURL.openStream();

					FileOutputStream fout = new FileOutputStream(reqLib);

					byte buf[] = new byte[1024];
					int s = 0;

					while ((s = in.read(buf, 0, 1024)) > 0)
						fout.write(buf, 0, s);

					in.close();
					fout.flush();
					fout.close();
				} catch (FileNotFoundException e) {
					// log.warning("Required library not found " +
					// e.getMessage());
					reqLib.delete();
					reqLib = null;
				} catch (IOException e) {
					// log.severe("I/O error downloading required library from server "
					// + e.getMessage());
					reqLib.delete();
					reqLib = null;
				}
			}

			jasperreportsAbsolutePath = reqLib.getAbsolutePath();
		} else {
			// Jasper classes are locally available (Local client)
			jasperreportsAbsolutePath = jasperreportsAbsoluteURL.toString().split("!")[0].split("file:")[1];
		}

		if (jasperreportsAbsolutePath != null && !jasperreportsAbsolutePath.trim().equals("")) {
			// Check whether the current CLASSPATH already contains our
			// jasper libraries and dependencies or not.
			if (System.getProperty("java.class.path").indexOf(jasperreportsAbsolutePath) < 0) {
				System.setProperty("java.class.path", System.getProperty("java.class.path") + System.getProperty("path.separator")
						+ jasperreportsAbsolutePath);
				// log.info("Classpath has been corrected to " +
				// System.getProperty("java.class.path"));
			}
		}
	}

	private JasperReport compileReport(File reportFile, File jasperFile) {
		JWScorrectClassPath();
		JasperReport compiledJasperReport = null;
		try {
			JasperCompileManager.compileReportToFile(reportFile.getAbsolutePath(), jasperFile.getAbsolutePath());
			jasperFile.setLastModified(reportFile.lastModified());
			compiledJasperReport = (JasperReport) JRLoader.loadObject(jasperFile);
		} catch (JRException e) {
			// log.log(Level.SEVERE, "Error", e);
		}
		return compiledJasperReport;
	}

	class FileFilter implements FilenameFilter {
		private String	reportStart;
		private File	directory;
		private String	extension;

		public FileFilter(String reportStart, File directory, String extension) {
			this.reportStart = reportStart;
			this.directory = directory;
			this.extension = extension;
		}

		public boolean accept(File file, String name) {
			if (file.equals(directory)) {
				if (name.startsWith(reportStart)) {
					int pos = name.lastIndexOf(extension);
					if ((pos != -1) && (pos == (name.length() - extension.length())))
						return true;
				}
			}
			return false;
		}
	}

	class ReportData {
		private String	reportFilePath;
		private boolean	directPrint;

		public ReportData(String reportFilePath, boolean directPrint) {
			this.reportFilePath = reportFilePath;
			this.directPrint = directPrint;
		}

		public String getReportFilePath() {
			return reportFilePath;
		}

		public boolean isDirectPrint() {
			return directPrint;
		}
	}

	public static class JasperData implements Serializable {
		private static final long	serialVersionUID	= 1L;
		private JasperReport		jasperReport;
		private File				reportDir;
		private String				jasperName;
		private File				jasperFile;

		public JasperData(JasperReport jasperReport, File reportDir, String jasperName, File jasperFile) {
			this.jasperReport = jasperReport;
			this.reportDir = reportDir;
			this.jasperName = jasperName;
			this.jasperFile = jasperFile;
		}

		public JasperReport getJasperReport() {
			return jasperReport;
		}

		public File getReportDir() {
			return reportDir;
		}

		public String getJasperName() {
			return jasperName;
		}

		public File getJasperFile() {
			return jasperFile;
		}
	}
}

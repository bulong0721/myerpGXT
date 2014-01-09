package org.adempiere.web.server;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.adempiere.util.Env;
import org.adempiere.web.client.util.StringUtil;

public class ReportDistributeServlet extends HttpServlet {
	private static final long	serialVersionUID	= 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String report = req.getParameter("rpt");
		if (StringUtil.isNullOrEmpty(report)) {
			resp.getWriter().write("request url invaild.");
			return;
		}
		String rptPath = Env.getReportPath(report);
		File rptFile = new File(rptPath);
		if (!rptFile.exists()) {
			resp.getWriter().write("report does not exists.");
			return;
		}
		resp.setContentType("application/pdf");

		byte[] buffer = new byte[4096];
		int bytesRead = -1;
		FileInputStream inStream = null;
		OutputStream outStream = null;
		try {
			inStream = new FileInputStream(rptFile);
			outStream = resp.getOutputStream();
			while ((bytesRead = inStream.read(buffer)) != -1) {
				outStream.write(buffer, 0, bytesRead);
			}
		} finally {
			if (null != inStream) {
				inStream.close();
			}
			if (null != outStream) {
				outStream.close();
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	public static String toDistributionURL(String path) {
		return "myerpGXT/report?rpt=" + path;
	}

}

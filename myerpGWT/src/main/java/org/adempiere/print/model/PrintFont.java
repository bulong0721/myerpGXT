package org.adempiere.print.model;

import java.awt.Font;
import java.util.logging.Level;

import org.adempiere.model.ADPrintFont;
import org.adempiere.util.CLogger;

public class PrintFont extends ADPrintFont {
	private static final long	serialVersionUID	= 1L;
	private static CLogger		log					= CLogger.getCLogger(PrintFont.class);
	private Font				cacheFont			= null;

	public PrintFont() {
	}

	public PrintFont(ADPrintFont rawItem) {
		setADClientID(rawItem.getADClientID());
		setADOrgID(rawItem.getADOrgID());
		setADPrintFontID(rawItem.getADPrintFontID());
		setActive(rawItem.isActive());
		setCode(rawItem.getCode());
		setCreated(rawItem.getCreated());
		setCreatedBy(rawItem.getCreatedBy());
		setIsDefault(rawItem.isIsDefault());
		setName(rawItem.getName());
		setUpdated(rawItem.getUpdated());
		setUpdatedBy(rawItem.getUpdatedBy());
	}

	/**
	 * Get Font
	 * 
	 * @return Font
	 */
	public Font getFont() {
		if (cacheFont != null)
			return cacheFont;
		String code = getCode();
		if (code == null || code.equals("."))
			cacheFont = new Font(null);
		try {
			if (code != null && !code.equals("."))
				cacheFont = Font.decode(code);
		} catch (Exception e) {
			log.log(Level.SEVERE, "MPrintFont.getFont", e);
		}
		if (code == null)
			cacheFont = new Font(null);
		return cacheFont;
	}

}

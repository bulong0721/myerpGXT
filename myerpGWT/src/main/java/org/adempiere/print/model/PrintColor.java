package org.adempiere.print.model;

import java.awt.Color;

import org.adempiere.model.ADPrintColor;

public class PrintColor extends ADPrintColor {
	private static final long	serialVersionUID	= 1L;
	public static final Color	blackBlue			= new Color (0, 0, 64);
	public static final Color	darkGreen			= new Color (0, 64, 0);
	private transient Color		color				= null;

	public PrintColor() {
	}

	public PrintColor(ADPrintColor rawItem) {
		setADClientID(rawItem.getADClientID());
		setADOrgID(rawItem.getADOrgID());
		setADPrintColorID(rawItem.getADPrintColorID());
		setActive(rawItem.isActive());
		setCode(rawItem.getCode());
		setCreated(rawItem.getCreated());
		setCreatedBy(rawItem.getCreatedBy());
		setIsDefault(rawItem.isIsDefault());
		setName(rawItem.getName());
		setUpdated(rawItem.getUpdated());
		setUpdatedBy(rawItem.getUpdatedBy());
	}

	public Color getColor() {
		if (null == color) {
			try {
				int codeValue = Integer.parseInt(getCode());
				color = new Color(codeValue);
			} catch (NumberFormatException e) {
				color = Color.BLACK;
			}
		}
		return color;
	}

}

package org.adempiere.print.model;

import org.adempiere.model.CCountry;
import org.adempiere.model.CLocation;
import org.adempiere.util.CLogger;

public class PrintLocation extends CLocation {
	private static final long	serialVersionUID	= 1L;
	private static CLogger		log					= CLogger.getCLogger(PrintLocation.class);

	public PrintLocation(CLocation raw) {
		setADClientID(raw.getADClientID());
		setADOrgID(raw.getADOrgID());
		setActive(raw.isActive());
		setAddress1(raw.getAddress1());
		setAddress2(raw.getAddress2());
		setAddress3(raw.getAddress3());
		setAddress4(raw.getAddress4());
		setCCityID(raw.getCCityID());
		setCCountryID(raw.getCCountryID());
		setCLocationID(raw.getCLocationID());
		setCRegionID(raw.getCRegionID());
		setCity(raw.getCity());
		setCreated(raw.getCreated());
		setCreatedBy(raw.getCreatedBy());
		setPostal(raw.getPostal());
		setPostalAdd(raw.getPostalAdd());
		setRegionName(raw.getRegionName());
		setUpdated(raw.getUpdated());
		setUpdatedBy(raw.getUpdatedBy());
	}

	public String getCityRegionPostal() {
		return parseCRP (getCCountry());
	}

	public String getCountry(boolean b, String language) {
		// TODO Auto-generated method stub
		return getCCountry().getName();
	}

	public boolean isAddressLinesReverse() {
		// Local
		if (getCCountryID() == getCCountry().getCCountryID())
			return getCCountry().isAddressLinesLocalReverse();
		return getCCountry().isAddressLinesReverse();
	}
	
	/**
	 *	Return detailed String representation
	 *  @return String
	 */
	public String toStringX() {
		StringBuffer sb = new StringBuffer("CLocation=[");
		sb.append(getCLocationID())
			.append(",C_Country_ID=").append(getCCountryID())
			.append(",C_Region_ID=").append(getCRegionID())
			.append(",Postal=").append(getPostal())
			.append ("]");
		return sb.toString();
	}   //  toStringX

	private String parseCRP(CCountry c) {
		if (c == null)
			return "CountryNotFound";
		boolean local = getCCountryID() == getCCountry().getCCountryID();
		String inStr = local ? c.getDisplaySequenceLocal() : c.getDisplaySequence();
		StringBuffer outStr = new StringBuffer();

		String token;
		int i = inStr.indexOf('@');
		while (i != -1) {
			outStr.append(inStr.substring(0, i)); // up to @
			inStr = inStr.substring(i + 1, inStr.length()); // from first @

			int j = inStr.indexOf('@'); // next @
			if (j < 0) {
				token = ""; // no second tag
				j = i + 1;
			} else
				token = inStr.substring(0, j);
			// Tokens
			if (token.equals("C")) {
				if (getCity() != null)
					outStr.append(getCity());
			} else if (token.equals("R")) {
				if (getCRegion() != null) // we have a region
					outStr.append(getCRegion().getName());
				else if (super.getRegionName() != null && super.getRegionName().length() > 0)
					outStr.append(super.getRegionName()); // local region name
			} else if (token.equals("P")) {
				if (getPostal() != null)
					outStr.append(getPostal());
			} else if (token.equals("A")) {
				String add = getPostalAdd();
				if (add != null && add.length() > 0)
					outStr.append("-").append(add);
			} else
				outStr.append("@").append(token).append("@");

			inStr = inStr.substring(j + 1, inStr.length()); // from second @
			i = inStr.indexOf('@');
		}
		outStr.append(inStr); // add the rest of the string
		// Print Region Name if entered and not part of pattern
		if (c.getDisplaySequence().indexOf("@R@") == -1 && super.getRegionName() != null && super.getRegionName().length() > 0)
			outStr.append(" ").append(super.getRegionName());

		String retValue = outStr.toString().replace("\\n", "\n");
		log.finest("parseCRP - " + c.getDisplaySequence() + " -> " + retValue);
		return retValue;
	} // parseContext

	public String toStringCR() {
		StringBuffer retStr = new StringBuffer();
		if (isAddressLinesReverse()) {
			// City, Region, Postal
			retStr.append(parseCRP(getCCountry()));
			if (getAddress4() != null && getAddress4().length() > 0)
				retStr.append("\n").append(getAddress4());
			if (getAddress3() != null && getAddress3().length() > 0)
				retStr.append("\n").append(getAddress3());
			if (getAddress2() != null && getAddress2().length() > 0)
				retStr.append("\n").append(getAddress2());
			if (getAddress1() != null)
				retStr.append("\n").append(getAddress1());
		} else {
			if (getAddress1() != null)
				retStr.append(getAddress1());
			if (getAddress2() != null && getAddress2().length() > 0)
				retStr.append("\n").append(getAddress2());
			if (getAddress3() != null && getAddress3().length() > 0)
				retStr.append("\n").append(getAddress3());
			if (getAddress4() != null && getAddress4().length() > 0)
				retStr.append("\n").append(getAddress4());
			// City, Region, Postal
			retStr.append("\n").append(parseCRP(getCCountry()));
			// Add Country would come here
		}
		return retStr.toString();
	}

}

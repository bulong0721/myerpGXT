package org.adempiere.print.model;

import javax.print.attribute.EnumSyntax;
import javax.print.attribute.Size2DSyntax;
import javax.print.attribute.standard.MediaSize;
import javax.print.attribute.standard.MediaSizeName;

import org.adempiere.common.AdempiereException;
import org.adempiere.common.Language;
import org.adempiere.model.ADPrintPaper;
import org.adempiere.print.CPaper;
import org.adempiere.util.CLogger;

public class PrintPaper extends ADPrintPaper {
	private static final long	serialVersionUID				= 1L;
	public static final int		DIMENSIONUNITS_AD_Reference_ID	= 375;
	public static final String	DIMENSIONUNITS_MM				= "M";
	public static final String	DIMENSIONUNITS_Inch				= "I";
	private static CLogger		log								= CLogger.getCLogger(PrintPaper.class);
	private MediaSize			m_mediaSize						= null;

	public PrintPaper() {
	}

	public PrintPaper(ADPrintPaper entity) {
		setADClientID(entity.getADClientID());
		setADOrgID(entity.getADOrgID());
		setADPrintPaperID(entity.getADPrintPaperID());
		setActive(entity.isActive());
		setCode(entity.getCode());
		setCreated(entity.getCreated());
		setCreatedBy(entity.getCreatedBy());
		setDescription(entity.getDescription());
		setDimensionUnits(entity.getDimensionUnits());
		setIsDefault(entity.isIsDefault());
		setLandscape(entity.isLandscape());
		setMarginBottom(entity.getMarginBottom());
		setMarginLeft(entity.getMarginLeft());
		setMarginRight(entity.getMarginRight());
		setMarginTop(entity.getMarginTop());
		setName(entity.getName());
		setProcessing(entity.isProcessing());
		setSizeX(entity.getSizeX());
		setSizeY(entity.getSizeY());
		setUpdated(entity.getUpdated());
	}

	/**
	 * Get Units Int
	 * 
	 * @return units
	 */
	public int getUnitsInt() {
		String du = getDimensionUnits();
		if (du == null || DIMENSIONUNITS_MM.equals(du))
			return Size2DSyntax.MM;
		else if (DIMENSIONUNITS_Inch.equals(du))
			return Size2DSyntax.INCH;
		else
			throw new AdempiereException("@NotSupported@ @DimensionUnit@ : " + du);
	} // getUnits

	public MediaSize getMediaSizeDefault() {
		m_mediaSize = Language.getLoginLanguage().getMediaSize();
		if (m_mediaSize == null)
			m_mediaSize = MediaSize.ISO.A4;
		log.fine("Size=" + m_mediaSize);
		return m_mediaSize;
	} // getMediaSizeDefault

	public MediaSize getMediaSize() {
		if (m_mediaSize != null)
			return m_mediaSize;
		//
		String nameCode = getCode();
		if (nameCode != null) {
			// Get Name
			MediaSizeName nameMedia = null;
			CMediaSizeName msn = new CMediaSizeName(4);
			String[] names = msn.getStringTable();
			for (int i = 0; i < names.length; i++) {
				String name = names[i];
				if (name.equalsIgnoreCase(nameCode)) {
					nameMedia = (MediaSizeName) msn.getEnumValueTable()[i];
					log.finer("Name=" + nameMedia);
					break;
				}
			}
			if (nameMedia != null) {
				m_mediaSize = MediaSize.getMediaSizeForName(nameMedia);
				log.fine("Name->Size=" + m_mediaSize);
			}
		}
		// Create New Media Size
		if (m_mediaSize == null) {
			float x = getSizeX().floatValue();
			float y = getSizeY().floatValue();
			if (x > 0 && y > 0) {
				m_mediaSize = new MediaSize(x, y, getUnitsInt(), MediaSizeName.A);
				log.fine("Size=" + m_mediaSize);
			}
		}
		// Fallback
		if (m_mediaSize == null)
			m_mediaSize = getMediaSizeDefault();
		return m_mediaSize;
	} // getMediaSize

	public CPaper getCPaper() {
		CPaper retValue;
		if (getCode().toLowerCase().startsWith("custom")) {
			retValue = new CPaper(getSizeX().doubleValue(), getSizeY().doubleValue(), getUnitsInt(), isLandscape(), getMarginLeft(),
					getMarginTop(), getMarginRight(), getMarginBottom());
		} else {
			retValue = new CPaper(getMediaSize(), isLandscape(), getMarginLeft(), getMarginTop(), getMarginRight(), getMarginBottom());
		}
		// End Of AA Goodwill
		return retValue;
	}

	/**
	 * Media Size Name
	 */
	class CMediaSizeName extends MediaSizeName {
		/**
		 * 
		 */
		private static final long	serialVersionUID	= 8561532175435930293L;

		/**
		 * CMediaSizeName
		 * 
		 * @param code
		 */
		public CMediaSizeName(int code) {
			super(code);
		} // CMediaSizeName

		/**
		 * Get String Table
		 * 
		 * @return string
		 */
		public String[] getStringTable() {
			return super.getStringTable();
		}

		/**
		 * Get Enum Value Table
		 * 
		 * @return Media Sizes
		 */
		public EnumSyntax[] getEnumValueTable() {
			return super.getEnumValueTable();
		}
	} // CMediaSizeName

}

package org.adempiere.common;

import java.util.Locale;

import javax.print.attribute.standard.MediaSize;

public enum Language {
	En_US;

	public int getLanguageID() {
		return 0;
	}

	public static Language getLoginLanguage() {
		return En_US;
	}

	public Locale getLocale() {
		// TODO Auto-generated method stub
		return Locale.US;
	}

	public static Language getAD_Language() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isBaseLanguage() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public MediaSize getMediaSize() {
		return MediaSize.ISO.A4;
	}

}

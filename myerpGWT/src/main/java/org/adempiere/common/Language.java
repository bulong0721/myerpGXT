package org.adempiere.common;


public enum Language {
    En_US;

    public int getLanguageID() {
        return 0;
    }

    public static Language getLoginLanguage() {
        return En_US;
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

}

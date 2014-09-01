package org.adempiere.process;

public enum DocType {
    Proposal(129, "SOO", "ON");

    private int    docTypeID;
    private String baseType;
    private String subType;

    private DocType(int docTypeID, String baseType){
        this(docTypeID, baseType, null);
    }

    private DocType(int docTypeID, String baseType, String subType){
        this.docTypeID = docTypeID;
        this.baseType = baseType;
        this.subType = subType;
    }

    public int getDocTypeID() {
        return docTypeID;
    }

    public String getBaseType() {
        return baseType;
    }

    public String getSubType() {
        return subType;
    }

}

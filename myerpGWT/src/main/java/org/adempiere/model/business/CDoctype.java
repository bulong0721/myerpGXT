package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_doctype database table.
 * 
 */
@Entity
@Table(name="c_doctype")
@NamedQuery(name="CDoctype.findAll", query="SELECT c FROM CDoctype c")
public class CDoctype extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cDoctypeId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adPrintformatId;
	private BigDecimal cDoctypedifferenceId;
	private BigDecimal cDoctypeinvoiceId;
	private BigDecimal cDoctypeproformaId;
	private BigDecimal cDoctypeshipmentId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal definitesequenceId;
	private String description;
	private String docbasetype;
	private BigDecimal docnosequenceId;
	private String docsubtypeso;
	private BigDecimal documentcopies;
	private String documentnote;
	private BigDecimal glCategoryId;
	private String hascharges;
	private String hasproforma;
	private String isactive;
	private String iscreatecounter;
	private String isdefault;
	private String isdefaultcounterdoc;
	private String isdocnocontrolled;
	private String isindexed;
	private String isintransit;
	private String isoverwritedateoncomplete;
	private String isoverwriteseqoncomplete;
	private String ispickqaconfirm;
	private String ispreparesplitdocument;
	private String isshipconfirm;
	private String issotrx;
	private String issplitwhendifference;
	private String name;
	private String printname;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CDoctype() {
	}


	@Id
	@Column(name="C_DOCTYPE_ID")
	public long getCDoctypeId() {
		return this.cDoctypeId;
	}

	public void setCDoctypeId(long cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_PRINTFORMAT_ID")
	public BigDecimal getAdPrintformatId() {
		return this.adPrintformatId;
	}

	public void setAdPrintformatId(BigDecimal adPrintformatId) {
		this.adPrintformatId = adPrintformatId;
	}


	@Column(name="C_DOCTYPEDIFFERENCE_ID")
	public BigDecimal getCDoctypedifferenceId() {
		return this.cDoctypedifferenceId;
	}

	public void setCDoctypedifferenceId(BigDecimal cDoctypedifferenceId) {
		this.cDoctypedifferenceId = cDoctypedifferenceId;
	}


	@Column(name="C_DOCTYPEINVOICE_ID")
	public BigDecimal getCDoctypeinvoiceId() {
		return this.cDoctypeinvoiceId;
	}

	public void setCDoctypeinvoiceId(BigDecimal cDoctypeinvoiceId) {
		this.cDoctypeinvoiceId = cDoctypeinvoiceId;
	}


	@Column(name="C_DOCTYPEPROFORMA_ID")
	public BigDecimal getCDoctypeproformaId() {
		return this.cDoctypeproformaId;
	}

	public void setCDoctypeproformaId(BigDecimal cDoctypeproformaId) {
		this.cDoctypeproformaId = cDoctypeproformaId;
	}


	@Column(name="C_DOCTYPESHIPMENT_ID")
	public BigDecimal getCDoctypeshipmentId() {
		return this.cDoctypeshipmentId;
	}

	public void setCDoctypeshipmentId(BigDecimal cDoctypeshipmentId) {
		this.cDoctypeshipmentId = cDoctypeshipmentId;
	}


	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}


	public BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigDecimal createdby) {
		this.createdby = createdby;
	}


	@Column(name="DEFINITESEQUENCE_ID")
	public BigDecimal getDefinitesequenceId() {
		return this.definitesequenceId;
	}

	public void setDefinitesequenceId(BigDecimal definitesequenceId) {
		this.definitesequenceId = definitesequenceId;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getDocbasetype() {
		return this.docbasetype;
	}

	public void setDocbasetype(String docbasetype) {
		this.docbasetype = docbasetype;
	}


	@Column(name="DOCNOSEQUENCE_ID")
	public BigDecimal getDocnosequenceId() {
		return this.docnosequenceId;
	}

	public void setDocnosequenceId(BigDecimal docnosequenceId) {
		this.docnosequenceId = docnosequenceId;
	}


	public String getDocsubtypeso() {
		return this.docsubtypeso;
	}

	public void setDocsubtypeso(String docsubtypeso) {
		this.docsubtypeso = docsubtypeso;
	}


	public BigDecimal getDocumentcopies() {
		return this.documentcopies;
	}

	public void setDocumentcopies(BigDecimal documentcopies) {
		this.documentcopies = documentcopies;
	}


	public String getDocumentnote() {
		return this.documentnote;
	}

	public void setDocumentnote(String documentnote) {
		this.documentnote = documentnote;
	}


	@Column(name="GL_CATEGORY_ID")
	public BigDecimal getGlCategoryId() {
		return this.glCategoryId;
	}

	public void setGlCategoryId(BigDecimal glCategoryId) {
		this.glCategoryId = glCategoryId;
	}


	public String getHascharges() {
		return this.hascharges;
	}

	public void setHascharges(String hascharges) {
		this.hascharges = hascharges;
	}


	public String getHasproforma() {
		return this.hasproforma;
	}

	public void setHasproforma(String hasproforma) {
		this.hasproforma = hasproforma;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIscreatecounter() {
		return this.iscreatecounter;
	}

	public void setIscreatecounter(String iscreatecounter) {
		this.iscreatecounter = iscreatecounter;
	}


	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}


	public String getIsdefaultcounterdoc() {
		return this.isdefaultcounterdoc;
	}

	public void setIsdefaultcounterdoc(String isdefaultcounterdoc) {
		this.isdefaultcounterdoc = isdefaultcounterdoc;
	}


	public String getIsdocnocontrolled() {
		return this.isdocnocontrolled;
	}

	public void setIsdocnocontrolled(String isdocnocontrolled) {
		this.isdocnocontrolled = isdocnocontrolled;
	}


	public String getIsindexed() {
		return this.isindexed;
	}

	public void setIsindexed(String isindexed) {
		this.isindexed = isindexed;
	}


	public String getIsintransit() {
		return this.isintransit;
	}

	public void setIsintransit(String isintransit) {
		this.isintransit = isintransit;
	}


	public String getIsoverwritedateoncomplete() {
		return this.isoverwritedateoncomplete;
	}

	public void setIsoverwritedateoncomplete(String isoverwritedateoncomplete) {
		this.isoverwritedateoncomplete = isoverwritedateoncomplete;
	}


	public String getIsoverwriteseqoncomplete() {
		return this.isoverwriteseqoncomplete;
	}

	public void setIsoverwriteseqoncomplete(String isoverwriteseqoncomplete) {
		this.isoverwriteseqoncomplete = isoverwriteseqoncomplete;
	}


	public String getIspickqaconfirm() {
		return this.ispickqaconfirm;
	}

	public void setIspickqaconfirm(String ispickqaconfirm) {
		this.ispickqaconfirm = ispickqaconfirm;
	}


	public String getIspreparesplitdocument() {
		return this.ispreparesplitdocument;
	}

	public void setIspreparesplitdocument(String ispreparesplitdocument) {
		this.ispreparesplitdocument = ispreparesplitdocument;
	}


	public String getIsshipconfirm() {
		return this.isshipconfirm;
	}

	public void setIsshipconfirm(String isshipconfirm) {
		this.isshipconfirm = isshipconfirm;
	}


	public String getIssotrx() {
		return this.issotrx;
	}

	public void setIssotrx(String issotrx) {
		this.issotrx = issotrx;
	}


	public String getIssplitwhendifference() {
		return this.issplitwhendifference;
	}

	public void setIssplitwhendifference(String issplitwhendifference) {
		this.issplitwhendifference = issplitwhendifference;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPrintname() {
		return this.printname;
	}

	public void setPrintname(String printname) {
		this.printname = printname;
	}


	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}


	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
	}

}
package org.adempiere.web.shared.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_bpartner database table.
 * 
 */
@Entity
@Table(name="c_bpartner")
public class CBpartner extends org.adempiere.web.shared.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cBpartnerId;
	private BigDecimal acqusitioncost;
	private BigDecimal actuallifetimevalue;
	private BigDecimal adClientId;
	private String adLanguage;
	private BigDecimal adOrgId;
	private BigDecimal adOrgbpId;
	private BigDecimal bpartnerParentId;
	private BigDecimal cBpGroupId;
	private BigDecimal cDunningId;
	private BigDecimal cGreetingId;
	private BigDecimal cInvoicescheduleId;
	private BigDecimal cPaymenttermId;
	private BigDecimal cTaxgroupId;
	private Timestamp created;
	private BigDecimal createdby;
	private String deliveryrule;
	private String deliveryviarule;
	private String description;
	private BigDecimal documentcopies;
	private Date dunninggrace;
	private String duns;
	private Date firstsale;
	private BigDecimal flatdiscount;
	private String freightcostrule;
	private BigDecimal invoicePrintformatId;
	private String invoicerule;
	private String isactive;
	private String iscustomer;
	private String isdiscountprinted;
	private String isemployee;
	private String ismanufacturer;
	private String isonetime;
	private String ispotaxexempt;
	private String isprospect;
	private String issalesrep;
	private String issummary;
	private String istaxexempt;
	private String isvendor;
	private BigDecimal logoId;
	private BigDecimal mDiscountschemaId;
	private BigDecimal mPricelistId;
	private String naics;
	private String name;
	private String name2;
	private BigDecimal numberemployees;
	private String paymentrule;
	private String paymentrulepo;
	private BigDecimal poDiscountschemaId;
	private BigDecimal poPaymenttermId;
	private BigDecimal poPricelistId;
	private String poreference;
	private BigDecimal potentiallifetimevalue;
	private String rating;
	private String referenceno;
	private BigDecimal salesrepId;
	private BigDecimal salesvolume;
	private String sendemail;
	private BigDecimal shareofcustomer;
	private BigDecimal shelflifeminpct;
	private BigDecimal soCreditlimit;
	private BigDecimal soCreditused;
	private String soDescription;
	private String socreditstatus;
	private String taxid;
	private BigDecimal totalopenbalance;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String url;
	private String value;

	public CBpartner() {
	}


	@Id
	@Column(name="C_BPARTNER_ID")
	public long getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(long cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	public BigDecimal getAcqusitioncost() {
		return this.acqusitioncost;
	}

	public void setAcqusitioncost(BigDecimal acqusitioncost) {
		this.acqusitioncost = acqusitioncost;
	}


	public BigDecimal getActuallifetimevalue() {
		return this.actuallifetimevalue;
	}

	public void setActuallifetimevalue(BigDecimal actuallifetimevalue) {
		this.actuallifetimevalue = actuallifetimevalue;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_LANGUAGE")
	public String getAdLanguage() {
		return this.adLanguage;
	}

	public void setAdLanguage(String adLanguage) {
		this.adLanguage = adLanguage;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_ORGBP_ID")
	public BigDecimal getAdOrgbpId() {
		return this.adOrgbpId;
	}

	public void setAdOrgbpId(BigDecimal adOrgbpId) {
		this.adOrgbpId = adOrgbpId;
	}


	@Column(name="BPARTNER_PARENT_ID")
	public BigDecimal getBpartnerParentId() {
		return this.bpartnerParentId;
	}

	public void setBpartnerParentId(BigDecimal bpartnerParentId) {
		this.bpartnerParentId = bpartnerParentId;
	}


	@Column(name="C_BP_GROUP_ID")
	public BigDecimal getCBpGroupId() {
		return this.cBpGroupId;
	}

	public void setCBpGroupId(BigDecimal cBpGroupId) {
		this.cBpGroupId = cBpGroupId;
	}


	@Column(name="C_DUNNING_ID")
	public BigDecimal getCDunningId() {
		return this.cDunningId;
	}

	public void setCDunningId(BigDecimal cDunningId) {
		this.cDunningId = cDunningId;
	}


	@Column(name="C_GREETING_ID")
	public BigDecimal getCGreetingId() {
		return this.cGreetingId;
	}

	public void setCGreetingId(BigDecimal cGreetingId) {
		this.cGreetingId = cGreetingId;
	}


	@Column(name="C_INVOICESCHEDULE_ID")
	public BigDecimal getCInvoicescheduleId() {
		return this.cInvoicescheduleId;
	}

	public void setCInvoicescheduleId(BigDecimal cInvoicescheduleId) {
		this.cInvoicescheduleId = cInvoicescheduleId;
	}


	@Column(name="C_PAYMENTTERM_ID")
	public BigDecimal getCPaymenttermId() {
		return this.cPaymenttermId;
	}

	public void setCPaymenttermId(BigDecimal cPaymenttermId) {
		this.cPaymenttermId = cPaymenttermId;
	}


	@Column(name="C_TAXGROUP_ID")
	public BigDecimal getCTaxgroupId() {
		return this.cTaxgroupId;
	}

	public void setCTaxgroupId(BigDecimal cTaxgroupId) {
		this.cTaxgroupId = cTaxgroupId;
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


	public String getDeliveryrule() {
		return this.deliveryrule;
	}

	public void setDeliveryrule(String deliveryrule) {
		this.deliveryrule = deliveryrule;
	}


	public String getDeliveryviarule() {
		return this.deliveryviarule;
	}

	public void setDeliveryviarule(String deliveryviarule) {
		this.deliveryviarule = deliveryviarule;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getDocumentcopies() {
		return this.documentcopies;
	}

	public void setDocumentcopies(BigDecimal documentcopies) {
		this.documentcopies = documentcopies;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDunninggrace() {
		return this.dunninggrace;
	}

	public void setDunninggrace(Date dunninggrace) {
		this.dunninggrace = dunninggrace;
	}


	public String getDuns() {
		return this.duns;
	}

	public void setDuns(String duns) {
		this.duns = duns;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getFirstsale() {
		return this.firstsale;
	}

	public void setFirstsale(Date firstsale) {
		this.firstsale = firstsale;
	}


	public BigDecimal getFlatdiscount() {
		return this.flatdiscount;
	}

	public void setFlatdiscount(BigDecimal flatdiscount) {
		this.flatdiscount = flatdiscount;
	}


	public String getFreightcostrule() {
		return this.freightcostrule;
	}

	public void setFreightcostrule(String freightcostrule) {
		this.freightcostrule = freightcostrule;
	}


	@Column(name="INVOICE_PRINTFORMAT_ID")
	public BigDecimal getInvoicePrintformatId() {
		return this.invoicePrintformatId;
	}

	public void setInvoicePrintformatId(BigDecimal invoicePrintformatId) {
		this.invoicePrintformatId = invoicePrintformatId;
	}


	public String getInvoicerule() {
		return this.invoicerule;
	}

	public void setInvoicerule(String invoicerule) {
		this.invoicerule = invoicerule;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIscustomer() {
		return this.iscustomer;
	}

	public void setIscustomer(String iscustomer) {
		this.iscustomer = iscustomer;
	}


	public String getIsdiscountprinted() {
		return this.isdiscountprinted;
	}

	public void setIsdiscountprinted(String isdiscountprinted) {
		this.isdiscountprinted = isdiscountprinted;
	}


	public String getIsemployee() {
		return this.isemployee;
	}

	public void setIsemployee(String isemployee) {
		this.isemployee = isemployee;
	}


	public String getIsmanufacturer() {
		return this.ismanufacturer;
	}

	public void setIsmanufacturer(String ismanufacturer) {
		this.ismanufacturer = ismanufacturer;
	}


	public String getIsonetime() {
		return this.isonetime;
	}

	public void setIsonetime(String isonetime) {
		this.isonetime = isonetime;
	}


	public String getIspotaxexempt() {
		return this.ispotaxexempt;
	}

	public void setIspotaxexempt(String ispotaxexempt) {
		this.ispotaxexempt = ispotaxexempt;
	}


	public String getIsprospect() {
		return this.isprospect;
	}

	public void setIsprospect(String isprospect) {
		this.isprospect = isprospect;
	}


	public String getIssalesrep() {
		return this.issalesrep;
	}

	public void setIssalesrep(String issalesrep) {
		this.issalesrep = issalesrep;
	}


	public String getIssummary() {
		return this.issummary;
	}

	public void setIssummary(String issummary) {
		this.issummary = issummary;
	}


	public String getIstaxexempt() {
		return this.istaxexempt;
	}

	public void setIstaxexempt(String istaxexempt) {
		this.istaxexempt = istaxexempt;
	}


	public String getIsvendor() {
		return this.isvendor;
	}

	public void setIsvendor(String isvendor) {
		this.isvendor = isvendor;
	}


	@Column(name="LOGO_ID")
	public BigDecimal getLogoId() {
		return this.logoId;
	}

	public void setLogoId(BigDecimal logoId) {
		this.logoId = logoId;
	}


	@Column(name="M_DISCOUNTSCHEMA_ID")
	public BigDecimal getMDiscountschemaId() {
		return this.mDiscountschemaId;
	}

	public void setMDiscountschemaId(BigDecimal mDiscountschemaId) {
		this.mDiscountschemaId = mDiscountschemaId;
	}


	@Column(name="M_PRICELIST_ID")
	public BigDecimal getMPricelistId() {
		return this.mPricelistId;
	}

	public void setMPricelistId(BigDecimal mPricelistId) {
		this.mPricelistId = mPricelistId;
	}


	public String getNaics() {
		return this.naics;
	}

	public void setNaics(String naics) {
		this.naics = naics;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getName2() {
		return this.name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}


	public BigDecimal getNumberemployees() {
		return this.numberemployees;
	}

	public void setNumberemployees(BigDecimal numberemployees) {
		this.numberemployees = numberemployees;
	}


	public String getPaymentrule() {
		return this.paymentrule;
	}

	public void setPaymentrule(String paymentrule) {
		this.paymentrule = paymentrule;
	}


	public String getPaymentrulepo() {
		return this.paymentrulepo;
	}

	public void setPaymentrulepo(String paymentrulepo) {
		this.paymentrulepo = paymentrulepo;
	}


	@Column(name="PO_DISCOUNTSCHEMA_ID")
	public BigDecimal getPoDiscountschemaId() {
		return this.poDiscountschemaId;
	}

	public void setPoDiscountschemaId(BigDecimal poDiscountschemaId) {
		this.poDiscountschemaId = poDiscountschemaId;
	}


	@Column(name="PO_PAYMENTTERM_ID")
	public BigDecimal getPoPaymenttermId() {
		return this.poPaymenttermId;
	}

	public void setPoPaymenttermId(BigDecimal poPaymenttermId) {
		this.poPaymenttermId = poPaymenttermId;
	}


	@Column(name="PO_PRICELIST_ID")
	public BigDecimal getPoPricelistId() {
		return this.poPricelistId;
	}

	public void setPoPricelistId(BigDecimal poPricelistId) {
		this.poPricelistId = poPricelistId;
	}


	public String getPoreference() {
		return this.poreference;
	}

	public void setPoreference(String poreference) {
		this.poreference = poreference;
	}


	public BigDecimal getPotentiallifetimevalue() {
		return this.potentiallifetimevalue;
	}

	public void setPotentiallifetimevalue(BigDecimal potentiallifetimevalue) {
		this.potentiallifetimevalue = potentiallifetimevalue;
	}


	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getReferenceno() {
		return this.referenceno;
	}

	public void setReferenceno(String referenceno) {
		this.referenceno = referenceno;
	}


	@Column(name="SALESREP_ID")
	public BigDecimal getSalesrepId() {
		return this.salesrepId;
	}

	public void setSalesrepId(BigDecimal salesrepId) {
		this.salesrepId = salesrepId;
	}


	public BigDecimal getSalesvolume() {
		return this.salesvolume;
	}

	public void setSalesvolume(BigDecimal salesvolume) {
		this.salesvolume = salesvolume;
	}


	public String getSendemail() {
		return this.sendemail;
	}

	public void setSendemail(String sendemail) {
		this.sendemail = sendemail;
	}


	public BigDecimal getShareofcustomer() {
		return this.shareofcustomer;
	}

	public void setShareofcustomer(BigDecimal shareofcustomer) {
		this.shareofcustomer = shareofcustomer;
	}


	public BigDecimal getShelflifeminpct() {
		return this.shelflifeminpct;
	}

	public void setShelflifeminpct(BigDecimal shelflifeminpct) {
		this.shelflifeminpct = shelflifeminpct;
	}


	@Column(name="SO_CREDITLIMIT")
	public BigDecimal getSoCreditlimit() {
		return this.soCreditlimit;
	}

	public void setSoCreditlimit(BigDecimal soCreditlimit) {
		this.soCreditlimit = soCreditlimit;
	}


	@Column(name="SO_CREDITUSED")
	public BigDecimal getSoCreditused() {
		return this.soCreditused;
	}

	public void setSoCreditused(BigDecimal soCreditused) {
		this.soCreditused = soCreditused;
	}


	@Column(name="SO_DESCRIPTION")
	public String getSoDescription() {
		return this.soDescription;
	}

	public void setSoDescription(String soDescription) {
		this.soDescription = soDescription;
	}


	public String getSocreditstatus() {
		return this.socreditstatus;
	}

	public void setSocreditstatus(String socreditstatus) {
		this.socreditstatus = socreditstatus;
	}


	public String getTaxid() {
		return this.taxid;
	}

	public void setTaxid(String taxid) {
		this.taxid = taxid;
	}


	public BigDecimal getTotalopenbalance() {
		return this.totalopenbalance;
	}

	public void setTotalopenbalance(BigDecimal totalopenbalance) {
		this.totalopenbalance = totalopenbalance;
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


	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
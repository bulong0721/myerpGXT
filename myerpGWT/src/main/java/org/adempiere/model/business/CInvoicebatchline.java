package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the c_invoicebatchline database table.
 * 
 */
@Entity
@Table(name="c_invoicebatchline")
@NamedQuery(name="CInvoicebatchline.findAll", query="SELECT c FROM CInvoicebatchline c")
public class CInvoicebatchline extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cInvoicebatchlineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adOrgtrxId;
	private BigDecimal adUserId;
	private BigDecimal cActivityId;
	private BigDecimal cBpartnerId;
	private BigDecimal cBpartnerLocationId;
	private BigDecimal cChargeId;
	private BigDecimal cDoctypeId;
	private BigDecimal cInvoiceId;
	private BigDecimal cInvoicebatchId;
	private BigDecimal cInvoicelineId;
	private BigDecimal cProjectId;
	private BigDecimal cTaxId;
	private Timestamp created;
	private BigDecimal createdby;
	private Date dateacct;
	private Date dateinvoiced;
	private String description;
	private String documentno;
	private String isactive;
	private String istaxincluded;
	private BigDecimal line;
	private BigDecimal linenetamt;
	private BigDecimal linetotalamt;
	private BigDecimal priceentered;
	private String processed;
	private BigDecimal qtyentered;
	private BigDecimal taxamt;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal user1Id;
	private BigDecimal user2Id;

	public CInvoicebatchline() {
	}


	@Id
	@Column(name="C_INVOICEBATCHLINE_ID")
	public long getCInvoicebatchlineId() {
		return this.cInvoicebatchlineId;
	}

	public void setCInvoicebatchlineId(long cInvoicebatchlineId) {
		this.cInvoicebatchlineId = cInvoicebatchlineId;
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


	@Column(name="AD_ORGTRX_ID")
	public BigDecimal getAdOrgtrxId() {
		return this.adOrgtrxId;
	}

	public void setAdOrgtrxId(BigDecimal adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}


	@Column(name="AD_USER_ID")
	public BigDecimal getAdUserId() {
		return this.adUserId;
	}

	public void setAdUserId(BigDecimal adUserId) {
		this.adUserId = adUserId;
	}


	@Column(name="C_ACTIVITY_ID")
	public BigDecimal getCActivityId() {
		return this.cActivityId;
	}

	public void setCActivityId(BigDecimal cActivityId) {
		this.cActivityId = cActivityId;
	}


	@Column(name="C_BPARTNER_ID")
	public BigDecimal getCBpartnerId() {
		return this.cBpartnerId;
	}

	public void setCBpartnerId(BigDecimal cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}


	@Column(name="C_BPARTNER_LOCATION_ID")
	public BigDecimal getCBpartnerLocationId() {
		return this.cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(BigDecimal cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}


	@Column(name="C_CHARGE_ID")
	public BigDecimal getCChargeId() {
		return this.cChargeId;
	}

	public void setCChargeId(BigDecimal cChargeId) {
		this.cChargeId = cChargeId;
	}


	@Column(name="C_DOCTYPE_ID")
	public BigDecimal getCDoctypeId() {
		return this.cDoctypeId;
	}

	public void setCDoctypeId(BigDecimal cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}


	@Column(name="C_INVOICE_ID")
	public BigDecimal getCInvoiceId() {
		return this.cInvoiceId;
	}

	public void setCInvoiceId(BigDecimal cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}


	@Column(name="C_INVOICEBATCH_ID")
	public BigDecimal getCInvoicebatchId() {
		return this.cInvoicebatchId;
	}

	public void setCInvoicebatchId(BigDecimal cInvoicebatchId) {
		this.cInvoicebatchId = cInvoicebatchId;
	}


	@Column(name="C_INVOICELINE_ID")
	public BigDecimal getCInvoicelineId() {
		return this.cInvoicelineId;
	}

	public void setCInvoicelineId(BigDecimal cInvoicelineId) {
		this.cInvoicelineId = cInvoicelineId;
	}


	@Column(name="C_PROJECT_ID")
	public BigDecimal getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(BigDecimal cProjectId) {
		this.cProjectId = cProjectId;
	}


	@Column(name="C_TAX_ID")
	public BigDecimal getCTaxId() {
		return this.cTaxId;
	}

	public void setCTaxId(BigDecimal cTaxId) {
		this.cTaxId = cTaxId;
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


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateacct() {
		return this.dateacct;
	}

	public void setDateacct(Date dateacct) {
		this.dateacct = dateacct;
	}


	@Temporal(TemporalType.TIMESTAMP)
	public Date getDateinvoiced() {
		return this.dateinvoiced;
	}

	public void setDateinvoiced(Date dateinvoiced) {
		this.dateinvoiced = dateinvoiced;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getDocumentno() {
		return this.documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIstaxincluded() {
		return this.istaxincluded;
	}

	public void setIstaxincluded(String istaxincluded) {
		this.istaxincluded = istaxincluded;
	}


	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}


	public BigDecimal getLinenetamt() {
		return this.linenetamt;
	}

	public void setLinenetamt(BigDecimal linenetamt) {
		this.linenetamt = linenetamt;
	}


	public BigDecimal getLinetotalamt() {
		return this.linetotalamt;
	}

	public void setLinetotalamt(BigDecimal linetotalamt) {
		this.linetotalamt = linetotalamt;
	}


	public BigDecimal getPriceentered() {
		return this.priceentered;
	}

	public void setPriceentered(BigDecimal priceentered) {
		this.priceentered = priceentered;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}


	public BigDecimal getQtyentered() {
		return this.qtyentered;
	}

	public void setQtyentered(BigDecimal qtyentered) {
		this.qtyentered = qtyentered;
	}


	public BigDecimal getTaxamt() {
		return this.taxamt;
	}

	public void setTaxamt(BigDecimal taxamt) {
		this.taxamt = taxamt;
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


	@Column(name="USER1_ID")
	public BigDecimal getUser1Id() {
		return this.user1Id;
	}

	public void setUser1Id(BigDecimal user1Id) {
		this.user1Id = user1Id;
	}


	@Column(name="USER2_ID")
	public BigDecimal getUser2Id() {
		return this.user2Id;
	}

	public void setUser2Id(BigDecimal user2Id) {
		this.user2Id = user2Id;
	}

}
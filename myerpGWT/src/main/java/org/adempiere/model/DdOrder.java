package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="dd_order")
public class DdOrder extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adOrgtrxId;
	private Integer adUserId;
	private Integer cActivityId;
	private Integer cBpartnerId;
	private Integer cBpartnerLocationId;
	private Integer cCampaignId;
	private Integer cChargeId;
	private Integer cDoctypeId;
	private Integer cInvoiceId;
	private Integer cOrderId;
	private Integer cProjectId;
	private BigDecimal chargeamt;
	private String createconfirm;
	private String created;
	private Integer createdby;
	private String createfrom;
	private String createpackage;
	private String dateordered;
	private String dateprinted;
	private String datepromised;
	private String datereceived;
	private Integer ddOrderId;
	private String deliveryrule;
	private String deliveryviarule;
	private String description;
	private String docaction;
	private String docstatus;
	private String documentno;
	private BigDecimal freightamt;
	private String freightcostrule;
	private String generateto;
	private Boolean isactive;
	private Boolean isapproved;
	private Boolean isdelivered;
	private Boolean isdropship;
	private Boolean isindispute;
	private Boolean isintransit;
	private Boolean isprinted;
	private Boolean isselected;
	private Boolean issotrx;
	private Integer mShipperId;
	private Integer mWarehouseId;
	private Integer nopackages;
	private String pickdate;
	private String poreference;
	private String posted;
	private String priorityrule;
	private Boolean processed;
	private Long processedon;
	private Boolean processing;
	private Integer refOrderId;
	private Integer salesrepId;
	private String sendemail;
	private String shipdate;
	private String trackingno;
	private String updated;
	private Integer updatedby;
	private Integer user1Id;
	private Integer user2Id;
	private BigDecimal volume;
	private BigDecimal weight;

	public DdOrder() {
	}

	public DdOrder(Integer ddOrderId) {
		this.ddOrderId = ddOrderId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_ORGTRX_ID", columnDefinition="INT")
	public Integer getAdOrgtrxId() {
		return adOrgtrxId;
	}

	public void setAdOrgtrxId(Integer adOrgtrxId) {
		this.adOrgtrxId = adOrgtrxId;
	}

	@Basic
	@Column(name="AD_USER_ID", columnDefinition="INT")
	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
	}

	@Basic
	@Column(name="C_ACTIVITY_ID", columnDefinition="INT")
	public Integer getCActivityId() {
		return cActivityId;
	}

	public void setCActivityId(Integer cActivityId) {
		this.cActivityId = cActivityId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT", nullable=false)
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_BPARTNER_LOCATION_ID", columnDefinition="INT", nullable=false)
	public Integer getCBpartnerLocationId() {
		return cBpartnerLocationId;
	}

	public void setCBpartnerLocationId(Integer cBpartnerLocationId) {
		this.cBpartnerLocationId = cBpartnerLocationId;
	}

	@Basic
	@Column(name="C_CAMPAIGN_ID", columnDefinition="INT")
	public Integer getCCampaignId() {
		return cCampaignId;
	}

	public void setCCampaignId(Integer cCampaignId) {
		this.cCampaignId = cCampaignId;
	}

	@Basic
	@Column(name="C_CHARGE_ID", columnDefinition="INT")
	public Integer getCChargeId() {
		return cChargeId;
	}

	public void setCChargeId(Integer cChargeId) {
		this.cChargeId = cChargeId;
	}

	@Basic
	@Column(name="C_DOCTYPE_ID", columnDefinition="INT", nullable=false)
	public Integer getCDoctypeId() {
		return cDoctypeId;
	}

	public void setCDoctypeId(Integer cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}

	@Basic
	@Column(name="C_INVOICE_ID", columnDefinition="INT")
	public Integer getCInvoiceId() {
		return cInvoiceId;
	}

	public void setCInvoiceId(Integer cInvoiceId) {
		this.cInvoiceId = cInvoiceId;
	}

	@Basic
	@Column(name="C_ORDER_ID", columnDefinition="INT")
	public Integer getCOrderId() {
		return cOrderId;
	}

	public void setCOrderId(Integer cOrderId) {
		this.cOrderId = cOrderId;
	}

	@Basic
	@Column(name="C_PROJECT_ID", columnDefinition="INT")
	public Integer getCProjectId() {
		return cProjectId;
	}

	public void setCProjectId(Integer cProjectId) {
		this.cProjectId = cProjectId;
	}

	@Basic
	public BigDecimal getChargeamt() {
		return chargeamt;
	}

	public void setChargeamt(BigDecimal chargeamt) {
		this.chargeamt = chargeamt;
	}

	@Basic
	@Column(length=1)
	public String getCreateconfirm() {
		return createconfirm;
	}

	public void setCreateconfirm(String createconfirm) {
		this.createconfirm = createconfirm;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(length=1)
	public String getCreatefrom() {
		return createfrom;
	}

	public void setCreatefrom(String createfrom) {
		this.createfrom = createfrom;
	}

	@Basic
	@Column(length=1)
	public String getCreatepackage() {
		return createpackage;
	}

	public void setCreatepackage(String createpackage) {
		this.createpackage = createpackage;
	}

	@Basic
	@Column(nullable=false)
	public String getDateordered() {
		return dateordered;
	}

	public void setDateordered(String dateordered) {
		this.dateordered = dateordered;
	}

	@Basic
	public String getDateprinted() {
		return dateprinted;
	}

	public void setDateprinted(String dateprinted) {
		this.dateprinted = dateprinted;
	}

	@Basic
	@Column(nullable=false)
	public String getDatepromised() {
		return datepromised;
	}

	public void setDatepromised(String datepromised) {
		this.datepromised = datepromised;
	}

	@Basic
	public String getDatereceived() {
		return datereceived;
	}

	public void setDatereceived(String datereceived) {
		this.datereceived = datereceived;
	}

	@Id
	@Column(name="DD_ORDER_ID", columnDefinition="INT")
	public Integer getDdOrderId() {
		return ddOrderId;
	}

	public void setDdOrderId(Integer ddOrderId) {
		this.ddOrderId = ddOrderId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getDeliveryrule() {
		return deliveryrule;
	}

	public void setDeliveryrule(String deliveryrule) {
		this.deliveryrule = deliveryrule;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getDeliveryviarule() {
		return deliveryviarule;
	}

	public void setDeliveryviarule(String deliveryviarule) {
		this.deliveryviarule = deliveryviarule;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getDocaction() {
		return docaction;
	}

	public void setDocaction(String docaction) {
		this.docaction = docaction;
	}

	@Basic
	@Column(nullable=false, length=2)
	public String getDocstatus() {
		return docstatus;
	}

	public void setDocstatus(String docstatus) {
		this.docstatus = docstatus;
	}

	@Basic
	@Column(nullable=false, length=30)
	public String getDocumentno() {
		return documentno;
	}

	public void setDocumentno(String documentno) {
		this.documentno = documentno;
	}

	@Basic
	public BigDecimal getFreightamt() {
		return freightamt;
	}

	public void setFreightamt(BigDecimal freightamt) {
		this.freightamt = freightamt;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getFreightcostrule() {
		return freightcostrule;
	}

	public void setFreightcostrule(String freightcostrule) {
		this.freightcostrule = freightcostrule;
	}

	@Basic
	@Column(length=1)
	public String getGenerateto() {
		return generateto;
	}

	public void setGenerateto(String generateto) {
		this.generateto = generateto;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsapproved() {
		return isapproved;
	}

	public void setIsapproved(Boolean isapproved) {
		this.isapproved = isapproved;
	}

	@Basic
	public Boolean isIsdelivered() {
		return isdelivered;
	}

	public void setIsdelivered(Boolean isdelivered) {
		this.isdelivered = isdelivered;
	}

	@Basic
	public Boolean isIsdropship() {
		return isdropship;
	}

	public void setIsdropship(Boolean isdropship) {
		this.isdropship = isdropship;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsindispute() {
		return isindispute;
	}

	public void setIsindispute(Boolean isindispute) {
		this.isindispute = isindispute;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsintransit() {
		return isintransit;
	}

	public void setIsintransit(Boolean isintransit) {
		this.isintransit = isintransit;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsprinted() {
		return isprinted;
	}

	public void setIsprinted(Boolean isprinted) {
		this.isprinted = isprinted;
	}

	@Basic
	public Boolean isIsselected() {
		return isselected;
	}

	public void setIsselected(Boolean isselected) {
		this.isselected = isselected;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIssotrx() {
		return issotrx;
	}

	public void setIssotrx(Boolean issotrx) {
		this.issotrx = issotrx;
	}

	@Basic
	@Column(name="M_SHIPPER_ID", columnDefinition="INT")
	public Integer getMShipperId() {
		return mShipperId;
	}

	public void setMShipperId(Integer mShipperId) {
		this.mShipperId = mShipperId;
	}

	@Basic
	@Column(name="M_WAREHOUSE_ID", columnDefinition="INT", nullable=false)
	public Integer getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(Integer mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getNopackages() {
		return nopackages;
	}

	public void setNopackages(Integer nopackages) {
		this.nopackages = nopackages;
	}

	@Basic
	public String getPickdate() {
		return pickdate;
	}

	public void setPickdate(String pickdate) {
		this.pickdate = pickdate;
	}

	@Basic
	@Column(length=20)
	public String getPoreference() {
		return poreference;
	}

	public void setPoreference(String poreference) {
		this.poreference = poreference;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getPosted() {
		return posted;
	}

	public void setPosted(String posted) {
		this.posted = posted;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getPriorityrule() {
		return priorityrule;
	}

	public void setPriorityrule(String priorityrule) {
		this.priorityrule = priorityrule;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public Long getProcessedon() {
		return processedon;
	}

	public void setProcessedon(Long processedon) {
		this.processedon = processedon;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	@Column(name="REF_ORDER_ID", columnDefinition="INT")
	public Integer getRefOrderId() {
		return refOrderId;
	}

	public void setRefOrderId(Integer refOrderId) {
		this.refOrderId = refOrderId;
	}

	@Basic
	@Column(name="SALESREP_ID", columnDefinition="INT")
	public Integer getSalesrepId() {
		return salesrepId;
	}

	public void setSalesrepId(Integer salesrepId) {
		this.salesrepId = salesrepId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getSendemail() {
		return sendemail;
	}

	public void setSendemail(String sendemail) {
		this.sendemail = sendemail;
	}

	@Basic
	public String getShipdate() {
		return shipdate;
	}

	public void setShipdate(String shipdate) {
		this.shipdate = shipdate;
	}

	@Basic
	@Column(length=60)
	public String getTrackingno() {
		return trackingno;
	}

	public void setTrackingno(String trackingno) {
		this.trackingno = trackingno;
	}

	@Basic
	@Column(columnDefinition="TIMESTAMP", nullable=false)
	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}

	@Basic
	@Column(name="USER1_ID", columnDefinition="INT")
	public Integer getUser1Id() {
		return user1Id;
	}

	public void setUser1Id(Integer user1Id) {
		this.user1Id = user1Id;
	}

	@Basic
	@Column(name="USER2_ID", columnDefinition="INT")
	public Integer getUser2Id() {
		return user2Id;
	}

	public void setUser2Id(Integer user2Id) {
		this.user2Id = user2Id;
	}

	@Basic
	public BigDecimal getVolume() {
		return volume;
	}

	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}

	@Basic
	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
}
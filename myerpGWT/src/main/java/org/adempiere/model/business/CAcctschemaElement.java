package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_acctschema_element database table.
 * 
 */
@Entity
@Table(name="c_acctschema_element")
@NamedQuery(name="CAcctschemaElement.findAll", query="SELECT c FROM CAcctschemaElement c")
public class CAcctschemaElement extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cAcctschemaElementId;
	private BigDecimal adClientId;
	private BigDecimal adColumnId;
	private BigDecimal adOrgId;
	private BigDecimal cAcctschemaId;
	private BigDecimal cActivityId;
	private BigDecimal cBpartnerId;
	private BigDecimal cCampaignId;
	private BigDecimal cElementId;
	private BigDecimal cElementvalueId;
	private BigDecimal cLocationId;
	private BigDecimal cProjectId;
	private BigDecimal cSalesregionId;
	private Timestamp created;
	private BigDecimal createdby;
	private String elementtype;
	private String isactive;
	private String isbalanced;
	private String ismandatory;
	private BigDecimal mProductId;
	private String name;
	private BigDecimal orgId;
	private BigDecimal seqno;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CAcctschemaElement() {
	}


	@Id
	@Column(name="C_ACCTSCHEMA_ELEMENT_ID")
	public long getCAcctschemaElementId() {
		return this.cAcctschemaElementId;
	}

	public void setCAcctschemaElementId(long cAcctschemaElementId) {
		this.cAcctschemaElementId = cAcctschemaElementId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_COLUMN_ID")
	public BigDecimal getAdColumnId() {
		return this.adColumnId;
	}

	public void setAdColumnId(BigDecimal adColumnId) {
		this.adColumnId = adColumnId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="C_ACCTSCHEMA_ID")
	public BigDecimal getCAcctschemaId() {
		return this.cAcctschemaId;
	}

	public void setCAcctschemaId(BigDecimal cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
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


	@Column(name="C_CAMPAIGN_ID")
	public BigDecimal getCCampaignId() {
		return this.cCampaignId;
	}

	public void setCCampaignId(BigDecimal cCampaignId) {
		this.cCampaignId = cCampaignId;
	}


	@Column(name="C_ELEMENT_ID")
	public BigDecimal getCElementId() {
		return this.cElementId;
	}

	public void setCElementId(BigDecimal cElementId) {
		this.cElementId = cElementId;
	}


	@Column(name="C_ELEMENTVALUE_ID")
	public BigDecimal getCElementvalueId() {
		return this.cElementvalueId;
	}

	public void setCElementvalueId(BigDecimal cElementvalueId) {
		this.cElementvalueId = cElementvalueId;
	}


	@Column(name="C_LOCATION_ID")
	public BigDecimal getCLocationId() {
		return this.cLocationId;
	}

	public void setCLocationId(BigDecimal cLocationId) {
		this.cLocationId = cLocationId;
	}


	@Column(name="C_PROJECT_ID")
	public BigDecimal getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(BigDecimal cProjectId) {
		this.cProjectId = cProjectId;
	}


	@Column(name="C_SALESREGION_ID")
	public BigDecimal getCSalesregionId() {
		return this.cSalesregionId;
	}

	public void setCSalesregionId(BigDecimal cSalesregionId) {
		this.cSalesregionId = cSalesregionId;
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


	public String getElementtype() {
		return this.elementtype;
	}

	public void setElementtype(String elementtype) {
		this.elementtype = elementtype;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsbalanced() {
		return this.isbalanced;
	}

	public void setIsbalanced(String isbalanced) {
		this.isbalanced = isbalanced;
	}


	public String getIsmandatory() {
		return this.ismandatory;
	}

	public void setIsmandatory(String ismandatory) {
		this.ismandatory = ismandatory;
	}


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="ORG_ID")
	public BigDecimal getOrgId() {
		return this.orgId;
	}

	public void setOrgId(BigDecimal orgId) {
		this.orgId = orgId;
	}


	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
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
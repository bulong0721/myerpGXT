package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_projectline database table.
 * 
 */
@Entity
@Table(name="c_projectline")
@NamedQuery(name="CProjectline.findAll", query="SELECT c FROM CProjectline c")
public class CProjectline extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cProjectlineId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cOrderId;
	private BigDecimal cOrderpoId;
	private BigDecimal cProjectId;
	private BigDecimal cProjectissueId;
	private BigDecimal cProjectphaseId;
	private BigDecimal cProjecttaskId;
	private BigDecimal committedamt;
	private BigDecimal committedqty;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String dopricing;
	private BigDecimal invoicedamt;
	private BigDecimal invoicedqty;
	private String isactive;
	private String isprinted;
	private BigDecimal line;
	private BigDecimal mProductCategoryId;
	private BigDecimal mProductId;
	private BigDecimal plannedamt;
	private BigDecimal plannedmarginamt;
	private BigDecimal plannedprice;
	private BigDecimal plannedqty;
	private String processed;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CProjectline() {
	}


	@Id
	@Column(name="C_PROJECTLINE_ID")
	public long getCProjectlineId() {
		return this.cProjectlineId;
	}

	public void setCProjectlineId(long cProjectlineId) {
		this.cProjectlineId = cProjectlineId;
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


	@Column(name="C_ORDER_ID")
	public BigDecimal getCOrderId() {
		return this.cOrderId;
	}

	public void setCOrderId(BigDecimal cOrderId) {
		this.cOrderId = cOrderId;
	}


	@Column(name="C_ORDERPO_ID")
	public BigDecimal getCOrderpoId() {
		return this.cOrderpoId;
	}

	public void setCOrderpoId(BigDecimal cOrderpoId) {
		this.cOrderpoId = cOrderpoId;
	}


	@Column(name="C_PROJECT_ID")
	public BigDecimal getCProjectId() {
		return this.cProjectId;
	}

	public void setCProjectId(BigDecimal cProjectId) {
		this.cProjectId = cProjectId;
	}


	@Column(name="C_PROJECTISSUE_ID")
	public BigDecimal getCProjectissueId() {
		return this.cProjectissueId;
	}

	public void setCProjectissueId(BigDecimal cProjectissueId) {
		this.cProjectissueId = cProjectissueId;
	}


	@Column(name="C_PROJECTPHASE_ID")
	public BigDecimal getCProjectphaseId() {
		return this.cProjectphaseId;
	}

	public void setCProjectphaseId(BigDecimal cProjectphaseId) {
		this.cProjectphaseId = cProjectphaseId;
	}


	@Column(name="C_PROJECTTASK_ID")
	public BigDecimal getCProjecttaskId() {
		return this.cProjecttaskId;
	}

	public void setCProjecttaskId(BigDecimal cProjecttaskId) {
		this.cProjecttaskId = cProjecttaskId;
	}


	public BigDecimal getCommittedamt() {
		return this.committedamt;
	}

	public void setCommittedamt(BigDecimal committedamt) {
		this.committedamt = committedamt;
	}


	public BigDecimal getCommittedqty() {
		return this.committedqty;
	}

	public void setCommittedqty(BigDecimal committedqty) {
		this.committedqty = committedqty;
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


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getDopricing() {
		return this.dopricing;
	}

	public void setDopricing(String dopricing) {
		this.dopricing = dopricing;
	}


	public BigDecimal getInvoicedamt() {
		return this.invoicedamt;
	}

	public void setInvoicedamt(BigDecimal invoicedamt) {
		this.invoicedamt = invoicedamt;
	}


	public BigDecimal getInvoicedqty() {
		return this.invoicedqty;
	}

	public void setInvoicedqty(BigDecimal invoicedqty) {
		this.invoicedqty = invoicedqty;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsprinted() {
		return this.isprinted;
	}

	public void setIsprinted(String isprinted) {
		this.isprinted = isprinted;
	}


	public BigDecimal getLine() {
		return this.line;
	}

	public void setLine(BigDecimal line) {
		this.line = line;
	}


	@Column(name="M_PRODUCT_CATEGORY_ID")
	public BigDecimal getMProductCategoryId() {
		return this.mProductCategoryId;
	}

	public void setMProductCategoryId(BigDecimal mProductCategoryId) {
		this.mProductCategoryId = mProductCategoryId;
	}


	@Column(name="M_PRODUCT_ID")
	public BigDecimal getMProductId() {
		return this.mProductId;
	}

	public void setMProductId(BigDecimal mProductId) {
		this.mProductId = mProductId;
	}


	public BigDecimal getPlannedamt() {
		return this.plannedamt;
	}

	public void setPlannedamt(BigDecimal plannedamt) {
		this.plannedamt = plannedamt;
	}


	public BigDecimal getPlannedmarginamt() {
		return this.plannedmarginamt;
	}

	public void setPlannedmarginamt(BigDecimal plannedmarginamt) {
		this.plannedmarginamt = plannedmarginamt;
	}


	public BigDecimal getPlannedprice() {
		return this.plannedprice;
	}

	public void setPlannedprice(BigDecimal plannedprice) {
		this.plannedprice = plannedprice;
	}


	public BigDecimal getPlannedqty() {
		return this.plannedqty;
	}

	public void setPlannedqty(BigDecimal plannedqty) {
		this.plannedqty = plannedqty;
	}


	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
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
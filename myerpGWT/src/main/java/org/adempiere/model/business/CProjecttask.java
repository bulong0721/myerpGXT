package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_projecttask database table.
 * 
 */
@Entity
@Table(name="c_projecttask")
@NamedQuery(name="CProjecttask.findAll", query="SELECT c FROM CProjecttask c")
public class CProjecttask extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cProjecttaskId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cProjectphaseId;
	private BigDecimal cTaskId;
	private BigDecimal committedamt;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String help;
	private String isactive;
	private BigDecimal mProductId;
	private String name;
	private BigDecimal plannedamt;
	private String projinvoicerule;
	private BigDecimal qty;
	private BigDecimal seqno;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CProjecttask() {
	}


	@Id
	@Column(name="C_PROJECTTASK_ID")
	public long getCProjecttaskId() {
		return this.cProjecttaskId;
	}

	public void setCProjecttaskId(long cProjecttaskId) {
		this.cProjecttaskId = cProjecttaskId;
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


	@Column(name="C_PROJECTPHASE_ID")
	public BigDecimal getCProjectphaseId() {
		return this.cProjectphaseId;
	}

	public void setCProjectphaseId(BigDecimal cProjectphaseId) {
		this.cProjectphaseId = cProjectphaseId;
	}


	@Column(name="C_TASK_ID")
	public BigDecimal getCTaskId() {
		return this.cTaskId;
	}

	public void setCTaskId(BigDecimal cTaskId) {
		this.cTaskId = cTaskId;
	}


	public BigDecimal getCommittedamt() {
		return this.committedamt;
	}

	public void setCommittedamt(BigDecimal committedamt) {
		this.committedamt = committedamt;
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


	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
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


	public BigDecimal getPlannedamt() {
		return this.plannedamt;
	}

	public void setPlannedamt(BigDecimal plannedamt) {
		this.plannedamt = plannedamt;
	}


	public String getProjinvoicerule() {
		return this.projinvoicerule;
	}

	public void setProjinvoicerule(String projinvoicerule) {
		this.projinvoicerule = projinvoicerule;
	}


	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
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
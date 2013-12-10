package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_bp_withholding database table.
 * 
 */
@Entity
@Table(name="c_bp_withholding")
@NamedQuery(name="CBpWithholding.findAll", query="SELECT c FROM CBpWithholding c")
public class CBpWithholding extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private CBpWithholdingPK id;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private Timestamp created;
	private BigDecimal createdby;
	private String exemptreason;
	private String isactive;
	private String ismandatorywithholding;
	private String istemporaryexempt;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CBpWithholding() {
	}


	@EmbeddedId
	public CBpWithholdingPK getId() {
		return this.id;
	}

	public void setId(CBpWithholdingPK id) {
		this.id = id;
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


	public String getExemptreason() {
		return this.exemptreason;
	}

	public void setExemptreason(String exemptreason) {
		this.exemptreason = exemptreason;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsmandatorywithholding() {
		return this.ismandatorywithholding;
	}

	public void setIsmandatorywithholding(String ismandatorywithholding) {
		this.ismandatorywithholding = ismandatorywithholding;
	}


	public String getIstemporaryexempt() {
		return this.istemporaryexempt;
	}

	public void setIstemporaryexempt(String istemporaryexempt) {
		this.istemporaryexempt = istemporaryexempt;
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
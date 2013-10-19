package com.deppon.foss.shared.business;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the c_ordertax database table.
 * 
 */
@Entity
@Table(name = "c_ordertax")
public class COrdertax extends com.deppon.foss.shared.AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private COrdertaxPK			id;
	private Long				adClientId;
	private Long				adOrgId;
	private String			created;
	private Long				createdby;
	private String				isactive;
	private String				istaxincluded;
	private String				processed;
	private BigDecimal			taxamt;
	private BigDecimal			taxbaseamt;
	private String			updated;
	private Long				updatedby;

	public COrdertax() {
	}

	@EmbeddedId
	public COrdertaxPK getId() {
		return this.id;
	}

	public void setId(COrdertaxPK id) {
		this.id = id;
	}

	@Column(name = "AD_CLIENT_ID")
	public Long getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(Long adClientId) {
		this.adClientId = adClientId;
	}

	@Column(name = "AD_ORG_ID")
	public Long getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(Long adOrgId) {
		this.adOrgId = adOrgId;
	}

	public String getCreated() {
		return this.created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Long getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
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

	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	public BigDecimal getTaxamt() {
		return this.taxamt;
	}

	public void setTaxamt(BigDecimal taxamt) {
		this.taxamt = taxamt;
	}

	public BigDecimal getTaxbaseamt() {
		return this.taxbaseamt;
	}

	public void setTaxbaseamt(BigDecimal taxbaseamt) {
		this.taxbaseamt = taxbaseamt;
	}

	public String getUpdated() {
		return this.updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public Long getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}

}
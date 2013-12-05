package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_withholding database table.
 * 
 */
@Entity
@Table(name="c_withholding")
@NamedQuery(name="CWithholding.findAll", query="SELECT c FROM CWithholding c")
public class CWithholding extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cWithholdingId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal beneficiary;
	private BigDecimal cPaymenttermId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private BigDecimal fixamt;
	private String isactive;
	private String ispaidto3party;
	private String ispercentwithholding;
	private String istaxprorated;
	private String istaxwithholding;
	private BigDecimal maxamt;
	private BigDecimal minamt;
	private String name;
	private BigDecimal percent;
	private BigDecimal thresholdmax;
	private BigDecimal thresholdmin;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CWithholding() {
	}


	@Id
	@Column(name="C_WITHHOLDING_ID")
	public long getCWithholdingId() {
		return this.cWithholdingId;
	}

	public void setCWithholdingId(long cWithholdingId) {
		this.cWithholdingId = cWithholdingId;
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


	public BigDecimal getBeneficiary() {
		return this.beneficiary;
	}

	public void setBeneficiary(BigDecimal beneficiary) {
		this.beneficiary = beneficiary;
	}


	@Column(name="C_PAYMENTTERM_ID")
	public BigDecimal getCPaymenttermId() {
		return this.cPaymenttermId;
	}

	public void setCPaymenttermId(BigDecimal cPaymenttermId) {
		this.cPaymenttermId = cPaymenttermId;
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


	public BigDecimal getFixamt() {
		return this.fixamt;
	}

	public void setFixamt(BigDecimal fixamt) {
		this.fixamt = fixamt;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIspaidto3party() {
		return this.ispaidto3party;
	}

	public void setIspaidto3party(String ispaidto3party) {
		this.ispaidto3party = ispaidto3party;
	}


	public String getIspercentwithholding() {
		return this.ispercentwithholding;
	}

	public void setIspercentwithholding(String ispercentwithholding) {
		this.ispercentwithholding = ispercentwithholding;
	}


	public String getIstaxprorated() {
		return this.istaxprorated;
	}

	public void setIstaxprorated(String istaxprorated) {
		this.istaxprorated = istaxprorated;
	}


	public String getIstaxwithholding() {
		return this.istaxwithholding;
	}

	public void setIstaxwithholding(String istaxwithholding) {
		this.istaxwithholding = istaxwithholding;
	}


	public BigDecimal getMaxamt() {
		return this.maxamt;
	}

	public void setMaxamt(BigDecimal maxamt) {
		this.maxamt = maxamt;
	}


	public BigDecimal getMinamt() {
		return this.minamt;
	}

	public void setMinamt(BigDecimal minamt) {
		this.minamt = minamt;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public BigDecimal getPercent() {
		return this.percent;
	}

	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}


	public BigDecimal getThresholdmax() {
		return this.thresholdmax;
	}

	public void setThresholdmax(BigDecimal thresholdmax) {
		this.thresholdmax = thresholdmax;
	}


	public BigDecimal getThresholdmin() {
		return this.thresholdmin;
	}

	public void setThresholdmin(BigDecimal thresholdmin) {
		this.thresholdmin = thresholdmin;
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
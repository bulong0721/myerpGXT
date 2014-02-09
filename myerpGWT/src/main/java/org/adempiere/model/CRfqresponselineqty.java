package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_rfqresponselineqty")
public class CRfqresponselineqty extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cRfqlineqtyId;
	private Integer cRfqresponselineId;
	private Integer cRfqresponselineqtyId;
	private String created;
	private Integer createdby;
	private BigDecimal discount;
	private Boolean isactive;
	private BigDecimal price;
	private Integer ranking;
	private String updated;
	private Integer updatedby;

	public CRfqresponselineqty() {
	}

	public CRfqresponselineqty(Integer cRfqresponselineqtyId) {
		this.cRfqresponselineqtyId = cRfqresponselineqtyId;
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
	@Column(name="C_RFQLINEQTY_ID", columnDefinition="INT", nullable=false)
	public Integer getCRfqlineqtyId() {
		return cRfqlineqtyId;
	}

	public void setCRfqlineqtyId(Integer cRfqlineqtyId) {
		this.cRfqlineqtyId = cRfqlineqtyId;
	}

	@Basic
	@Column(name="C_RFQRESPONSELINE_ID", columnDefinition="INT", nullable=false)
	public Integer getCRfqresponselineId() {
		return cRfqresponselineId;
	}

	public void setCRfqresponselineId(Integer cRfqresponselineId) {
		this.cRfqresponselineId = cRfqresponselineId;
	}

	@Id
	@Column(name="C_RFQRESPONSELINEQTY_ID", columnDefinition="INT")
	public Integer getCRfqresponselineqtyId() {
		return cRfqresponselineqtyId;
	}

	public void setCRfqresponselineqtyId(Integer cRfqresponselineqtyId) {
		this.cRfqresponselineqtyId = cRfqresponselineqtyId;
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
	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
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
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getRanking() {
		return ranking;
	}

	public void setRanking(Integer ranking) {
		this.ranking = ranking;
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
}
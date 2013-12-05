package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_payschedule database table.
 * 
 */
@Entity
@Table(name="c_payschedule")
@NamedQuery(name="CPayschedule.findAll", query="SELECT c FROM CPayschedule c")
public class CPayschedule extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPayscheduleId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cPaymenttermId;
	private Timestamp created;
	private BigDecimal createdby;
	private BigDecimal discount;
	private BigDecimal discountdays;
	private BigDecimal gracedays;
	private String isactive;
	private String isvalid;
	private String netday;
	private BigDecimal netdays;
	private BigDecimal percentage;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CPayschedule() {
	}


	@Id
	@Column(name="C_PAYSCHEDULE_ID")
	public long getCPayscheduleId() {
		return this.cPayscheduleId;
	}

	public void setCPayscheduleId(long cPayscheduleId) {
		this.cPayscheduleId = cPayscheduleId;
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


	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}


	public BigDecimal getDiscountdays() {
		return this.discountdays;
	}

	public void setDiscountdays(BigDecimal discountdays) {
		this.discountdays = discountdays;
	}


	public BigDecimal getGracedays() {
		return this.gracedays;
	}

	public void setGracedays(BigDecimal gracedays) {
		this.gracedays = gracedays;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}


	public String getNetday() {
		return this.netday;
	}

	public void setNetday(String netday) {
		this.netday = netday;
	}


	public BigDecimal getNetdays() {
		return this.netdays;
	}

	public void setNetdays(BigDecimal netdays) {
		this.netdays = netdays;
	}


	public BigDecimal getPercentage() {
		return this.percentage;
	}

	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
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
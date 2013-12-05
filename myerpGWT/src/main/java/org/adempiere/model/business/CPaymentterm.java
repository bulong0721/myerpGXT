package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_paymentterm database table.
 * 
 */
@Entity
@Table(name="c_paymentterm")
@NamedQuery(name="CPaymentterm.findAll", query="SELECT c FROM CPaymentterm c")
public class CPaymentterm extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPaymenttermId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private String afterdelivery;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private BigDecimal discount;
	private BigDecimal discount2;
	private BigDecimal discountdays;
	private BigDecimal discountdays2;
	private String documentnote;
	private BigDecimal fixmonthcutoff;
	private BigDecimal fixmonthday;
	private BigDecimal fixmonthoffset;
	private BigDecimal gracedays;
	private String isactive;
	private String isdefault;
	private String isduefixed;
	private String isnextbusinessday;
	private String isvalid;
	private String name;
	private String netday;
	private BigDecimal netdays;
	private String processing;
	private Timestamp updated;
	private BigDecimal updatedby;
	private String value;

	public CPaymentterm() {
	}


	@Id
	@Column(name="C_PAYMENTTERM_ID")
	public long getCPaymenttermId() {
		return this.cPaymenttermId;
	}

	public void setCPaymenttermId(long cPaymenttermId) {
		this.cPaymenttermId = cPaymenttermId;
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


	public String getAfterdelivery() {
		return this.afterdelivery;
	}

	public void setAfterdelivery(String afterdelivery) {
		this.afterdelivery = afterdelivery;
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


	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}


	public BigDecimal getDiscount2() {
		return this.discount2;
	}

	public void setDiscount2(BigDecimal discount2) {
		this.discount2 = discount2;
	}


	public BigDecimal getDiscountdays() {
		return this.discountdays;
	}

	public void setDiscountdays(BigDecimal discountdays) {
		this.discountdays = discountdays;
	}


	public BigDecimal getDiscountdays2() {
		return this.discountdays2;
	}

	public void setDiscountdays2(BigDecimal discountdays2) {
		this.discountdays2 = discountdays2;
	}


	public String getDocumentnote() {
		return this.documentnote;
	}

	public void setDocumentnote(String documentnote) {
		this.documentnote = documentnote;
	}


	public BigDecimal getFixmonthcutoff() {
		return this.fixmonthcutoff;
	}

	public void setFixmonthcutoff(BigDecimal fixmonthcutoff) {
		this.fixmonthcutoff = fixmonthcutoff;
	}


	public BigDecimal getFixmonthday() {
		return this.fixmonthday;
	}

	public void setFixmonthday(BigDecimal fixmonthday) {
		this.fixmonthday = fixmonthday;
	}


	public BigDecimal getFixmonthoffset() {
		return this.fixmonthoffset;
	}

	public void setFixmonthoffset(BigDecimal fixmonthoffset) {
		this.fixmonthoffset = fixmonthoffset;
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


	public String getIsdefault() {
		return this.isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}


	public String getIsduefixed() {
		return this.isduefixed;
	}

	public void setIsduefixed(String isduefixed) {
		this.isduefixed = isduefixed;
	}


	public String getIsnextbusinessday() {
		return this.isnextbusinessday;
	}

	public void setIsnextbusinessday(String isnextbusinessday) {
		this.isnextbusinessday = isnextbusinessday;
	}


	public String getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
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


	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
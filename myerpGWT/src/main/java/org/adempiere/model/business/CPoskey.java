package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_poskey database table.
 * 
 */
@Entity
@Table(name="c_poskey")
@NamedQuery(name="CPoskey.findAll", query="SELECT c FROM CPoskey c")
public class CPoskey extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPoskeyId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adPrintcolorId;
	private BigDecimal cPoskeylayoutId;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isactive;
	private BigDecimal mProductId;
	private String name;
	private BigDecimal qty;
	private BigDecimal seqno;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CPoskey() {
	}


	@Id
	@Column(name="C_POSKEY_ID")
	public long getCPoskeyId() {
		return this.cPoskeyId;
	}

	public void setCPoskeyId(long cPoskeyId) {
		this.cPoskeyId = cPoskeyId;
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


	@Column(name="AD_PRINTCOLOR_ID")
	public BigDecimal getAdPrintcolorId() {
		return this.adPrintcolorId;
	}

	public void setAdPrintcolorId(BigDecimal adPrintcolorId) {
		this.adPrintcolorId = adPrintcolorId;
	}


	@Column(name="C_POSKEYLAYOUT_ID")
	public BigDecimal getCPoskeylayoutId() {
		return this.cPoskeylayoutId;
	}

	public void setCPoskeylayoutId(BigDecimal cPoskeylayoutId) {
		this.cPoskeylayoutId = cPoskeylayoutId;
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
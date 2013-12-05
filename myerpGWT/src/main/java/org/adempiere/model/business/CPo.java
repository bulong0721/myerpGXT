package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_pos database table.
 * 
 */
@Entity
@Table(name="c_pos")
@NamedQuery(name="CPo.findAll", query="SELECT c FROM CPo c")
public class CPo extends org.adempiere.model.common.AdEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cPosId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal cBankaccountId;
	private BigDecimal cBpartnercashtrxId;
	private BigDecimal cCashbookId;
	private BigDecimal cDoctypeId;
	private BigDecimal cPoskeylayoutId;
	private String cashdrawer;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String help;
	private String isactive;
	private String ismodifyprice;
	private BigDecimal mPricelistId;
	private BigDecimal mWarehouseId;
	private String name;
	private String printername;
	private BigDecimal salesrepId;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CPo() {
	}


	@Id
	@Column(name="C_POS_ID")
	public long getCPosId() {
		return this.cPosId;
	}

	public void setCPosId(long cPosId) {
		this.cPosId = cPosId;
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


	@Column(name="C_BANKACCOUNT_ID")
	public BigDecimal getCBankaccountId() {
		return this.cBankaccountId;
	}

	public void setCBankaccountId(BigDecimal cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
	}


	@Column(name="C_BPARTNERCASHTRX_ID")
	public BigDecimal getCBpartnercashtrxId() {
		return this.cBpartnercashtrxId;
	}

	public void setCBpartnercashtrxId(BigDecimal cBpartnercashtrxId) {
		this.cBpartnercashtrxId = cBpartnercashtrxId;
	}


	@Column(name="C_CASHBOOK_ID")
	public BigDecimal getCCashbookId() {
		return this.cCashbookId;
	}

	public void setCCashbookId(BigDecimal cCashbookId) {
		this.cCashbookId = cCashbookId;
	}


	@Column(name="C_DOCTYPE_ID")
	public BigDecimal getCDoctypeId() {
		return this.cDoctypeId;
	}

	public void setCDoctypeId(BigDecimal cDoctypeId) {
		this.cDoctypeId = cDoctypeId;
	}


	@Column(name="C_POSKEYLAYOUT_ID")
	public BigDecimal getCPoskeylayoutId() {
		return this.cPoskeylayoutId;
	}

	public void setCPoskeylayoutId(BigDecimal cPoskeylayoutId) {
		this.cPoskeylayoutId = cPoskeylayoutId;
	}


	public String getCashdrawer() {
		return this.cashdrawer;
	}

	public void setCashdrawer(String cashdrawer) {
		this.cashdrawer = cashdrawer;
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


	public String getIsmodifyprice() {
		return this.ismodifyprice;
	}

	public void setIsmodifyprice(String ismodifyprice) {
		this.ismodifyprice = ismodifyprice;
	}


	@Column(name="M_PRICELIST_ID")
	public BigDecimal getMPricelistId() {
		return this.mPricelistId;
	}

	public void setMPricelistId(BigDecimal mPricelistId) {
		this.mPricelistId = mPricelistId;
	}


	@Column(name="M_WAREHOUSE_ID")
	public BigDecimal getMWarehouseId() {
		return this.mWarehouseId;
	}

	public void setMWarehouseId(BigDecimal mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getPrintername() {
		return this.printername;
	}

	public void setPrintername(String printername) {
		this.printername = printername;
	}


	@Column(name="SALESREP_ID")
	public BigDecimal getSalesrepId() {
		return this.salesrepId;
	}

	public void setSalesrepId(BigDecimal salesrepId) {
		this.salesrepId = salesrepId;
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
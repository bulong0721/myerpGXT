package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_pos")
public class CPOS extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cBPartnerCashTrxID;
	private Integer cBankAccountID;
	private Integer cCashBookID;
	private Integer cDocTypeID;
	private Integer cPOSID;
	private Integer cPOSKeyLayoutID;
	private String cashDrawer;
	private String created;
	private Integer createdBy;
	private String description;
	private String help;
	private Integer mPriceListID;
	private Integer mWarehouseID;
	private Boolean modifyPrice;
	private String name;
	private String printerName;
	private Integer salesRepID;
	private String updated;
	private Integer updatedBy;

	public CPOS() {
	}

	public CPOS(Integer cPOSID) {
		this.cPOSID = cPOSID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Basic
	@Column(name="AD_ORG_ID", columnDefinition="INT", nullable=false)
	public Integer getADOrgID() {
		return aDOrgID;
	}

	public void setADOrgID(Integer aDOrgID) {
		this.aDOrgID = aDOrgID;
	}

	@Basic
	@Column(name="ISACTIVE", nullable=false)
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Basic
	@Column(name="C_BPARTNERCASHTRX_ID", columnDefinition="INT")
	public Integer getCBPartnerCashTrxID() {
		return cBPartnerCashTrxID;
	}

	public void setCBPartnerCashTrxID(Integer cBPartnerCashTrxID) {
		this.cBPartnerCashTrxID = cBPartnerCashTrxID;
	}

	@Basic
	@Column(name="C_BANKACCOUNT_ID", columnDefinition="INT")
	public Integer getCBankAccountID() {
		return cBankAccountID;
	}

	public void setCBankAccountID(Integer cBankAccountID) {
		this.cBankAccountID = cBankAccountID;
	}

	@Basic
	@Column(name="C_CASHBOOK_ID", columnDefinition="INT", nullable=false)
	public Integer getCCashBookID() {
		return cCashBookID;
	}

	public void setCCashBookID(Integer cCashBookID) {
		this.cCashBookID = cCashBookID;
	}

	@Basic
	@Column(name="C_DOCTYPE_ID", columnDefinition="INT")
	public Integer getCDocTypeID() {
		return cDocTypeID;
	}

	public void setCDocTypeID(Integer cDocTypeID) {
		this.cDocTypeID = cDocTypeID;
	}

	@Id
	@Column(name="C_POS_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_995", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_POS", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_995")
	public Integer getCPOSID() {
		return cPOSID;
	}

	public void setCPOSID(Integer cPOSID) {
		this.cPOSID = cPOSID;
	}

	@Basic
	@Column(name="C_POSKEYLAYOUT_ID", columnDefinition="INT")
	public Integer getCPOSKeyLayoutID() {
		return cPOSKeyLayoutID;
	}

	public void setCPOSKeyLayoutID(Integer cPOSKeyLayoutID) {
		this.cPOSKeyLayoutID = cPOSKeyLayoutID;
	}

	@Basic
	@Column(length=120)
	public String getCashDrawer() {
		return cashDrawer;
	}

	public void setCashDrawer(String cashDrawer) {
		this.cashDrawer = cashDrawer;
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
	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Basic
	@Column(name="M_PRICELIST_ID", columnDefinition="INT", nullable=false)
	public Integer getMPriceListID() {
		return mPriceListID;
	}

	public void setMPriceListID(Integer mPriceListID) {
		this.mPriceListID = mPriceListID;
	}

	@Basic
	@Column(name="M_WAREHOUSE_ID", columnDefinition="INT", nullable=false)
	public Integer getMWarehouseID() {
		return mWarehouseID;
	}

	public void setMWarehouseID(Integer mWarehouseID) {
		this.mWarehouseID = mWarehouseID;
	}

	@Basic
	@Column(name="ISMODIFYPRICE", nullable=false)
	public Boolean isModifyPrice() {
		return modifyPrice;
	}

	public void setModifyPrice(Boolean modifyPrice) {
		this.modifyPrice = modifyPrice;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(length=60)
	public String getPrinterName() {
		return printerName;
	}

	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	@Basic
	@Column(name="SALESREP_ID", columnDefinition="INT", nullable=false)
	public Integer getSalesRepID() {
		return salesRepID;
	}

	public void setSalesRepID(Integer salesRepID) {
		this.salesRepID = salesRepID;
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
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}
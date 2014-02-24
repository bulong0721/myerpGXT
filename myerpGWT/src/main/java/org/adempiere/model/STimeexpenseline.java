package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="s_timeexpenseline")
public class STimeexpenseline extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cActivityId;
	private Integer cBpartnerId;
	private Integer cCampaignId;
	private Integer cCurrencyId;
	private Integer cInvoicelineId;
	private Integer cOrderlineId;
	private Integer cProjectId;
	private Integer cProjectphaseId;
	private Integer cProjecttaskId;
	private Integer cUomId;
	private BigDecimal convertedamt;
	private String created;
	private Integer createdby;
	private String dateexpense;
	private String description;
	private BigDecimal expenseamt;
	private BigDecimal invoiceprice;
	private Boolean isactive;
	private Boolean isinvoiced;
	private Boolean istimereport;
	private Integer line;
	private Integer mProductId;
	private String note;
	private BigDecimal priceinvoiced;
	private BigDecimal pricereimbursed;
	private Boolean processed;
	private BigDecimal qty;
	private BigDecimal qtyinvoiced;
	private BigDecimal qtyreimbursed;
	private Integer sResourceassignmentId;
	private Integer sTimeexpenseId;
	private Integer sTimeexpenselineId;
	private Integer sTimetypeId;
	private String updated;
	private Integer updatedby;

	public STimeexpenseline() {
	}

	public STimeexpenseline(Integer sTimeexpenselineId) {
		this.sTimeexpenselineId = sTimeexpenselineId;
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
	@Column(name="C_ACTIVITY_ID", columnDefinition="INT")
	public Integer getCActivityId() {
		return cActivityId;
	}

	public void setCActivityId(Integer cActivityId) {
		this.cActivityId = cActivityId;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_CAMPAIGN_ID", columnDefinition="INT")
	public Integer getCCampaignId() {
		return cCampaignId;
	}

	public void setCCampaignId(Integer cCampaignId) {
		this.cCampaignId = cCampaignId;
	}

	@Basic
	@Column(name="C_CURRENCY_ID", columnDefinition="INT")
	public Integer getCCurrencyId() {
		return cCurrencyId;
	}

	public void setCCurrencyId(Integer cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}

	@Basic
	@Column(name="C_INVOICELINE_ID", columnDefinition="INT")
	public Integer getCInvoicelineId() {
		return cInvoicelineId;
	}

	public void setCInvoicelineId(Integer cInvoicelineId) {
		this.cInvoicelineId = cInvoicelineId;
	}

	@Basic
	@Column(name="C_ORDERLINE_ID", columnDefinition="INT")
	public Integer getCOrderlineId() {
		return cOrderlineId;
	}

	public void setCOrderlineId(Integer cOrderlineId) {
		this.cOrderlineId = cOrderlineId;
	}

	@Basic
	@Column(name="C_PROJECT_ID", columnDefinition="INT")
	public Integer getCProjectId() {
		return cProjectId;
	}

	public void setCProjectId(Integer cProjectId) {
		this.cProjectId = cProjectId;
	}

	@Basic
	@Column(name="C_PROJECTPHASE_ID", columnDefinition="INT")
	public Integer getCProjectphaseId() {
		return cProjectphaseId;
	}

	public void setCProjectphaseId(Integer cProjectphaseId) {
		this.cProjectphaseId = cProjectphaseId;
	}

	@Basic
	@Column(name="C_PROJECTTASK_ID", columnDefinition="INT")
	public Integer getCProjecttaskId() {
		return cProjecttaskId;
	}

	public void setCProjecttaskId(Integer cProjecttaskId) {
		this.cProjecttaskId = cProjecttaskId;
	}

	@Basic
	@Column(name="C_UOM_ID", columnDefinition="INT")
	public Integer getCUomId() {
		return cUomId;
	}

	public void setCUomId(Integer cUomId) {
		this.cUomId = cUomId;
	}

	@Basic
	public BigDecimal getConvertedamt() {
		return convertedamt;
	}

	public void setConvertedamt(BigDecimal convertedamt) {
		this.convertedamt = convertedamt;
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
	public String getDateexpense() {
		return dateexpense;
	}

	public void setDateexpense(String dateexpense) {
		this.dateexpense = dateexpense;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	public BigDecimal getExpenseamt() {
		return expenseamt;
	}

	public void setExpenseamt(BigDecimal expenseamt) {
		this.expenseamt = expenseamt;
	}

	@Basic
	public BigDecimal getInvoiceprice() {
		return invoiceprice;
	}

	public void setInvoiceprice(BigDecimal invoiceprice) {
		this.invoiceprice = invoiceprice;
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
	public Boolean isIsinvoiced() {
		return isinvoiced;
	}

	public void setIsinvoiced(Boolean isinvoiced) {
		this.isinvoiced = isinvoiced;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIstimereport() {
		return istimereport;
	}

	public void setIstimereport(Boolean istimereport) {
		this.istimereport = istimereport;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Basic
	public BigDecimal getPriceinvoiced() {
		return priceinvoiced;
	}

	public void setPriceinvoiced(BigDecimal priceinvoiced) {
		this.priceinvoiced = priceinvoiced;
	}

	@Basic
	public BigDecimal getPricereimbursed() {
		return pricereimbursed;
	}

	public void setPricereimbursed(BigDecimal pricereimbursed) {
		this.pricereimbursed = pricereimbursed;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	@Basic
	public BigDecimal getQtyinvoiced() {
		return qtyinvoiced;
	}

	public void setQtyinvoiced(BigDecimal qtyinvoiced) {
		this.qtyinvoiced = qtyinvoiced;
	}

	@Basic
	public BigDecimal getQtyreimbursed() {
		return qtyreimbursed;
	}

	public void setQtyreimbursed(BigDecimal qtyreimbursed) {
		this.qtyreimbursed = qtyreimbursed;
	}

	@Basic
	@Column(name="S_RESOURCEASSIGNMENT_ID", columnDefinition="INT")
	public Integer getSResourceassignmentId() {
		return sResourceassignmentId;
	}

	public void setSResourceassignmentId(Integer sResourceassignmentId) {
		this.sResourceassignmentId = sResourceassignmentId;
	}

	@Basic
	@Column(name="S_TIMEEXPENSE_ID", columnDefinition="INT", nullable=false)
	public Integer getSTimeexpenseId() {
		return sTimeexpenseId;
	}

	public void setSTimeexpenseId(Integer sTimeexpenseId) {
		this.sTimeexpenseId = sTimeexpenseId;
	}

	@Id
	@Column(name="S_TIMEEXPENSELINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_560", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "S_TimeExpenseLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_560")
	public Integer getSTimeexpenselineId() {
		return sTimeexpenselineId;
	}

	public void setSTimeexpenselineId(Integer sTimeexpenselineId) {
		this.sTimeexpenselineId = sTimeexpenselineId;
	}

	@Basic
	@Column(name="S_TIMETYPE_ID", columnDefinition="INT")
	public Integer getSTimetypeId() {
		return sTimetypeId;
	}

	public void setSTimetypeId(Integer sTimetypeId) {
		this.sTimetypeId = sTimetypeId;
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
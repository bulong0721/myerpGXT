package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_edi")
public class MEDI extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cBPEDIID;
	private String created;
	private Integer createdBy;
	private String documentNo;
	private String eDIStatus;
	private Integer line;
	private Integer mEDIID;
	private Integer mProductID;
	private Integer mWarehouseID;
	private Boolean processed;
	private BigDecimal replyPrice;
	private BigDecimal replyQtyAvailable;
	private BigDecimal replyQtyConfirmed;
	private String replyReceived;
	private String replyRemarks;
	private String replyShipDate;
	private BigDecimal requestPrice;
	private BigDecimal requestQty;
	private String requestShipdate;
	private String trxReceived;
	private String trxSent;
	private String trxType;
	private String updated;
	private Integer updatedBy;

	public MEDI() {
	}

	public MEDI(Integer mEDIID) {
		this.mEDIID = mEDIID;
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
	@Column(name="C_BP_EDI_ID", columnDefinition="INT", nullable=false)
	public Integer getCBPEDIID() {
		return cBPEDIID;
	}

	public void setCBPEDIID(Integer cBPEDIID) {
		this.cBPEDIID = cBPEDIID;
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
	@Column(nullable=false, length=30)
	public String getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getEDIStatus() {
		return eDIStatus;
	}

	public void setEDIStatus(String eDIStatus) {
		this.eDIStatus = eDIStatus;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getLine() {
		return line;
	}

	public void setLine(Integer line) {
		this.line = line;
	}

	@Id
	@Column(name="M_EDI_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_304", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_EDI", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_304")
	public Integer getMEDIID() {
		return mEDIID;
	}

	public void setMEDIID(Integer mEDIID) {
		this.mEDIID = mEDIID;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
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
	@Column(nullable=false)
	public Boolean isProcessed() {
		return processed;
	}

	public void setProcessed(Boolean processed) {
		this.processed = processed;
	}

	@Basic
	@Column(name="REPLY_PRICE")
	public BigDecimal getReplyPrice() {
		return replyPrice;
	}

	public void setReplyPrice(BigDecimal replyPrice) {
		this.replyPrice = replyPrice;
	}

	@Basic
	@Column(name="REPLY_QTYAVAILABLE")
	public BigDecimal getReplyQtyAvailable() {
		return replyQtyAvailable;
	}

	public void setReplyQtyAvailable(BigDecimal replyQtyAvailable) {
		this.replyQtyAvailable = replyQtyAvailable;
	}

	@Basic
	@Column(name="REPLY_QTYCONFIRMED")
	public BigDecimal getReplyQtyConfirmed() {
		return replyQtyConfirmed;
	}

	public void setReplyQtyConfirmed(BigDecimal replyQtyConfirmed) {
		this.replyQtyConfirmed = replyQtyConfirmed;
	}

	@Basic
	@Column(name="REPLY_RECEIVED")
	public String getReplyReceived() {
		return replyReceived;
	}

	public void setReplyReceived(String replyReceived) {
		this.replyReceived = replyReceived;
	}

	@Basic
	@Column(name="REPLY_REMARKS", length=2000)
	public String getReplyRemarks() {
		return replyRemarks;
	}

	public void setReplyRemarks(String replyRemarks) {
		this.replyRemarks = replyRemarks;
	}

	@Basic
	@Column(name="REPLY_SHIPDATE")
	public String getReplyShipDate() {
		return replyShipDate;
	}

	public void setReplyShipDate(String replyShipDate) {
		this.replyShipDate = replyShipDate;
	}

	@Basic
	@Column(name="REQUEST_PRICE")
	public BigDecimal getRequestPrice() {
		return requestPrice;
	}

	public void setRequestPrice(BigDecimal requestPrice) {
		this.requestPrice = requestPrice;
	}

	@Basic
	@Column(name="REQUEST_QTY", nullable=false)
	public BigDecimal getRequestQty() {
		return requestQty;
	}

	public void setRequestQty(BigDecimal requestQty) {
		this.requestQty = requestQty;
	}

	@Basic
	@Column(name="REQUEST_SHIPDATE", nullable=false)
	public String getRequestShipdate() {
		return requestShipdate;
	}

	public void setRequestShipdate(String requestShipdate) {
		this.requestShipdate = requestShipdate;
	}

	@Basic
	public String getTrxReceived() {
		return trxReceived;
	}

	public void setTrxReceived(String trxReceived) {
		this.trxReceived = trxReceived;
	}

	@Basic
	@Column(nullable=false)
	public String getTrxSent() {
		return trxSent;
	}

	public void setTrxSent(String trxSent) {
		this.trxSent = trxSent;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getTrxType() {
		return trxType;
	}

	public void setTrxType(String trxType) {
		this.trxType = trxType;
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
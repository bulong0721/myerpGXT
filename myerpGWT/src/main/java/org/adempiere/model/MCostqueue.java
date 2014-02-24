package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_costqueue")
public class MCostqueue extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cAcctschemaId;
	private String created;
	private Integer createdby;
	private BigDecimal currentcostprice;
	private BigDecimal currentqty;
	private Boolean isactive;
	private Integer mAttributesetinstanceId;
	private Integer mCostelementId;
	private Integer mCostqueueId;
	private Integer mCosttypeId;
	private Integer mProductId;
	private String updated;
	private Integer updatedby;

	public MCostqueue() {
	}

	public MCostqueue(Integer mCostqueueId) {
		this.mCostqueueId = mCostqueueId;
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
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT", nullable=false)
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
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
	@Column(nullable=false)
	public BigDecimal getCurrentcostprice() {
		return currentcostprice;
	}

	public void setCurrentcostprice(BigDecimal currentcostprice) {
		this.currentcostprice = currentcostprice;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getCurrentqty() {
		return currentqty;
	}

	public void setCurrentqty(BigDecimal currentqty) {
		this.currentqty = currentqty;
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
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT", nullable=false)
	public Integer getMAttributesetinstanceId() {
		return mAttributesetinstanceId;
	}

	public void setMAttributesetinstanceId(Integer mAttributesetinstanceId) {
		this.mAttributesetinstanceId = mAttributesetinstanceId;
	}

	@Basic
	@Column(name="M_COSTELEMENT_ID", columnDefinition="INT", nullable=false)
	public Integer getMCostelementId() {
		return mCostelementId;
	}

	public void setMCostelementId(Integer mCostelementId) {
		this.mCostelementId = mCostelementId;
	}

	@Id
	@Column(name="M_COSTQUEUE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1178", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_CostQueue", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1178")
	public Integer getMCostqueueId() {
		return mCostqueueId;
	}

	public void setMCostqueueId(Integer mCostqueueId) {
		this.mCostqueueId = mCostqueueId;
	}

	@Basic
	@Column(name="M_COSTTYPE_ID", columnDefinition="INT", nullable=false)
	public Integer getMCosttypeId() {
		return mCosttypeId;
	}

	public void setMCosttypeId(Integer mCosttypeId) {
		this.mCosttypeId = mCosttypeId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
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
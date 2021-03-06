package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="pp_wf_node_product")
public class PPWFNodeProduct extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDWFNodeID;
	private Boolean active;
	private String configurationLevel;
	private String created;
	private Integer createdBy;
	private String entityType;
	private Integer mProductID;
	private Integer pPWFNodeProductID;
	private BigDecimal qty;
	private Integer seqNo;
	private Boolean subcontracting;
	private String updated;
	private Integer updatedBy;
	private Integer yield;

	public PPWFNodeProduct() {
	}

	public PPWFNodeProduct(Integer pPWFNodeProductID) {
		this.pPWFNodeProductID = pPWFNodeProductID;
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
	@Column(name="AD_WF_NODE_ID", columnDefinition="INT", nullable=false)
	public Integer getADWFNodeID() {
		return aDWFNodeID;
	}

	public void setADWFNodeID(Integer aDWFNodeID) {
		this.aDWFNodeID = aDWFNodeID;
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
	@Column(length=1)
	public String getConfigurationLevel() {
		return configurationLevel;
	}

	public void setConfigurationLevel(String configurationLevel) {
		this.configurationLevel = configurationLevel;
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
	@Column(nullable=false, length=40)
	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
	}

	@Id
	@Column(name="PP_WF_NODE_PRODUCT_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53013", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "PP_WF_Node_Product", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53013")
	public Integer getPPWFNodeProductID() {
		return pPWFNodeProductID;
	}

	public void setPPWFNodeProductID(Integer pPWFNodeProductID) {
		this.pPWFNodeProductID = pPWFNodeProductID;
	}

	@Basic
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	@Basic
	@Column(name="ISSUBCONTRACTING")
	public Boolean isSubcontracting() {
		return subcontracting;
	}

	public void setSubcontracting(Boolean subcontracting) {
		this.subcontracting = subcontracting;
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

	@Basic
	@Column(columnDefinition="INT")
	public Integer getYield() {
		return yield;
	}

	public void setYield(Integer yield) {
		this.yield = yield;
	}
}
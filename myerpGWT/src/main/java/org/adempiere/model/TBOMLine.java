package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="t_bomline")
public class TBOMLine extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDPInstanceID;
	private String active;
	private Integer cAcctSchemaID;
	private String cost;
	private String costFrozen;
	private BigDecimal costStandard;
	private String costingMethod;
	private String created;
	private Integer createdBy;
	private BigDecimal currentCostPrice;
	private BigDecimal currentCostPriceLL;
	private BigDecimal futureCostPrice;
	private BigDecimal futureCostPriceLL;
	private String implosion;
	private Integer levelNo;
	private String levels;
	private Integer mCostElementID;
	private Integer mCostTypeID;
	private Integer mProductID;
	private Integer pPProductBOMID;
	private Integer pPProductBOMLineID;
	private BigDecimal qtyBOM;
	private Integer selProductID;
	private Integer seqNo;
	private Integer tBOMLineID;
	private String updated;
	private Integer updatedBy;

	public TBOMLine() {
	}

	public TBOMLine(Integer tBOMLineID) {
		this.tBOMLineID = tBOMLineID;
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
	@Column(name="AD_PINSTANCE_ID", columnDefinition="INT")
	public Integer getADPInstanceID() {
		return aDPInstanceID;
	}

	public void setADPInstanceID(Integer aDPInstanceID) {
		this.aDPInstanceID = aDPInstanceID;
	}

	@Basic
	@Column(name="ISACTIVE", length=1)
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	@Basic
	@Column(name="C_ACCTSCHEMA_ID", columnDefinition="INT")
	public Integer getCAcctSchemaID() {
		return cAcctSchemaID;
	}

	public void setCAcctSchemaID(Integer cAcctSchemaID) {
		this.cAcctSchemaID = cAcctSchemaID;
	}

	@Basic
	@Column(length=22)
	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Basic
	@Column(name="ISCOSTFROZEN", length=1)
	public String getCostFrozen() {
		return costFrozen;
	}

	public void setCostFrozen(String costFrozen) {
		this.costFrozen = costFrozen;
	}

	@Basic
	public BigDecimal getCostStandard() {
		return costStandard;
	}

	public void setCostStandard(BigDecimal costStandard) {
		this.costStandard = costStandard;
	}

	@Basic
	@Column(length=1)
	public String getCostingMethod() {
		return costingMethod;
	}

	public void setCostingMethod(String costingMethod) {
		this.costingMethod = costingMethod;
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
	public BigDecimal getCurrentCostPrice() {
		return currentCostPrice;
	}

	public void setCurrentCostPrice(BigDecimal currentCostPrice) {
		this.currentCostPrice = currentCostPrice;
	}

	@Basic
	public BigDecimal getCurrentCostPriceLL() {
		return currentCostPriceLL;
	}

	public void setCurrentCostPriceLL(BigDecimal currentCostPriceLL) {
		this.currentCostPriceLL = currentCostPriceLL;
	}

	@Basic
	public BigDecimal getFutureCostPrice() {
		return futureCostPrice;
	}

	public void setFutureCostPrice(BigDecimal futureCostPrice) {
		this.futureCostPrice = futureCostPrice;
	}

	@Basic
	public BigDecimal getFutureCostPriceLL() {
		return futureCostPriceLL;
	}

	public void setFutureCostPriceLL(BigDecimal futureCostPriceLL) {
		this.futureCostPriceLL = futureCostPriceLL;
	}

	@Basic
	@Column(length=1)
	public String getImplosion() {
		return implosion;
	}

	public void setImplosion(String implosion) {
		this.implosion = implosion;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getLevelNo() {
		return levelNo;
	}

	public void setLevelNo(Integer levelNo) {
		this.levelNo = levelNo;
	}

	@Basic
	@Column(length=250)
	public String getLevels() {
		return levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

	@Basic
	@Column(name="M_COSTELEMENT_ID", columnDefinition="INT")
	public Integer getMCostElementID() {
		return mCostElementID;
	}

	public void setMCostElementID(Integer mCostElementID) {
		this.mCostElementID = mCostElementID;
	}

	@Basic
	@Column(name="M_COSTTYPE_ID", columnDefinition="INT")
	public Integer getMCostTypeID() {
		return mCostTypeID;
	}

	public void setMCostTypeID(Integer mCostTypeID) {
		this.mCostTypeID = mCostTypeID;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
	}

	@Basic
	@Column(name="PP_PRODUCT_BOM_ID", columnDefinition="INT")
	public Integer getPPProductBOMID() {
		return pPProductBOMID;
	}

	public void setPPProductBOMID(Integer pPProductBOMID) {
		this.pPProductBOMID = pPProductBOMID;
	}

	@Basic
	@Column(name="PP_PRODUCT_BOMLINE_ID", columnDefinition="INT")
	public Integer getPPProductBOMLineID() {
		return pPProductBOMLineID;
	}

	public void setPPProductBOMLineID(Integer pPProductBOMLineID) {
		this.pPProductBOMLineID = pPProductBOMLineID;
	}

	@Basic
	public BigDecimal getQtyBOM() {
		return qtyBOM;
	}

	public void setQtyBOM(BigDecimal qtyBOM) {
		this.qtyBOM = qtyBOM;
	}

	@Basic
	@Column(name="SEL_PRODUCT_ID", columnDefinition="INT", nullable=false)
	public Integer getSelProductID() {
		return selProductID;
	}

	public void setSelProductID(Integer selProductID) {
		this.selProductID = selProductID;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	@Id
	@Column(name="T_BOMLINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_53042", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "T_BOMLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_53042")
	public Integer getTBOMLineID() {
		return tBOMLineID;
	}

	public void setTBOMLineID(Integer tBOMLineID) {
		this.tBOMLineID = tBOMLineID;
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
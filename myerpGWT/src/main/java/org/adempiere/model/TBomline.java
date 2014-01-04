package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="t_bomline")
public class TBomline extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adPinstanceId;
	private Integer cAcctschemaId;
	private String cost;
	private String costingmethod;
	private BigDecimal coststandard;
	private String created;
	private Integer createdby;
	private BigDecimal currentcostprice;
	private BigDecimal currentcostpricell;
	private BigDecimal futurecostprice;
	private BigDecimal futurecostpricell;
	private String implosion;
	private String isactive;
	private String iscostfrozen;
	private Integer levelno;
	private String levels;
	private Integer mCostelementId;
	private Integer mCosttypeId;
	private Integer mProductId;
	private Integer ppProductBomId;
	private Integer ppProductBomlineId;
	private BigDecimal qtybom;
	private Integer selProductId;
	private Integer seqno;
	private Integer tBomlineId;
	private String updated;
	private Integer updatedby;

	public TBomline() {
	}

	public TBomline(Integer tBomlineId) {
		this.tBomlineId = tBomlineId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
	}

	@Basic
	@Column(name="AD_PINSTANCE_ID")
	public Integer getAdPinstanceId() {
		return adPinstanceId;
	}

	public void setAdPinstanceId(Integer adPinstanceId) {
		this.adPinstanceId = adPinstanceId;
	}

	@Basic
	@Column(name="C_ACCTSCHEMA_ID")
	public Integer getCAcctschemaId() {
		return cAcctschemaId;
	}

	public void setCAcctschemaId(Integer cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
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
	@Column(length=1)
	public String getCostingmethod() {
		return costingmethod;
	}

	public void setCostingmethod(String costingmethod) {
		this.costingmethod = costingmethod;
	}

	@Basic
	public BigDecimal getCoststandard() {
		return coststandard;
	}

	public void setCoststandard(BigDecimal coststandard) {
		this.coststandard = coststandard;
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	public BigDecimal getCurrentcostprice() {
		return currentcostprice;
	}

	public void setCurrentcostprice(BigDecimal currentcostprice) {
		this.currentcostprice = currentcostprice;
	}

	@Basic
	public BigDecimal getCurrentcostpricell() {
		return currentcostpricell;
	}

	public void setCurrentcostpricell(BigDecimal currentcostpricell) {
		this.currentcostpricell = currentcostpricell;
	}

	@Basic
	public BigDecimal getFuturecostprice() {
		return futurecostprice;
	}

	public void setFuturecostprice(BigDecimal futurecostprice) {
		this.futurecostprice = futurecostprice;
	}

	@Basic
	public BigDecimal getFuturecostpricell() {
		return futurecostpricell;
	}

	public void setFuturecostpricell(BigDecimal futurecostpricell) {
		this.futurecostpricell = futurecostpricell;
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
	@Column(length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(length=1)
	public String getIscostfrozen() {
		return iscostfrozen;
	}

	public void setIscostfrozen(String iscostfrozen) {
		this.iscostfrozen = iscostfrozen;
	}

	@Basic
	public Integer getLevelno() {
		return levelno;
	}

	public void setLevelno(Integer levelno) {
		this.levelno = levelno;
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
	@Column(name="M_COSTELEMENT_ID")
	public Integer getMCostelementId() {
		return mCostelementId;
	}

	public void setMCostelementId(Integer mCostelementId) {
		this.mCostelementId = mCostelementId;
	}

	@Basic
	@Column(name="M_COSTTYPE_ID")
	public Integer getMCosttypeId() {
		return mCosttypeId;
	}

	public void setMCosttypeId(Integer mCosttypeId) {
		this.mCosttypeId = mCosttypeId;
	}

	@Basic
	@Column(name="M_PRODUCT_ID")
	public Integer getMProductId() {
		return mProductId;
	}

	public void setMProductId(Integer mProductId) {
		this.mProductId = mProductId;
	}

	@Basic
	@Column(name="PP_PRODUCT_BOM_ID")
	public Integer getPpProductBomId() {
		return ppProductBomId;
	}

	public void setPpProductBomId(Integer ppProductBomId) {
		this.ppProductBomId = ppProductBomId;
	}

	@Basic
	@Column(name="PP_PRODUCT_BOMLINE_ID")
	public Integer getPpProductBomlineId() {
		return ppProductBomlineId;
	}

	public void setPpProductBomlineId(Integer ppProductBomlineId) {
		this.ppProductBomlineId = ppProductBomlineId;
	}

	@Basic
	public BigDecimal getQtybom() {
		return qtybom;
	}

	public void setQtybom(BigDecimal qtybom) {
		this.qtybom = qtybom;
	}

	@Basic
	@Column(name="SEL_PRODUCT_ID", nullable=false)
	public Integer getSelProductId() {
		return selProductId;
	}

	public void setSelProductId(Integer selProductId) {
		this.selProductId = selProductId;
	}

	@Basic
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	@Id
	@Column(name="T_BOMLINE_ID")
	public Integer getTBomlineId() {
		return tBomlineId;
	}

	public void setTBomlineId(Integer tBomlineId) {
		this.tBomlineId = tBomlineId;
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}
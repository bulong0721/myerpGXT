package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_discountschemaline")
public class MDiscountschemaline extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cBpartnerId;
	private Integer cConversiontypeId;
	private String classification;
	private String conversiondate;
	private String created;
	private Integer createdby;
	private String group1;
	private String group2;
	private Boolean isactive;
	private BigDecimal limitAddamt;
	private String limitBase;
	private BigDecimal limitDiscount;
	private BigDecimal limitFixed;
	private BigDecimal limitMaxamt;
	private BigDecimal limitMinamt;
	private String limitRounding;
	private BigDecimal listAddamt;
	private String listBase;
	private BigDecimal listDiscount;
	private BigDecimal listFixed;
	private BigDecimal listMaxamt;
	private BigDecimal listMinamt;
	private String listRounding;
	private Integer mDiscountschemaId;
	private Integer mDiscountschemalineId;
	private Integer mProductCategoryId;
	private Integer mProductId;
	private Integer seqno;
	private BigDecimal stdAddamt;
	private String stdBase;
	private BigDecimal stdDiscount;
	private BigDecimal stdFixed;
	private BigDecimal stdMaxamt;
	private BigDecimal stdMinamt;
	private String stdRounding;
	private String updated;
	private Integer updatedby;

	public MDiscountschemaline() {
	}

	public MDiscountschemaline(Integer mDiscountschemalineId) {
		this.mDiscountschemalineId = mDiscountschemalineId;
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
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBpartnerId() {
		return cBpartnerId;
	}

	public void setCBpartnerId(Integer cBpartnerId) {
		this.cBpartnerId = cBpartnerId;
	}

	@Basic
	@Column(name="C_CONVERSIONTYPE_ID", columnDefinition="INT", nullable=false)
	public Integer getCConversiontypeId() {
		return cConversiontypeId;
	}

	public void setCConversiontypeId(Integer cConversiontypeId) {
		this.cConversiontypeId = cConversiontypeId;
	}

	@Basic
	@Column(length=12)
	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	@Basic
	@Column(nullable=false)
	public String getConversiondate() {
		return conversiondate;
	}

	public void setConversiondate(String conversiondate) {
		this.conversiondate = conversiondate;
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
	public String getGroup1() {
		return group1;
	}

	public void setGroup1(String group1) {
		this.group1 = group1;
	}

	@Basic
	public String getGroup2() {
		return group2;
	}

	public void setGroup2(String group2) {
		this.group2 = group2;
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
	@Column(name="LIMIT_ADDAMT", nullable=false)
	public BigDecimal getLimitAddamt() {
		return limitAddamt;
	}

	public void setLimitAddamt(BigDecimal limitAddamt) {
		this.limitAddamt = limitAddamt;
	}

	@Basic
	@Column(name="LIMIT_BASE", nullable=false, length=1)
	public String getLimitBase() {
		return limitBase;
	}

	public void setLimitBase(String limitBase) {
		this.limitBase = limitBase;
	}

	@Basic
	@Column(name="LIMIT_DISCOUNT", nullable=false)
	public BigDecimal getLimitDiscount() {
		return limitDiscount;
	}

	public void setLimitDiscount(BigDecimal limitDiscount) {
		this.limitDiscount = limitDiscount;
	}

	@Basic
	@Column(name="LIMIT_FIXED")
	public BigDecimal getLimitFixed() {
		return limitFixed;
	}

	public void setLimitFixed(BigDecimal limitFixed) {
		this.limitFixed = limitFixed;
	}

	@Basic
	@Column(name="LIMIT_MAXAMT", nullable=false)
	public BigDecimal getLimitMaxamt() {
		return limitMaxamt;
	}

	public void setLimitMaxamt(BigDecimal limitMaxamt) {
		this.limitMaxamt = limitMaxamt;
	}

	@Basic
	@Column(name="LIMIT_MINAMT", nullable=false)
	public BigDecimal getLimitMinamt() {
		return limitMinamt;
	}

	public void setLimitMinamt(BigDecimal limitMinamt) {
		this.limitMinamt = limitMinamt;
	}

	@Basic
	@Column(name="LIMIT_ROUNDING", nullable=false, length=1)
	public String getLimitRounding() {
		return limitRounding;
	}

	public void setLimitRounding(String limitRounding) {
		this.limitRounding = limitRounding;
	}

	@Basic
	@Column(name="LIST_ADDAMT", nullable=false)
	public BigDecimal getListAddamt() {
		return listAddamt;
	}

	public void setListAddamt(BigDecimal listAddamt) {
		this.listAddamt = listAddamt;
	}

	@Basic
	@Column(name="LIST_BASE", nullable=false, length=1)
	public String getListBase() {
		return listBase;
	}

	public void setListBase(String listBase) {
		this.listBase = listBase;
	}

	@Basic
	@Column(name="LIST_DISCOUNT", nullable=false)
	public BigDecimal getListDiscount() {
		return listDiscount;
	}

	public void setListDiscount(BigDecimal listDiscount) {
		this.listDiscount = listDiscount;
	}

	@Basic
	@Column(name="LIST_FIXED")
	public BigDecimal getListFixed() {
		return listFixed;
	}

	public void setListFixed(BigDecimal listFixed) {
		this.listFixed = listFixed;
	}

	@Basic
	@Column(name="LIST_MAXAMT", nullable=false)
	public BigDecimal getListMaxamt() {
		return listMaxamt;
	}

	public void setListMaxamt(BigDecimal listMaxamt) {
		this.listMaxamt = listMaxamt;
	}

	@Basic
	@Column(name="LIST_MINAMT", nullable=false)
	public BigDecimal getListMinamt() {
		return listMinamt;
	}

	public void setListMinamt(BigDecimal listMinamt) {
		this.listMinamt = listMinamt;
	}

	@Basic
	@Column(name="LIST_ROUNDING", nullable=false, length=1)
	public String getListRounding() {
		return listRounding;
	}

	public void setListRounding(String listRounding) {
		this.listRounding = listRounding;
	}

	@Basic
	@Column(name="M_DISCOUNTSCHEMA_ID", columnDefinition="INT", nullable=false)
	public Integer getMDiscountschemaId() {
		return mDiscountschemaId;
	}

	public void setMDiscountschemaId(Integer mDiscountschemaId) {
		this.mDiscountschemaId = mDiscountschemaId;
	}

	@Id
	@Column(name="M_DISCOUNTSCHEMALINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_531", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_DiscountSchemaLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_531")
	public Integer getMDiscountschemalineId() {
		return mDiscountschemalineId;
	}

	public void setMDiscountschemalineId(Integer mDiscountschemalineId) {
		this.mDiscountschemalineId = mDiscountschemalineId;
	}

	@Basic
	@Column(name="M_PRODUCT_CATEGORY_ID", columnDefinition="INT")
	public Integer getMProductCategoryId() {
		return mProductCategoryId;
	}

	public void setMProductCategoryId(Integer mProductCategoryId) {
		this.mProductCategoryId = mProductCategoryId;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	@Basic
	@Column(name="STD_ADDAMT", nullable=false)
	public BigDecimal getStdAddamt() {
		return stdAddamt;
	}

	public void setStdAddamt(BigDecimal stdAddamt) {
		this.stdAddamt = stdAddamt;
	}

	@Basic
	@Column(name="STD_BASE", nullable=false, length=1)
	public String getStdBase() {
		return stdBase;
	}

	public void setStdBase(String stdBase) {
		this.stdBase = stdBase;
	}

	@Basic
	@Column(name="STD_DISCOUNT", nullable=false)
	public BigDecimal getStdDiscount() {
		return stdDiscount;
	}

	public void setStdDiscount(BigDecimal stdDiscount) {
		this.stdDiscount = stdDiscount;
	}

	@Basic
	@Column(name="STD_FIXED")
	public BigDecimal getStdFixed() {
		return stdFixed;
	}

	public void setStdFixed(BigDecimal stdFixed) {
		this.stdFixed = stdFixed;
	}

	@Basic
	@Column(name="STD_MAXAMT", nullable=false)
	public BigDecimal getStdMaxamt() {
		return stdMaxamt;
	}

	public void setStdMaxamt(BigDecimal stdMaxamt) {
		this.stdMaxamt = stdMaxamt;
	}

	@Basic
	@Column(name="STD_MINAMT", nullable=false)
	public BigDecimal getStdMinamt() {
		return stdMinamt;
	}

	public void setStdMinamt(BigDecimal stdMinamt) {
		this.stdMinamt = stdMinamt;
	}

	@Basic
	@Column(name="STD_ROUNDING", nullable=false, length=1)
	public String getStdRounding() {
		return stdRounding;
	}

	public void setStdRounding(String stdRounding) {
		this.stdRounding = stdRounding;
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
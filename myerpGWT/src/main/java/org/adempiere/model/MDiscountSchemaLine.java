package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_discountschemaline")
public class MDiscountSchemaLine extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cBPartnerID;
	private Integer cConversionTypeID;
	private String classification;
	private String conversionDate;
	private String created;
	private Integer createdBy;
	private String group1;
	private String group2;
	private BigDecimal limitAddAmt;
	private String limitBase;
	private BigDecimal limitDiscount;
	private BigDecimal limitFixed;
	private BigDecimal limitMaxAmt;
	private BigDecimal limitMinAmt;
	private String limitRounding;
	private BigDecimal listAddAmt;
	private String listBase;
	private BigDecimal listDiscount;
	private BigDecimal listFixed;
	private BigDecimal listMaxAmt;
	private BigDecimal listMinAmt;
	private String listRounding;
	private Integer mDiscountSchemaID;
	private Integer mDiscountSchemaLineID;
	private Integer mProductCategoryID;
	private Integer mProductID;
	private Integer seqNo;
	private BigDecimal stdAddAmt;
	private String stdBase;
	private BigDecimal stdDiscount;
	private BigDecimal stdFixed;
	private BigDecimal stdMaxAmt;
	private BigDecimal stdMinAmt;
	private String stdRounding;
	private String updated;
	private Integer updatedBy;

	public MDiscountSchemaLine() {
	}

	public MDiscountSchemaLine(Integer mDiscountSchemaLineID) {
		this.mDiscountSchemaLineID = mDiscountSchemaLineID;
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
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
	}

	@Basic
	@Column(name="C_CONVERSIONTYPE_ID", columnDefinition="INT", nullable=false)
	public Integer getCConversionTypeID() {
		return cConversionTypeID;
	}

	public void setCConversionTypeID(Integer cConversionTypeID) {
		this.cConversionTypeID = cConversionTypeID;
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
	public String getConversionDate() {
		return conversionDate;
	}

	public void setConversionDate(String conversionDate) {
		this.conversionDate = conversionDate;
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
	@Column(name="LIMIT_ADDAMT", nullable=false)
	public BigDecimal getLimitAddAmt() {
		return limitAddAmt;
	}

	public void setLimitAddAmt(BigDecimal limitAddAmt) {
		this.limitAddAmt = limitAddAmt;
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
	public BigDecimal getLimitMaxAmt() {
		return limitMaxAmt;
	}

	public void setLimitMaxAmt(BigDecimal limitMaxAmt) {
		this.limitMaxAmt = limitMaxAmt;
	}

	@Basic
	@Column(name="LIMIT_MINAMT", nullable=false)
	public BigDecimal getLimitMinAmt() {
		return limitMinAmt;
	}

	public void setLimitMinAmt(BigDecimal limitMinAmt) {
		this.limitMinAmt = limitMinAmt;
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
	public BigDecimal getListAddAmt() {
		return listAddAmt;
	}

	public void setListAddAmt(BigDecimal listAddAmt) {
		this.listAddAmt = listAddAmt;
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
	public BigDecimal getListMaxAmt() {
		return listMaxAmt;
	}

	public void setListMaxAmt(BigDecimal listMaxAmt) {
		this.listMaxAmt = listMaxAmt;
	}

	@Basic
	@Column(name="LIST_MINAMT", nullable=false)
	public BigDecimal getListMinAmt() {
		return listMinAmt;
	}

	public void setListMinAmt(BigDecimal listMinAmt) {
		this.listMinAmt = listMinAmt;
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
	public Integer getMDiscountSchemaID() {
		return mDiscountSchemaID;
	}

	public void setMDiscountSchemaID(Integer mDiscountSchemaID) {
		this.mDiscountSchemaID = mDiscountSchemaID;
	}

	@Id
	@Column(name="M_DISCOUNTSCHEMALINE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_531", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_DiscountSchemaLine", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_531")
	public Integer getMDiscountSchemaLineID() {
		return mDiscountSchemaLineID;
	}

	public void setMDiscountSchemaLineID(Integer mDiscountSchemaLineID) {
		this.mDiscountSchemaLineID = mDiscountSchemaLineID;
	}

	@Basic
	@Column(name="M_PRODUCT_CATEGORY_ID", columnDefinition="INT")
	public Integer getMProductCategoryID() {
		return mProductCategoryID;
	}

	public void setMProductCategoryID(Integer mProductCategoryID) {
		this.mProductCategoryID = mProductCategoryID;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	@Basic
	@Column(name="STD_ADDAMT", nullable=false)
	public BigDecimal getStdAddAmt() {
		return stdAddAmt;
	}

	public void setStdAddAmt(BigDecimal stdAddAmt) {
		this.stdAddAmt = stdAddAmt;
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
	public BigDecimal getStdMaxAmt() {
		return stdMaxAmt;
	}

	public void setStdMaxAmt(BigDecimal stdMaxAmt) {
		this.stdMaxAmt = stdMaxAmt;
	}

	@Basic
	@Column(name="STD_MINAMT", nullable=false)
	public BigDecimal getStdMinAmt() {
		return stdMinAmt;
	}

	public void setStdMinAmt(BigDecimal stdMinAmt) {
		this.stdMinAmt = stdMinAmt;
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
	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
}
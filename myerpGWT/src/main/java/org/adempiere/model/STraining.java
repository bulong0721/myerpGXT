package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="s_training")
public class STraining extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cTaxcategoryId;
	private Integer cUomId;
	private String created;
	private Integer createdby;
	private String description;
	private String descriptionurl;
	private String documentnote;
	private String help;
	private String imageurl;
	private Boolean isactive;
	private Integer mProductCategoryId;
	private String name;
	private Boolean processing;
	private Integer sTrainingId;
	private String updated;
	private Integer updatedby;

	public STraining() {
	}

	public STraining(Integer sTrainingId) {
		this.sTrainingId = sTrainingId;
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
	@Column(name="C_TAXCATEGORY_ID", columnDefinition="INT", nullable=false)
	public Integer getCTaxcategoryId() {
		return cTaxcategoryId;
	}

	public void setCTaxcategoryId(Integer cTaxcategoryId) {
		this.cTaxcategoryId = cTaxcategoryId;
	}

	@Basic
	@Column(name="C_UOM_ID", columnDefinition="INT", nullable=false)
	public Integer getCUomId() {
		return cUomId;
	}

	public void setCUomId(Integer cUomId) {
		this.cUomId = cUomId;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=120)
	public String getDescriptionurl() {
		return descriptionurl;
	}

	public void setDescriptionurl(String descriptionurl) {
		this.descriptionurl = descriptionurl;
	}

	@Basic
	@Column(length=2000)
	public String getDocumentnote() {
		return documentnote;
	}

	public void setDocumentnote(String documentnote) {
		this.documentnote = documentnote;
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
	@Column(length=120)
	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
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
	@Column(name="M_PRODUCT_CATEGORY_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductCategoryId() {
		return mProductCategoryId;
	}

	public void setMProductCategoryId(Integer mProductCategoryId) {
		this.mProductCategoryId = mProductCategoryId;
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
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Id
	@Column(name="S_TRAINING_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_638", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "S_Training", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_638")
	public Integer getSTrainingId() {
		return sTrainingId;
	}

	public void setSTrainingId(Integer sTrainingId) {
		this.sTrainingId = sTrainingId;
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
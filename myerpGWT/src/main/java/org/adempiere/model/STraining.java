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
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cTaxCategoryID;
	private Integer cUOMID;
	private String created;
	private Integer createdBy;
	private String description;
	private String descriptionURL;
	private String documentNote;
	private String help;
	private String imageURL;
	private Integer mProductCategoryID;
	private String name;
	private Boolean processing;
	private Integer sTrainingID;
	private String updated;
	private Integer updatedBy;

	public STraining() {
	}

	public STraining(Integer sTrainingID) {
		this.sTrainingID = sTrainingID;
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
	@Column(name="C_TAXCATEGORY_ID", columnDefinition="INT", nullable=false)
	public Integer getCTaxCategoryID() {
		return cTaxCategoryID;
	}

	public void setCTaxCategoryID(Integer cTaxCategoryID) {
		this.cTaxCategoryID = cTaxCategoryID;
	}

	@Basic
	@Column(name="C_UOM_ID", columnDefinition="INT", nullable=false)
	public Integer getCUOMID() {
		return cUOMID;
	}

	public void setCUOMID(Integer cUOMID) {
		this.cUOMID = cUOMID;
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
	@Column(length=120)
	public String getDescriptionURL() {
		return descriptionURL;
	}

	public void setDescriptionURL(String descriptionURL) {
		this.descriptionURL = descriptionURL;
	}

	@Basic
	@Column(length=2000)
	public String getDocumentNote() {
		return documentNote;
	}

	public void setDocumentNote(String documentNote) {
		this.documentNote = documentNote;
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
	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@Basic
	@Column(name="M_PRODUCT_CATEGORY_ID", columnDefinition="INT", nullable=false)
	public Integer getMProductCategoryID() {
		return mProductCategoryID;
	}

	public void setMProductCategoryID(Integer mProductCategoryID) {
		this.mProductCategoryID = mProductCategoryID;
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
	public Integer getSTrainingID() {
		return sTrainingID;
	}

	public void setSTrainingID(Integer sTrainingID) {
		this.sTrainingID = sTrainingID;
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
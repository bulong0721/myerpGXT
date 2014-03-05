package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="r_mailtext_trl")
@IdClass(org.adempiere.model.RMailTextTrlPK.class)
public class RMailTextTrl extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private String aDLanguage;
	private Integer aDOrgID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String mailHeader;
	private String mailText;
	private String mailText2;
	private String mailText3;
	private String name;
	private Integer rMailTextID;
	private Boolean translated;
	private String updated;
	private Integer updatedBy;

	public RMailTextTrl() {
	}

	public RMailTextTrl(String aDLanguage, Integer rMailTextID) {
		this.aDLanguage = aDLanguage;
		this.rMailTextID = rMailTextID;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", columnDefinition="INT", nullable=false)
	public Integer getADClientID() {
		return aDClientID;
	}

	public void setADClientID(Integer aDClientID) {
		this.aDClientID = aDClientID;
	}

	@Id
	@Column(name="AD_LANGUAGE", length=6)
	public String getADLanguage() {
		return aDLanguage;
	}

	public void setADLanguage(String aDLanguage) {
		this.aDLanguage = aDLanguage;
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
	@Column(length=2000)
	public String getMailHeader() {
		return mailHeader;
	}

	public void setMailHeader(String mailHeader) {
		this.mailHeader = mailHeader;
	}

	@Basic
	@Column(nullable=false, length=2000)
	public String getMailText() {
		return mailText;
	}

	public void setMailText(String mailText) {
		this.mailText = mailText;
	}

	@Basic
	@Column(length=2000)
	public String getMailText2() {
		return mailText2;
	}

	public void setMailText2(String mailText2) {
		this.mailText2 = mailText2;
	}

	@Basic
	@Column(length=2000)
	public String getMailText3() {
		return mailText3;
	}

	public void setMailText3(String mailText3) {
		this.mailText3 = mailText3;
	}

	@Basic
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	@Column(name="R_MAILTEXT_ID", columnDefinition="INT")
	public Integer getRMailTextID() {
		return rMailTextID;
	}

	public void setRMailTextID(Integer rMailTextID) {
		this.rMailTextID = rMailTextID;
	}

	@Basic
	@Column(name="ISTRANSLATED", nullable=false)
	public Boolean isTranslated() {
		return translated;
	}

	public void setTranslated(Boolean translated) {
		this.translated = translated;
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
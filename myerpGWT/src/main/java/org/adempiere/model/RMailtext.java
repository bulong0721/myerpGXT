package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="r_mailtext")
public class RMailtext extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private Boolean ishtml;
	private String mailheader;
	private String mailtext;
	private String mailtext2;
	private String mailtext3;
	private String name;
	private Integer rMailtextId;
	private String updated;
	private Integer updatedby;

	public RMailtext() {
	}

	public RMailtext(Integer rMailtextId) {
		this.rMailtextId = rMailtextId;
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
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIshtml() {
		return ishtml;
	}

	public void setIshtml(Boolean ishtml) {
		this.ishtml = ishtml;
	}

	@Basic
	@Column(length=2000)
	public String getMailheader() {
		return mailheader;
	}

	public void setMailheader(String mailheader) {
		this.mailheader = mailheader;
	}

	@Basic
	@Column(nullable=false, length=2000)
	public String getMailtext() {
		return mailtext;
	}

	public void setMailtext(String mailtext) {
		this.mailtext = mailtext;
	}

	@Basic
	@Column(length=2000)
	public String getMailtext2() {
		return mailtext2;
	}

	public void setMailtext2(String mailtext2) {
		this.mailtext2 = mailtext2;
	}

	@Basic
	@Column(length=2000)
	public String getMailtext3() {
		return mailtext3;
	}

	public void setMailtext3(String mailtext3) {
		this.mailtext3 = mailtext3;
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
	@TableGenerator(name = "PkGen_353", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "R_MailText", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_353")
	public Integer getRMailtextId() {
		return rMailtextId;
	}

	public void setRMailtextId(Integer rMailtextId) {
		this.rMailtextId = rMailtextId;
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
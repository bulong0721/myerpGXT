package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_userbpaccess")
public class ADUserBPAccess extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDUserBPAccessID;
	private Integer aDUserID;
	private Boolean active;
	private String bPAccessType;
	private String created;
	private Integer createdBy;
	private String docBaseType;
	private Integer rRequestTypeID;
	private String updated;
	private Integer updatedBy;

	public ADUserBPAccess() {
	}

	public ADUserBPAccess(Integer aDUserBPAccessID) {
		this.aDUserBPAccessID = aDUserBPAccessID;
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

	@Id
	@Column(name="AD_USERBPACCESS_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1174", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_UserBPAccess", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1174")
	public Integer getADUserBPAccessID() {
		return aDUserBPAccessID;
	}

	public void setADUserBPAccessID(Integer aDUserBPAccessID) {
		this.aDUserBPAccessID = aDUserBPAccessID;
	}

	@Basic
	@Column(name="AD_USER_ID", columnDefinition="INT", nullable=false)
	public Integer getADUserID() {
		return aDUserID;
	}

	public void setADUserID(Integer aDUserID) {
		this.aDUserID = aDUserID;
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
	@Column(nullable=false, length=1)
	public String getBPAccessType() {
		return bPAccessType;
	}

	public void setBPAccessType(String bPAccessType) {
		this.bPAccessType = bPAccessType;
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
	@Column(length=3)
	public String getDocBaseType() {
		return docBaseType;
	}

	public void setDocBaseType(String docBaseType) {
		this.docBaseType = docBaseType;
	}

	@Basic
	@Column(name="R_REQUESTTYPE_ID", columnDefinition="INT")
	public Integer getRRequestTypeID() {
		return rRequestTypeID;
	}

	public void setRRequestTypeID(Integer rRequestTypeID) {
		this.rRequestTypeID = rRequestTypeID;
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
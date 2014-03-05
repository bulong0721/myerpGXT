package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="ad_ldapaccess")
public class ADLdapAccess extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDLdapAccessID;
	private Integer aDLdapProcessorID;
	private Integer aDOrgID;
	private Integer aDUserID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String description;
	private Boolean error;
	private Integer rInterestAreaID;
	private String summary;
	private String updated;
	private Integer updatedBy;

	public ADLdapAccess() {
	}

	public ADLdapAccess(Integer aDLdapAccessID) {
		this.aDLdapAccessID = aDLdapAccessID;
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
	@Column(name="AD_LDAPACCESS_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1290", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "AD_LdapAccess", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1290")
	public Integer getADLdapAccessID() {
		return aDLdapAccessID;
	}

	public void setADLdapAccessID(Integer aDLdapAccessID) {
		this.aDLdapAccessID = aDLdapAccessID;
	}

	@Basic
	@Column(name="AD_LDAPPROCESSOR_ID", columnDefinition="INT", nullable=false)
	public Integer getADLdapProcessorID() {
		return aDLdapProcessorID;
	}

	public void setADLdapProcessorID(Integer aDLdapProcessorID) {
		this.aDLdapProcessorID = aDLdapProcessorID;
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
	@Column(name="AD_USER_ID", columnDefinition="INT")
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
	@Column(name="ISERROR", nullable=false)
	public Boolean isError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	@Basic
	@Column(name="R_INTERESTAREA_ID", columnDefinition="INT")
	public Integer getRInterestAreaID() {
		return rInterestAreaID;
	}

	public void setRInterestAreaID(Integer rInterestAreaID) {
		this.rInterestAreaID = rInterestAreaID;
	}

	@Basic
	@Column(length=2000)
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
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
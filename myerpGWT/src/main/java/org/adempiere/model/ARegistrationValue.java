package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_registrationvalue")
@IdClass(org.adempiere.model.ARegistrationValuePK.class)
public class ARegistrationValue extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aRegistrationAttributeID;
	private Integer aRegistrationID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String description;
	private String name;
	private String updated;
	private Integer updatedBy;

	public ARegistrationValue() {
	}

	public ARegistrationValue(Integer aRegistrationAttributeID, Integer aRegistrationID) {
		this.aRegistrationAttributeID = aRegistrationAttributeID;
		this.aRegistrationID = aRegistrationID;
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
	@Column(name="A_REGISTRATIONATTRIBUTE_ID", columnDefinition="INT")
	public Integer getARegistrationAttributeID() {
		return aRegistrationAttributeID;
	}

	public void setARegistrationAttributeID(Integer aRegistrationAttributeID) {
		this.aRegistrationAttributeID = aRegistrationAttributeID;
	}

	@Id
	@Column(name="A_REGISTRATION_ID", columnDefinition="INT")
	public Integer getARegistrationID() {
		return aRegistrationID;
	}

	public void setARegistrationID(Integer aRegistrationID) {
		this.aRegistrationID = aRegistrationID;
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
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
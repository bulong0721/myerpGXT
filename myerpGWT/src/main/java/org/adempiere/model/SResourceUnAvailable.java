package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="s_resourceunavailable")
public class SResourceUnAvailable extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String dateFrom;
	private String dateTo;
	private String description;
	private Integer sResourceID;
	private Integer sResourceUnAvailableID;
	private String updated;
	private Integer updatedBy;

	public SResourceUnAvailable() {
	}

	public SResourceUnAvailable(Integer sResourceUnAvailableID) {
		this.sResourceUnAvailableID = sResourceUnAvailableID;
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
	@Column(nullable=false)
	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	@Basic
	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name="S_RESOURCE_ID", columnDefinition="INT", nullable=false)
	public Integer getSResourceID() {
		return sResourceID;
	}

	public void setSResourceID(Integer sResourceID) {
		this.sResourceID = sResourceID;
	}

	@Id
	@Column(name="S_RESOURCEUNAVAILABLE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_554", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "S_ResourceUnAvailable", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_554")
	public Integer getSResourceUnAvailableID() {
		return sResourceUnAvailableID;
	}

	public void setSResourceUnAvailableID(Integer sResourceUnAvailableID) {
		this.sResourceUnAvailableID = sResourceUnAvailableID;
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
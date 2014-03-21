package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="s_resourceassignment")
public class SResourceAssignment extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String assignDateFrom;
	private String assignDateTo;
	private Boolean confirmed;
	private String created;
	private Integer createdBy;
	private String description;
	private String name;
	private BigDecimal qty;
	private Integer sResourceAssignmentID;
	private Integer sResourceID;
	private String updated;
	private Integer updatedBy;

	public SResourceAssignment() {
	}

	public SResourceAssignment(Integer sResourceAssignmentID) {
		this.sResourceAssignmentID = sResourceAssignmentID;
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
	@Column(nullable=false)
	public String getAssignDateFrom() {
		return assignDateFrom;
	}

	public void setAssignDateFrom(String assignDateFrom) {
		this.assignDateFrom = assignDateFrom;
	}

	@Basic
	public String getAssignDateTo() {
		return assignDateTo;
	}

	public void setAssignDateTo(String assignDateTo) {
		this.assignDateTo = assignDateTo;
	}

	@Basic
	@Column(name="ISCONFIRMED", nullable=false)
	public Boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
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
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	@Id
	@Column(name="S_RESOURCEASSIGNMENT_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_557", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "S_ResourceAssignment", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_557")
	public Integer getSResourceAssignmentID() {
		return sResourceAssignmentID;
	}

	public void setSResourceAssignmentID(Integer sResourceAssignmentID) {
		this.sResourceAssignmentID = sResourceAssignmentID;
	}

	@Basic
	@Column(name="S_RESOURCE_ID", columnDefinition="INT", nullable=false)
	public Integer getSResourceID() {
		return sResourceID;
	}

	public void setSResourceID(Integer sResourceID) {
		this.sResourceID = sResourceID;
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
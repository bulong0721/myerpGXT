package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_nonbusinessday")
public class CNonBusinessDay extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cCalendarID;
	private Integer cNonBusinessDayID;
	private String created;
	private Integer createdBy;
	private String date1;
	private String name;
	private String updated;
	private Integer updatedBy;

	public CNonBusinessDay() {
	}

	public CNonBusinessDay(Integer cNonBusinessDayID) {
		this.cNonBusinessDayID = cNonBusinessDayID;
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
	@Column(name="C_CALENDAR_ID", columnDefinition="INT", nullable=false)
	public Integer getCCalendarID() {
		return cCalendarID;
	}

	public void setCCalendarID(Integer cCalendarID) {
		this.cCalendarID = cCalendarID;
	}

	@Id
	@Column(name="C_NONBUSINESSDAY_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_61", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_NonBusinessDay", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_61")
	public Integer getCNonBusinessDayID() {
		return cNonBusinessDayID;
	}

	public void setCNonBusinessDayID(Integer cNonBusinessDayID) {
		this.cNonBusinessDayID = cNonBusinessDayID;
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
	public String getDate1() {
		return date1;
	}

	public void setDate1(String date1) {
		this.date1 = date1;
	}

	@Basic
	@Column(length=60)
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
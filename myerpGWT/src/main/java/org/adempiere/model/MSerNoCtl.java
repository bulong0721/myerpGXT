package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_sernoctl")
public class MSerNoCtl extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private Integer currentNext;
	private String description;
	private Integer incrementNo;
	private Integer mSerNoCtlID;
	private String name;
	private String prefix;
	private Integer startNo;
	private String suffix;
	private String updated;
	private Integer updatedBy;

	public MSerNoCtl() {
	}

	public MSerNoCtl(Integer mSerNoCtlID) {
		this.mSerNoCtlID = mSerNoCtlID;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCurrentNext() {
		return currentNext;
	}

	public void setCurrentNext(Integer currentNext) {
		this.currentNext = currentNext;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getIncrementNo() {
		return incrementNo;
	}

	public void setIncrementNo(Integer incrementNo) {
		this.incrementNo = incrementNo;
	}

	@Id
	@Column(name="M_SERNOCTL_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_684", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_SerNoCtl", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_684")
	public Integer getMSerNoCtlID() {
		return mSerNoCtlID;
	}

	public void setMSerNoCtlID(Integer mSerNoCtlID) {
		this.mSerNoCtlID = mSerNoCtlID;
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
	@Column(length=10)
	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getStartNo() {
		return startNo;
	}

	public void setStartNo(Integer startNo) {
		this.startNo = startNo;
	}

	@Basic
	@Column(length=10)
	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
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
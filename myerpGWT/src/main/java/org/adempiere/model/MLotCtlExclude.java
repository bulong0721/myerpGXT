package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_lotctlexclude")
public class MLotCtlExclude extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDTableID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private Integer mLotCtlExcludeID;
	private Integer mLotCtlID;
	private Boolean sOTrx;
	private String updated;
	private Integer updatedBy;

	public MLotCtlExclude() {
	}

	public MLotCtlExclude(Integer mLotCtlExcludeID) {
		this.mLotCtlExcludeID = mLotCtlExcludeID;
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
	@Column(name="AD_TABLE_ID", columnDefinition="INT", nullable=false)
	public Integer getADTableID() {
		return aDTableID;
	}

	public void setADTableID(Integer aDTableID) {
		this.aDTableID = aDTableID;
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

	@Id
	@Column(name="M_LOTCTLEXCLUDE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1168", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_LotCtlExclude", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1168")
	public Integer getMLotCtlExcludeID() {
		return mLotCtlExcludeID;
	}

	public void setMLotCtlExcludeID(Integer mLotCtlExcludeID) {
		this.mLotCtlExcludeID = mLotCtlExcludeID;
	}

	@Basic
	@Column(name="M_LOTCTL_ID", columnDefinition="INT", nullable=false)
	public Integer getMLotCtlID() {
		return mLotCtlID;
	}

	public void setMLotCtlID(Integer mLotCtlID) {
		this.mLotCtlID = mLotCtlID;
	}

	@Basic
	@Column(name="ISSOTRX", nullable=false)
	public Boolean isSOTrx() {
		return sOTrx;
	}

	public void setSOTrx(Boolean sOTrx) {
		this.sOTrx = sOTrx;
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
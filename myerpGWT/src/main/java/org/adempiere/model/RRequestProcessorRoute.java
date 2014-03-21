package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="r_requestprocessor_route")
public class RRequestProcessorRoute extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDUserID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String keyword;
	private Integer rRequestProcessorID;
	private Integer rRequestProcessorRouteID;
	private Integer rRequestTypeID;
	private Integer seqNo;
	private String updated;
	private Integer updatedBy;

	public RRequestProcessorRoute() {
	}

	public RRequestProcessorRoute(Integer rRequestProcessorRouteID) {
		this.rRequestProcessorRouteID = rRequestProcessorRouteID;
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
	@Column(length=60)
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	@Basic
	@Column(name="R_REQUESTPROCESSOR_ID", columnDefinition="INT", nullable=false)
	public Integer getRRequestProcessorID() {
		return rRequestProcessorID;
	}

	public void setRRequestProcessorID(Integer rRequestProcessorID) {
		this.rRequestProcessorID = rRequestProcessorID;
	}

	@Id
	@Column(name="R_REQUESTPROCESSOR_ROUTE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_528", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "R_RequestProcessor_Route", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_528")
	public Integer getRRequestProcessorRouteID() {
		return rRequestProcessorRouteID;
	}

	public void setRRequestProcessorRouteID(Integer rRequestProcessorRouteID) {
		this.rRequestProcessorRouteID = rRequestProcessorRouteID;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
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
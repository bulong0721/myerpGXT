package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="r_requesttype")
public class RRequesttype extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer autoduedatedays;
	private String confidentialtype;
	private String created;
	private Integer createdby;
	private String description;
	private Integer duedatetolerance;
	private Boolean isactive;
	private Boolean isautochangerequest;
	private Boolean isconfidentialinfo;
	private Boolean isdefault;
	private Boolean isemailwhendue;
	private Boolean isemailwhenoverdue;
	private String isindexed;
	private Boolean isinvoiced;
	private Boolean isselfservice;
	private String name;
	private Integer rRequesttypeId;
	private Integer rStatuscategoryId;
	private String updated;
	private Integer updatedby;

	public RRequesttype() {
	}

	public RRequesttype(Integer rRequesttypeId) {
		this.rRequesttypeId = rRequesttypeId;
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
	@Column(columnDefinition="INT")
	public Integer getAutoduedatedays() {
		return autoduedatedays;
	}

	public void setAutoduedatedays(Integer autoduedatedays) {
		this.autoduedatedays = autoduedatedays;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getConfidentialtype() {
		return confidentialtype;
	}

	public void setConfidentialtype(String confidentialtype) {
		this.confidentialtype = confidentialtype;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getDuedatetolerance() {
		return duedatetolerance;
	}

	public void setDuedatetolerance(Integer duedatetolerance) {
		this.duedatetolerance = duedatetolerance;
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
	public Boolean isIsautochangerequest() {
		return isautochangerequest;
	}

	public void setIsautochangerequest(Boolean isautochangerequest) {
		this.isautochangerequest = isautochangerequest;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsconfidentialinfo() {
		return isconfidentialinfo;
	}

	public void setIsconfidentialinfo(Boolean isconfidentialinfo) {
		this.isconfidentialinfo = isconfidentialinfo;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsdefault() {
		return isdefault;
	}

	public void setIsdefault(Boolean isdefault) {
		this.isdefault = isdefault;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsemailwhendue() {
		return isemailwhendue;
	}

	public void setIsemailwhendue(Boolean isemailwhendue) {
		this.isemailwhendue = isemailwhendue;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsemailwhenoverdue() {
		return isemailwhenoverdue;
	}

	public void setIsemailwhenoverdue(Boolean isemailwhenoverdue) {
		this.isemailwhenoverdue = isemailwhenoverdue;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsindexed() {
		return isindexed;
	}

	public void setIsindexed(String isindexed) {
		this.isindexed = isindexed;
	}

	@Basic
	public Boolean isIsinvoiced() {
		return isinvoiced;
	}

	public void setIsinvoiced(Boolean isinvoiced) {
		this.isinvoiced = isinvoiced;
	}

	@Basic
	@Column(nullable=false)
	public Boolean isIsselfservice() {
		return isselfservice;
	}

	public void setIsselfservice(Boolean isselfservice) {
		this.isselfservice = isselfservice;
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
	@Column(name="R_REQUESTTYPE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_625", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "R_RequestType", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_625")
	public Integer getRRequesttypeId() {
		return rRequesttypeId;
	}

	public void setRRequesttypeId(Integer rRequesttypeId) {
		this.rRequesttypeId = rRequesttypeId;
	}

	@Basic
	@Column(name="R_STATUSCATEGORY_ID", columnDefinition="INT", nullable=false)
	public Integer getRStatuscategoryId() {
		return rStatuscategoryId;
	}

	public void setRStatuscategoryId(Integer rStatuscategoryId) {
		this.rStatuscategoryId = rStatuscategoryId;
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
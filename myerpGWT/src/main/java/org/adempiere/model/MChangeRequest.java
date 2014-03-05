package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_changerequest")
public class MChangeRequest extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String approved;
	private String created;
	private Integer createdBy;
	private String description;
	private String detailInfo;
	private String documentNo;
	private String help;
	private Integer mChangeNoticeID;
	private Integer mChangeRequestID;
	private Integer mFixChangeNoticeID;
	private String name;
	private Integer pPProductBOMID;
	private String processed;
	private String updated;
	private Integer updatedBy;

	public MChangeRequest() {
	}

	public MChangeRequest(Integer mChangeRequestID) {
		this.mChangeRequestID = mChangeRequestID;
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
	@Column(name="ISAPPROVED", nullable=false, length=1)
	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
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
	@Column(columnDefinition="LONGTEXT")
	public String getDetailInfo() {
		return detailInfo;
	}

	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}

	@Basic
	@Column(nullable=false, length=30)
	public String getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(String documentNo) {
		this.documentNo = documentNo;
	}

	@Basic
	@Column(length=2000)
	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Basic
	@Column(name="M_CHANGENOTICE_ID", columnDefinition="INT")
	public Integer getMChangeNoticeID() {
		return mChangeNoticeID;
	}

	public void setMChangeNoticeID(Integer mChangeNoticeID) {
		this.mChangeNoticeID = mChangeNoticeID;
	}

	@Id
	@Column(name="M_CHANGEREQUEST_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1137", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "M_ChangeRequest", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1137")
	public Integer getMChangeRequestID() {
		return mChangeRequestID;
	}

	public void setMChangeRequestID(Integer mChangeRequestID) {
		this.mChangeRequestID = mChangeRequestID;
	}

	@Basic
	@Column(name="M_FIXCHANGENOTICE_ID", columnDefinition="INT")
	public Integer getMFixChangeNoticeID() {
		return mFixChangeNoticeID;
	}

	public void setMFixChangeNoticeID(Integer mFixChangeNoticeID) {
		this.mFixChangeNoticeID = mFixChangeNoticeID;
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
	@Column(name="PP_PRODUCT_BOM_ID", columnDefinition="INT")
	public Integer getPPProductBOMID() {
		return pPProductBOMID;
	}

	public void setPPProductBOMID(Integer pPProductBOMID) {
		this.pPProductBOMID = pPProductBOMID;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getProcessed() {
		return processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
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
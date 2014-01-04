package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="k_indexlog")
public class KIndexlog extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String created;
	private Integer createdby;
	private String indexquery;
	private Integer indexqueryresult;
	private String isactive;
	private Integer kIndexlogId;
	private String querysource;
	private String updated;
	private Integer updatedby;

	public KIndexlog() {
	}

	public KIndexlog(Integer kIndexlogId) {
		this.kIndexlogId = kIndexlogId;
	}

	@Basic
	@Column(name="AD_CLIENT_ID", nullable=false)
	public Integer getAdClientId() {
		return adClientId;
	}

	public void setAdClientId(Integer adClientId) {
		this.adClientId = adClientId;
	}

	@Basic
	@Column(name="AD_ORG_ID", nullable=false)
	public Integer getAdOrgId() {
		return adOrgId;
	}

	public void setAdOrgId(Integer adOrgId) {
		this.adOrgId = adOrgId;
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
	@Column(nullable=false)
	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	@Basic
	@Column(nullable=false)
	public String getIndexquery() {
		return indexquery;
	}

	public void setIndexquery(String indexquery) {
		this.indexquery = indexquery;
	}

	@Basic
	@Column(nullable=false)
	public Integer getIndexqueryresult() {
		return indexqueryresult;
	}

	public void setIndexqueryresult(Integer indexqueryresult) {
		this.indexqueryresult = indexqueryresult;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Id
	@Column(name="K_INDEXLOG_ID")
	public Integer getKIndexlogId() {
		return kIndexlogId;
	}

	public void setKIndexlogId(Integer kIndexlogId) {
		this.kIndexlogId = kIndexlogId;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getQuerysource() {
		return querysource;
	}

	public void setQuerysource(String querysource) {
		this.querysource = querysource;
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
	@Column(nullable=false)
	public Integer getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
}
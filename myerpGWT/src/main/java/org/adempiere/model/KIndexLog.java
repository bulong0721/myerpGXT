package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="k_indexlog")
public class KIndexLog extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private String indexQuery;
	private Integer indexQueryResult;
	private Integer kIndexLogID;
	private String querySource;
	private String updated;
	private Integer updatedBy;

	public KIndexLog() {
	}

	public KIndexLog(Integer kIndexLogID) {
		this.kIndexLogID = kIndexLogID;
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
	public String getIndexQuery() {
		return indexQuery;
	}

	public void setIndexQuery(String indexQuery) {
		this.indexQuery = indexQuery;
	}

	@Basic
	@Column(columnDefinition="INT", nullable=false)
	public Integer getIndexQueryResult() {
		return indexQueryResult;
	}

	public void setIndexQueryResult(Integer indexQueryResult) {
		this.indexQueryResult = indexQueryResult;
	}

	@Id
	@Column(name="K_INDEXLOG_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_1285", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "K_IndexLog", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_1285")
	public Integer getKIndexLogID() {
		return kIndexLogID;
	}

	public void setKIndexLogID(Integer kIndexLogID) {
		this.kIndexLogID = kIndexLogID;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getQuerySource() {
		return querySource;
	}

	public void setQuerySource(String querySource) {
		this.querySource = querySource;
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
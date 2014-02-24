package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="u_blacklistcheque")
public class UBlacklistcheque extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private String bankname;
	private String chequeno;
	private String created;
	private Integer createdby;
	private Boolean isactive;
	private Integer uBlacklistchequeId;
	private String updated;
	private Integer updatedby;

	public UBlacklistcheque() {
	}

	public UBlacklistcheque(Integer uBlacklistchequeId) {
		this.uBlacklistchequeId = uBlacklistchequeId;
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
	@Column(nullable=false, length=120)
	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Basic
	@Column(nullable=false, length=120)
	public String getChequeno() {
		return chequeno;
	}

	public void setChequeno(String chequeno) {
		this.chequeno = chequeno;
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
	@Column(nullable=false)
	public Boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	@Id
	@Column(name="U_BLACKLISTCHEQUE_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_52002", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "U_BlackListCheque", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_52002")
	public Integer getUBlacklistchequeId() {
		return uBlacklistchequeId;
	}

	public void setUBlacklistchequeId(Integer uBlacklistchequeId) {
		this.uBlacklistchequeId = uBlacklistchequeId;
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
package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_bankaccountdoc")
public class CBankaccountdoc extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cBankaccountId;
	private Integer cBankaccountdocId;
	private Integer checkPrintformatId;
	private String created;
	private Integer createdby;
	private Integer currentnext;
	private String description;
	private Boolean isactive;
	private String name;
	private String paymentrule;
	private String updated;
	private Integer updatedby;

	public CBankaccountdoc() {
	}

	public CBankaccountdoc(Integer cBankaccountdocId) {
		this.cBankaccountdocId = cBankaccountdocId;
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
	@Column(name="C_BANKACCOUNT_ID", columnDefinition="INT", nullable=false)
	public Integer getCBankaccountId() {
		return cBankaccountId;
	}

	public void setCBankaccountId(Integer cBankaccountId) {
		this.cBankaccountId = cBankaccountId;
	}

	@Id
	@Column(name="C_BANKACCOUNTDOC_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_505", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_BankAccountDoc", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_505")
	public Integer getCBankaccountdocId() {
		return cBankaccountdocId;
	}

	public void setCBankaccountdocId(Integer cBankaccountdocId) {
		this.cBankaccountdocId = cBankaccountdocId;
	}

	@Basic
	@Column(name="CHECK_PRINTFORMAT_ID", columnDefinition="INT")
	public Integer getCheckPrintformatId() {
		return checkPrintformatId;
	}

	public void setCheckPrintformatId(Integer checkPrintformatId) {
		this.checkPrintformatId = checkPrintformatId;
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
	@Column(columnDefinition="INT", nullable=false)
	public Integer getCurrentnext() {
		return currentnext;
	}

	public void setCurrentnext(Integer currentnext) {
		this.currentnext = currentnext;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	@Column(nullable=false, length=60)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getPaymentrule() {
		return paymentrule;
	}

	public void setPaymentrule(String paymentrule) {
		this.paymentrule = paymentrule;
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
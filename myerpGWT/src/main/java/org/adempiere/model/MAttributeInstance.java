package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_attributeinstance")
@IdClass(org.adempiere.model.MAttributeInstancePK.class)
public class MAttributeInstance extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private String active;
	private String created;
	private Integer createdBy;
	private Integer mAttributeID;
	private Integer mAttributeSetInstanceID;
	private Integer mAttributeValueID;
	private String updated;
	private Integer updatedBy;
	private String value;
	private BigDecimal valueNumber;

	public MAttributeInstance() {
	}

	public MAttributeInstance(Integer mAttributeID, Integer mAttributeSetInstanceID) {
		this.mAttributeID = mAttributeID;
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
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
	@Column(name="ISACTIVE", nullable=false, length=1)
	public String getActive() {
		return active;
	}

	public void setActive(String active) {
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
	@Column(name="M_ATTRIBUTE_ID", columnDefinition="INT")
	public Integer getMAttributeID() {
		return mAttributeID;
	}

	public void setMAttributeID(Integer mAttributeID) {
		this.mAttributeID = mAttributeID;
	}

	@Id
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributeSetInstanceID() {
		return mAttributeSetInstanceID;
	}

	public void setMAttributeSetInstanceID(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
	}

	@Basic
	@Column(name="M_ATTRIBUTEVALUE_ID", columnDefinition="INT")
	public Integer getMAttributeValueID() {
		return mAttributeValueID;
	}

	public void setMAttributeValueID(Integer mAttributeValueID) {
		this.mAttributeValueID = mAttributeValueID;
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

	@Basic
	@Column(length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Basic
	public BigDecimal getValueNumber() {
		return valueNumber;
	}

	public void setValueNumber(BigDecimal valueNumber) {
		this.valueNumber = valueNumber;
	}
}
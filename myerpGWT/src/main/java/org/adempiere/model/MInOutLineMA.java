package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="m_inoutlinema")
@IdClass(org.adempiere.model.MInOutLineMAPK.class)
public class MInOutLineMA extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private String created;
	private Integer createdBy;
	private Integer mAttributeSetInstanceID;
	private Integer mInOutLineID;
	private BigDecimal movementQty;
	private String updated;
	private Integer updatedBy;

	public MInOutLineMA() {
	}

	public MInOutLineMA(Integer mAttributeSetInstanceID, Integer mInOutLineID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
		this.mInOutLineID = mInOutLineID;
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

	@Id
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributeSetInstanceID() {
		return mAttributeSetInstanceID;
	}

	public void setMAttributeSetInstanceID(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
	}

	@Id
	@Column(name="M_INOUTLINE_ID", columnDefinition="INT")
	public Integer getMInOutLineID() {
		return mInOutLineID;
	}

	public void setMInOutLineID(Integer mInOutLineID) {
		this.mInOutLineID = mInOutLineID;
	}

	@Basic
	@Column(nullable=false)
	public BigDecimal getMovementQty() {
		return movementQty;
	}

	public void setMovementQty(BigDecimal movementQty) {
		this.movementQty = movementQty;
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
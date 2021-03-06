package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="c_subscription_delivery")
public class CSubscriptionDelivery extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Boolean active;
	private Integer cSubscriptionDeliveryID;
	private Integer cSubscriptionID;
	private String created;
	private Integer createdBy;
	private String updated;
	private Integer updatedBy;

	public CSubscriptionDelivery() {
	}

	public CSubscriptionDelivery(Integer cSubscriptionDeliveryID) {
		this.cSubscriptionDeliveryID = cSubscriptionDeliveryID;
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

	@Id
	@Column(name="C_SUBSCRIPTION_DELIVERY_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_842", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "C_Subscription_Delivery", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_842")
	public Integer getCSubscriptionDeliveryID() {
		return cSubscriptionDeliveryID;
	}

	public void setCSubscriptionDeliveryID(Integer cSubscriptionDeliveryID) {
		this.cSubscriptionDeliveryID = cSubscriptionDeliveryID;
	}

	@Basic
	@Column(name="C_SUBSCRIPTION_ID", columnDefinition="INT", nullable=false)
	public Integer getCSubscriptionID() {
		return cSubscriptionID;
	}

	public void setCSubscriptionID(Integer cSubscriptionID) {
		this.cSubscriptionID = cSubscriptionID;
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
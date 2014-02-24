package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset_delivery")
public class AAssetDelivery extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer aAssetDeliveryId;
	private Integer aAssetId;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer adUserId;
	private String created;
	private Integer createdby;
	private String deliveryconfirmation;
	private String description;
	private String email;
	private Boolean isactive;
	private String lot;
	private Integer mInoutlineId;
	private Integer mProductdownloadId;
	private String messageid;
	private String movementdate;
	private String referrer;
	private String remoteAddr;
	private String remoteHost;
	private String serno;
	private String updated;
	private Integer updatedby;
	private String url;
	private String versionno;

	public AAssetDelivery() {
	}

	public AAssetDelivery(Integer aAssetDeliveryId) {
		this.aAssetDeliveryId = aAssetDeliveryId;
	}

	@Id
	@Column(name="A_ASSET_DELIVERY_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_668", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "A_Asset_Delivery", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_668")
	public Integer getAAssetDeliveryId() {
		return aAssetDeliveryId;
	}

	public void setAAssetDeliveryId(Integer aAssetDeliveryId) {
		this.aAssetDeliveryId = aAssetDeliveryId;
	}

	@Basic
	@Column(name="A_ASSET_ID", columnDefinition="INT", nullable=false)
	public Integer getAAssetId() {
		return aAssetId;
	}

	public void setAAssetId(Integer aAssetId) {
		this.aAssetId = aAssetId;
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
	@Column(name="AD_USER_ID", columnDefinition="INT")
	public Integer getAdUserId() {
		return adUserId;
	}

	public void setAdUserId(Integer adUserId) {
		this.adUserId = adUserId;
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
	@Column(length=120)
	public String getDeliveryconfirmation() {
		return deliveryconfirmation;
	}

	public void setDeliveryconfirmation(String deliveryconfirmation) {
		this.deliveryconfirmation = deliveryconfirmation;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=60)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	@Column(length=40)
	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	@Basic
	@Column(name="M_INOUTLINE_ID", columnDefinition="INT")
	public Integer getMInoutlineId() {
		return mInoutlineId;
	}

	public void setMInoutlineId(Integer mInoutlineId) {
		this.mInoutlineId = mInoutlineId;
	}

	@Basic
	@Column(name="M_PRODUCTDOWNLOAD_ID", columnDefinition="INT")
	public Integer getMProductdownloadId() {
		return mProductdownloadId;
	}

	public void setMProductdownloadId(Integer mProductdownloadId) {
		this.mProductdownloadId = mProductdownloadId;
	}

	@Basic
	@Column(length=120)
	public String getMessageid() {
		return messageid;
	}

	public void setMessageid(String messageid) {
		this.messageid = messageid;
	}

	@Basic
	@Column(nullable=false)
	public String getMovementdate() {
		return movementdate;
	}

	public void setMovementdate(String movementdate) {
		this.movementdate = movementdate;
	}

	@Basic
	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

	@Basic
	@Column(name="REMOTE_ADDR", length=60)
	public String getRemoteAddr() {
		return remoteAddr;
	}

	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
	}

	@Basic
	@Column(name="REMOTE_HOST", length=60)
	public String getRemoteHost() {
		return remoteHost;
	}

	public void setRemoteHost(String remoteHost) {
		this.remoteHost = remoteHost;
	}

	@Basic
	@Column(length=40)
	public String getSerno() {
		return serno;
	}

	public void setSerno(String serno) {
		this.serno = serno;
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

	@Basic
	@Column(length=120)
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Basic
	@Column(length=20)
	public String getVersionno() {
		return versionno;
	}

	public void setVersionno(String versionno) {
		this.versionno = versionno;
	}
}
package org.adempiere.model;

import java.math.*;
import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="a_asset")
public class AAsset extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private String aAssetCreateDate;
	private Integer aAssetGroupID;
	private Integer aAssetID;
	private String aAssetRevalDate;
	private Integer aDClientID;
	private Integer aDOrgID;
	private Integer aDUserID;
	private Integer aParentAssetID;
	private BigDecimal aQTYCurrent;
	private BigDecimal aQTYOriginal;
	private Boolean active;
	private String assetDepreciationDate;
	private String assetDisposalDate;
	private String assetServiceDate;
	private Integer cBPartnerID;
	private Integer cBPartnerLocationID;
	private Integer cBPartnerSRID;
	private Integer cLocationID;
	private Integer cProjectID;
	private String created;
	private Integer createdBy;
	private Boolean depreciated;
	private String description;
	private Boolean disposed;
	private Boolean fullyDepreciated;
	private String guaranteeDate;
	private String help;
	private Boolean inPosession;
	private String lastMaintenanceDate;
	private String lastMaintenanceNote;
	private Integer lastMaintenanceUnit;
	private Integer lastmaintenanceuseunit;
	private String lastmaintenencedate;
	private Integer leaseBPartnerID;
	private String leaseTerminationDate;
	private BigDecimal lifeUseUnits;
	private String locationComment;
	private String lot;
	private Integer mAttributeSetInstanceID;
	private Integer mInOutLineID;
	private Integer mLocatorID;
	private Integer mProductID;
	private String name;
	private String nextMaintenenceDate;
	private Integer nextMaintenenceUnit;
	private Integer nextmaintenanceuseunit;
	private Boolean owned;
	private Boolean processing;
	private BigDecimal qty;
	private String serNo;
	private String updated;
	private Integer updatedBy;
	private Integer useLifeMonths;
	private Integer useLifeYears;
	private BigDecimal useUnits;
	private String value;
	private String versionNo;

	public AAsset() {
	}

	public AAsset(Integer aAssetID) {
		this.aAssetID = aAssetID;
	}

	@Basic
	@Column(name="A_ASSET_CREATEDATE")
	public String getAAssetCreateDate() {
		return aAssetCreateDate;
	}

	public void setAAssetCreateDate(String aAssetCreateDate) {
		this.aAssetCreateDate = aAssetCreateDate;
	}

	@Basic
	@Column(name="A_ASSET_GROUP_ID", columnDefinition="INT", nullable=false)
	public Integer getAAssetGroupID() {
		return aAssetGroupID;
	}

	public void setAAssetGroupID(Integer aAssetGroupID) {
		this.aAssetGroupID = aAssetGroupID;
	}

	@Id
	@Column(name="A_ASSET_ID", columnDefinition="INT")
	@TableGenerator(name = "PkGen_666", table = "ad_sequence", pkColumnName = "name", pkColumnValue = "A_Asset", valueColumnName = "currentnextsys", allocationSize = 1 )
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "PkGen_666")
	public Integer getAAssetID() {
		return aAssetID;
	}

	public void setAAssetID(Integer aAssetID) {
		this.aAssetID = aAssetID;
	}

	@Basic
	@Column(name="A_ASSET_REVALDATE")
	public String getAAssetRevalDate() {
		return aAssetRevalDate;
	}

	public void setAAssetRevalDate(String aAssetRevalDate) {
		this.aAssetRevalDate = aAssetRevalDate;
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
	@Column(name="AD_USER_ID", columnDefinition="INT")
	public Integer getADUserID() {
		return aDUserID;
	}

	public void setADUserID(Integer aDUserID) {
		this.aDUserID = aDUserID;
	}

	@Basic
	@Column(name="A_PARENT_ASSET_ID", columnDefinition="INT")
	public Integer getAParentAssetID() {
		return aParentAssetID;
	}

	public void setAParentAssetID(Integer aParentAssetID) {
		this.aParentAssetID = aParentAssetID;
	}

	@Basic
	@Column(name="A_QTY_CURRENT")
	public BigDecimal getAQTYCurrent() {
		return aQTYCurrent;
	}

	public void setAQTYCurrent(BigDecimal aQTYCurrent) {
		this.aQTYCurrent = aQTYCurrent;
	}

	@Basic
	@Column(name="A_QTY_ORIGINAL")
	public BigDecimal getAQTYOriginal() {
		return aQTYOriginal;
	}

	public void setAQTYOriginal(BigDecimal aQTYOriginal) {
		this.aQTYOriginal = aQTYOriginal;
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
	public String getAssetDepreciationDate() {
		return assetDepreciationDate;
	}

	public void setAssetDepreciationDate(String assetDepreciationDate) {
		this.assetDepreciationDate = assetDepreciationDate;
	}

	@Basic
	public String getAssetDisposalDate() {
		return assetDisposalDate;
	}

	public void setAssetDisposalDate(String assetDisposalDate) {
		this.assetDisposalDate = assetDisposalDate;
	}

	@Basic
	public String getAssetServiceDate() {
		return assetServiceDate;
	}

	public void setAssetServiceDate(String assetServiceDate) {
		this.assetServiceDate = assetServiceDate;
	}

	@Basic
	@Column(name="C_BPARTNER_ID", columnDefinition="INT")
	public Integer getCBPartnerID() {
		return cBPartnerID;
	}

	public void setCBPartnerID(Integer cBPartnerID) {
		this.cBPartnerID = cBPartnerID;
	}

	@Basic
	@Column(name="C_BPARTNER_LOCATION_ID", columnDefinition="INT")
	public Integer getCBPartnerLocationID() {
		return cBPartnerLocationID;
	}

	public void setCBPartnerLocationID(Integer cBPartnerLocationID) {
		this.cBPartnerLocationID = cBPartnerLocationID;
	}

	@Basic
	@Column(name="C_BPARTNERSR_ID", columnDefinition="INT")
	public Integer getCBPartnerSRID() {
		return cBPartnerSRID;
	}

	public void setCBPartnerSRID(Integer cBPartnerSRID) {
		this.cBPartnerSRID = cBPartnerSRID;
	}

	@Basic
	@Column(name="C_LOCATION_ID", columnDefinition="INT")
	public Integer getCLocationID() {
		return cLocationID;
	}

	public void setCLocationID(Integer cLocationID) {
		this.cLocationID = cLocationID;
	}

	@Basic
	@Column(name="C_PROJECT_ID", columnDefinition="INT")
	public Integer getCProjectID() {
		return cProjectID;
	}

	public void setCProjectID(Integer cProjectID) {
		this.cProjectID = cProjectID;
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
	@Column(name="ISDEPRECIATED", nullable=false)
	public Boolean isDepreciated() {
		return depreciated;
	}

	public void setDepreciated(Boolean depreciated) {
		this.depreciated = depreciated;
	}

	@Basic
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(name="ISDISPOSED", nullable=false)
	public Boolean isDisposed() {
		return disposed;
	}

	public void setDisposed(Boolean disposed) {
		this.disposed = disposed;
	}

	@Basic
	@Column(name="ISFULLYDEPRECIATED", nullable=false)
	public Boolean isFullyDepreciated() {
		return fullyDepreciated;
	}

	public void setFullyDepreciated(Boolean fullyDepreciated) {
		this.fullyDepreciated = fullyDepreciated;
	}

	@Basic
	public String getGuaranteeDate() {
		return guaranteeDate;
	}

	public void setGuaranteeDate(String guaranteeDate) {
		this.guaranteeDate = guaranteeDate;
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
	@Column(name="ISINPOSESSION", nullable=false)
	public Boolean isInPosession() {
		return inPosession;
	}

	public void setInPosession(Boolean inPosession) {
		this.inPosession = inPosession;
	}

	@Basic
	public String getLastMaintenanceDate() {
		return lastMaintenanceDate;
	}

	public void setLastMaintenanceDate(String lastMaintenanceDate) {
		this.lastMaintenanceDate = lastMaintenanceDate;
	}

	@Basic
	@Column(length=60)
	public String getLastMaintenanceNote() {
		return lastMaintenanceNote;
	}

	public void setLastMaintenanceNote(String lastMaintenanceNote) {
		this.lastMaintenanceNote = lastMaintenanceNote;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getLastMaintenanceUnit() {
		return lastMaintenanceUnit;
	}

	public void setLastMaintenanceUnit(Integer lastMaintenanceUnit) {
		this.lastMaintenanceUnit = lastMaintenanceUnit;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getLastmaintenanceuseunit() {
		return lastmaintenanceuseunit;
	}

	public void setLastmaintenanceuseunit(Integer lastmaintenanceuseunit) {
		this.lastmaintenanceuseunit = lastmaintenanceuseunit;
	}

	@Basic
	public String getLastmaintenencedate() {
		return lastmaintenencedate;
	}

	public void setLastmaintenencedate(String lastmaintenencedate) {
		this.lastmaintenencedate = lastmaintenencedate;
	}

	@Basic
	@Column(name="LEASE_BPARTNER_ID", columnDefinition="INT")
	public Integer getLeaseBPartnerID() {
		return leaseBPartnerID;
	}

	public void setLeaseBPartnerID(Integer leaseBPartnerID) {
		this.leaseBPartnerID = leaseBPartnerID;
	}

	@Basic
	public String getLeaseTerminationDate() {
		return leaseTerminationDate;
	}

	public void setLeaseTerminationDate(String leaseTerminationDate) {
		this.leaseTerminationDate = leaseTerminationDate;
	}

	@Basic
	public BigDecimal getLifeUseUnits() {
		return lifeUseUnits;
	}

	public void setLifeUseUnits(BigDecimal lifeUseUnits) {
		this.lifeUseUnits = lifeUseUnits;
	}

	@Basic
	public String getLocationComment() {
		return locationComment;
	}

	public void setLocationComment(String locationComment) {
		this.locationComment = locationComment;
	}

	@Basic
	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	@Basic
	@Column(name="M_ATTRIBUTESETINSTANCE_ID", columnDefinition="INT")
	public Integer getMAttributeSetInstanceID() {
		return mAttributeSetInstanceID;
	}

	public void setMAttributeSetInstanceID(Integer mAttributeSetInstanceID) {
		this.mAttributeSetInstanceID = mAttributeSetInstanceID;
	}

	@Basic
	@Column(name="M_INOUTLINE_ID", columnDefinition="INT")
	public Integer getMInOutLineID() {
		return mInOutLineID;
	}

	public void setMInOutLineID(Integer mInOutLineID) {
		this.mInOutLineID = mInOutLineID;
	}

	@Basic
	@Column(name="M_LOCATOR_ID", columnDefinition="INT")
	public Integer getMLocatorID() {
		return mLocatorID;
	}

	public void setMLocatorID(Integer mLocatorID) {
		this.mLocatorID = mLocatorID;
	}

	@Basic
	@Column(name="M_PRODUCT_ID", columnDefinition="INT")
	public Integer getMProductID() {
		return mProductID;
	}

	public void setMProductID(Integer mProductID) {
		this.mProductID = mProductID;
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
	public String getNextMaintenenceDate() {
		return nextMaintenenceDate;
	}

	public void setNextMaintenenceDate(String nextMaintenenceDate) {
		this.nextMaintenenceDate = nextMaintenenceDate;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getNextMaintenenceUnit() {
		return nextMaintenenceUnit;
	}

	public void setNextMaintenenceUnit(Integer nextMaintenenceUnit) {
		this.nextMaintenenceUnit = nextMaintenenceUnit;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getNextmaintenanceuseunit() {
		return nextmaintenanceuseunit;
	}

	public void setNextmaintenanceuseunit(Integer nextmaintenanceuseunit) {
		this.nextmaintenanceuseunit = nextmaintenanceuseunit;
	}

	@Basic
	@Column(name="ISOWNED", nullable=false)
	public Boolean isOwned() {
		return owned;
	}

	public void setOwned(Boolean owned) {
		this.owned = owned;
	}

	@Basic
	public Boolean isProcessing() {
		return processing;
	}

	public void setProcessing(Boolean processing) {
		this.processing = processing;
	}

	@Basic
	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	@Basic
	public String getSerNo() {
		return serNo;
	}

	public void setSerNo(String serNo) {
		this.serNo = serNo;
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
	@Column(columnDefinition="INT")
	public Integer getUseLifeMonths() {
		return useLifeMonths;
	}

	public void setUseLifeMonths(Integer useLifeMonths) {
		this.useLifeMonths = useLifeMonths;
	}

	@Basic
	@Column(columnDefinition="INT")
	public Integer getUseLifeYears() {
		return useLifeYears;
	}

	public void setUseLifeYears(Integer useLifeYears) {
		this.useLifeYears = useLifeYears;
	}

	@Basic
	public BigDecimal getUseUnits() {
		return useUnits;
	}

	public void setUseUnits(BigDecimal useUnits) {
		this.useUnits = useUnits;
	}

	@Basic
	@Column(nullable=false, length=40)
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Basic
	@Column(length=20)
	public String getVersionNo() {
		return versionNo;
	}

	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
}
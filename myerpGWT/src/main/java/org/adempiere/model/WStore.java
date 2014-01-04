package org.adempiere.model;

import javax.persistence.*;

/**
 * Auto-generated by:
 * org.adempiere.AdempiereCustomizer
 */
@Entity
@Table(name="w_store")
public class WStore extends org.adempiere.common.ADEntityBase {
	private static final long serialVersionUID = 1L;
	private Integer adClientId;
	private Integer adOrgId;
	private Integer cPaymenttermId;
	private String created;
	private Integer createdby;
	private String description;
	private String emailfooter;
	private String emailheader;
	private String help;
	private String isactive;
	private String isdefault;
	private String ismenuassets;
	private String ismenucontact;
	private String ismenuinterests;
	private String ismenuinvoices;
	private String ismenuorders;
	private String ismenupayments;
	private String ismenuregistrations;
	private String ismenurequests;
	private String ismenurfqs;
	private String ismenushipments;
	private Integer mPricelistId;
	private Integer mWarehouseId;
	private String name;
	private Integer salesrepId;
	private String stylesheet;
	private String updated;
	private Integer updatedby;
	private String url;
	private Integer wStoreId;
	private String webcontext;
	private String webinfo;
	private String weborderemail;
	private String webparam1;
	private String webparam2;
	private String webparam3;
	private String webparam4;
	private String webparam5;
	private String webparam6;
	private String wstoreemail;
	private String wstoreuser;
	private String wstoreuserpw;

	public WStore() {
	}

	public WStore(Integer wStoreId) {
		this.wStoreId = wStoreId;
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
	@Column(name="C_PAYMENTTERM_ID")
	public Integer getCPaymenttermId() {
		return cPaymenttermId;
	}

	public void setCPaymenttermId(Integer cPaymenttermId) {
		this.cPaymenttermId = cPaymenttermId;
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
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Basic
	@Column(length=2000)
	public String getEmailfooter() {
		return emailfooter;
	}

	public void setEmailfooter(String emailfooter) {
		this.emailfooter = emailfooter;
	}

	@Basic
	@Column(length=2000)
	public String getEmailheader() {
		return emailheader;
	}

	public void setEmailheader(String emailheader) {
		this.emailheader = emailheader;
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
	@Column(nullable=false, length=1)
	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsdefault() {
		return isdefault;
	}

	public void setIsdefault(String isdefault) {
		this.isdefault = isdefault;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsmenuassets() {
		return ismenuassets;
	}

	public void setIsmenuassets(String ismenuassets) {
		this.ismenuassets = ismenuassets;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsmenucontact() {
		return ismenucontact;
	}

	public void setIsmenucontact(String ismenucontact) {
		this.ismenucontact = ismenucontact;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsmenuinterests() {
		return ismenuinterests;
	}

	public void setIsmenuinterests(String ismenuinterests) {
		this.ismenuinterests = ismenuinterests;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsmenuinvoices() {
		return ismenuinvoices;
	}

	public void setIsmenuinvoices(String ismenuinvoices) {
		this.ismenuinvoices = ismenuinvoices;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsmenuorders() {
		return ismenuorders;
	}

	public void setIsmenuorders(String ismenuorders) {
		this.ismenuorders = ismenuorders;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsmenupayments() {
		return ismenupayments;
	}

	public void setIsmenupayments(String ismenupayments) {
		this.ismenupayments = ismenupayments;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsmenuregistrations() {
		return ismenuregistrations;
	}

	public void setIsmenuregistrations(String ismenuregistrations) {
		this.ismenuregistrations = ismenuregistrations;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsmenurequests() {
		return ismenurequests;
	}

	public void setIsmenurequests(String ismenurequests) {
		this.ismenurequests = ismenurequests;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsmenurfqs() {
		return ismenurfqs;
	}

	public void setIsmenurfqs(String ismenurfqs) {
		this.ismenurfqs = ismenurfqs;
	}

	@Basic
	@Column(nullable=false, length=1)
	public String getIsmenushipments() {
		return ismenushipments;
	}

	public void setIsmenushipments(String ismenushipments) {
		this.ismenushipments = ismenushipments;
	}

	@Basic
	@Column(name="M_PRICELIST_ID", nullable=false)
	public Integer getMPricelistId() {
		return mPricelistId;
	}

	public void setMPricelistId(Integer mPricelistId) {
		this.mPricelistId = mPricelistId;
	}

	@Basic
	@Column(name="M_WAREHOUSE_ID", nullable=false)
	public Integer getMWarehouseId() {
		return mWarehouseId;
	}

	public void setMWarehouseId(Integer mWarehouseId) {
		this.mWarehouseId = mWarehouseId;
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
	@Column(name="SALESREP_ID", nullable=false)
	public Integer getSalesrepId() {
		return salesrepId;
	}

	public void setSalesrepId(Integer salesrepId) {
		this.salesrepId = salesrepId;
	}

	@Basic
	@Column(length=60)
	public String getStylesheet() {
		return stylesheet;
	}

	public void setStylesheet(String stylesheet) {
		this.stylesheet = stylesheet;
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

	@Basic
	@Column(nullable=false, length=120)
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Id
	@Column(name="W_STORE_ID")
	public Integer getWStoreId() {
		return wStoreId;
	}

	public void setWStoreId(Integer wStoreId) {
		this.wStoreId = wStoreId;
	}

	@Basic
	@Column(nullable=false, length=20)
	public String getWebcontext() {
		return webcontext;
	}

	public void setWebcontext(String webcontext) {
		this.webcontext = webcontext;
	}

	@Basic
	@Column(length=2000)
	public String getWebinfo() {
		return webinfo;
	}

	public void setWebinfo(String webinfo) {
		this.webinfo = webinfo;
	}

	@Basic
	@Column(length=60)
	public String getWeborderemail() {
		return weborderemail;
	}

	public void setWeborderemail(String weborderemail) {
		this.weborderemail = weborderemail;
	}

	@Basic
	@Column(length=2000)
	public String getWebparam1() {
		return webparam1;
	}

	public void setWebparam1(String webparam1) {
		this.webparam1 = webparam1;
	}

	@Basic
	@Column(length=2000)
	public String getWebparam2() {
		return webparam2;
	}

	public void setWebparam2(String webparam2) {
		this.webparam2 = webparam2;
	}

	@Basic
	@Column(length=2000)
	public String getWebparam3() {
		return webparam3;
	}

	public void setWebparam3(String webparam3) {
		this.webparam3 = webparam3;
	}

	@Basic
	@Column(length=2000)
	public String getWebparam4() {
		return webparam4;
	}

	public void setWebparam4(String webparam4) {
		this.webparam4 = webparam4;
	}

	@Basic
	@Column(length=2000)
	public String getWebparam5() {
		return webparam5;
	}

	public void setWebparam5(String webparam5) {
		this.webparam5 = webparam5;
	}

	@Basic
	@Column(length=2000)
	public String getWebparam6() {
		return webparam6;
	}

	public void setWebparam6(String webparam6) {
		this.webparam6 = webparam6;
	}

	@Basic
	@Column(length=60)
	public String getWstoreemail() {
		return wstoreemail;
	}

	public void setWstoreemail(String wstoreemail) {
		this.wstoreemail = wstoreemail;
	}

	@Basic
	@Column(length=60)
	public String getWstoreuser() {
		return wstoreuser;
	}

	public void setWstoreuser(String wstoreuser) {
		this.wstoreuser = wstoreuser;
	}

	@Basic
	@Column(length=20)
	public String getWstoreuserpw() {
		return wstoreuserpw;
	}

	public void setWstoreuserpw(String wstoreuserpw) {
		this.wstoreuserpw = wstoreuserpw;
	}
}
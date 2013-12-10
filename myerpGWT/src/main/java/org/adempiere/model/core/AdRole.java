package org.adempiere.model.core;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the ad_role database table.
 * 
 */
@Entity
@Table(name="ad_role")
@NamedQuery(name="AdRole.findAll", query="SELECT a FROM AdRole a")
public class AdRole extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long adRoleId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adTreeMenuId;
	private BigDecimal adTreeOrgId;
	private String allowInfoAccount;
	private String allowInfoAsset;
	private String allowInfoBpartner;
	private String allowInfoCashjournal;
	private String allowInfoCrp;
	private String allowInfoInout;
	private String allowInfoInvoice;
	private String allowInfoMrp;
	private String allowInfoOrder;
	private String allowInfoPayment;
	private String allowInfoProduct;
	private String allowInfoResource;
	private String allowInfoSchedule;
	private BigDecimal amtapproval;
	private BigDecimal cCurrencyId;
	private BigDecimal confirmqueryrecords;
	private String connectionprofile;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String isaccessallorgs;
	private String isactive;
	private String iscanapproveowndoc;
	private String iscanexport;
	private String iscanreport;
	private String ischangelog;
	private String isdiscountallowedontotal;
	private String isdiscountuptolimitprice;
	private String ismanual;
	private String ispersonalaccess;
	private String ispersonallock;
	private String isshowacct;
	private String isuseuserorgaccess;
	private BigDecimal maxqueryrecords;
	private String name;
	private String overwritepricelimit;
	private String preferencetype;
	private BigDecimal supervisorId;
	private Timestamp updated;
	private BigDecimal updatedby;
	private BigDecimal userdiscount;
	private String userlevel;

	public AdRole() {
	}


	@Id
	@Column(name="AD_ROLE_ID")
	public long getAdRoleId() {
		return this.adRoleId;
	}

	public void setAdRoleId(long adRoleId) {
		this.adRoleId = adRoleId;
	}


	@Column(name="AD_CLIENT_ID")
	public BigDecimal getAdClientId() {
		return this.adClientId;
	}

	public void setAdClientId(BigDecimal adClientId) {
		this.adClientId = adClientId;
	}


	@Column(name="AD_ORG_ID")
	public BigDecimal getAdOrgId() {
		return this.adOrgId;
	}

	public void setAdOrgId(BigDecimal adOrgId) {
		this.adOrgId = adOrgId;
	}


	@Column(name="AD_TREE_MENU_ID")
	public BigDecimal getAdTreeMenuId() {
		return this.adTreeMenuId;
	}

	public void setAdTreeMenuId(BigDecimal adTreeMenuId) {
		this.adTreeMenuId = adTreeMenuId;
	}


	@Column(name="AD_TREE_ORG_ID")
	public BigDecimal getAdTreeOrgId() {
		return this.adTreeOrgId;
	}

	public void setAdTreeOrgId(BigDecimal adTreeOrgId) {
		this.adTreeOrgId = adTreeOrgId;
	}


	@Column(name="ALLOW_INFO_ACCOUNT")
	public String getAllowInfoAccount() {
		return this.allowInfoAccount;
	}

	public void setAllowInfoAccount(String allowInfoAccount) {
		this.allowInfoAccount = allowInfoAccount;
	}


	@Column(name="ALLOW_INFO_ASSET")
	public String getAllowInfoAsset() {
		return this.allowInfoAsset;
	}

	public void setAllowInfoAsset(String allowInfoAsset) {
		this.allowInfoAsset = allowInfoAsset;
	}


	@Column(name="ALLOW_INFO_BPARTNER")
	public String getAllowInfoBpartner() {
		return this.allowInfoBpartner;
	}

	public void setAllowInfoBpartner(String allowInfoBpartner) {
		this.allowInfoBpartner = allowInfoBpartner;
	}


	@Column(name="ALLOW_INFO_CASHJOURNAL")
	public String getAllowInfoCashjournal() {
		return this.allowInfoCashjournal;
	}

	public void setAllowInfoCashjournal(String allowInfoCashjournal) {
		this.allowInfoCashjournal = allowInfoCashjournal;
	}


	@Column(name="ALLOW_INFO_CRP")
	public String getAllowInfoCrp() {
		return this.allowInfoCrp;
	}

	public void setAllowInfoCrp(String allowInfoCrp) {
		this.allowInfoCrp = allowInfoCrp;
	}


	@Column(name="ALLOW_INFO_INOUT")
	public String getAllowInfoInout() {
		return this.allowInfoInout;
	}

	public void setAllowInfoInout(String allowInfoInout) {
		this.allowInfoInout = allowInfoInout;
	}


	@Column(name="ALLOW_INFO_INVOICE")
	public String getAllowInfoInvoice() {
		return this.allowInfoInvoice;
	}

	public void setAllowInfoInvoice(String allowInfoInvoice) {
		this.allowInfoInvoice = allowInfoInvoice;
	}


	@Column(name="ALLOW_INFO_MRP")
	public String getAllowInfoMrp() {
		return this.allowInfoMrp;
	}

	public void setAllowInfoMrp(String allowInfoMrp) {
		this.allowInfoMrp = allowInfoMrp;
	}


	@Column(name="ALLOW_INFO_ORDER")
	public String getAllowInfoOrder() {
		return this.allowInfoOrder;
	}

	public void setAllowInfoOrder(String allowInfoOrder) {
		this.allowInfoOrder = allowInfoOrder;
	}


	@Column(name="ALLOW_INFO_PAYMENT")
	public String getAllowInfoPayment() {
		return this.allowInfoPayment;
	}

	public void setAllowInfoPayment(String allowInfoPayment) {
		this.allowInfoPayment = allowInfoPayment;
	}


	@Column(name="ALLOW_INFO_PRODUCT")
	public String getAllowInfoProduct() {
		return this.allowInfoProduct;
	}

	public void setAllowInfoProduct(String allowInfoProduct) {
		this.allowInfoProduct = allowInfoProduct;
	}


	@Column(name="ALLOW_INFO_RESOURCE")
	public String getAllowInfoResource() {
		return this.allowInfoResource;
	}

	public void setAllowInfoResource(String allowInfoResource) {
		this.allowInfoResource = allowInfoResource;
	}


	@Column(name="ALLOW_INFO_SCHEDULE")
	public String getAllowInfoSchedule() {
		return this.allowInfoSchedule;
	}

	public void setAllowInfoSchedule(String allowInfoSchedule) {
		this.allowInfoSchedule = allowInfoSchedule;
	}


	public BigDecimal getAmtapproval() {
		return this.amtapproval;
	}

	public void setAmtapproval(BigDecimal amtapproval) {
		this.amtapproval = amtapproval;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	public BigDecimal getConfirmqueryrecords() {
		return this.confirmqueryrecords;
	}

	public void setConfirmqueryrecords(BigDecimal confirmqueryrecords) {
		this.confirmqueryrecords = confirmqueryrecords;
	}


	public String getConnectionprofile() {
		return this.connectionprofile;
	}

	public void setConnectionprofile(String connectionprofile) {
		this.connectionprofile = connectionprofile;
	}


	public Timestamp getCreated() {
		return this.created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}


	public BigDecimal getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(BigDecimal createdby) {
		this.createdby = createdby;
	}


	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public String getIsaccessallorgs() {
		return this.isaccessallorgs;
	}

	public void setIsaccessallorgs(String isaccessallorgs) {
		this.isaccessallorgs = isaccessallorgs;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIscanapproveowndoc() {
		return this.iscanapproveowndoc;
	}

	public void setIscanapproveowndoc(String iscanapproveowndoc) {
		this.iscanapproveowndoc = iscanapproveowndoc;
	}


	public String getIscanexport() {
		return this.iscanexport;
	}

	public void setIscanexport(String iscanexport) {
		this.iscanexport = iscanexport;
	}


	public String getIscanreport() {
		return this.iscanreport;
	}

	public void setIscanreport(String iscanreport) {
		this.iscanreport = iscanreport;
	}


	public String getIschangelog() {
		return this.ischangelog;
	}

	public void setIschangelog(String ischangelog) {
		this.ischangelog = ischangelog;
	}


	public String getIsdiscountallowedontotal() {
		return this.isdiscountallowedontotal;
	}

	public void setIsdiscountallowedontotal(String isdiscountallowedontotal) {
		this.isdiscountallowedontotal = isdiscountallowedontotal;
	}


	public String getIsdiscountuptolimitprice() {
		return this.isdiscountuptolimitprice;
	}

	public void setIsdiscountuptolimitprice(String isdiscountuptolimitprice) {
		this.isdiscountuptolimitprice = isdiscountuptolimitprice;
	}


	public String getIsmanual() {
		return this.ismanual;
	}

	public void setIsmanual(String ismanual) {
		this.ismanual = ismanual;
	}


	public String getIspersonalaccess() {
		return this.ispersonalaccess;
	}

	public void setIspersonalaccess(String ispersonalaccess) {
		this.ispersonalaccess = ispersonalaccess;
	}


	public String getIspersonallock() {
		return this.ispersonallock;
	}

	public void setIspersonallock(String ispersonallock) {
		this.ispersonallock = ispersonallock;
	}


	public String getIsshowacct() {
		return this.isshowacct;
	}

	public void setIsshowacct(String isshowacct) {
		this.isshowacct = isshowacct;
	}


	public String getIsuseuserorgaccess() {
		return this.isuseuserorgaccess;
	}

	public void setIsuseuserorgaccess(String isuseuserorgaccess) {
		this.isuseuserorgaccess = isuseuserorgaccess;
	}


	public BigDecimal getMaxqueryrecords() {
		return this.maxqueryrecords;
	}

	public void setMaxqueryrecords(BigDecimal maxqueryrecords) {
		this.maxqueryrecords = maxqueryrecords;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getOverwritepricelimit() {
		return this.overwritepricelimit;
	}

	public void setOverwritepricelimit(String overwritepricelimit) {
		this.overwritepricelimit = overwritepricelimit;
	}


	public String getPreferencetype() {
		return this.preferencetype;
	}

	public void setPreferencetype(String preferencetype) {
		this.preferencetype = preferencetype;
	}


	@Column(name="SUPERVISOR_ID")
	public BigDecimal getSupervisorId() {
		return this.supervisorId;
	}

	public void setSupervisorId(BigDecimal supervisorId) {
		this.supervisorId = supervisorId;
	}


	public Timestamp getUpdated() {
		return this.updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}


	public BigDecimal getUpdatedby() {
		return this.updatedby;
	}

	public void setUpdatedby(BigDecimal updatedby) {
		this.updatedby = updatedby;
	}


	public BigDecimal getUserdiscount() {
		return this.userdiscount;
	}

	public void setUserdiscount(BigDecimal userdiscount) {
		this.userdiscount = userdiscount;
	}


	public String getUserlevel() {
		return this.userlevel;
	}

	public void setUserlevel(String userlevel) {
		this.userlevel = userlevel;
	}

}
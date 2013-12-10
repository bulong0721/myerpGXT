package org.adempiere.model.business;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.math.BigDecimal;


/**
 * The persistent class for the c_acctschema database table.
 * 
 */
@Entity
@Table(name="c_acctschema")
@NamedQuery(name="CAcctschema.findAll", query="SELECT c FROM CAcctschema c")
public class CAcctschema extends org.adempiere.model.common.ADEntityBase implements Serializable {
	private static final long serialVersionUID = 1L;
	private long cAcctschemaId;
	private BigDecimal adClientId;
	private BigDecimal adOrgId;
	private BigDecimal adOrgonlyId;
	private String autoperiodcontrol;
	private BigDecimal cCurrencyId;
	private BigDecimal cPeriodId;
	private String commitmenttype;
	private String costinglevel;
	private String costingmethod;
	private Timestamp created;
	private BigDecimal createdby;
	private String description;
	private String gaap;
	private String hasalias;
	private String hascombination;
	private String isaccrual;
	private String isactive;
	private String isadjustcogs;
	private String isallownegativeposting;
	private String isdiscountcorrectstax;
	private String isexplicitcostadjustment;
	private String ispostifclearingequal;
	private String ispostservices;
	private String istradediscountposted;
	private BigDecimal mCosttypeId;
	private String name;
	private BigDecimal periodOpenfuture;
	private BigDecimal periodOpenhistory;
	private String processing;
	private String separator;
	private String taxcorrectiontype;
	private Timestamp updated;
	private BigDecimal updatedby;

	public CAcctschema() {
	}


	@Id
	@Column(name="C_ACCTSCHEMA_ID")
	public long getCAcctschemaId() {
		return this.cAcctschemaId;
	}

	public void setCAcctschemaId(long cAcctschemaId) {
		this.cAcctschemaId = cAcctschemaId;
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


	@Column(name="AD_ORGONLY_ID")
	public BigDecimal getAdOrgonlyId() {
		return this.adOrgonlyId;
	}

	public void setAdOrgonlyId(BigDecimal adOrgonlyId) {
		this.adOrgonlyId = adOrgonlyId;
	}


	public String getAutoperiodcontrol() {
		return this.autoperiodcontrol;
	}

	public void setAutoperiodcontrol(String autoperiodcontrol) {
		this.autoperiodcontrol = autoperiodcontrol;
	}


	@Column(name="C_CURRENCY_ID")
	public BigDecimal getCCurrencyId() {
		return this.cCurrencyId;
	}

	public void setCCurrencyId(BigDecimal cCurrencyId) {
		this.cCurrencyId = cCurrencyId;
	}


	@Column(name="C_PERIOD_ID")
	public BigDecimal getCPeriodId() {
		return this.cPeriodId;
	}

	public void setCPeriodId(BigDecimal cPeriodId) {
		this.cPeriodId = cPeriodId;
	}


	public String getCommitmenttype() {
		return this.commitmenttype;
	}

	public void setCommitmenttype(String commitmenttype) {
		this.commitmenttype = commitmenttype;
	}


	public String getCostinglevel() {
		return this.costinglevel;
	}

	public void setCostinglevel(String costinglevel) {
		this.costinglevel = costinglevel;
	}


	public String getCostingmethod() {
		return this.costingmethod;
	}

	public void setCostingmethod(String costingmethod) {
		this.costingmethod = costingmethod;
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


	public String getGaap() {
		return this.gaap;
	}

	public void setGaap(String gaap) {
		this.gaap = gaap;
	}


	public String getHasalias() {
		return this.hasalias;
	}

	public void setHasalias(String hasalias) {
		this.hasalias = hasalias;
	}


	public String getHascombination() {
		return this.hascombination;
	}

	public void setHascombination(String hascombination) {
		this.hascombination = hascombination;
	}


	public String getIsaccrual() {
		return this.isaccrual;
	}

	public void setIsaccrual(String isaccrual) {
		this.isaccrual = isaccrual;
	}


	public String getIsactive() {
		return this.isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}


	public String getIsadjustcogs() {
		return this.isadjustcogs;
	}

	public void setIsadjustcogs(String isadjustcogs) {
		this.isadjustcogs = isadjustcogs;
	}


	public String getIsallownegativeposting() {
		return this.isallownegativeposting;
	}

	public void setIsallownegativeposting(String isallownegativeposting) {
		this.isallownegativeposting = isallownegativeposting;
	}


	public String getIsdiscountcorrectstax() {
		return this.isdiscountcorrectstax;
	}

	public void setIsdiscountcorrectstax(String isdiscountcorrectstax) {
		this.isdiscountcorrectstax = isdiscountcorrectstax;
	}


	public String getIsexplicitcostadjustment() {
		return this.isexplicitcostadjustment;
	}

	public void setIsexplicitcostadjustment(String isexplicitcostadjustment) {
		this.isexplicitcostadjustment = isexplicitcostadjustment;
	}


	public String getIspostifclearingequal() {
		return this.ispostifclearingequal;
	}

	public void setIspostifclearingequal(String ispostifclearingequal) {
		this.ispostifclearingequal = ispostifclearingequal;
	}


	public String getIspostservices() {
		return this.ispostservices;
	}

	public void setIspostservices(String ispostservices) {
		this.ispostservices = ispostservices;
	}


	public String getIstradediscountposted() {
		return this.istradediscountposted;
	}

	public void setIstradediscountposted(String istradediscountposted) {
		this.istradediscountposted = istradediscountposted;
	}


	@Column(name="M_COSTTYPE_ID")
	public BigDecimal getMCosttypeId() {
		return this.mCosttypeId;
	}

	public void setMCosttypeId(BigDecimal mCosttypeId) {
		this.mCosttypeId = mCosttypeId;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name="PERIOD_OPENFUTURE")
	public BigDecimal getPeriodOpenfuture() {
		return this.periodOpenfuture;
	}

	public void setPeriodOpenfuture(BigDecimal periodOpenfuture) {
		this.periodOpenfuture = periodOpenfuture;
	}


	@Column(name="PERIOD_OPENHISTORY")
	public BigDecimal getPeriodOpenhistory() {
		return this.periodOpenhistory;
	}

	public void setPeriodOpenhistory(BigDecimal periodOpenhistory) {
		this.periodOpenhistory = periodOpenhistory;
	}


	public String getProcessing() {
		return this.processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}


	@Column(name="`SEPARATOR`")
	public String getSeparator() {
		return this.separator;
	}

	public void setSeparator(String separator) {
		this.separator = separator;
	}


	public String getTaxcorrectiontype() {
		return this.taxcorrectiontype;
	}

	public void setTaxcorrectiontype(String taxcorrectiontype) {
		this.taxcorrectiontype = taxcorrectiontype;
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

}
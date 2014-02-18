package org.adempiere.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.adempiere.common.ADEntityBase;

/**
 * The persistent class for the ad_tab_v database table.
 * 
 */
@Entity
@Table(name = "ad_tab_v")
public class AdTabV extends ADEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private String				accesslevel;
	private Integer				adColumnId;
	private Integer				adColumnsortorderId;
	private Integer				adColumnsortyesnoId;
	private Integer				adImageId;
	private Integer				adProcessId;
	private Integer				adTabId;
	private Integer				adTableId;
	private Integer				adWindowId;
	private String				commitwarning;
	private String				description;
	private String				displaylogic;
	private String				hasassociation;
	private String				hastree;
	private String				help;
	private Integer				includedTabId;
	private Boolean				isadvancedtab;
	private Boolean				isdeleteable;
	private Boolean				ishighvolume;
	private Boolean				isinfotab;
	private Boolean				isinsertrecord;
	private Boolean				isreadonly;
	private Boolean				issecurityenabled;
	private Boolean				issinglerow;
	private Boolean				issorttab;
	private Boolean				istranslationtab;
	private Boolean				isview;
	private String				name;
	private String				orderbyclause;
	private Integer				parentColumnId;
	private String				readonlylogic;
	private String				replicationtype;
	private Integer				seqno;
	private String				tablename;
	private Integer				tablevel;
	private String				whereclause;

	public AdTabV() {
	}

	public String getAccesslevel() {
		return this.accesslevel;
	}

	public void setAccesslevel(String accesslevel) {
		this.accesslevel = accesslevel;
	}

	@Column(name = "AD_COLUMN_ID")
	public Integer getAdColumnId() {
		return this.adColumnId;
	}

	public void setAdColumnId(Integer adColumnId) {
		this.adColumnId = adColumnId;
	}

	@Column(name = "AD_COLUMNSORTORDER_ID")
	public Integer getAdColumnsortorderId() {
		return this.adColumnsortorderId;
	}

	public void setAdColumnsortorderId(Integer adColumnsortorderId) {
		this.adColumnsortorderId = adColumnsortorderId;
	}

	@Column(name = "AD_COLUMNSORTYESNO_ID")
	public Integer getAdColumnsortyesnoId() {
		return this.adColumnsortyesnoId;
	}

	public void setAdColumnsortyesnoId(Integer adColumnsortyesnoId) {
		this.adColumnsortyesnoId = adColumnsortyesnoId;
	}

	@Column(name = "AD_IMAGE_ID")
	public Integer getAdImageId() {
		return this.adImageId;
	}

	public void setAdImageId(Integer adImageId) {
		this.adImageId = adImageId;
	}

	@Column(name = "AD_PROCESS_ID")
	public Integer getAdProcessId() {
		return this.adProcessId;
	}

	public void setAdProcessId(Integer adProcessId) {
		this.adProcessId = adProcessId;
	}

	@Id
	@Column(name = "AD_TAB_ID")
	public Integer getAdTabId() {
		return this.adTabId;
	}

	public void setAdTabId(Integer adTabId) {
		this.adTabId = adTabId;
	}

	@Column(name = "AD_TABLE_ID")
	public Integer getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(Integer adTableId) {
		this.adTableId = adTableId;
	}

	@Column(name = "AD_WINDOW_ID")
	public Integer getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(Integer adWindowId) {
		this.adWindowId = adWindowId;
	}

	public String getCommitwarning() {
		return this.commitwarning;
	}

	public void setCommitwarning(String commitwarning) {
		this.commitwarning = commitwarning;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDisplaylogic() {
		return this.displaylogic;
	}

	public void setDisplaylogic(String displaylogic) {
		this.displaylogic = displaylogic;
	}

	public String getHasassociation() {
		return this.hasassociation;
	}

	public void setHasassociation(String hasassociation) {
		this.hasassociation = hasassociation;
	}

	public String getHastree() {
		return this.hastree;
	}

	public void setHastree(String hastree) {
		this.hastree = hastree;
	}

	public String getHelp() {
		return this.help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	@Column(name = "INCLUDED_TAB_ID")
	public Integer getIncludedTabId() {
		return this.includedTabId;
	}

	public void setIncludedTabId(Integer includedTabId) {
		this.includedTabId = includedTabId;
	}

	public Boolean getIsadvancedtab() {
		return this.isadvancedtab;
	}

	public void setIsadvancedtab(Boolean isadvancedtab) {
		this.isadvancedtab = isadvancedtab;
	}

	public Boolean getIsdeleteable() {
		return this.isdeleteable;
	}

	public void setIsdeleteable(Boolean isdeleteable) {
		this.isdeleteable = isdeleteable;
	}

	public Boolean getIshighvolume() {
		return this.ishighvolume;
	}

	public void setIshighvolume(Boolean ishighvolume) {
		this.ishighvolume = ishighvolume;
	}

	public Boolean getIsinfotab() {
		return this.isinfotab;
	}

	public void setIsinfotab(Boolean isinfotab) {
		this.isinfotab = isinfotab;
	}

	public Boolean getIsinsertrecord() {
		return this.isinsertrecord;
	}

	public void setIsinsertrecord(Boolean isinsertrecord) {
		this.isinsertrecord = isinsertrecord;
	}

	public Boolean getIsreadonly() {
		return this.isreadonly;
	}

	public void setIsreadonly(Boolean isreadonly) {
		this.isreadonly = isreadonly;
	}

	public Boolean getIssecurityenabled() {
		return this.issecurityenabled;
	}

	public void setIssecurityenabled(Boolean issecurityenabled) {
		this.issecurityenabled = issecurityenabled;
	}

	public Boolean getIssinglerow() {
		return this.issinglerow;
	}

	public void setIssinglerow(Boolean issinglerow) {
		this.issinglerow = issinglerow;
	}

	public Boolean getIssorttab() {
		return this.issorttab;
	}

	public void setIssorttab(Boolean issorttab) {
		this.issorttab = issorttab;
	}

	public Boolean getIstranslationtab() {
		return this.istranslationtab;
	}

	public void setIstranslationtab(Boolean istranslationtab) {
		this.istranslationtab = istranslationtab;
	}

	public Boolean getIsview() {
		return this.isview;
	}

	public void setIsview(Boolean isview) {
		this.isview = isview;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrderbyclause() {
		return this.orderbyclause;
	}

	public void setOrderbyclause(String orderbyclause) {
		this.orderbyclause = orderbyclause;
	}

	@Column(name = "PARENT_COLUMN_ID")
	public Integer getParentColumnId() {
		return this.parentColumnId;
	}

	public void setParentColumnId(Integer parentColumnId) {
		this.parentColumnId = parentColumnId;
	}

	public String getReadonlylogic() {
		return this.readonlylogic;
	}

	public void setReadonlylogic(String readonlylogic) {
		this.readonlylogic = readonlylogic;
	}

	public String getReplicationtype() {
		return this.replicationtype;
	}

	public void setReplicationtype(String replicationtype) {
		this.replicationtype = replicationtype;
	}

	public Integer getSeqno() {
		return this.seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	public String getTablename() {
		return this.tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public Integer getTablevel() {
		return this.tablevel;
	}

	public void setTablevel(Integer tablevel) {
		this.tablevel = tablevel;
	}

	public String getWhereclause() {
		return this.whereclause;
	}

	public void setWhereclause(String whereclause) {
		this.whereclause = whereclause;
	}

}
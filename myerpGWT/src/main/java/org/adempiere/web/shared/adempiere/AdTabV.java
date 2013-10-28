package org.adempiere.web.shared.adempiere;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.adempiere.web.shared.AdEntityBase;


/**
 * The persistent class for the ad_tab_v database table.
 * 
 */
@Entity
@Table(name = "ad_tab_v")
public class AdTabV extends AdEntityBase implements Serializable {
	private static final long	serialVersionUID	= 1L;
	private String				accesslevel;
	private Long				adColumnId;
	private Long				adColumnsortorderId;
	private Long				adColumnsortyesnoId;
	private Long				adImageId;
	private Long				adProcessId;
	private Long				adTabId;
	private Long				adTableId;
	private Long				adWindowId;
	private String				commitwarning;
	private String				description;
	private String				displaylogic;
	private String				hasassociation;
	private String				hastree;
	private String				help;
	private Long				includedTabId;
	private String				isadvancedtab;
	private String				isdeleteable;
	private String				ishighvolume;
	private String				isinfotab;
	private String				isinsertrecord;
	private String				isreadonly;
	private String				issecurityenabled;
	private String				issinglerow;
	private String				issorttab;
	private String				istranslationtab;
	private String				isview;
	private String				name;
	private String				orderbyclause;
	private Long				parentColumnId;
	private String				readonlylogic;
	private String				replicationtype;
	private Long				seqno;
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
	public Long getAdColumnId() {
		return this.adColumnId;
	}

	public void setAdColumnId(Long adColumnId) {
		this.adColumnId = adColumnId;
	}

	@Column(name = "AD_COLUMNSORTORDER_ID")
	public Long getAdColumnsortorderId() {
		return this.adColumnsortorderId;
	}

	public void setAdColumnsortorderId(Long adColumnsortorderId) {
		this.adColumnsortorderId = adColumnsortorderId;
	}

	@Column(name = "AD_COLUMNSORTYESNO_ID")
	public Long getAdColumnsortyesnoId() {
		return this.adColumnsortyesnoId;
	}

	public void setAdColumnsortyesnoId(Long adColumnsortyesnoId) {
		this.adColumnsortyesnoId = adColumnsortyesnoId;
	}

	@Column(name = "AD_IMAGE_ID")
	public Long getAdImageId() {
		return this.adImageId;
	}

	public void setAdImageId(Long adImageId) {
		this.adImageId = adImageId;
	}

	@Column(name = "AD_PROCESS_ID")
	public Long getAdProcessId() {
		return this.adProcessId;
	}

	public void setAdProcessId(Long adProcessId) {
		this.adProcessId = adProcessId;
	}

	@Id
	@Column(name = "AD_TAB_ID")
	public Long getAdTabId() {
		return this.adTabId;
	}

	public void setAdTabId(Long adTabId) {
		this.adTabId = adTabId;
	}

	@Column(name = "AD_TABLE_ID")
	public Long getAdTableId() {
		return this.adTableId;
	}

	public void setAdTableId(Long adTableId) {
		this.adTableId = adTableId;
	}

	@Column(name = "AD_WINDOW_ID")
	public Long getAdWindowId() {
		return this.adWindowId;
	}

	public void setAdWindowId(Long adWindowId) {
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
	public Long getIncludedTabId() {
		return this.includedTabId;
	}

	public void setIncludedTabId(Long includedTabId) {
		this.includedTabId = includedTabId;
	}

	public String getIsadvancedtab() {
		return this.isadvancedtab;
	}

	public void setIsadvancedtab(String isadvancedtab) {
		this.isadvancedtab = isadvancedtab;
	}

	public String getIsdeleteable() {
		return this.isdeleteable;
	}

	public void setIsdeleteable(String isdeleteable) {
		this.isdeleteable = isdeleteable;
	}

	public String getIshighvolume() {
		return this.ishighvolume;
	}

	public void setIshighvolume(String ishighvolume) {
		this.ishighvolume = ishighvolume;
	}

	public String getIsinfotab() {
		return this.isinfotab;
	}

	public void setIsinfotab(String isinfotab) {
		this.isinfotab = isinfotab;
	}

	public String getIsinsertrecord() {
		return this.isinsertrecord;
	}

	public void setIsinsertrecord(String isinsertrecord) {
		this.isinsertrecord = isinsertrecord;
	}

	public String getIsreadonly() {
		return this.isreadonly;
	}

	public void setIsreadonly(String isreadonly) {
		this.isreadonly = isreadonly;
	}

	public String getIssecurityenabled() {
		return this.issecurityenabled;
	}

	public void setIssecurityenabled(String issecurityenabled) {
		this.issecurityenabled = issecurityenabled;
	}

	public String getIssinglerow() {
		return this.issinglerow;
	}

	public void setIssinglerow(String issinglerow) {
		this.issinglerow = issinglerow;
	}

	public String getIssorttab() {
		return this.issorttab;
	}

	public void setIssorttab(String issorttab) {
		this.issorttab = issorttab;
	}

	public String getIstranslationtab() {
		return this.istranslationtab;
	}

	public void setIstranslationtab(String istranslationtab) {
		this.istranslationtab = istranslationtab;
	}

	public String getIsview() {
		return this.isview;
	}

	public void setIsview(String isview) {
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
	public Long getParentColumnId() {
		return this.parentColumnId;
	}

	public void setParentColumnId(Long parentColumnId) {
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

	public Long getSeqno() {
		return this.seqno;
	}

	public void setSeqno(Long seqno) {
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
package org.adempiere.web.client.model;

import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;

import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.data.shared.IconProvider;

public class MenuModel implements ExchangeModel, NodeModel {
	private Boolean				isactive;
	private Integer				adMenuId;
	private Integer				parentId;
	private Integer				adFormId;
	private Integer				adProcessId;
	private Integer				adTaskId;
	private Integer				adWindowId;
	private Integer				adWorkbenchId;
	private Integer				adWorkflowId;
	private Integer				seqno;
	private String				action;
	private String				name;
	private boolean				summary;

	/** Window = W */
	public static final String	ACTION_Window		= "W";
	/** Task = T */
	public static final String	ACTION_Task			= "T";
	/** WorkFlow = F */
	public static final String	ACTION_WorkFlow		= "F";
	/** Process = P */
	public static final String	ACTION_Process		= "P";
	/** Report = R */
	public static final String	ACTION_Report		= "R";
	/** Form = X */
	public static final String	ACTION_Form			= "X";
	/** Workbench = B */
	public static final String	ACTION_Workbench	= "B";

	public static final int		TREE_ID				= 10;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.adempiere.web.client.model.IAdTreeNode#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSummary() {
		return summary;
	}

	public void setSummary(boolean summary) {
		this.summary = summary;
	}

	public Boolean getIsactive() {
		return isactive;
	}

	public void setIsactive(Boolean isactive) {
		this.isactive = isactive;
	}

	public Integer getAdMenuId() {
		return adMenuId;
	}

	public void setAdMenuId(Integer adMenuId) {
		this.adMenuId = adMenuId;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getAdFormId() {
		return adFormId;
	}

	public void setAdFormId(Integer adFormId) {
		this.adFormId = adFormId;
	}

	public Integer getAdProcessId() {
		return adProcessId;
	}

	public void setAdProcessId(Integer adProcessId) {
		this.adProcessId = adProcessId;
	}

	public Integer getAdTaskId() {
		return adTaskId;
	}

	public void setAdTaskId(Integer adTaskId) {
		this.adTaskId = adTaskId;
	}

	public Integer getAdWindowId() {
		return adWindowId;
	}

	public void setAdWindowId(Integer adWindowId) {
		this.adWindowId = adWindowId;
	}

	public Integer getAdWorkbenchId() {
		return adWorkbenchId;
	}

	public void setAdWorkbenchId(Integer adWorkbenchId) {
		this.adWorkbenchId = adWorkbenchId;
	}

	public Integer getAdWorkflowId() {
		return adWorkflowId;
	}

	public void setAdWorkflowId(Integer adWorkflowId) {
		this.adWorkflowId = adWorkflowId;
	}

	public Integer getSeqno() {
		return seqno;
	}

	public void setSeqno(Integer seqno) {
		this.seqno = seqno;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public Integer getID() {
		return adMenuId;
	}

	public static IconProvider<NodeModel> createIconProvider() {
		return new IconProvider<NodeModel>() {
			@Override
			public ImageResource getIcon(NodeModel node) {
				MenuModel model = (MenuModel) node;
				if (null == model) {
					return null;
				}
				Images images = ResourcesFactory.getImages();
				if (ACTION_Form.equalsIgnoreCase(model.getAction())) {
					return images.application16();
				}
				if (ACTION_Process.equalsIgnoreCase(model.getAction())) {
					return images.process16();
				}
				if (ACTION_Report.equalsIgnoreCase(model.getAction())) {
					return images.report16();
				}
				if (ACTION_Task.equalsIgnoreCase(model.getAction())) {
					return images.assignment16();
				}
				if (ACTION_Window.equalsIgnoreCase(model.getAction())) {
					return images.mWindow();
				}
				if (ACTION_Workbench.equalsIgnoreCase(model.getAction())) {
					return images.preference16();
				}
				if (ACTION_WorkFlow.equalsIgnoreCase(model.getAction())) {
					return images.workFlow16();
				}
				return null;
			}
		};
	}

	@Override
	public boolean hasChildren() {
		return isSummary();
	}

	@Override
	public Integer getParentID() {
		return parentId;
	}

	@Override
	public void setParentID(int parentId) {
		this.parentId = parentId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adMenuId == null) ? 0 : adMenuId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuModel other = (MenuModel) obj;
		if (adMenuId == null) {
			if (other.adMenuId != null)
				return false;
		} else if (!adMenuId.equals(other.adMenuId))
			return false;
		return true;
	}

}

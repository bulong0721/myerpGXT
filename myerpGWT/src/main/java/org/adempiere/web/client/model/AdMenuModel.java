package org.adempiere.web.client.model;

import java.io.Serializable;

import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;

import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.data.shared.IconProvider;

public class AdMenuModel implements Serializable, IAdTreeNode {
	private static final long	serialVersionUID	= 1L;
	private String				isactive;
	private Long				adMenuId;
	private Long				parentId;
	private Long				adFormId;
	private Long				adProcessId;
	private Long				adTaskId;
	private Long				adWindowId;
	private Long				adWorkbenchId;
	private Long				adWorkflowId;
	private Long				seqno;
	private String				action;
	private String				name;

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

	public static final int		TREE_ID				= 20;

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

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public Long getAdMenuId() {
		return adMenuId;
	}

	public void setAdMenuId(Long adMenuId) {
		this.adMenuId = adMenuId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getAdFormId() {
		return adFormId;
	}

	public void setAdFormId(Long adFormId) {
		this.adFormId = adFormId;
	}

	public Long getAdProcessId() {
		return adProcessId;
	}

	public void setAdProcessId(Long adProcessId) {
		this.adProcessId = adProcessId;
	}

	public Long getAdTaskId() {
		return adTaskId;
	}

	public void setAdTaskId(Long adTaskId) {
		this.adTaskId = adTaskId;
	}

	public Long getAdWindowId() {
		return adWindowId;
	}

	public void setAdWindowId(Long adWindowId) {
		this.adWindowId = adWindowId;
	}

	public Long getAdWorkbenchId() {
		return adWorkbenchId;
	}

	public void setAdWorkbenchId(Long adWorkbenchId) {
		this.adWorkbenchId = adWorkbenchId;
	}

	public Long getAdWorkflowId() {
		return adWorkflowId;
	}

	public void setAdWorkflowId(Long adWorkflowId) {
		this.adWorkflowId = adWorkflowId;
	}

	public Long getSeqno() {
		return seqno;
	}

	public void setSeqno(Long seqno) {
		this.seqno = seqno;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public Long getID() {
		return adMenuId;
	}

	public static IconProvider<IAdTreeNode> createIconProvider() {
		return new IconProvider<IAdTreeNode>() {
			@Override
			public ImageResource getIcon(IAdTreeNode node) {
				AdMenuModel model = (AdMenuModel) node;
				if (null == model) {
					return null;
				}
				Images images = ResourcesFactory.createImages();
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
		return null == getAction() || 0 == getAction().length();
	}

	@Override
	public Long getParentID() {
		return parentId;
	}
}

package org.adempiere.web.client.model;

import java.io.Serializable;

import org.adempiere.web.client.resources.Images;
import org.adempiere.web.client.resources.ResourcesFactory;
import org.adempiere.web.shared.adempiere.AdTreenodemm;

import com.google.gwt.resources.client.ImageResource;
import com.sencha.gxt.core.client.ValueProvider;
import com.sencha.gxt.data.shared.IconProvider;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.Store;
import com.sencha.gxt.data.shared.TreeStore;
import com.sencha.gxt.widget.core.client.form.StoreFilterField;

public class AdMenuModel implements Serializable {
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

	public AdMenuModel() {
	}

	public AdMenuModel(AdTreenodemm menuNode) {
		this.isactive = menuNode.getIsactive();
		this.adMenuId = menuNode.getId().getNodeId();
		this.parentId = menuNode.getParentId();
		this.seqno = menuNode.getSeqno();
		if (null != menuNode.getAdMenu()) {
			this.name = menuNode.getAdMenu().getName();
			this.adFormId = menuNode.getAdMenu().getAdFormId();
			this.adProcessId = menuNode.getAdMenu().getAdProcessId();
			this.adTaskId = menuNode.getAdMenu().getAdTaskId();
			this.adWindowId = menuNode.getAdMenu().getAdWindowId();
			this.adWorkbenchId = menuNode.getAdMenu().getAdWorkbenchId();
			this.adWorkflowId = menuNode.getAdMenu().getAdWorkflowId();
			this.action = menuNode.getAdMenu().getAction();
		}
	}

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

	public static class NameFilterField extends StoreFilterField<AdMenuModel> {
		@Override
		protected boolean doSelect(Store<AdMenuModel> store, AdMenuModel parent, AdMenuModel item, String filter) {
			if (null != parent && null != filter) {
				String itemName = parent.getName().toLowerCase();
				return itemName.contains(filter.toLowerCase());
			}
			if (null != item && null != filter) {
				String itemName = item.getName().toLowerCase();
				return itemName.contains(filter.toLowerCase());
			}
			return false;
		}
	}

	public static TreeStore<AdMenuModel> createTreeStore() {
		ModelKeyProvider<AdMenuModel> keyProvider = new MenuKeyProvider();
		TreeStore<AdMenuModel> store = new TreeStore<AdMenuModel>(keyProvider);
		return store;
	}

	public static IconProvider<AdMenuModel> createIconProvider() {
		return new IconProvider<AdMenuModel>() {
			@Override
			public ImageResource getIcon(AdMenuModel model) {
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

	static class MenuKeyProvider implements ModelKeyProvider<AdMenuModel> {
		@Override
		public String getKey(AdMenuModel item) {
			return String.valueOf(item.getAdMenuId());
		}
	}

	public static class MenuValueProvider implements ValueProvider<AdMenuModel, String> {

		@Override
		public String getValue(AdMenuModel model) {
			return model.getName();
		}

		@Override
		public void setValue(AdMenuModel object, String value) {
		}

		@Override
		public String getPath() {
			return "name";
		}
	}

}

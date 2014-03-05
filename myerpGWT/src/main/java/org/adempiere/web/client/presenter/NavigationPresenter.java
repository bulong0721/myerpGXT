package org.adempiere.web.client.presenter;

import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.model.ADMenuModel;
import org.adempiere.web.client.model.IsTreeNode;
import org.adempiere.web.client.presenter.interfaces.INavigationView;
import org.adempiere.web.client.presenter.interfaces.INavigationView.INavigationPresenter;
import org.adempiere.web.client.util.StringUtil;
import org.adempiere.web.client.view.NavigationView;

import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.sencha.gxt.widget.core.client.tree.Tree;

@Presenter(view = NavigationView.class)
public class NavigationPresenter extends BasePresenter<INavigationView, MyerpEventBus> implements INavigationPresenter {
	private boolean	hadLoaded;

	public void onLoadMenu() {
		if (null != view.getTreePanel() && !hadLoaded) {
//			view.getTreePanel().loadTree();
			hadLoaded = true;
		}
	}

	@Override
	public void bind() {
		Tree<IsTreeNode, String> tree = view.getTreePanel().getTree();
		tree.getSelectionModel().addSelectionHandler(new SelectionHandler<IsTreeNode>() {
			@Override
			public void onSelection(SelectionEvent<IsTreeNode> event) {
				ADMenuModel item = (ADMenuModel) event.getSelectedItem();
				if (!StringUtil.isNullOrEmpty(item.getAction())) {
					getEventBus().showPage(item);
				}
			}
		});
	}
}

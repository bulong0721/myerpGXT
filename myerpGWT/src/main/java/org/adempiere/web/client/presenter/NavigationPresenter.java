package org.adempiere.web.client.presenter;

import java.util.List;

import org.adempiere.web.client.MyerpEventBus;
import org.adempiere.web.client.model.MenuModel;
import org.adempiere.web.client.model.NodeModel;
import org.adempiere.web.client.presenter.interfaces.INavigationView;
import org.adempiere.web.client.presenter.interfaces.INavigationView.INavigationPresenter;
import org.adempiere.web.client.util.StringUtil;
import org.adempiere.web.client.view.NavigationView;

import com.mvp4g.client.annotation.Presenter;
import com.mvp4g.client.presenter.BasePresenter;
import com.sencha.gxt.core.client.Style.SelectionMode;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent;
import com.sencha.gxt.widget.core.client.selection.SelectionChangedEvent.SelectionChangedHandler;
import com.sencha.gxt.widget.core.client.tree.Tree;

@Presenter(view = NavigationView.class)
public class NavigationPresenter extends BasePresenter<INavigationView, MyerpEventBus> implements INavigationPresenter {

	public void onLoadNavigation() {
		Tree<NodeModel, String> tree = view.getTreePanel().getTree();
		SelectionChangedHandler<NodeModel> selectHandler = new SelectionChangedHandler<NodeModel>() {
			@Override
			public void onSelectionChanged(SelectionChangedEvent<NodeModel> event) {
				List<NodeModel> sels = event.getSelection();
				if (sels.size() > 0) {
					MenuModel m = (MenuModel) sels.get(0);
					if (!StringUtil.isNullOrEmpty(m.getAction())) {
						getEventBus().showPage(m);
					}
				}
			}
		};
		tree.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		tree.getSelectionModel().addSelectionChangedHandler(selectHandler);
	}
}

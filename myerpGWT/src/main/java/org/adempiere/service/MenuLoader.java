package org.adempiere.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.adempiere.common.MenuActionType;
import org.adempiere.model.ADMenu;
import org.adempiere.model.ADMenuVt;
import org.adempiere.security.ACLProviders;
import org.adempiere.service.CacheManager.Loader;
import org.adempiere.util.DTOUtil;
import org.adempiere.util.POUtil;
import org.adempiere.web.client.model.MenuModel;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.gwt.thirdparty.guava.common.collect.Maps;

public class MenuLoader implements Loader<Integer, Map<Integer, List<MenuModel>>> {

    private List<MenuModel> menuList;
    private int             languageID;
    private PersistContext  pCtx;

    public MenuLoader(PersistContext pCtx, int languageID){
        super();
        this.pCtx = pCtx;
        this.languageID = languageID;
    }

    private void trimEmptyNodes(MenuLoader.PostOrderItr itr) {
        while (itr.hasNext()) {
            MenuModel elem = itr.next();
            if (elem.isSummary() && !itr.hasChildren(elem)) {
                itr.removeFromParent(elem);
            }
        }
    }

    private boolean hasPermission(MenuModel node, int roleID) {
        MenuActionType action = MenuActionType.fromString(node.getAction());
        if (action.isWindow()) {
            return ACLProviders.getWindowProvider().getAccessList(roleID).containsKey(node.getAdWindowId());
        } else if (action.isProcess() || action.isReport()) {
            return ACLProviders.getProcessProvider().getAccessList(roleID).containsKey(node.getAdProcessId());
        } else if (action.isForm()) {
            return ACLProviders.getFormProvider().getAccessList(roleID).containsKey(node.getAdFormId());
        } else if (action.isWorkFlow()) {
            return ACLProviders.getWorkflowProvider().getAccessList(roleID).containsKey(node.getAdWorkflowId());
        }
        return true;
    }

    static class PostOrderItr implements Iterator<MenuModel> {

        protected Map<Integer, List<MenuModel>> tree;
        protected Stack<MenuModel>              stack;

        public PostOrderItr(Map<Integer, List<MenuModel>> tree){
            this.tree = tree;
            this.stack = new Stack<MenuModel>();
            this.pushPostOrder(tree.get(0));
        }

        public void removeFromParent(MenuModel elem) {
            List<MenuModel> nodes = tree.get(elem.getParentID());
            if (null != nodes) {
                nodes.remove(elem);
            }
        }

        public boolean hasChildren(MenuModel elem) {
            List<MenuModel> children = tree.get(elem.getID());
            if (null != children) {
                return !children.isEmpty();
            }
            return false;
        }

        private void pushPostOrder(List<MenuModel> children) {
            for (MenuModel node : children) {
                this.stack.push(node);
                if (node.isSummary() && tree.containsKey(node.getID())) {
                    pushPostOrder(tree.get(node.getID()));
                }
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.empty();
        }

        @Override
        public MenuModel next() {
            return stack.pop();
        }

        @Override
        public void remove() {
        }
    }

    @Override
    public Map<Integer, List<MenuModel>> apply(Integer roleID) {
        Map<Integer, List<MenuModel>> leafMap = Maps.newHashMap();
        for (MenuModel node : menuList) {
            if (!hasPermission(node, roleID)) {
                continue;
            }
            List<MenuModel> nodeList = leafMap.get(node.getParentID());
            if (null == nodeList) {
                nodeList = Lists.newArrayList();
                leafMap.put(node.getParentID(), nodeList);
            }
            nodeList.add(node);
        }
        MenuLoader.PostOrderItr poi = new PostOrderItr(leafMap);
        trimEmptyNodes(poi);
        return leafMap;
    }

    @Override
    public void reset() {
        if (0 == languageID) {
            List<ADMenu> resultList = POUtil.queryMenuNodes(pCtx);
            this.menuList = Lists.transform(resultList, new Function<ADMenu, MenuModel>() {

                @Override
                public MenuModel apply(ADMenu input) {
                    return DTOUtil.toMenuModel(input);
                }
            });
        } else {
            List<ADMenuVt> resultList = POUtil.queryMenuByLanguage(pCtx, languageID);
            this.menuList = Lists.transform(resultList, new Function<ADMenuVt, MenuModel>() {

                @Override
                public MenuModel apply(ADMenuVt input) {
                    return DTOUtil.toMenuModel(input);
                }
            });
        }
    }
}

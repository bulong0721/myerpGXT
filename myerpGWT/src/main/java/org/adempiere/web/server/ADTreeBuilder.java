package org.adempiere.web.server;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.adempiere.model.ADTreeNode;
import org.adempiere.persist.PersistContext;
import org.adempiere.util.POUtil;
import org.adempiere.web.client.model.IsTreeNode;

public abstract class ADTreeBuilder<T extends ADTreeNode> {
	public static final int	TREE_MENU	= 10;
	private int				adTreeId;
	private final Type		type;

	public ADTreeBuilder(int adTreeId) {
		Type superClass = getClass().getGenericSuperclass();
		type = ((ParameterizedType) superClass).getActualTypeArguments()[0];
		this.adTreeId = adTreeId;
	}

	@SuppressWarnings("unchecked")
	public Class<T> getEntityClass() {
		return (Class<T>) type;
	}

	public List<T> getRootNodes(PersistContext pCtx, int userId) {
		return POUtil.queryRootNodes(pCtx, getEntityClass(), adTreeId, userId);
	}

	public List<T> getSubNodes(PersistContext pCtx, int parentId) {
		return POUtil.querySubNodes(pCtx, getEntityClass(), parentId);
	}

	public abstract IsTreeNode toModel(T entity);

	public List<IsTreeNode> toModels(List<T> entityList) {
		List<IsTreeNode> resultList = new ArrayList<IsTreeNode>(entityList.size());
		for (T entity : entityList) {
			resultList.add(toModel(entity));
		}
		return resultList;
	}

	public static ADTreeBuilder<?> createTreeBuilder(int adTreeId) {
		switch (adTreeId) {
		case TREE_MENU:
			return new ADMenuBuilder(adTreeId);
		default:
			throw new RuntimeException("Can't create ADTreeBuilder for treeid:" + adTreeId);
		}
	}
}

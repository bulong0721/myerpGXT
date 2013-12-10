package org.adempiere.web.client.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.adempiere.model.common.LookupValue;
import org.adempiere.web.client.model.ADTreeNode;
import org.adempiere.web.client.model.ADTreeNode.TreeKeyProvider;

import com.sencha.gxt.data.shared.LabelProvider;
import com.sencha.gxt.data.shared.ListStore;
import com.sencha.gxt.data.shared.ModelKeyProvider;
import com.sencha.gxt.data.shared.TreeStore;

public class CommonUtil {
	
	public static boolean isNullOrEmpty(Collection<?> collection) {
		if (null == collection || collection.size() <= 0) {
			return true;
		}
		return false;
	}

	public static class LookupKeyProvider implements ModelKeyProvider<LookupValue> {
		@Override
		public String getKey(LookupValue item) {
			return item.getValue();
		}
	}

	public static class LookupLabelProvider implements LabelProvider<LookupValue> {
		@Override
		public String getLabel(LookupValue item) {
			return item.getDisplay();
		}
	}
	
	public static ModelKeyProvider<LookupValue> createKeyProvider() {
		return new LookupKeyProvider();
	}

	public static LabelProvider<LookupValue> createLabelProvider() {
		return new LookupLabelProvider();
	}

	public static List<LookupValue> toLookups(Map<String, String> lookupMap) {
		List<LookupValue> lookups = new ArrayList<LookupValue>(lookupMap.size());
		for (Map.Entry<String, String> entry : lookupMap.entrySet()) {
			lookups.add(new LookupValue(entry.getKey(), entry.getValue()));
		}
		return lookups;
	}

	public static ListStore<LookupValue> createDataSource(Collection<LookupValue> items) {
		LookupKeyProvider keyProvider = new LookupKeyProvider();
		ListStore<LookupValue> store = new ListStore<LookupValue>(keyProvider);
		store.addAll(items);
		return store;
	}

	public static ListStore<LookupValue> createDataSource(LookupValue... items) {
		return createDataSource(Arrays.asList(items));
	}
	
	public static TreeStore<ADTreeNode> createTreeStore() {
		ModelKeyProvider<ADTreeNode> keyProvider = new TreeKeyProvider();
		TreeStore<ADTreeNode> store = new TreeStore<ADTreeNode>(keyProvider);
		return store;
	}
}

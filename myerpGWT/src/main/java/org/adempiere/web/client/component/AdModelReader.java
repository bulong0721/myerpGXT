package org.adempiere.web.client.component;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.web.client.model.AdJSONData;
import org.adempiere.web.client.model.AdModelData;
import org.adempiere.web.client.util.JSOUtil;

import com.google.gwt.core.client.JavaScriptObject;
import com.sencha.gxt.data.shared.loader.DataReader;
import com.sencha.gxt.data.shared.loader.PagingLoadResult;
import com.sencha.gxt.data.shared.loader.PagingLoadResultBean;

public class AdModelReader implements DataReader<PagingLoadResult<AdModelData>, AdJSONData> {

	@Override
	public PagingLoadResult<AdModelData> read(Object loadConfig, AdJSONData data) {
		PagingLoadResultBean<AdModelData> pagingResult = new PagingLoadResultBean<AdModelData>();
		JavaScriptObject jsoObject = JSOUtil.eval(data.getData());
		JavaScriptObject[] jsoArray = JSOUtil.toArray(jsoObject);
		List<AdModelData> modelList = new ArrayList<AdModelData>(jsoArray.length);
		for (JavaScriptObject jso : jsoArray) {
			AdModelData modelData = new AdModelData(jso);
			modelList.add(modelData);
		}
		pagingResult.setData(modelList);
		pagingResult.setTotalLength(modelList.size());
		pagingResult.setOffset(0);
		return pagingResult;
	}

}

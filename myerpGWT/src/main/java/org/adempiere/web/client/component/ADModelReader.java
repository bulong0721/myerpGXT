package org.adempiere.web.client.component;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.web.client.model.ADJSONData;
import org.adempiere.web.client.model.ADLoadConfig;
import org.adempiere.web.client.model.ADModelData;
import org.adempiere.web.client.model.ADMapData;
import org.adempiere.web.client.util.JSOUtil;

import com.google.gwt.core.client.JavaScriptObject;
import com.sencha.gxt.data.shared.loader.DataReader;
import com.sencha.gxt.data.shared.loader.PagingLoadResult;
import com.sencha.gxt.data.shared.loader.PagingLoadResultBean;

public class ADModelReader implements DataReader<PagingLoadResult<ADMapData>, ADJSONData> {

	@Override
	public PagingLoadResult<ADMapData> read(Object loadConfig, ADJSONData data) {
		ADLoadConfig adLoadCfg = (ADLoadConfig) loadConfig;
		PagingLoadResultBean<ADMapData> pagingResult = new PagingLoadResultBean<ADMapData>();
		JavaScriptObject jsoObject = JSOUtil.eval(data.getData());
		JavaScriptObject[] jsoArray = JSOUtil.toArray(jsoObject);
		List<ADMapData> modelList = new ArrayList<ADMapData>(jsoArray.length);
		for (JavaScriptObject jso : jsoArray) {
			ADModelData modelData = new ADModelData(jso);
			modelList.add(modelData);
		}
		pagingResult.setData(modelList);
		pagingResult.setTotalLength((int)data.getTotalCount());
		pagingResult.setOffset(adLoadCfg.getOffset());
		return pagingResult;
	}

}

package org.adempiere.web.client.component;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.web.client.model.AdJSONData;
import org.adempiere.web.client.model.AdLoadConfig;
import org.adempiere.web.client.model.AdModelData;
import org.adempiere.web.client.model.MapAccessable;
import org.adempiere.web.client.util.JSOUtil;

import com.google.gwt.core.client.JavaScriptObject;
import com.sencha.gxt.data.shared.loader.DataReader;
import com.sencha.gxt.data.shared.loader.PagingLoadResult;
import com.sencha.gxt.data.shared.loader.PagingLoadResultBean;

public class AdModelReader implements DataReader<PagingLoadResult<MapAccessable>, AdJSONData> {

	@Override
	public PagingLoadResult<MapAccessable> read(Object loadConfig, AdJSONData data) {
		AdLoadConfig adLoadCfg = (AdLoadConfig) loadConfig;
		PagingLoadResultBean<MapAccessable> pagingResult = new PagingLoadResultBean<MapAccessable>();
		JavaScriptObject jsoObject = JSOUtil.eval(data.getData());
		JavaScriptObject[] jsoArray = JSOUtil.toArray(jsoObject);
		List<MapAccessable> modelList = new ArrayList<MapAccessable>(jsoArray.length);
		for (JavaScriptObject jso : jsoArray) {
			AdModelData modelData = new AdModelData(jso);
			modelList.add(modelData);
		}
		pagingResult.setData(modelList);
		pagingResult.setTotalLength((int)data.getTotalCount());
		pagingResult.setOffset(adLoadCfg.getOffset());
		return pagingResult;
	}

}

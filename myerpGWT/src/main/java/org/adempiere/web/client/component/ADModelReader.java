package org.adempiere.web.client.component;

import java.util.ArrayList;
import java.util.List;

import org.adempiere.web.client.model.JsonResult;
import org.adempiere.web.client.model.PageRequest;
import org.adempiere.web.client.model.JSOEntry;
import org.adempiere.web.client.model.MapEntry;
import org.adempiere.web.client.util.JSOUtil;

import com.google.gwt.core.client.JavaScriptObject;
import com.sencha.gxt.data.shared.loader.DataReader;
import com.sencha.gxt.data.shared.loader.PagingLoadResult;
import com.sencha.gxt.data.shared.loader.PagingLoadResultBean;

public class ADModelReader implements DataReader<PagingLoadResult<MapEntry>, JsonResult> {

	@Override
	public PagingLoadResult<MapEntry> read(Object loadConfig, JsonResult data) {
		PageRequest adLoadCfg = (PageRequest) loadConfig;
		PagingLoadResultBean<MapEntry> pagingResult = new PagingLoadResultBean<MapEntry>();
		JavaScriptObject jsoObject = JSOUtil.eval(data.getData());
		JavaScriptObject[] jsoArray = JSOUtil.toArray(jsoObject);
		List<MapEntry> modelList = new ArrayList<MapEntry>(jsoArray.length);
		for (JavaScriptObject jso : jsoArray) {
			JSOEntry modelData = new JSOEntry(jso);
			modelList.add(modelData);
		}
		pagingResult.setData(modelList);
		pagingResult.setTotalLength((int)data.getTotalCount());
		pagingResult.setOffset(adLoadCfg.getOffset());
		return pagingResult;
	}

}

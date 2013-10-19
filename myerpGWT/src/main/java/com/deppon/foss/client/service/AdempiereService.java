package com.deppon.foss.client.service;

import java.util.List;

import com.deppon.foss.client.model.AdJSONData;
import com.deppon.foss.client.model.AdLoadConfig;
import com.deppon.foss.client.model.AdMenuModel;
import com.deppon.foss.client.model.AdWindowModel;
import com.deppon.foss.shared.AdModelKey;
import com.deppon.foss.shared.LookupValue;
import com.deppon.foss.shared.adempiere.ADUserContext;
import com.deppon.foss.shared.adempiere.AdTab;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("adempiere")
public interface AdempiereService extends RemoteService {

	List<AdMenuModel> getAdMenu();

	List<LookupValue> getOptions(String columnName, int type, Long adRefId);

	AdWindowModel getADWindowModel(long windowId);

	AdJSONData getWindowTabData(AdLoadConfig loadCfg);

	Boolean deleteData(List<AdModelKey> keyList, String tableName);

	Boolean selectData(List<AdModelKey> keyList, String tableName);

	Boolean addNewData(AdTab tabModel);

	ADUserContext getADUserContext();

	Boolean logout();
}

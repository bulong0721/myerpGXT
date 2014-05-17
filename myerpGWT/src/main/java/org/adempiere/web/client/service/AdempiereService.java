package org.adempiere.web.client.service;

import java.util.List;

import org.adempiere.common.ADModelKey;
import org.adempiere.common.ADUserContext;
import org.adempiere.common.LookupValue;
import org.adempiere.common.ProcessResult;
import org.adempiere.web.client.model.ADFieldModel;
import org.adempiere.web.client.model.ADFormModel;
import org.adempiere.web.client.model.ADJSONData;
import org.adempiere.web.client.model.ADLoadConfig;
import org.adempiere.web.client.model.ADNodeModel;
import org.adempiere.web.client.model.ADProcessModel;
import org.adempiere.web.client.model.ADSequenceModel;
import org.adempiere.web.client.model.ADWindowModel;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("adempiere")
public interface AdempiereService extends RemoteService {

	List<ADNodeModel> getMenuNodes(int parentID) throws RuntimeException;

	List<ADNodeModel> getTreeNodes(int adTreeId, ADNodeModel loadCfg) throws RuntimeException;

	List<LookupValue> getOptions(String columnName, int type, Integer adRefId) throws RuntimeException;

	List<ADSequenceModel> getSequences(ADLoadConfig loadCfg) throws RuntimeException;

	void updateSequences(List<ADSequenceModel> seqList, String tableName) throws RuntimeException;

	ADWindowModel getADWindowModel(Integer windowId) throws RuntimeException;

	ADFormModel getADFormModel(Integer formId) throws RuntimeException;

	ADProcessModel getADProcessModel(Integer processId) throws RuntimeException;

	ADProcessModel getProcessWithFormModel(Integer processId) throws RuntimeException;

	// acl
	ADJSONData getWindowTabData(ADLoadConfig loadCfg) throws RuntimeException;

	// acl
	void deleteData(List<ADModelKey> keyList, String tableName) throws RuntimeException;

	void selectData(List<ADModelKey> keyList, String tableName) throws RuntimeException;

	// acl
	void updateData(String json, String tableName) throws RuntimeException;

	ADUserContext getADUserContext() throws RuntimeException;

	// acl
	String processCallout(ADFieldModel field, String rowJson) throws RuntimeException;

	// acl
	ProcessResult executeProcess(ADProcessModel pModel, String rowJson, String paramJson) throws RuntimeException;

	Boolean logout() throws RuntimeException;

	ADUserContext login(String username, String password) throws RuntimeException;
}

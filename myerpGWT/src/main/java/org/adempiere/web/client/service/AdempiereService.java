package org.adempiere.web.client.service;

import java.util.List;

import org.adempiere.common.ADUserContext;
import org.adempiere.common.CalloutResult;
import org.adempiere.common.LookupValue;
import org.adempiere.common.ProcessResult;
import org.adempiere.web.client.model.FieldModel;
import org.adempiere.web.client.model.FormModel;
import org.adempiere.web.client.model.JsonResult;
import org.adempiere.web.client.model.NodeModel;
import org.adempiere.web.client.model.PageRequest;
import org.adempiere.web.client.model.ProcessModel;
import org.adempiere.web.client.model.SequenceModel;
import org.adempiere.web.client.model.WindowModel;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("adempiere")
public interface AdempiereService extends RemoteService {

	List<NodeModel> getMenuNodes(int parentID) throws RuntimeException;

	List<NodeModel> getTreeNodes(int adTreeId, NodeModel loadCfg) throws RuntimeException;

	List<LookupValue> getOptions(String columnName, int type, Integer adRefId) throws RuntimeException;

	List<SequenceModel> getSequences(PageRequest loadCfg) throws RuntimeException;

	void updateSequences(List<SequenceModel> seqList, String tableName) throws RuntimeException;

	WindowModel getADWindowModel(Integer windowId) throws RuntimeException;

	FormModel getADFormModel(Integer formId) throws RuntimeException;

	ProcessModel getADProcessModel(Integer processId) throws RuntimeException;

	ProcessModel getProcessWithFormModel(Integer processId) throws RuntimeException;

	// acl
	JsonResult getWindowTabData(PageRequest loadCfg) throws RuntimeException;

	// acl
	void deleteData(String text, String tableName) throws RuntimeException;

	// acl
	void updateData(String json, String tableName) throws RuntimeException;

	ADUserContext getADUserContext() throws RuntimeException;

	// acl
	CalloutResult processCallout(FieldModel field, String rowJson) throws RuntimeException;

	// acl
	ProcessResult executeProcess(ProcessModel pModel, String rowJson, String paramJson) throws RuntimeException;

	void logout() throws RuntimeException;

	ADUserContext login(String username, String password) throws RuntimeException;
}

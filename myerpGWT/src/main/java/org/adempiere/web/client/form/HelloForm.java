package org.adempiere.web.client.form;

import org.adempiere.web.client.util.Activatable;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

@Activatable
public class HelloForm extends AbstractForm {

	@Override
	protected Widget initForm() {
		Label label = new Label(HelloForm.class.getName());
		return label;
	}

}

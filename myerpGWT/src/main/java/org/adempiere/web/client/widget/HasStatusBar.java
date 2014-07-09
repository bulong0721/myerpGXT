package org.adempiere.web.client.widget;

import com.sencha.gxt.widget.core.client.Status;

public interface HasStatusBar {

    Status getMajorLabel();

    Status getMinorLabel();
}

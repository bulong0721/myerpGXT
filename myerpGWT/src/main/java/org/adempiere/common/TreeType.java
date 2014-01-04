package org.adempiere.common;

public enum TreeType {
	Menu("MM"), ElementValue("EV"), Product("PR"), BPartner("BP"), Organization("OO"), BoM("BB"), Project("PJ"), SalesRegion("SR"), ProductCategory(
			"PC"), Campaign("MC"), Activity("AY"), User1("U1"), User2("U2"), User3("U3"), User4("U4"), CMContainer("CC"), CMContainerStage(
			"CS"), CMTemplate("CT"), CMMedia("CM");

	private String	type;

	TreeType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}
}

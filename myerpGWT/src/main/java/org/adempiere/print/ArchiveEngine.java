package org.adempiere.print;

public class ArchiveEngine {
	private static ArchiveEngine	instance;

	public static ArchiveEngine get() {
		if (null == instance) {
			instance = new ArchiveEngine();
		}
		return instance;
	}

	public void archive(LayoutEngine layoutEngine, Object object) {
		// TODO Auto-generated method stub

	}

}

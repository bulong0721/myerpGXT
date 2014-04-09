package org.adempiere.util;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

public class Adempiere {

	public static String getSummaryAscii() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static String copyRight() {
		return "Adempiere©";
	}

	private static Image	imageLogo;

	public static Image getImageLogo() {
		if (imageLogo == null) {
			Toolkit tk = Toolkit.getDefaultToolkit();
			URL url = Adempiere.class.getResource("AD10030.png");
			System.out.println(url);
			if (url == null)
				return null;
			imageLogo = tk.getImage(url);
		}
		return imageLogo;
	} // getImageLogo

}

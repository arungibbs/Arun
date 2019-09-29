package org.india.fb;

import java.awt.AWTException;
public class Redbus extends BaseClass {

	public static void main(String[] args) {

		BrowserLaunch();

		geturl("https://www.facebook.com");

		LoginPojoClass l = new LoginPojoClass();

		writ(l.getUsername(), "1213546");
		writ1(l.getPassword(), "ajdfghjklk");
		btnclick(l.getButton());
		
		
	}

}

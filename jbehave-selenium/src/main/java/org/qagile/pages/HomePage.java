package org.qagile.pages;

import org.openqa.selenium.WebDriver;
import org.qagile.selenium.SeleniumHelper;
import org.qagile.selenium.SeleniumProvider;

public class HomePage{
	
	private SeleniumHelper helper;
	public HomePage() {
		helper = new SeleniumHelper();
	}

		
	public void openHomePage(){
		helper.openUrl("http://www.etsy.com");
	}
	

}

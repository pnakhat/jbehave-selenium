package org.qagile.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	private  WebDriver driver;
	
	public WebDriver createBrowser(){
		driver = new MyDriver(new FirefoxDriver());
		return driver;
	}
	
	
	public void closeBrowser(){
		driver.close();
	}

}

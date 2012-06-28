package org.qagile.selenium;

import org.jbehave.core.annotations.AfterScenario;
import org.jbehave.core.annotations.AfterStory;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.BeforeStory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.qagile.steps.MyDriver;
import org.qagile.steps.PropertyWebdriver;

public class SeleniumProvider {
	
	private static WebDriver driver;
	
	
	@BeforeStory
	public void createBrowser(){
		driver = new MyDriver(PropertyWebdriver.getDriver());
	}
	
	@AfterStory
	public void closeBrowser(){
		driver.close();
	}
	
	

	public static WebDriver getDriver() {
		return driver;
	}

	

}

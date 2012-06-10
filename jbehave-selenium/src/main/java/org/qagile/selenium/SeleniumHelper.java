package org.qagile.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.qagile.conditions.ElementIsFound;
import org.qagile.support.Timer;

public class SeleniumHelper {

	private WebDriver driver;

	public SeleniumHelper() {
		this.setDriver(SeleniumProvider.getDriver());
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public WebElement findElement(By element) {
		new Timer(5000).waitUntil(new ElementIsFound(element));
		return driver.findElement(element);
	}

	public String getTitle() {
		return driver.getTitle();
	}
	
	
	

}

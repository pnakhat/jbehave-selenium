package org.qagile.steps;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDriver implements WebDriver {

	private WebDriver driver;

	public MyDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void get(String url) {
		driver.get(url);
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	public List<WebElement> findElements(By by) {
		return driver.findElements(by);
	}

	public WebElement findElement(By by) {
		return driver.findElement(by);
	}

	public String getPageSource() {
		return driver.getPageSource();
	}

	public void close() {
		driver.close();
	}

	public void quit() {
		driver.quit();
	}

	public Set<String> getWindowHandles() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getWindowHandle() {
		// TODO Auto-generated method stub
		return null;
	}

	public TargetLocator switchTo() {
		// TODO Auto-generated method stub
		return null;
	}

	public Navigation navigate() {
		// TODO Auto-generated method stub
		return null;
	}

	public Options manage() {
		// TODO Auto-generated method stub
		return null;
	}
	
	


}

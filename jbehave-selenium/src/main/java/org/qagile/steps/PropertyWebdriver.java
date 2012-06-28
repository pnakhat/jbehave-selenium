package org.qagile.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PropertyWebdriver {
	public enum browserType{FIREFOX, IE}
	public static WebDriver getDriver() {
		browserType browser = browserType.valueOf(System.getProperty("browser", "FIREFOX"));
		switch (browser) {
		case FIREFOX:
			return new FirefoxDriver();
		case IE:
			return new InternetExplorerDriver();
		default:
			break;
		}
		return null;
	}
}

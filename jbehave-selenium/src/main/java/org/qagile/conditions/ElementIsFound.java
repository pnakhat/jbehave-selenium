package org.qagile.conditions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.qagile.selenium.SeleniumHelper;

public class ElementIsFound implements Condition {
	private By locator;
	private WebDriver driver;
	public ElementIsFound(By locator) {
		this.locator = locator;
		this.driver = new SeleniumHelper().getDriver();
				
	}

	public boolean isSatisfied() {
		try {
			driver.findElement(locator);
			
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public String describe() {
		// TODO Auto-generated method stub
		return "Waiting for element" + locator.toString();
	}

}

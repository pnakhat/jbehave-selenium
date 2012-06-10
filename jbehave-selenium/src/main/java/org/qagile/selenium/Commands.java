package org.qagile.selenium;

import org.openqa.selenium.WebElement;

public class Commands {

	public void submit(WebElement element) {
		element.click();
	}

	public void type(WebElement element, String string) {
		element.sendKeys(string);
	}

	public void verifyUserIsLoggedin() {
		
	}

}

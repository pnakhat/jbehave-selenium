package org.qagile.pages;

import org.qagile.locators.Locators;
import org.qagile.selenium.SeleniumHelper;

public class RegistrationPage {
	private SeleniumHelper helper;
	private Locators locators;

	public RegistrationPage() {
		this.helper = new SeleniumHelper();
		this.locators = new Locators();
	}

	public void open() {
		locators.registrationLocators().registrationLink()
				.click("Etsy - Register");
	}

}

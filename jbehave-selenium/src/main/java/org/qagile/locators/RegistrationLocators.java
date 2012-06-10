package org.qagile.locators;

import org.qagile.locators.dom.Link;
import org.openqa.selenium.By;

public class RegistrationLocators {

	public Link registrationLink() {
		return new Link(By.id("register"));
	}

}

package org.qagile.selenium.locators;

import org.openqa.selenium.By;

public class LoginLocator {

	public static final By userName = By.id("username-existing");
	public static final By password = By.id("password-existing");
	public static final By loginLink = By.xpath("//a[@id='sign-in']");
	public static final By submit = By.id("signin-button");


}

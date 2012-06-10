package org.qagile.pages;

import org.openqa.selenium.WebDriver;
import org.qagile.selenium.SeleniumProvider;
import org.qagile.steps.SeleniumSteps;

public class Pages {
	private WebDriver driver;

	public Pages(){
		this.driver = SeleniumProvider.getDriver();
	}
	
	public HomePage homePage(){
		return new HomePage();
	}
	
	public LoginPage loginPage(){
		return new LoginPage();
	}

	public RegistrationPage registrationPage() {
		// TODO Auto-generated method stub
		return new RegistrationPage();
	}

}

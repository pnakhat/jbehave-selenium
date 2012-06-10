package org.qagile.steps;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Pending;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.qagile.pages.Pages;
import org.qagile.selenium.SeleniumHelper;
import org.qagile.selenium.SeleniumProvider;
import org.qagile.testdata.LoginData;

public class MySteps {
	public Pages pages;
	public SeleniumHelper helper;
	private String user;

	public MySteps() {
		this.pages = new Pages();
	}
	
	@Given("I am on etsy home page")
	public void openHomePage(){
		pages.homePage().openHomePage();
	}
	
	
	@When("I navigate to registration page")
	public void goToRegistrationPage(){
		pages.registrationPage().open();
	}
	
	@When("I login as $user")
	public void loginAs(String user){
		this.user =user;
		pages.loginPage().login(user);
	}
	
	@Then("I am logged in")
	public void userIsLoggedIn(){
		Assert.assertEquals(pages.loginPage().getLoggedinUserName(),
				new LoginData().getUserName(user));
	}
	
	

    
}

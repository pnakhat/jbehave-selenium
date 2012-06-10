package org.qagile.pages;

import javax.swing.KeyStroke;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.qagile.selenium.Commands;
import org.qagile.selenium.SeleniumHelper;
import org.qagile.selenium.locators.LoginLocator;
import org.qagile.testdata.LoginData;

public class LoginPage extends Commands {
	
	private SeleniumHelper helper;

	public LoginPage() {
		helper = new SeleniumHelper();
	}

	public void login(String user) {
		helper.findElement(LoginLocator.loginLink).click();
		String password = new LoginData().getPassword(user);
		type(helper.findElement(LoginLocator.userName), user);
		type(helper.findElement(LoginLocator.password), password);
		submit(helper.findElement(LoginLocator.submit));
		
	}

	
	public String getLoggedinUserName() {
		return helper.findElement(By.className("profile-link")).getText();
	}

}

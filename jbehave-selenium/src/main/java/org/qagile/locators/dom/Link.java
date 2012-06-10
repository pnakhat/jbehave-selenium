package org.qagile.locators.dom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.qagile.conditions.PageTitleAppearsCondition;
import org.qagile.selenium.SeleniumHelper;
import org.qagile.support.Timer;

public class Link {

	private WebElement link;

	public Link(By by) {
		this.link = new SeleniumHelper().findElement(by);
	}

	public void click() {
		link.click();
	}

	public void click(String newpageTitle) {
		// This method will take newPageTitleAsParameterToMakeSure Page is loaded
		link.click();
		new Timer(5000).waitUntil(new PageTitleAppearsCondition(newpageTitle));
	}

}

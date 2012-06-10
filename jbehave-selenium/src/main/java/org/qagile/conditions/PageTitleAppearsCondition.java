package org.qagile.conditions;

import org.qagile.selenium.SeleniumHelper;

public class PageTitleAppearsCondition implements Condition {

	private String title;

	public PageTitleAppearsCondition(String newPageTitle) {
		this.title = newPageTitle;
	}

	public boolean isSatisfied() {
		if(new SeleniumHelper().getTitle().equals(title)){
			return true;
		}
		return false;
	}

	public String describe() {
		return "This condition verified Title of the targetPage";
	}

}

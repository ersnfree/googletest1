package com.googletest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.googletest.utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getInstance(), this);
	}

	@FindBy(id = "lst-ib")
	public WebElement search;

	@FindBy(linkText = "WebdriverIO - WebDriver bindings for Node.js")
	public WebElement webdriverButton;

	

}

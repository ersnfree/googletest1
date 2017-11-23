package com.googletest.step_definitions;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.googletest.pages.HomePage;
import com.googletest.utilities.ConfigurationReader;
import com.googletest.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleTest {
	HomePage hp=new HomePage();
	@Given("^I navigate the Google Search Page$")
	public void i_navigate_the_Google_Search_Page() throws Throwable {
		Driver.getInstance().get(ConfigurationReader.getProperty("url"));
		
	}

	@When("^I search the webdriverio$")
	public void i_search_the_webdriverio() throws Throwable {
	    hp.search.sendKeys(ConfigurationReader.getProperty("link")+Keys.ENTER);
	}

	@When("^I click the first link$")
	public void i_click_the_first_link() throws Throwable {
	    hp.webdriverButton.click();
	}

	@Then("^I should be able to on correct url$")
	public void i_should_be_able_to_on_correct_url() throws Throwable {
	  String currentUrl=Driver.getInstance().getCurrentUrl();
	  System.out.println("currentUrl: "+currentUrl);
	  Assert.assertEquals(currentUrl, "http://webdriver.io/");
	}
}

		
	



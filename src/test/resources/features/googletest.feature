@googletest
Feature: Check url as expected one
Scenario: Verifying the given correct url as http://webdriver.io
	Given I navigate the Google Search Page
	When I search the webdriverio
	And I click the first link 
	Then I should be able to on correct url

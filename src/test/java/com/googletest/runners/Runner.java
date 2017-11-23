package com.googletest.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = { 
				
				"html:target/cucumber-reports",

				"json:target/cucumber.json",

				"rerun:target/rerun.txt" }, 

		features = "./src/test/resources/features/",

		glue = "com.googletest.step_definitions",

		tags = "@googletest",

		dryRun = false

)

public class Runner {

}

package com.qa.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\QA\\Proejcts\\MaveProject\\POMFreeCrmBDD\\POMFreeCrmBDD\\src\\main\\java\\com\\qa\\features",
		glue = "stepDefinition",
		dryRun = false,
		monochrome = false,
		plugin = {"pretty","html:Report/cucumber-reports.html"}
		,tags = "@CurrentlyWorking"
		)

public class TestRunner {

}


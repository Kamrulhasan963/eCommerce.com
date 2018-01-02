package com.tt.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestRunner {

	@CucumberOptions(
			
			features = {"Features"},
			glue = { "com.tt.stepdefs"},
			tags = {"@userlogin"}
			
			
			)

 
	public class TestRunner extends AbstractTestNGCucumberTests{}
}


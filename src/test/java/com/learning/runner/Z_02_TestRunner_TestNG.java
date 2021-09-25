package com.learning.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features", 
		glue = "com.learning.stepDefinitions"
		)
public class Z_02_TestRunner_TestNG extends AbstractTestNGCucumberTests {

}

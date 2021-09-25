package com.learning.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//stepNotifications = true - to see the steps definition under JUnit console

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/_04_TestRunner_Tags.feature",
		glue = "com.learning.stepDefinitions",
		stepNotifications = true,
		//tags = "@Test_Sanity"
		//tags = "@Test_Smoke"
		//tags = "@Test_Regression"
		
		//Either @TestRegression or @Test_Smoke
		//tags = "@Test_Regression or @Test_Smoke"
		//Except @Test_Regression
		//tags = "not @Test_Regression"

		//Both @Test_Regression and @Test_Smoke"
		tags = "@Test_Sanity and @Test_Smoke"
		)
public class _04_TestRunner_Tags {

}

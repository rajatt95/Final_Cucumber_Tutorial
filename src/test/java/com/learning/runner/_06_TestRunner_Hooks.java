package com.learning.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//stepNotifications = true - to see the steps definition under JUnit console

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/_06_Login_Hooks.feature",
		glue = "com.learning.stepDefinitions",
		stepNotifications = true,
		//tags = "@Test_Mobile"
		tags = "@Test_Mobile or @Test_API"
		)
public class _06_TestRunner_Hooks {

}

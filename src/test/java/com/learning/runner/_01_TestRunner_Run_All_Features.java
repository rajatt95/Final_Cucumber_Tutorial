package com.learning.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//stepNotifications = true - to see the steps definition under JUnit console

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.learning.stepDefinitions",
		stepNotifications = true
		)
public class _01_TestRunner_Run_All_Features {

}

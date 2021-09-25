package com.learning.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//stepNotifications = true - to see the steps definition under JUnit console

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.learning.stepDefinitions",
		stepNotifications = true,
		//monochrome = true (Does not execute any Scenario, but checks that each step has mapped with definition)
		monochrome = true
		)
public class _08_TestRunner_Attribute_monoChrome {

}

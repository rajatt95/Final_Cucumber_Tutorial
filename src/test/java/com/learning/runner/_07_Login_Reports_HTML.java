package com.learning.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "src/test/resources/features/data_From_Feature_File/_03_Login_DataDriven_Parameterization_1.feature",
		features = "src/test/resources/features",
		glue = "com.learning.stepDefinitions",
		stepNotifications = true,
		//pretty - keyword; applies color to the report
		//html - format (in which we want the report)
		//target - location for the reports generated
		//cucumber-reports.html - report file name
		plugin = {"pretty","html:target/cucumber-reports-pretty.html"}
		)
public class _07_Login_Reports_HTML {

}

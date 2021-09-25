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
		plugin = {"pretty",
				"junit:target/cucumber-reports.xml",
				"html:target/cucumber-reports-pretty.html",
				"json:target/cucumber-reports.json"}
		)
public class _07_Z_Login_Reports_All_Formats {

}

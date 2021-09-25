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
		//This XML based report is used with Jenkins
		//We can generate Pie charts with this 
		plugin = {"pretty",
				"junit:target/cucumber-reports.xml"}
		)
public class _07_Login_Reports_XML {

}

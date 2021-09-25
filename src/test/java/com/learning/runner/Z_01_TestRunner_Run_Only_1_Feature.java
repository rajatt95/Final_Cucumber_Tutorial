package com.learning.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features = "src/test/resources/features/_01_Login.feature",
		//features = "src/test/resources/features/data_From_Feature_File/_02_Login_SingleData_1.feature",
		//features = "src/test/resources/features/data_From_Feature_File/_02_Login_SingleData_2.feature",
		//features = "src/test/resources/features/data_From_Feature_File/_03_Login_DataDriven_Parameterization_1.feature",
		features = "src/test/resources/features/data_From_Feature_File/_03_Login_DataDriven_Parameterization_2.feature",	
		glue = "com.learning.stepDefinitions",
		stepNotifications = true
		)
public class Z_01_TestRunner_Run_Only_1_Feature {

}

package com.learning.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class _06_Custom_Hooks {

	
	//This method will run only when Cucumber will find any scenario mapped with @Test_Mobile Tag
	//It will run before the scenario which is mapped with @Test_Mobile Tag
	@Before("@Test_Mobile")
	public void before_Mobile_Scenario() {
		System.out.println("=================================================");
		System.out.println("before_Mobile_Scenario");
	}

	@After("@Test_Mobile")
	public void after_Mobile_Scenario() {
		System.out.println("after_Mobile_Scenario");
		System.out.println("=================================================");
	}

	
	@Before("@Test_API")
	public void before_API_Scenario() {
		System.out.println("=================================================");
		System.out.println("before_API_Scenario");
	}

	@After("@Test_API")
	public void after_API_Scenario() {
		System.out.println("after_API_Scenario");
		System.out.println("=================================================");
	}
	
}

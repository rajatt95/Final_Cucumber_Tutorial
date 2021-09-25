package com.learning.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _05_Login_Background_Keyword {

	@Given("Validate the Browser")
	public void validate_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		System.out.println("validate_the_browser");
	}

	@When("Browser is triggered")
	public void browser_is_triggered() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("browser_is_triggered");
	}

	@Then("Check if browser is initialized or not")
	public void check_if_browser_is_initialized_or_not() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("check_if_browser_is_initialized_or_not");
	}

}

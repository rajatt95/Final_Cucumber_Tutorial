package com.learning.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_Login {

	@Given("User is on NetBanking Landing page")
	public void user_is_on_net_banking_landing_page() {
		System.out.println("******************************************************************************************************************************");
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		System.out.println("user_is_on_net_banking_landing_page");
	}

	@When("User log into application with username and password")
	public void user_log_into_application_with_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		System.out.println("user_log_into_application_with_username_and_password");
	}

	@Then("HomePage is populated")
	public void home_page_is_populated() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		System.out.println("home_page_is_populated");
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		System.out.println("cards_are_displayed");
		System.out.println("******************************************************************************************************************************");
	}

	
	
	
}

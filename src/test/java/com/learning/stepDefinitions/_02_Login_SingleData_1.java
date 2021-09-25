package com.learning.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_Login_SingleData_1 {

	@When("User log into application with username {string} and password {string}")
	public void user_log_into_application_with_username_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();

		System.out.println("user_log_into_application_with " + username + " and " + password);

		System.out.println("------------------------ Username: " + username);
		System.out.println("------------------------ Password: " + password);
	}

	@Then("Cards are not displayed")
	public void cards_are_not_displayed() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("cards_are_not_displayed");
		System.out.println(
				"******************************************************************************************************************************");

	}

	@Then("Cards are displayed with status {string}")
	public void cards_are_displayed_with_status(String status) {

		System.out.println("cards_are_displayed_with_status");
		System.out.println("------------------------ Status: " + status);

		System.out.println(
				"******************************************************************************************************************************");
	}

}

package com.learning.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class _06_Login_Hooks {

	@Given("Common Code")
	public void common_code() {
		System.out.println("common_code");
	}

	@When("For all types of Automation tests")
	public void for_all_types_of_automation_tests() {
		System.out.println("for_all_types_of_automation_tests");
	}

	@Given("User is on Desktop NetBanking Landing page")
	public void user_is_on_desktop_net_banking_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("user_is_on_desktop_net_banking_landing_page");
	}

	@Given("User is on Mobile NetBanking Landing page")
	public void user_is_on_mobile_net_banking_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("user_is_on_mobile_net_banking_landing_page");
	}

	@Given("User is on API of NetBanking Landing page")
	public void user_is_on_api_of_net_banking_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		System.out.println("user_is_on_api_of_net_banking_landing_page");
	}

}

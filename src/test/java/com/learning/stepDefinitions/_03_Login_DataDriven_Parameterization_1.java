package com.learning.stepDefinitions;

import io.cucumber.java.en.When;

public class _03_Login_DataDriven_Parameterization_1 {


	@When("User sign up with following details {string} {string} {string} {string}")
	public void user_sign_up_with_following_details(String firstName, String lastName, String email, String country) {
		System.out.println("------------------------ firstName: " + firstName);
		System.out.println("------------------------ lastName: " + lastName);
		System.out.println("------------------------ email: " + email);
		System.out.println("------------------------ country: " + country);
		System.out.println(
				"******************************************************************************************************************************");
	}

}

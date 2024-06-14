package com.cgi.steps;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demo1Steps {

	@Given("I have a browser with OrangeHRM application")
	public void i_have_a_browser_with_orange_hrm_application() {
		System.out.println("given");
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		System.out.println("when"+username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		System.out.println("when"+password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		System.out.println("when login");
	}

	@Then("I should get access to portal with header as {string}")
	public void i_should_get_access_to_portal_with_header_as(String expectedHeader) {
		System.out.println("then"+expectedHeader);
		
	}
	
	@Then("I should not get access with error as {string}")
	public void i_should_not_get_access_with_error_as(String expectedError) {
	   System.out.println("then "+expectedError);
	}

}

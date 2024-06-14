package com.cgi.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.cgi.base.AutomationWrapper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {


	@Given("I have a browser with OrangeHRM application")
	public void i_have_a_browser_with_orange_hrm_application() {
		AutomationWrapper.driver = new ChromeDriver();
		AutomationWrapper.driver.manage().window().maximize();
		AutomationWrapper.driver.manage().window().maximize();
		AutomationWrapper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		AutomationWrapper.driver.get("https://opensource-demo.orangehrmlive.com/");

	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		AutomationWrapper.driver.findElement(By.name("username")).sendKeys(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
		AutomationWrapper.driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
		AutomationWrapper.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Then("I should get access to portal with header as {string}")
	public void i_should_get_access_to_portal_with_header_as(String expectedHeader) {
		System.out.println("then" + expectedHeader);

	}

	@Then("I should not get access with error as {string}")
	public void i_should_not_get_access_with_error_as(String expectedError) {
		System.out.println("then " + expectedError);
	}

}

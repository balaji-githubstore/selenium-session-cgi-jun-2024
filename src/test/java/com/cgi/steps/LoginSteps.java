package com.cgi.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.DashboardPage;
import com.cgi.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	private AutomationWrapper wrapper;
	private LoginPage login;
	private DashboardPage dashboard; 
	
	public LoginSteps(AutomationWrapper wrapper)
	{
		this.wrapper=wrapper;
	}


	@Given("I have a browser with OrangeHRM application")
	public void i_have_a_browser_with_orange_hrm_application() {
		wrapper.driver = new ChromeDriver();
		wrapper.driver.manage().window().maximize();
		wrapper.driver.manage().window().maximize();
		wrapper.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wrapper.driver.get("https://opensource-demo.orangehrmlive.com/");
		initPage();

	}
	
	public void initPage()
	{
		 login=new LoginPage(wrapper.driver);
		 dashboard=new DashboardPage(wrapper.driver);
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String username) {
		
//		wrapper.driver.findElement(By.name("username")).sendKeys(username);
		login.enterUsername(username);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String password) {
//		wrapper.driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("I click on login")
	public void i_click_on_login() {
//		wrapper.driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		login.clickOnLogin();
	}

	@Then("I should get access to portal with header as {string}")
	public void i_should_get_access_to_portal_with_header_as(String expectedHeader) {
//		System.out.println("then" + expectedHeader);
		Assert.assertEquals(dashboard.getQuickLaunchText(), expectedHeader);
	}

	@Then("I should not get access with error as {string}")
	public void i_should_not_get_access_with_error_as(String expectedError) {
//		System.out.println("then " + expectedError);
		Assert.assertEquals(login.getInvalidErrorMessage(), expectedError);
	}

}

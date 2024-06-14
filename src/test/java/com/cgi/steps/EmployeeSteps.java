package com.cgi.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.cgi.base.AutomationWrapper;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSteps{

	@When("I click on PIM menu")
	public void i_click_on_pim_menu() {
		AutomationWrapper.driver.findElement(By.xpath("//span[text()='PIM']")).click();
	}

	@When("I click on Add Employee section")
	public void i_click_on_add_employee_section() {

	}

	@When("I fill the employee form")
	public void i_fill_the_employee_form(DataTable dataTable) {
		List<Map<String, String>> lists = dataTable.asMaps();
		System.out.println(lists);
		System.out.println(lists.get(0));
		System.out.println(lists.get(0).get("firstname"));
		System.out.println(lists.get(0).get("middlename"));
		System.out.println(lists.get(0).get("lastname"));
	}

	@When("I click on save")
	public void i_click_on_save() {

	}

	@Then("I should able to verify the saved employee with profile name {string}")
	public void i_should_able_to_verify_the_saved_employee_with_profile_name(String string) {

	}

}

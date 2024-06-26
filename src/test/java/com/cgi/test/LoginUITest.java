package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.LoginPage;

public class LoginUITest extends AutomationWrapper {
	@Test(groups = { "ui", "smoke" })
	public void titleTest() {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "OrangeHRM2");
	}

	@Test(groups = { "ui" })
	public void headerTitle() {
		String actualHeader = driver.findElement(By.xpath("//h5")).getText();
		Assert.assertEquals(actualHeader, "Login");
	}

	@Test
	public void placeholderTest() {
		LoginPage login = new LoginPage(driver);
		Assert.assertEquals(login.getUsernamePlaceholder(), "Username");
		Assert.assertEquals(login.getPasswordPlaceholder(), "Password");
	}
}

package com.cgi.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cgi.base.AutomationWrapper;
import com.cgi.pages.LoginPage;
import com.cgi.utilities.DataUtils;

public class LoginTest extends AutomationWrapper {
	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class,groups = {"smoke","login"})
	public void validLoginTest(String username,String password,String expectedValue) {
		//driver.findElement(By.name("username")).sendKeys(username);
		LoginPage login=new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String actualText = driver.findElement(By.xpath("//p[contains(normalize-space(),'Quick')]")).getText();
		Assert.assertEquals(actualText, expectedValue);
	}

	@Test(dataProvider = "commonDataProvider",dataProviderClass = DataUtils.class,groups = {"login"})
	public void invalidLoginTest(String username, String password, String expectedError) {
		LoginPage login=new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		String actualError = driver.findElement(By.xpath("//p[contains(normalize-space(),'Inval')]")).getText();
		Assert.assertTrue(actualError.contains(expectedError)); // expect true

	}

}

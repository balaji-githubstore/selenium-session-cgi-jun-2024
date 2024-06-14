package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cgi.base.WebDriverKeywords;

public class LoginPage extends WebDriverKeywords{

	private By usernameLocator = By.name("username");
	private By passwordLocator = By.name("password");
	private By loginLocator = By.xpath("//button[normalize-space()='Login']");
	private By errorLocator = By.xpath("//p[contains(normalize-space(),'Inval')]");

	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void enterUsername(String username) {
//		driver.findElement(usernameLocator).sendKeys(username);
		super.sendTextToElement(usernameLocator, username);
	}

	public void enterPassword(String password) {
//		driver.findElement(passwordLocator).sendKeys(password);
		sendTextToElement(passwordLocator, password);
	}

	public void clickOnLogin() {
//		driver.findElement(loginLocator).click();
		clickElement(loginLocator);
	}

	public String getInvalidErrorMessage() {
//		return driver.findElement(errorLocator).getText();
		return getTextFromElement(errorLocator);
	}

	public String getUsernamePlaceholder() {
		return driver.findElement(usernameLocator).getAttribute("placeholder");
	}

	public String getPasswordPlaceholder() {
		return driver.findElement(passwordLocator).getAttribute("placeholder");
	}
}

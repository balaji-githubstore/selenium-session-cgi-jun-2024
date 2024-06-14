package com.cgi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cgi.base.WebDriverKeywords;

public class DashboardPage extends WebDriverKeywords {
	
	private By quickLaunchLocator=By.xpath("//p[contains(normalize-space(),'Quick')]");

	private WebDriver driver;

	public DashboardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public String getQuickLaunchText()
	{
		return getTextFromElement(quickLaunchLocator);
	}

}

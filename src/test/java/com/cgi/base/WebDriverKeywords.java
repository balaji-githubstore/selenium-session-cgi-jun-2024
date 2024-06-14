package com.cgi.base;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverKeywords {

	private WebDriver driver;

	public WebDriverKeywords(WebDriver driver) {
		this.driver = driver;
	}

	public void sendTextToElement(By locator, String text) {
		driver.findElement(locator).clear();
		driver.findElement(locator).sendKeys(text);
	}

	public void clickElement(By locator) {
		driver.findElement(locator).click();
	}

	public String getTextFromElement(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void switchTabByTitle(String title)
	{
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		for(String win : windows)
		{
			driver.switchTo().window(win);
			if(driver.getTitle().equals(title))
			{
				break;
			}
		}
	}
}

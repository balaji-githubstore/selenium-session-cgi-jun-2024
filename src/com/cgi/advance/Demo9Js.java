package com.cgi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo9Js {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
		
		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();
		
		//14-10-2000
		//approach 1 
		//driver.findElement(By.id("bill-date-long")).sendKeys("14/10/2000");
		
		//approach 2 - automate the calendar
//		driver.findElement(By.id("bill-date-long")).click();
//		
//		Select selectYear=new Select(driver.findElement(By.xpath("//select[@data-handler='selectYear']")));
//		selectYear.selectByVisibleText("2017");
//		
//		Select selectMon=new Select(driver.findElement(By.xpath("//select[@data-handler='selectMonth']")));
//		selectMon.selectByVisibleText("Aug");
//		
//		driver.findElement(By.linkText("17")).click();
		
		//approach 3 - javascript
//		document.querySelector('#bill-date-long').value='14/10/2000'
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.querySelector('#bill-date-long').value='14/10/2000'");
		
		//approach 4 - javascript with webelement
		
		WebElement ele= driver.findElement(By.xpath("//input[@id='bill-date-long']"));
		js.executeScript("arguments[0].value='14/10/2003'",ele);
	}

}

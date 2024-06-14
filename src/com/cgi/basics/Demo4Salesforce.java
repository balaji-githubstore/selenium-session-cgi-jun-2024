package com.cgi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4Salesforce {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		driver.findElement(By.name("UserFirstName")).sendKeys("jack");
		
		//input[contains(@id,'UserLast')]
		driver.findElement(By.xpath("//input[contains(@id,'UserLast')]")).sendKeys("wick");
		
		Select selectCountry=new Select(driver.findElement(By.name("CompanyCountry")));
		selectCountry.selectByVisibleText("United Kingdom");
		
		Select selectJobTitle=new Select(driver.findElement(By.name("UserTitle")));
		selectJobTitle.selectByVisibleText("IT Manager");
		
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div[@class='checkbox-ui']")).click();
	
		driver.findElement(By.name("start my free trial")).click();
		
		String actualError= driver.findElement(By.xpath("//span[contains(text(),'valid phone')]")).getText();
		System.out.println(actualError);
		
		String actualHeader= driver.findElement(By.tagName("h1")).getText();
		System.out.println(actualHeader);
	}
}

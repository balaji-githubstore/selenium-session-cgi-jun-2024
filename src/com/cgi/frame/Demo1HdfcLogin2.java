package com.cgi.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//index
public class Demo1HdfcLogin2 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(0);
		
		//enter userid as john123
		driver.findElement(By.name("fldLoginUserId")).sendKeys("john123");
		
		//click on Continue
		driver.findElement(By.linkText("CONTINUE")).click();
		
		
		//switch to main html
		driver.switchTo().defaultContent();
		
	}

}
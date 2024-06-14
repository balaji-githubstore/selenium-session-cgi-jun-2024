package com.cgi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FBLogin {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
//		WebElement ele= driver.findElement(By.id("email"));
//		ele.sendKeys("bala123434343@gmail.com");

		driver.findElement(By.id("email")).sendKeys("bala123434343@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("welcom234");
		
		//login
		driver.findElement(By.name("login")).click();
		
	}
	
	
}

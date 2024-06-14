package com.cgi.advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8FBLoginCSS {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

		driver.findElement(By.cssSelector("#email")).sendKeys("bala123434343@gmail.com");
		driver.findElement(By.cssSelector("#pass")).sendKeys("welcom234");
		
		//login
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
	}
	
	
}

package com.cgi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo4Actions {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.flipkart.com/");
		
		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[text()='Fashion']"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Men Footwear']"))).perform();
		
		
		//a[text()='Shoe Care']
		
		driver.findElement(By.xpath("//a[text()='Shoe Care']")).click();
		

	}

}

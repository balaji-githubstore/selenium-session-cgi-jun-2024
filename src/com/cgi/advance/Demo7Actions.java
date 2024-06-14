package com.cgi.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7Actions {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[text()='Accept all']")).click();
		
	//type --> HELLO WORDLD
	//Arrow down - 3 timesd
		//enter key
		Actions action=new Actions(driver);
		
		action
		.moveToElement(driver.findElement(By.name("q"))).click()
		.keyDown(Keys.SHIFT).sendKeys("hello world").keyUp(Keys.SHIFT).pause(800)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).pause(800)
		.sendKeys(Keys.ENTER).perform();

	}

}
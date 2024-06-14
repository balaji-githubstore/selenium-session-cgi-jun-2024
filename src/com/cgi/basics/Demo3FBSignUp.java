package com.cgi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo3FBSignUp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/"); //wait for page load to complete
		
		//findElement checks for presence of element in 0.5s
		driver.findElement(By.xpath("(//span[text()='Allow all cookies'])[2]")).click();
		
		//findElement checks for presence of element in 0.5s
		driver.findElement(By.linkText("Create new account")).click();
		
		//findElement checks for presence of element in 0.5s
		driver.findElement(By.name("firstname")).sendKeys("jack");
		
		//lastname -
		driver.findElement(By.name("lastname")).sendKeys("wick");
		//password - 
		driver.findElement(By.id("password_step_input")).sendKeys("heloo123");
		
		//click on custom radio button
		//label[text()='Custom']
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		
		//16 Nov 1999	
		Select selectDay=new Select(driver.findElement(By.id("day")));
		selectDay.selectByVisibleText("16");
		
		Select selectMonth=new Select(driver.findElement(By.id("month")));
		selectMonth.selectByVisibleText("Nov");
//		selectMonth.selectByValue("11");
//		selectMonth.selectByIndex(10);
		
		
		
		//driver.findElement(By.id("month")).sendKeys("Dec");
		
		//select year 1999
		//click on submit
		
	}

}








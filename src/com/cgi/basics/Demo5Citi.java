package com.cgi.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5Citi {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
		
		driver.findElement(By.linkText("select your product type")).click();
		driver.findElement(By.linkText("Credit Card")).click();
		
	}

}

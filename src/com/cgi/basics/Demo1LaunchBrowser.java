package com.cgi.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver obj=new ChromeDriver();
		obj.get("https://www.facebook.com/");
		
		String actualTitle= obj.getTitle();
		System.out.println(actualTitle);

		String actualUrl=obj.getCurrentUrl();
		System.out.println(actualUrl);
		
		String pageSource= obj.getPageSource();
		System.out.println(pageSource);
	}
}

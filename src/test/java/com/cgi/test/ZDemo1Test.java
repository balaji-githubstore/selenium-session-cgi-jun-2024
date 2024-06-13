package com.cgi.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/*
 * Will be deleted from framework
 */
public class ZDemo1Test {
	@DataProvider
	public Object[][] loginData()
	{
		Object[][] data=new Object[3][2];
		//i--> number of test case
		//j--> number of parameters
		data[0][0]="saul";
		data[0][1]="saul123";
		
		data[1][0]="kim";
		data[1][1]="kim123";
		
		data[2][0]="jack";
		data[2][1]="jack123";
		
		return data;
	}
	
	@Test(dataProvider = "loginData")
	public void loginTest(String username,String password)
	{
		System.out.println("valid login test "+username+password);
	}

}

package com.cgi.utilities;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtils {
	
	@DataProvider
	public Object[][] invalidLoginData()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="john";
		data[0][1]="john123";
		data[0][2]="Invalid credentials";
		
		data[1][0]="peter";
		data[1][1]="peter123";
		data[1][2]="Invalid credentials";
		
		return data;
	}
	
	@DataProvider
	public Object[][] commonDataProvider(Method method) throws IOException
	{
		//dynamically get @Test name. i.e the sheetname
		String sheetName= method.getName();
		Object[][] data=ExcelUtils.getSheetIntoTwoDimensionalArray("test-data/orangedata.xlsx", sheetName);
		return data;
	}
	
}















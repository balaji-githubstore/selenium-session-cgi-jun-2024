package com.cgi.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * Will be deleted from framework
 */
public class ZDemo2Excel {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("test-data/Orangedata.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file);

		XSSFSheet sheet = book.getSheet("invalidLoginTest");

		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[rowCount-1][cellCount];

		// write a logic to print all cell value
		DataFormatter format = new DataFormatter();
		for (int r = 1; r < rowCount; r++) 
		{
			for (int c = 0; c < cellCount; c++) 
			{
				String value = format.formatCellValue(sheet.getRow(r).getCell(c));
				data[r-1][c]=value;
			}
		}

		book.close();
		file.close();

	}

}

package com.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class TestUtil extends TestBase {
	
	public TestUtil() throws InterruptedException {
		super();
	}

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	static String TESTDATA_SHEET_PATH="C:\\QA\\Proejcts\\MaveProject\\POMFreeCrmBDD\\POMFreeCrmBDD\\src\\main\\java\\com\\qa\\data\\FreeCRM_Data.xlsx";
	static Workbook book;
	static Sheet sheet;
	
	
	public void swithToFrame() {
		driver.switchTo().frame("mainpanel");
	}
	
	
	public static Object[][] getTestData(String sheetName) {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
		}
		return data;
	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
	    
	    File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    String currentDir = System.getProperty("user.dir");
	    String screenshotDir = currentDir + "/screenshots/";
	    FileUtils.copyFile(scrFile, new File(screenshotDir + System.currentTimeMillis() + ".png"));
	}
	


}

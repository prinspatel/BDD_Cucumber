package com.qa.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestBase {

	protected static WebDriver driver;
	public static Properties prop;
	static int PAGE_LOAD_TIMEOUT = 20;
	static int IMPLICITY_TIMEOUT = 20;

	public TestBase() throws InterruptedException {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream(
					"C:\\QA\\Proejcts\\MaveProject\\POMFreeCrmBDD\\POMFreeCrmBDD\\src\\main\\java\\config\\cofig.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() throws InterruptedException {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\QA\\Proejcts\\MaveProject\\POMFreeCrmBDD\\POMFreeCrmBDD\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(IMPLICITY_TIMEOUT, TimeUnit.SECONDS);
		driver.navigate().to(prop.getProperty("url"));
		Thread.sleep(2000);
	}

}

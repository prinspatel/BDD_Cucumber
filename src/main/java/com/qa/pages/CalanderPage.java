package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.utils.TestBase;

public class CalanderPage extends TestBase {

	public CalanderPage() throws InterruptedException {
		super();
		
	}

	@FindBy(xpath = "((//table[@width='100%'][@align='center'])//select[1])[1]")
	WebElement dropdown;

	public void verifyUserForCalander(String user) {
		PageFactory.initElements(driver, this);
		// WebElement dropdown =
		// driver.findElement(By.xpath("((//table[@width='100%'][@align='center'])//select[1])[1]"));
		Select select = new Select(dropdown);
		Assert.assertTrue(select.getFirstSelectedOption().getText().contains(user));
	}

}

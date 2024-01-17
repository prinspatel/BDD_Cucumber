package com.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class TaskPage extends TestBase {

	public TaskPage() throws InterruptedException {
		super();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Tasks']")
	WebElement tasklnk;

	@FindBy(xpath = "(//td//em)[2]")
	WebElement tasktext;

	@FindBy(xpath = "//a[normalize-space()='New Task']")
	WebElement newTask;

	@FindBy(id = "title")
	WebElement title;

	@FindBy(xpath = "//input[@name='prospect_lookup']")
	WebElement Deal;

	@FindBy(xpath = "//input[@name='case_lookup']")
	WebElement cases;

	@FindBy(xpath = "//input[@name='client_lookup']")
	WebElement companyadd;

	@FindBy(xpath = "(//input[@value='Save'])[1]")
	WebElement savebtn;

	@FindAll({ @FindBy(xpath = "//a//i[@title='Delete']") })
	List<WebElement> totaltask;

	public void taskPageValidation() throws InterruptedException {
		tasklnk.click();
		Assert.assertEquals(tasktext.getText(), "Showing all tasks");
	}

	public void moveovertonewtask() {
		PageFactory.initElements(driver, this);
		Actions action = new Actions(driver);
		action.moveToElement(tasklnk).build().perform();
		newTask.click();
	}

	public void addNewTask(String tit, String del, String cas, String com) throws InterruptedException {
		title.sendKeys(tit);
		Deal.sendKeys(del);
		cases.sendKeys(cas);
		companyadd.sendKeys(com);
		savebtn.click();
	}

	public void verifyaddedtask() {
		Assert.assertTrue(totaltask.size() > 0);
	}

}

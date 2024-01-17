package com.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "(//td[@align='left'])[1]")
	WebElement userName;

	@FindBy(xpath = "//a[normalize-space()='Contacts']")
	WebElement contactslnk;

	@FindBy(xpath = "//a[normalize-space()='Deals']")
	WebElement dealslnk;

	@FindBy(xpath = "//a[normalize-space()='Tasks']")
	WebElement tasklnk;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;

	@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	WebElement newContactLink;

	@FindBy(xpath = "//a[normalize-space()='Home']")
	WebElement HomePage;

	public HomePage() throws InterruptedException {
		super();
		PageFactory.initElements(driver, this);
	}

	public void openbrowser() throws InterruptedException {
		initialization();
	}

	public String verifyHomePagetitle() {
		return driver.getTitle();
	}

	public boolean verifyCurrentUserName() {
		return userName.isDisplayed();
	}

	public ContactsPage clickOnContactLink() throws InterruptedException {
		contactslnk.click();
		return new ContactsPage();
	}

	public DealsPage clickOnDealLink() throws InterruptedException {
		dealslnk.click();
		return new DealsPage();
	}

	public TaskPage clickOnTaskLink() throws InterruptedException {
		tasklnk.click();
		return new TaskPage();
	}

	@FindBy(xpath = "//td[contains(text(),'Tasks')]")
	WebElement Taskpagelnk;

	public void VerifytaskPage() {
		Assert.assertTrue(Taskpagelnk.getText().contains("Tasks"));
	}

	public void clickOnNewContactLink() {
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactLink.click();
	}

	public void verifyContactPage() {
		WebElement page = driver.findElement(By.xpath("//td[contains(text(),'Contacts')]"));
		Assert.assertEquals("Contacts", page.getText());
	}

	public void clickOnHomePage() {
		HomePage.click();
	}

	@FindBy(xpath = "//td[contains(text(),'Deals')]")
	WebElement dealpagelnk;

	public void VerifydealPage() {
		Assert.assertTrue(dealpagelnk.getText().contains("Deals"));
	}

	@FindBy(xpath = "//a[normalize-space()='Companies']")
	WebElement comaniespagelnk;

	@FindBy(xpath = "//a[normalize-space()='Cases']")
	WebElement casespagelnk;

	@FindBy(xpath = "//a[normalize-space()='Call']")
	WebElement callpagelnk;

	@FindBy(xpath = "//a[normalize-space()='Forms']")
	WebElement formpagelnk;

	@FindBy(xpath = "//a[normalize-space()='Reports']")
	WebElement Reportspagelnk;
	
	@FindBy(xpath="//a[normalize-space()='Calendar']")
	WebElement calendarlnk;
	
	public void calendarPagelnk() {
		calendarlnk.click();
	}
	public void comaniesPagelnk() {
		comaniespagelnk.click();
	}
	
	@FindAll({@FindBy(xpath = "//td[@class='calendartitle']")})
	List<WebElement> v_calendar;
	
	public void verifycalendarPage() {
		Assert.assertTrue(v_calendar.size()>0);
	}


	@FindBy(xpath = "//td[normalize-space()='Companies']")
	WebElement v_comapnypage;

	public void verifycomaniesPage() {
		Assert.assertTrue(v_comapnypage.getText().contains("Companies"));
	}

	public void casesPagelnk() {
		casespagelnk.click();
	}

	@FindBy(xpath = "//td[contains(text(),'Support Cases')]")
	WebElement v_casesPage;

	public void verifycasesPage() {
		Assert.assertTrue(v_casesPage.getText().contains("Support Cases"));
	}

	public void callPagelnk() {
		callpagelnk.click();
	}

	@FindBy(xpath = "//legend[normalize-space()='Call Information']")
	WebElement v_callPage;

	public void verifycallPage() {
		Assert.assertTrue(v_callPage.getText().contains("Call Information"));
	}

	public void formPagelnk() {
		formpagelnk.click();
	}

	@FindBy(xpath = "//td[normalize-space()='Feedback Forms']")
	WebElement v_formPage;

	public void verifyformPage() {
		Assert.assertTrue(v_formPage.getText().contains("Feedback Forms"));
	}

	public void ReportsPagelnk() {
		Reportspagelnk.click();
	}

	@FindBy(xpath = "//legend[@class='fieldset']")
	WebElement v_Reports;

	public void verifyReportsPage() {
		Assert.assertTrue(v_Reports.getText().contains("Reports"));
	}
	
	

}

package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

import io.cucumber.java.en.Then;

public class CompaniesPage extends TestBase {

	public CompaniesPage() throws InterruptedException {
		super();
	}

	public void moveoverToNewCompany() {

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Companies']"))).build().perform();
		driver.findElement(By.xpath("//a[normalize-space()='New Company']")).click();
	}

	@FindBy(id = "company_name")
	WebElement CompanyName;

	@FindBy(name = "industry")
	WebElement Industry;

	@FindBy(id = "annual_revenue")
	WebElement AnnualR;

	@FindBy(id = "num_of_employees")
	WebElement Employees;

	@FindBy(name = "identifier")
	WebElement Identifier;

	@FindBy(id = "website")
	WebElement Website;

	@FindBy(id = "email")
	WebElement Email;

	@FindBy(id = "phone")
	WebElement PhoneNo;

	@FindBy(id = "fax")
	WebElement Fax;

	@FindBy(xpath = "(//input[@value='Save'])[1]")
	WebElement savebtn;

	@Then("Enter company details {string},{string},{string},{string},{string},{string} and {string}")
	public void enter_company_details(String company1, String industry1, String annualR1, String employees1,
			String identifier1, String website1, String email1, String phone, String fax) {
		PageFactory.initElements(driver, this);

		CompanyName.sendKeys(company1);
		Industry.sendKeys(industry1);
		AnnualR.sendKeys(annualR1);
		Employees.sendKeys(employees1);
		Identifier.sendKeys(identifier1);
		PhoneNo.sendKeys(phone);
		Fax.sendKeys(fax);
		Website.sendKeys(website1);
		Email.sendKeys(email1);

		savebtn.click();
	}

	// Then User Mouseover to Full Search Form
	public void mouseoveFullSearchForm() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Companies']"))).build().perform();
		driver.findElement(By.xpath("//a[normalize-space()='Full Search Form']")).click();
	}

	@FindBy(xpath = "(//input[@value='Search Companies'])[1]")
	WebElement fullsearch;

	// Then Verify Full Search Form Page
	public void verifyfullsearchformpage() {
		WebElement fullformpage = driver.findElement(By.xpath("//legend[@class='fieldset']"));
		PageFactory.initElements(driver, this);
		System.out.println(fullformpage.getText());
		Assert.assertTrue(fullformpage.getText().contains("Search "));
	}

	// Then Search Company by "<CompanyName>" and "<Industry>"
	@FindBy(id="cs_name")
	WebElement cs_name;
	
	@FindBy(name="cs_industry")
	WebElement cs_industry;

	public void fullsearchby(String cname, String cindustry) {
		cs_name.sendKeys(cname);
		cs_industry.sendKeys(cindustry);
		fullsearch.click();
	}
	
	@FindBy(xpath="//form[@id='vCompaniesForm']//tr[5]//td[2]//a")
	WebElement sresult;
	// Then Verify Search Result
	public void searchresult(String result) {
		Assert.assertTrue(sresult.getText().contains(result));
	}

}

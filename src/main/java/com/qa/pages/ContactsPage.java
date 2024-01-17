package com.qa.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.utils.TestBase;
import com.qa.utils.TestUtil;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//a[normalize-space()='Contacts']")
	WebElement contactsLink;

	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactLabel;

	@FindAll({ @FindBy(xpath = "//td[contains(text(),'Contacts')]/../../../../../..//input[@type='checkbox'][1]") })
	public List<WebElement> chechbox;

	@FindBy(name = "client_lookup")
	WebElement company;

	@FindBy(xpath = "//input[@type='submit' and @value='Save']")
	WebElement saveBtn;

	public ContactsPage() throws InterruptedException {
		super();
	}

	public void contactlnk() {
		PageFactory.initElements(driver, this);
		contactsLink.click();
	}

	public boolean contactLabelDisplayed() {
		return contactLabel.isDisplayed();
	}

	public void selectCheckbox() throws InterruptedException {
		for (int i = 1; i < chechbox.size(); i++) {
			if (i == 1) {
				System.out.println("1");

				String selectcheckbox = "(//td[contains(text(),'Contacts')]/../../../../../..//input[@type='checkbox'][1])[2]";
				WebElement cbox = driver.findElement(By.xpath(selectcheckbox));
				cbox.click();
				boolean selected = cbox.isSelected();
				Assert.assertTrue(selected);
				break;
			}
		}
	}

	@FindBy(xpath = "//a[normalize-space()='New Contact']")
	WebElement newcontact;

	public void movetonewcontect() {
		PageFactory.initElements(driver, this);
		Actions actions = new Actions(driver);
		actions.moveToElement(contactsLink).build().perform();
		newcontact.click();
	}

	@FindBy(xpath = "//legend[normalize-space()='Contact Information']")
	WebElement newcontactform;

	public void verifynewContactForn() {
		Assert.assertTrue(newcontactform.getText().contains("Contact "));
	}

	@FindBy(xpath = "//input[@id='first_name']")
	WebElement fsname;

	@FindBy(xpath = "//input[@id='middle_initial']")
	WebElement Mname;

	@FindBy(id = "surname")
	WebElement suname;

	@FindBy(xpath = "//input[@name='contact_nickname']")
	WebElement niname;

	@FindBy(xpath = "//input[@name='client_lookup']")
	WebElement companyname;

	@FindBy(xpath = "//input[@value='Save']")
	WebElement savebtn;

	@FindBy(xpath = "//input[@id='company_position']")
	WebElement possition;

	@FindBy(xpath = "//input[@id='department']")
	WebElement department;

	public void webElementnewcontact(String Title, String FirstName, String MiddleName, String LastName,
			String CompanyName, String Possition, String Deparment) {
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(Title);

		fsname.sendKeys(FirstName);
		Mname.sendKeys(MiddleName);
		suname.sendKeys(LastName);
		companyname.sendKeys(CompanyName);
		possition.sendKeys(Possition);
		department.sendKeys(Deparment);

		savebtn.click();
		movetonewcontect();

	}

	public void AddNewContact() throws InterruptedException {

		Object[][] testData = TestUtil.getTestData("NewContact");

		for (Object[] data : testData) {

			String Title = (String) data[0];
			String FirstName = (String) data[1];
			String MiddleName = (String) data[2];
			String LastName = (String) data[3];
			String CompanyName = (String) data[4];
			String Possition = (String) data[5];
			String Deparment = (String) data[6];

			webElementnewcontact(Title, FirstName, MiddleName, LastName, CompanyName, Possition, Deparment);

		}

	}

	public boolean savedContacts() {
		List<WebElement> allcontact = driver.findElements(By.xpath("(//table[@class='datacard'])[3]//tr//td[2]//a"));
		if (allcontact.size() > 2) {
			return true;
		} else {
			return false;
		}
	}

	@FindBy(xpath = "(//a[normalize-space()='Combined Form'])[2]")
	WebElement combineform;

	public void movetonewcombineform() {
		PageFactory.initElements(driver, this);
		Actions actions = new Actions(driver);
		actions.moveToElement(contactsLink).build().perform();
		combineform.click();
	}

	public void fillCombineContaact(String title, String Firstname, String middlename, String lastname, String nichname,
			String possitionn, String departmennt) {
		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);

		fsname.sendKeys(Firstname);
		Mname.sendKeys(middlename);
		suname.sendKeys(lastname);
		niname.sendKeys(nichname);
		possition.sendKeys(possitionn);
		department.sendKeys(departmennt);

		savebtn.click();
	}

	@FindBy(id = "company_name")
	WebElement CompanyName;

	@FindBy(name = "industry")
	WebElement Industry;

	@FindBy(id = "annual_revenue")
	WebElement AnnualR;

	@FindBy(id = "num_of_employees")
	WebElement Employees;

	@FindBy(name = "company_identifier")
	WebElement Identifier;

	@FindBy(id = "website")
	WebElement Website;

	@FindBy(id = "company_email")
	WebElement Email;

	@FindBy(id = "company_phone")
	WebElement PhoneNo;

	@FindBy(id = "company_fax")
	WebElement Fax;

	public void fillCombinecompanie(String company1, String industry1, String annualR1, String employees1,
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

	}

}

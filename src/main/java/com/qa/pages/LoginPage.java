package com.qa.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() throws InterruptedException {
		super();

	}

	@FindBy(name = "username")
	WebElement usernamee;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[.='Sign Up']")
	WebElement signUpBtn;

	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement crmLogo;

	@FindBy(xpath="//a[contains(.,'Logout')]")
	WebElement logout;
	public void titleofLoginPage() {
		Assert.assertEquals("Free CRM software for customer relationship management, sales, and support.",
				driver.getTitle());
	}
	public void login(String un, String pwd) throws InterruptedException {
		PageFactory.initElements(driver, this);
		usernamee.sendKeys(un);
		password.sendKeys(pwd);
	}
	public void clickloginbtn() {
		loginBtn.click();
	}
	public void titleofHomepgae() {
		Assert.assertEquals("CRMPRO", driver.getTitle());
	}
	public void logout() {
		logout.click();
	}

}

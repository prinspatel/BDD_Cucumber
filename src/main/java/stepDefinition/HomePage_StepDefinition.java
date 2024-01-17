package stepDefinition;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.utils.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePage_StepDefinition extends TestBase {

	public HomePage_StepDefinition() throws InterruptedException {
		super();
	}

	HomePage homepage = new HomePage();

	@Then("title of homepage is {string}")
	public void title_of_homepage_is(String title) {
		Assert.assertEquals(title, homepage.verifyHomePagetitle());
	}

	@Then("User of FreeCRM same as login user")
	public void User_of_FreeCRM_same_as_login_user() {
		driver.switchTo().frame("mainpanel");
		Assert.assertTrue(homepage.verifyCurrentUserName());
	}

	@Given("user alredy on Homepage")
	public void user_alredy_on_Homepage() {
		homepage.clickOnHomePage();
	}

	// Scenario: Verify Contact page
	@Then("User Nevigate to Contact Page")
	public void User_Nevigate_to_Contact_Page() throws InterruptedException {
		homepage.clickOnContactLink();
	}

	@Then("Verify Contact Page")
	public void Then_Verify_Contact_Page() {
		homepage.verifyContactPage();
	}

	// Scenario: Verify Deals Page
	@Then("User Nevigate to Deals Page")
	public void User_Nevigate_to_Deals_Page() throws InterruptedException {
		homepage.clickOnDealLink();
	}

	@Then("Verify Deal Page")
	public void Verify_Deal_Pagee() {
		homepage.VerifydealPage();
	}

	// Scenario: Verify Task Page
	@Then("User Nevigate to Task Page")
	public void User_Nevigate_to_Task_Page() throws InterruptedException {
		homepage.clickOnTaskLink();
	}

	@Then("Verify Task Page")
	public void Verify_Task_Page() {
		homepage.VerifytaskPage();
	}

	// Scenario: Verify Companies Page
	@Then("User Nevigate to Companies Page")
	public void User_Nevigate_to_Companies_Page() {
		homepage.comaniesPagelnk();
	}

	@Then("Verify Companies Page")
	public void Verify_Companies_Page() {
		homepage.verifycomaniesPage();
	}

	// Scenario: Verify Cases Page
	@Then("User Nevigate to Cases Page")
	public void User_Nevigate_to_Cases_Page() {
		homepage.casesPagelnk();
	}

	@Then("Verify Cases Page")
	public void Verify_Cases_Page() {
		homepage.verifycasesPage();
	}

	// Scenario: Verify Call Page
	@Then("User Nevigate to Call Page")
	public void User_Nevigate_to_Call_Page() {
		homepage.callPagelnk();
	}

	@Then("Verify Call Page")
	public void Verify_Call_Page() {
		homepage.verifycallPage();
	}

	// Scenario: Verify Forms Page
	@Then("User Nevigate to Forms Page")
	public void User_Nevigate_to_Forms_Page() {
		homepage.formPagelnk();
	}

	@Then("Verify Forms Page")
	public void Verify_Forms_Page() {
		homepage.verifyformPage();
	}

	// Scenario: Verify Reports Page
	@Then("User Nevigate to Reports Page")
	public void User_Nevigate_to_Reports_Page() {
		homepage.ReportsPagelnk();
	}

	@Then("Verify Reports Page")
	public void Verify_Reports_Page() {
		homepage.verifyReportsPage();
	}
	
	//Scenario: Verify Calendar Page
	@Then("User Nevigate to Calendar Page")
	public void User_Nevigate_to_Calendar_Page() {
		homepage.calendarPagelnk();
	}

	@Then("Verify Calendar Page")
	public void Verify_Calendar_Page() {
		homepage.verifycalendarPage();
	}
	

}

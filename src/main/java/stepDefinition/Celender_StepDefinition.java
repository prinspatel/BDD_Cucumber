package stepDefinition;

import com.qa.pages.CalanderPage;
import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Celender_StepDefinition extends TestBase {

	public Celender_StepDefinition() throws InterruptedException {
		super();
	}

	LoginPage loginpage = new LoginPage();
	CalanderPage calanderpage = new CalanderPage();

	@Given("User Nevigate to Homepage")
	public void user_nevigate_to_homepage() throws InterruptedException {
		initialization();
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginpage.clickloginbtn();
		driver.switchTo().frame("mainpanel");
	}

	@Then("Check Calander for selected user")
	public void check_calander_for_selected_user() {
		calanderpage.verifyUserForCalander(prop.getProperty("user"));
	}
	
	
	

}

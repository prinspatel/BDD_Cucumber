package stepDefinition;

import com.qa.pages.LoginPage;
import com.qa.utils.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage_StepDefinition extends TestBase{
	
	
	public LoginPage_StepDefinition() throws InterruptedException {
		super();
	}

	LoginPage loginpage= new LoginPage();

	@Given("user is already on Login Page")
	public void user_is_already_on_login_page() throws InterruptedException {
		TestBase.initialization();
	}

	@When("title of login page is Free CRM")
	public void title_of_login_page_is_free_crm() {
	  loginpage.titleofLoginPage();
	}

	@Then("user enters {string} and {string}")
	public void user_enters_and(String user, String pass) throws InterruptedException {
	 loginpage.login(user, pass);
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	  loginpage.clickloginbtn();
	}

	@Then("user is on Home Page")
	public void user_is_on_home_page() {
	   loginpage.titleofHomepgae();
	}

	@Then("logout")
	public void logout() {
		driver.switchTo().frame("mainpanel");
		loginpage.logout();
	}
	
    @Then("user must be in the LoginPage Veryfy title")
    public void userMustBeInTheLoginPage() {
        loginpage.titleofLoginPage();
    }
    
    @Then("Close Browser")
    public void Close_Browser() {
       driver.quit();
    }
    
}

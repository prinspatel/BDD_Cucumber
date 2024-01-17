package stepDefinition;

import org.junit.Assert;

import com.qa.pages.ContactsPage;
import com.qa.utils.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class Contact_StepDefinition extends TestBase {

	public Contact_StepDefinition() throws InterruptedException {
		super();
	}

	ContactsPage cp = new ContactsPage();

	@Then("User Moveover to New Contact Page")
	public void user_moveover_to_new_contact_page() {
		cp.movetonewcontect();
	}

	@Then("Verify New Contact Form")
	public void verify_new_contact_form() {
		cp.verifynewContactForn();
	}

	// Scenario: Verify Created Contacts
	@Then("User Enter New Contacts and Save")
	public void user_enter_new_contacts_and_save() throws InterruptedException {
		cp.AddNewContact();
	}

	@Then("Verify all contact name")
	public void Verify_all_contact_name() {
		Assert.assertTrue(cp.savedContacts());
	}

	// Scenario: Combine Form Fill Test
	@Then("User Moveover to Combile form Page")
	public void User_Moveover_to_Combile_form_Page() {
		cp.movetonewcombineform();
	}

	@Then("User Enter New Company {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void User_Enter_New_Company(String Company, String Industry, String AnnualRevenue, String Employees,
			String Identifier, String Website, String Email, String Phone, String Fax) {
		cp.fillCombinecompanie(Company, Industry, AnnualRevenue, Employees ,Identifier, Website, Email, Phone, Fax);
	}

	@And("Enter Contact Detail {string} {string} {string} {string} {string} {string} {string}")
	public void Enter_Contact_Detail(String title, String Firstname, String middlename, String lastname,
			String nichname, String possition, String department) {
		cp.fillCombineContaact(title, Firstname, middlename, lastname, nichname, possition, department);

	}


	



}

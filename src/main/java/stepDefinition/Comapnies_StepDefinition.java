package stepDefinition;

import java.util.List;

import com.qa.pages.CompaniesPage;
import com.qa.utils.TestBase;

import io.cucumber.java.en.Then;

public class Comapnies_StepDefinition extends TestBase {

	public Comapnies_StepDefinition() throws InterruptedException {
		super();
	}

	CompaniesPage companies = new CompaniesPage();

	@Then("User Mouseover to New Company")
	public void User_Mouseover_to_New_Company() {
		companies.moveoverToNewCompany();
	}

	@Then("User Enter Details {string} {string} {string} {string} {string} {string} {string} {string} {string}")
	public void User_Enter_Details(String company1, String industry1, String annualR1, String employees1,
			String identifier1, String website1, String email1, String phone, String fax) {
		companies.enter_company_details(company1, industry1, annualR1, employees1, identifier1, website1, email1, phone,
				fax);
	}
	
	
	@Then("User Mouseover to Full Search Form")
	public void user_mouseover_to_full_search_form() {
	    companies.mouseoveFullSearchForm();
	}
	@Then("Verify Full Search Form Page")
	public void veryfi_full_search_form_page() {
	    companies.verifyfullsearchformpage();
	}
	@Then("Search Company by {string} and {string}")
	public void search_company_by_and(String company, String industary, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<String> data = dataTable.row(0);
	    companies.fullsearchby(data.get(0), data.get(1));
	    
	}
	@Then("Verify Search Result {string}")
	public void veryfu_search_result(String Result, io.cucumber.datatable.DataTable dataTable) {
	    List<String> result = dataTable.row(0);
		companies.searchresult(result.get(0));
	}




}

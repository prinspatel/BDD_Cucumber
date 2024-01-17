package stepDefinition;

import org.junit.Assert;

import com.qa.pages.DealsPage;
import com.qa.utils.TestBase;

import io.cucumber.java.en.Then;

public class Deals_StepDefinition extends TestBase {

	public Deals_StepDefinition() throws InterruptedException {
		super();
	}

	DealsPage dp = new DealsPage();

	@Then("User Mouseover to New Deals")
	public void user_mouseover_to_new_deals() throws InterruptedException {
		dp.MoveovertoNewDeal();

	}

	@Then("Enter Details and Save {string} {string} {string} {string} {string} {string}")
	public void enter_details_and_save(String title, String string2, String string3, String string4, String string5,
			String string6) throws InterruptedException {
		dp.addNewDeal(title, string2, string3, string4, string5, string6);
	}

	// Scenario Outline: Add 5 new Products
	@Then("User Mouseover to Products")
	public void user_mouseover_to_products() throws InterruptedException {
		dp.Moveovertoproducts();
	}

	@Then("click on new Product")
	public void click_on_new_product() {
		dp.newProduct();
	}

	@Then("Add new product dtails {string} {string} {string} {string} {string} {string}")
	public void add_new_product_dtails(String productname, String Cost, String RetailValue, String WholesalePrice,
			String Upccode, String Inventory_Amount) {
		dp.addNewProduct(productname, Cost, RetailValue, WholesalePrice, Upccode, Inventory_Amount);
	}
	
	
	//Scenario: Verify Save Products
	@Then("Verify products")
	public void verify_products() {
	    Assert.assertTrue(dp.storedata());
	}




}

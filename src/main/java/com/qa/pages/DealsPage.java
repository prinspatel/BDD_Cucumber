package com.qa.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utils.TestBase;

public class DealsPage extends TestBase {
	Logger log = Logger.getLogger(DealsPage.class);

	@FindBy(xpath = "//a[normalize-space()='Deals']")
	WebElement dealslnk;

	@FindBy(xpath = "//input[@value='New Deal']")
	WebElement newdeal;

	@FindBy(id = "title")
	public WebElement title;

	@FindBy(xpath = "//input[@name='client_lookup']")
	public WebElement company;

	public DealsPage() throws InterruptedException {
		super();
	}

	public void openDealPage() throws InterruptedException {
		PageFactory.initElements(driver, this);
		dealslnk.click();
	}

	public String veryfingDealPage() {
		return newdeal.getAttribute("value");
	}

	@FindBy(xpath = "//a[normalize-space()='Deals']")
	WebElement dealslink;

	@FindBy(xpath = "//a[normalize-space()='New Deal']")
	WebElement savebtn;

	public void MoveovertoNewDeal() throws InterruptedException {
		PageFactory.initElements(driver, this);
		Actions action = new Actions(driver);
		action.moveToElement(dealslink).build().perform();
		savebtn.click();
	}

	@FindBy(xpath = "//input[@name='contact_lookup']")
	WebElement primerycontct;

	@FindBy(xpath = "//input[@id='amount']")
	WebElement amount;

	@FindBy(xpath = "//input[@id='probability']")
	WebElement Probability;

	@FindBy(xpath = "//input[@name='identifier']")
	WebElement identifier;

	@FindBy(xpath = "//input[@name='client_lookup']")
	WebElement companyy;

	public void addNewDeal(String Dtitle, String Dcompany, String pricontact, String Amount, String Prob, String Ide)
			throws InterruptedException {
		driver.findElement(By.id("title")).sendKeys(Dtitle);
		companyy.clear();
		companyy.sendKeys(Dcompany);
		primerycontct.sendKeys(pricontact);

		amount.sendKeys(Amount);
		Probability.sendKeys(Prob);
		identifier.sendKeys(Ide);

		driver.findElement(By.xpath("//input[@value='Save']")).click();

	}

	@FindBy(xpath = "(//a[normalize-space()='Products'])[1]")
	WebElement products;

	@FindBy(xpath = "//input[@value='New Product']")
	WebElement newProduct;

	@FindBy(name = "name")
	WebElement ProductName;

	@FindBy(id = "cost")
	WebElement cost;

	@FindBy(id = "retail_value")
	WebElement retailValue;

	@FindBy(id = "wholesale")
	WebElement Wholesaleprice;

	@FindBy(id = "sku")
	WebElement upccode;

	@FindBy(id = "inventory_amount")
	WebElement inventory_amount;

	public void Moveovertoproducts() throws InterruptedException {
		PageFactory.initElements(driver, this);
		Actions action = new Actions(driver);
		action.moveToElement(dealslink).build().perform();
		products.click();
	}

	public void newProduct() {
		newProduct.click();
	}

	public void addNewProduct(String productname, String Cost, String RetailValue, String WholesalePrice,
			String Upccode, String Inventory_Amount) {
		ProductName.sendKeys(productname);
		cost.clear();
		cost.sendKeys(Cost);
		retailValue.clear();
		retailValue.sendKeys(RetailValue);
		Wholesaleprice.clear();
		Wholesaleprice.sendKeys(WholesalePrice);
		upccode.clear();
		upccode.sendKeys(Upccode);
		inventory_amount.clear();
		inventory_amount.sendKeys(Inventory_Amount);

		driver.findElement(By.xpath("(//input[@value='Save'])[1]")).click();
	}
	
	@FindAll({@FindBy(xpath="((//table[@align='center']//tbody)[2])//td[1]//a")})
	List<WebElement> storeproduct;
	
	public boolean storedata() {
		int inventory = 0;

		if(storeproduct.size()>0) {
			return true;
		}
		else {
			return false;
		}
	}

}

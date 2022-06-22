package stepdefinition;


import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobject.LandingPageObject;
import pageobject.PageObjectManager;
import pageobject.ProductSearchObject;
import utilities.TestContextSetup;

public class ProductSearchPage {

	TestContextSetup testcontextsetup;
	String offerProductName;
	public PageObjectManager pageObject;

	public ProductSearchPage(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}

	@Then("^User searched for (.+) shortname in offer page$")
	public void user_searched_for_shortname_in_offer_page(String ShortName) throws Throwable {

		switchToOffersPage();

		ProductSearchObject searchItems=testcontextsetup.pageObject.searchObject();
		searchItems.searchItem(ShortName);
		Thread.sleep(4000);
		offerProductName=searchItems.getProductNames(); 
	}
	public void switchToOffersPage() {

		// pageObject  =new PageObjectManager(testcontextsetup.driver);
		LandingPageObject landingPage=testcontextsetup.pageObject.getLandingPage();
		landingPage.selectTopDeals();
		testcontextsetup.genericUtils.SwitchWindowToChild();
		//LandingPageObject obj= new LandingPageObject(testcontextsetup.driver);
		//obj.selectTopDeals();



	}

	@And("check if product exist with same name")
	public void check_if_product_exist_with_same_name() throws Throwable {


		Assert.assertEquals(offerProductName,testcontextsetup.productName);



	}
}




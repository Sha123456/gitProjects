package stepdefinition;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobject.CheckOutPage;
import utilities.TestContextSetup;



public class CheckOutPageStepDefinition {
public WebDriver driver;
public String landingPageProductName;
public String offerPageProductName;
	
	public CheckOutPage checkoutpage;
	
	TestContextSetup testcontextsetup;

	
	public CheckOutPageStepDefinition(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		this.checkoutpage=testcontextsetup.pageObject.getcheckoutpage();
	}
	
	@And("verify user has ability to enter promo code and place the order")
	
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
		
		  
		Assert.assertTrue(checkoutpage.verifypromoBtn());
		Assert.assertTrue(checkoutpage.verifyplaceOrder());
		
	}
	
	@Then ("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	
	public void user_proceeds_to_Checkout(String name) throws InterruptedException
	{
		
		checkoutpage.CheckoutItems();
		
	//Assertion to extract name from screen and compare with name

}
}


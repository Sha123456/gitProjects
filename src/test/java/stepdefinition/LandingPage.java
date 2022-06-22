package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobject.LandingPageObject;
import utilities.TestContextSetup;

public class LandingPage {

	TestContextSetup testcontextsetup;
	public  LandingPageObject landingpage;
	public WebDriver driver;
	
	


	public LandingPage(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		this.landingpage=testcontextsetup.pageObject.getLandingPage();
	}

	@Given("User is on GreenCart Landing page")
	public void user_is_on_greencart_landing_page() throws Throwable {
		Assert.assertTrue(landingpage.getTitleLandingPage().contains("GreenKart")); 

	}
	@When("^User searched with shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String ShortName) throws Throwable 
	{
		//LandingPageObject landingpage=new LandingPageObject(testcontextsetup.driver);

		landingpage.searchItem(ShortName);

		//testcontextsetup.driver.findElement(By.xpath("//input [@type='search']")).sendKeys(ShortName);
		Thread.sleep(2000);
		testcontextsetup.productName=landingpage.getProductName().split("-")[0].trim();
		System.out.println(testcontextsetup.productName +"is extracted");


	}

	@When("added {string} items of the selected product to the cart")

	public void added_items_product(String quantity) {

		landingpage.incrementQuantity(Integer.parseInt(quantity));
		
		landingpage.addToCart();

	}





}




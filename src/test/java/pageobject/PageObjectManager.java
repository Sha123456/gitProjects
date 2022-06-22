package pageobject;

import org.openqa.selenium.WebDriver;




public class PageObjectManager {
	public LandingPageObject landingPage;
	public WebDriver driver;
	public ProductSearchObject searchObject;
	public CheckOutPage checkoutpage;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver =driver;
	}
	
	
	public LandingPageObject getLandingPage() {
		
	landingPage = new LandingPageObject(driver);
	return landingPage;
	
	}

	public  ProductSearchObject searchObject () {
		
		searchObject= new ProductSearchObject(driver);
		
		return searchObject;
	}
	
	public CheckOutPage getcheckoutpage() {
		
		
		checkoutpage=new CheckOutPage(driver); 
		
		return  checkoutpage;
	}
}

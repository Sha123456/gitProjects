package utilities;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageobject.PageObjectManager;

public class TestContextSetup {
	
	public WebDriver driver;
	public String productName; 
	public PageObjectManager pageObject;
	public TestBase testbase;
	public GenericUtils genericUtils;

	
	
	public TestContextSetup() throws IOException{
		
		testbase=new TestBase();
		pageObject =new PageObjectManager(testbase.WebDriverManager());
		genericUtils = new GenericUtils(testbase.WebDriverManager());
	}
	
	{
	

}
}

package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.Util.TestUtil;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	TestUtil testutil;
	ContactPage contactpage;
	
	
	public HomePageTest() {
		
		super();
		
	}
	@BeforeMethod
	public void setup() throws InterruptedException {
		
		init();
		loginpage = new LoginPage();
		homepage =loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
		testutil = new TestUtil();
		contactpage = new ContactPage();
	}
	
	@Test(priority = 1)
	public void VerifyUsernameTest() {
		testutil.SwitchToFrame();
		String Username = homepage.validateusernmae();		
		Assert.assertEquals(Username,"  User: Perry gami");
	}
	
	@Test(priority = 2)
	public void VerifyContactLink() {
		
		testutil.SwitchToFrame();
		contactpage = homepage.Contacts();		
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}
}

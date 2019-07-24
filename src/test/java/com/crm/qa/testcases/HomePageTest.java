package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	
	public HomePageTest() {
		
		super();
		
	}
	@BeforeMethod
	public void setup() {
		
		init();
		loginpage = new LoginPage();
		loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@Test
	public void VerifyUsernameTest() {
		
		String Username = homepage.validateusernmae();		
		Assert.assertEquals(Username, "Perry gami");
	}
	
	

	
	
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
		
	}
}

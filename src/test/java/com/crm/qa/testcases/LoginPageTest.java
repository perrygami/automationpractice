package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	
	LoginPage loginPage;
	HomePage homePage;
	
	@BeforeMethod
	public void setup() {
		init();
	}
	
	@Test
	public void LoginPagetileTest() {
		loginPage = new LoginPage();
		String title = loginPage.validatePageName();
		Assert.assertEquals(title,"CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	@Test
	public void LoginTest() throws InterruptedException {
		Thread.sleep(1000);
		homePage = loginPage.Login(prop.getProperty("username"),prop.getProperty("password"));
	}

	/*@AfterMethod
	public void Teardown() {
		driver.close();
		
	}*/
}

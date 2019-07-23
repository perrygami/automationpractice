package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;

public class LoginPageTest extends TestBase {
	
	@BeforeMethod
	public void setup() {
		
		init();
		
	}

	@AfterMethod
	public void Teardown() {
		
		driver.quit();
	}
}

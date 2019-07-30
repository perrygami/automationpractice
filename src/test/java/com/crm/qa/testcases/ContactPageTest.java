package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class ContactPageTest extends TestBase {
	
	LoginPage loginpage;
	

public ContactPageTest() {
		
		super();
		
	}  






@BeforeMethod
public void setup() throws InterruptedException {
	
	init();
	loginpage = new LoginPage();
	loginpage.Login(prop.getProperty("username"),prop.getProperty("password"));
	
}


}

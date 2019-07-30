package com.crm.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.Util.TestUtil;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactPageTest extends TestBase {

	HomePage homepage;
	LoginPage loginpage;
	TestUtil testutil;
	ContactPage contactpage;
	String sheetname = "contact";

	public ContactPageTest() {

		super();

	}

	@BeforeMethod
	public void setup() throws InterruptedException {

		init();
		loginpage = new LoginPage();
		homepage = loginpage.Login(prop.getProperty("username"), prop.getProperty("password"));
		testutil = new TestUtil();
		contactpage = new ContactPage();
		testutil.SwitchToFrame();
		contactpage = homepage.Contacts();
	}

	@DataProvider
	public Object[][] getTestData() {
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
		
	}
	@Test(dataProvider = "getTestData")
	public void TestCreateNewContact(String title,String firstname,String Lastname,String company) {
		homepage.clickonNewContactLink();
		contactpage.createNewContact(title,firstname,Lastname,company);

	}

}//commit test done by perry

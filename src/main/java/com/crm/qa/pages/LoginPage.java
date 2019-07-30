package com.crm.qa.pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	// Page Factory
	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement Login;

	// PageFactory Intilization
	public LoginPage() {

		PageFactory.initElements(driver, this);

	}

	// Actions

	public String validatePageName() {
		String title = driver.getTitle();
		return title;
	}

	public HomePage Login(String uname, String pwd) throws InterruptedException {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		Thread.sleep(1000);
		Login.click();

		return new HomePage();
	}

}

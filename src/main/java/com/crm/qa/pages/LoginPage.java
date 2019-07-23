package com.crm.qa.pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"ui\"]/div/div/form/div/div[4]")
	WebElement Login;

	//PageFactory Intilization 
	public LoginPage() {
		
		PageFactory.initElements(driver,this);
		
		}
	
	
	//Actions
	
	public String validatePageName() {
		String title = driver.getTitle();
		return title;
		}
	
	public HomePage Login(String mail,String pwd) {
		email.sendKeys(mail);
		password.sendKeys(pwd);
		Login.click();
		
		return new HomePage();
	}
}

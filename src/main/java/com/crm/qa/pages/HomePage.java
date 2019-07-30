package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	//PAGE FACTORY
	
	@FindBy(xpath= "/html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
	WebElement userLable;
	
	
	@FindBy(xpath= "/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/a")
	WebElement Contacts;
	
	
	
	@FindBy(xpath= "/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[6]/a")
	WebElement Task;
	
	@FindBy(xpath = "/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/ul/li[1]/a")
	WebElement NewContact;

	//PageFactory Intilization 
		public HomePage() {
			
			PageFactory.initElements(driver,this);
			
			}
	
		//Actions
		
	public String validateusernmae() {
		
		String username = userLable.getText();
		return username;
	}
	
	
	public String validateHomePagetitle() {
		
		String Title = driver.getTitle();
		return Title;
	}
	public ContactPage Contacts() {
		
		Contacts.click();
		return new ContactPage();
		
	}
	
	public TaskPage Task() {
		
		Task.click();
		return new TaskPage();
	}
	public void clickonNewContactLink() {
		
		Actions action= new Actions(driver);
		action.moveToElement(Contacts).build().perform();
		NewContact.click();
		
	}
}

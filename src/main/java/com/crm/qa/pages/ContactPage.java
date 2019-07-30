package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactPage extends TestBase {

	// PAGE FACTORY

	@FindBy(xpath = "/html/body/table[1]/tbody/tr[3]/td[1]/div/div/ul/li[4]/a")
	WebElement ContactLable;

	@FindBy(id = "first_name")
	WebElement FirstName;

	@FindBy(id = "surname")
	WebElement LastName;

	@FindBy(name = "client_lookup")
	WebElement Company;

	@FindBy(xpath = "/html/body/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/fieldset/form/table/tbody/tr[1]/td/input[2]")
	WebElement Save;

	// PageFactory Intilization
	public ContactPage() {

		PageFactory.initElements(driver, this);

	}

	
	public boolean verifyContactLable() {
		return ContactLable.isDisplayed();

	}

	public  void createNewContact(String title, String fname, String Lname, String cmpny) {

		Select select = new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
		FirstName.sendKeys(fname);
		LastName.sendKeys(Lname);
		Company.sendKeys(cmpny);
		Save.click();
		

	}
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage extends BasePage {
  public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
  //*********Page Variables*********
  String baseURL = "http://www.n11.com/";

  //*********Web Elements*********
  By signInButtonBy = By.className("btnSignIn");


  //*********Page Methods*********
  //Go to Homepage
  public HomePage goToN11 (){
      driver.get(baseURL);
      return this;
  }

  //Go to LoginPage
  public LoginPage goToLoginPage (){
      click(signInButtonBy);
      return new LoginPage(driver);
  }
}

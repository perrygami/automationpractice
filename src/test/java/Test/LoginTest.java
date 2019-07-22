package Test;

import org.testng.annotations.Test;

import Pages.HomePage;
import pages.LoginPage;
public class LoginTest extends BaseTest{
  @Test
  public void invalidLoginTest_InvalidUserNameInvalidPassword() {
	  
	  HomePage homepage = new HomePage(driver);
	  
  }
}

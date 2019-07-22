package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
WebDriver driver;

  @BeforeTest
  public void launchbrowser() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "/Users/perry.gami/Documents/Eclipse/chromedriver");
	  driver = new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
      
      //Closing the browser
      driver.quit();

  }
  @Test
  public void maxwindow() {
	  driver.manage().window().maximize();
	  
	  
	  
  }
}

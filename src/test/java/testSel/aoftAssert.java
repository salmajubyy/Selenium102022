package testSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class aoftAssert {
	
	SoftAssert softassert = new SoftAssert();
  @Test
  public void f() {
	  String exePath = "./drive/chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", exePath);//agregando la propiedad con la ruta del chromeDriver
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://parabank.parasoft.com/");
	  
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "ParaBank | Welcome | Online Banking";
	  String badTitle = "ParaBank | Banking";
	  
	  softassert.assertEquals(actualTitle, badTitle);
	  softassert.assertEquals(actualTitle, expectedTitle);
	  
	  softassert.assertAll();
	  
  }
}

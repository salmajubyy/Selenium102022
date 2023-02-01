package testSel;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class HardAssert {
  public void f() {
	  String exePath = "./drive/chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", exePath);//agregando la propiedad con la ruta del chromeDriver
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://parabank.parasoft.com/");
	  
	  String actualTitle = driver.getTitle();
	  String expectedTitle = "ParaBank | Welcome | Online Banking";
	  
	  Assert.assertEquals(actualTitle, expectedTitle);
  }
}

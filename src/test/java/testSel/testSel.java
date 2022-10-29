package testSel;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class testSel {
  @Test
  public void f() {
		
			String exePath = "./drive/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exePath);//agregando la propiedad con la ruta del chromeDriver
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
  }
}

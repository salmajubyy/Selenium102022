package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_test {

	public static void main(String[] args) {
		String exePath = "./drive/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);//agregando la propiedad con la ruta del chromeDriver
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
}

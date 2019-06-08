package demoJK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayDemo {
	public static WebDriver driver;
	
	public static void openBrowser(WebDriver driver, String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "G:\\Java\\Selenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
		}
		
	}

}

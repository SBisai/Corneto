package demoJK;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayDemo {
	
	
	public static void openBrowser(WebDriver driver, String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
			
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
		}
		
	}

}

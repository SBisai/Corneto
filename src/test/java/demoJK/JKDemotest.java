package demoJK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JKDemotest {
	
	
	@Test
	
	public void testOne() throws Exception {
		
	
		System.setProperty("webdriver.chrome.driver", "G:\\Java\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.seleniumhq.org");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[titke='get Selenium']")).click();
		System.out.println(driver.getTitle());
		
		driver.close();
				
	}

}

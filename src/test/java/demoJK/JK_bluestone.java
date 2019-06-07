package demoJK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class JK_bluestone {
	
	@Test
	
	public void goldmineVarification() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "G:\\Java\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='10+1 Monthly Plan ']")).click();
		
		driver.findElement(By.id("amount")).sendKeys("15000");
		driver.findElement(By.id("Email")).sendKeys("goldmine@gmail.com");
		driver.findElement(By.id("gmsStart")).click();
		
		Thread.sleep(3000);
		WebElement emailAdd = driver.findElement(By.xpath("//input[@id='email']"));
		String email = emailAdd.getText();
		Reporter.log(email+"Printed?", true);
		
		WebElement subAmount = driver.findElement(By.xpath("//span[@name='subscriptionAmount']"));
		String amount = subAmount.getText();
		Reporter.log(amount, true);
		
		Assert.assertEquals(amount, "Rs 15,000");
		driver.close();
	}


}

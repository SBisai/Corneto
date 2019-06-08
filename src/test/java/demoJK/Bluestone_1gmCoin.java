package demoJK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bluestone_1gmCoin {
	
@Test
	
	public void  goldCoinValidation() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		WebElement goldCoinMenu = driver.findElement(By.xpath("//li[@id='goldCoins']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(goldCoinMenu).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-1gms,m']")).click();
		Thread.sleep(2000);
		
		WebElement title = driver.findElement(By.xpath("//div[@id='details-top-right-inner']//h1[@class='title-5']"));
		String actTitleText = title.getText();
		
		
		String expTitleText="1 gram 24 KT Gold Coin";
		
		Assert.assertEquals(actTitleText, expTitleText);
		
		Reporter.log("Validated", true);
		
		driver.close();
	}

}

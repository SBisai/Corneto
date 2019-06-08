package demoJK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bluestone_10 {
	
	@Test
	
	public void fetchOfferProduct() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		
		WebElement offers = driver.findElement(By.xpath("//a[text()='Offers ']"));
		
		action.moveToElement(offers).build().perform();
		Thread.sleep(3000);
		WebElement perOfferLink = driver.findElement(By.xpath("//span[text()='Flat 10% Off']"));
		perOfferLink.click();
		Thread.sleep(3000);
		
		/*WebElement fliterBy = driver.findElement(By.xpath("//div[@class='filtered-data']//span[@class='filterDisplayName']"));
		String textfilterBy = fliterBy.getText();*/
		List<WebElement> productList = driver.findElements(By.xpath("//span[@class='orange-color']"));
		System.out.println("Total products are: "+productList.size());
		for (WebElement product : productList) {
			
			String offerPercentage = product.getText();
			Reporter.log(offerPercentage, true);
			
		}
		driver.close();
		
	}	

}

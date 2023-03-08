package MutiLevelMenuHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBaksetMultiMenu {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");

		Thread.sleep(3000);
		
		selectProductLevel4Handling("Beverages","Tea","Tea Bags");

	}

	
	public static void selectProductLevel4Handling(String L2, String L3, String L4 ) throws InterruptedException
	{

		WebElement shopparent = driver.findElement(By.cssSelector("a.meganav-shop"));

		Actions act = new Actions(driver);

		act.moveToElement(shopparent).build().perform();

		Thread.sleep(2000);

		WebElement beverages = driver.findElement(By.linkText(L2));

		act.moveToElement(beverages).build().perform();

		Thread.sleep(2000);

		WebElement tea = driver.findElement(By.linkText(L3));

		act.moveToElement(tea).build().perform();

		Thread.sleep(2000);

		WebElement teabag=driver.findElement(By.linkText(L4));
		
		teabag.click();
	}
}

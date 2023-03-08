package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.aqi.in/dashboard/canada");
//		
//		Thread.sleep(2000);
//		
//		WebElement ele = driver.findElement(By.linkText("Kent, Canada"));
//		
//		String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
//		System.out.println(rightIndex);
//		
//		
//		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
//		System.out.println(leftRank);
//
//		
//		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
//		System.out.println(aboveCity);
//		
//		
//		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
//		System.out.println(belowCity);
//		
//		
//		String nearCity = driver.findElement(with(By.tagName("a")).near(ele)).getText();
//		System.out.println(nearCity);
		
		
		//---------------practice----------------------
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Thread.sleep(2000);
		
		WebElement ee=driver.findElement(By.id("input-email"));
//		ee.sendKeys("found");
//		Thread.sleep(3000);
		
		String text=driver.findElement(with(By.xpath("//label[text()='E-Mail Address']")).above(ee)).getText();
		System.out.println(text);
		
		String Near=driver.findElement(with(By.xpath("(//h2)[2]")).near(ee)).getText();
		System.out.println(Near);
	}

}

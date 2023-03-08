package ActionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By continueBtn = By.cssSelector("input[type='submit']");

		Actions act = new Actions(driver);
	
				
//		act.sendKeys(driver.findElement(fn), "naveen").build().perform();
//		act.sendKeys(driver.findElement(ln), "automation").build().perform();
//		act.click(driver.findElement(continueBtn)).build().perform();
		
//		Actions act = new Actions(driver);
//		  WebElement ele;
//		  act.moveToElement(ele).sendKeys("");
//		  act.sendKeys(ele, "ddddd");
//		  act.moveToElement(ele).click().sendKeys("dddd");
//		  act.moveToElement(ele).pause(Duration.ofSeconds(2000)).click().sendKeys(keys)

		// ElementNotInteractableException
		// ElementNotInterceptedException

		doActionsSendKeys(fn, "Naveen");
		doActionsSendKeys(ln, "Automation");
		doActionsCick(continueBtn);
		
	

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).build().perform();
	}

	public static void doActionsCick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).build().perform();
	}

}

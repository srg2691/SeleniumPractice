package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfields {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		List<WebElement> textfields=driver.findElements(By.className("form-control"));
		
		//if selenium cant find the required elements, the list size is 0
		//it will not throw nosuchelementexception
		
		System.out.println(textfields.size());
		
		driver.quit();
	}
}

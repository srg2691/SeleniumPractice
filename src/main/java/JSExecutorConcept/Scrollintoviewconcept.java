package JSExecutorConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollintoviewconcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		
		
		WebElement ele=driver.findElement(By.xpath("//span[text()='Popular items this season']"));
		
		
		JavaScriptUtil jsUtil=new JavaScriptUtil(driver);
		
		jsUtil.scrollIntoView(ele);
		
		//click - clicks on UI-middle of element
		//actions click--moves to element and clicks in middle of the element
		
		//Js Click - last preference from the above two as it would interact with the DOM
		//and not directly with browser
		
		WebElement registry=driver.findElement(By.linkText("Registry"));
		
		jsUtil.clickElementByJS(registry);
		
		
		
		

	}

}

package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectionWebTable {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
			
			driver.get("https://selectorshub.com/xpath-practice-page/");
			
			Thread.sleep(3000);
			
			while(true)
			{
				if(driver.findElements(By.xpath("//td[text()='India']")).size()>0);
				{
					selectCountry("India");
					break;
				}
			}
			
			
			
			
			

	}
	
	private static void selectCountry(String countryName) {
		
		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
		
	}

}

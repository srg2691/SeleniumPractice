package Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownwithoutSelect {
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.navigate().to("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		By country=By.id("Form_getForm_Country");
		By countryoptions=By.xpath("//select[@id='Form_getForm_Country']/option");
		
		//List<WebElement> optionsList=driver.findElements(country); - this will give only one option 
		
//		List<WebElement> optionslist=driver.findElements(countryoptions);
//		
//		for(WebElement e:optionslist)
//		{
//			String text=e.getText();
//			System.out.println(text);
//			if(text.equals("India"))
//			{
//				e.click();
//				break;
//			}
//		}
		
		getalloptionswithoutselect(countryoptions,"India");
		
		}
	
	
	
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static void getalloptionswithoutselect(By locator,String text )
	
	{
		List<WebElement> alloptionslist=getElements(locator);
		
		for(WebElement e: alloptionslist)
		{
			String text1=e.getText();
			System.out.println(text1);
			if(text.equals(text1))
			{
				e.click();
				break;
			}
		}
		
	}
	
	
	
	
}

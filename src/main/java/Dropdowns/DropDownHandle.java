package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		 driver=new ChromeDriver();
		driver.navigate().to("https://www.orangehrm.com/orangehrm-30-day-trial");
		
		
		//Use Select class
		
//		WebElement country_ele=driver.findElement(country);
//		Select select=new Select(country_ele);
		//pass the webelement to select class object
		
		//select.selectByIndex(6);//index starts from 0
		
		//select.selectByValue("India");//value is case sensitive
		//select.selectByValue("India1");//no such element exception

		
//		select.selectByVisibleText("Pakistan");
		
		//above 3 methods only work for html tag -- select
//		
		By country=By.id("Form_getForm_Country");
		doSelectDropdownByIndex(country, 6);
		Thread.sleep(2000);
		doSelectDropdownByValue(country, "Belgium");
		Thread.sleep(2000);
		doSelectDropdownByVisibleText(country, "India");
		
	}
	
	//utility for dropdown 
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSelectDropdownByIndex(By locator,int index)
	{
		Select select=new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	
	public static void doSelectDropdownByValue(By locator,String value)
	{
		Select select=new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectDropdownByVisibleText(By locator,String text)
	{
		Select select=new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
	
}

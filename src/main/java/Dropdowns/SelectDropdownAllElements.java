package Dropdowns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownAllElements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 driver=new ChromeDriver();
			driver.navigate().to("https://www.orangehrm.com/orangehrm-30-day-trial");
			
			
			
			//Select select =new Select(driver.findElement(country));
			
			
//			List<WebElement> countrylist=select.getOptions();//all options in the dropdown will be returned
//			
//			System.out.println(countrylist.size()-1);
//			
//			for(WebElement e:countrylist)
//			{
//				
//				//we can use below way to select value from dropdown
//				//without using select class methods 
//				
//				String text=e.getText();
//				System.out.println(text);
//				if(text.equals("India"))
//				{
//					e.click();
//					break;
//				}
//			}
			By country=By.id("Form_getForm_Country");
			
			//calling method to get dropdown options count
			
			if(getTotalDropDownOptions(country)-1==232)
			{
			System.out.println("country dropdown count is correct");
			}
			
			if(getDropdownOptionsTextList(country).contains("India"))
			{
				System.out.println("India is present");
			}
			
			
			
			List<String> expectedCountryList=Arrays.asList("India","Brazil","Belgium");
			if(getDropdownOptionsTextList(country).containsAll(expectedCountryList))
			{
				System.out.println("PASS");
			}
			
			selectDropDownValue(country, "Haiti");
			
	}
			
			
			
			public static WebElement getElement(By locator)
			{
				return driver.findElement(locator);
			}
			
			public static List<WebElement> getDropDownOptionsList(By locator)
			{
				Select select=new Select(getElement(locator));
				return select.getOptions();
			}
			
			public static void selectDropDownValue(By locator, String expValue)
			{
				List<WebElement> optionsList=getDropDownOptionsList(locator);
				
				for(WebElement e:optionsList)
				{
					String text=e.getText();
					System.out.println(text);
					if(text.equals(expValue))
					{
						e.click();
						break;
					}
				}
			}
			
			
			
			public static List<String> getDropdownOptionsTextList(By locator)
			{
				List<WebElement> optionsList=getDropDownOptionsList(locator);
				List<String> optionsTextList=new ArrayList<String>();
				for(WebElement e:optionsList)
				{
					String text=e.getText();
					optionsTextList.add(text);
					
				}
				return optionsTextList;
			}
			
			public static int getTotalDropDownOptions(By locator)
			{
				int optionsCount= getDropDownOptionsList(locator).size();
				System.out.println("total options ="+optionsCount);
				return optionsCount;
			}
			
			

	}



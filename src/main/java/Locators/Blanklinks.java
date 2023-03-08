package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Blanklinks {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		// find all links on the page
		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		// print the total links count
		int linksCount = linksList.size();
		int Actcount = 0;

//		for (int i = 0; i < linksCount; i++) {
//			String text = linksList.get(i).getText();
//			if (text.length() > 0) {
//				System.out.println(i + ":" + text);
//				++Actcount;
//			}
			
			//foreach loop 
			int counter=0;
			for(WebElement e:linksList)
			{
				String text1=e.getText();
				if(text1.length()>0)
				{
					System.out.println(counter+" "+text1);
					++Actcount;
					++counter;
				}
				
			}
			
			
			
		
	
	
		System.out.println("Non blank links count is  "+Actcount);
		
		int blanklinks=linksCount-Actcount;
		
		System.out.println(" Blank links count is "+blanklinks);
		
		driver.quit();

	}
}

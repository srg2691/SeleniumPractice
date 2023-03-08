package BrowserLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browsing {
	
	

	public static void main(String[] args) {
		
		String browser="chrome";
		WebDriver driver=null;
		
		switch (browser) {
		case "chrome":
			
			if(browser.equalsIgnoreCase("Chrome"))
			{
				driver=new ChromeDriver();
				driver.get("https://www.google.com");
				String ActTitle=driver.getTitle();
				System.out.println(ActTitle);
				driver.quit();
				
			}
			
			break;
			
		case "firefox":	
			if(browser.equalsIgnoreCase("Firefox"))
			{
				driver=new FirefoxDriver();
				driver.get("https//www.google.com");
				driver.getTitle();
				
				
			}
			
		case "safari":
			
			if(browser.equalsIgnoreCase("Safari"))
			{
				driver=new SafariDriver();
				driver.get("https//www.google.com");
				driver.getTitle();
				
			}
			

		default:
			System.out.println(" please enter valid browser");
			break;
		}
		
		

	}

}

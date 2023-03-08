package BrowserLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtility {
	//utility methods
	private WebDriver driver;
	
	
	/**
	 * 
	 * @param browsername
	 * @return this returns driver
	 */
	public WebDriver initDriver(String browsername)
	
	{
		System.out.println("browser name is "+browsername);
		
		switch (browsername.toLowerCase().trim()) {
		case "chrome":
			
			driver= new ChromeDriver();
			break;
			
		case "Firefox":
			
			driver= new FirefoxDriver();
			break;

		default:
			System.out.println(" please give valid browser");
			break;
		}
		return driver;
	}



	// https://www.amazon.com
	public void launchURL(String url) {
		if (url == null) {
			System.out.println("url can not be null");
		}

		if (url.indexOf("https") == 0) {
			driver.get(url);
		}
	}
	
	public void LaunchURL(String url)
	{
		if(url==null)
		{
			System.out.println(" url cannot be null");
			
		}
			
		if(url.indexOf("https")==0)
		{
			driver.get(url);
		}
		
	}
	
	public String getPageTitle()
	{
		String Title=driver.getTitle();
		System.out.println(" Page title is "+Title);
		return Title;
	}
	
	public void closeBrowser()
	{
		if(driver!=null)
		{
			driver.close();
		}
	}
	
	public void quitBrowser()
	{
		if(driver!=null)
		{
			driver.quit();
		}
}
}



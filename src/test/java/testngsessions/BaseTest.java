package testngsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
	
	WebDriver driver;
	
	@Parameters({"url","browser"})//reading parameters from testng xml file
	@BeforeTest
	public void setup(String url,String browserName)
	{
		//cross browser logic
		System.out.println("running test on "+browserName);
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
		else if (browserName.equalsIgnoreCase("safari"))
		{
			driver= new SafariDriver();
		}
		
		else
		{
			System.out.println(" please pass the right brwoser.."+browserName);
		}
		
		
		
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(url);
		
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	



}

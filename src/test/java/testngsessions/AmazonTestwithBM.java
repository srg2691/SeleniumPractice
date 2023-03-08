package testngsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTestwithBM {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().window().maximize();
	   driver.get("https://amazon.com");
	}
	
	//tcs should be independent
	//AAA Rule
	//AAA Stands for : Arrange,Act,Assert
	
	//1tc should be written with one assertion only as a best practice
	@Test(priority = 1)
	public void titleTest()//3
	{
		String title=driver.getTitle();
		System.out.println("page title is "+title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}
	
	@Test(priority = 2)
	public void searchExistTest()//2
	{
		boolean flag=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority = 3)
	public void isHelpExistTest()//1
	{
		boolean flag=driver.findElement(By.linkText("Help")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}

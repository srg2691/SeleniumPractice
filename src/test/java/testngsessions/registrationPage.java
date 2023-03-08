package testngsessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class registrationPage {
	
	public WebDriver driver;
	
	public boolean doRegister(String fn, String ln, String email, String phone, String password)
	{
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(fn);
		
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(ln);
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(phone);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		String successmsg=driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
		System.out.println(successmsg);
		
		if(successmsg.equalsIgnoreCase("Your Account Has Been Created!"))
		{
			return true;
		}
		
		return false;
	}


	
	@DataProvider//[row][col]
	public Object[][] getRegTestData() {
		return new Object[][] { //[3][5]
			
			{"Heena", "Vaghela", "heena@gmail.com", "9090909098", "heena@123"},
			{"vinutha", "ravindra", "vinu@gmail.com", "9090909099", "vinu@123"},
			{"supriya", "bendukuri", "supriya@gmail.com", "9090909088", "sup@123"},
		};
	}
	
	
	@Test(dataProvider = "getRegTestData", priority = 2)
	public void registerTest(String fn, String ln, String email, String phone, String password) {
		System.out.println(fn + ln + email + phone + password);
		boolean flag=doRegister(fn, ln, email, phone, password);
		Assert.assertTrue(flag);
	}
	
	
	@BeforeTest
	public void setup()
	{
		
		driver= new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}

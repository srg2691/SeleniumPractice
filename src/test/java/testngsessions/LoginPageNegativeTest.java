package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
	
	public WebDriver driver;
	
	
	public boolean doLogin(String userName,String password)
	{
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String errorMesg=driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errorMesg);
		
		if (errorMesg.contains("No match for E-Mail Address and/or Password")) {
			return true;
		}
		return false;
	}
	
	
	
	@DataProvider//data drivern approach
	public Object[][] getLoginNegativeData()
	{
		return new Object[][] {
			
			{"dfsdjfsddsf@gmail.com", "test1231242332"},
			{"dfsdjf234sf@gmail.com", "test1231242332"},
			{"dfsdjfdsfsdsf@gmail.com", "testsdd31242332"},
			{"12142", "87987"},
			
		};
	}
	
	@Test(dataProvider = "getLoginNegativeData")//mapping the data provider to the method to which we want to supply the data
	public void loginTest(String userName,String password)
	{
		boolean flag=doLogin(userName, password);
		Assert.assertTrue(flag);
		//Assert.assertTrue(doLogin("dfsdjfsddsf@gmail.com", "test1231242332"));
		
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

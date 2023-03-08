package testngpractice;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class openCartLoginPageTest extends BaseTest {
	
	
	@Test(priority = 1)
	public void isEmailfieldPresent()
	{
		boolean email=driver.findElement(By.id("input-email")).isDisplayed();
		Assert.assertTrue(email);
	}
	
	@Test(priority = 2)
	public void ispasswordfieldPresent()
	{
		boolean password=driver.findElement(By.id("input-password")).isDisplayed();
		Assert.assertTrue(password);
	}
	
	@Test(priority = 3)
	public void isLoginbtnEnabled()
	{
		boolean button=driver.findElement(By.xpath("//input[@class='btn btn-primary']")).isEnabled();
		Assert.assertTrue(button);
	}
}

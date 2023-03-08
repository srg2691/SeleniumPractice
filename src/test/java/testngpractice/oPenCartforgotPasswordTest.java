package testngpractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class oPenCartforgotPasswordTest extends BaseTest {
	
	
	@Test(priority = 1)
	public void HeadingTest()
	{
		boolean heading=driver.findElement(By.xpath("//h1")).isDisplayed();
		Assert.assertTrue(heading);
	}
	
	
	@Test(priority = 2)
	public void emailFieldPresentTest()
	{
		boolean email=driver.findElement(By.id("input-email")).isEnabled();
		Assert.assertTrue(email);
	}

}

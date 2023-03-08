package testngpractice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartHomePageTest extends BaseTest {
	
	
	
	@Test(priority = 1)
	public void TitleTest()
	{
		String title=driver.getTitle();
		System.out.println(" Page title is  "+title);
		Assert.assertEquals(title, "Your Store");
	}
	
	
	@Test(priority = 2)
	public void isLogoDisplayed()
	{
		boolean displayed=driver.findElement(By.xpath("//img[@title='naveenopencart']")).isDisplayed();
		Assert.assertTrue(displayed);
		
	}

}

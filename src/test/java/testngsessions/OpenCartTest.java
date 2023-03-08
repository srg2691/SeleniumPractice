package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest  {
	//this test wont run individually since testng.xml is created 

	@Test(priority = 1)
	public void titleTest() {
		//driver.get("https://naveenautomationlabs.com/opencart/");//this is being provided by @Parameter annotation
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		Assert.assertEquals(title, "Your Store");
	}

	@Test(priority = 2)
	public void searchExistTest() {
		boolean flag = driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	
}
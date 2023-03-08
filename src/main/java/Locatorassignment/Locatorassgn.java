package Locatorassignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Locators.ElementUtil;

public class Locatorassgn {
	
	static WebDriver driver;
	

	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1st approach - directly find elements 
//		
//		driver.findElement(By.id("input-firstname")).sendKeys("Sarang");
//		driver.findElement(By.id("input-lastname")).sendKeys("Anand");
//		driver.findElement(By.id("input-email")).sendKeys("sarang.anand2691@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("909085746");
//		driver.findElement(By.id("input-password")).sendKeys("password");
//		driver.findElement(By.id("input-confirm")).sendKeys("password");
		
		//2nd approach - store element in Webelemnt and do sendkeys separately
		
//		WebElement fname=driver.findElement(By.id("input-firstname"));
//		WebElement lname=driver.findElement(By.id("input-lastname"));
//		WebElement email=driver.findElement(By.id("input-email"));
//		WebElement phone=driver.findElement(By.id("input-telephone"));
//		WebElement pwd=driver.findElement(By.id("input-password"));
//		WebElement cnfrm=driver.findElement(By.id("input-confirm"));
//		
//		fname.sendKeys("SRG");
//		lname.sendKeys("An");
//		email.sendKeys("abc@ytu.com");
//		phone.sendKeys("8374637578");
//		pwd.sendKeys("pwd");
//		cnfrm.sendKeys("pwd");
		
		
		//3rd approach - using By locator
		//use class 'By' and create its reference 
		
		//By fname=By.id("input-firstname");
//		By lname=By.id("input-lastname");
//		By email=By.id("input-email");
//		By ph=By.id("input-telephone");
//		By pwd=By.id("input-password");
//		By confirm=By.id("input-confirm");
//		
//		
//	//find these elements using their By reference and store in WebElement
//		
//		WebElement fn=driver.findElement(fname);
//		WebElement ln=driver.findElement(lname);
//		WebElement em=driver.findElement(email);
//		WebElement phon=driver.findElement(ph);
//		WebElement pass=driver.findElement(pwd);
//		WebElement confrm=driver.findElement(confirm);
//		
//		fn.sendKeys("Sarang");
//		ln.sendKeys("Anand");
//		em.sendKeys("ert@oiu.com");
//		phon.sendKeys("908980980");
//		pass.sendKeys("assd");
//		confrm.sendKeys("assd");
		
		
		//4th approach - write generalized methods for finding element
		//and inputting values in the fields
		//call the methods and provide values 
		
		
//		By fname=By.id("input-firstname");
//		By lname=By.id("input-lastname");
//		By email=By.id("input-email");
//		By ph=By.id("input-telephone");
//		By pwd=By.id("input-password");
//		By confirm=By.id("input-confirm");
//		
//		
//		
//		getElement(fname).sendKeys("Sarang");
//		getElement(lname).sendKeys("SRG");
//		getElement(email).sendKeys("sfad@dfg.com");
//		getElement(ph).sendKeys("32532423");
//		getElement(pwd).sendKeys("pass");
//		getElement(confirm).sendKeys("pass");
		
		
		//5th approach- create general methods for find element and sendkeys
		
//		By fname=By.id("input-firstname");
//		By lname=By.id("input-lastname");
//		By email=By.id("input-email");
//		By ph=By.id("input-telephone");
//		By pwd=By.id("input-password");
//		By confirm=By.id("input-confirm");
//		
//		
//		
//		doSendKeys(fname, "Sarang");
//		doSendKeys(lname, "Anand");
//		doSendKeys(email, "asd@sf.com");
//		doSendKeys(ph, "453523324");
//		doSendKeys(pwd, "safe");
//		doSendKeys(confirm, "safe");
		
		//6th approach
		//create a class element utility
		//create generalized methods for find element and sendkeys
		//invoke constructor of the class and pass driver to it
		
		By fname=By.id("input-firstname");
		By lname=By.id("input-lastname");
		By email=By.id("input-email");
		By ph=By.id("input-telephone");
		By pwd=By.id("input-password");
		By confirm=By.id("input-confirm");
		
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email, "naveen@gmail.com");
		eleUtil.doSendKeys(pwd, "naveen@123");
		System.out.println("done");
		
		driver.quit();
		
		
		
		
		
		//ElementFindUtility em=new ElementFindUtility(driver);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}

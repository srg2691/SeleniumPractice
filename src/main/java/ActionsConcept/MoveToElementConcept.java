package ActionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

//		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//
//		WebElement menu = driver.findElement(By.cssSelector("a.menulink"));
//
//		Actions act = new Actions(driver);
//
//		act.moveToElement(menu).build().perform();
//
//		Thread.sleep(2000);
//
//		driver.findElement(By.linkText("COURSES")).click();
		
		//--------------Assignment-------------
		
		driver.get("https://www.spicejet.com/");
		
		WebElement Addons=driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(Addons).build().perform();
		
		Thread.sleep(3000);
		
		WebElement Stud=driver.findElement(By.xpath("//div[contains(text(),'Student Discount')]"));
		
		String text= Stud.getText();
		Stud.click();
		System.out.println(text);
		

	}
}

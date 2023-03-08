package ActionsConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Signaturedraw {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://signature-generator.com/");
		
		driver.findElement(By.xpath("//li[text()='Draw Signature']")).click();
		
		WebElement canvas=driver.findElement(By.id("signature-pad"));
		
		Actions act=new Actions(driver);
		
		act.click(canvas)
		.moveToElement(canvas,3,3)
		.moveByOffset(40, 50)
		.build()
		.perform();

	}

}

package ActionsConcept;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act = new Actions(driver);

		act.contextClick(ele).build().perform();

		List<WebElement> rightEles = driver.findElements(By.cssSelector("ul.context-menu-list span"));

		System.out.println(rightEles.size());

		for (WebElement e : rightEles) {
			//right click on element and get the text of all options and handle all the alerts 
			act.contextClick(ele).build().perform();

			String text = e.getText();
			System.out.println(text);
			e.click();

			
			Alert alert = driver.switchTo().alert();
			
			System.out.println(alert.getText());
			
			Thread.sleep(3000);
			
			alert.accept();
		
			// break;
		}
	}
}

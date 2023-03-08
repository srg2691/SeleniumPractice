package WindowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesMyPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(3000);

		WebElement NewTab = driver.findElement(By.xpath("//button[@id='newTabBtn']"));
		NewTab.click();

		Set<String> Handles = driver.getWindowHandles();
		Iterator<String> it = Handles.iterator();

		String Parent = it.next();
		System.out.println("Parent window id is " + Parent);

		String childWindowId = it.next();
		System.out.println("child window id : " + childWindowId);

		// switching to window:
		driver.switchTo().window(childWindowId);
		System.out.println("child window url : " + driver.getCurrentUrl());

		Thread.sleep(4000);

		// clicking JS alert
		driver.findElement(By.xpath("(//button[text()='Click me'])[1]")).click();

		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();

		// clicking Confirm box

		driver.findElement(By.xpath("(//button[text()='Click me'])[2]")).click();

		Alert alert1 = driver.switchTo().alert();
		String text1 = alert1.getText();
		System.out.println(text1);
		alert.dismiss();
		
	
		//clicking prompt 
		

		driver.findElement(By.xpath("(//button[text()='Click me'])[3]")).click();

		Alert alert2 = driver.switchTo().alert();
		
		
		
		alert2.sendKeys("Sarang Was here");
		Thread.sleep(3000);
		String text2=alert2.getText();
		System.out.println(text2);
		
		alert2.accept();
		
		System.out.println("done !");
		
		

		driver.close();// close the child window
		
		//svg practice-https://petdiseasealerts.org/forecast-map#/
	}

}

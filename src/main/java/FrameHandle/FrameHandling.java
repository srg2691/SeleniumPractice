package FrameHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		Thread.sleep(3000);
		
		int totalFrames = driver.findElements(By.xpath("//frame")).size();
		System.out.println(totalFrames);
		

		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='home.html']")));
		
		
		String header = driver.findElement(By.xpath("//p[contains(text(),'Suggest a more elegant')]")).getText();
		System.out.println(header);
		
		driver.switchTo().defaultContent();
		
		//frame
		//iframe -- security of the web element
		
		//nested frame
		
		//b-page-shadowdom-iframe-shadowodom-element
		
		
	}

}

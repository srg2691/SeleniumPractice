package SVGElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		
		WebElement Slider=driver.findElement(By.id("slider"));
		
		Slider.click();
		
		int width=Slider.getSize().getWidth();
		
		int height=Slider.getSize().getHeight();
		
		System.out.println(width);
		
		Actions act= new Actions(driver);
		
		//to move to right side
		
	act.moveToElement(Slider, (width/2)-30, 0).click().build().perform();
	
	Thread.sleep(3000);
	
	//to move to left side ,making the offset negative
	
	act.moveToElement(Slider, -((width/2)-50), 0).click().build().perform();
	
	Thread.sleep(3000);
	
	//using click and hold
	
	act.clickAndHold(Slider).moveByOffset(((width)/2-40), 0).click().build().perform();
		
		

	}

}

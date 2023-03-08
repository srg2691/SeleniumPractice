package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	WebDriver driver;
	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		//the 'To' method internally calls the Get method
		//the only different between to and get method is 
		//To method can take the URL class as parameter
		

	}

}

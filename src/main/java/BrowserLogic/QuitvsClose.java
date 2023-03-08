package BrowserLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsClose {

	
	//SID - session ID
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		String Title=driver.getTitle();
		System.out.println(Title);
		
		//driver.quit(); //makes session id as null
		driver.close(); //gives session id invalid
		
		String newTitle=driver.getTitle();
		System.out.println(newTitle);
		
		// in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
	}
}

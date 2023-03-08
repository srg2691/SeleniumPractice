package HeadlessTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {

		
		//browser not visible
		
		ChromeOptions co=new ChromeOptions();
		co.setHeadless(true);
		
		//co.addArguments("--headless");
		
		co.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com");
		String acttitle=driver.getTitle();
		System.out.println(acttitle);
		driver.quit();
	}

}

package SVGElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		
		Thread.sleep(10000);
		
		 
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		
		List<WebElement> statesList = driver.findElements(By.xpath(svgXpath));
		
		System.out.println(statesList.size());
		
		for(WebElement e : statesList) {
			
			String stateName = e.getAttribute("name");
			System.out.println(stateName);
			
				if(stateName.equals("Utah")) {
					int x=e.getSize().getWidth();
					int y=e.getSize().getHeight();
					e.click();
					System.out.println(x+" "+y);
					System.out.println("Utah found");
					break;
				}
		}
				
		Thread.sleep(5000);
		
		//to select the regions of the selected state above
				String regionxpath ="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='utah']//*[name()='g' and @class='subregion']//*[name()='path']";
				
				List<WebElement> counties=driver.findElements(By.xpath(regionxpath));
				//System.out.println(counties.size());
				
				for(WebElement f:counties)
				{
					String countyname=f.getAttribute("name");
					System.out.println(countyname);
				}
				
			
		
	}

}

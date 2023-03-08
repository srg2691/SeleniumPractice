package BrowserLogic;

public class test {

	public static void main(String[] args) {
		
		
		String browsername="chrome";
		BrowserUtility br=new BrowserUtility();
		br.initDriver(browsername);
		
		br.LaunchURL("https://www.amazon.in");
		
		String actTitle=br.getPageTitle();
		if(actTitle.contains("Amazon"))
		{
			System.out.println(" title--pass");
			
		}
		else
		{
			System.out.println(" title---fail");
		}
		
		br.closeBrowser();

	}

}

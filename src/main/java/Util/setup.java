package Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class setup {

	static WebDriver dr;
	public static WebDriver instantiateWebDriver(String type)
	{
		try {
			switch(type)
			{
			 case "chrome" :
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\midee\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
				 dr = new ChromeDriver();
				 break;
			 case "firefox" : 
				 System.setProperty("webdriver.gecko.driver","path to gecko");
				 //dr = new FirefoxDriver();
				 break;
			 case "edge" : 
				 System.setProperty("webdriver.edge.driver","path to edge");
				 dr = new EdgeDriver();
				 break;
			 default : 
				 System.setProperty("webdriver.chrome.driver","C:\\Users\\midee\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
				 dr = new ChromeDriver();
				 break;
			}
		  return dr;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Step [Failed] : Exception in setup->instantiateWebDriver "+e.getMessage());
			dr = null;
			return dr;
		}
		
	}
}

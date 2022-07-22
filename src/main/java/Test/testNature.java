package Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;

import Page.login;
import Page.nature;
import Page.unnature;
import Util.setup;

public class testNature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Nature Testcase");
		WebDriver driver = setup.instantiateWebDriver("chrome");
		try 
		{
			if(driver != null)
			{
				System.out.println("Step [Passed] : Driver is instantiated!!!");
				if(login.Applogin(driver))
				{
					System.out.println("Step [Passed] : Login feature is passed!!!");
					String path = nature.findNatureImageSource(driver);
					if(path != null)
					{
						System.out.println("Step [Passed] : Path of image "+path);
					}
					else
					{
						System.out.println("Step [Failed] : Failed to fetch src of nature image ");
					}
					
				}
				else
				{
					System.out.println("Step [Failed] : Un-Nature feature is failed!!!");
				}
			}
			else
			{
				System.out.println("Step [Failed] : Driver could not be instantiated!!!");
			}
		}
		catch(Exception e)
		{
			System.out.println("Step [Failed] : Exception Script Level!!!");
		}
		finally 
		{
			if(driver != null) driver.quit();
		}
		
	}

}

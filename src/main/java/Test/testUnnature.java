package Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;

import Page.login;
import Page.unnature;
import Util.setup;

public class testUnnature {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting Un-nature Testcase");
		WebDriver driver = setup.instantiateWebDriver("chrome");
		try 
		{
			if(driver != null)
			{
				System.out.println("Step [Passed] : Driver is instantiated!!!");
				if(login.Applogin(driver))
				{
					System.out.println("Step [Passed] : Login feature is passed!!!");
					List lRes = unnature.findIndexOfUnnatures(driver);
					if(lRes.size()>0)
					{
						System.out.println("Step [Passed] : Un-Nature feature is passed!!!");
						System.out.print("Step [Data] : Index values are "+lRes);
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

package Util;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class element {
    
	static WebElement ele;
	static List<WebElement> eleList;
	public static WebElement elementCheck(WebDriver driver,long waitSec,By by)
	{
		try {
			ele = new WebDriverWait(driver, Duration.ofSeconds(waitSec)).until(dr -> dr.findElement(by));
			return ele;
		}
        catch(Exception e)
		{
        	e.printStackTrace();
        	System.out.println("Step [Failed] : Exception occured in Util -> element -> elementCheck "+e.getMessage());
        	return null;
		}
				
	}
	public static List<WebElement> elementsCheck(WebDriver driver,long waitSec,By by)
	{
		try {
			eleList = new WebDriverWait(driver, Duration.ofSeconds(waitSec)).until(dr -> dr.findElements(by));
			return eleList;
		}
        catch(Exception e)
		{
        	e.printStackTrace();
        	System.out.println("Step [Failed] : Exception occured in Util -> element -> elementCheck "+e.getMessage());
        	return null;
		}
				
	}
	
	
}

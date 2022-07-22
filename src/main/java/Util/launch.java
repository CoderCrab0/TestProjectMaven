package Util;

import org.openqa.selenium.WebDriver;

public class launch {
  public static boolean Applaunch(WebDriver driver,String url)
  {
	  try {

		  driver.get(url);
		  driver.manage().window().maximize();
		  return true;
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
		  System.out.println("Step [Failed] : Exception occured in Util -> Launch -> Applaunch "+e.getMessage());
		  return false;
	  }
  }
}

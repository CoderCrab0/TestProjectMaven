package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Object.loginObj;
import Object.natureObj;
import Util.launch;

public class nature {

	
	public static String findNatureImageSource(WebDriver dr) {
		try {
			natureObj obj = new natureObj(dr);
			
			WebElement ele = obj.ele;//obj.elementNatureImage();
	        String path = ele.getAttribute("src");
	        return path;
		}
        catch(Exception e)
		{
        	e.printStackTrace();
        	System.out.println("Step [Failed] : Exception occured Page -> login -> Applogin "+e.getMessage());
        	return null;
		}
        
		
	}
	
}

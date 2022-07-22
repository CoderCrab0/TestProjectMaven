package Page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Object.loginObj;
import Object.unnatureObj;
import Util.launch;

public class unnature {
	
	public static List<Integer> findIndexOfUnnatures(WebDriver dr) {
        List<Integer> res = new ArrayList<Integer>();
		try {
           unnatureObj obj = new unnatureObj(dr);
           List<WebElement> listEl = obj.elementsOfAll();
           if(listEl.size() > 0)
           {
        	   for(int i=0;i<listEl.size();i++)
        	   {
        		   if(listEl.get(i).findElements(By.tagName("div")).get(1).getText().equals("Un-Nature"))
        		   {
        			   res.add(i);
        		   }
        	   }
           }
           else
           {
        	   System.out.println("Step [Failed] : No element found.");
           }
           return res;
		}
        catch(Exception e)
		{
        	e.printStackTrace();
        	System.out.println("Step [Failed] : Exception occured Page -> login -> Applogin "+e.getMessage());
        	return res;
		}
        
		
	}
}

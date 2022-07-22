package Page;

import org.openqa.selenium.WebDriver;

import Object.loginObj;
import Util.launch;

public class login {

	public static boolean Applogin(WebDriver dr) {
		try {
			loginObj obj = new loginObj(dr);
	        String url = obj.getAppUrl();
	        if(launch.Applaunch(dr, url))
	        {
	        	System.out.println("Step [Passed] : Opening target app was successful.");
	        	obj.useNameElement.sendKeys("TU");
	        	obj.pwdElement.sendKeys("TP");
	        	obj.loginButtonElement.click();
	        	
	            if(obj.verifyEleList.size() > 0)
	            {
	            	System.out.println("Step [Passed] : Login Successful.");
		            return true;
	            }
	            else 
	            {
	            	System.out.println("Step [Failed] : Failed to login.");
	            	return false;
	            }
	            
	            /*//using non Factory
	            obj.setUserName("TU");
	            obj.setPassword("TP");
	            obj.LoginClick();
	            if(obj.FindVerifyObject().size() > 0)
	            {
	            	System.out.println("Step [Passed] : Login Successful.");
		            return true;
	            }
	            else 
	            {
	            	System.out.println("Step [Failed] : Failed to login.");
	            	return false;
	            }
	            */
	        }
	        else
	        {
	        	System.out.println("Step [Failed] : Opening target app was failed.");
	        	return false;
	        }
		}
        catch(Exception e)
		{
        	e.printStackTrace();
        	System.out.println("Step [Failed] : Exception occured Page -> login -> Applogin "+e.getMessage());
        	return false;
		}
        
		
	}
}

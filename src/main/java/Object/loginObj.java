package Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Util.element;

public class loginObj {

	@FindBy(id = "uname")
	@CacheLookup
	public WebElement useNameElement;
	@FindBy(id = "pwd")  
	@CacheLookup
	public WebElement pwdElement;
	@FindBy(id = "login_b")  
	@CacheLookup
	public WebElement loginButtonElement;
	@FindBy(xpath = "//div[@class='imgCls']/child::div[text()=\"Un-Nature\"]")  
	@CacheLookup
	public List<WebElement> verifyEleList;
	
	

   private final String AppUrl = "https://codercrab.com/testautomation.html";
   private String userName = "";
   WebDriver driver;

   
public loginObj(WebDriver driver){
	  this.driver = driver;
	  PageFactory.initElements(this.driver,this);
}

public String getAppUrl() {
	return AppUrl;
}
public String getUserName() {
	userName = element.elementCheck(driver, waits.smallWait,By.id("uname")).getAttribute("value");
	return userName;
}
/*//Enable if not using factory
public void setUserName(String userNameValue)
{
	element.elementCheck(driver, waits.smallWait,By.id("uname")).sendKeys(userNameValue);
}
public void setPassword(String pwdValue)
{
	element.elementCheck(driver, waits.smallWait,By.id("pwd")).sendKeys(pwdValue);
}
public void LoginClick()
{
	element.elementCheck(driver, waits.smallWait , By.id("login_b")).click();
}
public List<WebElement> FindVerifyObject()
{
    List<WebElement> eleList = element.elementsCheck(driver, waits.lrgWait, By.xpath("//div[@class='imgCls']/child::div[text()=\"Un-Nature\"]"));
    return eleList;
}*/

}

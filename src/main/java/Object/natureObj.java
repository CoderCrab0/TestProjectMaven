package Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Util.element;




public class natureObj {
	
	@FindBy (how=How.XPATH,using = "//div[@class='imgCls']/child::div[text()='Nature']/preceding-sibling::div/img")
	public WebElement ele;
	
	WebDriver driver;
	public natureObj(WebDriver driver){
		  this.driver = driver;
		  PageFactory.initElements(this.driver,this);
	}
	/*//Enable if not using factory
	public WebElement elementNatureImage()
	{
		WebElement ele = element.elementCheck(driver, waits.lrgWait, By.xpath("//div[@class='imgCls']/child::div[text()='Nature']/preceding-sibling::div/img"));
	    return ele;
	}*/
}

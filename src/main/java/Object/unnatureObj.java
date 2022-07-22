package Object;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.element;

public class unnatureObj {
	WebDriver driver;
	public unnatureObj(WebDriver driver){
		  this.driver = driver;
	}
	public List<WebElement> elementsOfAll()
	{
		List<WebElement> eleList = element.elementsCheck(driver, waits.lrgWait, By.xpath("//div[@class='imgCls']"));
	    return eleList;
	}
	public List<WebElement> elementsOfUnnature()
	{
	    List<WebElement> eleList = element.elementsCheck(driver, waits.lrgWait, By.xpath("//div[@class='imgCls']/child::div[text()=\"Un-Nature\"]"));
	    return eleList;
	}
}

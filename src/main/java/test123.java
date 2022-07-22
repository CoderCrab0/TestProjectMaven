import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class test123 {


	


	public static void main(String[] args) 
	{
		try {
			test123 obj = new test123();
			System.setProperty("webdriver.chrome.driver","C:\\Users\\midee\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");  //http://127.0.0.1:5500/index.html
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			//obj.initFunction(driver);
			//obj.dosomeAction(driver);
			Select objS = new Select(driver.findElement(By.id("searchDropdownBox")));
			objS.selectByVisibleText("Amazon Fashion");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Baby Cloths");
			driver.findElement(By.id("nav-search-submit-button")).click();
			driver.findElement(By.xpath("//div[@data-index='5']/descendant::a[@class=\"a-link-normal s-no-outline\"]")).click();
			System.out.println(driver.getWindowHandles());
			driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
			driver.findElement(By.id("add-to-cart-button")).click();
		}
		catch(Exception e)
		{
			System.out.println("Exception : "+e.getMessage());
		}
	}
	
	public void initFunction(WebDriver dri)
	{
		//PageFactory.initElements(dri,this);
		PageFactory.initElements(new AjaxElementLocatorFactory(dri, 20), this);
	}
	
	public void dosomeAction(WebDriver dri)
	{
		//ele.sendKeys("Enter Data for Page Factory Test");
		//eleList.get(0).sendKeys("Page Factory in 1");
	}

}

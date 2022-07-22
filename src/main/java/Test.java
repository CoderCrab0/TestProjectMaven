import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\midee\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("https://codercrab.com/testautomation.html");
		try {
			driver.get("http://127.0.0.1:5500/index.html");
			driver.manage().window().maximize();
			
			WebElement ele = driver.findElement(By.id("clickToFind"));
			ele.click();
			System.out.println("Clicked at : "+new Date());
			//WebElement ele1 = driver.findElement(By.id("formInput2"));
			//Thread.sleep(4000);
			/*WebElement ele1 = new WebDriverWait(driver, Duration.ofSeconds(20))
			.until(dr -> dr.findElement(By.id("formInput9")));*/
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5));
			WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formInput9")));
			System.out.println("Waited till : "+new Date());
			//WebElement ele1 = new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(By.id("formInput9")));  

			/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
			WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formInput9")));*/
			//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			System.out.println("Value : "+ele1.getAttribute("value"));
			
		}
		catch(Exception e)
		{
			System.out.println("Waited till : "+new Date());
			System.out.println("Exception : "+e.getMessage());
			e.printStackTrace();
		}
		
		
		driver.quit();
	}
	
	
	
	

}

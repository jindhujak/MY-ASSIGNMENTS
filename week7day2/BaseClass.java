package week7day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public ChromeDriver driver;
	@Parameters({"url","uName","pWord"})
	@BeforeMethod
	public void preconditions(String url, String uName, String pWord)
	{

	     WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get(url);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	     driver.findElement(By.id("user_name")).sendKeys(uName);
	     driver.findElement(By.id("user_password")).sendKeys(pWord);
	     driver.findElement(By.id("sysverb_login")).click();
		
//	     <class name="week6day2.UpdateIncident" />
//			<class name="week6day2.DeleteIndicient" />
     
	}
		
		@AfterMethod
		public void postconditions()
		{
			//driver.close();
		}
		}
	
	



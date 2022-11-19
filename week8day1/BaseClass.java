package week8day1;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	
	public int sheetindex;
	public String filename;
    public ChromeDriver driver;
	
	@Parameters({"url","uName","passWord"})
	@BeforeMethod
	public void preconditions(String url,String uName,String passWord)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println(Thread.currentThread().getId());
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		}
	//	 <class name="week8day1.CreateLead"/>
	//   <class name="week8day1.DeleteLead"/>
	//   <class name="week8day1.EditLead"/>
	
	@DataProvider(name="fetchData") 
	public String[][] sendData() throws IOException{
	return LearnReadxcelDP.readData(filename, sheetindex);
	}
	@AfterMethod
	public void postconditions()
	{
		driver.close();
	}
	}


package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autolead {
	
	
	
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesManager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
   driver.findElement(By.linkText("Leads")).click();     
   driver.findElement(By.linkText("Create Lead")).click();
   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("JK Organization");
   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jindhuja");
   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Karthick");
   driver.findElement(By.className("smallSubmit")).click();
   String leadtit =driver.getTitle();
   System.out.println(leadtit);
	}

}

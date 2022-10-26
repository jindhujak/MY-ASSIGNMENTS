package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String[] args) throws InterruptedException {
//		3.    
//		Salesforce Customer service:
//		1.Launch the browser
//		2.Load the url as " https://login.salesforce.com/ "
//		3.Enter the username as " ramkumar.ramaiah@testleaf.com "
//		4. Enter the password as " Password#123 "
//		5.click on the login button
//		6.click on the learn more option in the Mobile publisher
//		7.Switch to the next window using Windowhandles.
//		8.click on the confirm button in the redirecting page
//		9.Get the title
//		10.Get back to the parent window
//		11.close the browser
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String>arrWH=new ArrayList<String>(windowHandles);
		driver.switchTo().window(arrWH.get(1));
		driver.findElement(By.xpath("//button[@onclick='goAhead()']")).click();
		System.out.println("Title of the current page: "+driver.getTitle());
		driver.switchTo().window(arrWH.get(0));
		Thread.sleep(1000);
		driver.quit();
		
	}

}

package  week6day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeLead extends ProjectSpecificMethods{
        @Test
    public void runMergeLead() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
//		driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();
//		driver.findElement(By.linkText("CRM/SFA")).click();
//		driver.findElement(By.linkText("Leads")).click();
        	driver.findElement(By.linkText("Contacts")).click();
    		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
    		String parentWindow=driver.getWindowHandle();
    		System.out.println(parentWindow);
    		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
    		Thread.sleep(500);
    	    Set<String>windowHandles=driver.getWindowHandles();
    	    System.out.println(windowHandles.size());
    	    List<String>arrayWH=new ArrayList<String>(windowHandles);
    		driver.switchTo().window(arrayWH.get(1));
    		String childWindow=driver.getWindowHandle();
    		System.out.println(childWindow);
    		Thread.sleep(500);
    		driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[1]//a)[1]")).click();
    		driver.switchTo().window(arrayWH.get(0));
    		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
    		Thread.sleep(500);
    		Set<String> windowHandles1=driver.getWindowHandles();
    	    System.out.println(windowHandles1.size());
    	    List<String>arrayWH1=new ArrayList<String>(windowHandles1);
    		driver.switchTo().window(arrayWH1.get(1));
    		driver.findElement(By.xpath("((//table[@class='x-grid3-row-table'])[2]//a)[1]")).click();
    		driver.switchTo().window(arrayWH1.get(0));
    		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
    		Alert alert=driver.switchTo().alert();
    		alert.accept();
    		Thread.sleep(500);
    		String title=driver.getTitle();
    		System.out.println("Title of the page : " +title);
    	// Thread.sleep(2000);
    	 //driver.close();
    	}
    	
}







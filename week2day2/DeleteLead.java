package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();  
		driver.findElement(By.xpath("//a[(text()='Find Leads')]")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9087654321");
		driver.findElement(By.xpath("//button[(text()='Find Leads')]")).click();
		String id = driver.findElement(By.xpath("((((//div[@class='x-panel-bwrap ']//div[@class='x-panel-mc']//tr)[2])//a)[1])")).getText();
		System.out.println(id);
		driver.findElement(By.xpath("((((//div[@class='x-panel-bwrap ']//div[@class='x-panel-mc']//tr)[2])//a)[1])")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[(text()='Find Leads')]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		driver.findElement(By.xpath("//button[(text()='Find Leads')]")).click();
		String display=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println("Lead ID searched for : " +display);
		Thread.sleep(3000);
		driver.close();

		

		//((((//div[@class='x-panel-bwrap ']//div[@class='x-panel-mc']//tr)[2])//a)[1])


	}

}

package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
		String cpyName="KJ ORGANIZATION";
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();  
		//click find lead-enter first name-find-select first lead 
		driver.findElement(By.xpath("//a[(text()='Find Leads')]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("jindhuja");
		driver.findElement(By.xpath("//button[(text()='Find Leads')]")).click();
		driver.findElement(By.xpath("((((//div[@class='x-panel-bwrap ']//div[@class='x-panel-mc']//tr)[2])//a)[1])")).click();
		//verify title
		System.out.println("The Title is = " +driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement lead=driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		lead.clear();
		lead.sendKeys(cpyName);
		System.out.println(lead.getAttribute("value"));
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String upCompany=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(upCompany);
//verifying update company name is correct or not
		if(upCompany.contains(cpyName))
			System.out.println("Company Name updated correctly");

		else
			System.out.println("Company Name not updated");

		Thread.sleep(3000);
		driver.close();

	}

}
//a[text()='Edit']
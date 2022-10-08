package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Gayathri");
		driver.findElement(By.id("lastNameField")).sendKeys("devi"); 
		driver.findElement(By.className("smallSubmit")).click();
		
	String firstName= driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println("The first name is : "+firstName);
		System.out.println("The browser title is : " + driver.getTitle());
	   
		//System.out.println(driver.findElement(By.id("firstNameField")).getText());
	}

}

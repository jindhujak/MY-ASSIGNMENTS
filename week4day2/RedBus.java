package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
//		    Step:1-Launch the url (https://www.redbus.in/)
//			Step:2-Enter From -Madiwala Bangalore
//			Step:3-Enter To Koyambedu Chennai
//			Step:4-Select the Date 30-September-2022
//			Step:5-Print the Title of the page
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("src")).sendKeys("Madiwala Bangalore");
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("dest")).sendKeys("Koyambedu Chennai");
		driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//label[text()='Date']")).click();
		driver.findElement(By.xpath("//td[@class='current day']/following-sibling::td[4]")).click();
		
		System.out.println("Title of the current page: "+driver.getTitle());
		
		
		
	}

}

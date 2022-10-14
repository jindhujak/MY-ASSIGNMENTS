package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/select.xhtml");
		//favourite tool selection
		WebElement ui= driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		ui.click();
		Select tool= new Select(ui);
		tool.selectByVisibleText("Playwright");
		//select country
		driver.findElement(By.id("j_idt87:country_label")).click();
		driver.findElement(By.id("j_idt87:country_3")).click();
		Thread.sleep(500);
		//select city
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.id("j_idt87:city_2")).click();
		//select course
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[text()='Playwright']")).click();
		//select language
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		//Select 'Two' irrespective of the language chosen
		Thread.sleep(500);
		driver.findElement(By.id("j_idt87:value_label")).click();
		Thread.sleep(500);
		driver.findElement(By.id("j_idt87:value_1")).click();
		Thread.sleep(2000);
		driver.close();

	}

}

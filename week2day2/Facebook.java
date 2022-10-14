package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("jindhu");
		driver.findElement(By.name("lastname")).sendKeys("K");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8463749863");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("password");
		
		WebElement day= driver.findElement(By.id("day"));
		Select bDay=new Select(day);
		bDay.selectByIndex(9);
		
		WebElement month= driver.findElement(By.id("month"));
		Select bMonth= new Select(month);
		bMonth.selectByVisibleText("Sep");
		
		WebElement year= driver.findElement(By.id("year"));
		Select bYear=new Select(year);
		bYear.selectByVisibleText("2006");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(3000);
		driver.close();
	
	}
	
	

}

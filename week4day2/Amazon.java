package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
public static void main(String[] args) throws InterruptedException, IOException {
	    
//	    1.Load the uRL https://www.amazon.in/
//		2.search as oneplus 9 pro 
//		3.Get the price of the first product
//		4. Print the number of customer ratings for the first displayed product
//		5. Mouse Hover on the stars
//		6. Get the percentage of ratings for the 5 star.
//		7. Click the first text link of the first image
//		8. Take a screen shot of the product displayed
//		9. Click 'Add to Cart' button
//		10. Get the cart subtotal and verify if it is correct.
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions act=new Actions(driver);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	String price=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
	System.out.println("price of the first product is : "+price);
	Thread.sleep(2000);
	String people=driver.findElement(By.xpath("(//span[contains(@class,'a-size-base puis-light-weight')])[1]")).getText();
     //Thread.sleep(2000);
     System.out.println("No of People rated: "+people);
   	Thread.sleep(3000);
  driver.findElement(By.xpath("(//i[@class='a-icon a-icon-popover'])[1]")).click();
	//act.moveToElement(star).perform();
	Thread.sleep(3000);
	String perct =driver.findElement(By.xpath("//table[@id='histogramTable']//td[3]")).getText();
	System.out.println("5 Star review percentage : "+perct);
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	Set<String>window=driver.getWindowHandles();
	List<String> windowHand=new ArrayList(window);
	System.out.println(windowHand.size());
	driver.switchTo().window(windowHand.get(1));
	File src= driver.getScreenshotAs(OutputType.FILE);
	File dest= new File("./snap/phone.jpg");
	FileUtils.copyFile(src, dest);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	Thread.sleep(3000);
	String subTotal=driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
	System.out.println("Cart Sub-Total is: "+subTotal);
	if(price.equals(subTotal))
	System.out.println("Both the amount are same");
	else
		System.out.println("Amounts are different");
	
}
}

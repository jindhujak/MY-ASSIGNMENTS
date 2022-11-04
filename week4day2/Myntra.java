package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.ArrayList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		    1) Open https://www.myntra.com/
//			2) Mouse hover on MeN 
//			3) Click Jackets 
//			4) Find the total count of item 
//			5) Validate the sum of categories count matches
//			6) Check jackets
//			7) Click + More option under BRAND
//			8) Type Duke and click checkbox
//			9) Close the pop-up x
//			10) Confirm all the Coats are of brand Duke
//			    Hint : use List 
//			11) Sort by Better Discount
//			12) Find the price of first displayed item
//			Click on the first product
//			13) Take a screen shot
//			14) Click on WishList Now
//			15) Close Browser
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		WebElement moveTo=driver.findElement(By.xpath("//a[@data-group='men']"));
		act.moveToElement(moveTo).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Jackets'])[1]")).click();
		String count=driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("No of items available: "+count);
		String jacket=driver.findElement(By.xpath("(//span[@class='categories-num'])[1]")).getText();
		System.out.println("no of jackets: "+jacket);
		String rainJacket=driver.findElement(By.xpath("(//span[@class='categories-num'])[2]")).getText();
		System.out.println("no of rain jackets: "+rainJacket);
		
		String replaced=count.replaceAll("[^0-9]", "");
		int num=Integer.parseInt(replaced);
		System.out.println(num);
		
		String replaced1=jacket.replaceAll("[^0-9]", "");
		int num1=Integer.parseInt(replaced1);
		System.out.println(num1);
		
		String replaced2=rainJacket.replaceAll("[^0-9]", "");
		int num2=Integer.parseInt(replaced2);
		System.out.println(num2);
		
		if(num==num1+num2)
		{
			System.out.println("Sum of categories matches total count");
		}else
			System.out.println("Sum of categories does not matches total count");

		
		driver.findElement(By.xpath("//div[@class='brand-more']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search brand']")).sendKeys("Duke");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class=' common-customCheckbox'])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[contains(@class,'close sprites-remove')]")).click();
		List<WebElement> name=driver.findElements(By.xpath("//div[@class='product-productMetaInfo']/h3"));
		boolean result;
		for(int i=1;i<=name.size();i++)
			{
			String jacketName=driver.findElement(By.xpath("(//div[@class='product-productMetaInfo']/h3)["+i+"]")).getText();
			if(jacketName.equalsIgnoreCase("duke"))
			{
				continue;
			}else
				System.out.println("All jackets are not duke");
				break;
	      }
		System.out.println("All jackets are Duke");
		act.moveToElement(driver.findElement(By.xpath("//div[@class='sort-sortBy']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class='sort-label '])[4]")).click();
		String price=driver.findElement(By.xpath("(//span[@class='product-discountedPrice'])[1]")).getText();
		System.out.println("Price of first displayed jacket: "+price);
		driver.findElement(By.xpath("(//img[@class='img-responsive'])[1]")).click();
		Set<String>window=driver.getWindowHandles();
		List<String> windowHand=new ArrayList(window);
		//System.out.println(windowHand.size());
		driver.switchTo().window(windowHand.get(1));
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/jacket.jpg");
		FileUtils.copyFile(src, dest);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(@class,'sprites-headerWishlist')]")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	}


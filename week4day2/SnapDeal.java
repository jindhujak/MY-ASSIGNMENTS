package week4day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		    1. Launch https://www.snapdeal.com/
//			2. Go to Mens Fashion
//			3. Go to Sports Shoes
//			4. Get the count of the sports shoes
//			5. Click Training shoes
//			6. Sort by Low to High
//			7. Check if the items displayed are sorted correctly
//			8.Select the price range (900-1200)
//			9.Filter with color Navy 
//			10 verify the all applied filters 
//			11. Mouse Hover on first resulting Training shoes
//			12. click QuickView button
//			13. Print the cost and the discount percentage
//			14. Take the snapshot of the shoes.
//			15. Close the current window
//			16. Close the main window
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement men=driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
		String count=driver.findElement(By.xpath("//span[contains(@class,'category-count')]")).getText();
		System.out.println("No of shoes available : "+count);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
		driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
		String sort=driver.findElement(By.xpath("//div[@class='sort-selected']")).getText();
		System.out.println(sort);
		if(sort.equalsIgnoreCase("Price Low To High"))
			System.out.println("correctly sorted Low to High");
		else
			System.out.println("Not sorted correctly");
		
		driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("500");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='toVal']")).clear();
    	driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("1000");
    	driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow')]")).click();
    	Thread.sleep(1000);
    	WebElement moveTo=driver.findElement(By.xpath("(//div[@class='filter-type-name lfloat'])[4]"));
    	act.scrollToElement(moveTo).perform();
        driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
        Thread.sleep(2000);
        WebElement img=driver.findElement(By.xpath("//img[contains(@title,'Navy Training Shoes')]"));
    	act.moveToElement(img).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();
		Thread.sleep(2000);
        String price=driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
        System.out.println("Price of the shoes:"+price);
        String discount=driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
        System.out.println("Discount percentage is :"+discount);
        File src=driver.getScreenshotAs(OutputType.FILE);
        File dest= new File("./snap/shoes.jpg");
        FileUtils.copyFile(src, dest);
        driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
        Thread.sleep(2000);
        driver.close();
		
	}

}

package week4day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		
//		    1) Go to https://www.nykaa.com/
//			2) Mouseover on Brands and Search L'Oreal Paris
//			3) Click L'Oreal Paris
//			4) Check the title contains L'Oreal Paris(Hint-GetTitle)
//			5) Click sort By and select customer top rated
//			6) Click Category and click Hair->Click haircare->Shampoo
//			7) Click->Concern->Color Protection
//			8)check whether the Filter is applied with Shampoo
//			9) Click on L'Oreal Paris Colour Protect Shampoo
//			10) GO to the new window and select size as 175ml
//			11) Print the MRP of the product
//			12) Click on ADD to BAG
//			13) Go to Shopping Bag 
//			14) Print the Grand Total amount
//			15) Click Proceed
//			16) Click on Continue as Guest
//			17) Check if this grand total is the same in step 14
//			18) Close all windows  
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		WebElement brand=driver.findElement(By.xpath("//a[text()='brands']"));
		act.moveToElement(brand).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class='css-ov2o3v']/a)[2]")).click();
		String title=driver.getTitle();
		System.out.println("Title of the window: "+title);
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		List <WebElement> filter =driver.findElements(By.xpath("//span[@class='filter-value']"));
		int filsize=filter.size();
		System.out.println(filsize);
		List <String> filOptions=new ArrayList<String>();
		for(int i=1;i<=filsize;i++)
		{
			String options=driver.findElement(By.xpath("(//span[@class='filter-value'])["+i+"]")).getText();
			System.out.println("filter applied for : " +options);
			filOptions.add(options);
			}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
		Set<String>window=driver.getWindowHandles();
		System.out.println(window.size());
		//to get another window using index convert set into list
		List<String> windList=new ArrayList<String>(window);
		driver.switchTo().window(windList.get(1));
		
		Select opt=new Select(driver.findElement(By.xpath("//select[@title='SIZE']")));
		opt.selectByVisibleText("175ml");
		String mrp=driver.findElement(By.xpath("(//span[@class='css-1jczs19'])[1]")).getText();
		System.out.println("MRP: " +mrp);
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		driver.switchTo().frame(0);
		String total= driver.findElement(By.xpath("//span[contains(@class,'css-n8gwxi')]")).getText();
		System.out.println("Your Grand Total is: " +total);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='css-guysem e8tshxd0'])[2]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.findElement(By.xpath("(//img[@class='css-16z7tzi ek8d9s80'])[2]")).click();
		String finalPay=driver.findElement(By.xpath("(//p[@class='css-5t7v9l eka6zu20'])")).getText();
		System.out.println("Final amount to be paid : " +finalPay);
		if(total.equals(finalPay))
		
			System.out.println("Grand total is same as amount to be paid");
		else
			System.out.println("Amount are not equal");
		Thread.sleep(2000);
		driver.quit();
		}
		//driver.switchTo().window(windList.get(0));
		
		
	}



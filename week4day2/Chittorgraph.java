package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgraph {
public static void main(String[] args) {
	
//	    1. Launch the URL https://www.chittorgarh.com/
//		2. Click on stock market
//		3. Click on NSE bulk Deals
//		4. Get all the Security names
//		5. Ensure whether there are duplicate Security names
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.chittorgarh.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("navbtn_stockmarket")).click();
	driver.findElement(By.linkText("NSE Bulk Deals")).click();
	List<WebElement> numRows=driver.findElements(By.xpath("//div[@class='table-responsive']//tbody/tr/td[3]"));
	int rsize=numRows.size();
	System.out.println("No of Rows: "+rsize);
	List<String> lnames=new ArrayList<String>();
	for(int i=1;i<rsize;i++)
	{
		String names=driver.findElement(By.xpath("//div[@class='table-responsive']//tbody/tr["+i+"]/td[3]")).getText();
		System.out.println(names);
		lnames.add(names);
	}
	//System.out.println(lnames);
	Set<String>sNames=new LinkedHashSet<String>(lnames);
	System.out.println("Security Names after removing duplicates: " +sNames);
	System.out.println("No of names after removing duplicates: "+sNames.size());
		
}
}

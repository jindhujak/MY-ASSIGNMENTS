package week4day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagTable {
	public static void main(String[] args) {
		
//		1. Launch the URL https://html.com/tags/table/
//	    2. Get the count of number of rows
//		3. Get the count of number of columns
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List <WebElement>colsize=driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr/th"));
		int csize=colsize.size();
		System.out.println(csize);
		List<WebElement> rowSize=driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));
		int rsize=rowSize.size();
		System.out.println(rsize);
		//another table
		
		List <WebElement>colsize1=driver.findElements(By.xpath("//div[@class='render']//thead/tr/th"));
		int csize1=colsize1.size();
		System.out.println(csize1);
		List<WebElement> rowSize1=driver.findElements(By.xpath("//div[@class='render']//tbody/tr"));
		int rsize1=rowSize1.size();
		System.out.println(rsize1);
		
	}

}

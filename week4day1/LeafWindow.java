package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafWindow {
	public static void main(String[] args) {
//		https://www.leafground.com/window.xhtml
//			Click Open Multiple 
//			Get the size of available Windows
//			switch to last window 
//			Get the Title of the Window
//			Close all the windows except last window
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> arrayWH=new ArrayList<String>(windowHandles);
		System.out.println("No of windows opened: " +arrayWH.size());
		driver.switchTo().window(arrayWH.get(2));
		System.out.println("Title of the current window: "+driver.getTitle());
		driver.switchTo().window(arrayWH.get(0));
		driver.close();
		driver.switchTo().window(arrayWH.get(1));
		driver.close();
		driver.switchTo().window(arrayWH.get(2));
		driver.manage().window().maximize();
		
		
	}

}

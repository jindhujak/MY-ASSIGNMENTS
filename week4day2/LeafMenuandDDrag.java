package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafMenuandDDrag {
	public static void main(String[] args) throws InterruptedException {
		//		1. Launch the url: https://www.leafground.com/menu.xhtml
		//		     Menu Bar
		//		         -Do click on shipment and mousehover on Tracker and Do rightClick on Tracker
		//		     Slide Menu
		//		         -Do click Orders and click Back 
		//		2.Launch the url : https://www.leafground.com/drag.xhtml
		//		Draggable Columns
		//		        -Move the Column Name to Column Quanity 
		//		       -Get the Toaster message to confirm it
		//		Draggable Rows
		//		        -Move the row 3 to row 4
		//		        -Get the Toaster message to confirm it
		//		Resize Image 
		//		         -Resize the message and Verify it 
		//		Range Slider
		//	 -Give a range between 10 and 80 (use movebyOffset() for x values ,y should be 0  and use negative value for right move)
//

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.leafground.com/menu.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ship=driver.findElement(By.xpath("//span[text()='Shipments']"));
		Actions act= new Actions(driver);
		act.click(ship).perform();
		WebElement track=driver.findElement(By.xpath("(//span[text()='Tracker'])[1]"));
		act.moveToElement(track).perform();
		act.contextClick(track).perform();
		driver.findElement(By.xpath("(//span[text()='Orders'])[2]")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-slidemenu-backward ui-widget')]")).click();
		Thread.sleep(500);
	//Both NAVIGATE and GETURL works the same way
		driver.navigate().to("https://www.leafground.com/drag.xhtml");
		//driver.get("https://www.leafground.com/drag.xhtml");
		
		//interchanging columns
		WebElement drag=driver.findElement(By.id("form:j_idt94:j_idt95"));
		System.out.println(drag.getLocation());
		WebElement drop=driver.findElement(By.id("form:j_idt94:j_idt97"));
		System.out.println(drop.getLocation());
		act.clickAndHold(drag).dragAndDrop(drag, drop).perform();
		String message=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
		System.out.println("Toaster Message : "+message);
		WebElement close=driver.findElement(By.xpath("//div[@class='ui-growl-icon-close ui-icon ui-icon-closethick']"));
	Thread.sleep(3000);
		//interchanging rows
//		WebElement drag1=driver.findElement(By.xpath("//tbody[@id='form:j_idt94_data']//tr[4]"));
//		WebElement drop1=driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']//tr[5]"));
//		act.clickAndHold(drag1).perform();
//	     Thread.sleep(5000);
//	     act.dragAndDrop(drag1, drop1).perform();
//	     Thread.sleep(3000);
		//act.clickAndHold(drag1).dragAndDrop(drag1, drop1).perform();
//		String message1=driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
//		System.out.println("Toaster Message : "+message1);
//		WebElement horPoint=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
//		System.out.println(horPoint.getLocation());
//		act.dragAndDropBy(horPoint, 50, 10).perform();		
//		//act.clickAndHold(horPoint).moveByOffset(200, 974).release().build().perform();
		

	WebElement onst = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[2]"));
    WebElement twod = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[5]"));
    act.clickAndHold(twod).perform();
    Thread.sleep(5000);
    act.clickAndHold(onst).release().perform();
    Thread.sleep(3000);
    WebElement resizedrag = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable')]"));
    act.dragAndDropBy(resizedrag, 50, 10).perform();

		
	}

}

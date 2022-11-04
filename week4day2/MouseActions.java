package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		

//		 https://jqueryui.com/draggable
//		 https://jqueryui.com/droppable
//		 https://jqueryui.com/resizable
//		 https://jqueryui.com/selectable

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://jqueryui.com/draggable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act=new Actions(driver);
		
		driver.switchTo().frame(0);
		WebElement dragAround=driver.findElement(By.xpath("//div[contains(@class,'ui-draggable-handle')]"));
		act.dragAndDropBy(dragAround, 80, 100).perform();
		Thread.sleep(2000);
		
		driver.navigate().to("https://jqueryui.com/droppable");
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		
		driver.navigate().to("https://jqueryui.com/selectable");
		driver.switchTo().frame(0);
		WebElement item1=driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2=driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3=driver.findElement(By.xpath("//li[text()='Item 3']"));
		act.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		WebElement item6=driver.findElement(By.xpath("//li[text()='Item 6']"));
		act.clickAndHold(item1).dragAndDrop(item1, item6).perform();
		Thread.sleep(2000);
		
		driver.navigate().to("https://jqueryui.com/resizable");
		driver.switchTo().frame(0);
		WebElement vertical=driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-e')]"));
		WebElement horizontal=driver.findElement(By.xpath("//div[contains(@class,'ui-resizable-s')]"));
		WebElement corner=driver.findElement(By.xpath("//div[contains(@class,'ui-icon-gripsmall-diagonal-se')]"));
		act.dragAndDropBy(vertical, 30, 50).perform();
		Thread.sleep(2000);
		act.dragAndDropBy(horizontal, 50,80).perform();
		Thread.sleep(2000);
		act.dragAndDropBy(corner, 20,30).perform();
		Thread.sleep(2000);
	}
}

package week8day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		WebElement ele =driver.findElement(By.xpath("//button[@id='j_idt87:j_idt90']/span"));
		wait.until(ExpectedConditions.visibilityOf(ele));
		//String visible=ele.getText();
		System.out.println(ele.getText());
	    driver.findElement(By.xpath("//button[@id='j_idt87:j_idt92']/span")).click();
	    WebElement ele1=driver.findElement(By.xpath("//span[text()='I am about to hide']"));
	    if(wait.until(ExpectedConditions.invisibilityOf(ele1)))
	    System.out.println("element disappeared");
	    else
	    	System.out.println("Element not disappeared");
	    
	    driver.findElement(By.xpath("//button[@id='j_idt87:j_idt95']/span")).click();
	    //WHILE TAKING XPATH BETTER BE MORE SPECIFIC
	    WebElement second = driver.findElement(By.xpath("//button[@id='j_idt87:j_idt96']/span"));
//	    WebElement clickable = driver.findElement(By.xpath("//span[text()='Click Second']")); its also working
	    wait.until(ExpectedConditions.elementToBeClickable(second));
	    System.out.println(second.getText());


	    driver.findElement(By.xpath("//button[@id='j_idt87:j_idt98']/span")).click();
		WebElement change=driver.findElement(By.xpath("//button[@id='j_idt87:j_idt99']/span"));
		String text=change.getText();
		System.out.println(text);
		WebElement changed= driver.findElement(By.xpath("//span[text()='Did you notice?']"));
		//wait.until(ExpectedConditions.visibilityOf(changed));
		//wait.until(ExpectedConditions.textToBePresentInElement(change, "Did you notice?"));
		String text1=changed.getText();
		System.out.println(text1);
	
}
}

package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputComponents {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		//Enter your name
		driver.findElement(By.xpath("//div[@class='grid formgrid']//input")).sendKeys("Jindhuja"); //grandparent -grandchild
		//appened data
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(" - India");
		boolean country=driver.findElement(By.id("j_idt88:j_idt91")).isEnabled();
		System.out.println(country);
		//To find tab is disabled or enabled
		boolean disfield=driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
		//System.out.println(disfield);
		if(disfield==true)
			System.out.println("Field is Enabled");
		else
			System.out.println("Field is Disabled");
		//To clear the field
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		//To get the data entered
		String retrive=driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
		System.out.println("Retrived text is = " +retrive);
		//To enter mail id and check TAB function
		WebElement mail=driver.findElement(By.id("j_idt88:j_idt99"));
		mail.sendKeys("123@gmail.com");
		mail.sendKeys(Keys.TAB);
		//To enter data
		driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I am here to learn AUTOMATION TESTING");
		//Text Editor
		driver.findElement(By.xpath("//button[@class='ql-list']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'bold')][1]")).click();//partial attribute value
		driver.findElement(By.xpath("(//div[@contenteditable='true'])[1]")).sendKeys("India, officially the Republic of India, is a country in South Asia.");
		driver.findElement(By.xpath("(//div[@contenteditable='true'])[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//button[contains(@class,'italic')])[1]")).click();
		driver.findElement(By.xpath("(//div[@contenteditable='true'])[1]")).sendKeys("Hi I am from Italy.");// index based 
		//Send DOB so that calendar appears selecting particular date
		driver.findElement(By.xpath("//input[@id='j_idt106:j_idt116_input']")).sendKeys("09/01/1990");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@tabindex='0'])[4]")).click();
		//Enter number and confirm spin working
		WebElement number=driver.findElement(By.id("j_idt106:j_idt118_input"));
		number.sendKeys("34");
		Thread.sleep(1000);
		driver.findElement(By.xpath("((//span[@class='ui-button-text'])[3])")).click();
		String num= number.getAttribute("value");
		Thread.sleep(1000);
		System.out.println("After pressing up arrow in spin tab = " +num);
		driver.findElement(By.xpath("((//span[@class='ui-button-text'])[4])")).click();
		String num1= number.getAttribute("value");
		Thread.sleep(1000);
		System.out.println("After pressing down arrow in spin tab = " +num1);
		Thread.sleep(1000);
		//silder
		driver.findElement(By.id("j_idt106:slider")).sendKeys("34");
		Thread.sleep(1000);
		//Click and confirm keyboard appears
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		//custom tool bar:
		driver.findElement(By.xpath("((//button[@class='ql-underline'])[2])")).click();
		driver.findElement(By.xpath("(//span[@aria-controls='ql-picker-options-6'])")).click();
		driver.findElement(By.xpath("(//span[@data-value='huge'])[2]")).click();
		WebElement custom=driver.findElement(By.xpath("(//div[@contenteditable='true'])[3]"));
		custom.sendKeys("INDIA");
		custom.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//span[@aria-controls='ql-picker-options-5'])")).click();
		driver.findElement(By.xpath("(//span[@data-value='serif'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@class='ql-underline ql-active'])")).click();
		custom.sendKeys("It is the seventh-largest country by area, the second-most populous country, and the most populous democracy in the world");
		//Just Press Enter and confirm error message
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		String error=driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText();
		System.out.println("ERROR MESSAGE : " +error);
		//click and confirm label changes position
		driver.findElement(By.xpath("//label[text()='Username']")).sendKeys(Keys.ENTER); 

		Thread.sleep(3000);	
		driver.close();
		//NOTE: when we click error message mandatory field every other field inputs get dissapeared sir, so i added it as last option. so check that by scrolling up
	}
}

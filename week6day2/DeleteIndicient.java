package week6day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteIndicient extends BaseClass {
	@Test
	public void deleteInci() throws InterruptedException {
		
//		3.Delete the incident
//		==================
//		1. Launch ServiceNow application
//		2. Login with valid credentials 
//		3. Click All and enter Incident in filter navigator and press enter"
//		4. Search for the existing incident and navigate into the incident
//		5. Delete the incident
//		6. Verify the deleted incident
		
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
		Thread.sleep(1000);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("incident");
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement frame=shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		Thread.sleep(500);
		WebElement incident=driver.findElement(By.xpath("//tbody[@class='list2_body']//td[3]/a"));
		String inciNo=incident.getText();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(inciNo,Keys.ENTER);
		//driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//tbody[@class='list2_body']//td[3]/a")).click();
		driver.findElement(By.xpath("//button[@id='sysverb_delete']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='ok_button']")).click();
		//WebElement clk=driver.findElement(By.xpath("(//div[@class='modal-footer'])[2]//button[2]"));
		//driver.executeScript("arguments[0].click();", clk);
		String result=driver.findElement(By.xpath("//div[@class='list2_empty-state-list']")).getText();
		System.out.println(result);
		}

}

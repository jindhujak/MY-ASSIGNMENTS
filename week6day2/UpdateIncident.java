package week6day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class UpdateIncident extends BaseClass {

//	2.Update existing incident
//	====================
//	1. Launch ServiceNow application
//	2. Login with valid credentials 
//	3. Click All and enter Incident in filter navigator and press enter
//	4. Search for the existing incident and click on the incident
//	5. Update the incidents with Urgency as High and State as In Progress
//	6. Verify the priority and state 
	
	@Test
	public void updateIncident() throws InterruptedException{
		
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
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(inciNo, Keys.ENTER);
	    driver.findElement(By.xpath("//tbody[@class='list2_body']//td[3]/a")).click();
	    Select urgency=new Select(driver.findElement(By.xpath("//select[@id='incident.urgency']")));
	    urgency.selectByIndex(0);
		Select state=new Select(driver.findElement(By.xpath("//select[@id='incident.state']")));
		state.selectByValue("2");
		driver.findElement(By.xpath("//button[@id='sysverb_update_bottom']")).click();
		  driver.findElement(By.xpath("//tbody[@class='list2_body']//td[3]/a")).click();
		List<WebElement> noofText= driver.findElements(By.xpath("//span[@class='sn-widget-list-table-cell']"));
		//System.out.println(noofText.size());
		for(int i=1;i<=4;i++) {
			String status=driver.findElement(By.xpath("(//span[@class='sn-widget-list-table-cell'])[" +i+"]")).getText();
			System.out.println(" " +status+" ");
		}
	}
	
	
}

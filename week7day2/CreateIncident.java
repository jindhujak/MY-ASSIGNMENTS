package week7day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateIncident extends BaseClass{
	@Test(dataProvider="sendData")
	
	public void serviceNow(String descri) throws InterruptedException{
		
//		1.Create new incident
//		1. Launch ServiceNow application
//		2. Login with valid credentials (refer the document to create the instance)
//		3. Click All and enter Incident in filter navigator and press enter
//		4. Click on Create new option and fill the mandatory fields
//		5. Verify the newly created incident 
//		( copy the incident number and paste it in search field and enter then verify the instance number created or not)
		
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(10);
		Thread.sleep(2000);
		shadow.findElementByXPath("//div[@class='sn-polaris-tab can-animate polaris-enabled']").click();
		Thread.sleep(2000);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("incident");
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement frame=shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		//driver.findElement(By.xpath("//input[@id='sys_display.incident.caller_id']")).clear();
		String incidentNo=driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
        System.out.println(incidentNo);
		driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys(descri);
		driver.findElement(By.xpath("//button[@value='sysverb_insert']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(incidentNo);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);
		String incidentNo1 =driver.findElement(By.xpath("//tbody[@class='list2_body']//td[3]")).getText();
		if(incidentNo.equalsIgnoreCase(incidentNo1)) 
		System.out.println("New Incident Created ");
		else
			System.out.println("New Incident Not Created");
		
		
	}
	
	 @DataProvider()
     public String[][] sendData(){
     	
     
     String[][]	data	= new String[3][1];
     data[0][0]="for testing purpose 1";
     data[1][0]="for testing purpose 2";
     data[2][0]="for testing purpose 3";
     return data;
}

}

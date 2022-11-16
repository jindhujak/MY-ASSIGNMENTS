package week6day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethods {

        //@Test(invocationCount=2, threadPoolSize=2,invocationTimeOut=3000)
	@Test
	    public void runCreate() throws InterruptedException{
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("KGJ Organization");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jindhuja");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9087654321");
		driver.findElement(By.name("submitButton")).click();
		
		
}
}







package week8day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends BaseClass {
	
        @Test(dataProvider="fetchData")
	    public void runEditLead(String phNo, String cName) throws InterruptedException {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.name("submitButton")).click();
		driver.close();
        }
        
        @BeforeTest
        public void setFile()
        {
        	filename="createdelete";
        	sheetindex=2;
        }
//        @DataProvider
//        public String[][] sendData()
//        {
//        	String[][] data=new String[2][2];
//        	data[0][0]="9087654321";
//        	data[0][1]="Infosys";
//        	
//        	data[1][0]="99";
//        	data[1][1]="Testleaf";
//        	return data;
//        }
//        
        
}



package  week7day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends ProjectSpecificMethods {
@Test(dataProvider="sendData")
	public void runDuplicate(String phNo, String cName, String fName) throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement company=driver.findElement(By.id("createLeadForm_companyName"));
		company.clear();
		company.sendKeys(cName);
        WebElement firstN= driver.findElement(By.id("createLeadForm_firstName")); 
		firstN.clear();
		firstN.sendKeys(fName);
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}
  @DataProvider()
  public String[][] sendData(){
	

  String[][]	data	= new String[2][3];
  data[0][0]="99";
  data[0][1]="HP";
  data[0][2]="Vidya";


  data[1][0]="99";
  data[1][1]="TCS";
  data[1][2]="Karthick";
 

  return data;
  }



}







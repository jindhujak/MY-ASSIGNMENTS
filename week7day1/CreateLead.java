package week7day1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends ProjectSpecificMethods {
	
  
        @Test(dataProvider="sendData")
	    public void runCreate(String cName, String fName, String lName, String phNo){
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		}
        
        @DataProvider()
        public String[][] sendData(){
        	
        
        String[][]	data	= new String[2][4];
        data[0][0]="Testleaf";
        data[0][1]="Vidya";
        data[0][2]="R";
        data[0][3]="9087654321";
        
        data[1][0]="TCS";
        data[1][1]="Karthick";
        data[1][2]="R";
        data[1][3]="99";
        
        return data;
}
}






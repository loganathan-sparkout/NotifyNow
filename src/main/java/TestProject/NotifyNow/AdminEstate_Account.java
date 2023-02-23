package TestProject.NotifyNow;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AdminEstate_Account extends BaseClass{

	// Admin Login
	public void adminlogin() throws InterruptedException {
	
	//User email to login
			WebElement loginuseremail = driver.findElement(By.xpath("(//input[@id='email'])"));
			loginuseremail.sendKeys(EmailId);

			//Password for login
			WebElement loginuserpwd = driver.findElement(By.xpath("//input[@id='password']"));
			loginuserpwd.sendKeys(pwd);

			Thread.sleep(15000);
			
			//Click on login button
			WebElement loginbtn = driver.findElement(By.xpath("//button[@type='submit']"));
			loginbtn.click();
            System.out.println("login successfully");
            
		}
	public void EstateAccount() throws InterruptedException {
		// Estate account module click 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		WebElement Estateaccount = driver.findElement(By.xpath("(//span[text()='Estate Accounts'])"));
		js.executeScript("arguments[0].click()", Estateaccount);
		
		// From date picker
		WebElement Fromdate = driver.findElement(By.xpath("(//input[@id='from_date'])"));
		Fromdate.sendKeys("02-02-2023");
		
		// To date picker
		WebElement Todate = driver.findElement(By.xpath("(//input[@id='to_date'])"));
		Todate.sendKeys("02-20-2023");
		// Show button 
		WebElement showbutton = driver.findElement(By.xpath("(//button[@id='estate_account_list'])"));
		js.executeScript("arguments[0].click()", showbutton);
		Thread.sleep(2000);
//		//Page Down scroll method
//        Actions act = new Actions(driver);
//        act.sendKeys(Keys.PAGE_DOWN).build().perform(); 
//       Thread.sleep(1000);
        // Address field click
        WebElement addressclick = driver.findElement(By.xpath("(//th[text()='Address'])"));
        js.executeScript("arguments[0].click()", addressclick);		
        Thread.sleep(3000);
        
        //Horizondal scroll bar
//        JavascriptExecutor js = (JavascriptExecutor)driver; 
//        js.executeScript(
//            "document.getElementById('gvLocationHorizontalRail').scrollRight += 250", "");
        JavascriptExecutor jse = (JavascriptExecutor) driver;     
        jse.executeScript("document.querySelector('table th:last-child').scrollIntoView();");
        Thread.sleep(3000);
        
     // Estate Account Edit button 
     	WebElement EAEditbutton = driver.findElement(By.xpath("(//a[@href='https://dev.notifynow.uk/6zv8wa4mc0frr0kk/decedent-request/edit/3e8b1559-bef0-4fe3-a1f9-0ed530d66c49'])"));
     	js.executeScript("arguments[0].click()", EAEditbutton);
     	Thread.sleep(2000);
     	
    // Page Down scroll method
      Actions act = new Actions(driver);
      act.sendKeys(Keys.PAGE_DOWN).build().perform(); 
      Thread.sleep(10000);
     
  // creditor search Dropdown
  		WebElement admincreditordd = driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--multiple'])"));
  		 js.executeScript("arguments[0].click()", admincreditordd);
		Thread.sleep(5000);
		
	//	Selecting EON next Utility
		 WebElement eonnextcreditorselect = driver.findElement(By.xpath("//li[text()='Eon NEXT']"));	 
		 eonnextcreditorselect.click();
		 Thread.sleep(4000);
		//Selecting random utility type from the creditor
		 WebElement EONnextdropdown = driver.findElement(By.xpath("//*[@id=\"1faf6ffa-aa6b-48a6-9e0a-fcdc9503df680\"]/div/div[2]/div/div[1]/div/div/input"));
		 EONnextdropdown.click();
		 // Account type selection
		Thread.sleep(4000);
		// Account type Dropdown Selection
		WebElement eonnextdropdownselect = driver.findElement(By.xpath("//span[text()='Gas']"));
		eonnextdropdownselect.click();
			
		Thread.sleep(3000);
		// EON gas account number fields
		WebElement Accountnumber = driver.findElement(By.xpath("//input[@name='utility_account_number[]']"));
		Accountnumber.sendKeys("1234");
		Thread.sleep(3000);
		// EON gas account number fields
		 WebElement Confirm_accountnumber = driver.findElement(By.xpath("//input[@name='confirm_utility_account_number[]']"));
		 Confirm_accountnumber.sendKeys("1234");
		 Thread.sleep(2000);
		// EON gas Current_MeterReading fields
		 WebElement Current_MeterReading = driver.findElement(By.xpath("//input[@name='meter_read[]']"));
		 Current_MeterReading.sendKeys("1234");
		 Thread.sleep(2000);
		// EON gas Date_of_Current_MeterReading fields
		 WebElement Date_of_Current_MeterReading = driver.findElement(By.xpath("//input[@name='meter_read_date[]']"));
		 Date_of_Current_MeterReading.sendKeys("09102022");
		 Thread.sleep(2000);
	     
		// EON gas Transferdetail radiobutton
		 WebElement Transferdetail = driver.findElement(By.xpath("//span[text()='Close Account']"));
		 Transferdetail.click();																
		 Thread.sleep(2000); 
		 
		// Page Down scroll method
	      Actions submit = new Actions(driver);
	      submit.sendKeys(Keys.PAGE_DOWN).build().perform(); 
	      Thread.sleep(2000);
	   // Submit the page
		WebElement Submit = driver.findElement(By.xpath("//button[text()='Update']"));
		Submit.click();																
		Thread.sleep(3000);  
		
	}

}

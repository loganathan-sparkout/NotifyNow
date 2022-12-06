import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Notifier {
	public WebDriver driver = new FirefoxDriver();
	
	
	
	@BeforeTest
		 public void launchBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hxtreme\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
       
        driver.get("https://dev.notifynow.uk/");
        //Accept Cookies for Notifier Landing page
        driver.findElement(By.xpath("(//button[@id= \"cookie-consent-authorize-all\"])")).click();
        
	  }
	
	
  @Test
  public void Login() throws Exception {
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  Thread.sleep(2000);
	  // Notifier Member Login 
	  driver.findElement(By.xpath("/html/body/div[3]/div/div/nav/ul/li[3]/a/div")).click();
	  //Notifier Login Email
	  driver.findElement(By.xpath("(//input[@id='email'])")).sendKeys("loganathan@sparkouttech.com");	 
	  //Notifier Login Password
	  driver.findElement(By.xpath("(//input[@id='password'])")).sendKeys("Sparkout@123");
	  Thread.sleep(10000);
	  //Notifier Login Button
	  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/div/form/div/div[5]/div[2]/button")).click();
  }
  @Test(priority = 1)
  public void Create_Estate_account() throws Exception {
	//Notifier create tab
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[3]/nav/ul/li[2]/a/div[2]")).click(); 
//	//Notifier Country single select dropdown
	Thread.sleep(2000);
	WebElement countryselect = driver.findElement(By.xpath("(//span[@id='select2-country-container'])"));
	countryselect.click();
////	Thread.sleep(2000);
//	//Country dropdown Search
////	driver.findElement(By.xpath("(//input[@class='select2-search__field'])"));
////	driver.findElement(By.xpath("(//li[@id='select2-country-result-hgqz-230'])")).click();
    Thread.sleep(3000);
//    Select Statusfield = new Select(countryselect);
//    Statusfield.selectByVisibleText("United Kingdom");
    Thread.sleep(3000);
//    Select countryselect = new Select(driver.findElement(By.xpath("(//input[@class='select2-search__field'])")));
//    countryselect.selectByVisibleText("United Kingdom");
//	  
    JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].click()", countryselect); 
	  Select Country = new
	  Select(countryselect); Country.selectByVisibleText("United Kingdom");
    
  }
  

  @AfterTest
  public void afterTest() {
  }

}

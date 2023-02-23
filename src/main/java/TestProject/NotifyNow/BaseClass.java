package TestProject.NotifyNow;

import java.io.IOException;
import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public String baseurl = "https://dev.notifynow.uk/6zv8wa4mc0frr0kk/login";
//	public StringBuilder register = generateRandomString(5);
//	public String registeremail = register + "@mailinator.com";
	public String RandomPhone = this.generateRandomNumber(10);
	public String mail = ("https://www.mailinator.com/v4/public/inboxes.jsp?to=");
	public String EmailId = "support@estate-registry.com";
	public String pwd = "R3FpQz#S";
	public static WebDriver driver;
	public static JavascriptExecutor js;
	public String date = Integer.toString(randomdate());
	public String month = Integer.toString(randommonth());
	public String birthyear = Integer.toString(randomBirthYear());
	public String deathyear = Integer.toString(randomdeathYear());
//	public String downloadPath = "/home/kali/Downloads/decedent_request_2022-12-14 - 2022-12-24 Queue Data_2a01940f-2313-4aca-9914-a84fd15a5f99.csv";
//	public String decendentcsv = "decedent_request_2022-12-14 - 2022-12-24 Queue Data_2a01940f-2313-4aca-9914-a84fd15a5f99.csv";

	@BeforeTest
	public void Browsersetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseurl);
		js = (JavascriptExecutor) driver;
//		driver = new FirefoxDriver();
//		driver.get(baseurl);
//		driver = new EdgeDriver();
//		driver.get(baseurl);
		
}


//public StringBuilder generateRandomString(int len) {
//	String chars = "abcdefghijklmnopqrstuvwxyz";
//	Random rnd = new Random();
//	StringBuilder sb = new StringBuilder(len);
//	for (int i = 0; i < len; i++)
//		sb.append(chars.charAt(rnd.nextInt(chars.length())));
//	return sb;
//}

public String generateRandomNumber(int len) {
	String chars = "012345678";
	Random rnd = new Random();
	StringBuilder sb = new StringBuilder(len);
	for (int i = 0; i < len; i++)
		sb.append(chars.charAt(rnd.nextInt(chars.length())));
	return sb.toString();
}
static int randomBirthYear() {
	Random r = new Random();
	int low = 1967;
	int high = 1983;
	int result = r.nextInt(high - low) + low;
	return result;

}

static int randommonth() {
	Random r = new Random();
	int low = 10;
	int high = 12;
	int result = r.nextInt(high - low) + low;
	return result;

}

static int randomdate() {
	Random r = new Random();
	int low = 10;
	int high = 31;
	int result = r.nextInt(high - low) + low;
	return result;

}

static int randomdeathYear() {
	Random r = new Random();
	int low = 2010;
	int high = 2022;
	int result = r.nextInt(high - low) + low;
	return result;

}

// static int randomddutility() {
//	Random r = new Random();
//	int low = 1;
//	int high = 3;
//	int result = r.nextInt(high - low) + low;
//	return result;
//}
	//Estateaccount edit
	@Test(priority = 1)
	public void estateaccount() throws InterruptedException {
		AdminEstate_Account EA = new AdminEstate_Account();
		EA.adminlogin();
		EA.EstateAccount();
		
	}
	

}


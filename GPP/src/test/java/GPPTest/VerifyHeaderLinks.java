package GPPTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import GPP_Page.Home;
import GPP_Page.Login;
import GPP_Page.LoginPIN;
import GPP_Page.Logout;
import setup.Browser;
import utils.Utility;

public class VerifyHeaderLinks extends Browser{

	WebDriver driver ;
	Login login  ;
	LoginPIN login2 ;
	Home home ;
	Logout logout;
	SoftAssert soft ;
	int testID ;
	
	@Parameters ("browser")
	@BeforeTest
	public void openBrowser(String browserName) {
		
		System.out.println(browserName);
		
		if(browserName.equals("Chrome"))
		{
			driver = openChromeBrowser();
		}
		
		if(browserName.equals("Firefox"))
		{
			driver = openFirefoxBrowser ();
		}
		
		if(browserName.equals("Opera"))
		{
			System.setProperty("webdriver.opera.driver","C:\\Users\\yadav\\Downloads\\operadriver_win32\\chromedriver.exe");
			driver = new OperaDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	}
	
	@BeforeClass
	public void createPOMObjects() {
		login = new Login(driver);
		login2 = new LoginPIN(driver);
		home = new Home(driver);
	}
	
	@BeforeMethod
	public void loginToAppliction() throws InterruptedException {
		System.out.println("before Method");
		driver.get("https://kite.zerodha.com/");
		
		login.enterUN();
		login.enterPWD();
		login.ClickButton();
		
		login2.enterPIN();
		login2.Continue1();
		
		soft = new SoftAssert();
	}
	
	@Test
	public void test1() {
		testID = 1234;
		System.out.println("Test 1");		
		home.clickOnOrders();
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		soft.assertEquals(url, "https://kite.zerodha.com/holdin", "Holding page URL not found");
		soft.assertEquals("Zerodha Order Page", "Zerodha Order Pe");
		soft.assertAll();
	}
	
	@Test
	public void test2() {
		testID = 4556; 
		System.out.println("Test 1");
		home.clickOnHolding();
		String url = driver.getCurrentUrl();
		soft.assertEquals(url, "https://kite.zerodha.com/holgs", "Holding page URL not found");
		soft.assertEquals("Zerodha Holding Page", "Zerodha Hding Page");
		soft.assertAll();
	}
	
	// Listner = satus maintain
	// ItestRrsult
	// ITestReporter
	// ItestListner
	
	@AfterMethod
	public void afterMethod(ITestResult result)  {
		
		if(ITestResult.FAILURE == result.getStatus())
		{
			Utility.captureScreenshot(driver, testID);
		}
	
		System.out.println("After method");
		//login.logout();
		logout = new Logout(driver);
		logout.clickKiteChangeUser();
	}
	
	@AfterClass
	public void clearPOMObjects() {
		login = null;
		login2 = null;
		home = null;
	}
	@AfterTest
	public void afterClass() {
		System.out.println("After class");
		driver.close();
		driver = null; 
		System.gc(); // garbage collector to delete object
	}
}

package GPPTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GPP_Page.Home;
import GPP_Page.Login;
import GPP_Page.LoginPIN;

public class GPP_Verification {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://kite.zerodha.com/");
		
		
		Login login1 = new Login(driver);
		login1.enterUN();
		login1.enterPWD();
		login1.ClickButton();
		
		LoginPIN login2 = new LoginPIN(driver);
		login2.enterPIN();
		login2.Continue1();
		
		
		Home home = new Home(driver);
		home.PN();
		
		Thread.sleep(7000);
		driver.close();
		
		
		
	}
	


}

package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver ;
	}
	

	public static WebDriver openFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver","D:\\AUOMATION ALL\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		return driver ;
	}

}

package GPP_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class Login {
	// Step 1 Declare data member globally
	@FindBy (xpath="//input[@type='text']")
	private WebElement username;
	
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	@FindBy (xpath = "//span[@class='user-id']")
	private WebElement userProfile;
	
	@FindBy (xpath = "//a[text()=' Logout']")
	private WebElement logout;
	
	
	// step 2 Initialise global Data Member
	
public Login(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}
 // step3 create methods

public void enterUN() {
	String data = Utility.getDataFromExcel("data", 3 , 2);
	username.sendKeys(data);
	
}
public void enterPWD() {
	password.sendKeys("ZAQ1234567");
	
}
public void ClickButton() {
	loginButton.click();
	
}
public void logout() throws InterruptedException {
	userProfile.click();
	Thread.sleep(1000);
	logout.click();
	
}

}

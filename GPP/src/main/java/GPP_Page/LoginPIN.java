package GPP_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPIN {
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement pin;
	
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement submit;
	
	// step 2 Initialise global Data Member
	
	public LoginPIN(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
}
	// step3 create methods

	public void enterPIN() throws InterruptedException {
		Thread.sleep(2000);
		pin.sendKeys("234567");
		
}
	public void Continue1() {
		submit.click();
	}
		
}
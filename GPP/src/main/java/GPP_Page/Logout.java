package GPP_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	@FindBy(xpath="//a[text()='Change user']")
	WebElement chnageUser;
	
	public Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickKiteChangeUser() {
		chnageUser.click();
	}
}

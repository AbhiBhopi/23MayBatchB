package GPP_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	@FindBy (xpath = "//span[@class='user-id']")
	private WebElement ProfileName;
	
	@FindBy (xpath="//span[text()='Orders']")
	private WebElement orders;
	
	@FindBy (xpath="//span[text()='Holdings']")
	private WebElement holdings;
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);	
	}
	
	public void clickOnProfile() {
		ProfileName.click();

	}
	public void clickOnOrders() {
		orders.click();
	}
	public void clickOnHolding() {
		holdings.click();

	}
}
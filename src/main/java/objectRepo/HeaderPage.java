package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {

	
	// CONSTRUCTOR
	
	public HeaderPage(WebDriver driver){
		
		super(driver);
	}
	
	
	// LOCATORS
	
	@FindBy(xpath = "//button[.=' Upgrade']")
	WebElement upgradeBtn ;
	
	@FindBy(xpath = "//i[@class = 'oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	WebElement dropDown ;
	
	@FindBy(linkText = "About")
	WebElement aboutLink ;
	
	@FindBy(linkText = "Support")
	WebElement supportLink;
	
	@FindBy(linkText = "Change Password")
	WebElement changePassLink;
	
	@FindBy(linkText = "Logout")
	WebElement logoutLink;
	
	
	
	// ACTION METHODS
	
	public void upgradeClick() {
		upgradeBtn.click();
	}
	
	public void dropDownClick() {
		dropDown.click();
	}
	
	
	public void AboutClick() {
		aboutLink.click();
	}
	
	public void supportClick() {
		supportLink.click();
	}
	
	public void changePassClick() {
		changePassLink.click();
	}
	
	public void logoutClick() {
		logoutLink.click();
	}
	
	
	
	
}

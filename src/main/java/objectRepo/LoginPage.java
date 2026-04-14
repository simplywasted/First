package objectRepo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
	
	WebDriver driver;
	
	
	// CONSTRUCTOR
	
	public LoginPage(WebDriver driver){
		
		super(driver);
		
	}
	
	
	// LOCATORS
	
		@FindBy(name = "username")
		WebElement username;
		
		@FindBy(name = "password")
		WebElement password;
		
		@FindBy(xpath = "//button[text()=' Login ']")
		WebElement loginBtn;
		
		@FindBy(xpath = "//p[text() = 'Forgot your password? ']")
		WebElement forgetPassLink;
		
		

		
		// ACTION METHODS
		
		
		public void sendUserName(String usn) {
			
			username.sendKeys(usn);
			
		}
		
		public void sendPassWord(String pwd) {
			
			password.sendKeys(pwd);
			
		}
		
		public void clickLogin() {
			
			loginBtn.click();
			
		}
		
		public void clickForgetPassword() {
			
			forgetPassLink.click();
			
		}



	
	
}
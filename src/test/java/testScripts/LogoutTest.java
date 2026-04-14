package testScripts;

import org.testng.annotations.*;
import genericUtility.BaseClass;
import genericUtility.PropertyUtility;
import objectRepo.HeaderPage;
import objectRepo.LoginPage;

public class LogoutTest extends BaseClass  {
	
	@Test
	public void logout() throws InterruptedException {

	    // First login (required state)
	    LoginPage lp = new LoginPage(driver);
	    lp.sendUserName(PropertyUtility.dataReader("username"));
	    lp.sendPassWord(PropertyUtility.dataReader("password"));
	    lp.clickLogin();

	    // Then logout
	    HeaderPage hp = new HeaderPage(driver);
	    hp.dropDownClick();
	    hp.logoutClick();
	    
	    Thread.sleep(4000);
	}
	
}


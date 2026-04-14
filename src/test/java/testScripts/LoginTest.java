package testScripts;

import org.testng.annotations.Test;
import genericUtility.BaseClass;
import genericUtility.PropertyUtility;
import objectRepo.LoginPage;

public class LoginTest extends BaseClass {

    @Test
    public void login() throws InterruptedException {

        LoginPage lp = new LoginPage(driver);

        lp.sendUserName(PropertyUtility.dataReader("username"));
        lp.sendPassWord(PropertyUtility.dataReader("password"));

        Thread.sleep(2000); // temporary

        lp.clickLogin();

        Thread.sleep(5000);
    }
    

	
}
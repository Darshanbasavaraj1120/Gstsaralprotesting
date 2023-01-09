package pro.saral.testCases;
import java.io.IOException;

import org.testng.annotations.Test;
import pro.saral.pageObject.LoginPage;

public class TC_LoginTest_002 extends BaseClass
{
@Test(priority=0)
public void login_with_valid_username_valid_password() throws IOException{
		driver.get(baseurl);
	}
@Test(priority=1)
public void login_with_invalid_username_invalid_password() throws IOException{
		LoginPage lp=new LoginPage(driver);
		driver.get(baseurl);
		lp.invalid_username_invalid_password();
		}
@Test(priority=2)
	public void login_with_invalidusername_valid_password() throws IOException{
	LoginPage lp=new LoginPage(driver);
	driver.get(baseurl);
	lp.invalidusername_valid_password();
	}
@Test(priority=3)
public void login_with_valid_username_invalid_password() throws IOException{
	LoginPage lp=new LoginPage(driver);
	driver.get(baseurl);
	lp.valid_username_invalid_password();	
}
@Test(priority=4)
public void login_with_invalid_username_valid_password() throws IOException, InterruptedException{
	LoginPage lp=new LoginPage(driver);
	driver.get(baseurl);
	lp.invalid_username_valid_password();	
}
@Test(priority=5)
public void login_with_validusername_invalidpassword() throws IOException{
	LoginPage lp=new LoginPage(driver);
	driver.get(baseurl);
	lp.validusername_invalidpassword();

}
@Test(priority=6)
public void login_with_empty_data() throws IOException{
	LoginPage lp=new LoginPage(driver);
	driver.get(baseurl);
	lp.empty_data();
}

}


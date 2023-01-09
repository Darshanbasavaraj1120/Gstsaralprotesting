package pro.saral.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pro.saral.pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	public void loginTest() throws InterruptedException, IOException, Exception
	{
		logger.info("url is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		try {
			lp.confirmbotton();
			logger.info("Confirm login");
		}
		catch(Exception  e){
		}
		if(driver.findElement(By.xpath("//h4[contains(text(),'What's New!')]")).isEnabled())
		{
			lp.closereleasenote();
			logger.info("Closed release notes");
		}
		if(driver.findElement(By.xpath("//button[contains(text(),'Exit Tour Mode')]")).isEnabled())
		{
			lp.Exittour();
			logger.info("Exit tour");
		}

		if(driver.getTitle().equals("Saral Pro"))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
	
}

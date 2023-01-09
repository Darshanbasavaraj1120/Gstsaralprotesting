package pro.saral.pageObject;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pro.saral.testCases.BaseClass;
import pro.saral.utilities.XLUtils;
import pro.saral.utilities.ReadConfig.Constants;

public class LoginPage extends BaseClass {
	
	WebDriver idriver;
	static XLUtils excelutils= new XLUtils();
	static String excelfilepath=Constants.Entity_File_Path;
	public LoginPage(WebDriver rdriver) throws IOException
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		excelutils.EntityExcel(excelfilepath, "login");
		
		
//		srg
	}
	@FindBy(name="email")
	@CacheLookup
	WebElement txtuserName;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(id="loginForm-submit")
	@CacheLookup
	WebElement btnsubmit;
	
	@FindBy(xpath="(//button[@id=\"account-not-confirm-btn-activate\"])[3]")
	@CacheLookup
	WebElement btnconfirm;
	
	@FindBy(xpath="(//p[contains(text(),'Do you want to force login?')])[1]")
	@CacheLookup
	WebElement btnconfirmexist;
	
	@FindBy(xpath="((//h3[contains(text(),'Your Account is already logged In!')])[2]")
	@CacheLookup
	WebElement btnconfirmverify;
	
	@FindBy(xpath="(//div[@class='iqrfgKSHmECRs1qeeUBW']//child::div)[1]")
	@CacheLookup
	WebElement btnnote;
	
	@FindBy(xpath="//button[contains(text(),\"Exit Tour Mode\")]")
	@CacheLookup
	WebElement btnexittour;
	
	@FindBy(xpath="//div[@class=\"UserConfig__userprofile___Dy3O0 flex align-items-center ml-1 pr-2 pl-2\"]")
	@CacheLookup
	WebElement btnuser;
	
	@FindBy(xpath="//li[@id='nav-menu-item-13592']//child::span[@class='item_outer']")
	@CacheLookup
	WebElement loginlanding;
	
	@FindBy(xpath="//div[@class=\"UserConfig__s_link___3jKbG\"]")
	@CacheLookup
	WebElement btnlogout;
	
	@FindBy(xpath="(//div[@class=\"rbtn btn-2-0-0 \"])[2]")
	@CacheLookup
	WebElement mandatoryverify;
	
	@FindBy(xpath="//p[contains(text(),\"Exception : User does not exist.\")]")
	@CacheLookup
	WebElement usernamenotexists;
	
	@FindBy(xpath="//p[contains(text(),\"Exception : Incorrect username or password.\")]")
	@CacheLookup
	WebElement usernamepasswordnotexists;
	
	@FindBy(xpath=("//h4[contains(text(),'What')]"))
	@CacheLookup
	WebElement releasenotes;
	
	@FindBy(xpath=("//button[contains(text(),\"Exit Tour Mode\")]"))
	@CacheLookup
	WebElement tour;
	
	public void setUserName(String uname)
	{
		txtuserName.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	public void clickSubmit() 
	{
		btnsubmit.click();
	}
	public void confirmbotton()
	{
		btnconfirm.click();
	}
	public void confirmbottonexist() throws InterruptedException
	{
	    if(btnconfirmexist.isEnabled())
	    {
	        confirmbotton();
	    }
	    else {
	        System.out.println("first login");
	    }
//	        return btnconfirmexist.isEnabled();
	    }
	public void closereleasenote()
	{
		WebDriverWait wait = new WebDriverWait(idriver, 40);
		wait.until(ExpectedConditions.visibilityOf(btnnote));
		wait.until(ExpectedConditions.elementToBeClickable(btnnote)).click();
	}
	public boolean releasenotesexist()
	{
		return releasenotes.isEnabled();
	}
	public boolean loginlandingexists()
	{
		return loginlanding.isDisplayed();
	}
	public void loginlandingclick()
	{
		loginlanding.click();
	}
	public boolean tourexist()
	{
		return tour.isEnabled();
	}
	public void clickUser() 
	{
		btnuser.click();
	}
	public void clicklogout() 
	{
		btnlogout.click();
	}
	public void Exittour() 
	{
		
		btnexittour.click();
	}
	public boolean validfield()
	{
		return mandatoryverify.isDisplayed();
	}
	public boolean usernotexists()
	{
		return usernamenotexists.isDisplayed();
	}
	public boolean usernamepasswordnotexists()
	{
		return usernamepasswordnotexists.isDisplayed();
	}
	
	public void invalid_username_invalid_password() throws IOException
	{
		logger.info("url is opened");
		setUserName(excelutils.getCellData(2, 0));
		logger.info("Entered username");
		setPassword(excelutils.getCellData(2, 1));
		logger.info("Entered password");
		clickSubmit();
		if(validfield())	
		{
			Assert.assertTrue(true);
			logger.info("Test Pass");
		}
		else
		{
			captureScreen(driver,"loginTest5");
			Assert.assertTrue(false);
			logger.info("Test Fail");
		}
	}
	public void invalidusername_valid_password() throws IOException
	{
		logger.info("url is opened");
		setUserName(excelutils.getCellData(3, 0));
		logger.info("Entered username");
		setPassword(excelutils.getCellData(3, 1));
		logger.info("Entered password");
		clickSubmit();	
		if(validfield())	
		{
			Assert.assertTrue(true);
			logger.info("Test Pass");
		}
		else
		{
			captureScreen(driver,"loginTest5");
			Assert.assertTrue(false);
			logger.info("Test Fail");
		}
	}
	public void valid_username_invalid_password() throws IOException
	{
		logger.info("url is opened");
		setUserName(excelutils.getCellData(4, 0));
		logger.info("Entered username");
		setPassword(excelutils.getCellData(4, 1));
		logger.info("Entered password");
		clickSubmit();
		if(validfield())	
		{
			Assert.assertTrue(true);
			logger.info("Test Pass");
		}
		else
		{
			captureScreen(driver,"loginTest5");
			Assert.assertTrue(false);
			logger.info("Test Fail");
		}
	}
	public void invalid_username_valid_password() throws IOException
	{
		logger.info("url is opened");
		setUserName(excelutils.getCellData(5, 0));
		logger.info("Entered username");
		setPassword(excelutils.getCellData(5, 1));
		logger.info("Entered password");
		clickSubmit();
		if(usernotexists())	
		{
			Assert.assertTrue(true);
			logger.info("Test Pass");
		}
		else
		{
			captureScreen(driver,"loginTest5");
			Assert.assertTrue(false);
			logger.info("Test Fail");
		}
	}
	public void validusername_invalidpassword() throws IOException
	{
		logger.info("url is opened");
		setUserName(excelutils.getCellData(6, 0));
		logger.info("Entered username");
		setPassword(excelutils.getCellData(6, 1));
		logger.info("Entered password");
		clickSubmit();
		confirmbotton();
		if(usernamepasswordnotexists())	
		{
			Assert.assertTrue(true);
			logger.info("Test Pass");
		}
		else
		{
			captureScreen(driver,"loginTest6");
			Assert.assertTrue(false);
			logger.info("Test Fail");
		}
	}
	public void empty_data() throws IOException
	{
		logger.info("url is opened");
		setUserName(excelutils.getCellData(7, 0));
		logger.info("Entered username");
		setPassword(excelutils.getCellData(7, 1));
		logger.info("Entered password");
		clickSubmit();
		if(validfield())	
		{
			Assert.assertTrue(true);
			logger.info("Test Pass");
		}
		else
		{
			captureScreen(driver,"loginTest5");
			Assert.assertTrue(false);
			logger.info("Test Fail");
		}
	}
	
	}

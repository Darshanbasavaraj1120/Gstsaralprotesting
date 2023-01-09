package pro.saral.pageObject;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pro.saral.testCases.BaseClass;
import pro.saral.utilities.ReadConfig;
import pro.saral.utilities.XLUtils;
import pro.saral.utilities.ReadConfig.Constants;

public class UserManagement extends BaseClass{
//	
	WebDriver idriver;
	ReadConfig readconfig=new ReadConfig();
	static String excelfilepath=Constants.User_File_Path;
	static XLUtils excelutils= new XLUtils();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	int j=0;
	static String sheetname= "User";
	public UserManagement(WebDriver rdriver) throws IOException
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//div[@class='UserConfig__userprofile___Dy3O0 flex align-items-center ml-1 pr-2 pl-2']")
	@CacheLookup
	WebElement tabuser;
	
	@FindBy(xpath="(//a[@href='/dashboard/usermanagement'])[1]")
	@CacheLookup
	WebElement tabusermanagement;
	
	@FindBy(xpath="//a[@class='tab tab-primary active']")
	@CacheLookup
	WebElement tabusermaster;
	
	@FindBy(id="user-list-add")
	@CacheLookup
	WebElement btnadd;
	
	@FindBy(id="userMaster-saveButton")
	@CacheLookup
	WebElement btnsaveuser;
	
	@FindBy(id="userMaster-firstName")
	@CacheLookup
	WebElement txtuserfirstname;
	
	@FindBy(id="userMaster-lastName")
	@CacheLookup
	WebElement txtuserlastname;
	
	@FindBy(id="userMaster-email")
	@CacheLookup
	WebElement txtuseremail;
	
	@FindBy(id="userMaster-phoneNumber")
	@CacheLookup
	WebElement txtuserphone;
	
	
	@FindBy(xpath="(//div[@class='rbtn btn-2-0-0 title-bottom'])[3]")
	@CacheLookup
	WebElement btnclose;
	
	@FindBy(xpath="(//button[@class='btn2 icon-btn2 btn-rounded btn-flat btn-danger Ripple-parent']//parent::div)[3]")
	@CacheLookup
	WebElement btnerror;

	@FindBy(xpath="//span[contains(text(),'Invalid email')]")
	@CacheLookup
	WebElement invalidemialerror;	
	
	public void hoveronuser()
	{
		action.moveToElement(tabuser).perform();
	}
	public void clickusermanagements()
	{
		tabusermanagement.click();
	}
	public void clickusermaster()
	{
		tabusermaster.click();
	}
	public void addbutton()
	{
		btnadd.click();
	}
	public void saveuser()
	{
		btnsaveuser.click();
	}
	public void userfirstname(String username)
	{
		txtuserfirstname.sendKeys(username);
	}
	public void userlastname(String lastname)
	{
		txtuserlastname.sendKeys(lastname);
	}
	public void useremail(String email)
	{
		txtuseremail.sendKeys(email);
	}
	public void userphone(String phone)
	{
		txtuserphone.sendKeys(phone);
	}
	public void closeuser()
	{
		btnclose.click();
	}
	public void errorbutton()
	{
		btnerror.click();
	}
	public void emailerror()
	{
		invalidemialerror.isDisplayed();
	}	
//	
//	public void closeuser()
//	{
//		btnclose.click();
//	}
//	
//	public void closeuser()
//	{
//		btnclose.click();
//	}
//	public void closeuser()
//	{
//		btnclose.click();
//	}
//	
//	public void closeuser()
//	{
//		btnclose.click();
//	}
//	public void closeuser()
//	{
//		btnclose.click();
//	}
//	
//	public void closeuser()
//	{
//		btnclose.click();
//	}
//	
//	public void closeuser()
//	{
//		btnclose.click();
//	}
//	public void closeuser()
//	{
//		btnclose.click();
//	}
	public void checkusermandatoryfields() throws IOException
	{
		EntityMaster em=new EntityMaster(driver);
		em.hoveronentity();
		em.entity1();
		addbutton();
		saveuser();
		readconfig.ismandatory(txtuserfirstname);
		readconfig.ismandatory(txtuseremail);
		closeuser();
	}
	public void entermandatoryfields() throws IOException
	{

		EntityMaster em=new EntityMaster(driver);
		em.hoveronentity();
		em.entity1();
		addbutton();
		System.out.println(excelfilepath);
		System.out.println(excelfilepath);
		System.out.println(excelfilepath);
		System.out.println(excelfilepath);
		System.out.println(excelfilepath);
		
		userfirstname(excelutils.getCellData(1, 0));
		userlastname(excelutils.getCellData(1, 1));
		useremail(excelutils.getCellData(1, 2));
		userphone(excelutils.getCellData(1, 3));
		saveuser();
	}
}

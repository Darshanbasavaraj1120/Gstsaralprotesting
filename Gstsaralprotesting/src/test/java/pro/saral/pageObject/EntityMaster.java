package pro.saral.pageObject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pro.saral.testCases.BaseClass;
import java.util.*;
import pro.saral.utilities.ReadConfig;
import pro.saral.utilities.ReadConfig.Constants;
import pro.saral.utilities.XLUtils;;

public class EntityMaster extends BaseClass{
	WebDriver idriver;
	ReadConfig readconfig=new ReadConfig();
	static XLUtils excelutils= new XLUtils();
	static String excelfilepath=Constants.Entity_File_Path;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	int j=0;
	public EntityMaster(WebDriver rdriver) throws IOException
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		excelutils.EntityExcel(excelfilepath, "Entity");


	}
@FindBy(id="Entitycard-entity-add")
@CacheLookup
WebElement newentity;

@FindBy(id="entityComponent-name")
@CacheLookup
WebElement txtcompanyname;

@FindBy(id="entityComponent-address")
@CacheLookup
WebElement txtaddress;

@FindBy(id="entityComponent-place")
@CacheLookup
WebElement txtplace;

@FindBy(id="entityComponent-stateId")
@CacheLookup
WebElement dropdownentitystate;

@FindBy(id="entityComponent-pin")
@CacheLookup
WebElement txtpin;

@FindBy(id="entityComponent-gstn")
@CacheLookup
WebElement txtgstin;

@FindBy(id="entityComponent-email")
@CacheLookup
WebElement txtemailid;

@FindBy(id="entityComponent-mobileNumber")
@CacheLookup
WebElement txtmobile;

@FindBy(xpath="//button[@id='entityComponent-submitButton']")
@CacheLookup
WebElement btnentityEntitysave;

@FindBy(id="entityCard-SavedClientNotification")
@CacheLookup
WebElement entitysavenotification;

@FindBy(id="entityCard-deletesuccessNotification")
@CacheLookup
WebElement entitydeletenotification;

@FindBy(id="entityCard-nameDupicationError")
@CacheLookup
WebElement entityduplicatenotification;

@FindBy(xpath="(//div[@data-title='Close'])[2]")
@CacheLookup
WebElement closeentity;





@FindBy(id="ClientListCard-client-add")
@CacheLookup
WebElement btnaddclient;

@FindBy(id="clientComponent-clientName")
@CacheLookup
WebElement txtclientfilename;

@FindBy(id="clientComponent-legalName")
@CacheLookup
WebElement txtclientlegalname;

@FindBy(id="clientComponent-gstin")
@CacheLookup
WebElement txtclientgstin;

@FindBy(id="clientComponent-tan")
@CacheLookup
WebElement txtclienttan;

@FindBy(id="clientComponent-pan")
@CacheLookup
WebElement txtclientpan;

@FindBy(id="clientComponent-emailId")
@CacheLookup
WebElement txtclientemailid;

@FindBy(id="clientComponent-address")
@CacheLookup
WebElement txtclientaddress;

@FindBy(id="clientComponent-city")
@CacheLookup
WebElement txtclientcity;

@FindBy(id="clientComponent-stateId")
@CacheLookup
WebElement dropdownclientstate;

@FindBy(id="clientComponent-mobileField")
@CacheLookup
WebElement txtclientmobile;

@FindBy(xpath="(//div[@class='check-container'])[1]")
@CacheLookup
WebElement btnenablegst;

@FindBy(xpath="(//div[@class='check-container'])[2]")
@CacheLookup
WebElement btnenabletds;

@FindBy(xpath="(//div[@class='check-container'])[3]")
@CacheLookup
WebElement btnenableincometax;

@FindBy(xpath="(//div[@class='check-container'])[4]")
@CacheLookup
WebElement btnenablebranch;

@FindBy(id="clientComponent-submitButton")
@CacheLookup
WebElement btnclientsave;

@FindBy(xpath="(//button[@class='btn2 button2 btn-primary btn-sm Ripple-parent'])[3]")
@CacheLookup
WebElement btnclientgetportal;

@FindBy(xpath="(//div[@data-title='Close'])[4]")
@CacheLookup
WebElement btncloseclient;

@FindBy(id="Saral_Pro")
@CacheLookup
WebElement entity1click;

@FindBy(id="Saral_ProSaral_Incometax")
@CacheLookup
WebElement editedentity;

@FindBy(id="Saral_Gst")
@CacheLookup
WebElement entity2click;

@FindBy(id="clientListCard-SavedClientNotification")
@CacheLookup
WebElement clientsavenotification;

@FindBy(id="clientComponent-update-notification")
@CacheLookup
WebElement clientupdatenotification;

@FindBy(id="clientListCard-deletesuccessNotification")
@CacheLookup
WebElement clientdeletenotification;

@FindBy(id="clientListCard-failedClientNotification")
@CacheLookup
WebElement clientduplicatenotification;

@FindBy(xpath="//div[contains(text(),'Branch +')]")
@CacheLookup
WebElement btnbranch;

@FindBy(id="branchMasterComponent-branchName")
@CacheLookup
WebElement txtbranchname;

@FindBy(id="branchMasterComponent-emailId")
@CacheLookup
WebElement txtbranchemailid;

@FindBy(id="branchMasterComponent-gstn")
@CacheLookup
WebElement txtbranchgstin;

@FindBy(id="branchMasterComponent-tan")
@CacheLookup
WebElement txtbranchtan;

@FindBy(id="branchMasterComponent-pan")
@CacheLookup
WebElement txtbranchpan;

@FindBy(id="branchMasterComponent-address")
@CacheLookup
WebElement txtbranchaddress;

@FindBy(id="branchMasterComponent-city")
@CacheLookup
WebElement txtbranchcity;

@FindBy(id="branchMasterComponent-stateId")
@CacheLookup
WebElement dropdownbranchstate;

@FindBy(id="branchMasterComponent-mobileNumber")
@CacheLookup
WebElement txtbranchmobilenumber;

@FindBy(xpath="(//button[@id='branchMasterComponent-submitButton']//parent::div)[1]")
@CacheLookup
WebElement btnbranchsave;


@FindBy(xpath="(//div[@data-title='Close'])[6]")
@CacheLookup
WebElement btnbranchclose;

@FindBy(xpath="//span[@class='UserConfig__settings___2yRnI ']")
@CacheLookup
WebElement btnfiles;

@FindBy(xpath="(//a[@class='UserConfig__s_link___3jKbG'])[1]")
@CacheLookup
WebElement clientslist;

@FindBy(id="activeClients-edit-badge-0")
@CacheLookup
WebElement editclient1;

@FindBy(id="activeClients-edit-badge-1")
@CacheLookup
WebElement editclient2;

@FindBy(xpath="//a[@class='tab tab-primary']")
@CacheLookup
WebElement tabbranchlist;

@FindBy(xpath="//a[@class='tab tab-primary active']")
@CacheLookup
WebElement tabfiles;

@FindBy(id="branchListComponent-branch-edit-badge-0")
@CacheLookup
WebElement editbranch1;

@FindBy(id="branchListComponent-branch-edit-badge-1")
@CacheLookup
WebElement editbranch2;

@FindBy(id="branchListComponent-saveNotification")
@CacheLookup
WebElement savebranchnotification;

@FindBy(id="branchListComponent-branch-edit-delete-0")
@CacheLookup
WebElement deletebranch1;

@FindBy(xpath="(//button[@class='btn2 button2 btn-danger btn-sm Ripple-parent'])[1]")
@CacheLookup
WebElement deletebranchconfirm;

@FindBy(xpath="(//button[@id='active-btn-yes']//parent::div)[1]")
@CacheLookup
WebElement deleteclientconfirm;

@FindBy(xpath="//h4[@id='r_ex-modal-text']")
@CacheLookup
WebElement branchduplication;

@FindBy(xpath="(//button[@id='BranchListComponent-branch-edit-badge']//parent::div)[1]")
@CacheLookup
WebElement btnaddbranch;

@FindBy(id="activeClients-delete-badge-0")
@CacheLookup
WebElement deleteclient;

@FindBy(id="activeClients-deletBranchSuccessNotification")
@CacheLookup
WebElement deleteclientnotification;

@FindBy(xpath="//button[@id='Entitycard-entity-edit-icon-11']")
@CacheLookup
WebElement editentity;

@FindBy(xpath="//div[contains(text(),'Please select atleast one module')]")
@CacheLookup
WebElement selectsection;

@FindBy(id="entityCard-deletesuccessNotification")
@CacheLookup
WebElement deleteentitynotification;

@FindBy(xpath="//button[@id='Entitycard-entity-delete-icon-12']")
@CacheLookup
WebElement deleteentity;

@FindBy(xpath="(//button[@id='auditor-btn-yes']//parent::div)[1]")
@CacheLookup
WebElement deleteentityconfirm;		

@FindBy(id="entityCard-nameDupicationError")
@CacheLookup
WebElement duplicateentity;	

@FindBy(xpath="//button[@id='Entitycard-entity-delete-icon-11']")
@CacheLookup
WebElement deleteentity2;

public void newentityclick()
{
	newentity.click();
}
public void companyname(String companyname)
{
	txtcompanyname.sendKeys(companyname);
}
public void companyaddress(String companyaddress)
{
	txtaddress.sendKeys(companyaddress);
}
public void companyplace(String companyplace)
{
	txtplace.sendKeys(companyplace);
}
public void companystate(String companystate)
{
	Select statedropdown = new Select(dropdownentitystate);
	statedropdown.selectByVisibleText(companystate);
}
public void companypincode(String companystate)
{
	txtpin.sendKeys(companystate);
}
public void companygstin(String companygstin)
{
	txtgstin.sendKeys(companygstin);
}
public void companyemailid(String companyemailid)
{
	txtemailid.sendKeys(companyemailid);
}
public void companymobile(String companymobile)
{
	txtmobile.sendKeys(companymobile);
}
public void Entitysave()
{
	btnentityEntitysave.click();
}
public boolean verifyEntitysavenotification()
{
	return entitysavenotification.isDisplayed();
}
public boolean verifyentityduplicatenotification()
{
	return entityduplicatenotification.isDisplayed();
}
public void verifyentitydeletenotification()
{
	entitydeletenotification.isDisplayed();
}
public void closeentityscreen()
{
	closeentity.click();
}
public void addclient()
{
	btnaddclient.click();
}
public void clientfilename(String filename)
{
	txtclientfilename.sendKeys(filename);
}
public void clientlegalname(String legalname)
{
	txtclientlegalname.sendKeys(legalname);
}
public void clientgstin(String gstin)
{
	txtclientgstin.sendKeys(gstin);
}
public void clienttan(String tan)
{
	txtclienttan.sendKeys(tan);
}
public void clientpan(String pan)
{
	txtclientpan.sendKeys(pan);
}
public void clientemailid(String emailid)
{
	txtclientemailid.sendKeys(emailid);
}
public void clientaddress(String address)
{
	txtclientaddress.sendKeys(address);
}
public void clientcity(String city)
{
	txtclientcity.sendKeys(city);
}
public void clientstate(String state)
{
	Select statedropdown = new Select(dropdownclientstate);
	statedropdown.selectByVisibleText(state);
}
public void clientmobile(String mobile)
{
	txtclientmobile.sendKeys(mobile);
}
public void enablegst()
{
	btnenablegst.click();
}
public void enabletds()
{
	btnenabletds.click();
}
public void enableincometax()
{
	btnenableincometax.click();
}
public void enablebranch()
{
	btnenablebranch.click();
}
public void Clientsave()
{
	btnclientsave.click();
}
public void clientgetportal()
{
	btnclientgetportal.click();
}
public void clientclose()
{
	btncloseclient.click();
}
public void entity1()
{
	entity1click.click();
}
public void entity2()
{
	entity2click.click();
}
public boolean verifyclientsavenotification()
{
	return clientsavenotification.isDisplayed();
}
public boolean verifyclientupdatenotification()
{
	return clientupdatenotification.isDisplayed();
}
public boolean verifyclientduplicatenotification()
{
	return clientduplicatenotification.isDisplayed();
}
public void verifyclientdeletenotification()
{
	clientdeletenotification.isDisplayed();
}
public void selectsectionvalidation()
{
	selectsection.isDisplayed();
}
public void clickonbranch()
{
	btnbranch.click();
}
public void branchname(String branchname)
{
	txtbranchname.sendKeys(branchname);
}
public void branchemailid(String branchemailid)
{
	txtbranchemailid.sendKeys(branchemailid);
}
public void branchgstin(String branchgstin)
{
	txtbranchgstin.sendKeys(branchgstin);
}
public void branchtan(String branchtan)
{
	txtbranchtan.sendKeys(branchtan);
}
public void branchpan(String branchpan)
{
	txtbranchpan
	.sendKeys(branchpan);
}
public void branchaddress(String branchaddress)
{
	txtbranchaddress.sendKeys(branchaddress);
}
public void branchcity(String branchcity)
{
	txtbranchcity.sendKeys(branchcity);
}
public void branchstsate(String state)
{
	Select statedropdown = new Select(dropdownclientstate);
	statedropdown.selectByVisibleText(state);
}
public void branchmobilenumber(String branchmobilenumber)
{
	txtbranchmobilenumber.sendKeys(branchmobilenumber);
}
public void branchsave()
{
	btnbranchsave.click();
}
public void branchclose()
{
	btnbranchclose.click();
}
public void fiesclick()
{
	btnfiles.click();
}
public void clients()
{
	clientslist.click();
}
public void editclientone()
{
	editclient1.click();
}
public void editclientwo()
{
	editclient2.click();
}
public void branchlist()
{
	tabbranchlist.click();
}
public void fileslist()
{
	tabfiles.click();
}
public void editbranchone()
{
	editbranch1.click();
}
public void editbranchtwo()
{
	editbranch2.click();
}
public void verifybranchsavenotification()
{
	savebranchnotification.isDisplayed();
}
public void deletebranchone()
{
	deletebranch1.click();
}
public void deleteclientone()
{
	deleteclient.click();
}
public void confirmdeletebranch()
{
	deletebranchconfirm.click();
}
public void confirmdeleteclient()
{
	deleteclientconfirm.click();
}
public void refresh()
{
	driver.navigate().refresh();
}
public void verifybranchduplication()
{
	branchduplication.isDisplayed();
}
public void addbranch()
{
	btnaddbranch.click();
}
public void editentitylist()
{
	editentity.click();
}
public void deleteentityconfirm()
{
	deleteentityconfirm.click();
}
public void deleteentity()
{
	deleteentity.click();
}
public void verifydeleteentitynotification()
{
	deleteentitynotification.isDisplayed();
}
public void verifydeleteclientnotification()
{
	deleteclientnotification.isDisplayed();
}
public void verifyduplicateentitynotification()
{
	duplicateentity.isDisplayed();
}
public void deleteentitytwo()
{
	deleteentity2.click();
}
public void hovereditedentity()
{
	editedentity.click();
}
public void hoveronentity()
{
	action.moveToElement(entity1click).perform();
}
public void Check_Entity_Mandatory() throws IOException
{
	logger.info("Home is opened");
	newentityclick();
	Entitysave();
	readconfig.ismandatory(txtcompanyname);
	logger.info("Company name is mandatory");
	readconfig.ismandatory(dropdownentitystate);
	logger.info("Company state is mandatory");
	readconfig.ismandatory(txtmobile);
	logger.info("Company monile number is mandatory");
	closeentityscreen();
}

public void create_entity() throws IOException, InterruptedException
{
	logger.info("Home page is opened");
	newentityclick();
	companyname(excelutils.getCellData(1, 0));
	companyaddress(excelutils.getCellData(1, 1));
	companyplace(excelutils.getCellData(1, 2));
	companystate(excelutils.getCellData(1, 3));
	companypincode(excelutils.getCellData(1, 4));
	companygstin(excelutils.getCellData(1, 5));
	companyemailid(excelutils.getCellData(1, 6));
	companymobile(excelutils.getCellData(1, 7));
	logger.info("Entered all fields");
	Entitysave();	
	verifyEntitysavenotification();
}
public void create_duplicate_with_all_entity() throws IOException
{
	logger.info("Home page is opened");
	newentityclick();
	companyname(excelutils.getCellData(1, 0));
	companyaddress(excelutils.getCellData(1, 1));
	companyplace(excelutils.getCellData(1, 2));
	companystate(excelutils.getCellData(1, 3));
	companypincode(excelutils.getCellData(1, 4));
	companygstin(excelutils.getCellData(1, 5));
	companyemailid(excelutils.getCellData(1, 6));
	companymobile(excelutils.getCellData(1, 7));
	logger.info("Entered all fields");
	Entitysave();
	verifyentityduplicatenotification();
}
public void create_new_entity() throws IOException
{
	logger.info("Home page is opened");
	newentityclick();
	companyname(excelutils.getCellData(2, 0));
	companystate(excelutils.getCellData(2, 3));
	companymobile(excelutils.getCellData(2, 7));
	logger.info("Entered mandatory fields");
	Entitysave();
	verifyEntitysavenotification();
}
public void create_duplicate_entity() throws IOException
{
	logger.info("Home page is opened");
	newentityclick();
	companyname(excelutils.getCellData(2, 0));
	companystate(excelutils.getCellData(2, 3));
	companymobile(excelutils.getCellData(2, 7));
	logger.info("Entered mandatory fields");
	Entitysave();
	verifyentityduplicatenotification();
}
public void check_client_mandatory_fields()
{
	action.moveToElement(entity1click).perform();
	entity1();
	logger.info("Saral pro entity opened");
	addclient();
	Clientsave();
	readconfig.ismandatory(txtclientfilename);
	logger.info("Client name is mandatory");
	readconfig.ismandatory(dropdownclientstate);
	logger.info("Client state is mandatory");
	readconfig.ismandatory(txtclientmobile);
	logger.info("Client mobile number is mandatory");
	selectsectionvalidation();
	clientclose();
}
public void enter_Client_madatory_fields()
{
	action.moveToElement(entity1click).perform();
	entity1();
	logger.info("Saral pro entity opened");
	addclient();
	clientfilename(excelutils.getCellData(6, 0));
	clientstate(excelutils.getCellData(6, 8));
	clientmobile(excelutils.getCellData(6, 9));
	enablegst();
	clientgstin(excelutils.getCellData(6, 2));
	Clientsave();
	verifyclientsavenotification();
}
public void check_client_dupication()
{
	action.moveToElement(entity1click).perform();
	entity1();
	logger.info("Saral pro entity opened");
	addclient();
	clientfilename(excelutils.getCellData(6, 0));
	clientstate(excelutils.getCellData(6, 8));
	clientmobile(excelutils.getCellData(6, 9));
	enablegst();
	clientgstin(excelutils.getCellData(6, 2));
	Clientsave();
	verifyclientduplicatenotification();
}
public void enter_all_client_fields()
{
	action.moveToElement(entity1click).perform();
	entity1();
	logger.info("Saral pro entity opened");
	addclient();
	clientfilename(excelutils.getCellData(7, 0));
	clientlegalname(excelutils.getCellData(7, 1));
	clientemailid(excelutils.getCellData(7, 5));
	clientaddress(excelutils.getCellData(7, 6));
	clientcity(excelutils.getCellData(7, 7));
	clientstate(excelutils.getCellData(7, 8));
	clientmobile(excelutils.getCellData(7, 9));
	enablegst();
	enabletds();
	enablebranch();
	enableincometax();
	clientgstin(excelutils.getCellData(7, 2));
	clienttan(excelutils.getCellData(7, 3));
	clientpan(excelutils.getCellData(7, 4));
	Clientsave();
	verifyclientsavenotification();
}
public void check_branch_mandatory_fields()
{
	action.moveToElement(entity1click).perform();
	entity1();
	logger.info("Saral pro Branch opened");
	clickonbranch();
	branchsave();
	readconfig.ismandatory(txtbranchname);
	logger.info("Branch name is mandatory");
	readconfig.ismandatory(txtbranchgstin);
	logger.info("Branch state is mandatory");
	branchclose();
}
public void enter_branch_mandatory_fields()
{
	action.moveToElement(entity1click).perform();
	entity1();
	logger.info("Saral pro Branch opened");
	clickonbranch();
	branchname(excelutils.getCellData(11, 0));
	branchgstin(excelutils.getCellData(11, 2));
	branchsave();
	verifyclientsavenotification();
}
public void enter_branch_all_fields()
{
	action.moveToElement(entity1click).perform();
	entity1();
	logger.info("Saral pro Branch opened");
	clickonbranch();
	branchname(excelutils.getCellData(12, 0));
	branchemailid(excelutils.getCellData(12, 1));
	branchgstin(excelutils.getCellData(12, 2));
	branchtan(excelutils.getCellData(12, 3));
	branchpan(excelutils.getCellData(12, 4));
	branchaddress(excelutils.getCellData(12, 5));
	branchcity(excelutils.getCellData(12, 6));
	branchmobilenumber(excelutils.getCellData(12, 8));
	branchsave();
	verifyclientsavenotification();
}
public void enter_all_incorrect_branch_fields()
{
	action.moveToElement(entity1click).perform();
	entity1();
	logger.info("Saral pro Branch opened");
	clickonbranch();
	branchemailid(excelutils.getCellData(10, 2));
	branchgstin(excelutils.getCellData(10, 2));
	branchtan(excelutils.getCellData(10, 2));
	branchpan(excelutils.getCellData(10, 2));
	branchmobilenumber(excelutils.getCellData(10, 2));
	readconfig.ismandatory(txtbranchname);
	readconfig.ismandatory(txtbranchemailid);
	readconfig.ismandatory(txtbranchtan);
	readconfig.ismandatory(txtbranchpan);
	readconfig.ismandatory(txtbranchmobilenumber);
	branchsave();
}
public void editbranch()
{
	action.moveToElement(entity1click).perform();
	entity1();
	fiesclick();
	clients();
	editclientwo();
	branchlist();
	editbranchtwo();
	txtbranchemailid.clear();
	branchemailid(excelutils.getCellData(13, 1));
	txtbranchtan.clear();	
	branchtan(excelutils.getCellData(13, 3));
	txtbranchcity.clear();
	branchcity(excelutils.getCellData(13, 6));
	txtbranchmobilenumber.clear();
	branchmobilenumber(excelutils.getCellData(13, 8));
	txtbranchpan.clear();
	branchpan(excelutils.getCellData(13, 4));
	branchsave();
	verifybranchsavenotification();
}
public void deletefirstbranch() throws InterruptedException
{
	action.moveToElement(entity1click).perform();
	entity1();
	fiesclick();
	clients();
	editclientwo();
	branchlist();
	deletebranchone();
	confirmdeletebranch();
	Thread.sleep(5000);
}
public void checkbranchduplication()
{
	action.moveToElement(entity1click).perform();
	entity1();
	fiesclick();
	clients();
	editclientwo();
	branchlist();
	addbranch();
	branchname(excelutils.getCellData(12, 0));
	branchemailid(excelutils.getCellData(12, 1));
	branchgstin(excelutils.getCellData(12, 2));
	branchtan(excelutils.getCellData(12, 3));
	branchpan(excelutils.getCellData(12, 4));
	branchaddress(excelutils.getCellData(12, 5));
	branchcity(excelutils.getCellData(12, 6));
	branchmobilenumber(excelutils.getCellData(12, 8));
	branchsave();
	verifybranchduplication();
}
public void deleteclient() throws InterruptedException
{
	action.moveToElement(entity1click).perform();
	entity1();
	fiesclick();
	clients();
	deleteclientone();
	confirmdeleteclient();
	verifydeleteclientnotification();
}
public void editclient()
{
	action.moveToElement(entity1click).perform();
	entity1();
	fiesclick();
	clients();
	editclientone();
	txtclientfilename.clear();
	clientfilename(excelutils.getCellData(8, 0));
	txtclientlegalname.clear();
	clientlegalname(excelutils.getCellData(8, 1));
	txtclientaddress.clear();
	clientaddress(excelutils.getCellData(8, 6));
	txtclientcity.clear();
	clientcity(excelutils.getCellData(8, 7));;
	txtclientmobile.clear();
	clientmobile(excelutils.getCellData(8, 9));
	enablegst();
	enabletds();
	txtclienttan.clear();
	clienttan(excelutils.getCellData(8, 3));
	txtclientpan.clear();
	clientpan(excelutils.getCellData(8, 4));
	Clientsave();
	verifyclientupdatenotification();
}
public void checkclientvalidattion()
{
	action.moveToElement(entity1click).perform();
	entity1();
	logger.info("Saral pro entity opened");
	addclient();
	enablegst();
	enabletds();
	enablebranch();
	enableincometax();
	Clientsave();
	readconfig.ismandatory(txtclientmobile);
	readconfig.ismandatory(txtclientgstin);
	readconfig.ismandatory(dropdownclientstate);
	readconfig.ismandatory(txtclienttan);
	readconfig.ismandatory(txtclientpan);
	readconfig.ismandatory(txtclientfilename);
}
public void editentityone()
{
	action.moveToElement(entity1click).perform();
	entity1();
	List<WebElement> txt=driver.findElements(By.cssSelector("#entity-name"));
	String beforexpath ="//table/tr[";    
	String afterxpath = "]/td/div/div[1]/span";
	for(int i=1;i<=txt.size();i++)
	{
		String actualxpath=beforexpath+i+afterxpath;
		WebElement element = driver.findElement(By.xpath(actualxpath));
		WebElement tx= driver.findElement(By.id("Saral_Pro"));
		if(element.getText().equals("Saral_Pro"))
		{
			j=i-1;
			WebElement edit=driver.findElement(By.xpath("//button[@id='Entitycard-entity-edit-icon-"+j+"']//parent::div"));
			action.moveToElement(tx).perform();
			edit.click();
	txtcompanyname.clear();
	companyname(excelutils.getCellData(3, 0));
	txtaddress.clear();
	companyaddress(excelutils.getCellData(3, 1));
	txtplace.clear();
	companyplace(excelutils.getCellData(1, 2));
	txtpin.clear();
	companypincode(excelutils.getCellData(3, 4));
	txtgstin.clear();
	companygstin(excelutils.getCellData(3, 5));
	txtemailid.clear();
	companyemailid(excelutils.getCellData(1, 6));
	txtmobile.clear();
	companymobile(excelutils.getCellData(3, 7));
	logger.info("Entered all fields");
	Entitysave();
	verifyEntitysavenotification();	
		}}
}
public void checkentityvalidation() throws IOException
{
	logger.info("Home page is opened");
	newentityclick();
	companypincode(excelutils.getCellData(14, 0));
	companygstin(excelutils.getCellData(14, 0));
	companyemailid(excelutils.getCellData(14, 0));
	companymobile(excelutils.getCellData(14, 0));
	Entitysave();
	readconfig.ismandatory(txtmobile);
	readconfig.ismandatory(txtemailid);
	readconfig.ismandatory(txtgstin);
	readconfig.ismandatory(txtpin);
}
public void deleteentityone()
{
	action.moveToElement(entity2click).perform();
	entity2();
	List<WebElement> txt=driver.findElements(By.cssSelector("#entity-name"));
	String beforexpath ="//table/tr[";    
	String afterxpath = "]/td/div/div[1]/span";
	for(int i=1;i<=txt.size();i++)
	{
		String actualxpath=beforexpath+i+afterxpath;
		WebElement element = driver.findElement(By.xpath(actualxpath));
		WebElement tx= driver.findElement(By.id("Saral_Gst"));
		if(element.getText().equals("Saral_Gst"))
		{
			j=i-1;
			WebElement edit=driver.findElement(By.xpath("//button[@id='Entitycard-entity-delete-icon-"+j+"']//parent::div"));
			action.moveToElement(tx).perform();
	edit.click();
	deleteentityconfirm();
	verifydeleteentitynotification();
		}}
}
public void deleteentityagain()
{
	action.moveToElement(editedentity).perform();
	hovereditedentity();
	List<WebElement> txt=driver.findElements(By.cssSelector("#entity-name"));
	String beforexpath ="//table/tr[";    
	String afterxpath = "]/td/div/div[1]/span";
	for(int i=1;i<=txt.size();i++)
	{
		String actualxpath=beforexpath+i+afterxpath;
		WebElement element = driver.findElement(By.xpath(actualxpath));
		WebElement tx= driver.findElement(By.id("Saral_ProSaral_Incometax"));
		if(element.getText().equals("Saral_ProSaral_Incometax"))
		{
			j=i-1;
			WebElement edit=driver.findElement(By.xpath("//button[@id='Entitycard-entity-delete-icon-"+j+"']//parent::div"));
			action.moveToElement(tx).perform();
	deleteentitytwo();
	deleteentityconfirm();
	verifydeleteentitynotification();
}}}
public void syso()
{
	List<WebElement> txt=driver.findElements(By.cssSelector("#entity-name"));
	String beforexpath ="//table/tr[";    
	String afterxpath = "]/td/div/div[1]/span";
	for(int i=1;i<=txt.size();i++)
	{
		String actualxpath=beforexpath+i+afterxpath;
		WebElement element = driver.findElement(By.xpath(actualxpath));
		WebElement tx= driver.findElement(By.id("AJANTA PRINT ARTS"));
		if(element.getText().equals("AJANTA PRINT ARTS"))
		{
			j=i-1;
			WebElement edit=driver.findElement(By.xpath("//button[@id='Entitycard-entity-edit-icon-"+j+"']//parent::div"));
			action.moveToElement(tx).perform();
			edit.click();
			break;
		}
	}
	System.out.println(j);
}

}

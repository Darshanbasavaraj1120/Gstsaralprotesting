package pro.saral.pageObject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pro.saral.testCases.BaseClass;
import pro.saral.utilities.ReadConfig;
import pro.saral.utilities.XLUtils;
import pro.saral.utilities.ReadConfig.Constants;

public class Tds_Stepper extends BaseClass {
	
	WebDriver idriver;
	ReadConfig readconfig=new ReadConfig();
	static XLUtils excelutils= new XLUtils();
	static String deductorexcelfilepath=Constants.Deductor_File_Path;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	int j=0;
	public Tds_Stepper(WebDriver rdriver) throws IOException
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		excelutils.EntityExcel(deductorexcelfilepath, "Deductor");
	}
	@FindBy(id="Entitycard-entity-add")
	@CacheLookup
	WebElement addentity;
	
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
	
	@FindBy(id="Saral_Pro_Test")
	@CacheLookup
	WebElement entity1click;
	
	@FindBy(id="clientListCard-SavedClientNotification")
	@CacheLookup
	WebElement clientsavenotification;
	
	@FindBy(xpath="(//div[@class='badge Ripple-parent badge-primary onClick DashboardStyles__module_enabled_tds___3qDL4'])[1]")
	@CacheLookup
	WebElement TDS;
	
	@FindBy(xpath="(//div[@class='badge Ripple-parent badge-primary onClick DashboardStyles__module_enabled_tds___3qDL4'])[2]")
	@CacheLookup
	WebElement TDSImport;
	
	@FindBy(xpath="//span[contains(text(),'Go To Manual Entry')]//parent::button")
	@CacheLookup
	WebElement skipbutton;
	
	@FindBy(xpath="//span[contains(text(),'Copy Address From DeductorDetails')]/parent::div")
	@CacheLookup
	WebElement copyaddressfromdeductor;
	
	@FindBy(xpath="//label[contains(text(),\"Responsible Person's Details\")]")
	@CacheLookup
	WebElement tabresponsibleperson;
	
	
	@FindBy(id="txttanOfDeductor")
	@CacheLookup
	WebElement txtdeductortan;
	
	@FindBy(id="ddldeductorState")
	@CacheLookup
	WebElement dropdowndeductorstatus;
	
	@FindBy(id="ddldeductorType")
	@CacheLookup
	WebElement dropdowndeductortype;
	
	@FindBy(id="txtpanOfDeductor")
	@CacheLookup
	WebElement txtdeductorpan;
	
	@FindBy(id="txtnameOfDeductor")
	@CacheLookup
	WebElement txtdeductorname;
	
	@FindBy(id="txtbranchDivision")
	@CacheLookup
	WebElement txtdeductorbranch;
	
	@FindBy(id="txtdeductorAddress1")
	@CacheLookup
	WebElement txtdeductoraddress1;
	
	@FindBy(id="txtdeductorAddress2")
	@CacheLookup
	WebElement txtdeductoraddress2;
	
	@FindBy(id="txtdeductorAddress3")
	@CacheLookup
	WebElement txtdeductoraddress3;
	
	@FindBy(id="txtdeductorAddress4")
	@CacheLookup
	WebElement txtdeductoraddress4;
	
	@FindBy(id="txtdeductorAddress5")
	@CacheLookup
	WebElement txtdeductoraddress5;
	
	@FindBy(id="ddldeductorState")
	@CacheLookup
	WebElement dropdowndeductorstate;
	
	@FindBy(id="txtdeductorPincode")
	@CacheLookup
	WebElement txtdeductorpincode;
	
	@FindBy(id="txtdeductorPhoneno")
	@CacheLookup
	WebElement txtdeductorphoneno;
	
	@FindBy(id="txtdeductorPhoneAlt")
	@CacheLookup
	WebElement txtdeductoraltphoneno;
	
	@FindBy(id="txtdeductorEmailid")
	@CacheLookup
	WebElement txtdeductoremail;
	
	@FindBy(id="txtdeductorEmailidAlt")
	@CacheLookup
	WebElement txtdeductoraltemailid;
	
	@FindBy(id="txtgstn")
	@CacheLookup
	WebElement txtdeductorgstin;
	
	@FindBy(id="r-deductor-submit-btn")
	@CacheLookup
	WebElement btnsavedeductor;
	
	@FindBy(xpath="(//button[@class='btn2 button2 btn-primary btn-sm Ripple-parent'])[9]")
	@CacheLookup
	WebElement panvalidationyes;
	
	@FindBy(xpath="(//button[@class='btn2 button2 btn-close btn-sm Ripple-parent'])[4]")
	@CacheLookup
	WebElement panvalidationno;
	
	
	@FindBy(id="txtpanOfResponsiblePerson")
	@CacheLookup
	WebElement txtrppan;
	
	@FindBy(id="txtnamePersonResponsible")
	@CacheLookup
	WebElement txtrpname;
	
	@FindBy(id="txtdesignationPersonResponsible")
	@CacheLookup
	WebElement txtrpdesignation;
	
	@FindBy(id="txtpersonFatherName")
	@CacheLookup
	WebElement txtrpfathername;
	
	@FindBy(id="txtpersonAddress1")
	@CacheLookup
	WebElement txtrpaddress1;
	
	@FindBy(id="txtpersonAddress2")
	@CacheLookup
	WebElement txtrpaddress2;
	
	@FindBy(id="txtpersonAddress3")
	@CacheLookup
	WebElement txtrpaddress3;
	
	@FindBy(id="txtpersonAddress4")
	@CacheLookup
	WebElement txtrpaddress4;
	
	@FindBy(id="txtpersonAddress5")
	@CacheLookup
	WebElement txtrpaddress5;
	
	@FindBy(id="ddlpersonState")
	@CacheLookup
	WebElement dropdownrpstate;
	
	@FindBy(id="txtpersonPincode")
	@CacheLookup
	WebElement txtrppincode;
	
	@FindBy(id="txtpersonPhone")
	@CacheLookup
	WebElement txtrpphone;
	
	@FindBy(id="txtpersonPhoneAlt")
	@CacheLookup
	WebElement txtrpphonealt;
	
	@FindBy(id="txtpersonEmailid")
	@CacheLookup
	WebElement txtrpemail;
	
	@FindBy(id="txtpersonEmailidAlt")
	@CacheLookup
	WebElement txtrpaltemail;
	
	@FindBy(id="txtmobileNumber")
	@CacheLookup
	WebElement txtrpmobile;
	
	@FindBy(id="r-deductor-submit-btn")
	@CacheLookup
	WebElement rpsave;
	
	
	@FindBy(id="Employee")
	@CacheLookup
	WebElement employee;

	@FindBy(xpath="//label[@for='checkboxSettings-27Q']")
	@CacheLookup
	WebElement checkbox1;
	
	@FindBy(xpath="//label[@for='checkboxSettings-27EQ']")
	@CacheLookup
	WebElement checkbox2;
	
	@FindBy(xpath="//button[@id='optSave']")
	@CacheLookup
	WebElement formselectionsave;
	
	@FindBy(xpath="//a[contains(text(),'active')][1]")
	@CacheLookup
	WebElement activetab;
	
	@FindBy(id="activeClients-delete-badge-0")
	@CacheLookup
	WebElement deleteclient;
	
	@FindBy(id="active-btn-yes")
	@CacheLookup
	WebElement deleteconfirm;
	
	@FindBy(id="activeClients-deletBranchSuccessNotification")
	@CacheLookup
	WebElement clientdeletenotification;
	
	@FindBy(xpath="(//button[@id='import-button'])[1]")
	@CacheLookup
	WebElement importbutton;
	
	@FindBy(id="compDragDrop")
	@CacheLookup
	WebElement draganddrop;
	
	@FindBy(id="file")
	@CacheLookup
	WebElement uploadfile;
	
	@FindBy(xpath="(//button[@class='btn2 button2 btn-primary Ripple-parent'])[1]")
	@CacheLookup
	WebElement uploadbutton;
	
	@FindBy(xpath="(//button[@class='btn2 button2 btn-close Ripple-parent'])[1]")
	@CacheLookup
	WebElement clearbutton;
	
	@FindBy(xpath="//div[contains(text(),'Add a valid .XLSX file / multiple files not allowed')]")
	@CacheLookup
	WebElement addvalidfileerror;
	
	@FindBy(xpath="//button[@id='Entitycard-entity-delete-icon-16']")
	@CacheLookup
	WebElement deleteentity;
	
	@FindBy(id="auditor-btn-yes")
	@CacheLookup
	WebElement deleteentityconfirm;
	
	@FindBy(id="entityCard-deletesuccessNotification")
	@CacheLookup
	WebElement deleteentitynotification;
	
	@FindBy(xpath="(//div[@id='StatusScreen-view-error'])[1]")
	@CacheLookup
	WebElement viewerror;
	
	@FindBy(xpath="//label[contains(text(),'Deductor Details')]")
	@CacheLookup
	WebElement deductortab;
	
	public void createnewentityclick()
	{
		addentity.click();
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
	public void companypincode(String companypincode)
	{
		txtpin.sendKeys(companypincode);
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
	public boolean verifyclientsavenotification()
	{
		return clientsavenotification.isDisplayed();
	}
	public void tdsclick()
	{
		TDS.click();
	}
	public void tdsimportclick()
	{
		TDSImport.click();
	}
	public void clickskipbutton()
	{
		skipbutton.click();
	}
	public void copyaddress()
	{
		copyaddressfromdeductor.click();
	}
	public void deductortan(String tan)
	{
		txtdeductortan.sendKeys(tan);
	}
	public void deductorstatus(String status)
	{
		Select statedropdown = new Select(dropdowndeductorstatus);
		statedropdown.selectByVisibleText(status);
	}
	public void deductortype(String deductortype)
	{
		Select statedropdown = new Select(dropdowndeductortype);
		statedropdown.selectByVisibleText(deductortype);
	}
	public void deductorpan(String pan)
	{
		txtdeductorpan.sendKeys(pan);
	}
	public void deductorname(String name)
	{
		txtdeductorname.sendKeys(name);
	}
	public void deductorbranch(String branch)
	{
		txtdeductorbranch.sendKeys(branch);
	}
	public void deductoraddress1(String address1)
	{
		txtdeductoraddress1.sendKeys(address1);
	}
	public void deductoraddress2(String address2)
	{
		txtdeductoraddress2.sendKeys(address2);
	}
	public void deductoraddress3(String address3)
	{
		txtdeductoraddress3.sendKeys(address3);
	}
	public void deductoraddress4(String address4)
	{
		txtdeductoraddress4.sendKeys(address4);
	}
	public void deductoraddress5(String address5)
	{
		txtdeductoraddress5.sendKeys(address5);
	}
	public void deductorstate(String deductorstate)
	{
		Select statedropdown = new Select(dropdowndeductorstate);
		statedropdown.selectByVisibleText(deductorstate);
	}
	public void deductorpincode(String pincode)
	{
		txtdeductorpincode.sendKeys(pincode);
	}
	public void deductorphone(String phone)
	{
		txtdeductorphoneno.sendKeys(phone);
	}
	public void deductoraltphone(String altphone)
	{
		txtdeductoraltphoneno.sendKeys(altphone);
	}
	public void deductoremail(String email)
	{
		txtdeductoremail.sendKeys(email);
	}
	public void deductoraltemail(String altemail)
	{
		txtdeductoraltemailid.sendKeys(altemail);
	}
	public void deductorgstin(String gstin)
	{
		txtdeductorgstin.sendKeys(gstin);
	}
	public void deductorsave()
	{
		btnsavedeductor.click();
	}
	public void clickresponsibleperson()
	{
		tabresponsibleperson.click();
	}
	public void rppan(String pan)
	{
		txtrppan.sendKeys(pan);
	}
	public void rpname(String name)
	{
		txtrpname.sendKeys(name);
	}
	public void rpdesignation(String designation)
	{
		txtrpdesignation.sendKeys(designation);
	}
	public void rpaddress1
	(String address1)
	{
		txtrpaddress1.sendKeys(address1);
	}
	public void rpcity(String city)
	{
		txtrpaddress5.sendKeys(city);
	}
	public void rpstate(String state)
	{
		dropdownrpstate.sendKeys(state);
	}
	public void rppincode(String pincode)
	{
		txtrppincode.sendKeys(pincode);
	}
	public void rpemail(String email)
	{
		txtrpemail.sendKeys(email);
	}
	public void rpmobile(String mobile)
	{
		txtrpmobile.sendKeys(mobile);
	}
	public void employeevisible()
	{
		employee.isDisplayed();
	}
	public void select27Q()
	{
		checkbox1.click();
	}
	public void select27EQ()
	{
		checkbox2.click();
	}
	public void clickonformssave()
	{
		formselectionsave.click();
	}
	public void clickonactivetab()
	{
		activetab.click();
	}
	public void clickondeleteclient()
	{
		deleteclient.click();
	}
	public void clickondeleteconfirm()
	{
		deleteconfirm.click();
	}
	public void verifyclientdelete()
	{
		clientdeletenotification.isDisplayed();
	}
	public void clickimportbutton()
	{
		importbutton.click();
	}
	public void clickdraganddrop()
	{
		draganddrop.click();
	}
	public void uploadfilepath() throws IOException
	{

		String absolute = new File(readconfig.Steppervalidexcel()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void clickonuploadbutton()
	{
		uploadbutton.click();
	}
	public void clickonclearbutton()
	{
		clearbutton.click();
	}
	public void verifyvalidfile()
	{
		addvalidfileerror.isDisplayed();
	}
	public void deleteentityclick()
	{
		deleteentity.click();
	}
	public void deleteentityconfirmclick()
	{
		deleteentityconfirm.click();
	}
	public void verifydeleteentitynotification()
	{
		deleteentitynotification.isDisplayed();
	}
	public void viewerrorclick()
	{
		viewerror.click();
	}
	public void panvalidationyesclick()
	{
		panvalidationyes.click();
	}
	public void panvalidationnoclick()
	{
		panvalidationno.click();
	}
	public void uploadinvalidfilepath() throws IOException
	{

		String absolute = new File(readconfig.Stepperinvalidexcel()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void create_new_entity() throws IOException, InterruptedException
	{
		logger.info("Home page is opened");
		createnewentityclick();
		companyname(excelutils.getCellData(1, 0));
		companyaddress(excelutils.getCellData(1, 1));
		companyplace(excelutils.getCellData(1, 2));
		companystate(excelutils.getCellData(1, 3));
		companypincode(excelutils.getCellData(1, 4));
		companygstin(excelutils.getCellData(1, 5));
		companyemailid(excelutils.getCellData(1, 6));
		companymobile(excelutils.getCellData(1, 7));
		Entitysave();	
		verifyEntitysavenotification();
		logger.info("Entity Created");
	}
	public void create_new_client()
	{
		logger.info("Home page is opened");
		action.moveToElement(entity1click).perform();
		entity1();
		addclient();
		clientfilename(excelutils.getCellData(11, 0));
		clientlegalname(excelutils.getCellData(11, 1));
		clientemailid(excelutils.getCellData(11, 5));
		clientaddress(excelutils.getCellData(11, 6));
		clientcity(excelutils.getCellData(11, 7));
		clientstate(excelutils.getCellData(11, 8));
		clientmobile(excelutils.getCellData(11, 9));
		enabletds();
		clienttan(excelutils.getCellData(11, 3));
		Clientsave();
		verifyclientsavenotification();
		logger.info("CLient created");
	}
	public void create_new_client_again()
	{
		logger.info("Home page is opened");
		action.moveToElement(entity1click).perform();
		entity1();
		addclient();
		clientfilename(excelutils.getCellData(13, 0));
		clientlegalname(excelutils.getCellData(11, 1));
		clientemailid(excelutils.getCellData(11, 5));
		clientaddress(excelutils.getCellData(11, 6));
		clientcity(excelutils.getCellData(11, 7));
		clientstate(excelutils.getCellData(11, 8));
		clientmobile(excelutils.getCellData(11, 9));
		enabletds();
		clienttan(excelutils.getCellData(11, 3));
		Clientsave();
		verifyclientsavenotification();
		logger.info("CLient created");
	}
	public void deductor_and_rsponsible_person_mandatory_fields_check() throws InterruptedException
	{
		action.moveToElement(entity1click).perform();
		entity1();
		tdsclick();
		clickskipbutton();
		deductorsave();
		readconfig.ismandatory(dropdowndeductortype);
		readconfig.ismandatory(txtdeductorpan);
		readconfig.ismandatory(txtdeductorname);
		readconfig.ismandatory(txtdeductorbranch);
		readconfig.ismandatory(txtdeductoraddress1);
		readconfig.ismandatory(txtdeductoraddress5);
		readconfig.ismandatory(dropdowndeductorstate);
		readconfig.ismandatory(txtdeductorpincode);
		clickresponsibleperson();
		deductorsave();
		clickresponsibleperson();
		readconfig.ismandatory(txtrppan);
		readconfig.ismandatory(txtrpname);
		readconfig.ismandatory(txtrpdesignation);
		readconfig.ismandatory(txtrpaddress1);
		readconfig.ismandatory(txtrpaddress5);
		readconfig.ismandatory(dropdownrpstate);
		readconfig.ismandatory(txtrppincode);
		readconfig.ismandatory(txtrpaddress1);
		readconfig.ismandatory(txtrpmobile);
	}
	public void enter_all_deductor_and_responsible_person_fields() throws InterruptedException
	{
		action.moveToElement(entity1click).perform();
		entity1();
		tdsclick();
		clickskipbutton();
		deductortype(excelutils.getCellData(20, 2));
		deductorpan(excelutils.getCellData(20, 3));
		deductorname(excelutils.getCellData(20, 4));
		deductorbranch(excelutils.getCellData(20, 5));
		deductoraddress1(excelutils.getCellData(20, 6));
		deductoraddress2(excelutils.getCellData(20, 7));
		deductoraddress3(excelutils.getCellData(20, 8));
		deductoraddress4(excelutils.getCellData(20, 9));
		deductoraddress5(excelutils.getCellData(20, 10));
		deductorstate(excelutils.getCellData(20, 11));
		deductorpincode(excelutils.getCellData(20, 12));
		deductorphone(excelutils.getCellData(20, 13));
		deductoraltphone(excelutils.getCellData(20, 14));
		deductoremail(excelutils.getCellData(20, 15));
		deductoraltemail(excelutils.getCellData(20, 16));
		deductorgstin(excelutils.getCellData(20, 17));	
		deductorsave();
		copyaddress();
		rppan(excelutils.getCellData(30, 0));
		rpname(excelutils.getCellData(30, 1));
		rpdesignation(excelutils.getCellData(30, 2));
		rpaddress1(excelutils.getCellData(30, 4));
		rpcity(excelutils.getCellData(30, 8));
		rpstate(excelutils.getCellData(30, 9));
		rppincode(excelutils.getCellData(30, 10));
		rpemail(excelutils.getCellData(30, 13));
		rpmobile(excelutils.getCellData(30, 15));
		deductorsave();
		panvalidationyesclick();
		select27Q();
		select27EQ();
		clickonformssave();
		employeevisible();
	}
	public void delete_client() throws InterruptedException
	{
		action.moveToElement(entity1click).perform();
		entity1();
		clickonactivetab();
		clickondeleteclient();
		clickondeleteconfirm();
		verifyclientdelete();
	}
	public void import_excel() throws InterruptedException, IOException
	{
		action.moveToElement(entity1click).perform();
		entity1();
		tdsimportclick();
		clickimportbutton();
		uploadfilepath();
		clickonclearbutton();
		uploadfilepath();
		clickonuploadbutton();
		Thread.sleep(10000);
		employeevisible();
	}
	public void import_file_without_excel() throws InterruptedException, IOException
	{
		action.moveToElement(entity1click).perform();
		entity1();
		tdsimportclick();
		clickimportbutton();
		Thread.sleep(10000);
		clickonuploadbutton();
		verifyvalidfile();
	}
	public void invalidfile() throws IOException, InterruptedException
	{
		action.moveToElement(entity1click).perform();
		entity1();
		tdsimportclick();
		clickimportbutton();
		uploadinvalidfilepath();
		clickonuploadbutton();
		Thread.sleep(50000);
		viewerrorclick();
	}
	public void delete_entity() throws InterruptedException, IOException
	{
		action.moveToElement(entity1click).perform();
		entity1();
		deleteentityclick();
		deleteentityconfirmclick();
		verifydeleteentitynotification();
	}
}

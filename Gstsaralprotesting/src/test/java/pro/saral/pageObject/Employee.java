package pro.saral.pageObject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pro.saral.testCases.BaseClass;
import pro.saral.utilities.ReadConfig;
import pro.saral.utilities.XLUtils;
import pro.saral.utilities.ReadConfig.Constants;

public class Employee extends BaseClass {
	
	WebDriver idriver;
	ReadConfig readconfig=new ReadConfig();
	static XLUtils excelutils= new XLUtils();
	static String deductorexcelfilepath=Constants.Deductor_File_Path;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	int j=0;
	String FileName="EmployeeMasterExport.xlsx";
	public Employee(WebDriver rdriver) throws IOException
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		excelutils.EntityExcel(deductorexcelfilepath, "Entity");
	}
	@FindBy(id="Saral_Pro_Test")
	@CacheLookup
	WebElement entity;
	
	@FindBy(xpath="//div[contains(text(),'TDS_Automation_Client')]//parent::td/following-sibling::td//div[@class='badge Ripple-parent badge-primary onClick UuEyZjBoE0hpryrFjVfn']")
	@CacheLookup
	WebElement client;
	
	@FindBy(xpath="//a[@href='/tds/employee']")
	@CacheLookup
	WebElement tabemployee;
	
	@FindBy(xpath="//input[@id='btn-deleteIcon-EmpTable-0']//parent::div")
	@CacheLookup
	WebElement checkboxone;
	
	@FindBy(xpath="//input[@id='Emp-Ded-DelBulk']//parent::div")
	@CacheLookup
	WebElement checkboxall;
	
	@FindBy(xpath="//button[contains(text(),'25')]")
	@CacheLookup
	WebElement paginationmax;

	@FindBy(id="btn-addIcon-empDedMaster")
	@CacheLookup
	WebElement employeeadd;
	
	@FindBy(id="txt-name-emp")
	@CacheLookup
	WebElement txtempname;
	
	@FindBy(xpath="(//input[@name='pan'])[2]")
	@CacheLookup
	WebElement txtemppan;
	
	@FindBy(id="rDatePickerId-dtf-employmentFrom-emp")
	@CacheLookup
	WebElement txtempfromdate;
	
	@FindBy(id="txt-designation-emp")
	@CacheLookup
	WebElement txtempdesignation;
	
	@FindBy(id="txt-panRefNo-deductee")
	@CacheLookup
	WebElement txtemprefno;
	
	@FindBy(id="txt-address-emp")
	@CacheLookup
	WebElement txtempaddress;
	
	@FindBy(id="rDatePickerId-dtf-employmentTo-emp")
	@CacheLookup
	WebElement txtemptodate;
	
	@FindBy(id="ddl-taxCategory-emp")
	@CacheLookup
	WebElement txtempcategory;
	
	@FindBy(id="txt-emailId")
	@CacheLookup
	WebElement txtempemailid;
	
	@FindBy(id="btn-ModalSaveUpdate-emp")
	@CacheLookup
	WebElement btnempsave;
	
	@FindBy(xpath="//span[contains(text(),'First 5 are character, next 4 are digits and last ')]")
	@CacheLookup
	WebElement panvalidation;
	
	@FindBy(xpath="//span[contains(text(),'Invalid date')]")
	@CacheLookup
	WebElement datevalidation;
	
	@FindBy(xpath="//div[@class='toast show']")
	@CacheLookup
	WebElement empsavenotification;
	
	@FindBy(xpath="//div[contains(text(),'PAN Number Already Exists.')]")
	@CacheLookup
	WebElement empduplicatesavenotification;
	
	@FindBy(id="btn-editIcon-EmpTable-2")
	@CacheLookup
	WebElement btnedit;
	
	@FindBy(id="btn-editIcon-EmpTable-0")
	@CacheLookup
	WebElement btneditprod;
	
	@FindBy(id="Del-Emp-Ded")
	@CacheLookup
	WebElement btnddelete;
	
	@FindBy(id="btn-ModalSaveUpdate-emp")
	@CacheLookup
	WebElement btnupdate;
	
	@FindBy(xpath="//button[@class='btn2 button2 btn-danger btn-sm Ripple-parent']")
	@CacheLookup
	WebElement deleteconfirm;
	
	@FindBy(id="EmpDeductee-excel")
	@CacheLookup
	WebElement employeeexcel;
	
	
		public void tabempclick()
	{
		driver.navigate().refresh();
		WebDriverWait wait=new WebDriverWait(idriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Employee")));
		tabemployee.click();
		
	}
	public void clickoncheckboxone()
	{
		checkboxone.click();
	}
	public void employeeexcelclick()
	{
		employeeexcel.click();
	}
	public void clickoncheckboxall()
	{
		checkboxall.click();
	}
	public void clickonpagination()
	{
		paginationmax.click();
	}
	public void empaddclick() throws InterruptedException
	{
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(idriver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("btn-addIcon-empDedMaster"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("btn-addIcon-empDedMaster")))).click();;
	}
	public void copydeducteeno()
	{
		WebDriverWait wait=new WebDriverWait(idriver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//span[contains(text(),'No')])[3]/parent::button"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//span[contains(text(),'No')])[3]/parent::button")))).click();;
	}
	public void entityclick()
	{
		entity.click();
	}
	public void btnempsaveclick()
	{
		btnempsave.click();
	}
	public void clientclick()
	{
		client.click();
	}
	public void entityhover()
	{
	Actions action = new Actions(driver);
	action.moveToElement(entity).perform();
	}
	public void panvalidationcheck()
	{
		panvalidation.isDisplayed();
	}
	public void datevalidationcheck()
	{
		datevalidation.isDisplayed();
	}
	public void empname(String name)
	{
		txtempname.sendKeys(name);
	}
	public void emppan(String pan)
	{
		txtemppan.sendKeys(pan);
	}
	public void empfromdate(String fromdate)
	{	
		txtempfromdate.sendKeys(fromdate);
	}
	public void emptodate(String todate)
	{
		txtemptodate.sendKeys(todate);
	}
	public void empdesignation(String designation)
	{
		txtempdesignation.sendKeys(designation);
	}
	public void emprefno(String refno)
	{
		txtemprefno.sendKeys(refno);
	}
	public void empaddress(String address)
	{
		txtempaddress.sendKeys(address);
	}
	public void empcategory(String category)
	{
		txtempcategory.sendKeys(category);
	}
	public void empemailid(String emailid)
	{
		txtempemailid.sendKeys(emailid);
	}
	public void empsavenotification()
	{
		WebDriverWait wait=new WebDriverWait(idriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Employee")));
		empsavenotification.isEnabled();
	}
	public void empduplicatenotification()
	{
		WebDriverWait wait=new WebDriverWait(idriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Employee")));
		empduplicatesavenotification.isDisplayed();
	}
	public void btneditclick()
	{
		btnedit.click();
	}
	public void btneditclickprod()
	{
		btneditprod.click();
	}
	public void btndeleteclick()
	{
		btnddelete.click();
	}
	public void btnupdateclick()
	{
		btnupdate.click();
	}
	public void btndeleteconfirmlick()
	{
		deleteconfirm.click();
	}

	public void Download_Template() throws IOException, InterruptedException
	{
		logger.info("Clicked on Employee Tab");
		employeeexcelclick();
		Thread.sleep(5000);
		readconfig.isFileDownloaded(FileName);
	}
	public void mandatory_check() throws InterruptedException
	{
		logger.info("Clicked on Employee Tab");
		try {
			copydeducteeno();
		} catch (Exception e) {
		}
		empaddclick();
		btnempsaveclick();
		readconfig.ismandatory(txtempname);
		readconfig.ismandatory(txtemppan);
		readconfig.ismandatory(txtempcategory);	
	}
	public void pan_validation() throws InterruptedException
	{
		try {
			copydeducteeno();
		} catch (Exception e) {
		}
		empaddclick();
		Thread.sleep(2000);
		emppan("HSNH99NH");
		panvalidationcheck();
	}
	public void date_validation() throws InterruptedException
	{
		try {
			copydeducteeno();
		} catch (Exception e) {
		}
		empaddclick();
		Thread.sleep(2000);
		empfromdate("01-04");
		btnempsaveclick();
		datevalidationcheck();
	}
	public void enter_mandatory_fields() throws InterruptedException
	{
		try {
			copydeducteeno();
		} catch (Exception e) {
		}
		empaddclick();
		empname(excelutils.getCellData(41, 0));
		emppan(excelutils.getCellData(41, 1));
		empcategory(excelutils.getCellData(41, 7));
		btnempsaveclick();
		empsavenotification();
	}
	public void enter_all_fields() throws InterruptedException
	{
		try {
			copydeducteeno();
		} catch (Exception e) {
		}
		Thread.sleep(2000);
		empaddclick();
		empname(excelutils.getCellData(40, 0));
		emppan(excelutils.getCellData(40, 1));
		empdesignation(excelutils.getCellData(40, 3));
		emprefno(excelutils.getCellData(40, 4));
		empaddress(excelutils.getCellData(40, 5));
		empcategory(excelutils.getCellData(40, 7));
		empemailid(excelutils.getCellData(40, 8));
		empcategory(excelutils.getCellData(40, 9));
		btnempsaveclick();
		empsavenotification();
	}
	public void enter_all_fields_check_duplication() throws InterruptedException
	{
		empaddclick();
		Thread.sleep(2000);
		emppan(excelutils.getCellData(40, 1));
		empname(excelutils.getCellData(40, 0));
//		empdesignation(excelutils.getCellData(40, 3));
//		emprefno(excelutils.getCellData(40, 4));
//		empaddress(excelutils.getCellData(40, 5));
		empduplicatenotification();

	}
	public void edit_fields()
	{
		try
		{
			btneditclick();
		}
		catch (Exception e) {
			
		}
		try
		{
			btneditclickprod();
		}
		catch (Exception e) {
			
		}
		txtempname.clear();
		empname("-pro");
		btnupdateclick();
		empsavenotification();
	}
	public void delete_single_fields()
	{
		clickoncheckboxone();
		btndeleteclick();
		btndeleteconfirmlick();
		empsavenotification();
	}
	public void delete_all_fields() throws InterruptedException
	{
		Thread.sleep(2000);
		try
		{
			clickonpagination();
		}
		catch (Exception e) {
			
		}
		clickoncheckboxall();
		btndeleteclick();
		btndeleteconfirmlick();
		empsavenotification();
	}
	public void differentpancases() throws InterruptedException
	{
		empaddclick();
		empname(excelutils.getCellData(42, 0));
		emppan(excelutils.getCellData(43, 1));
		empcategory(excelutils.getCellData(41, 7));
		btnempsaveclick();
		empsavenotification();
		empaddclick();
		empname(excelutils.getCellData(42, 0));
		emppan(excelutils.getCellData(44, 1));
		empcategory(excelutils.getCellData(41, 7));
		btnempsaveclick();
		Thread.sleep(8000);
		empaddclick();
		empname(excelutils.getCellData(42, 0));
		emppan(excelutils.getCellData(44, 1));
		empcategory(excelutils.getCellData(41, 7));
		btnempsaveclick();
		
	}
}

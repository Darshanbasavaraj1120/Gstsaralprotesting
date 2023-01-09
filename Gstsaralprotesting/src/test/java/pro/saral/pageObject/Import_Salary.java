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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import freemarker.template.utility.DateUtil.DateToISO8601CalendarFactory;
import pro.saral.testCases.BaseClass;
import pro.saral.utilities.ReadConfig;
import pro.saral.utilities.XLUtils;
import pro.saral.utilities.ReadConfig.Constants;

public class Import_Salary extends BaseClass{
	WebDriver idriver;
	ReadConfig readconfig=new ReadConfig();
	static XLUtils excelutils= new XLUtils();
	static String deductorexcelfilepath=Constants.Deductor_File_Path;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	int j=0;
	String fileName="TDSForm24Q4_2022-23.xlsx";
	String filenamea="BLRL03775C-TDSForm24Q1.xlsx";
	
	public Import_Salary(WebDriver rdriver) throws IOException
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		excelutils.EntityExcel(deductorexcelfilepath, "Entity");
	}
	@FindBy(id="import")
	@CacheLookup
	WebElement importtab;

	@FindBy(xpath="//a[contains(text(),'24Q')]/preceding-sibling::a")
	@CacheLookup
	WebElement tdstab;
	
	@FindBy(id="Employee")
	@CacheLookup
	WebElement employeetab;
	
	@FindBy(id="template-download-button")
	@CacheLookup
	WebElement template;
	
	@FindBy(id="template-download-button")
	@CacheLookup
	WebElement export;
	
	@FindBy(xpath="(//button[@id='import-button'])[1]")
	@CacheLookup
	WebElement excelimportbutton;
	
	@FindBy(xpath="(//button[@id='import-button'])[2]")
	@CacheLookup
	WebElement consoimportbutton;
	
	@FindBy(xpath="(//button[@id='import-button'])[3]")
	@CacheLookup
	WebElement textimportbutton;
	
	@FindBy(xpath="(//button[@id='import-button'])[4]")
	@CacheLookup
	WebElement masterimportbutton;
	
	@FindBy(id="ddl-form2022")
	@CacheLookup
	WebElement fydropdown;
	
	@FindBy(id="ddl-quar1")
	@CacheLookup
	WebElement quarterdropdown;
	
	@FindBy(id="ddl-usr0")
	@CacheLookup
	WebElement typedropdown;
	
	@FindBy(id="compDragDrop")
	@CacheLookup
	WebElement dragdrop;
	
	@FindBy(xpath="//span[contains(text(),'Upload')]//parent::button")
	@CacheLookup
	WebElement uploadbutton;
	
	@FindBy(xpath="(//button[@class='btn2 button2 btn-primary Ripple-parent'])[1]")
	@CacheLookup
	WebElement upload;
	
	@FindBy(id="DrgAndDropClearButton")
	@CacheLookup
	WebElement clearbutton;
	
	@FindBy(xpath="(//button[@class='btn2 button2 btn-close Ripple-parent'])[1]")
	@CacheLookup
	WebElement clear;
	
	
	@FindBy(xpath="//div[contains(text(),'Add a valid .XLSX file / multiple files not allowed')]")
	@CacheLookup
	WebElement emptyfileerror;
	
	@FindBy(xpath="//a[contains(text(),'24Q')]")
	@CacheLookup
	WebElement aQtab;
	
	@FindBy(id="file")
	@CacheLookup
	WebElement uploadfile;
	
	@FindBy(xpath="//div[contains(text(),'Add a valid .XLSX file / multiple files not allowed')]")
	@CacheLookup
	WebElement addvalidfileerror;
	
	@FindBy(xpath="//td[contains(text(),'MOHAMMED ARIFULLAHMAJID TENGA')]")
	@CacheLookup
	WebElement masterdataverify;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/span[contains(text(),'1')]")
	@CacheLookup
	WebElement deductornumber;
	
	@FindBy(xpath="//tbody/tr[2]/td[4]/span[contains(text(),'4')]")
	@CacheLookup
	WebElement challannumber;
	
	@FindBy(xpath="//tbody/tr[2]/td[4]/span[contains(text(),'4')]")
	@CacheLookup
	WebElement textchallannumber;
	
	@FindBy(xpath="//tbody/tr[3]/td[4]/span[contains(text(),'4')]")
	@CacheLookup
	WebElement deductionnumber;
	
	@FindBy(xpath="//tbody/tr[4]/td[4]/span[contains(text(),'4')]")
	@CacheLookup
	WebElement salarynumber;
	
	@FindBy(xpath="//tbody/tr[5]/td[4]/span[contains(text(),'3')]")
	@CacheLookup
	WebElement salarymorenumber;
	
	@FindBy(xpath="//tbody/tr[3]/td[4]/span[contains(text(),'6')]")
	@CacheLookup
	WebElement consodeductionnumber;
	
	@FindBy(xpath="//tbody/tr[3]/td[4]/span[contains(text(),'4')]")
	@CacheLookup
	WebElement textdeductionnumber;
	
	@FindBy(xpath="//tbody/tr[2]/td[4]/span[contains(text(),'2')]")
	@CacheLookup
	WebElement masterdeductionnumber;
	
	@FindBy(xpath="(//div[@id='StatusScreen-badge-status'])[1]")
	@CacheLookup
	WebElement deductorsuccess;
	
	@FindBy(xpath="(//div[@id='StatusScreen-badge-status'])[2]")
	@CacheLookup
	WebElement challansuccess;
	
	@FindBy(xpath="(//div[@id='StatusScreen-badge-status'])[2]")
	@CacheLookup
	WebElement textchallansuccess;
	
	@FindBy(xpath="(//div[@id='StatusScreen-badge-status'])[3]")
	@CacheLookup
	WebElement deductionsuccess;
	
	@FindBy(xpath="(//div[@id='StatusScreen-badge-status'])[4]")
	@CacheLookup
	WebElement salarysuccess;
	
	@FindBy(xpath="(//div[@id='StatusScreen-badge-status'])[5]")
	@CacheLookup
	WebElement salarymoresuccess;
	
	@FindBy(xpath="(//div[@id='StatusScreen-badge-status'])[3]")
	@CacheLookup
	WebElement textdeductionsuccess;
	
	@FindBy(xpath="(//div[@id='StatusScreen-badge-status'])[2]")
	@CacheLookup
	WebElement masterdeductionsuccess;
	
	@FindBy(id="StatusScreen-viewData-button")
	@CacheLookup
	WebElement viewdata;
	
	@FindBy(id="StatusScreen-reupload-button")
	@CacheLookup
	WebElement reupload;
	
	@FindBy(id="StatusScreen-refresh-button")
	@CacheLookup
	WebElement checkstatus;
	
	@FindBy(xpath="//td[contains(text(),'SELVA KUMAR S')]")
	@CacheLookup
	WebElement verifyname;
	
	@FindBy(id="challan")
	@CacheLookup
	WebElement challantab;
	
	@FindBy(id="deduction")
	@CacheLookup
	WebElement deductionab;
	
	@FindBy(id="salary")
	@CacheLookup
	WebElement salarytab;
	
	@FindBy(xpath="(//td[contains(text(),'109000')])[1]")
	@CacheLookup
	WebElement challadataverify;
	
	@FindBy(xpath="//td[contains(text(),'SELVA KUMAR S')]")
	@CacheLookup
	WebElement salarydataverify;
	
	@FindBy(xpath="//tbody/tr[1]/td[5]/span[contains(text(),'2')]")
	@CacheLookup
	WebElement deductorerrorverify;
	
	@FindBy(xpath="//tbody/tr[2]/td[5]/span[contains(text(),'3')]")
	@CacheLookup
	WebElement challanerrorverify;
	
	@FindBy(xpath="//tbody/tr[3]/td[5]/span[contains(text(),'5')]")
	@CacheLookup
	WebElement deductionerrorverify;
	
	@FindBy(xpath="(//div[@id='StatusScreen-view-error'])[1]")
	@CacheLookup
	WebElement viewerror1;
	
	@FindBy(xpath="(//div[@id='StatusScreen-view-error'])[2]")
	@CacheLookup
	WebElement viewerror2;
	
	@FindBy(xpath="(//div[@id='StatusScreen-view-error'])[3]")
	@CacheLookup
	WebElement viewerror3;
	
	@FindBy(xpath="//div[@id='sectionStatusScreen-viewError-badge']")
	@CacheLookup
	WebElement innererror;
	
	@FindBy(xpath="//li[contains(text(),'Pan Of Deductor is missing')]")
	@CacheLookup
	WebElement deductorpanerror;
	
	@FindBy(xpath="//li[contains(text(),'Pincode is invalid')]")
	@CacheLookup
	WebElement deductorpincodeerror;
	
	@FindBy(xpath="(//div[@id='sectionStatusScreen-viewError-badge'])[1]")
	@CacheLookup
	WebElement innererror1;
	
	@FindBy(xpath="(//div[@id='sectionStatusScreen-viewError-badge'])[2]")
	@CacheLookup
	WebElement innererror2;
	
	@FindBy(xpath="(//div[@id='sectionStatusScreen-viewError-badge'])[3]")
	@CacheLookup
	WebElement innererror3;
	
	@FindBy(xpath="(//div[@id='sectionStatusScreen-viewError-badge'])[4]")
	@CacheLookup
	WebElement innererror4;
	
	@FindBy(xpath="(//div[@id='sectionStatusScreen-viewError-badge'])[5]")
	@CacheLookup
	WebElement innererror5;
	
	@FindBy(xpath="(//div[@id='sectionStatusScreen-viewError-badge'])[6]")
	@CacheLookup
	WebElement innererror6;
	
	@FindBy(xpath="(//button[@class='btn2 button2 btn-secondary btn-sm Ripple-parent'])[2]")
	@CacheLookup
	WebElement dataalreadyexist;
	
	@FindBy(xpath="//div[@class='badge Ripple-parent badge-primary onClick']")
	@CacheLookup
	WebElement back;
	
	
	@FindBy(xpath="//li[contains(text(),'Mode of Payment is mandatory')]")
	@CacheLookup
	WebElement modeofpayment;
	
	@FindBy(xpath="//li[contains(text(),'Serial No is missing')]]")
	@CacheLookup
	WebElement serialno;
	
	@FindBy(xpath="//li[contains(text(),'Bank Challan Number is missing')]")
	@CacheLookup
	WebElement bankchallanno;
	
	@FindBy(xpath="//li[contains(text(),'Amount of Tax Paid is missing')]")
	@CacheLookup
	WebElement amountoftaxpaid;
	
//	@FindBy(xpath="//li[contains(text(),"'Date Of Challan Voucher' must not be empty.")]")
//	@CacheLookup
//	WebElement dateofchallan;
	
	@FindBy(xpath="//li[contains(text(),'BSR code is mandatory')]")
	@CacheLookup
	WebElement bsrcode;
	
	@FindBy(xpath="//li[contains(text(),'Section is missing')]")
	@CacheLookup
	WebElement section;
	
	@FindBy(xpath="(//div[@class='rbtn btn-2-0-0 title-bottom'])[2]")
	@CacheLookup
	WebElement close;
	
	@FindBy(xpath="(//button[@class='btn2 button2 btn-secondary btn-sm Ripple-parent'])[2]")
	@CacheLookup
	WebElement exceloverwritewarning;
	
	@FindBy(xpath="(//button[@class='btn2 button2 btn-secondary btn-sm Ripple-parent'])[1]")
	@CacheLookup
	WebElement consooldfileconfirmation;
	
	@FindBy(xpath="(//label[@class='checkbox checkbox-primary'])[1]")
	@CacheLookup
	WebElement checkboxall;
	
	@FindBy(xpath="//button[@class='btn2 button2 btn-danger btn-sm Ripple-parent']")
	@CacheLookup
	WebElement deleteconfirm;
	
	@FindBy(id="Del-Emp-Ded")
	@CacheLookup
	WebElement btnddelete;
	
	@FindBy(xpath="//div[@class='toast show']")
	@CacheLookup
	WebElement empsavenotification;
	
	@FindBy(xpath="(//td[contains(text(),'T.D.SURESH')])[1]")
	@CacheLookup
	WebElement verifytextdata;
	
//	@FindBy(xpath="//div[@id='sectionStatusScreen-viewError-badge']")
//	@CacheLookup
//	WebElement innererror;
	
//	@FindBy(xpath="//div[@id='sectionStatusScreen-viewError-badge']")
//	@CacheLookup
//	WebElement innererror;s
	
//	@FindBy(xpath="//div[@id='sectionStatusScreen-viewError-badge']")
//	@CacheLookup
//	WebElement innererror;
	
//	@FindBy(xpath="//div[@id='sectionStatusScreen-viewError-badge']")
//	@CacheLookup
//	WebElement innererror;
	
	public void clickon24qtab() throws InterruptedException
	{
		Thread.sleep(2000);
		aQtab.click();
	}
	public void clickonimporttab()
	{
		importtab.click();
	}
	public void clickontdstab()
	{
		tdstab.click();
	}
	public void clickonemployeetab()
	{
		employeetab.click();
	}
	public void clickontemplate()
	{
		template.click();
	}
	public void excelimportbuttonclick()
	{
	excelimportbutton.click();
	}
	public void consoimportbuttonclick()
	{
		consoimportbutton.click();
	}
	public void textimportbuttonclick()
	{
		textimportbutton.click();
	}
	public void uploadvalidfilepath() throws IOException
	{

		String absolute = new File(readconfig.aQ4validexcel()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void uploadmasterfilepath() throws IOException
	{

		String absolute = new File(readconfig.masterimport()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void uploaderrorfilepath() throws IOException
	{

		String absolute = new File(readconfig.aq4errorexcel()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void uploadinvalidfilepath() throws IOException
	{

		String absolute = new File(readconfig.invalidexcel()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void uploadvalidconsofilepath() throws IOException
	{

		String absolute = new File(readconfig.validconso()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void uploadvalidtextfilepath() throws IOException
	{

		String absolute = new File(readconfig.validtext()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void uploadbuttonclick()
	{
		if(uploadbutton.isDisplayed()){
			uploadbutton.click();
		}
		else {
			upload.click();
		}
		
	}
	public void verifyvalidfile()
	{
		addvalidfileerror.isDisplayed();
	}
	public void quarter()
	{
		Select statedropdown = new Select(quarterdropdown);
		statedropdown.selectByVisibleText("Q4");
	}
	public void clickonclearbutton()
	{
		clear.click();
	}
	public void deductornumberverify()
	{
		deductornumber.isDisplayed();
	}
	public void challannumberverify()
	{
		challannumber.isDisplayed();
	}
	public void salarynumberverify()
	{
		salarynumber.isDisplayed();
	}
	public void salarymorenumberverify()
	{
		salarymorenumber.isDisplayed();
	}
	public void textchallannumberverify()
	{
		textchallannumber.isDisplayed();
	}
	public void deductionnumberverify()
	{
		deductionnumber.isDisplayed();
	}
	public void consodeductionnumberverify()
	{
		consodeductionnumber.isDisplayed();
	}
	public void textdeductionnumberverify()
	{
		textdeductionnumber.isDisplayed();
	}
	public void masterdeductionsuccessverify()
	{
		masterdeductionsuccess.isDisplayed();
	}
	public void masterdeductionnumberverify()
	{
		masterdeductionnumber.isDisplayed();
	}
	public void deductorsuccessverify()
	{
		deductorsuccess.isDisplayed();
	}
	public void challansuccessverify()
	{
		challansuccess.isDisplayed();
	}
	public void salarysuccessverify()
	{
		salarysuccess.isDisplayed();
	}
	public void salarymoresuccessverify()
	{
		salarymoresuccess.isDisplayed();
	}
	public void textchallansuccessverify()
	{
		textchallansuccess.isDisplayed();
	}
	public void deductionsuccessrverify()
	{
		deductionsuccess.isDisplayed();
	}
	public void textdeductionsuccessrverify()
	{
		textdeductionsuccess.isDisplayed();
	}
	public void modeofpaymenterror()
	{
		modeofpayment.isDisplayed();
	}
	public void serialnoerror()
	{
		serialno.isDisplayed();
	}
	public void bankchallanerror()
	{
		bankchallanno.isDisplayed();
	}
	public void amountoftaxpaiderror()
	{
		amountoftaxpaid.isDisplayed();
	}
//	public void dateofchallanerror()
//	{
//		dateofchallan.isDisplayed();
//	
//	}
	public void bsrcodeerror()
	{
		bsrcode.isDisplayed();
	
	}
	public void sectionerror()
	{
		section.isDisplayed();
	
	}
	public void closeerror()
	{
		close.click();
	
	}
//	public void amountoftaxpaiderror()
//	{
//		amountoftaxpaid.isDisplayed();
//	
//	}
	public void fyyear()
	{
		Select statedropdown = new Select(fydropdown);
		statedropdown.selectByVisibleText("FY 2021-22");
	}
	public void fyyeartext()
	{
		Select statedropdown = new Select(fydropdown);
		statedropdown.selectByVisibleText("FY 2021-22");
	}
	public void verifydata()
	{
		verifyname.isDisplayed();
	}
	public void clickonviewdata()
	{
	viewdata.click();
	}
	public void challantab()
	{
		challantab.click();
	}
	public void deductiontab()
	{
		deductionab.click();
	}
	public void salarytab()
	{
		salarytab.click();
	}
	public void challanverify()
	{
		challadataverify.isDisplayed();
	}
	public void salaryverify()
	{
		salarydataverify.isDisplayed();
	}
	public void deductorerrorverify()
	{
		deductorerrorverify.isDisplayed();
	}
	public void challanerrorverify()
	{
		challanerrorverify.isDisplayed();
	}
	public void deductionerrorverify()
	{
		deductionerrorverify.isDisplayed();
	}
	public void clickaviewerror()
	{
		viewerror1.click();
	}
	public void clickbviewerror()
	{
		viewerror2.click();
	}
	public void clickcviewerror()
	{
		viewerror3.click();
	}
	public void clickonparticularerror()
	{
		innererror.click();
	}
	public void clickonaparticularerror()
	{
		innererror1.click();
	}
	public void clickonbparticularerror()
	{
		innererror2.click();
	}
	public void clickoncparticularerror()
	{
		innererror3.click();
	}
	public void clickondparticularerror()
	{
		innererror4.click();
	}
	public void clickoneparticularerror()
	{
		innererror5.click();
	}
	public void clickonfparticularerror()
	{
		innererror6.click();
	}
	public void deductorpanerrorcheck()
	{
		deductorpanerror.isDisplayed();
	}
	public void deductorpincodeerrorcheck()
	{
		deductorpincodeerror.isDisplayed();
	}
	public void dataalreadyexistclick()
	{
		dataalreadyexist.click();
	}
	public void clickonback()
	{
		back.click();
	}
	public void clickexceloverwritewarning()
	{
		exceloverwritewarning.click();
	}
	public void consooldfileconfirmationclick()
	{
		consooldfileconfirmation.click();
	}
	public void masterdataexist()
	{
		masterdataverify.isDisplayed();
	}
	public void clickoncheckboxall()
	{
		checkboxall.click();
	}
	public void empsavenotification()
	{
		WebDriverWait wait=new WebDriverWait(idriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Employee")));
		empsavenotification.isEnabled();
	}
	public void btndeleteclick()
	{
		btnddelete.click();
	}
	public void btndeleteconfirmlick()
	{
		deleteconfirm.click();
	}
	public void masterimportbuttonclick()
	{
		masterimportbutton.click();
	}
	public void verifytextdata()
	{
		verifytextdata.isDisplayed();
	}
		
		public void Download_Template() throws IOException, InterruptedException
		{
			clickon24qtab();
			quarter();
			clickonimporttab();
			clickontemplate();
			Thread.sleep(5000);
			readconfig.isFileDownloaded(fileName);
		}
		public void check_validation() throws IOException, InterruptedException
		{
			clickon24qtab();
			quarter();
			clickonimporttab();
			excelimportbuttonclick();
			uploadinvalidfilepath();
			String tan=driver.findElement(By.xpath("//div[@class='Small-Body-CopySmall-body-Copy-Bold-Error-Red flex align-items-center mb-1'][1]")).getAttribute("data-error");
			String fy=driver.findElement(By.xpath("//div[@class='Small-Body-CopySmall-body-Copy-Bold-Error-Red flex align-items-center mb-1'][2]")).getAttribute("data-error");
			String quarter=driver.findElement(By.xpath("//div[@class='Small-Body-CopySmall-body-Copy-Bold-Error-Red flex align-items-center mb-1'][3]")).getAttribute("data-error");
			String form=driver.findElement(By.xpath("//div[@class='Small-Body-CopySmall-body-Copy-Bold-Error-Red flex align-items-center mb-1'][4]")).getAttribute("data-error");
			String template=driver.findElement(By.xpath("//div[@class='Small-Body-CopySmall-body-Copy-Bold-Error-Red flex align-items-center mb-1'][5]")).getAttribute("data-error");
			if(tan.contains("true"))
				if(fy.contains("true"))
					if(quarter.contains("true"))
						if(form.contains("true"))
							if(template.contains("true"))
			{
				System.out.println("validation pass");
				System.out.println(tan);
				System.out.println(fy);
				System.out.println(quarter);
				System.out.println(form);
				System.out.println(template);
			}
			else{
				System.out.println("validation fail");
				System.out.println(tan);
				System.out.println(fy);
				System.out.println(quarter);
				System.out.println(form);
				System.out.println(template);
				driver.findElement(By.id("sara")).click();
			}
			System.out.println(tan);
		}
		public void import_file_without_excel() throws InterruptedException, IOException
		{
			clickon24qtab();
			quarter();
			clickonimporttab();
			excelimportbuttonclick();
			Thread.sleep(15000);
			uploadbuttonclick();
			verifyvalidfile();
		}
		public void import_Valid_excel() throws InterruptedException, IOException
		{
			clickon24qtab();
			clickonimporttab();
			excelimportbuttonclick();
			fyyear();
			quarter();
			uploadvalidfilepath();
			Thread.sleep(2000);
			clickonclearbutton();
			uploadvalidfilepath();
			Thread.sleep(2000);
			uploadbuttonclick();
			try {
				clickexceloverwritewarning();
			}
			catch(Exception  e){
			}
			Thread.sleep(15000);
			deductornumberverify();
			deductorsuccessverify();
			challannumberverify();
			challansuccessverify();
			deductionnumberverify();
			deductionsuccessrverify();
			salarynumberverify();
			salarysuccessverify();
			clickonviewdata();
			verifydata();
			challantab();
			challanverify();
			salarytab();
			salaryverify();
			
		}
		public void import_Invalid_excel() throws InterruptedException, IOException
		{
			clickon24qtab();
			clickonimporttab();
			excelimportbuttonclick();
			fyyear();
			quarter();
			uploaderrorfilepath();
			Thread.sleep(2000);
			uploadbuttonclick();
			Thread.sleep(15000);
//			dataalreadyexistclick();
			Thread.sleep(15000);
			clickaviewerror();
			clickonparticularerror();
			deductorpanerrorcheck();
//			closeerror();
//			clickonback();
//			clickbviewerror();
//			clickonparticularerror();
//			modeofpaymenterror();
//			serialnoerror();
//			bankchallanerror();
//			closeerror();
//			amountoftaxpaiderror();
//			closeerror();
//			bsrcodeerror();
//			sectionerror();
		}
		public void import_Valid_conso() throws InterruptedException, IOException
		{
			clickon24qtab();
			clickonimporttab();
			consoimportbuttonclick();
			fyyear();
			uploadvalidconsofilepath();
			Thread.sleep(2000);
			try {
				consooldfileconfirmationclick();
			}
			catch(Exception  e){
			}
			clickonclearbutton();
			uploadvalidconsofilepath();
			Thread.sleep(2000);
			try {
				consooldfileconfirmationclick();
			}
			catch(Exception  e){
			}
			uploadbuttonclick();
			try {
				clickexceloverwritewarning();
			}
			catch(Exception  e){
			}
			Thread.sleep(15000);
			deductornumberverify();
			deductorsuccessverify();
			challannumberverify();
			challansuccessverify();
			consodeductionnumberverify();
			deductionsuccessrverify();
			clickonviewdata();
			verifydata();
			challantab();
			challanverify();
		}
		public void import_Valid_text() throws InterruptedException, IOException
		{
			clickon24qtab();
			clickonimporttab();
			textimportbuttonclick();
			fyyeartext();
			uploadvalidtextfilepath();
			clickonclearbutton();
			Thread.sleep(2000);
			uploadvalidtextfilepath();
			Thread.sleep(2000);
			uploadbuttonclick();
			try {
				clickexceloverwritewarning();
			}
			catch(Exception  e){
			}
			Thread.sleep(15000);
			deductornumberverify();
			deductorsuccessverify();
			textchallannumberverify();
			textchallansuccessverify();
			textdeductionnumberverify();
			textdeductionsuccessrverify();
			clickonviewdata();
			verifytextdata();
		}
		public void import_Master_Excel() throws InterruptedException, IOException
		{
			clickon24qtab();
			Thread.sleep(3000);
			clickontdstab();
			clickonemployeetab();
			masterdataexist();
			clickoncheckboxall();
			btndeleteclick();
			btndeleteconfirmlick();
			empsavenotification();
		}
		
}
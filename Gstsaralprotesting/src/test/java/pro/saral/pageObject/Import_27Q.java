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

import pro.saral.testCases.BaseClass;
import pro.saral.utilities.ReadConfig;
import pro.saral.utilities.XLUtils;
import pro.saral.utilities.ReadConfig.Constants;

public class Import_27Q extends BaseClass{
	WebDriver idriver;
	ReadConfig readconfig=new ReadConfig();
	static XLUtils excelutils= new XLUtils();
	static String deductorexcelfilepath=Constants.Deductor_File_Path;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 40);
	int j=0;
	String fileName="TDSForm27Q_2022-23.xlsx";
	String filenamea="BLRL03775C-TDSForm24Q1.xlsx";
	
	public Import_27Q(WebDriver rdriver) throws IOException
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
	
	@FindBy(id="deductee")
	@CacheLookup
	WebElement deducteetab;
	
	@FindBy(xpath="//button[contains(text(),'25')]")
	@CacheLookup
	WebElement paginationmax;
	
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
	
	@FindBy(xpath="//a[@href='/27q']")
	@CacheLookup
	WebElement bQtab;
	
	@FindBy(id="file")
	@CacheLookup
	WebElement uploadfile;
	
	@FindBy(xpath="//div[contains(text(),'Add a valid .XLSX file / multiple files not allowed')]")
	@CacheLookup
	WebElement addvalidfileerror;
	
	@FindBy(xpath="//td[contains(text(),'Rishabh')]")
	@CacheLookup
	WebElement masterdataverify;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/span[contains(text(),'1')]")
	@CacheLookup
	WebElement deductornumber;
	
	@FindBy(xpath="//tbody/tr[2]/td[4]/span[contains(text(),'1')]")
	@CacheLookup
	WebElement challannumber;

	@FindBy(xpath="//tbody/tr[2]/td[4]/span[contains(text(),'4')]")
	@CacheLookup
	WebElement challannumberexcel;
	
	@FindBy(xpath="//tbody/tr[2]/td[4]/span[contains(text(),'1')]")
	@CacheLookup
	WebElement textchallannumber;
	
	@FindBy(xpath="//tbody/tr[3]/td[4]/span[contains(text(),'1')]")
	@CacheLookup
	WebElement deductionnumber;
	
	@FindBy(xpath="//tbody/tr[3]/td[4]/span[contains(text(),'4')]")
	@CacheLookup
	WebElement deductionnumberexcel;
	
	@FindBy(xpath="//tbody/tr[3]/td[4]/span[contains(text(),'2')]")
	@CacheLookup
	WebElement textdeductionnumber;
	
	@FindBy(xpath="//tbody/tr[2]/td[4]/span[contains(text(),'3')]")
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
	
	@FindBy(xpath="(//div[@id='StatusScreen-badge-status'])[3]")
	@CacheLookup
	WebElement textdeductionsuccess;
	
	@FindBy(xpath="(//div[@id='StatusScreen-badge-status'])[2]")
	@CacheLookup
	WebElement masterdeductionsuccess;
	
	@FindBy(id="StatusScreen-viewData-button")
	@CacheLookup
	WebElement viewdata;
	
	@FindBy(xpath="//span[contains(text(),'Reupload')]//parent::button")
	@CacheLookup
	WebElement reupload;
	
	@FindBy(id="StatusScreen-refresh-button")
	@CacheLookup
	WebElement checkstatus;
	
	@FindBy(xpath="//td[contains(text(),'Sanju')]")
	@CacheLookup
	WebElement verifyname;
	
	@FindBy(xpath="//td[contains(text(),'VIJAYSHREE PANCHTCHARAM')]")
	@CacheLookup
	WebElement verifyconsoname;
	
	@FindBy(id="challan")
	@CacheLookup
	WebElement challantab;
	
	@FindBy(xpath="//td[contains(text(),'22222')]")
	@CacheLookup
	WebElement challadataverify;
	
	@FindBy(xpath="//td[contains(text(),'54830')]")
	@CacheLookup
	WebElement challadataverifytxt;
	
	@FindBy(xpath="(//span[contains(text(),'Delete')]/parent::button)[3]")
	@CacheLookup
	WebElement deleteconfirmdeduction;
	
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
	
	@FindBy(xpath="//li[contains(text(),'State is missing')]")
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
	
	@FindBy(xpath="//td[contains(text(),'MANGALATH MEDI AGS')]")
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
	
	public void clickon26qtab() throws InterruptedException
	{
		Thread.sleep(2000);
		bQtab.click();
	}
	public void clickonimporttab() throws InterruptedException
	{
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
		wait.until(ExpectedConditions.visibilityOf(importtab));
		wait.until(ExpectedConditions.elementToBeClickable(importtab)).click();
	}
	public void clickontdstab()
	{
		tdstab.click();
	}
	public void clickondeducteetab()
	{
		deducteetab.click();
	}
	public void clickpaginationmax()
	{
		paginationmax.click();
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

		String absolute = new File(readconfig.aQvalidexcel()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void uploadvalidbfilepath() throws IOException
	{

		String absolute = new File(readconfig.cQvalidexcel()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void uploadmasterfilepath() throws IOException
	{

		String absolute = new File(readconfig.masterimport27()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void uploaderrorfilepath() throws IOException
	{

		String absolute = new File(readconfig.cerrorexcel()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void uploadinvalidfilepath() throws IOException
	{

		String absolute = new File(readconfig.invalidexcel()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void uploadvalidconsofilepath() throws IOException
	{

		String absolute = new File(readconfig.cvalidconso()).getCanonicalPath();
		
		uploadfile.sendKeys(absolute);
	}
	public void uploadvalidtextfilepath() throws IOException
	{

		String absolute = new File(readconfig.validtext27()).getCanonicalPath();
		
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
	public void challannumberexcelverify()
	{
		challannumberexcel.isDisplayed();
	}
	public void textchallannumberverify()
	{
		textchallannumber.isDisplayed();
	}
	public void deductionnumberverify()
	{
		deductionnumber.isDisplayed();
	}
	public void deductionnumberexcelverify()
	{
		deductionnumberexcel.isDisplayed();
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
		statedropdown.selectByVisibleText("FY 2022-23");
	}
	public void fyyeartext()
	{
		Select statedropdown = new Select(fydropdown);
		statedropdown.selectByVisibleText("FY 2020-21");
	}
	public void fyyearconso()
	{
		Select statedropdown = new Select(fydropdown);
		statedropdown.selectByVisibleText("FY 2021-22");
	}
	public void quarter()
	{
		Select statedropdown = new Select(quarterdropdown);
		statedropdown.selectByVisibleText("Q2");
	}
	public void consoquarter()
	{
		Select statedropdown = new Select(quarterdropdown);
		statedropdown.selectByVisibleText("Q3");
	}
	public void verifydata()
	{
		verifyname.isDisplayed();
	}
	public void verifycosodata()
	{
		verifyconsoname.isDisplayed();
	}
	public void clickonviewdata()
	{
	viewdata.click();
	}
	public void challantab()
	{
		challantab.click();
	}
	public void clickchallancheckbox()
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[@class='check-container'])[1]"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//div[@class='check-container'])[1]")))).click();;
		logger.info("Clicked on element");
	}
	public void btndeleteconfirmdeductionlick()
	{
		deleteconfirmdeduction.click();
	}
	public void clickdeletededuction()
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@id='btn-delete-challan']"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='btn-delete-challan']")))).click();;
		logger.info("Clicked on element");
	}
	public void btndeleteconfirmlick1()
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//button[@class='btn2 button2 btn-danger btn-sm Ripple-parent'])[3]"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//button[@class='btn2 button2 btn-danger btn-sm Ripple-parent'])[3]")))).click();;
		logger.info("Clicked on element");
	}
	public void challanverify()
	{
		challadataverify.isDisplayed();
	}
	public void challanverifytxt()
	{
		challadataverifytxt.isDisplayed();
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
	public void clickreupload() throws InterruptedException
	{
		Thread.sleep(2000);
		reupload.click();
	}
	public void pagerefresh()
	{
		driver.navigate().refresh();
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
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//label[@class='checkbox checkbox-primary'])[1]"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//label[@class='checkbox checkbox-primary'])[1]")))).click();;
		logger.info("Clicked on element");
	}
	public void empsavenotification()
	{
		WebDriverWait wait=new WebDriverWait(idriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Employee")));
		empsavenotification.isEnabled();
	}
	public void btndeleteclick()
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("Del-Emp-Ded"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Del-Emp-Ded")))).click();;
		logger.info("Clicked on element");
	}
	public void btndeleteconfirmlick()
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='btn2 button2 btn-danger btn-sm Ripple-parent']"))));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@class='btn2 button2 btn-danger btn-sm Ripple-parent']")))).click();;
		logger.info("Clicked on element");
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
			clickon26qtab();
			clickonimporttab();
			clickontemplate();
			Thread.sleep(5000);
			readconfig.isFileDownloaded(fileName);
		}
		public void check_validation() throws IOException, InterruptedException
		{
			clickon26qtab();
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
			clickon26qtab();
			clickonimporttab();
			excelimportbuttonclick();
			Thread.sleep(15000);
			uploadbuttonclick();
			verifyvalidfile();
		}
		public void import_Valid_excel() throws InterruptedException, IOException
		{
			clickon26qtab();
			clickonimporttab();
			excelimportbuttonclick();
			fyyear();
			uploadvalidbfilepath();
			Thread.sleep(2000);
			clickonclearbutton();
			uploadvalidbfilepath();
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
			challannumberexcelverify();
			challansuccessverify();
			deductionnumberexcelverify();
			deductionsuccessrverify();
			clickonviewdata();
			verifydata();
			try {
				clickpaginationmax();
			} catch (Exception  e ) {
				// TODO: handle exception
			}
			clickchallancheckbox();
			clickdeletededuction();
			btndeleteconfirmdeductionlick();
			Thread.sleep(2000);
			challantab();
			challanverify();
			clickoncheckboxall();
			clickdeletededuction();
			btndeleteconfirmlick();
			clickontdstab();
			clickondeducteetab();
			try {
				clickpaginationmax();
			} catch (Exception  e ) {
				// TODO: handle exception
			}
			clickchallancheckbox();
			btndeleteclick();
			btndeleteconfirmlick();
			Thread.sleep(3000);
		}
		public void import_Invalid_excel() throws InterruptedException, IOException
		{
			clickon26qtab();
			clickonimporttab();
			excelimportbuttonclick();
			fyyeartext();
			uploaderrorfilepath();
			Thread.sleep(2000);
			uploadbuttonclick();
			try {
				clickexceloverwritewarning();
			}
			catch(Exception  e){
			}
			Thread.sleep(15000);
//			dataalreadyexistclick();
			Thread.sleep(15000);
			clickaviewerror();
			clickonparticularerror();
			deductorpanerrorcheck();
			clickonback();
			clickreupload();
			pagerefresh();
//			deductorpincodeerrorcheck();
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
			clickon26qtab();
			clickonimporttab();
			consoimportbuttonclick();
			fyyeartext();
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
			deductionnumberverify();
			deductionsuccessrverify();
			clickonviewdata();
			verifycosodata();
			try {
				clickpaginationmax();
			} catch (Exception  e ) {
				// TODO: handle exception
			}
			clickchallancheckbox();
			clickdeletededuction();
			btndeleteconfirmdeductionlick();
			Thread.sleep(2000);
			challantab();
			challanverifytxt();
			clickoncheckboxall();
			clickdeletededuction();
			btndeleteconfirmlick();
			clickontdstab();
			clickondeducteetab();
			try {
				clickpaginationmax();
			} catch (Exception  e ) {
				// TODO: handle exception
			}
			clickchallancheckbox();
			btndeleteclick();
			btndeleteconfirmlick();
			Thread.sleep(3000);
		}
		public void import_Valid_text() throws InterruptedException, IOException
		{
			clickon26qtab();
			clickonimporttab();
			textimportbuttonclick();
			fyyearconso();
			quarter();
			uploadvalidtextfilepath();
			clickonclearbutton();
			Thread.sleep(2000);
			uploadvalidtextfilepath();
			fyyearconso();
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
			clickoncheckboxall();
			clickdeletededuction();
			btndeleteconfirmlick1();
			challantab();
			Thread.sleep(2000);
			clickoncheckboxall();
			clickdeletededuction();
			btndeleteconfirmlick();
			clickontdstab();
			clickondeducteetab();
			try {
				clickpaginationmax();
			} catch (Exception  e ) {
				// TODO: handle exception
			}
			clickchallancheckbox();
			btndeleteclick();
			btndeleteconfirmlick();
			Thread.sleep(3000);
		}
		public void import_Master_Excel() throws InterruptedException, IOException
		{
			clickon26qtab();
			clickonimporttab();
			masterimportbuttonclick();
			uploadmasterfilepath();
			clickonclearbutton();
			Thread.sleep(2000);
			uploadmasterfilepath();
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
			masterdeductionnumberverify();
			masterdeductionsuccessverify();
			clickonviewdata();
			Thread.sleep(3000);
			clickontdstab();
			clickondeducteetab();
			masterdataexist();
			clickoncheckboxall();
			btndeleteclick();
			btndeleteconfirmlick();
			empsavenotification();
		}
		
}

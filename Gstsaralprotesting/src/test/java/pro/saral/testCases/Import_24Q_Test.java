package pro.saral.testCases;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pro.saral.pageObject.Import_24Q;
import pro.saral.pageObject.Employee;
import pro.saral.pageObject.LoginPage;
import pro.saral.pageObject.Tds_Stepper;
import pro.saral.pageObject.UIOperation;
import pro.saral.utilities.ReadConfig;
import pro.saral.utilities.ReadExcel;
import pro.saral.utilities.ReadObject;
import pro.saral.utilities.XLUtils;
import pro.saral.utilities.ReadConfig.Constants;

public class Import_24Q_Test extends BaseClass{
	
	@BeforeMethod
public void Login_Entry() throws InterruptedException, IOException{
		Employee emp=new Employee(driver);
		LoginPage lp=new LoginPage(driver);
		driver.navigate().to(productdashboardurl);
		Thread.sleep(2000);
		emp.entityhover();
		emp.entityclick();
		emp.clientclick();
		try {
			lp.Exittour();
			logger.info("Exit tour");
		}
		catch(Exception  e){
		}
	}
	@Test(priority=0)
	public void Download_Template_And_Verify() throws IOException, InterruptedException
	{
		Import_24Q imp=new Import_24Q(driver);
		imp.Download_Template();
	}
	@Test(priority=1)
	public void Check_Tan_Validation() throws IOException, InterruptedException
	{
		Import_24Q imp=new Import_24Q(driver);
		imp.check_validation();
	}
	@Test(priority=2)
	public void Click_On_Upload_File_without_Selecting_Excel_File_and_verify_validation() throws IOException, InterruptedException{
		Import_24Q imp=new Import_24Q(driver);
			imp.import_file_without_excel();
		}
	@Test(priority=3)
	public void Upload_Valid_Excel_And_Check_Sucess_Status() throws IOException, InterruptedException{
		Import_24Q imp=new Import_24Q(driver);
			imp.import_Valid_excel();
		}
	@Test(priority=4)
	public void Upload_Invalid_Excel_And_Check_Errors() throws IOException, InterruptedException{
		Import_24Q imp=new Import_24Q(driver);
			imp.import_Invalid_excel();
		}
	@Test(priority=5)
	public void Upload_Valid_Conso_And_Check_Sucess_Status() throws IOException, InterruptedException{
		Import_24Q imp=new Import_24Q(driver);
			imp.import_Valid_conso();
		}
	@Test(priority=6)
	public void Upload_Valid_Text_And_Check_Sucess_Status() throws IOException, InterruptedException{
		Import_24Q imp=new Import_24Q(driver);
			imp.import_Valid_text();
		}
	@Test(priority=7)
	public void Upload_Valid_Master_Excel_And_Check_Sucess_Status() throws IOException, InterruptedException{
		Import_24Q imp=new Import_24Q(driver);
			imp.import_Master_Excel();
		}

}

package pro.saral.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pro.saral.pageObject.Tds_Stepper;

public class Tds_Stepper_Test extends BaseClass {

//	@Test(priority=0)
//	public void Create_Entity() throws IOException, InterruptedException{
//		Tds_Stepper ts=new Tds_Stepper(driver);
//			ts.create_new_entity();
//		}
	@Test(priority=1)
	public void Create_Client() throws IOException, InterruptedException{
		Tds_Stepper ts=new Tds_Stepper(driver);
			ts.create_new_client();
		}
//	@Test(priority=2)
//	public void Check_Mandatory_Fields_In_Deductor_Details_And_Responsible_Person() throws IOException, InterruptedException{
//		Tds_Stepper ts=new Tds_Stepper(driver);
//			ts.deductor_and_rsponsible_person_mandatory_fields_check();
//		}
	@Test(priority=3)
	public void Enter_All_Deductor_And_Responsible_Person_Fields() throws IOException, InterruptedException{
		Tds_Stepper ts=new Tds_Stepper(driver);
			ts.enter_all_deductor_and_responsible_person_fields();
		}
//	@Test(priority=4)
//	public void Delete_Client() throws IOException, InterruptedException{
//		Tds_Stepper ts=new Tds_Stepper(driver);
//			ts.delete_client();
//		}
//	@Test(priority=5)
//	public void Create_Client_For_Import() throws IOException, InterruptedException{
//		Tds_Stepper ts=new Tds_Stepper(driver);
//			ts.create_new_client_again();
//		}
//	@Test(priority=6)
//	public void Upload_File_without_Selecting_Excel_File_and_verify_validation() throws IOException, InterruptedException{
//		Tds_Stepper ts=new Tds_Stepper(driver);
//			ts.import_file_without_excel();
//		}
//	@Test(priority=7)
//	public void Upload_Invalid_File_and_verify_validation() throws IOException, InterruptedException{
//		Tds_Stepper ts=new Tds_Stepper(driver);
//			ts.invalidfile();
//		}
//	@Test(priority=8)
//	public void Excel_Import_In_Stepper() throws IOException, InterruptedException{
//		Tds_Stepper ts=new Tds_Stepper(driver);
//			ts.import_excel();
//		}
//	@Test(priority=9)
//	public void Delete_Client_Again() throws IOException, InterruptedException{
//		Tds_Stepper ts=new Tds_Stepper(driver);
//			ts.delete_client();
//		}
//	@Test(priority=10)
//	public void Delete_Entity() throws IOException, InterruptedException{
//		Tds_Stepper ts=new Tds_Stepper(driver);
//			ts.delete_entity();
//		}
	@BeforeMethod
public void Login_Entry() throws InterruptedException, IOException{
		driver.navigate().to(dashboardurl);
	}

}
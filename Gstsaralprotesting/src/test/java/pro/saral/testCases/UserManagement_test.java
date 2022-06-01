package pro.saral.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pro.saral.pageObject.EntityMaster;
import pro.saral.pageObject.UserManagement;


public class UserManagement_test extends BaseClass {
	@BeforeMethod
public void Login_Entry() throws InterruptedException, IOException{
		driver.navigate().to(dashboardurl);
		UserManagement um=new UserManagement(driver);
		um.hoveronuser();
		um.clickusermanagements();	
//		um.clickusermaster();
	}
//	@Test(priority=0)
//	public void Create_Entity_With_All_Fields_For_User_Master() throws IOException, InterruptedException{
//		EntityMaster em=new EntityMaster(driver);
//			em.create_entity();
//		}
//	@Test(priority=1)
//	public void Check_User_Master_Mandatory_Field() throws IOException{
//		UserManagement um=new UserManagement(driver);
//		um.checkusermandatoryfields();
//	}
	@Test(priority=2)
	public void Enter_User_Master_Mandatory_Field() throws IOException{
		UserManagement um=new UserManagement(driver);
		um.entermandatoryfields();
	}

}

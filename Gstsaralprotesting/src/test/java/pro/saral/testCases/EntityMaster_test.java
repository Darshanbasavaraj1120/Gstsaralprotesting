package pro.saral.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pro.saral.pageObject.EntityMaster;

public class EntityMaster_test extends BaseClass {

	@Test(priority=0)
	public void Check_Mandatory_Fields_In_Entity() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.Check_Entity_Mandatory();
		}
	@Test(priority=1)
	public void Create_Entity_With_All_Fields() throws IOException, InterruptedException{
		EntityMaster em=new EntityMaster(driver);
			em.create_entity();
		}
	@Test(priority=2)
	public void Create_Entity_With_Only_Mandatory_Fields() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.create_new_entity();
		}
	@Test(priority=3)
	public void Create_Duplicate_Entity_With_Only_Mandatory_Fields() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.create_duplicate_entity();
		}
	@Test(priority=4)
	public void Create_Duplicate_Entity_With_All_Required_Field() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.create_duplicate_with_all_entity();
		}
	@Test(priority=5)
	public void Check_Mandatory_Fields_In_Client() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.check_client_mandatory_fields();
		}
	@Test(priority=6)
	public void Enter_Mandatory_Fields_In_Client() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.enter_Client_madatory_fields();
		}
	@Test(priority=7)
	public void Enter_All_Fields_In_Client() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.enter_all_client_fields();
		}
	@Test(priority=8)
	public void Check_Client_Dupication() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.check_client_dupication();
		}
	@Test(priority=9)
	public void Check_Mandatory_Fields_In_Branch() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.check_branch_mandatory_fields();
	}
	@Test(priority=10)
	public void Enter_Mandatory_Fields_In_Branch() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.enter_branch_mandatory_fields();
		}
	@Test(priority=11)
	public void Enter_All_Fields_In_Branch() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.enter_branch_all_fields();
		}
	@Test(priority=12)
	public void Check_validation_All_Fields_In_Branch() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.enter_all_incorrect_branch_fields();
	}
	@Test(priority=13)
	public void Edit_Branch() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.editbranch();
	}
	@Test(priority=14)
	public void Delete_Branch_one() throws IOException, InterruptedException{
		EntityMaster em=new EntityMaster(driver);
			em.deletefirstbranch();

	}
	@Test(priority=15)
	public void Check_Branch_Duplication() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.checkbranchduplication();
	}
	@Test(priority=16)
	public void Delete_Branch_two() throws IOException, InterruptedException{
		EntityMaster em=new EntityMaster(driver);
			em.deletefirstbranch();
	}
	@Test(priority=17)
	public void Delete_Client_One() throws IOException, InterruptedException{
		EntityMaster em=new EntityMaster(driver);
			em.deleteclient();
	}
	@Test(priority=18)
	public void Edit_Client() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.editclient();
	}
	@Test(priority=19)
	public void Delete_Client_Two() throws IOException, InterruptedException{
		EntityMaster em=new EntityMaster(driver);
			em.deleteclient();
	}
	@Test(priority=20)
	public void Verify_Client_Master_Validation() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.checkclientvalidattion();
	}
	@Test(priority=21)
	public void Delete_Entity_One() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.deleteentityone();
	}
	@Test(priority=22)
	public void Edit_Entity() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.editentityone();
	}
	@Test(priority=23)
	public void Check_Entity_Validation() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.checkentityvalidation();
	}
	@Test(priority=24)
	public void Delete_Entity_Two() throws IOException{
		EntityMaster em=new EntityMaster(driver);
			em.deleteentityagain();
	}
	
	@BeforeMethod
public void Login_Entry() throws InterruptedException, IOException{
		driver.navigate().to(dashboardurl);
	}

//	@AfterMethod
//public void Logout() throws InterruptedException, IOException{
//		driver.close();
//	}

}

package pro.saral.testCases;
import java.io.IOException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pro.saral.pageObject.Employee;

public class Employee_Test extends BaseClass{
	@BeforeMethod
public void Login_Entry() throws InterruptedException, IOException{
		driver.navigate().to(dashboardurl);
		Employee emp=new Employee(driver);
		emp.entityhover();
		emp.entityclick();
		emp.clientclick();
		emp.tabempclick();
		driver.navigate().refresh();
		Thread.sleep(3000);
	}
	@Test(priority=0)
	public void Mandatory_Field_Check() throws IOException
	{
		Employee emp=new Employee(driver);
		emp.mandatory_check();
	}
//	@Test(priority=1)
//	public void Enter_Invalid_Pan_And_Check_Validation() throws IOException, InterruptedException
//	{
//		Employee emp=new Employee(driver);
//		emp.pan_validation();
//	}
//	@Test(priority=2)
//	public void Enter_Invalid_Date_And_Check_Validation() throws IOException, InterruptedException
//	{
//		Employee emp=new Employee(driver);
//		emp.date_validation();
//	}
//	@Test(priority=3)
//	public void Enter_Only_Mandatory_Field_And_Check() throws IOException
//	{
//		Employee emp=new Employee(driver);
//		emp.enter_mandatory_fields();
//	}
//	@Test(priority=4)
//	public void Edit_Fields_And_Update() throws IOException
//	{
//		Employee emp=new Employee(driver);
//		emp.edit_fields();	
//	}
//	@Test(priority=5)
//	public void Delete_Single_Fields() throws IOException, InterruptedException
//	{
//		Employee emp=new Employee(driver);
//		emp.delete_single_fields();
//	}
//	@Test(priority=6)
//	public void Enter_All_Field_And_Check() throws IOException
//	{
//		Employee emp=new Employee(driver);
//		emp.enter_all_fields();
//	}
//	@Test(priority=7)
//	public void Enter_All_Field_And_Check_Duplication() throws IOException
//	{
//		Employee emp=new Employee(driver);
//		emp.enter_all_fields_check_duplication();
//	}
//	@Test(priority=8)
//	public void Enter_All_Different_Pan_Cases() throws IOException, InterruptedException
//	{
//		Employee emp=new Employee(driver);
//		emp.differentpancases();
//	}
//	@Test(priority=9)
//	public void Delete_All_Fields() throws IOException, InterruptedException
//	{
//		Employee emp=new Employee(driver);
//		emp.delete_all_fields();
//	}
}

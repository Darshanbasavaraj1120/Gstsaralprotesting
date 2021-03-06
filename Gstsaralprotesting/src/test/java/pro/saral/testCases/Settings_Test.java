package pro.saral.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pro.saral.pageObject.Employee;
import pro.saral.pageObject.Settings;

public class Settings_Test extends BaseClass{

	@BeforeMethod
	public void Login_Entry() throws InterruptedException, IOException{
			driver.navigate().to(dashboardurl);
			Employee emp=new Employee(driver);
			Settings set=new Settings(driver);
			emp.entityhover();
			emp.entityclick();
			emp.clientclick();
		}
		@Test(priority=0)
		public void DeSelect24Q() throws IOException, InterruptedException
		{
			Settings set=new Settings(driver);
			set.verify24Q();
		}
		@Test(priority=1)
		public void Select24Q_AND_DeSelect26Q() throws IOException, InterruptedException
		{
			Settings set=new Settings(driver);
			set.verify26Q();
		}
		@Test(priority=2)
		public void Select26Q_AND_DeSelect27Q() throws IOException, InterruptedException
		{
			Settings set=new Settings(driver);
			set.verify27Q();
		}
		@Test(priority=3)
		public void Select27Q_AND_DeSelect27EQ() throws IOException, InterruptedException
		{
			Settings set=new Settings(driver);
			set.verify27EQ();
		}
		@Test(priority=4)
		public void Check_All_Enabled() throws IOException, InterruptedException
		{
			Settings set=new Settings(driver);
			set.verifyall();
		}
}

package pro.saral.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.testng.Assert;

import pro.saral.testCases.BaseClass;


public class ReadConfig{
	
	Properties pro;
	
	public class Constants{
		public static final String Entity_File_Path="../Gstsaralprotesting/src/test/java/pro/saral/testData/Entity.xlsx";
		public static final String Deductor_File_Path="../Gstsaralprotesting/src/test/java/pro/saral/testData/Deductor_Details.xlsx";
		public static final String Client_File="../Gstsaralprotesting/src/test/java/pro/saral/testData/Entity.xlsx";
		public static final String User_File_Path="C:/Users/sujatha/Desktop/selenium/Gstsaralprotesting/src/test/java/pro/saral/testData/UserMaster.xlsx";
	}
	
	public ReadConfig()
	{
		File src=new File("./Configuration/config.properties");
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e) {
			System.out.println(" Exception is " + e.getMessage());
		}
	}

	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String getDashboardURL()
	{
		String dashboardurl=pro.getProperty("dashboardURL");
		return dashboardurl;
	}
	public String getProductURL()
	{
		String producturl=pro.getProperty("productionurl");
		return producturl;
	}
	public String getProductDashboardURL()
	{
		String productdashboardurl=pro.getProperty("productdashboardurl");
		return productdashboardurl;
	}
	

	public String getUsername()
	{
		String username=pro.getProperty("username");
		return username;
	}

	public String getPassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	public String getChromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getFirefoxpath()
	{
		String Firefoxpath=pro.getProperty("firefoxpath");
		return Firefoxpath;
	}
	public String geteIEpath()
	{
		String iepath=pro.getProperty("IEpath");
		return iepath;
	}
	public String getcompanyname()
	{
		String companyname=pro.getProperty("companyname");
		return companyname;
	}
	public String aQvalidexcel()
	{
		String Steppervalidexcelpath=pro.getProperty("24Qvalidexcel");
		return Steppervalidexcelpath;
	}
	public String aQ4validexcel()
	{
		String Steppervalidexcelpath=pro.getProperty("24Q4validexcel");
		return Steppervalidexcelpath;
	}
	public String bQvalidexcel()
	{
		String Steppervalidexcelpath=pro.getProperty("26Qvalidexcel");
		return Steppervalidexcelpath;
	}
	public String cQvalidexcel()
	{
		String Steppervalidexcelpath=pro.getProperty("27Qvalidexcel");
		return Steppervalidexcelpath;
	}
	public String dQvalidexcel()
	{
		String Steppervalidexcelpath=pro.getProperty("27EQvalidexcel");
		return Steppervalidexcelpath;
	}
	public String invalidexcel()
	{
		String Stepperinvalidexcelpath=pro.getProperty("24Qinvalidexcelfile");
		return Stepperinvalidexcelpath;
	}
	public String validconso()
	{
		String Stepperinvalidexcelpath=pro.getProperty("24qvalidconso");
		return Stepperinvalidexcelpath;
	}
	public String bvalidconso()
	{
		String Stepperinvalidexcelpath=pro.getProperty("26qvalidconso");
		return Stepperinvalidexcelpath;
	}
	public String cvalidconso()
	{
		String Stepperinvalidexcelpath=pro.getProperty("27qvalidconso");
		return Stepperinvalidexcelpath;
	}
	public String dvalidconso()
	{
		String Stepperinvalidexcelpath=pro.getProperty("27eqvalidconso");
		return Stepperinvalidexcelpath;
	}
	public String masterimport()
	{
		String Stepperinvalidexcelpath=pro.getProperty("24qmasterimport");
		return Stepperinvalidexcelpath;
	}
	public String masterimport26()
	{
		String Stepperinvalidexcelpath=pro.getProperty("26qmasterimport");
		return Stepperinvalidexcelpath;
	}
	public String masterimport27()
	{
		String Stepperinvalidexcelpath=pro.getProperty("27qmasterimport");
		return Stepperinvalidexcelpath;
	}
	public String masterimport27EQ()
	{
		String Stepperinvalidexcelpath=pro.getProperty("27eqmasterimport");
		return Stepperinvalidexcelpath;
	}
	public String validtext()
	{
		String Stepperinvalidexcelpath=pro.getProperty("24qvalidtext");
		return Stepperinvalidexcelpath;
	}
	public String validtext26()
	{
		String Stepperinvalidexcelpath=pro.getProperty("26qvalidtext");
		return Stepperinvalidexcelpath;
	}
	public String validtext27()
	{
		String Stepperinvalidexcelpath=pro.getProperty("27qvalidtext");
		return Stepperinvalidexcelpath;
	}
	public String validtext27EQ()
	{
		String Stepperinvalidexcelpath=pro.getProperty("27eqvalidtext");
		return Stepperinvalidexcelpath;
	}
	public String aerrorexcel()
	{
		String Stepperinvalidexcelpath=pro.getProperty("24qerrorexcelfile");
		return Stepperinvalidexcelpath;
	}
	public String aq4errorexcel()
	{
		String Stepperinvalidexcelpath=pro.getProperty("24q4errorexcelfile");
		return Stepperinvalidexcelpath;
	}
	public String berrorexcel()
	{
		String Stepperinvalidexcelpath=pro.getProperty("26qerrorexcelfile");
		return Stepperinvalidexcelpath;
	}
	public String cerrorexcel()
	{
		String Stepperinvalidexcelpath=pro.getProperty("27qerrorexcelfile");
		return Stepperinvalidexcelpath;
	}
	public String derrorexcel()
	{
		String Stepperinvalidexcelpath=pro.getProperty("27eqerrorexcelfile");
		return Stepperinvalidexcelpath;
	}
	public String Stepperinvalidexcel()
	{
		String Stepperinvalidexcelpath=pro.getProperty("invalidstepper24Qexcel");
		return Stepperinvalidexcelpath;
	}
	public String Steppervalidexcel()
	{
		String Stepperinvalidexcelpath=pro.getProperty("validstepper24Qexcel");
		return Stepperinvalidexcelpath;
	}
	public void ismandatory(WebElement element) {
		String expected="true";
	    String actual_error=element.getAttribute("error");
		System.out.println(actual_error);
		Assert.assertEquals(expected, actual_error);
	}
	public static Boolean isFileDownloaded(String fileName) {
        boolean flag = false;
        String home =System.getProperty("user.home");
        String dirPath = (home+"//Downloads"); 
        File dir = new File(dirPath);
        System.out.println(dirPath);
        File[] files = dir.listFiles();
        if (files.length == 0 || files == null) {
            System.out.println("The directory is empty");
            flag = false;
        } else {
            for (File listFile : files) {
                if (listFile.getName().contains(fileName)) {
                    System.out.println(fileName + " is present");
                    break;
                }
                flag = true;
            }
        }
        return flag;
    }
//	public void uploadfile(String path,String element )
//	{
//		WebElement upload_file = driver.findElement(By.xpath(element));
//		upload_file.sendKeys(path);
//	}
	
}

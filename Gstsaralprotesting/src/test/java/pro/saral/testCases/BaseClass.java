package pro.saral.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pro.saral.pageObject.LoginPage;
import pro.saral.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	public String baseurl=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public String karnatakagstcode=readconfig.getPassword();
	public String dashboardurl=readconfig.getDashboardURL();
	public String producturl=readconfig.getProductURL();
	public String productdashboardurl=readconfig.getProductDashboardURL();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws InterruptedException, IOException
	{
		logger=Logger.getLogger("saralpro");
		PropertyConfigurator.configure("Log4j.properties");
//		WebElement scanEle=new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),\"Exit Tour Mode\")]")));
//		Actions action=new Actions(driver);
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
				System.setProperty("webdriver.gecko.driver",readconfig.getFirefoxpath());
				driver=new FirefoxDriver();	
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",readconfig.geteIEpath());
			driver=new InternetExplorerDriver();
		}
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(baseurl);
		logger.info("url is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Entered password");
		lp.clickSubmit();
		Thread.sleep(5000);
		lp.confirmbottonexist();
		Thread.sleep(5000);
		if(lp.tourexist())
		{
			lp.Exittour();
			logger.info("Exit tour");
		}
		Thread.sleep(5000);
		if(lp.releasenotesexist())
		{
			lp.closereleasenote();
			logger.info("Closed release notes");
		}
		
		if(driver.getTitle().equals("Saral Pro"))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}
	public void captureScreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}

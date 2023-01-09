package pro.saral.pageObject;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pro.saral.testCases.BaseClass;
import pro.saral.utilities.ReadConfig;
import pro.saral.utilities.XLUtils;
import pro.saral.utilities.ReadConfig.Constants;


public class Settings extends BaseClass{
	WebDriver idriver;
	ReadConfig readconfig=new ReadConfig();
	static XLUtils excelutils= new XLUtils();
	static String deductorexcelfilepath=Constants.Deductor_File_Path;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Actions action = new Actions(driver);
	int j=0;
	public Settings(WebDriver rdriver) throws IOException
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		excelutils.EntityExcel(deductorexcelfilepath, "Entity");
	}

	@FindBy(id="OptionSettings")
	@CacheLookup
	WebElement settingstab;
	
	@FindBy(xpath="//a[contains(text(),'TDS')]")
	@CacheLookup
	WebElement tdstab;
	
	@FindBy(xpath="//label[contains(text(),'Form 24Q')]//preceding-sibling::label")
	@CacheLookup
	WebElement aqcheckbox;
	
	@FindBy(xpath="//label[contains(text(),'Form 26Q')]//preceding-sibling::label")
	@CacheLookup
	WebElement bqcheckbox;
	
	@FindBy(xpath="//label[contains(text(),'Form 27Q')]//preceding-sibling::label")
	@CacheLookup
	WebElement cqcheckbox;
	
	@FindBy(xpath="//label[contains(text(),'Form 27EQ')]//preceding-sibling::label")
	@CacheLookup
	WebElement dqcheckbox;
	
	@FindBy(id="optSave")
	@CacheLookup
	WebElement settingssave;
	
	@FindBy(xpath="//a[contains(text(),'24Q')]")
	@CacheLookup
	WebElement aqtab;
	
	@FindBy(xpath="//a[contains(text(),'26Q')]")
	@CacheLookup
	WebElement bqtab;
	
	@FindBy(xpath="//a[contains(text(),'27Q')]")
	@CacheLookup
	WebElement cqtab;
	
	@FindBy(xpath="//a[contains(text(),'27EQ')]")
	@CacheLookup
	WebElement dqtab;
	
	@FindBy(xpath="//div[contains(text(),'Updated Successfully')]")
	@CacheLookup
	WebElement settingssavenotification;
	
	@FindBy(xpath="//a[contains(text(),'24Q')]")
	@CacheLookup
	WebElement a1tab;
	
	public void settingsgtabclick()
	{
		settingstab.click();
	}
	public void check24tab()
	{
		a1tab.isDisplayed();
	}
	
	public void tdsclick()
	{
		tdstab.click();
	}
	public void acheckclick()
	{
		aqcheckbox.click();
	}
	public void bcheckclick()
	{
		bqcheckbox.click();
	}
	public void ccheckclick()
	{
		cqcheckbox.click();
	}
	public void dcheckclick()
	{
		dqcheckbox.click();
	}
	public void atabclick()
	{
		aqtab.click();
	}
	public void btabclick()
	{
		bqtab.click();
	}
	public void ctabclick()
	{
		cqtab.click();
	}
	public void dtabclick()
	{
		dqtab.click();
	}
	public void settingssaveclick()
	{
		settingssave.click();
	}
	public void settingssavednotification()
	{
		settingssavenotification.isDisplayed();
	}
	public void verify24Q() throws InterruptedException{
	WebDriverWait wait=new WebDriverWait(idriver, 30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Employee")));
	settingsgtabclick();
	acheckclick();
	settingssaveclick();
	settingssavednotification();
	driver.navigate().refresh();
	tdsclick();
	List<WebElement> tab= driver.findElements(By.xpath("//a[contains(text(),'24Q')]"));
	
	if(tab.size()!=0)
	{
		System.out.println("24QTab is not Hided");
		driver.findElement(By.id("Saral")).click();
	}
	else {
		System.out.println("24Q Tab is hided");
	}
	}
	public void verify26Q() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(idriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Employee")));
		settingsgtabclick();
		acheckclick();
		bcheckclick();
		settingssaveclick();
		settingssavednotification();
		driver.navigate().refresh();
		tdsclick();
		List<WebElement> tab= driver.findElements(By.xpath("//a[contains(text(),'26Q')]"));
		if(tab.size()!=0)
		{
			System.out.println("26QTab is not Hided");
			driver.findElement(By.id("Saral")).click();
		}
		else {
			System.out.println("26Q Tab is hided");
		}
		}
	public void verify27Q() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(idriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Employee")));
		settingsgtabclick();
		bcheckclick();
		ccheckclick();
		settingssaveclick();
		settingssavednotification();
		driver.navigate().refresh();
		tdsclick();
		List<WebElement> tab= driver.findElements(By.xpath("//a[contains(text(),'27Q')]"));
		if(tab.size()!=0)
		{
			System.out.println("27QTab is not Hided");
			driver.findElement(By.id("Saral")).click();
		}
		else {
			System.out.println("27Q Tab is hided");
		}
		}
	public void verify27EQ() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(idriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Employee")));
		settingsgtabclick();
		dcheckclick();
		ccheckclick();
		settingssaveclick();
		settingssavednotification();
		driver.navigate().refresh();
		tdsclick();
		List<WebElement> tab= driver.findElements(By.xpath("//a[contains(text(),'27EQ')]"));
		if(tab.size()!=0)
		{
			System.out.println("27EQTab is not Hided");
			driver.findElement(By.id("Saral")).click();
		}
		else {
			System.out.println("27EQ Tab is hided");
		}
		}
	public void verifyall() throws InterruptedException{
		WebDriverWait wait=new WebDriverWait(idriver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Employee")));
		settingsgtabclick();
		dcheckclick();
		settingssaveclick();
		settingssavednotification();
		driver.navigate().refresh();
		atabclick();
		driver.navigate().refresh();
		tdsclick();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'26Q')]")));
		btabclick();
		driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'27Q')]")));
		ctabclick();
		driver.navigate().refresh();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'27EQ')]")));
		dtabclick();
	}
}

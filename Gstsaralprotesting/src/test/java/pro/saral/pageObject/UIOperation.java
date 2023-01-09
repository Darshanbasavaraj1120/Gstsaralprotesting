package pro.saral.pageObject;

import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.reporter.configuration.Theme;

import pro.saral.utilities.ReadConfig;

public class UIOperation {
	public static Logger logger;
	WebDriver driver;
	public UIOperation(WebDriver driver){
		this.driver = driver;
		logger=Logger.getLogger("saralpro");
		PropertyConfigurator.configure("Log4j.properties");
	}
	public void perform(Properties p,String operation,String objectName,String objectType,String value) throws Exception{
		System.out.println("");
		LoginPage lp=new LoginPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		switch (operation.toUpperCase()) {
		case "CLICK":
			//Perform click
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(this.getObject(p, objectName, objectType))));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(this.getObject(p, objectName, objectType)))).click();;
			logger.info("Clicked on element");
			Thread.sleep(2000);
			break;
		case "HARDCLICK":
			WebElement element = driver.findElement(this.getObject(p, objectName, objectType));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		case "SETTEXT":
			//Set text on control
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(this.getObject(p, objectName, objectType))));
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(value);
			logger.info("Sent Text");
			break;
		case "GOTOURL":
			//Get url of application`
			driver.get(p.getProperty(value));
			break;
		case "GETTEXT":
			//Get text of an element
			driver.findElement(this.getObject(p,objectName,objectType)).getText();
			break;
		case "GETATTRIBUTE":
			//Get text of an element
			String amount=driver.findElement(this.getObject(p,objectName,objectType)).getAttribute(value);
			System.out.println(amount);
			if(amount.contains("10.00"))
			{
				System.out.println("Amount rate is correct");
			}
			break;	
		case "VERIFYNOTIFICATION":
			//Verify notifications
			driver.findElement(this.getObject(p,objectName,objectType)).isDisplayed();
			logger.info("Verified");
			break;
		case "ELEMENTNOTPRESENT":
			//Verify notifications
			List<WebElement> list = driver.findElements(this.getObject(p,objectName,objectType));
			Assert.assertTrue(list.contains(value));
			System.out.println(list);
			logger.info("Verified");
			break;
		case "VERIFYERROR":
			//Verify notifications
			driver.findElement(this.getObject(p,objectName,objectType)).getAttribute(value);
			logger.info("Verified");
			break;
		case "ISTEXTEXISTS":
//			String bodyText = driver.findElement(this.getObject(p,objectName,objectType)).getText();
//			Assert.assertNull("Text not found!", bodyText.contains(value));
//			List<WebElement> lists = driver.findElements(this.getObject(p,objectName,objectType));
//			System.out.println(lists);
//			if(lists.contains(value)){
//				driver.findElement(By.id("saral")).click();
//			}
//			else{
//				System.out.println("Test Pass");
//			}

//			if(!driver.findElement(this.getObject(p,objectName,objectType)).isDisplayed())
//			{
//				Assert.assertTrue(true);
////				driver.findElement(By.id("saral")).click();
//				logger.info("test passed");
//			}
//			else
//			{
//				Assert.assertTrue(false);
//				logger.info("Login test failed");
//			}
			
			
			
			WebElement t=driver.findElement(this.getObject(p,objectName,objectType));
	         // count rows with size() method
	         List<WebElement> rws = t.findElements(By.tagName("tr"));
	         int rws_cnt = rws.size();
	         //iterate rows of table
	         for (int i = 0;i < rws_cnt; i++) {
	         // count columns with size() method
	         List<WebElement> cols = rws.get(i).findElements(By.tagName("td"));
	         int cols_cnt = cols.size();
	         //iterate cols of table
	         for (int j = 0;j < cols_cnt; j++) {
	         // get cell text with getText()
	         String c = cols.get(j).getText();
	         if(c.contains(value))
	         {
	        	 driver.findElement(By.id("saral")).click();
	         }
	         else
	         {
	        	 System.out.println("Not present");
	         }
	      System.out.println("The cell value is: " + c);
	         }}
	      break;
		case "SELECTDROPDOWN":
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(this.getObject(p, objectName, objectType))));
			Select se = new Select(driver.findElement(this.getObject(p,objectName,objectType)));
			se.selectByVisibleText(value);
			logger.info("Selected dropdown");
			break;
		case "SELECTDROPDOWNBYVALUE1":
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(this.getObject(p, objectName, objectType))));
			Select sel = new Select(driver.findElement(this.getObject(p,objectName,objectType)));
			int excelvalue=Integer.parseInt(value);
			sel.selectByIndex(excelvalue);
			logger.info("Selected dropdown");
			break;
		case "CLEAR":
			//Clear textbox
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			break;
		case "HOVER":
			WebElement elements = driver.findElement(this.getObject(p,objectName,objectType));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements);
			break;
		case "ARROWRIGHT":
			//Clear textbox
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(Keys.ARROW_RIGHT);
			break;
		case "ARROWLEFT":
			//Clear textbox
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(Keys.ARROW_LEFT);
			break;
		case "BACKSPACE":
			//Clear textbox
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(Keys.BACK_SPACE);
			break;	
		case "IMPLICTWAIT":
			Thread.sleep(10000);
			break;
		case "ISDOWNLOADED":
			ReadConfig readconfig=new ReadConfig();
			readconfig.isFileDownloaded(value);
			break;
		case "CLICKONLOCATION":	
			Actions actions = new Actions(driver);
			actions.moveByOffset(133+1, 337+1).click(); 
		    actions.build().perform(); 
		    break;
		case "SELECT":
			//Select textbox
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(Keys.CONTROL + "a");
			break;
		case "TRY":
			logger.info("Clicked on Employee Tab");
			try {
				driver.findElement(this.getObject(p,objectName,objectType)).click();
			} catch (Exception e) {
			}
			break;
		case "WAIT":
			WebDriverWait driverwait=new WebDriverWait(driver, 30);
			driverwait.until(ExpectedConditions.visibilityOfElementLocated(this.getObject(p,objectName,objectType)));
			break;
		case "UPLOAD":
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(System.getProperty("user.dir")+value);
			Thread.sleep(2000);
			System.out.println(("user.dir")+value);
			logger.info("Uploaded File");
			break;
		case "ALERT":
			driver.switchTo().alert().accept();
			break;
		case "REFRESH":
			driver.navigate().refresh();
			Thread.sleep(2000);
			break;
		case"UPLOADWARNING":
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(this.getObject(p,objectName,objectType)))).click();
			Thread.sleep(15000);
			
			try {
				driver.findElement(By.xpath("(//button[@class='btn2 button2 btn-secondary btn-sm Ripple-parent'])[2]")).click();
				Thread.sleep(15000);
			}
			catch(Exception  e){
			}
			break;
		case"EXITTOUR":
			if(lp.tourexist())
			{
				lp.Exittour();
//				action.moveToElement(scanEle).click().build().perform();
				logger.info("Exit tour");
			}
			break;

		default:
		}
	}	
	/**
	 * Find element BY using object type and value
	 * @param p
	 * @param objectName
	 * @param objectType
	 * @return
	 * @throws Exception
	 */
	private By getObject(Properties p,String objectName,String objectType) throws Exception{
		//Find by xpath
		if(objectType.equalsIgnoreCase("XPATH")){
			
			return By.xpath(p.getProperty(objectName));
		}
		//find by class
		else if(objectType.equalsIgnoreCase("CLASSNAME")){
			
			return By.className(p.getProperty(objectName));
			
		}
		//find by id
		else if(objectType.equalsIgnoreCase("ID")){
			
			return By.id(p.getProperty(objectName));
			
		}
		//find by name
		else if(objectType.equalsIgnoreCase("NAME")){
			
			return By.name(p.getProperty(objectName));
			
		}
		//Find by css
		else if(objectType.equalsIgnoreCase("CSS")){
			
			return By.cssSelector(p.getProperty(objectName));
			
		}
		//find by link
		else if(objectType.equalsIgnoreCase("LINK")){
			
			return By.linkText(p.getProperty(objectName));
			
		}
		//find by partial link
		else if(objectType.equalsIgnoreCase("PARTIALLINK")){
			
			return By.partialLinkText(p.getProperty(objectName));
			
		}
		//find by tag name
		else if(objectType.equalsIgnoreCase("TAGNAME")){
			
			return By.tagName(p.getProperty(objectName));
			
		}
		else if(objectType.isEmpty()){
			
			return null;		
		}
		else
		{
			throw new Exception("Wrong object type");
		}
	}
}

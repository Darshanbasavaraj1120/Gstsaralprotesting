package pro.saral.pageObject;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(this.getObject(p, objectName, objectType)))).click();;
			logger.info("Clicked on element");
			break;
		case "SETTEXT":
			//Set text on control
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(value);
			logger.info("Sent Text");
			break;
		case "GOTOURL":
			//Get url of application
			driver.get(p.getProperty(value));
			break;
		case "GETTEXT":
			//Get text of an element
			driver.findElement(this.getObject(p,objectName,objectType)).getText();
			break;
		case "VERIFYNOTIFICATION":
			//Verify notifications
			driver.findElement(this.getObject(p,objectName,objectType)).isDisplayed();
			logger.info("Verified");
			break;
		case "SELECTDROPDOWN":
			Select se = new Select(driver.findElement(this.getObject(p,objectName,objectType)));
			se.selectByVisibleText(value);
			logger.info("Selected dropdown");
			break;
		case "CLEAR":
			//Clear textbox
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
			break;
		case "SELECT":
			//Select textbox
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(Keys.CONTROL + "a");
			break;
		case "WAIT":
			WebDriverWait driverwait=new WebDriverWait(driver, 30);
			driverwait.until(ExpectedConditions.visibilityOfElementLocated(this.getObject(p,objectName,objectType)));
			break;
		case "UPLOAD":
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(System.getProperty("user.dir")+value);
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
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(this.getObject(p, objectName, objectType)))).click();
			try {
				driver.findElement(By.xpath("(//button[@class='btn2 button2 btn-secondary btn-sm Ripple-parent'])[2]")).click();
				Thread.sleep(10000);
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
		else if(objectType.isEmpty()){
			
			return null;		
		}
		else
		{
			throw new Exception("Wrong object type");
		}
	}
}

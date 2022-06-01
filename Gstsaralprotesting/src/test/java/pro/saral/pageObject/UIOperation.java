package pro.saral.pageObject;

import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UIOperation {
	
	WebDriver driver;
	public UIOperation(WebDriver driver){
		this.driver = driver;
	}
	public void perform(Properties p,String operation,String objectName,String objectType,String value) throws Exception{
		System.out.println("");
		switch (operation.toUpperCase()) {
		case "CLICK":
			//Perform click
			WebDriverWait wait = new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(this.getObject(p, objectName, objectType)))).click();;
//			driver.findElement(this.getObject(p, objectName, objectType)).click();
			break;
		case "SETTEXT":
			//Set text on control
			driver.findElement(this.getObject(p,objectName,objectType)).sendKeys(value);
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
			break;
		case "SELECTDROPDOWN":
			Select se = new Select(driver.findElement(this.getObject(p,objectName,objectType)));
			se.selectByVisibleText(value);
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
			break;
		case "ALERT":
			driver.switchTo().alert().accept();
			break;
		case "REFRESH":
			driver.navigate().refresh();
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

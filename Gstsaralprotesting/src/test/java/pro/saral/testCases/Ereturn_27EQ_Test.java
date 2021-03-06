package pro.saral.testCases;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pro.saral.pageObject.UIOperation;
import pro.saral.utilities.ReadExcel;
import pro.saral.utilities.ReadObject;

public class Ereturn_27EQ_Test extends BaseClass{
	
	@Test(dataProvider="hybridData")
	public void Ereturn_27EQ_Testcases(String testcaseName,String keyword,String objectName,String objectType,String value) throws Exception {	
        ReadObject object = new ReadObject();
        Properties allObjects =  object.getObjectRepository();
        UIOperation operation = new UIOperation(driver);
      	//Call perform function to perform operation on UI
    			operation.perform(allObjects, keyword, objectName,
    				objectType, value);
    	    
	}
    @DataProvider(name="hybridData")
	public Object[][] getDataFromDataprovider() throws IOException{
    	Object[][] object = null; 
    	ReadExcel file = new ReadExcel();
     
         //Read keyword sheet
         Sheet guru99Sheet = file.readExcel(System.getProperty("user.dir")+"\\","TestCase.xlsx" , "27EQReturn");
       //Find number of rows in excel file
     	int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
     	object = new Object[rowCount][5];
     	for (int i = 0; i < rowCount; i++) {
    		//Loop over all the rows
    		Row row = guru99Sheet.getRow(i+1);
    		//Create a loop to print cell values in a row
    		for (int j = 0; j < row.getLastCellNum(); j++) {
    			//Print excel data in console
    			object[i][j] = row.getCell(j).toString();
    		}
         
    	}
     	
     	System.out.println("");
     	  return object;	 
	}

}

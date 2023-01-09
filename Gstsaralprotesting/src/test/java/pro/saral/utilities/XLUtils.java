package pro.saral.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils {

	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet  sheet; 
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static HSSFWorkbook hwb;
	public static XSSFSheet ws;
	public static HSSFSheet hws;
	public static XSSFRow row;
	public static HSSFRow hrow;
	public static XSSFCell cell;
	public static HSSFCell hcell;

//	public XLUtils(String excelPath, String sheetName)
//	{
//		try {
//
//			projectpath =System.getProperty("user.dir");
//			workbook = new XSSFWorkbook(excelPath);
//			sheet = workbook.getSheet(sheetName);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	public XLUtils(String excelFilePath, String sheetName)
//	{
//		try{
//		File file=new File(excelFilePath);
//		FileInputStream inputstream=new FileInputStream(file);
//		wb=new XSSFWorkbook(inputstream);
//		ws=wb.getSheetAt(0);
//		} catch (Exception e) {
//		e.printStackTrace();
//	}
//
//	}

	//	public static int getRowCount(String xlfile,String xlsheet) throws IOException 
	//	{
	//		fi=new FileInputStream(xlfile);
	//		wb=new XSSFWorkbook(fi);
	//		ws=wb.getSheet(xlsheet);
	//		int rowcount=ws.getLastRowNum();
	//		wb.close();
	//		fi.close();
	//		return rowcount;
	//	}
//	public static void main(String[] args) {
//		getRowCount(xlfile, xlsheet);
//		getCellDataString(rowNum, colNum);
//		getCellDataNumber(rowNum, colNum);
//	}
//	public static void getRowCount(String xlfile,String xlsheet) throws IOException 
//	{ 
//		try{
//			int rowcount = sheet.getPhysicalNumberOfRows();
//			System.out.println("No of rows" + rowcount);
//		}catch(Exception exp)
//		{
//			System.out.println(exp.getMessage());
//			System.out.println(exp.getCause());
//			exp.printStackTrace();
//		}
//
//	}
	public static  void getCellDataString(int rowNum, int colNum) {
		try {

			String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	public static void getCellDataNumber(int rowNum, int colNum) {
		try {
			Double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		}catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	//	
	//	public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException
	//	{
	//		fi=new FileInputStream(xlfile);
	//		wb=new XSSFWorkbook(fi);
	//		ws=wb.getSheet(xlsheet);
	//		row=ws.getRow(rownum);
	//		int cellcount=row.getLastCellNum();
	//		wb.close();
	//		fi.close();
	//		return cellcount;
	//	}
	//	
	//	public String getCellDataofexcel(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	//	{
	//		fi=new FileInputStream(xlfile);
	//		wb=new XSSFWorkbook(fi);
	//		ws=wb.getSheet(xlsheet);
	//		row=ws.getRow(rownum);
	//		cell=row.getCell(colnum);
	//		String data;
	//		try
	//		{
	//			DataFormatter formatter = new DataFormatter();
	//			String cellData = formatter.formatCellValue(cell);
	//			return cellData;
	//		}
	//		catch (Exception e)
	//		{
	//			data="";
	//		}
	//		wb.close();
	//		fi.close();
	//		return data;
	//	}
	//	
	//	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum, String data) throws IOException
	//	{
	//		fi=new FileInputStream(xlfile);
	//		wb=new XSSFWorkbook(fi);
	//		ws=wb.getSheet(xlsheet);
	//		row=ws.getRow(rownum);
	//		cell=row.createCell(colnum);
	//		cell.setCellValue(data);
	//		fo=new FileOutputStream(xlfile);
	//		wb.write(fo);
	//		wb.close();
	//		fi.close();
	//		fo.close();
	//	}
	//	public static List<Map<String,String>> getTestDataInMap() throws IOException{
	//		List<Map<String, String>> testDataAllRows=null;
	//		
	//		Map<String, String> testData=null;
	//		try {
	//			FileInputStream fileInputStream=new FileInputStream("./src/test/java/pro/saral/testData/LoginData.xlsx");
	//			
	//			wb = new XSSFWorkbook(fileInputStream);
	//			
	//			ws=wb.getSheetAt(0);
	//			
	//			int lastRowNumber=ws.getLastRowNum();
	//			
	//			int lastColNumber=ws.getRow(0).getLastCellNum();
	//			
	//			List list=new ArrayList();
	//			
	//			for(int i=0;i<lastColNumber;i++)
	//			{
	//				Row row=ws.getRow(0);
	//				Cell cell=row.getCell(i);
	////				String rowHeader=cell.getStringCellValue().trim();
	//				DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
	//				String Entity = formatter.formatCellValue(cell).trim();
	//				list.add(Entity);
	//			}
	//			
	//			testDataAllRows=new ArrayList<Map<String,String>>();
	//			
	//			for(int j=1;j<=lastRowNumber;j++)
	//			{
	//				Row row=ws.getRow(j);
	//				testData=new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER);
	//				for(int k=0;k<lastColNumber;k++)
	//				{
	//					Cell cell=row.getCell(k);
	//					DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
	//					String login = formatter.formatCellValue(cell).trim();
	////					String colValue=cell.getStringCellValue().trim();
	//					testData.put((String) list.get(k), login);
	//				}
	//				testDataAllRows.add(testData);
	//				
	//			}
	//		} catch (FileNotFoundException e) {
	//			e.printStackTrace();
	//		}
	//		return testDataAllRows;
	//		
	//	}
	public void EntityExcel(String excelFilePath, String sheetName) throws IOException
	{
		File file=new File(excelFilePath);
		FileInputStream inputstream=new FileInputStream(file);
		wb=new XSSFWorkbook(inputstream);
		ws=wb.getSheetAt(0);

	}

	public String getCellData(int rownumber, int cellNumber){

		cell=ws.getRow(rownumber).getCell(cellNumber);
		DataFormatter formatter = new DataFormatter(); //creating formatter using the default locale
		String Entity = formatter.formatCellValue(cell);

		return Entity;
	}
	public int getRowCountInSheet(){
		int rowcount = ws.getLastRowNum()-ws.getFirstRowNum();
		return rowcount;
	}
	public void setCellValue(int rowNum, int cellNum, String cellValue, String excelFilePath) throws IOException{
		ws.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);
		FileOutputStream outputstream=new FileOutputStream(excelFilePath);
		wb.write(outputstream);
	}


}

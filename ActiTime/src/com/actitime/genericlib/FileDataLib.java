package com.actitime.genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Abinash Nayak
 *
 */

public class FileDataLib {

	String excelPath="./TestData/TestData.xlsx";
	String filePath="./TestData/CommonData.properties";
	
	/**
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return data
	 * @throws Throwable
	 * A method present in FileDataUtils class which will read the data from Workbook and will return the value in the form of string.
	 */
	public String getExcelData(String sheetName,int rowNum,int cellNum) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(rowNum);
		String data=rw.getCell(cellNum).getStringCellValue();
		wb.close();
		return data;
	}
	/**
	 * 
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @param data
	 * @throws Throwable
	 * A method present in FileDataUtils class which will write the data in the Workbook and save it.
	 */
	
	public void setExcelData(String sheetName,int rowNum,int cellNum,String data) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		Row rw=sh.getRow(rowNum);
		Cell cel=rw.createCell(cellNum);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(excelPath);
		wb.write(fos);
		wb.close();
		
	}
	/**
	 * 
	 * @return pObj
	 * @throws Throwable
	 * A method present in FileDataUtils class which will read the data from property file and load all the values.
	 */
	public Properties getPropertiesFileObject() throws Throwable
	{
		FileInputStream fis=new FileInputStream(filePath);
		Properties pObj=new Properties();
		pObj.load(fis);
		return pObj;
	}
}

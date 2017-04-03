package com.syn.tfs.Excel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader 
{
	
	private XSSFWorkbook workbook=null;
	private XSSFSheet sheet=null;
	private XSSFRow row =null;
	private XSSFCell cell =null;
	//private XSSFFormulaEvaluator evaluator=null;
	private static String fileName = null;
	
	/*
	 * Constructor of Xls_Reader class
	 */
	public Xls_Reader(String fileName)
	{
		try
		{
			setFileName(fileName);
			System.out.println("File name " +getFileName());
			workbook= new XSSFWorkbook(fileName);
			sheet=workbook.getSheetAt(0);
			System.out.println(workbook.getSheetAt(0).getSheetName());
			//evaluator = workbook.getCreationHelper().createFormulaEvaluator();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/*
	 * used to get instance of Slx_Reader class
	 */
	public static Xls_Reader getInstance(String fileName) 
	{
		return new Xls_Reader(fileName);
	}
	/*
	 * set excel file name 
	 */
	public static void setFileName(String newFileName)
	{
		fileName = newFileName;
	}
	/*
	 * returns file name 
	 */
	public static String getFileName()
	{
		return fileName;
	}
	
	/*
	 * This mehtod returns count of Rows in perticular sheet
	 */
	public int getRowCount(String sheetName)
	{
		int index=workbook.getSheetIndex(sheetName);
		if(index==-1)
			return 0;
		else
			sheet=workbook.getSheetAt(index);
			return sheet.getLastRowNum()+1;
	}
	
	/*
	 * returns cell data
	 */
	@SuppressWarnings("deprecation")
	public String getCellData(String sheetName, String colName, int rowNum)
	{
		try{
			if(rowNum<=0)
				return "";
			
			int index=workbook.getSheetIndex(sheetName);
			int colNum=-1;
			if(index==-1)
				return "";
			
			sheet = workbook.getSheetAt(index);
			row = sheet.getRow(4);
			
			for(int i=2;i<row.getLastCellNum();i++)
			{
				System.out.println(row.getCell(i).getStringCellValue().trim());
				if(row.getCell(i).getStringCellValue().trim().equals(colName.trim()))
					colNum=i;
			}
			if(colNum==-1)
				return "";
			row=sheet.getRow(rowNum-1);
			if(row==null)
				return "";
			cell = row.getCell(colNum);
			if(cell==null)
				return "";
			if(cell.getCellType()==Cell.CELL_TYPE_STRING)
				return cell.getStringCellValue();
		}catch(Exception e)
		{
			e.printStackTrace();
			return "row "+rowNum+ "or column "+colName +"does not exist in xls";
		}
		return colName;
	}
	public static void main(String[] args) throws IOException 
	{
		Xls_Reader excelObj=getInstance("C:\\DSR.xlsx");
		System.out.println(excelObj.getRowCount("TaskSummary"));
		System.out.println(excelObj.getCellData("TaskSummary", "Date", 6));
	}

}

package com.ICTAKBLOG.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	
	public static XSSFWorkbook excelWbook;
	public static XSSFSheet excelsheet;
	
	public static  String[][] getCellData() throws IOException
	{
		FileInputStream ExcelFile=new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/"+"Admin.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook excelWbook =new XSSFWorkbook(ExcelFile);
		XSSFSheet excelsheet=excelWbook.getSheetAt(0);
		int rows=excelsheet.getPhysicalNumberOfRows();
		int cols=excelsheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rows);
		System.out.println(cols);
		String[][] data=new String[rows][cols];
		XSSFCell cell;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				cell=excelsheet.getRow(i).getCell(j);
				String cellcontents=cell.getStringCellValue();
				data[i][j]=cellcontents;
				System.out.println(data[i][j]);
			}
		}
return data;	
}

}

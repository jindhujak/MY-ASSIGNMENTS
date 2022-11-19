package week8day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnReadxcelDP {
	
	public static String[][] readData(String filename, int sheetindex) throws IOException
	{
		XSSFWorkbook book=new XSSFWorkbook("./dataSheet/"+filename+".xlsx");
		XSSFSheet sheetAt = book.getSheetAt(sheetindex );
		XSSFRow row = sheetAt.getRow(0);
		XSSFCell cell = row.getCell(0);
		int rowCount = sheetAt.getLastRowNum();
		System.out.println("row count : " + rowCount);
		int colCount = row.getLastCellNum();
		System.out.println("Column Count : " + colCount);
		System.out.println("Data from all rows and Columns");
		
        String [][] data=new String[rowCount][colCount];
		for (int i = 1; i <=rowCount; i++) {				
			for (int j = 0; j <colCount; j++) {
				String allValues = sheetAt.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j]=allValues;
				System.out.println(allValues);
			}}
           book.close();
           return data;
		

	}
		
	}



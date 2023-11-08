import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataSupplier {
	
	
	@DataProvider(name="LoginTestData1")
	public String[][] getData() throws IOException
	{
		
		File excelfile= new File("C:\\Users\\User\\eclipse-workspace\\Julius 2023 workspace\\Dproviderswrk\\src\\test\\resources\\ScrewfixData.xlsx");
		//System.out.println(excelfile.exists());
	    
		FileInputStream fis= new FileInputStream(excelfile);
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		XSSFSheet Sheet = workbook.getSheet("Sheet1");
		int noOfRows =Sheet.getPhysicalNumberOfRows();
	    int noOfColumns =Sheet.getRow(0).getLastCellNum();
	    
	    String[][] data = new String[noOfRows-1][noOfColumns];
	    
	    for(int i = 0; i < noOfRows-1; i++) {
	    	for(int j = 0; j < noOfColumns; j++) {
	    		DataFormatter df= new DataFormatter();
	    		data[i][j]=df.formatCellValue(Sheet.getRow(i+1).getCell(j));
	    		
	    		
	    		//System.out.println(df.formatCellValue(Sheet.getRow(i+1).getCell(j)));// This is good for type data in excel either integer or whatever
	    		//System.out.println(Sheet.getRow(i+1).getCell(j).getStringCellValue());   
	    	}
		   
	        //System.out.println();
	    }
	  workbook.close();
	  fis.close();
	return data;
	
	// for (String[] dataArr : data) {
		 //System.out.println(Arrays.toString(dataArr));
	 }
	
	
	
	
	
	}
	
	
	
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



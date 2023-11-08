package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupplier {
	
	@DataProvider(name="LoginTestData1")
	public String[][] getData() throws IOException 
	{
		
		File excelfile= new File("./testData/SrewfixLogin_Data.xlsx");
		System.out.println(excelfile.exists());
	    
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
	    		
	    		
	    		
	    		  
	    	}
		   
	        
	    }
	  workbook.close();
	  fis.close();
	  return data;
	  

	 }
	
	
	
	
	
	}
	
	
	
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



package utilities;


import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders1 {

	//DataProvider 1
	
	@DataProvider(name="LoginTestData")
	public String [][] getData() throws IOException
	{
		
		//taking xl file from testData
		//String path=".\\testData\\ScrewfixData1.xlsx";
		//System.out.println(path.exists())
		String path="C:\\Users\\User\\eclipse-workspace\\Julius 2023 workspace\\Screwfix\\testData\\ScrewfixData1.xlsx";
		
		ExcelUtility1 xlutil=new ExcelUtility1(path);//creating an object for XLUtility
		
		int totalrows=xlutil.getRowCount("Sheet1");	
		int totalcols=xlutil.getCellCount("Sheet1",1);
				
		String SrewfixLogindata[][]=new String[totalrows][totalcols];//created for two dimension array which can store the data user and password
		
		for(int i=1;i<=totalrows;i++)  //1   //read the data from xl storing in two deminsional array
		{		
			for(int j=0;j<totalcols;j++)  //0    i is rows j is col
			{
				SrewfixLogindata[i-1][j]= xlutil.getCellData("Sheet1",i, j);  //1,0
			}
		}
	return SrewfixLogindata;        //returning two dimension array
				
	}
	
	//DataProvider 2
	
	//DataProvider 3
	
	//DataProvider 4
}
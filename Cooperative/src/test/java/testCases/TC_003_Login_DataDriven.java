package testCases;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.homePage;
import pageObject.loginPage;
import pageObject.myAccountPage;
import testBase.BaseClass;

import utilities.ExcelDataSupplier;

public class TC_003_Login_DataDriven extends BaseClass{
	
	//Becos we have dataprovider in anotherclass, is the reason for having DataProvider.class
	
	
	
	@Test(dataProvider="LoginTestData1", dataProviderClass = ExcelDataSupplier.class)
	public void test_TestDriven(String Uname, String Pword, String expected) throws InterruptedException
	{
		try
		{
		homePage hp=new homePage(driver);
		Thread.sleep(3000);
		hp.switchToFrameByElement();
		hp.DefaultContentiframe();
		Thread.sleep(2000);
		hp.Clickyouraccount();
		
		loginPage lp=new loginPage(driver);
		//driver.findElement(By.xpath("//input[@id='email-existing']")).clear();
	    lp.Enteryouremail(Uname);
		 Thread.sleep(2000);
	    //driver.findElement(By.xpath("//input[@id='password-field']")).clear();
	    
		lp.Enterpassword(Pword);
		Thread.sleep(2000);
		lp.Clicksignin();
		
		myAccountPage mypg=new myAccountPage(driver);
		boolean targetpage=mypg.IsMySuccessfulsigninExist();
		
		if(expected.equals("valid"))
				{
			      if (targetpage==true)
			    	mypg.ClicktxtyourAcct();
			        mypg.ClickLogOutbtn();
			        mypg.ClickShopping();
			        Thread.sleep(2000);
			        Assert.assertTrue(true);
				}
	
		        else
		        {
		    	  Assert.assertTrue(false);
		        }
		
		
		if(expected.equals("invalid"))
		      {
	           if (targetpage== true)
	        	   mypg.ClicktxtyourAcct();
		           mypg.ClickLogOutbtn();
		           mypg.ClickShopping();
	               Assert.assertTrue(false);
	         }

             else
             {
    	     Assert.assertTrue(true);
             }
          
		    }  catch(Exception e) {
		    	
		    		    	
            
		    }
		}		   	

}
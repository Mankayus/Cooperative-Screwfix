package testCase;



import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.homePage1;
import PageObject.loginPage1;
import PageObject.myAccountPage1;
import testBase.BaseClass;

import utilities.DataProviders1;

public class TC_003_Login_DataDriven1 extends BaseClass{
	
	//Becos we have dataprovider in anotherclass, is the reason for having DataProvider.class
	
	
	
	@Test(dataProvider="LoginTestData", dataProviderClass = DataProviders1.class)
	public void test_TestDriven(String Uname, String Pword, String Expected) throws InterruptedException
	{
		try
		{
		homePage1 hp=new homePage1(driver);
		Thread.sleep(3000);
		hp.switchToFrameByElement();
		hp.DefaultContentiframe();
		Thread.sleep(2000);
		hp.Clickyouraccount();
		
		loginPage1 lp=new loginPage1(driver);
		//driver.findElement(By.xpath("//input[@id='email-existing']")).clear();
	    lp.Enteryouremail(Uname);
		 Thread.sleep(2000);
	    //driver.findElement(By.xpath("//input[@id='password-field']")).clear();
	    
		lp.Enterpassword(Pword);
		Thread.sleep(2000);
		lp.Clicksignin();
		
		myAccountPage1 mypg=new myAccountPage1(driver);
		boolean targetpage=mypg.IsMySuccessfulsigninExist();
		
		if(Expected.equals("valid"))
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
		
		
		if(Expected.equals("invalid"))
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
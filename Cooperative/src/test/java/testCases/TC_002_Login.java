package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.homePage;
import pageObject.loginPage;
import pageObject.myAccountPage;
import testBase.BaseClass;

public class TC_002_Login extends BaseClass{
	
	@Test(groups={"Sanity","Master"})
	public void test_login() throws InterruptedException
	{   
		homePage hp=new homePage(driver);
		hp.switchToFrameByElement();
		hp.DefaultContentiframe();
		
		Thread.sleep(2000);
		
		hp.Clickyouraccount();
		
		loginPage lp=new loginPage(driver);
		 
		lp.Enteryouremail(rb.getString("email"));
		 Thread.sleep(2000);
		lp.Enterpassword(rb.getString("password"));
		 Thread.sleep(2000);
		lp.Clicksignin();
		
		try
		{
		myAccountPage mypg=new myAccountPage(driver);
		boolean targetpage=mypg.IsMySuccessfulsigninExist();
		Assert.assertEquals(targetpage,true);
		}
		catch(Exception e) {
			
		}
		
	}
		
	}



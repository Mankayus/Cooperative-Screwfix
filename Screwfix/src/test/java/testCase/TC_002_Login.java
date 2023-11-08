package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.homePage1;
import PageObject.loginPage1;
import PageObject.myAccountPage1;
import testBase.BaseClass;

public class TC_002_Login extends BaseClass{
	
	@Test(groups={"Sanity","Master"})
	public void test_login1() throws InterruptedException
	{   
		homePage1 hp=new homePage1(driver);
		hp.switchToFrameByElement();
		hp.DefaultContentiframe();
		
		Thread.sleep(2000);
		
		hp.Clickyouraccount();
		
		loginPage1 lp=new loginPage1(driver);
		 
		lp.Enteryouremail(rb.getString("email"));
		 Thread.sleep(2000);
		lp.Enterpassword(rb.getString("password"));
		 Thread.sleep(2000);
		lp.Clicksignin();
		
		try
		{
		myAccountPage1 mypg=new myAccountPage1(driver);
		boolean targetpage=mypg.IsMySuccessfulsigninExist();
		Assert.assertEquals(targetpage,true);
		}
		catch(Exception e) {
			
		}
		
	}
		
	}



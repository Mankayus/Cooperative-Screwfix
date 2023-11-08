package testCase;




import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.homePage1;
import PageObject.registrationPage1;

import testBase.BaseClass;

public class TC_001_AccountRegisterationTest extends BaseClass {
	
	
@Test(groups={"Regression","Master"})
public void test_account_Registration() throws InterruptedException
{
	
		
	try
	{
    logger.info("Staring the execution of testcases");

	homePage1 hp=new homePage1(driver);
	
	logger.info("Home page open");
	
   
   
	hp.switchToFrameByElement();

	hp.DefaultContentiframe();
	 Thread.sleep(3000);
	
	 hp.Clickyouraccount();

	//Thread.sleep(3000);
	//hp.Clickyouraccount();
	hp.ClickRegister();
    logger.info("Registration page open");
	
	Thread.sleep(2000);
	
	registrationPage1 regP=new registrationPage1(driver);
	
	//regP.Clickregisternowbtn();
	regP.enterEmail(randomestring()+"@gmail.com");
	logger.info("Email entered");
	regP.setContinueButton();
	Thread.sleep(3000);
	logger.info("Details entered");
	regP.setTitle();
	regP.setfirstname(randomestring().toUpperCase());
	regP.setlastname(randomestring().toUpperCase());
	Thread.sleep(3000);
	regP.clickprofession();
	regP.enterPostcode(Enterpostcode());
	regP.Clickaddressbtn();
	Thread.sleep(3000);
	regP.Displayaddressresult();
	Thread.sleep(3000);
	String pwd=Passwordgenerator();
	regP.Enterpassword(pwd);
	Thread.sleep(3000);
	regP.passwordRententered(pwd);
	Thread.sleep(3000);
	regP.Clickregisternowbtn();
	logger.info(" Registration details all entered");
	
	

	String confmmsg=regP.Continueshopconfirmation();
	
	if(confmmsg.equals("Continue Shopping"))
	{
		Assert.assertTrue(true);
		logger.info("test passed");
	}
	
	else
	{
		logger.error("test failed");
		Assert.assertTrue(false);;
	}
	
	
	}
	 catch(Exception e)
		 	
	{
	  
	}
	logger.info(" Registration compelete");
}
	
	
	

}

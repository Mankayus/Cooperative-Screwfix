package testCases;




import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import pageObject.homePage;
import pageObject.registrationPage;
import testBase.BaseClass;

public class TC_001_AccountRegisterationTest extends BaseClass {
	
	
@Test(groups={"Regression","Master"})
public void test_account_Registration() throws InterruptedException
{
	
		
	try
	{
    logger.info("Staring the execution of testcases");

	homePage hp=new homePage(driver);
	
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
	
	registrationPage regP=new registrationPage(driver);
	
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

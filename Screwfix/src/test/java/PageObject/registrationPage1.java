package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class registrationPage1 extends basePage{


	
	
	 public registrationPage1(WebDriver driver)
	    {
		
	       super(driver);
	       
	     }	
	
	 
	 
	/* @FindBy (xpath="//button[@value='Register now']")
	 
	 WebElement txtRegbutton;*/
	 
	 @FindBy(xpath ="//input[@id='email-input']")
	 
	 WebElement txtEmailtextbox;
	 
	 @FindBy (id="continueRegistrationButton")
	 WebElement txtContinueButton;
	 
	 @FindBy (id="newTitle")
	 WebElement txtSelectTitle;
	 
	 @FindBy (xpath="//input[@id='firstName']")
	 WebElement txtFirstname;
	 
	 @FindBy (id="lastName")
	 WebElement txtLastname;
	 
	 @FindBy (xpath="//select[@id='profession']")
	 WebElement txtSelectProfession;
	 
	 @FindBy(id="contact-search-postcode")
	 WebElement Postcodetextbox;
	 
	 @FindBy(xpath="//button[@data-value='find address']")
	 WebElement Addressbutton;
	 
	 @FindBy (id="contact-address-result-select")
	 WebElement txtSelectaddresresult;
	 
	 @FindBy (xpath="//input[@id='password']")
	 WebElement txtPassword;
	 
	 @FindBy (id="retypePassword")
	 WebElement txtReenterpassword;
	 
	 @FindBy(xpath="//button[@id='registerNowButton']")
	 WebElement Registernowbtn;
	 
	 @FindBy(xpath="//a[normalize-space()='Continue Shopping']")
	 WebElement ContinueshopMsg;
	 
	
	 
	 public void enterEmail(String email)
	 {
		 txtEmailtextbox.sendKeys(email); 
	 }
	
	 
	 public void setContinueButton()
	 {
		 txtContinueButton.click();
	 }
	 
	 public void setTitle() throws InterruptedException
	 {
		 
		

         Select dropdown=new Select( txtSelectTitle);
         Thread.sleep(3000);
         dropdown.selectByIndex(6);
	 }
	 
	 
	 public void setfirstname(String fname)
	 {
		 txtFirstname.sendKeys(fname);
	 }
	 
	 
	 public void setlastname(String lname)
	 {
		 txtLastname.sendKeys(lname);
	 }
	 
	 public void clickprofession() throws InterruptedException
	 {
		 Select drpdn=new Select( txtSelectProfession);
         Thread.sleep(3000);
         drpdn.selectByIndex(3);
		 
	 }
	 
	 public void enterPostcode(String postcode)
	 {
		 Postcodetextbox.sendKeys(postcode);
	 }
	 
	 
	 public void Clickaddressbtn()
	 {
		 Addressbutton.click();
	 }
	 
	 public void  Displayaddressresult() throws InterruptedException
	 {
		 Select drpdn=new Select(txtSelectaddresresult);
         Thread.sleep(3000);
         drpdn.selectByIndex(8);

		 
		 txtSelectaddresresult.click();
	 }
	 
	 public void Enterpassword(String pwd)
	 {
		
		 txtPassword.sendKeys(pwd);
	 }
	
	 
	 public void passwordRententered(String repwd)
	 {		 
		 
		 txtReenterpassword.sendKeys(repwd);
	 }
	 
	 
	 public void Clickregisternowbtn()
	 {
		 Registernowbtn.click(); 
	 }
	 
	 public String Continueshopconfirmation()
	 {
		
		 return(ContinueshopMsg.getText());
		 
	     
	 }
	 
}


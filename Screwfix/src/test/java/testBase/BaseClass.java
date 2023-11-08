package testBase;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;


//.TakesScreenshot.getScreenshotAs(org.openqa.selenium.OutputType)" because "takesScreenshot" is null
//at testBase.BaseClass.captureScreen(BaseClass.java:167)

public class BaseClass {
	
	public static WebDriver driver;
	public Logger logger;
	public static ResourceBundle rb;
	
	
	@BeforeMethod()
	@Parameters({"browser"})
	public void setup(String br)
	{
		rb=ResourceBundle.getBundle("Config");
		logger=LogManager.getLogger(this.getClass());
		logger.info("Broswer launch");
		
	    
	   // WebDriver driver=WebDriverManager.chromedriver().create();
	
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
		//To launch browser
		if(br.equalsIgnoreCase("chrome")) {
			logger.info("launch chrome browser");
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}else if(br.equalsIgnoreCase("edge")) {
			logger.info("launch edge browser");
			
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}else if(br.equalsIgnoreCase("firefox ")){
			logger.info("launch Firefox browser");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
		}
		
		logger.info("Window is maximise");
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get(rb.getString("appurll"));
	    driver.manage().window().maximize();
	    
	   
			
		
		
	}
				
					
	@AfterMethod()
	public void tearDown() {
		driver.close();
	}
		
		
	

	
		
	
	
	public String randomestring()
	{
		String generatedString=RandomStringUtils.randomAlphanumeric(8);
		return generatedString;
	}
	
	
	
	
	public String randomeNumber()
	{
		String generatedNumber=RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}
	
	
	
	public String randomeAlphaNumeric()
	{
		String generatedString=RandomStringUtils.randomAlphanumeric(12);
		
		String generatedNumber=RandomStringUtils.randomNumeric(2);
		
		return(generatedString+generatedNumber);
	}
	
	
	
	
	  public  String Passwordgenerator()
	  {
		  String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String lower = "abcdefghijklmnopqrstuvwxyz";
			String number="0123456789";
			String specialchars="!£$%^&*_+@~?";
			
			String combination=upper+lower+number+specialchars;
			int len=10;
			char[] password=new char[len];
			Random r=new Random();
			
			for(int i=0;i<len;i++) {
				password[i]=combination.charAt(r.nextInt(combination.length()));
			}
			return combination;
			
			//System.out.println("Generated Password is : "+new String(password));
			
		
		}
		  
		 public String Enterpostcode()
		 {
			 String Postcode="ME7 1TX";
			return Postcode;
		 }
	
		 public  String captureScreen(String tsname) throws IOException {

				String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
						
				TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
				File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
				String location = System.getProperty("user.dir") + "\\screenshots\\" + tsname + "_" + timeStamp + ".png";

				try {
					FileUtils.copyFile(source, new File(location));
				} catch (Exception e) {
					e.getMessage();
				}
				return location;

			}


		

		
			
		} 
	  




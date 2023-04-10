package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver = null;
	
	
@Given("browser is open")
public void browser_is_open() {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
	
	driver=new ChromeDriver(option);
	
	String projectpath=System.getProperty("user.dir");
	
   System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
   System.out.println("Projectpath is:" + projectpath);
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.manage().window().maximize();
}

@Given("user is on google search page")
public void user_is_on_google_search_page() {
	
	driver.navigate().to("https://www.google.com/");
	driver.findElement(By.xpath("//button[@id='L2AGLb']")).click();
	System.out.println("inside step- system");
	
	
}

@And("user enters a text in search box")
public void user_enters_a_text_in_search_box() {
	System.out.println("inside step- search box");
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation step by step");
	
}

@When("hits enter")
public void hits_enter() {
	
	driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
	
	System.out.println("inside step- Key entered");   
}

@Then("user is navigated to search results page")
public void user_is_navigated_to_search_results() {
	
	driver.getPageSource().contains("Online Courses");
	System.out.println("inside step- kaykay");
	
	driver.close();
}




}

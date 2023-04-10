//package StepDefinition;
//
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class HooksDemoSteps {
//	
//	 WebDriver driver=null;
//	 
//	@Before 
//	public void browsersetup() {
//		
//		System.out.println("I am inside browser set up");
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().window().maximize();
//		
//	}
//    
//	@After
//    public void teardown()
//    {
//    	driver.close();
//    }
//    
//    
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//
//
//	}
//
//	@When("user enters valid username and password")
//	public void user_enters_valid_username_and_password() {
//
//
//
//	}
//
//	@And("clicks on login button")
//	public void clicks_on_login_button() {
//
//
//
//	}
//
//	@Then("user is navigated to the home page")
//	public void user_is_navigated_to_the_home_page() {
//
//
//
//	}
//
//
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//}

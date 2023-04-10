package runner;


	


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * single forward class will work on all computer
 * Runner need Junit to work
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/login.feature",
glue={"stepDefinitionCMD"},
plugin = {"json:target/cucumber.json"})


     
		
public class TestRunner {

}

	
	
	



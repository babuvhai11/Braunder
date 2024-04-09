package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features=".//Features/desheCartSignin.feature",	
	glue = "stepDefinition",
	tags = "@Nahid",
	//strict = true,
	monochrome = true
	//plugin= {"pretty", "html:target/cucumber"}
	   	   		 
)

public class TestNGRunner extends AbstractTestNGCucumberTests {

}

package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features/One.feature"},
		glue = "stepDefinitions")
public class OneRunner {

}

//
//features={"src/test/resources/features/01 SignIn.feature", 
//		"src/test/resources/features/03 SimpleSignOut.feature"}
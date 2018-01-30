package stepDefinitions;

import org.openqa.selenium.WebDriver;

import common.SeleniumDriver;
import cucumber.api.java.After;

public class Hooks {

	WebDriver driver;
	@After
	public void tearDown() {
		driver = SeleniumDriver.getInstance().getDriver();
		driver.close();
	}
	
}

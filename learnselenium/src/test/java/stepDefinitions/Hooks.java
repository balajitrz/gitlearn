package stepDefinitions;

import org.openqa.selenium.WebDriver;

import common.SeleniumDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	WebDriver driver;
	
	@Before
	public void startDriver() {
		driver = SeleniumDriver.getInstance().getDriver();
		driver.get("https://www.google.com");
		System.out.println("Driver started");
	}
	
	@After
	public void closeDriver() {
		System.out.println("Driver closed");
		driver.close();
	}
	
}

package common;

import org.openqa.selenium.WebDriver;

public class Navigation {

	WebDriver driver;
	
	public Navigation() {
		driver = SeleniumDriver.getInstance().getDriver();
	}
	
	public void goToURL(String url) {
		driver.get(url);
	}
	
}

package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.SeleniumDriver;

public class HomePage {

	WebDriver driver;
	By searchBox = By.id("searchInput");
	By logoText = By.cssSelector("h1.central-textlogo");
	
	public HomePage() {
		driver = SeleniumDriver.getInstance().getDriver();
	}

	public String getLogoText() {
		return driver.findElement(logoText).getText();
	}
	
	public boolean isSearchBoxDisplayed() {
		return driver.findElement(searchBox).isDisplayed();
	}
}
	


package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriver {

	private static WebDriver driver;
	public static SeleniumDriver instance;
	
	private SeleniumDriver() {
		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	}
	
	public static SeleniumDriver getInstance() {
		if(instance == null)
			instance = new SeleniumDriver();
		return instance;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	
}

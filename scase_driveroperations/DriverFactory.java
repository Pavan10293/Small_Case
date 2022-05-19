//$Id$
package scase_driveroperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

	public static WebDriver launchAndReturnDriverObject() {
		System.setProperty("webdriver.gecko.driver", "/home/local/ZOHOCORP/pavan-7717/Documents/GeckoDriver/geckodriver");  
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
}
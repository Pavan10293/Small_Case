//$Id$
package scase_seleniumoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActions {

	WebDriver driver;
	
	public SeleniumActions(WebDriver driver) {
		this.driver = driver;
	}
	
	public void waitForAnElementTobeVisible(By element, int timeInSeconds) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
	
}

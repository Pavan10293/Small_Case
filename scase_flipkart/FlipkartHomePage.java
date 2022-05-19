//$Id$
package scase_flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartHomePage {
	
	WebDriver driver;
	
	public FlipkartHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By loginPopupCloseIcon = By.cssSelector("[class='_2KpZ6l _2doB4z']");
	private By productSearchTextBox = By.name("q");
	private By productSearchButton = By.cssSelector("button[class='L0Z3Pu'][type='submit']");
	
	public void closeLoginPopupIfShownOnLanding() {
		WebElement loginCloseIcon = driver.findElement(loginPopupCloseIcon);
		if(loginCloseIcon.isDisplayed()) {
			loginCloseIcon.click();
		}
	}
	
	public void typeProductToSearch(String productName) {
		driver.findElement(productSearchTextBox).sendKeys(productName);
	}
	
	public void clickSearchButton() {
		driver.findElement(productSearchButton).click();
	}
	
}
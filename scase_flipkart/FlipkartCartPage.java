//$Id$
package scase_flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import scase_seleniumoperations.SeleniumActions;

public class FlipkartCartPage {

	WebDriver driver;
	SeleniumActions selAct;
	
	public FlipkartCartPage(WebDriver driver) {
		this.driver = driver;
		selAct = new SeleniumActions(driver);
	}
	
	private By addQuantityButton = By.xpath("//button[text()='+']");
	private By totalAmountPayable = By.xpath("//div[text()='Total Amount']/parent::div//following-sibling::span");
	
	public void increaseQuanityByOneUnit() throws Exception{
		selAct.waitForAnElementTobeVisible(addQuantityButton, 10);
		WebElement element = driver.findElement(addQuantityButton);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(addQuantityButton).click();
		Thread.sleep(5000);
	}
	
	public String getTotalAmountFromCartPage() {
		return driver.findElement(totalAmountPayable).getText().trim();
	}
}

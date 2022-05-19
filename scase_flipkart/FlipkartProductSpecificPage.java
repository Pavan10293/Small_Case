//$Id$
package scase_flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartProductSpecificPage {

	WebDriver driver;
	
	public FlipkartProductSpecificPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By addToCartButton = By.xpath("//button[text()='ADD TO CART']");
	private By productPrice = By.cssSelector("[class='_30jeq3 _16Jk6d']");
	private By deliveryPincode = By.id("pincodeInputId");
	private By pincodeCheckButton = By.className("_2P_LDn");
	
	public String getPriceOfTheProduct() {
		return driver.findElement(productPrice).getText().trim();
	}
	
	public void inputPincodeAndCheck(int pincode) {
		driver.findElement(deliveryPincode).click();
		driver.findElement(deliveryPincode).sendKeys(pincode+"");
		driver.findElement(pincodeCheckButton).click();
	}
 	
	public void addProductToCart() {
		driver.findElement(addToCartButton).click();
	}
	
}

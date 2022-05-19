//$Id$
package scase_testCases;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import scase_driveroperations.DriverFactory;
import scase_flipkart.FlipkartCartPage;
import scase_flipkart.FlipkartHomePage;
import scase_flipkart.FlipkartProductSpecificPage;
import scase_flipkart.FlipkartSearchResultsPage;

public class Scenario_1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = DriverFactory.launchAndReturnDriverObject();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		String productName = "vu tv";
		
		FlipkartHomePage homePage = new FlipkartHomePage(driver);
		FlipkartSearchResultsPage resultsPage = new FlipkartSearchResultsPage(driver);
		FlipkartProductSpecificPage productPage = new FlipkartProductSpecificPage(driver);
		FlipkartCartPage cartPage = new FlipkartCartPage(driver);
		
		driver.get("https://www.flipkart.com/");
		homePage.closeLoginPopupIfShownOnLanding();
		homePage.typeProductToSearch(productName);
		homePage.clickSearchButton();
		
		resultsPage.clickOnFirstItemInSearchResult();
		
		System.out.println("Price of 1 unit of "+productName+":- "+productPage.getPriceOfTheProduct());
		productPage.inputPincodeAndCheck(635109);
		productPage.addProductToCart();
		
		cartPage.increaseQuanityByOneUnit();
		System.out.println("Price of 2 units of "+productName+":- "+cartPage.getTotalAmountFromCartPage());
		
		driver.quit();
	}
	
	

}
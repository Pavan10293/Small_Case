//$Id$
package scase_flipkart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartSearchResultsPage {

	WebDriver driver;
	
	public FlipkartSearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By firstItemInSearchResultsList = By.xpath("//div[@class='_1YokD2 _3Mn1Gg']//div[@class='_1AtVbE col-12-12'][1]//a");
	
	public Set<String> clickOnFirstItemInSearchResult() {
		driver.findElement(firstItemInSearchResultsList).click();
		Set<String> windowHandles =  driver.getWindowHandles();
		Iterator<String> ite = windowHandles.iterator();
		while(ite.hasNext()) {
			driver.switchTo().window(ite.next());
		}
		return windowHandles;
	}
	
}

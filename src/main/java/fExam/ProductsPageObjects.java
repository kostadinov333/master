package fExam;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductsPageObjects {

	@FindBy(how = How.NAME, using = "filter_name")
	private static WebElement filter;
	@FindBy(how = How.LINK_TEXT, using = "Filter")
	private static WebElement filterButton;
	@FindBy(how = How.CSS, using = "td:contains('kazan')")
	private static WebElement kazanisPresent;

	public static void populateFilterAndClick(String productName) {
		filter.sendKeys(productName);
		filterButton.click();
	}
	
	
	public static void assertIfElementIsPresent(){
		
		assertTrue(kazanisPresent.isDisplayed());
	
}
}

package fExam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.Browser;

import static org.junit.Assert.*;



public class DashboardPageObject {
	public static WebDriver driver;

	public static boolean isAt() {

		try {
			System.out.println("Browser.driver.findElement(By.xpath(\"//h1\")).getText()"
					+ Browser.driver.findElement(By.xpath("//h1")).getText());

			assertEquals(Browser.driver.findElement(By.xpath("//h1")).getText(), "Dashboard");
		} catch (Throwable e) {
			return false;
		}
		return true;

	}

	
	
	@FindBy(how = How.CSS, using = "#catalog > a.top")
	private static WebElement Catalog;
	
	@FindBy(how = How.CSS, using = "a:contains('Products')")
	private static WebElement Products;
	
	public static void clickCatalaog(){
		Catalog.click();
	}

	public static void clickCatalogAndProducts() {
		Catalog.click();
		Products.click();
	}
	
	
	public static void mouseClickByLocator( String cssLocator ) {
	     String locator = cssLocator;
	     WebElement el = Browser.driver.findElement( By.cssSelector( locator ) );
	     Actions builder = new Actions(driver);
	     builder.moveToElement( el ).click( el );
	     builder.perform();
	}

}

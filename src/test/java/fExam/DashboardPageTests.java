package fExam;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DashboardPageTests {

	public static WebDriver driver;

	// public static WebDriver driver;
	//
	@Test
	public void DashboardCatalog() throws Throwable {

		//DashboardPageObject.clickCatalaog();

		driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")).click();
		Select make = new Select(driver.findElement(By.xpath("//a[contains(text(),'Catalog')]")));

		assertFalse(make.isMultiple());
		assertEquals(9, make.getOptions().size());

		List<String> exp_options = Arrays.asList(new String[] { "Categories", "Products", "Filters", "Attributes",
				"Options", "Manufacturers", "Downloads", "Reviews", "Information" });
		List<String> act_options = new ArrayList<String>();

		for (WebElement option : make.getOptions())
			act_options.add(option.getText());

		assertArrayEquals(exp_options.toArray(), act_options.toArray());
		make.selectByVisibleText("Products");
		assertEquals("Products", make.getFirstSelectedOption().getText());

	}

}
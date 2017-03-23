package fExam;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreateProductPageObjects {

	
	@FindBy(how = How.CSS, using = "a:contains('Insert')")
	private static WebElement clickInsertButon;
	@FindBy(how = How.NAME, using = "product_description[1][name]")
	private static WebElement productName;
	@FindBy(how = How.CSS, using = "a:contains('Data')")
	private static WebElement data;
	@FindBy(how = How.NAME, using = "model")
	private static WebElement Model;
	@FindBy(how = How.CSS, using = "a:contains('Save')")
	private static WebElement clickSaveButon;
	
	public static void clickOnInsert(){
		clickInsertButon.click();
	}
	public static void clickOnData(){
		data.click();
	}
	public static void clickOnSave(){
		clickSaveButon.click();
	}
	public static void insertProductName(String ProductName) {
		productName.sendKeys(ProductName);
	}
	public static void insertModelName(String ModelName) {
		Model.sendKeys(ModelName);
	}
	public static void populateCreatingProduct(String ProductName, String ModelName) {
		clickOnInsert();
		insertProductName(ProductName);
		clickOnData();
		insertModelName(ModelName);
		clickOnSave();

	}
}

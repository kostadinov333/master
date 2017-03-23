package fExam;

import org.junit.Test;

public class ProductTestPage {

	@Test
	public static void productTest(){
		
		
		ProductsPageObjects.populateFilterAndClick("kazan");
		
		ProductsPageObjects.assertIfElementIsPresent();
		
	}
}

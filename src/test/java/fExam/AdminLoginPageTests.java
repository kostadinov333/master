package fExam;

import org.junit.Test;

import utils.Browser;

public class AdminLoginPageTests {

	
	@Test
	public void successfulLogin() throws Throwable {
	
//		Browser.init("firefox");
//		Browser.init("chrome");
		Browser.init();		
			
		AdminLoginPage.open();
		
//		AdminLoginPage.populateUsername("nashiqtUsername");
//		
//		AdminLoginPage.populatePassword("nashiqtPass");
		
//		AdminLoginPage.populateCredentials("admin", "parola");
//		AdminLoginPage.clickLogin();
//		
		
		AdminLoginPage.login("admin", "parola");
		
		Thread.sleep(2000);
		
		if(DashboardPageObject.isAt()){
			System.out.println("uspeh");
		} else {
			System.out.println("greda!");
		}
		
		//Browser.close();
		
	}
	
	
	
	
}

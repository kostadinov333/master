import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
public static WebDriver driver;
	
	

	public static void init(String string) {
		// TODO Auto-generated method stub
		System.out.println("neshto");

	}

	public static void init() {

		System.setProperty("webdriver.gecko.driver", "E:\\univarsaty\\QA-compleate\\Selenium\\BrawserDrv\\geckodriver-v0.15.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	public static void close() {
		System.out.println("Closing browser");
		driver.quit();
	}

}

package SeleniumGrid;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTwo extends Base {
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		initializeBrowser("firefox");
	}

	@Test
	public void testTwo() {
		driver.get("https://www.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}

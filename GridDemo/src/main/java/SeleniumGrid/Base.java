package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {
	
	public static WebDriver driver ;
	public void initializeBrowser(String browserName) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		if(browserName.equals("chrome")) {
			cap.setBrowserName("chrome");
		}else if(browserName.equals("firefox")) {
			
			cap.setBrowserName("firefox");
		}
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), cap);
	}
	


}

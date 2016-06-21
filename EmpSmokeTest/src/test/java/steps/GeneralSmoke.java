package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GeneralSmoke {
	
	WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	}
	
	@Test(description="Open page")
	public void setUp() {
	driver = new ChromeDriver();
	driver.get("http://www.wp.pl");
	}
	
	@Test(description="Close browser")
	public void tearDown(){
		driver.close();
	}
	
}

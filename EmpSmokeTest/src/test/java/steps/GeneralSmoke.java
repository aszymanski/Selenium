package steps;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.SoftAssertions;
import org.assertj.core.util.VisibleForTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GeneralSmoke {
	
	WebDriver driver;
	
	static {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	}
	
	@Test(description="Open page")
	public void setUp() {
		boolean check = false;
		driver = new ChromeDriver();
		driver.get("http://www.wp.pl");
	
		SoftAssertions softAssertions = new SoftAssertions();
		softAssertions.assertThat("ss").isNotEqualTo("sqasa");
		softAssertions.assertAll();
	}

	@Test(description="Close browser")
	public void tearDown(){
		driver.close();
	}
	
}

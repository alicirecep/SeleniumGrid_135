package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import manage.DriverFactory;
import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

public class Hooks {
	protected static WebDriver driver;

	@Before
	public void setUp() {
		String browser = System.getProperty("browser", ConfigReader.getProperty("defaultBrowser"));
		boolean isRemote = Boolean.parseBoolean(System.getProperty("isRemote", ConfigReader.getProperty("isRemote")));
		driver = DriverFactory.getDriver(browser, isRemote);
	}

	@After
	public void tearDown() {
		DriverFactory.quitDriver();
	}
}


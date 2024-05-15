package stepDefinitions;

import manage.DriverManage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GridTest_02 {

	DriverManage driverManage = new DriverManage();
	static WebDriver driver;

	@Test
	void chromeRemoteTest(){

		driver = driverManage.setUpChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

	@Test
	void firefoxRemotetest(){

		driver = driverManage.setUpFirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}


}

package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import manage.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class GoogleStepDefinition {
	WebDriver driver = Hooks.driver;

	@Given("Google ana sayfasina git")
	public void googleAnaSayfasinaGit() {
		driver.get("https://www.google.com");
	}

	@Then("Basligin {string} oldugunu dogrula")
	public void basliginOldugunuDogrula(String expectedTitle) {
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle,actualTitle);
	}

	@Then("Sayfayi kapat")
	public void sayfayiKapat() {
		DriverFactory.quitDriver();
	}

}
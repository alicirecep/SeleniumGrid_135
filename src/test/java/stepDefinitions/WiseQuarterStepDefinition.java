package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WiseQuarterStepDefinition {

	WebDriver driver = Hooks.driver;

	@Given("WiseQuarter ana sayfasina git.")
	public void wise_quarter_ana_sayfasina_git() {
		driver.get("https://www.wisequarter.com");
	}

	@Given("WiseQuarter site basliginin {string} oldugunu dogrula.")
	public void wise_quarter_site_basliginin_oldugunu_dogrula(String expTitle) {
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle,expTitle);
	}
}

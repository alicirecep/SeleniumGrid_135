package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

public class YoutubeStepDefinition {

	WebDriver driver = Hooks.driver;

	@Given("Youtube ana sayfasina git.")
	public void youtube_ana_sayfasina_git() {
		driver.get("https://www.youtube.com");

	}
	@Given("Basligin {string} oldugunu dogrula.")
	public void basligin_oldugunu_dogrula(String expTitle) {
		String actTitle = driver.getTitle();
		assertEquals(actTitle,expTitle);

	}
	@Given("Sayfayi kapat.")
	public void sayfayi_kapat() {
		// Bu adim yerine hooks classindaki TearDown methodu calisiyor.

	}

}

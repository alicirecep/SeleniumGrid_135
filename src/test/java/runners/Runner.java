package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Features", // Özellik dosyalarınızın yolu
		glue = "stepDefinitions", // Adım tanımları ve hooks class'inin oldugu paketiniz
		tags = "@Test", // Çalıştırılacak testlerin etiketleri
		plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
		monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {
	// Burada herhangi bir özel kod bulunmasına gerek yok
}



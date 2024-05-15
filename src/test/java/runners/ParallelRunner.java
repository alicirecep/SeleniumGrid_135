package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

@CucumberOptions(
		features = "src/test/resources/Features", // Özellik dosyalarınızın yolu
		glue = "stepDefinitions", // Adım tanımları ve hooks sınıfınızın paketi
		tags = "@Test", // Çalıştırılacak testlerin etiketleri
		plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
		monochrome = true
)
public class ParallelRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}


package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
		features = "src/test/resources/Features",
		glue = "stepDefinitions",
		plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
		monochrome = true
)
public class CrossBrowserRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@Test(dataProvider = "scenarios")
	public void runScenario(io.cucumber.testng.PickleWrapper pickleWrapper, io.cucumber.testng.FeatureWrapper featureWrapper) {
		super.runScenario(pickleWrapper, featureWrapper);
	}
}




package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src//test//resources//features//AddItems.feature",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome=true
				
		)
public class DemoblazeRunner extends AbstractTestNGCucumberTests {

}

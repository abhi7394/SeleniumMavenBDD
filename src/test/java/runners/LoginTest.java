package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinations", tags = "@Logintest", monochrome = true)

public class LoginTest extends AbstractTestNGCucumberTests {

}

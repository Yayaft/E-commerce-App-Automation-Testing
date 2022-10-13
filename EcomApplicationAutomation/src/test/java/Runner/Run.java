package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        glue = "stepDefinitions",
        //dryRun = true,
        monochrome = true,
        plugin = {"pretty", "html:target/htmlreports"}
)
public class Run extends AbstractTestNGCucumberTests {
}

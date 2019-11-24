package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberHTML-report"},
        features = "src/test/resources/uiFeatures",
        glue ="stepDefs",
        dryRun = false,
       tags ="@TECTC_1014"

)
public class UiTestRunner {


}

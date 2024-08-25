package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/PLP.feature",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/PLP-Reports.html",
                "json:target/json-report/PLP-Reports.json",
                "junit:target/cucumber-reports/PLP-Reports.xml"
        },
        tags ="@PLP_Filtering",
        dryRun = false
)

public class plpRunner {
}
package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/TrendyolReports.html",
                "json:target/json-report/TrendyolReports.json",
                "junit:target/cucumber-reports/TrendyolReports.xml"
        },
        dryRun = false
)

public class Runner {
}

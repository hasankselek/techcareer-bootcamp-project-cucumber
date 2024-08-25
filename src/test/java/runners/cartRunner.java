package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Cart.feature",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/Cart-Reports.html",
                "json:target/json-report/Cart-Reports.json",
                "junit:target/cucumber-reports/Cart-Reports.xml"
        },
        tags ="@Cart",
        dryRun = false
)

public class cartRunner {
}
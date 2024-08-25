package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Login.feature",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/Login-Reports.html",
                "json:target/json-report/Login-Reports.json",
                "junit:target/cucumber-reports/Login-Reports.xml"
        },
        tags ="@Login",
        dryRun = false
)

public class loginRunner {
}
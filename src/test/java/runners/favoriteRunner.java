package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/Favorite.feature",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/Favorite-Reports.html",
                "json:target/json-report/Favorite-Reports.json",
                "junit:target/cucumber-reports/Favorite-Reports.xml"
        },
        tags ="@Favorite",
        dryRun = false
)

public class favoriteRunner {
}
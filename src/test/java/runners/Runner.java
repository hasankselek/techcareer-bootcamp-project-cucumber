package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // Feature dosyalarının yolu
        glue = {"stepDefinitions"},                // Step Definitions sınıflarının yolu
        plugin = {
                "pretty",                              // Konsolda daha okunabilir bir çıktı sağlar
                "html:target/cucumber-reports.html"    // HTML raporu oluşturur (opsiyonel)
        },
        tags = "@positive",
        monochrome = true                          // Konsol çıktısını daha okunabilir hale getirir
)
public class Runner {
}

package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver() {
    }

    public static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            String istenenBrowser = ConfigReader.getProperty("browser"); // firefox

            switch (istenenBrowser) {
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        return driver;

    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;

        }

    }
}
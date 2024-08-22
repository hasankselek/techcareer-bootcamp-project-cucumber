package utils;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


public class ReusableMethods {

    static Actions actions = new Actions(Driver.getDriver());



    public static void wait(int saniye) {

        try {
            Thread.sleep(saniye * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public static List<String> stringListesineDonustur(List<WebElement> webelementListesi) {

        List<String> istenenStringList = new ArrayList<>();

        for (WebElement eachElement : webelementListesi
        ) {
            istenenStringList.add(eachElement.getText());
        }

        return istenenStringList;
    }

    public static void changeWindow(String Url, WebDriver driver) {
        Set<String> allWindowWDHSet = driver.getWindowHandles();

        for (String eachWhd : allWindowWDHSet
        ) {
            driver.switchTo().window(eachWhd);

            if (driver.getCurrentUrl().equals(Url)) {
                break;
            }
        }
    }

    public static void webElementSS(WebElement ssElement) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter tarihFormati = DateTimeFormatter.ofPattern("yyMMddHHmmss");
        String tarihMuhru = ldt.format(tarihFormati);

        File webElementSS = new File("target/screenshots/webelementSS" + tarihMuhru + ".png");
        File geciciDosya = ssElement.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(geciciDosya, webElementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getScreenshot(String name) throws IOException {

        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }

    public static void scrollToElement(WebElement element) {
        JSUtilities.scrollToElement(Driver.getDriver(),element);
    }









}

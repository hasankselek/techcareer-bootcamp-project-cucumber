package utils;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


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

            if (driver.getCurrentUrl().contains(Url)) {
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
            Assert.assertTrue(element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }

    public static void scrollToElement(WebElement element) {
        JSUtilities.scrollToElement(Driver.getDriver(),element);
    }

    public static void clickWithText(String text){
        Driver.getDriver().findElement(By.xpath("//*[text()='" + text + "']")).click();
    }

    public static void sortingLowToHighVerification(List<WebElement> priceElements) {
        List<Integer> prices = new ArrayList<>();

        for (WebElement priceElement : priceElements) {

            String priceText = priceElement.getText().replaceAll("\\D", "");

            try {
                int price = Integer.parseInt(priceText);
                price = price / 100;
                prices.add(price);
            } catch (NumberFormatException e) {
                System.out.println("Could not parse price: " + priceText);
            }

        }
        prices.sort(Integer::compareTo);

        List<Integer> originalPrices = new ArrayList<>(prices);
        Assert.assertEquals(prices, originalPrices);
    }

    public static void sortingHighToLowVerification(List<WebElement> priceElements) {

        List<Integer> prices = new ArrayList<>();

        for (WebElement priceElement : priceElements) {

            String priceText = priceElement.getText().replaceAll("\\D", "");
            try {
                int price = Integer.parseInt(priceText);
                price = price / 100;
                prices.add(price);

            } catch (NumberFormatException e) {
                System.out.println("Could not parse price: " + priceText);
            }

        }
        prices.sort(Comparator.reverseOrder());

        List<Integer> originalPrices = new ArrayList<>(prices);
        Assert.assertEquals(prices, originalPrices);
    }

    public static void clickRandomlyOnScreen(WebDriver driver) {
        // Tarayıcı penceresinin genişliği ve yüksekliğini alın
        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();

        // Rastgele x ve y koordinatları oluşturun
        Random random = new Random();
        int x = random.nextInt(width);
        int y = random.nextInt(height);

        // Rastgele bir koordinata tıklama işlemi gerçekleştirin
        Actions actions = new Actions(driver);
        actions.moveByOffset(x, y).doubleClick().perform();
    }









}

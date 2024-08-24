package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FavoritePage extends BasePage {

    @FindBy(xpath = "(//span[@class='prdct-desc-cntnr-name no-white-space'])")
    public List<WebElement> favouriteProducts;

    @FindBy(xpath = "(//div[@class='ufvrt-btn-wrppr'])")
    public List<WebElement> deleteButtons;

    public void checkFavouriteProducts(String expectedText) {
        boolean isProductFound = false;
        for (int i = 0; i < favouriteProducts.size(); i++) {
            try {
                Assert.assertTrue(favouriteProducts.get(i).getText().contains(expectedText));
                isProductFound = true;
                break;
            } catch (AssertionError e) {

            }
        }
    }

    public void deleteAllFavouriteProducts() {
        for (int i = 0; i < deleteButtons.size(); i++) {
            deleteButtons.get(0).click();
        }
    }
}

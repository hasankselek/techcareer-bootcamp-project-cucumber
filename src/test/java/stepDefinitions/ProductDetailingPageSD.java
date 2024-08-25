package stepDefinitions;

import io.cucumber.java.en.*;
import pages.ProductDetailingPage;
import utils.Driver;
import utils.ReusableMethods;

public class ProductDetailingPageSD {

    ProductDetailingPage productDetailingPage = new ProductDetailingPage();

    @Then("the user is shown a notification that the product was successfully added to the cart")
    public void the_user_is_shown_a_notification_that_the_product_was_successfully_added_to_the_cart() {

        ReusableMethods.verifyElementDisplayed(productDetailingPage.addToBasketSusccesText);
    }

    @And("the user clicks Anladım button")
    public void the_User_Clicks_Anladım_Button() {
        ReusableMethods.changeWindow("https://www.trendyol.com/ovivo",Driver.getDriver());
        ReusableMethods.wait(2);
        productDetailingPage.anladimButton.click();

    }
}

package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.CartPage;
import pages.HomePage;
import utils.ReusableMethods;

public class CartSD {
    CartPage cartPage = new CartPage();
    ProductDetailingPageSD page = new ProductDetailingPageSD();
    HomePage homePage = new HomePage();

    int productFirstPrice;

    @Then("The user is shown a message indicating that the cart is empty")
    public void the_user_is_shown_a_message_indicating_that_the_cart_is_empty() {

        Assert.assertTrue(cartPage.emptyChartText.isDisplayed());
    }

    @Then("the user clicks on Sepetim and verifies product name and price added to cart")
    public void theUserClicksOnAndVerifiesProductNameAndPriceAddedToCart() {
        homePage.sepetimButton.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(cartPage.chartProductName.isDisplayed());
        Assert.assertTrue(cartPage.chartProductPrice.isDisplayed());


    }

    @Then("the user is correct that the price of the product is increased when the number of products is increased")
    public void theUserIsCorrectThatThePriceOfTheProductIsIncreasedWhenTheNumberOfProductsIsIncreased() {
        ReusableMethods.scrollToElement(cartPage.chartProductPrice);
        productFirstPrice = Integer.parseInt(cartPage.chartProductPrice.getText().replaceAll("\\D",""));
        cartPage.increaseProductQuantity.click();
        ReusableMethods.wait(3);
        Assert.assertEquals(productFirstPrice*2,cartPage.totalPrice());
    }

    @Then("The user is correct that the price of the product is increased when the number of products decreases")
    public void theUserIsCorrectThatThePriceOfTheProductIsIncreasedWhenTheNumberOfProductsDecreases() {
        productFirstPrice = Integer.parseInt(cartPage.chartProductPrice.getText().replaceAll("\\D",""));
        ReusableMethods.wait(3);
        cartPage.decreaseProductQuantity.click();
        ReusableMethods.wait(3);
        Assert.assertEquals(productFirstPrice/2,cartPage.totalPrice());
    }

    @And("the user deletes all products from chart")
    public void theUserDeletesAllProductsFromChart() {

        ReusableMethods.clickWithText("Sil");
    }
}

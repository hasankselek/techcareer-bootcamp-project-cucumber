package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ProductListingPage;
import utils.Driver;
import utils.ReusableMethods;

public class ProductListingPageSD {

    ProductListingPage productListingPage = new ProductListingPage();

    @Then("the user verifies that on the {string} page")
    public void the_user_verifies_that_on_the_page(String expectedTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }

    @Given("the user write {string} on the left side")
    public void the_user_write_on_the_left_side(String brandName) {

        productListingPage.searchProductBrandName(brandName);
    }

    @Then("the user verifies that correct {string} filtering")
    public void theUserVerifiesThatCorrectFiltering(String brandName) {

        productListingPage.verifyCorrectBrandSearchResult(brandName);
    }

    @Given("the user clicks sorting drop down menu")
    public void the_user_clicks_sorting_drop_down_menu() {

        productListingPage.dropdownMenu.click();
        ReusableMethods.wait(2);
    }
    
    @And("the user clicks {string} price in the dropdown menu")
    public void theUserClicksPriceInTheDropdownMenu(String dropdownText) {
        ReusableMethods.clickWithText(dropdownText);
        ReusableMethods.wait(5);
    }
    
    @Then("the user verifies that all products sorted low to high")
    public void theUserVerifiesThatAllProductsSortedLowToHigh() {
        ReusableMethods.sortingLowToHighVerification(productListingPage.PriceBox);
    }

    @Then("the user verifies that all products sorted high to low")
    public void theUserVerifiesThatAllProductsSortedHighToLow() {
        ReusableMethods.sortingHighToLowVerification(productListingPage.PriceBox);
    }


    @And("the user clicks the Kargo Bedava filter")
    public void theUserClicksTheKargoBedavaFilter() {
        productListingPage.kargoBedavaButton.click();
        ReusableMethods.wait(1);
        
    }

    @Then("the user clicks each product and verifies that all products have free delivery")
    public void theUserClicksEachProductAndVerifiesThatAllProductsHaveFreeDelivery() {
        productListingPage.verifyFreeDelivery();
    }
}

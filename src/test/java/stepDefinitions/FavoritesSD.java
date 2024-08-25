package stepDefinitions;

import io.cucumber.java.en.*;
import pages.FavoritePage;
import pages.ProductListingPage;
import utils.ReusableMethods;

public class FavoritesSD {

    FavoritePage favoritePage = new FavoritePage();
    ProductListingPage productListingPage = new ProductListingPage();

    @Then("the user clicks {string} page and verifies favorite products match")
    public void theUserClicksPageAndVerifiesFavoriteProductsMatch(String pageName) {
        String expectedProductInformation = productListingPage.getProductInfo();
        ReusableMethods.clickWithText(pageName);
        favoritePage.checkFavouriteProducts(expectedProductInformation);


    }

    @And("the user deletes all products from favorite")
    public void theUserDeletesAllProductsFromFavorite() {
        favoritePage.deleteAllFavouriteProducts();

    }
}

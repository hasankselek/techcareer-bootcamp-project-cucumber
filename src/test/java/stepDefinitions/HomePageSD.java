package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utils.ReusableMethods;


public class HomePageSD {

    HomePage homePage = new HomePage();


    @Given("the user opens the {string} homepage")
    public void the_user_opens_the_homepage(String url) {
        homePage.setup(url);
        ReusableMethods.wait(1);
    }

    @When("the user clicks on the Giris Yap button")
    public void the_user_clicks_on_the_giris_yap_button() {
        homePage.erkekText.click();
        homePage.girisYapButton.click();

    }

    @Then("the user verifies that logged in by checking their name {string}")
    public void the_user_verifies_that_logged_in_by_checking_their_name(String expectedText) {
        Assert.assertEquals(expectedText,homePage.hesabimText.getText());
    }
}

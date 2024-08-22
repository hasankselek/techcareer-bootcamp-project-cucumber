package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.HomePage;
import utils.Driver;
import utils.ReusableMethods;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePageSD {

    HomePage homePage = new HomePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    Actions actions = new Actions(Driver.getDriver());


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

    @When("the user selects {string}")
    public void theUserSelects(String gender) {

        ReusableMethods.clickWithText(gender);
    }

    @And("the user searches for {string}")
    public void theUserSearchesFor(String searchText) {
        homePage.fillSearchBox(searchText);
    }
}

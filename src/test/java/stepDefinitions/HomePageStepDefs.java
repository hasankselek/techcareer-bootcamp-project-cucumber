package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class HomePageStepDefs {

    CommonPage commonPage = new CommonPage();
    HomePage homePage = new HomePage();

    @Given("the user opens the {string} homepage")
    public void the_user_opens_the_homepage(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @When("the user clicks on the Sign In button")
    public void the_user_clicks_on_the_sign_ın_button() {

        homePage.signInButton.click();
    }

    @Then("the user verifies that logged in by checking their name {string}")
    public void the_user_verifies_that_logged_in_by_checking_their_name(String fullName) {
        ReusableMethods.bekle(3);
        Assert.assertTrue(homePage.customerNameText.getText().contains(ConfigReader.getProperty(fullName)));

    }

    @When("the user clicks on the Create An Account button")
    public void theUserClicksOnTheCreateAnAccountButton() {

        homePage.createAccountButton.click();
    }
}

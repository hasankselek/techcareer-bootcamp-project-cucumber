package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class CommonSD {

    @Then("Verifies that the user is directed to the {string}")
    public void verifies_that_the_user_is_directed_to_the(String url) {
        ReusableMethods.wait(1);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(ConfigReader.getProperty(url)));
    }

    @And("the user clicks {string} page")
    public void theUserClicksPage(String pageName) {
        ReusableMethods.clickWithText(pageName);

    }

    @When("the user clicks on {string}")
    public void the_user_clicks_on(String text) {
        ReusableMethods.clickWithText(text);
        ReusableMethods.wait(2);
    }
}

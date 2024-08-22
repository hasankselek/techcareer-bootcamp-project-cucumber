package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utils.ConfigReader;
import utils.Driver;

public class CommonSD {


    @Then("Verifies that the user is directed to the {string}")
    public void verifies_that_the_user_is_directed_to_the(String url) {
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ConfigReader.getProperty(url));
    }
}

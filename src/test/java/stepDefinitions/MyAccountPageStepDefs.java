package stepDefinitions;

import io.cucumber.java.en.*;
import pages.MyAccountPage;

public class MyAccountPageStepDefs {

    MyAccountPage page = new MyAccountPage();

    @Then("verifies that the successful account creation message is displayed")
    public void verifies_that_the_successful_account_creation_message_is_displayed() {
        page.verifyCreateSuccessMessage();
    }
}

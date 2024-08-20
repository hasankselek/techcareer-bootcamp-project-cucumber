package stepDefinitions;

import io.cucumber.java.en.*;

import pages.CommonPage;
import pages.LoginPage;
import utils.ReusableMethods;

public class LoginPageStepDefs {


    LoginPage loginPage = new LoginPage();
    CommonPage commonPage = new CommonPage();

    @Then("Verifies that the user is directed to the {string}")
    public void verifies_that_the_user_is_directed_to_the(String pageUrl) {
        commonPage.checkPageUrl(pageUrl);


    }

    @Then("the user enters {string} email login credentials")
    public void the_user_enters_email_login_credentials(String email) {
        loginPage.fillEmail(email);

    }

    @Then("the user enters {string} password login credentials")
    public void the_user_enters_password_login_credentials(String Password) {

        loginPage.fillPassword(Password);

    }

    @Then("clicks on the {string} button")
    public void clicks_on_the_button(String signInText) {
        ReusableMethods.clickElement(signInText);

    }

    @Then("the user should see an error message indicating invalid credentials")
    public void theUserShouldSeeAnErrorMessageIndicatingInvalidCredentials() {
        ReusableMethods.verifyElementDisplayed(loginPage.invalidAccountErrorMessage);
    }

    @Then("the user verifies that the password error message visible")
    public void theUserVerifiesThatThePasswordErrorMessageVisible() {
        ReusableMethods.verifyElementDisplayed(loginPage.invalidAccountErrorMessage);

    }

    @Then("the user verifies that the mail error message visible")
    public void theUserVerifiesThatTheMailErrorMessageVisible() {
        ReusableMethods.verifyElementDisplayed(loginPage.invalidAndEmptyEmailError);
    }

    @Then("the user verifies that the empty mail and error message visible")
    public void theUserVerifiesThatTheEmptyMailAndErrorMessageVisible() {
        loginPage.emptyCredentialsErrors();
    }
}

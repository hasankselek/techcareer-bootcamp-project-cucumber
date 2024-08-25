package stepDefinitions;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.ReusableMethods;

public class LoginPageSD {

    LoginPage loginPage = new LoginPage();

    @And("the user enters {string} email and {string} password login credentials")
    public void theUserEntersEmailAndPasswordLoginCredentials(String email, String password) {

        loginPage.login(email,password);
    }

    @Then("clicks on the Giris Yap button")
    public void clicks_on_the_giris_yap_button() {

        loginPage.girisYapButton.click();
    }

    @Then("the user should see an error message {string} indicating invalid credentials")
    public void theUserShouldSeeAnErrorMessageIndicatingInvalidCredentials(String expectedErrorMessage) {

        ReusableMethods.wait(2);
        loginPage.checkErrorMessage(expectedErrorMessage);
    }

    @Then("user logs in successfully")
    public void userLogsInSuccessfully() {

        loginPage.loginAllSteps();
    }
}
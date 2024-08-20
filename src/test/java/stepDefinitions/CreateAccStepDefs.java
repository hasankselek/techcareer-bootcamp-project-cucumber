package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import pages.CreateAccountPage;

public class CreateAccStepDefs {

    CreateAccountPage createAccountPage = new CreateAccountPage();

    @Then("the user fills in the requested information")
    public void the_user_fills_in_the_requested_information() {

        createAccountPage.createAccount();
    }

    @And("clicks on the Create an Account button")
    public void clicksOnTheCreateAnAccountButton() {

        createAccountPage.createAccountButton.click();
    }

    @And("the user enters an {string} that is already registered")
    public void theUserEntersAnThatIsAlreadyRegistered(String email) {

        createAccountPage.fillExistingEmail(email);
    }

    @Then("the user displays error message")
    public void theUserDisplaysErrorMessage() {

        createAccountPage.alreadyTakenEmailErrorMessage.isDisplayed();
    }

    @Then("the user displays invalid email error message")
    public void theUserDisplaysInvalidEmailErrorMessage() {

        createAccountPage.invalidEmailErrorMessage.isDisplayed();
    }

    @Then("the user should see an error message indicating the passwords do not match")
    public void the_user_should_see_an_error_message_indicating_the_passwords_do_not_match() {
         createAccountPage.mismatchPasswordErrorMessage.isDisplayed();
    }


    @And("the user fills out the registration form and enters mismatched passwords")
    public void theUserFillsOutTheRegistrationFormAndEntersMismatchedPasswords() {
        createAccountPage.mismatchPassword();
    }
}




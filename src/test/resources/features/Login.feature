@login
Feature: User Login

  Background: Common Steps
    Given the user opens the "url" homepage
    When the user clicks on the Sign In button
    Then Verifies that the user is directed to the "loginPage"

  @smoke @positive
  Scenario: Successful login with valid credentials

    And the user enters "validEmail" email login credentials
    And the user enters "validPassword" password login credentials
    And clicks on the "Sign In" button
    Then the user verifies that logged in by checking their name "validFirstName"

  @regression @negative
  Scenario: Unsuccessful login with invalid credentials

    And the user enters "invalidEmail" email login credentials
    And the user enters "invalidPassword" password login credentials
    And clicks on the "Sign In" button
    Then the user should see an error message indicating invalid credentials

  @regression @negative
  Scenario: Unsuccessful login with valid email and invalid password credentials

    And the user enters "validEmail" email login credentials
    And the user enters "invalidPassword" password login credentials
    And clicks on the "Sign In" button
    Then the user verifies that the password error message visible

  @regression @negative
  Scenario: Unsuccessful login with invalid email and valid password credentials

    And the user enters "invalidEmail2" email login credentials
    And the user enters "validPassword" password login credentials
    And clicks on the "Sign In" button
    Then the user verifies that the mail error message visible

  @regression @negative
  Scenario: Unsuccessful login with empty email and empty password credentials

    And the user enters "emptyEmail" email login credentials
    And the user enters "emptyPassword" password login credentials
    And clicks on the "Sign In" button
    Then the user verifies that the empty mail and error message visible


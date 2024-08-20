@register
Feature:

  Background: Common Steps

    Given the user opens the "url" homepage
    When the user clicks on the Create An Account button
    Then Verifies that the user is directed to the "createAccountPage"


  Scenario: Successful User Registration

    And the user fills in the requested information
    And clicks on the Create an Account button
    Then verifies that the successful account creation message is displayed


  Scenario: Registration with Already Registered Email

    And the user fills in the requested information
    And the user enters an "validEmail" that is already registered
    And clicks on the Create an Account button
    Then the user displays error message


  Scenario: Registration with invalid Email

    And the user enters an "invalidEmail2" that is already registered
    And clicks on the Create an Account button
    Then the user displays invalid email error message

  @negative
  Scenario: Registration with Mismatched Passwords

    And the user fills out the registration form and enters mismatched passwords
    And clicks on the Create an Account button
    Then the user should see an error message indicating the passwords do not match
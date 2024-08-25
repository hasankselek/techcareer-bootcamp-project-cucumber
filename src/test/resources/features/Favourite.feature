@Favorite
Feature: As a user, I want to add products to favorites

  Background: User navigates to "Dizüstü Bilgisayar" page
    Given the user opens the "url" homepage
    When clicks on the KABUL ET button


  Scenario: Registered user adds the product to favorites
    Then user logs in successfully
    And the user searches for "Buzdolabı"
    And the user clicks favorite button
    Then the user clicks "Favorilerim" page and verifies favorite products match


  Scenario: Registered deletes the product from favorites
    Then user logs in successfully
    And the user clicks "Favorilerim" page
    And the user deletes all products from favorite

  @a
  Scenario: Unregistered user adds the product to favorites
    And the user searches for "Ütü"
    And the user clicks favorite button
    Then Verifies that the user is directed to the "loginUrl"








@Cart
Feature: Add Product to Cart

Scenarios to ensure that users can add products to the cart, view the cart content, and manage the items in the cart.

  Background:
    Given the user opens the "url" homepage
    When clicks on the KABUL ET button


  Scenario: Unregistered user goes to the empty cart page
    And the user clicks "Sepetim" page
    Then The user is shown a message indicating that the cart is empty


  Scenario: Registered user goes to the empty cart page
    Then user logs in successfully
    And the user clicks "Sepetim" page
    Then The user is shown a message indicating that the cart is empty


  Scenario: Unregistered user adds a product to the cart
    And the user searches for "Grano Füme Komitatör"
    And the user clicks product
    And the user clicks Anladım button
    When the user clicks on "Sepete Ekle"
    Then the user clicks on Sepetim and verifies product name and price added to cart
    And the user deletes all products from chart


  Scenario: Registered user adds a product to the cart
    Then user logs in successfully
    And the user searches for "Grano Füme Komitatör"
    And the user clicks product
    And the user clicks Anladım button
    When the user clicks on "Sepete Ekle"
    Then the user is shown a notification that the product was successfully added to the cart
    Then the user clicks on Sepetim and verifies product name and price added to cart
    And the user deletes all products from chart

  @a
  Scenario: User updates the quantity of a product in the cart
    Then user logs in successfully
    And the user searches for "Grano Füme Komitatör"
    And the user clicks product
    And the user clicks Anladım button
    When the user clicks on "Sepete Ekle"
    Then the user is shown a notification that the product was successfully added to the cart
    Then the user clicks on Sepetim and verifies product name and price added to cart
    Then the user is correct that the price of the product is increased when the number of products is increased
    Then The user is correct that the price of the product is increased when the number of products decreases
    And the user deletes all products from chart


Feature: Add Product to Cart

Scenarios to ensure that users can add products to the cart, view the cart content, and manage the items in the cart.

  Background:
    Given the user opens the "url" homepage
    When clicks on the KABUL ET button

  Scenario: Unregistered user goes to the empty cart page
    When The user clicks on the "Cart" icon without adding any product
    Then The user is shown a message indicating that the cart is empty

  Scenario: Registered user goes to the empty cart page
    Then the user successfully logs in
    When The user clicks on the "Cart" icon without adding any product
    Then The user is shown a message indicating that the cart is empty

  Scenario: Unregistered user adds a product to the cart
    And the user searches for "Dizüstü Bilgisayar"
    And the user clicks product
    When The user clicks the "Sepete Ekle" button for a product they like
    Then The user is shown a notification that the product was successfully added to the cart
    And The user clicks on the "Cart" icon
    Then the user verifies that on the "Login" page

  Scenario: Registered user adds a product to the cart
    Then the user successfully logs in
    And the user searches for "Dizüstü Bilgisayar"
    When The user clicks the "Add to Cart" button for a product they like
    Then The user is shown a notification that the product was successfully added to the cart
    And The user clicks on the "Cart" icon
    And On the cart page, the user sees the product they added with the correct price and quantity

  Scenario: User updates the quantity of a product in the cart
    Then the user successfully logs in
    Given The user has added a product to the cart
    When The user increases the quantity of the product in the cart page
    Then The product quantity should be updated, and the total amount should be recalculated correctly
    When The user decreases the quantity of the product in the cart page
    Then The product quantity should be updated, and the total amount should be recalculated correctly

  Scenario: User removes a product from the cart
    Then the user successfully logs in
    And  The user has added a product to the cart
    When The user removes a product from the cart on the cart page
    Then The product should be removed from the cart, and the total amount should be updated
    And If no other products are in the cart, the user is shown a message indicating that the cart is empty
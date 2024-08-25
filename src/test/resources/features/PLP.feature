@PLP_Filtering
Feature: As a User I want to filter computer on Trendyol web site

  Background: User navigates to "Dizüstü Bilgisayar" page
    Given the user opens the "url" homepage
    When clicks on the KABUL ET button
    And  the user searches for "Dizüstü Bilgisayar"


  Scenario: The user verifies that navigated to Dizüstü Bilgisayar page
    Then the user verifies that on the "Dizüstü Bilgisayar" page


  Scenario Outline: The user verifies that laptop brands are filterable
    And the user write "<BrandName>" on the left side
    Then the user verifies that correct "<BrandName>" filtering
    Examples:
      | BrandName |
      | Apple     |

  Scenario Outline: The user verifies that products are sorted low to high
    And the user write "<BrandName>" on the left side
    And the user clicks sorting drop down menu
    And the user clicks "En düşük fiyat" price in the dropdown menu
    Then the user verifies that all products sorted low to high
    Examples:
      | BrandName |
      | Apple     |


  Scenario Outline: The user verifies that products are sorted high to low
    And  the user write "<BrandName>" on the left side
    And  the user clicks sorting drop down menu
    Then the user clicks "En yüksek fiyat" price in the dropdown menu
    Then the user verifies that all products sorted high to low
    Examples:
      | BrandName |
      | Apple     |

  Scenario: Scenario: The user verifies that products have free delivery
    And  the user write "Apple" on the left side
    And  the user clicks the Kargo Bedava filter
    Then  the user clicks each product and verifies that all products have free delivery

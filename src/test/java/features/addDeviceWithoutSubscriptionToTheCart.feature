Feature: Add the device without subscription to the cart

  Scenario: Verify that the price and instalment amount of the product is the same on the product page and cart page
    Given T-Mobile landing page is open
    When Go to smartwatches and bands without subscription
    And Open a product
    And Add product to cart
    Then The cart page is displayed
    And The price and instalment value on the cart page are the same as on the product page

    Scenario: Verify that the quantity of products in the cart is visible on the landing page
      Given T-Mobile landing page is open
      When Go to smartwatches and bands without subscription
      And Open a product
      And Add product to cart
      And Go to the landing page
      Then The landing page is displayed
      And The quantity of product in the cart is displayed next to the cart icon
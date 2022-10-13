Feature: Order
  Scenario: Logged user could add different products to compare list
    Given The user launch Chrome browser
    When The user opens URL "https://www.mirraw.com/accounts/sign_in"
    When The User enters Email as "elkhashaby@gmail.com" and Password as "Welcome@123"
    When The user clicks on Login
    When User Login successfully
    When User search with "Lehenga"
    When User clicks on search button
    When User clicks on purchase product
    When user clicks on add to cart
    When User clicks on checkout
    Then Order placed successfully
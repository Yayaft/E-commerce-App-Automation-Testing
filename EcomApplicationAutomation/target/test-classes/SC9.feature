Feature: Shopping Cart
  Scenario: Logged user could add different products to Shopping cart
    Given The user launch Chrome browser
    When The user opens URL "https://www.mirraw.com/accounts/sign_in"
    When The User enters Email as "elkhashaby@gmail.com" and Password as "Welcome@123"
    When The user clicks on Login
    When User Login successfully
    When User search with "Lehenga"
    When User clicks on search button
    When User adds product in a Shopping cart
    When User closes the dialog box
    When User again add different product in shopping cart
    When User again closes the dialog box
    Then Different products can be in the Shopping cart
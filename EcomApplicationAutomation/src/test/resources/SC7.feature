Feature: Color Filter in Product
  Scenario: Logged user could filter with color
    Given The user launch Chrome browser
    When The user opens URL "https://www.mirraw.com/accounts/sign_in"
    When The User enters Email as "elkhashaby@gmail.com" and Password as "Welcome@123"
    When The user clicks on Login
    When User Login successfully
    When User search with "Lehenga"
    When User clicks on search button
    When User clicks on a color one
    When User clicks on a color two
    Then Color Results will appear
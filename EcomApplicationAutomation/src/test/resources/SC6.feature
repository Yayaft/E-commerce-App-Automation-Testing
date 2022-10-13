Feature: Currency Switching in Product
  Scenario: Logged User could switch between currencies US-Euro
    Given The user launch Chrome browser
    When The user opens URL "https://www.mirraw.com/accounts/sign_in"
    When The User enters Email as "elkhashaby@gmail.com" and Password as "Welcome@123"
    When The user clicks on Login
    When User Login successfully
    When User search with "Lehenga"
    When User clicks on search button
    When User selects Category checkbox of choli
    When User selects Category for Readymade
    Then Results will appear
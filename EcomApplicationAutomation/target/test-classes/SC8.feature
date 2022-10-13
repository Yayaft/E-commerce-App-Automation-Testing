Feature: Tag in Product
  Scenario: Logged user could select different tags
    Given The user launch Chrome browser
    When The user opens URL "https://www.mirraw.com/accounts/sign_in"
    When The User enters Email as "elkhashaby@gmail.com" and Password as "Welcome@123"
    When The user clicks on Login
    When User Login successfully
    When User search with "Lehenga"
    When User clicks on search button
    When User selects the tag button
    When User Selects popularity from tag
    Then Tag selected successfully
Feature: EcomAppAutomation
  Scenario: User could register with valid data
    Given The user launch Chrome browser
    When The user opens URL "https://www.mirraw.com/accounts/sign_up"
    And User enters Email as "elkhashaby1@gmail.com" Password as "Welcome@123" and confirm Password as "Welcome@123"
    And The user clicks on Register
    And Page Title should be "Artificial Jewellery Online, Buy Fashion, Imitation Jewellery Online India"
    Then User registered successfullyy
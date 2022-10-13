Feature: Reset Password
  Scenario: User could reset his/her password successfully
    Given The user launch Chrome browser
    When The user opens URL "https://www.mirraw.com/accounts/sign_in"
    When The user clicks on Forgot password
    When The user enters the email as "elkhashaby@gmail.com"
    When The user clicks on Send reset password instructions
    Then User password reset successfully
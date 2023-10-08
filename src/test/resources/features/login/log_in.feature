Feature: Log in

  Scenario: Try to log in with not valid credentials
    Given John click on login view
    When he puts username and password
    Then it will be login
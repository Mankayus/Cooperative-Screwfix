Feature: Login functuntionality test

  Scenario: Check login with valid credentials
    Given user is on the login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  @smoke
  Scenario: Check login with invalid credentials
    Given user is on the login page
    When user enters invalid username and password
    And clicks on login button
    Then error message is displayed - Invalid Credentials

Feature: Check login functionality
  
  @Smoke
  Scenario: login
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

  Scenario: login
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

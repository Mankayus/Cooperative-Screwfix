Feature: Check home page functionality

  Background: user is logged in
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage

  Scenario: check logout link
    When user clicks on login button
    Then logout button is displayed

  Scenario: verify order history
    When user clicks on order history
    Then Your order history is displayed

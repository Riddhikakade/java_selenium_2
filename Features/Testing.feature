Feature: feature to check login functionality

  Scenario: Check login successfully with valid credential
    Given browser is open
    When user is on login page
    And user enters username and password
    And Click on the login button
    Then user is navigate to the homepage
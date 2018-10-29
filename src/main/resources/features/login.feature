@OR_01
Feature: test login functionality

  Scenario: successful with the given credential
    Given browser is open
    Given Orange HRM login page is displayed
    And the valid user logs into UI
    Then the main dashboard is displayed
    Given browser is close
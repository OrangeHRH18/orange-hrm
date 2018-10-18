@OR_01
Feature: test login functionality

  Scenario: successful with the given credential
    Given Orange HRM login page is displayed
    And the valid user logs into UI
    Then the main dashboard is displayed
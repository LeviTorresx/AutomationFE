Feature: AlertsManagement

  Background: Since the operator has logged into the system and accessed the alert management module
    Given I am on the Operators login page.

  Scenario: Create a new alert with priority and assigned responsible party
    When the operator creates a new alert
    And assigns a priority level to the alert
    And assigns a responsible party to handle it
    And saves the alert
    Then the system confirms the creation of the alert


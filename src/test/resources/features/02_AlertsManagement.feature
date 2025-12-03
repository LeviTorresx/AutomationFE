Feature: AlertsManagement

  Background:
    Given I am on the Operators login page.

  Scenario Outline: Create a new alert with priority and assigned responsible party
    When the operator creates a new alert with "<area>" "<priority>" "<responsible>" "<description>"
    And saves the alert
    Then the operator sees the newly created alert listed

    Examples:
      | area   | priority | responsible | description       |
      | CarroMotor  | Alta     | Mecánico   | Cambio de aceite  |

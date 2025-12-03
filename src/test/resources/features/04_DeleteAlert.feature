Feature: DeleteAlert

  Background:
    Given I am logged into the Operators panel


  Scenario Outline: Delete an existing alert
    Given the operator selects an existing alert named "<alertName>" for delete
    Then the operator sees the message that the alert has been deleted.

    Examples:
      | alertName  |
      | CarritoMotor  |

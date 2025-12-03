Feature: Operator Login
    As an operator, I want to access the system with my username and password,
    according to the assigned permissions and roles, to manage only the alerts that correspond to me.

    Background: Since the operator has logged into the system and accessed the alert management module

  Scenario Outline: Successful login with valid credentials
    Given the operator is on the login page
    When the operator enters a valid "<username>" and a valid "<password>"
    And clicks the login button
    Then the operator is redirected to the dashboard


    Examples:
      | username                | password      |
      | juan.perez@example.com  | juan          |

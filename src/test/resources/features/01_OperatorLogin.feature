Feature: Operator Login
    As an operator, I want to access the system with my username and password,
    according to the assigned permissions and roles, to manage only the alerts that correspond to me.

    Background: Since the operator has logged into the system and accessed the alert management module
      Given I am on the Operators login page.

    Scenario: Successful login with valid credentials
      When The operator enters a valid username and password.
      And The operator has assigned permissions for alert management.
      Then The system grants access.
      And The system displays only the alerts corresponding to the operator's role or assignment.
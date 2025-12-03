
Feature: EditAlert

  Background:
    Given I am logged into the Operators panel

Scenario Outline: Edit an existing alert data
Given the operator selects an existing alert named "<initialName>"
When the operator edits the alert with "<newArea>" "<newPriority>" "<newResponsible>" "<newDescription>"
And saves the alert changes
Then the operator sees the alert updated with the new information

Examples:
| initialName | newArea   | newPriority | newResponsible | newDescription      |
| CarroMotor  | CarritoMotor    | Media       | Seguridad      | Ajuste preventivo   |
| CarritoMotor  | CarritoMotor    | Alta       | Seguridad      | Ajuste preventivo   |
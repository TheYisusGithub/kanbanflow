Feature: Interaction between the different fields

@Acceptance @DeleteTask @logout
Scenario: The user adds new task and move all table in the board for see the interaction
  Given The user logs in to the kanbanflow page
  When The user adds new to-do task with the following information name task,descriptions, subject
    | Name        | task1      |
    | Description | first task |
    | Subject     | jesus      |
  And The user moves task through board
  Then The user found the task int the field done

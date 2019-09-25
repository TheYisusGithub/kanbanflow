Feature: Create a new task on the whiteboard

  @Acceptance @DeleteTask @logout
  Scenario: The user can add new task to To Do section of a Kanban whiteboard
    Given The user logs in to the kanbanflow page
    When The user adds new to-do task with the following information name task,descriptions, subject
      | Name        | task1      |
      | Description | first task |
      | Subject     | jesus      |
    Then show the task description task1 in the board

  @Acceptance @DeleteTask @logout
  Scenario: The user adds new task and move all table in the board for see the interaction
    Given The user logs in to the kanbanflow page
    When The user adds new to-do task with the following information name task,descriptions, subject
      | Name        | task1      |
      | Description | first task |
      | Subject     | jesus      |
    And The user moves task through board
    Then The user found the task int the field done
Feature: Creation funtional and acceptance

  @Acceptance @DeleteTask @logout
  Scenario: The user adds new task
    Given The user logs in to the kanbanflow page
    When The user adds new to-do task with the following descriptions task1
    Then show the task description task1 in the board

  @Acceptance @DeleteTask @logout
  Scenario: The user adds new task and move all table in the board
    Given The user logs in to the kanbanflow page
    And The user adds new to-do task with the following descriptions task1
    When The user moves task through board
    Then The user found the task int the field done














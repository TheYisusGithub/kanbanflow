Feature: Creation funtional and acceptance

  @Acceptance @logout
  Scenario: The user create a new board
    Given The user logs in to the kanbanflow page
    When The user create a new board with the name board1
    Then The board was create successfully

  @funcional
  Scenario: The user create new board with limit work progress
    Given The user create a board with limit of time that has the name board1
    When The user fill the fields and create the board1
        |To-do      |1|
        |Do today   |1|
        |In progress|1|
        |Done       |1|
    Then The board with limit work was create successfully
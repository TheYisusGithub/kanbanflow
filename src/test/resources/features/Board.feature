Feature: Creation new whiteboard

  @Acceptance @logout
  Scenario: The user create a new board
    Given The user logs in to the kanbanflow page
    When The user create a new board with the name board1
    Then The board was create successfully

Feature: Creation funtional and acceptance

  @Acceptance
  Scenario: The user add new member
    Given The user go to the page kanbanflow to login
    When The user add new member
    Then The access is successfuly

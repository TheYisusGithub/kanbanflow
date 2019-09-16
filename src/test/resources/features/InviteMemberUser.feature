Feature: Member invitation

  @Acceptance @DeleteInvitation @logout
  Scenario: The user invite a new user
    Given The user logs in to the kanbanflow page
    When The user adds a new member with this email 30testemail@gmail.com
    Then The user clicking should show the 30testemail@gmail.com with the pending invitations

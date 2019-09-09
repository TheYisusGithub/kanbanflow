Feature: Creation funtional and acceptance

  @Acceptance
  Scenario: The user invite a new user
  Given The user logs in to the kanbanflow page
  When The user adds a new member with this email testemail@gmail.com.
  And The initials of the new member are displayed on the board.
  And The user clicking should show the email with the pending invitations.
  And The The email should be shown in the list of board members.

  @Negative

  Scenario The user sent and invitations but user exist
  Given The user adds a new member with this email testemailexits@gmail.com.
  When The user send the invitations to the new user
  Then The page show message when show warning the user exist

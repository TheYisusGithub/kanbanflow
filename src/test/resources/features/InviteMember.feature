Feature: Creation funtional and acceptance

  @Acceptance
  Scenario: The user invite a new user
  Given The user logs in to the kanbanflow page
  When The user adds a new member with this email 8testemail@gmail.com
  Then The user clicking should show the 8testemail@gmail.com with the pending invitations

  @Negative/
  Scenario The user sent and invitations but user exist
  Given The user adds a new member with this email testemailexits@gmail.com.
  Then The page show message, the email testemailexits@gmail.com exist


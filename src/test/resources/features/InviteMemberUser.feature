Feature: Creation funtional and acceptance

  @Acceptance @DeleteInvitation
  Scenario: The user invite a new user
  Given The user logs in to the kanbanflow page
  When The user adds a new member with this email 30testemail@gmail.com
  Then The user clicking should show the 30testemail@gmail.com with the pending invitations


#  @Negative @DeleteInvitation
#  Scenario: The user sent and invitations but user exist
#  Given The user adds a new member with this email 21testemailexits@gmail.com
#  Then The page show message, the email 21testemailexits@gmail.com exist
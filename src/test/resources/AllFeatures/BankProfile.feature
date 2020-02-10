Feature: Change Password and Login
As a User I can Change the password
and Login using new password

Background: User is on G99Bank Home
When User is login to profile "username" with "password"
Then User see profile "role"


Scenario: Enter incorrect old password
Given User click on change password
When User enter incorrect old "password2"
Then User see message "Old password is incorrect"
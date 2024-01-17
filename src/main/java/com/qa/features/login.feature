Feature: Free CRM Login Feature


Scenario: Free CRM Login Test Scenario
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "prinspatel" and "Test@123"
Then user clicks on login button
Then user is on Home Page
Then logout


Scenario: Entering Wrong UserID and Password
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "prinspatel" and "Test@111"
Then user clicks on login button
Then user must be in the LoginPage Veryfy title



Scenario Outline: Entering Multiple Wrong UserID and Password
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<Userid>" and "<Password>"
Then user clicks on login button
Then user must be in the LoginPage Veryfy title


Examples:
| Userid 		 | Password |
| prinspatel | Test@222 |
| prinspatel | Test@333 |
| prinspatel | Test@444 |
| prinspatel | Test@555 |
| prinspatel | Test@666 |
| prinspatel | Test@777 |
| patelprins | Test@123 |
| pridppatel | Test@123 |
| priinpatel | Test@123 |
| 111111111l | Test@123 |
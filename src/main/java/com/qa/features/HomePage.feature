Feature: Free CRM HopePage Test


Scenario: Verify Username in homepage
Given user is already on Login Page
When title of login page is Free CRM
Then user enters "prinspatel" and "Test@123"
Then user clicks on login button
Then title of homepage is "CRMPRO"
Then User of FreeCRM same as login user


Scenario: Verify Calendar Page
Given user alredy on Homepage
When title of homepage is "CRMPRO"
Then User Nevigate to Calendar Page
Then Verify Calendar Page


Scenario: Verify Companies Page
Given user alredy on Homepage
When title of homepage is "CRMPRO"
Then User Nevigate to Companies Page
Then Verify Companies Page


Scenario: Verify Contact page
Given user alredy on Homepage
When title of homepage is "CRMPRO"
Then User Nevigate to Contact Page
Then Verify Contact Page


Scenario: Verify Deals Page
Given user alredy on Homepage
When title of homepage is "CRMPRO"
Then User Nevigate to Deals Page
Then Verify Deal Page


Scenario: Verify Task Page
Given user alredy on Homepage
When title of homepage is "CRMPRO"
Then User Nevigate to Task Page
Then Verify Task Page


Scenario: Verify Cases Page
Given user alredy on Homepage
When title of homepage is "CRMPRO"
Then User Nevigate to Cases Page
Then Verify Cases Page

 
Scenario: Verify Call Page
Given user alredy on Homepage
When title of homepage is "CRMPRO"
Then User Nevigate to Call Page
Then Verify Call Page

 
Scenario: Verify Forms Page
Given user alredy on Homepage
When title of homepage is "CRMPRO"
Then User Nevigate to Forms Page
Then Verify Forms Page


Scenario: Verify Reports Page
Given user alredy on Homepage
When title of homepage is "CRMPRO"
Then User Nevigate to Reports Page
Then Verify Reports Page
Feature: Free CRM Calander Page Test

Scenario: Display Calander for the Same User who login
Given User Nevigate to Homepage
When title of homepage is "CRMPRO"
Then User Nevigate to Calendar Page
Then Verify Calendar Page
Then Check Calander for selected user
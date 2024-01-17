Feature: Free CRM Task PAge Test


Scenario Outline: Add 5 new Task
Given User Nevigate to Homepage
When title of homepage is "CRMPRO"
Then User Mouseover to New Task
Then Add details "<Title>" "<Deal>" "<Cases>" "<Compnay>"

Examples:
| Title 	| Deal   | Cases			   | Compnay   			| 
| Title 1 | Deal 1 | Task Cases 1  | Task Company 1 | 
| Title 2 | Deal 2 |  Task Cases 2 | Task Company 2 |
| Title 3 | Deal 3 |  Task Cases 3 | Task Company 3 |
| Title 4 | Deal 4 |  Task Cases 4 | Task Company 4 |
| Title 5 | Deal 5 |  Task Cases 5 | Task Company 5 |

@CurrentlyWorking
Scenario: Verify new Task
Given User Nevigate to Homepage
When title of homepage is "CRMPRO"
Then User Nevigate to Task Page
Then verify Added Tasl
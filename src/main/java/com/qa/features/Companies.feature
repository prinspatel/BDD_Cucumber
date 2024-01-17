Feature: Free CRM Companies Page Test


Scenario Outline: Enter New Company Details
Given User Nevigate to Homepage
Then title of homepage is "CRMPRO"
Then User Mouseover to New Company
Then User Enter Details "<Company1>" "<Industry1>" "<AnnualR1>" "<Employees1>" "<Identifier1>" "<Website1>" "<Email1>" "<Phone>" "<fax>"


Examples:
| Company1        | Industry1     | AnnualR1  | Employees1  | Identifier1   | Website1            	 			| Email1             	 | Phone           | fax             |
| ABC Corp     		| Technology		| 1000000   | 500         | ID123         | https://www.abccorp.com 		| contact@abccorp.com  | +1-555-123-4567 | +1-555-765-4321 |
| XYZ Ltd      		| Finance   		| 750000    | 200         | ID456         | https://www.xyzltd.com  		| info@xyzltd.com      | +1-555-987-6543 | +1-555-321-0987 |
| Widget Co    		| Manufacturing | 500000 		| 300         | ID789         | https://www.widgetco.com 		| sales@widgetco.com   | +1-555-456-7890 | +1-555-987-6543 |
| Swift Solutions | IT Services 	| 1200000	 	| 800     	 	| ID012         | https://www.swiftsol.com 		| support@swiftsol.com | +1-555-876-5432 | +1-555-234-5678 |
| Green Energy 		| Energy   		  | 200000    | 50          | ID345         | https://www.greenenergy.com | info@greenenergy.com | +1-555-678-9012 | +1-555-432-1098 |


Scenario Outline: Enter New Company Details
Given User Nevigate to Homepage
Then title of homepage is "CRMPRO"
Then User Mouseover to Full Search Form
Then Verify Full Search Form Page
Then Search Company by "<CompanyName>" and "<Industry>"
| Swift Solutions | IT Services 	|
Then Verify Search Result "<Result>"
| Swift Solutions |

Feature: Free CRM Deals Page Test


Scenario Outline: Add 5 new Deals
Given User Nevigate to Homepage
When title of homepage is "CRMPRO"
Then User Mouseover to New Deals
Then Enter Details and Save "<Dtitle>" "<Dcompany>" "<pricontact>" "<Amount>" "<Prob>" "<Ide>"

Examples:
| Dtitle | Dcompany | pricontact |	 Amount | Prob 	| Ide |
| Deal1  | Company1 | 1111111111 | 10000000 | 10 		| 10	|
| Deal2  | Company2 | 2222222222 | 20000000 | 20 		| 20	|
| Deal3  | Company3 | 3333333333 | 30000000 | 30 		| 30	|
| Deal4  | Company4 | 4444444444 | 40000000 | 40 		| 40	|
| Deal5  | Company5 | 5555555555 | 50000000 | 50 		| 50	|


Scenario Outline: Add 5 new Products
Given User Nevigate to Homepage
When title of homepage is "CRMPRO"
Then User Mouseover to Products
Then click on new Product
Then Add new product dtails "<ProductName>" "<Cost>" "<RetailValue>" "<WholesalePrice>" "<UPCCode>" "<InventoryAmount>"

Examples:
| ProductName           | Cost  | RetailValue | WholesalePrice | UPCCode       | InventoryAmount |
| Widget X              | 10.00 | 24.99       | 15.99          | 123456789012  | 1000 |
| Gadget Y              | 15.50 | 34.99       | 22.99          | 987654321098  | 2000 |
| Gizmo Z               | 8.75  | 19.99       | 12.49          | 456789012345  | 3000 |
| Super Thingamajig     | 20.25 | 49.99       | 32.99          | 789012345678  | 4000 |
| Mega Widget Deluxe    | 12.99 | 29.99       | 18.99          | 345678901234  | 5000 |


Scenario: Verify Save Products
Given User Nevigate to Homepage
When title of homepage is "CRMPRO"
Then User Mouseover to Products
Then Verify products
